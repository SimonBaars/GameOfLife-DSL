package com.simonbaars.generator;

import com.simonbaars.generator.Position;
import com.simonbaars.goLDSL.Board;
import com.simonbaars.goLDSL.Cell;
import com.simonbaars.goLDSL.CellDef;
import com.simonbaars.goLDSL.CellPairs;
import com.simonbaars.goLDSL.Cells;
import com.simonbaars.goLDSL.DSL;
import com.simonbaars.goLDSL.Grid;
import com.simonbaars.goLDSL.Objects;
import com.simonbaars.goLDSL.Rule;
import com.simonbaars.goLDSL.ShapeDef;
import com.simonbaars.goLDSL.ShapeRef;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class JavaGenerator {
  public static CharSequence toJava(final DSL dsl) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package GameOfLife;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import java.awt.Point;");
    _builder.newLine();
    _builder.append("import java.util.ArrayList;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class RulesOfLife {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static void computeSurvivors(boolean[][] gameBoard, List<Point> survivingCells, int surrounding) {");
    _builder.newLine();
    _builder.append("\t\t");
    JavaGenerator.getRules(dsl.getRules(), dsl.getShapes());
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static void determineBeginPoints(List<Point> points) {");
    _builder.newLine();
    _builder.append("\t\t");
    String _beginPoints = JavaGenerator.getBeginPoints(dsl.getBoard(), dsl.getShapes());
    _builder.append(_beginPoints, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public static void getRules(final EList<Rule> rules, final EList<ShapeDef> shapes) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  public static String getBeginPoints(final Board board, final EList<ShapeDef> shapes) {
    return JavaGenerator.objectsToJava(board.getObjects(), shapes);
  }
  
  public static String objectsToJava(final Objects objects, final EList<ShapeDef> shapes) {
    Position _position = new Position(0, 0);
    return JavaGenerator.objectsToJava(objects, shapes, _position);
  }
  
  public static String objectsToJava(final Objects objects, final EList<ShapeDef> shapes, final Position offset) {
    String _shapesToJava = JavaGenerator.shapesToJava(objects.getShapes(), shapes);
    String _cellsToJava = JavaGenerator.cellsToJava(objects.getCells());
    String _plus = (_shapesToJava + _cellsToJava);
    String _cellListToJava = JavaGenerator.cellListToJava(objects.getCell());
    String _plus_1 = (_plus + _cellListToJava);
    String _gridsToJava = JavaGenerator.gridsToJava(objects.getGrids());
    return (_plus_1 + _gridsToJava);
  }
  
  public static String gridsToJava(final EList<Grid> grids) {
    final Function<Grid, String> _function = (Grid grid) -> {
      return JavaGenerator.gridToJava(grid);
    };
    return grids.stream().<String>map(_function).collect(Collectors.joining(System.lineSeparator()));
  }
  
  public static String gridToJava(final Grid grid) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from int to Position");
  }
  
  public static String cellListToJava(final EList<CellDef> cells) {
    throw new Error("Unresolved compilation problems:"
      + "\nInvalid number of arguments. The method cellToJava(Cell, Position) is not applicable for the arguments (Cell)");
  }
  
  public static String cellToJava(final Cell cell, final Position offset) {
    int _x = cell.getX();
    int _y = cell.getY();
    Position _position = new Position(_x, _y);
    return JavaGenerator.cellToJava(_position, offset);
  }
  
  public static String cellToJava(final Position pos, final Position offset) {
    int _x = pos.getX();
    int _x_1 = offset.getX();
    int _minus = (_x - _x_1);
    String _plus = ("points.add(new Point(" + Integer.valueOf(_minus));
    String _plus_1 = (_plus + ", ");
    int _y = pos.getY();
    int _x_2 = offset.getX();
    int _minus_1 = (_y - _x_2);
    String _plus_2 = (_plus_1 + Integer.valueOf(_minus_1));
    return (_plus_2 + ");");
  }
  
  public static String cellsToJava(final EList<Cells> cells) {
    final Function<Cells, String> _function = (Cells cell) -> {
      return JavaGenerator.cellsToJava(((CellPairs) cell));
    };
    return cells.stream().<String>map(_function).collect(Collectors.joining(System.lineSeparator()));
  }
  
  public static String cellsToJava(final CellPairs cells) {
    throw new Error("Unresolved compilation problems:"
      + "\nInvalid number of arguments. The method cellToJava(Cell, Position) is not applicable for the arguments (Cell)");
  }
  
  public static String shapesToJava(final EList<ShapeRef> refs, final EList<ShapeDef> shapes) {
    final Function<ShapeRef, String> _function = (ShapeRef ref) -> {
      ShapeDef _shapeByName = JavaGenerator.getShapeByName(shapes, ref.getName());
      int _x = ref.getX();
      int _y = ref.getY();
      Position _position = new Position(_x, _y);
      return JavaGenerator.shapeToJava(shapes, _shapeByName, _position);
    };
    return refs.stream().<String>map(_function).collect(Collectors.joining(System.lineSeparator()));
  }
  
  public static String shapeToJava(final EList<ShapeDef> shapes, final ShapeDef shape, final Position offset) {
    return JavaGenerator.objectsToJava(shape.getObjects(), shapes, offset);
  }
  
  public static ShapeDef getShapeByName(final EList<ShapeDef> shapes, final String name) {
    final Predicate<ShapeDef> _function = (ShapeDef shape) -> {
      return shape.getName().equals(name);
    };
    return shapes.stream().filter(_function).findAny().get();
  }
}
