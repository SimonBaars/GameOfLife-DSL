package com.simonbaars.generator;

import org.eclipse.xtend.lib.annotations.Data;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@Data
@SuppressWarnings("all")
public class Position {
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
    Position other = (Position) obj;
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
