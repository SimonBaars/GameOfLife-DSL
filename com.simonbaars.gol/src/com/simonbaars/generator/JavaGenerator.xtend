package com.simonbaars.generator

import com.simonbaars.goLDSL.Action
import com.simonbaars.goLDSL.Board
import com.simonbaars.goLDSL.BoundedRange
import com.simonbaars.goLDSL.Cell
import com.simonbaars.goLDSL.CellDef
import com.simonbaars.goLDSL.CellPairs
import com.simonbaars.goLDSL.Cells
import com.simonbaars.goLDSL.ConditionRule
import com.simonbaars.goLDSL.ConditionRules
import com.simonbaars.goLDSL.DSL
import com.simonbaars.goLDSL.Grid
import com.simonbaars.goLDSL.GridPart
import com.simonbaars.goLDSL.LeftUnboundedRange
import com.simonbaars.goLDSL.Objects
import com.simonbaars.goLDSL.Range
import com.simonbaars.goLDSL.RightUnboundedRange
import com.simonbaars.goLDSL.Rule
import com.simonbaars.goLDSL.ShapeDef
import com.simonbaars.goLDSL.ShapeRef
import java.util.stream.Collectors
import java.util.stream.IntStream
import org.eclipse.emf.common.util.EList
import org.eclipse.xtend.lib.annotations.Data

@Data class Position {
	int x
	int y
	boolean isRule
}
	
class JavaGenerator {
def static toJava(DSL dsl)'''
package GameOfLife;

import java.awt.Point;
import java.util.List;

public class RulesOfLife {

	public static void computeSurvivors(boolean[][] board, List<Point> points, int surrounding, int i, int j) {
		«getRules(dsl.rules, dsl.shapes)»
	}

	public static void determineBeginPoints(List<Point> points) {
		«getBeginPoints(dsl.board, dsl.shapes)»
		
	}

}
'''
	
	def static getRules(EList<Rule> rules, EList<ShapeDef> shapes) {
		return rules.stream.map(rule | "if(" + conditionToJava(rule.condition as ConditionRules) + ") {" + System.lineSeparator + actionToJava(rule.action, shapes) + System.lineSeparator + "}" ).collect(Collectors.joining(System.lineSeparator+System.lineSeparator))
	}
		
	def static String conditionToJava(ConditionRules condition) {
		var rule = ruleToJava(condition.rule1)
		if(condition.operator !== null){
			rule += condition.operator.value + condition.operator.value + conditionToJava(condition.rule2)
		}
		return rule
	}
	
	def static ruleToJava(ConditionRule rule) {
		if(rule.alive !== null){
			return "board[i][j]";
		} else if (rule.range !== null) {
			return rangeToJava(rule.range)
		}
		return "surrounding == "+rule.number;
	}
		
	def static rangeToJava(Range range) {
		if(range instanceof BoundedRange){
			var r = range as BoundedRange
			return "(surrounding >= "+r.lowerBound+" && surrounding <= "+r.higherBound+")"
		} else if (range instanceof LeftUnboundedRange){
			var r = range as LeftUnboundedRange
			return "surrounding >= "+r.lowerBound
		} else {
			var r = range as RightUnboundedRange
			return "surrounding <= "+r.higherBound
		}
	}
		
	def static actionToJava(Action action, EList<ShapeDef> shapes) {
		objectsToJava(action.objects, shapes, new Position(0, 0, true))
	}
	
	def static getBeginPoints(Board board, EList<ShapeDef> shapes) {
		objectsToJava(board as Objects, shapes)
	}
	
	def static String objectsToJava(Objects objects, EList<ShapeDef> shapes) {
		objectsToJava(objects, shapes, pos(0,0))
	}
	
	def static String objectsToJava(Objects objects, EList<ShapeDef> shapes, Position offset) {
		shapesToJava(objects.shapes, shapes, offset) + cellsToJava(objects.cells, offset) + cellListToJava(objects.cell, offset) + gridsToJava(objects.grids, offset)
	}
	
	def static gridsToJava(EList<Grid> grids, Position offset) {
		grids.stream.map(grid | gridToJava(grid, offset)).collect(Collectors.joining(System.lineSeparator));
	}
	
	def static gridToJava(Grid grid, Position offset) {
		IntStream.range(0, grid.size.width).boxed.flatMap(x | IntStream.range(0, grid.size.height).boxed.map(y | pos(x, y))).filter(pos | grid.parts.get(pos.x + grid.size.width * pos.y) == GridPart.ALIVE).map(pos | cellToJava(merge(pos, offset))).collect(Collectors.joining(System.lineSeparator))
	}
		
	def static merge(Position pos1, Position pos2) {
		new Position(pos1.x + pos2.x, pos1.y + pos2.y, pos1.isRule || pos2.isRule)
	}
	
	def static cellListToJava(EList<CellDef> cells, Position offset) {
		cells.stream.map(cell | cellToJava(cell as Cell, offset)).collect(Collectors.joining(System.lineSeparator));
	}
	
	def static cellToJava(Cell cell, Position offset){
		cellToJava(merge(offset, pos(cell.x, cell.y)))
	}
	
	def static pos(int x, int y){
		new Position(x, y, false)
	}
	
	def static cellToJava(Position pos) {
		"points.add(new Point("+(pos.isRule ? "i + " : "")+pos.x+", "+(pos.isRule ? "j + " : "")+pos.y+"));"
	}
	
	def static cellsToJava(EList<Cells> cells, Position offset) {
		cells.stream.map(cell | cellsToJava(cell as CellPairs, offset)).collect(Collectors.joining(System.lineSeparator));
	}
	
	def static cellsToJava(CellPairs cells, Position offset) {
		cells.cells.stream.map(cell | cellToJava(cell, offset)).collect(Collectors.joining(System.lineSeparator));
	}
	
	def static shapesToJava(EList<ShapeRef> refs, EList<ShapeDef> shapes, Position offset) {
		refs.stream.map(ref | shapeToJava(shapes, getShapeByName(shapes, ref.name), merge(offset, pos(ref.x, ref.y)))).collect(Collectors.joining(System.lineSeparator));
	}
	
	def static shapeToJava(EList<ShapeDef> shapes, ShapeDef shape, Position offset) {
		objectsToJava(shape.objects, shapes, merge(offset, shape.offset === null ? pos(0,0) : pos(-shape.offset.x, -shape.offset.y)))
	}
	
	def static getShapeByName(EList<ShapeDef> shapes, String name) {
		shapes.stream.filter(shape | shape.name.equals(name)).findAny.get
	}
	
}