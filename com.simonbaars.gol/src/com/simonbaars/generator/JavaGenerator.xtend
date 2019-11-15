package com.simonbaars.generator

import com.simonbaars.goLDSL.Board
import com.simonbaars.goLDSL.Cell
import com.simonbaars.goLDSL.CellDef
import com.simonbaars.goLDSL.CellPairs
import com.simonbaars.goLDSL.Cells
import com.simonbaars.goLDSL.DSL
import com.simonbaars.goLDSL.Grid
import com.simonbaars.goLDSL.GridPart
import com.simonbaars.goLDSL.Objects
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
}
	
class JavaGenerator {
def static toJava(DSL dsl)'''
package GameOfLife;

import java.awt.Point;
import java.util.ArrayList;

public class RulesOfLife {

	public static void computeSurvivors(boolean[][] gameBoard, List<Point> survivingCells, int surrounding) {
		«getRules(dsl.getRules, dsl.getShapes)»
	}

	public static void determineBeginPoints(List<Point> points) {
		«getBeginPoints(dsl.getBoard, dsl.getShapes)»
		
	}

}
'''
	
	def static getRules(EList<Rule> rules, EList<ShapeDef> shapes) {
		return ""
	}
	
	def static getBeginPoints(Board board, EList<ShapeDef> shapes) {
		return objectsToJava(board.getObjects, shapes)
	}
	
	def static String objectsToJava(Objects objects, EList<ShapeDef> shapes) {
		return objectsToJava(objects, shapes, pos(0,0))
	}
	
	def static String objectsToJava(Objects objects, EList<ShapeDef> shapes, Position offset) {
		return shapesToJava(objects.getShapes, shapes, offset) + cellsToJava(objects.getCells, offset) + cellListToJava(objects.getCell, offset) + gridsToJava(objects.getGrids, offset)
	}
	
	def static gridsToJava(EList<Grid> grids, Position offset) {
		return grids.stream.map(grid | gridToJava(grid, offset)).collect(Collectors.joining(System.lineSeparator));
	}
	
	def static gridToJava(Grid grid, Position offset) {
		return IntStream.range(0, grid.getSize.getWidth).boxed.flatMap(x | IntStream.range(0, grid.getSize.getHeight).boxed.map(y | pos(x, y))).filter(pos | grid.getParts.get(pos.getX + grid.getSize.getWidth * pos.getY) == GridPart.ALIVE).map(pos | cellToJava(merge(pos, offset))).collect(Collectors.joining(System.lineSeparator))
	}
		
	def static merge(Position pos1, Position pos2) {
		return pos(pos1.getX + pos2.getX, pos1.getY + pos2.getY)
	}
	
	def static cellListToJava(EList<CellDef> cells, Position offset) {
		return cells.stream.map(cell | cellToJava(cell as Cell, offset)).collect(Collectors.joining(System.lineSeparator));
	}
	
	def static cellToJava(Cell cell, Position offset){
		return cellToJava(merge(offset, pos(cell.x, cell.y)))
	}
	
	def static pos(int x, int y){
		return new Position(x, y)
	}
	
	def static cellToJava(Position pos) {
		return "points.add(new Point("+pos.getX+", "+pos.getY+");"
	}
	
	def static cellsToJava(EList<Cells> cells, Position offset) {
		return cells.stream.map(cell | cellsToJava(cell as CellPairs, offset)).collect(Collectors.joining(System.lineSeparator));
	}
	
	def static cellsToJava(CellPairs cells, Position offset) {
		return cells.getCells.stream.map(cell | cellToJava(cell, offset)).collect(Collectors.joining(System.lineSeparator));
	}
	
	def static shapesToJava(EList<ShapeRef> refs, EList<ShapeDef> shapes, Position offset) {
		return refs.stream.map(ref | shapeToJava(shapes, getShapeByName(shapes, ref.getName), merge(offset, pos(ref.getX, ref.getY)))).collect(Collectors.joining(System.lineSeparator));
	}
	
	def static shapeToJava(EList<ShapeDef> shapes, ShapeDef shape, Position offset) {
		return objectsToJava(shape.getObjects, shapes, merge(offset, shape.getOffset === null ? pos(0,0) : pos(-shape.getOffset.getX, -shape.getOffset.getY)))
	}
	
	def static getShapeByName(EList<ShapeDef> shapes, String name) {
		return shapes.stream.filter(shape | shape.getName.equals(name)).findAny.get
	}
	
}