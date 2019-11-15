package com.simonbaars.generator;

import com.simonbaars.goLDSL.Board;
import com.simonbaars.goLDSL.Cell;
import com.simonbaars.goLDSL.CellDef;
import com.simonbaars.goLDSL.CellPairs;
import com.simonbaars.goLDSL.Cells;
import com.simonbaars.goLDSL.DSL;
import com.simonbaars.goLDSL.Grid;
import com.simonbaars.goLDSL.GridPart;
import com.simonbaars.goLDSL.Objects;
import com.simonbaars.goLDSL.Rule;
import com.simonbaars.goLDSL.ShapeDef;
import com.simonbaars.goLDSL.ShapeRef;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend.lib.annotations.Data;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@SuppressWarnings("all")
public class JavaGenerator {
  @Data
  public static class Position {
    private final int x;
    
    private final int y;
    
    public Position(final int x, final int y) {
      super();
      this.x = x;
      this.y = y;
    }
    
    @Override
    @Pure
    public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + this.x;
      return prime * result + this.y;
    }
    
    @Override
    @Pure
    public boolean equals(final Object obj) {
      if (this == obj)
        return true;
      if (obj == null)
        return false;
      if (getClass() != obj.getClass())
        return false;
      JavaGenerator.Position other = (JavaGenerator.Position) obj;
      if (other.x != this.x)
        return false;
      if (other.y != this.y)
        return false;
      return true;
    }
    
    @Override
    @Pure
    public String toString() {
      ToStringBuilder b = new ToStringBuilder(this);
      b.add("x", this.x);
      b.add("y", this.y);
      return b.toString();
    }
    
    @Pure
    public int getX() {
      return this.x;
    }
    
    @Pure
    public int getY() {
      return this.y;
    }
  }
  
  public static CharSequence toJava(final DSL dsl) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method getBeginPoints(Board, EList<ShapeDef>) from the type JavaGenerator refers to the missing type Object");
  }
  
  public static void getRules(final EList<Rule> rules, final EList<ShapeDef> shapes) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  public static Object getBeginPoints(final Board board, final EList<ShapeDef> shapes) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method objectsToJava(Objects, EList<ShapeDef>) from the type JavaGenerator refers to the missing type Object");
  }
  
  public static Object objectsToJava(final Objects objects, final EList<ShapeDef> shapes) {
    throw new Error("Unresolved compilation problems:"
      + "\n+ cannot be resolved."
      + "\nType mismatch: type void is not applicable at this location"
      + "\n+ cannot be resolved"
      + "\n+ cannot be resolved");
  }
  
  public static String gridsToJava(final EList<Grid> grids) {
    final Function<Grid, String> _function = (Grid grid) -> {
      return JavaGenerator.gridToJava(grid);
    };
    return grids.stream().<String>map(_function).collect(Collectors.joining(System.lineSeparator()));
  }
  
  public static String gridToJava(final Grid grid) {
    final Function<Integer, Stream<JavaGenerator.Position>> _function = (Integer x) -> {
      final Function<Integer, JavaGenerator.Position> _function_1 = (Integer y) -> {
        return new JavaGenerator.Position((x).intValue(), (y).intValue());
      };
      return IntStream.range(0, grid.getSize().getHeight()).boxed().<JavaGenerator.Position>map(_function_1);
    };
    final Predicate<JavaGenerator.Position> _function_1 = (JavaGenerator.Position pos) -> {
      EList<GridPart> _parts = grid.getParts();
      int _x = pos.getX();
      int _width = grid.getSize().getWidth();
      int _y = pos.getY();
      int _multiply = (_width * _y);
      int _plus = (_x + _multiply);
      GridPart _get = _parts.get(_plus);
      return com.google.common.base.Objects.equal(_get, GridPart.ALIVE);
    };
    final Function<JavaGenerator.Position, String> _function_2 = (JavaGenerator.Position pos) -> {
      return JavaGenerator.cellToJava(pos, 0);
    };
    return IntStream.range(0, grid.getSize().getWidth()).boxed().<JavaGenerator.Position>flatMap(_function).filter(_function_1).<String>map(_function_2).collect(Collectors.joining(System.lineSeparator()));
  }
  
  public static String cellListToJava(final EList<CellDef> cells) {
    final Function<CellDef, String> _function = (CellDef cell) -> {
      return JavaGenerator.cellToJava(((Cell) cell));
    };
    return cells.stream().<String>map(_function).collect(Collectors.joining(System.lineSeparator()));
  }
  
  public static String cellToJava(final Cell cell) {
    return JavaGenerator.cellToJava(cell, 0);
  }
  
  public static String cellToJava(final Cell cell, final int offset) {
    int _x = cell.getX();
    int _y = cell.getY();
    JavaGenerator.Position _position = new JavaGenerator.Position(_x, _y);
    return JavaGenerator.cellToJava(_position, offset);
  }
  
  public static String cellToJava(final JavaGenerator.Position pos, final int offset) {
    int _x = pos.getX();
    int _minus = (_x - offset);
    String _plus = ("points.add(new Point(" + Integer.valueOf(_minus));
    String _plus_1 = (_plus + ", ");
    int _y = pos.getY();
    int _minus_1 = (_y - offset);
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
    final Function<Cell, String> _function = (Cell cell) -> {
      return JavaGenerator.cellToJava(cell);
    };
    return cells.getCells().stream().<String>map(_function).collect(Collectors.joining(System.lineSeparator()));
  }
  
  public static void shapesToJava(final EList<ShapeRef> list, final EList<ShapeDef> list2) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
}
