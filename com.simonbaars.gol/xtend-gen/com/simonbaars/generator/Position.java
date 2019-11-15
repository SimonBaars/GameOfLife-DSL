package com.simonbaars.generator;

import org.eclipse.xtend.lib.annotations.Data;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@Data
@SuppressWarnings("all")
public class Position {
  private final int x;
  
  private final int y;
  
  private final boolean isRule;
  
  public Position(final int x, final int y, final boolean isRule) {
    super();
    this.x = x;
    this.y = y;
    this.isRule = isRule;
  }
  
  @Override
  @Pure
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + this.x;
    result = prime * result + this.y;
    return prime * result + (this.isRule ? 1231 : 1237);
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
    if (other.isRule != this.isRule)
      return false;
    return true;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("x", this.x);
    b.add("y", this.y);
    b.add("isRule", this.isRule);
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
  
  @Pure
  public boolean isRule() {
    return this.isRule;
  }
}
