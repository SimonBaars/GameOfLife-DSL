package com.simonbaars.generator;

import com.google.common.base.Objects;
import com.simonbaars.goLDSL.BoundedRange;
import com.simonbaars.goLDSL.ConditionRule;
import com.simonbaars.goLDSL.ConditionRules;
import com.simonbaars.goLDSL.DSL;
import com.simonbaars.goLDSL.Range;
import com.simonbaars.goLDSL.Rule;
import com.simonbaars.goLDSL.ShapeDef;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class JavaGenerator {
  public static CharSequence toJava(final DSL dsl) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method getBeginPoints(Board, EList<ShapeDef>) is undefined");
  }
  
  public static String getRules(final EList<Rule> rules, final EList<ShapeDef> shapes) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method actionToJava(Action, EList<ShapeDef>) is undefined"
      + "\nType mismatch: cannot convert from void to String");
  }
  
  public static void conditionToJava(final ConditionRules condition) {
    String rule = JavaGenerator.ruleToJava(condition.getRule1());
  }
  
  public static String ruleToJava(final ConditionRule rule) {
    String _alive = rule.getAlive();
    boolean _notEquals = (!Objects.equal(_alive, null));
    if (_notEquals) {
      return "board[i][j]";
    } else {
      Range _range = rule.getRange();
      boolean _notEquals_1 = (!Objects.equal(_range, null));
      if (_notEquals_1) {
        return JavaGenerator.rangeToJava(rule.getRange());
      }
    }
    int _number = rule.getNumber();
    return ("surrounding == " + Integer.valueOf(_number));
  }
  
  public static String rangeToJava(final Range range) {
    BoundedRange _bounded = range.getBounded();
    boolean _notEquals = (!Objects.equal(_bounded, null));
    if (_notEquals) {
      int _lowerBound = range.getBounded().getLowerBound();
      String _plus = ("(surrounding >= " + Integer.valueOf(_lowerBound));
      String _plus_1 = (_plus + " && surrounding <= ");
      int _lowerBound_1 = range.getBounded().getLowerBound();
      String _plus_2 = (_plus_1 + Integer.valueOf(_lowerBound_1));
      return (_plus_2 + ")");
    }
    BoundedRange boundedRange = ((BoundedRange) range);
    return null;
  }
}
