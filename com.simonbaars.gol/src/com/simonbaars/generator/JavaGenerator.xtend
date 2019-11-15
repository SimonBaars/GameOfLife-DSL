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
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	def static getBeginPoints(Board board, EList<ShapeDef> shapes) {
		return objectsToJava(board.getObjects, shapes)
	}
	
	def static objectsToJava(Objects objects, EList<ShapeDef> shapes) {
		return shapesToJava(objects.getShapes, shapes) + cellsToJava(objects.getCells) + cellListToJava(objects.getCell) + gridsToJava(objects.getGrids)
	}
	
	def static gridsToJava(EList<Grid> grids) {
		return grids.stream.map(grid | gridToJava(grid)).collect(Collectors.joining(System.lineSeparator()));
	}
	
	@Data static class Position {
	int x
	int y
	}
	
	def static gridToJava(Grid grid) {
		return IntStream.range(0, grid.getSize.getWidth).boxed.flatMap(x | IntStream.range(0, grid.getSize.getHeight).boxed.map(y | new Position(x, y)))
			.filter(pos | grid.getParts.get(pos.getX + grid.getSize.getWidth * pos.getY) == GridPart.ALIVE).map(pos | cellToJava(pos, 0)).collect(Collectors.joining(System.lineSeparator()))
		//for(var x = 0; x<grid.getSize.getWidth; x++){
		//	for(var y = 0; y<grid.getSize.getWidth; y++){
	//			var index = x + grid.getSize.getWidth * y
	//			if(grid.getParts.get(index) == GridPart.ALIVE){
	//				
	//			}
	//		}
	//	}
	}
	
	def static cellListToJava(EList<CellDef> cells) {
		return cells.stream.map(cell | cellToJava(cell as Cell)).collect(Collectors.joining(System.lineSeparator()));
	}
	
	def static cellToJava(Cell cell) {
		return cellToJava(cell, 0)
	}
	
	def static cellToJava(Cell cell, int offset) {
		return cellToJava(new Position(cell.getX, cell.getY), offset)
	}
	
	def static cellToJava(Position pos, int offset) {
		return "points.add(new Point("+(pos.getX-offset)+", "+(pos.getY-offset)+");"
	}
	
	def static cellsToJava(EList<Cells> cells) {
		return cells.stream.map(cell | cellsToJava(cell as CellPairs)).collect(Collectors.joining(System.lineSeparator()));
	}
	
	def static cellsToJava(CellPairs cells) {
		return cells.getCells.stream.map(cell | cellToJava(cell)).collect(Collectors.joining(System.lineSeparator()));
	}
	
	def static shapesToJava(EList<ShapeRef> list, EList<ShapeDef> list2) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
}