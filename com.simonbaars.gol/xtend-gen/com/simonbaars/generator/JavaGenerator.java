package com.simonbaars.generator;

import com.simonbaars.generator.Position;
import com.simonbaars.goLDSL.Board;
import com.simonbaars.goLDSL.Cell;
import com.simonbaars.goLDSL.CellDef;
import com.simonbaars.goLDSL.CellPairs;
import com.simonbaars.goLDSL.Cells;
import com.simonbaars.goLDSL.DSL;
import com.simonbaars.goLDSL.Grid;
import com.simonbaars.goLDSL.GridPart;
import com.simonbaars.goLDSL.Objects;
import com.simonbaars.goLDSL.Offset;
import com.simonbaars.goLDSL.Rule;
import com.simonbaars.goLDSL.ShapeDef;
import com.simonbaars.goLDSL.ShapeRef;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
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
    String _rules = JavaGenerator.getRules(dsl.getRules(), dsl.getShapes());
    _builder.append(_rules, "\t\t");
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
  
  public static String getRules(final EList<Rule> rules, final EList<ShapeDef> shapes) {
    return "";
  }
  
  public static String getBeginPoints(final Board board, final EList<ShapeDef> shapes) {
    return JavaGenerator.objectsToJava(board.getObjects(), shapes);
  }
  
  public static String objectsToJava(final Objects objects, final EList<ShapeDef> shapes) {
    return JavaGenerator.objectsToJava(objects, shapes, JavaGenerator.pos(0, 0));
  }
  
  public static String objectsToJava(final Objects objects, final EList<ShapeDef> shapes, final Position offset) {
    String _shapesToJava = JavaGenerator.shapesToJava(objects.getShapes(), shapes, offset);
    String _cellsToJava = JavaGenerator.cellsToJava(objects.getCells(), offset);
    String _plus = (_shapesToJava + _cellsToJava);
    String _cellListToJava = JavaGenerator.cellListToJava(objects.getCell(), offset);
    String _plus_1 = (_plus + _cellListToJava);
    String _gridsToJava = JavaGenerator.gridsToJava(objects.getGrids(), offset);
    return (_plus_1 + _gridsToJava);
  }
  
  public static String gridsToJava(final EList<Grid> grids, final Position offset) {
    final Function<Grid, String> _function = (Grid grid) -> {
      return JavaGenerator.gridToJava(grid, offset);
    };
    return grids.stream().<String>map(_function).collect(Collectors.joining(System.lineSeparator()));
  }
  
  public static String gridToJava(final Grid grid, final Position offset) {
    final Function<Integer, Stream<Position>> _function = (Integer x) -> {
      final Function<Integer, Position> _function_1 = (Integer y) -> {
        return JavaGenerator.pos((x).intValue(), (y).intValue());
      };
      return IntStream.range(0, grid.getSize().getHeight()).boxed().<Position>map(_function_1);
    };
    final Predicate<Position> _function_1 = (Position pos) -> {
      EList<GridPart> _parts = grid.getParts();
      int _x = pos.getX();
      int _width = grid.getSize().getWidth();
      int _y = pos.getY();
      int _multiply = (_width * _y);
      int _plus = (_x + _multiply);
      GridPart _get = _parts.get(_plus);
      return com.google.common.base.Objects.equal(_get, GridPart.ALIVE);
    };
    final Function<Position, String> _function_2 = (Position pos) -> {
      return JavaGenerator.cellToJava(JavaGenerator.merge(pos, offset));
    };
    return IntStream.range(0, grid.getSize().getWidth()).boxed().<Position>flatMap(_function).filter(_function_1).<String>map(_function_2).collect(Collectors.joining(System.lineSeparator()));
  }
  
  public static Position merge(final Position pos1, final Position pos2) {
    int _x = pos1.getX();
    int _x_1 = pos2.getX();
    int _plus = (_x + _x_1);
    int _y = pos1.getY();
    int _y_1 = pos2.getY();
    int _plus_1 = (_y + _y_1);
    return JavaGenerator.pos(_plus, _plus_1);
  }
  
  public static String cellListToJava(final EList<CellDef> cells, final Position offset) {
    final Function<CellDef, String> _function = (CellDef cell) -> {
      return JavaGenerator.cellToJava(((Cell) cell), offset);
    };
    return cells.stream().<String>map(_function).collect(Collectors.joining(System.lineSeparator()));
  }
  
  public static String cellToJava(final Cell cell, final Position offset) {
    return JavaGenerator.cellToJava(JavaGenerator.merge(offset, JavaGenerator.pos(cell.getX(), cell.getY())));
  }
  
  public static Position pos(final int x, final int y) {
    return new Position(x, y);
  }
  
  public static String cellToJava(final Position pos) {
    int _x = pos.getX();
    String _plus = ("points.add(new Point(" + Integer.valueOf(_x));
    String _plus_1 = (_plus + ", ");
    int _y = pos.getY();
    String _plus_2 = (_plus_1 + Integer.valueOf(_y));
    return (_plus_2 + ");");
  }
  
  public static String cellsToJava(final EList<Cells> cells, final Position offset) {
    final Function<Cells, String> _function = (Cells cell) -> {
      return JavaGenerator.cellsToJava(((CellPairs) cell), offset);
    };
    return cells.stream().<String>map(_function).collect(Collectors.joining(System.lineSeparator()));
  }
  
  public static String cellsToJava(final CellPairs cells, final Position offset) {
    final Function<Cell, String> _function = (Cell cell) -> {
      return JavaGenerator.cellToJava(cell, offset);
    };
    return cells.getCells().stream().<String>map(_function).collect(Collectors.joining(System.lineSeparator()));
  }
  
  public static String shapesToJava(final EList<ShapeRef> refs, final EList<ShapeDef> shapes, final Position offset) {
    final Function<ShapeRef, String> _function = (ShapeRef ref) -> {
      return JavaGenerator.shapeToJava(shapes, JavaGenerator.getShapeByName(shapes, ref.getName()), JavaGenerator.merge(offset, JavaGenerator.pos(ref.getX(), ref.getY())));
    };
    return refs.stream().<String>map(_function).collect(Collectors.joining(System.lineSeparator()));
  }
  
  public static String shapeToJava(final EList<ShapeDef> shapes, final ShapeDef shape, final Position offset) {
    Position _xifexpression = null;
    Offset _offset = shape.getOffset();
    boolean _tripleEquals = (_offset == null);
    if (_tripleEquals) {
      _xifexpression = JavaGenerator.pos(0, 0);
    } else {
      int _x = shape.getOffset().getX();
      int _minus = (-_x);
      int _y = shape.getOffset().getY();
      int _minus_1 = (-_y);
      _xifexpression = JavaGenerator.pos(_minus, _minus_1);
    }
    return JavaGenerator.objectsToJava(shape.getObjects(), shapes, JavaGenerator.merge(offset, _xifexpression));
  }
  
  public static ShapeDef getShapeByName(final EList<ShapeDef> shapes, final String name) {
    final Predicate<ShapeDef> _function = (ShapeDef shape) -> {
      return shape.getName().equals(name);
    };
    return shapes.stream().filter(_function).findAny().get();
  }
}
