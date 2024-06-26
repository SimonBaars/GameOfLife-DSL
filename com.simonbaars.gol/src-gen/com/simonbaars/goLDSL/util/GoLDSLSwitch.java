/**
 * generated by Xtext 2.19.0
 */
package com.simonbaars.goLDSL.util;

import com.simonbaars.goLDSL.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.simonbaars.goLDSL.GoLDSLPackage
 * @generated
 */
public class GoLDSLSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static GoLDSLPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GoLDSLSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = GoLDSLPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case GoLDSLPackage.DSL:
      {
        DSL dsl = (DSL)theEObject;
        T result = caseDSL(dsl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoLDSLPackage.BOARD:
      {
        Board board = (Board)theEObject;
        T result = caseBoard(board);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoLDSLPackage.OBJECTS:
      {
        Objects objects = (Objects)theEObject;
        T result = caseObjects(objects);
        if (result == null) result = caseBoard(objects);
        if (result == null) result = caseAction(objects);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoLDSLPackage.SHAPE_DEF:
      {
        ShapeDef shapeDef = (ShapeDef)theEObject;
        T result = caseShapeDef(shapeDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoLDSLPackage.CELL_PAIRS:
      {
        CellPairs cellPairs = (CellPairs)theEObject;
        T result = caseCellPairs(cellPairs);
        if (result == null) result = caseCells(cellPairs);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoLDSLPackage.CELLS:
      {
        Cells cells = (Cells)theEObject;
        T result = caseCells(cells);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoLDSLPackage.CELL_DEF:
      {
        CellDef cellDef = (CellDef)theEObject;
        T result = caseCellDef(cellDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoLDSLPackage.SHAPE_REF:
      {
        ShapeRef shapeRef = (ShapeRef)theEObject;
        T result = caseShapeRef(shapeRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoLDSLPackage.CELL:
      {
        Cell cell = (Cell)theEObject;
        T result = caseCell(cell);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoLDSLPackage.RULE:
      {
        Rule rule = (Rule)theEObject;
        T result = caseRule(rule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoLDSLPackage.ACTION:
      {
        Action action = (Action)theEObject;
        T result = caseAction(action);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoLDSLPackage.CONDITION:
      {
        Condition condition = (Condition)theEObject;
        T result = caseCondition(condition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoLDSLPackage.CONDITION_RULE:
      {
        ConditionRule conditionRule = (ConditionRule)theEObject;
        T result = caseConditionRule(conditionRule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoLDSLPackage.CONDITION_RULES:
      {
        ConditionRules conditionRules = (ConditionRules)theEObject;
        T result = caseConditionRules(conditionRules);
        if (result == null) result = caseCondition(conditionRules);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoLDSLPackage.RANGE:
      {
        Range range = (Range)theEObject;
        T result = caseRange(range);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoLDSLPackage.BOUNDED_RANGE:
      {
        BoundedRange boundedRange = (BoundedRange)theEObject;
        T result = caseBoundedRange(boundedRange);
        if (result == null) result = caseRange(boundedRange);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoLDSLPackage.LEFT_UNBOUNDED_RANGE:
      {
        LeftUnboundedRange leftUnboundedRange = (LeftUnboundedRange)theEObject;
        T result = caseLeftUnboundedRange(leftUnboundedRange);
        if (result == null) result = caseRange(leftUnboundedRange);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoLDSLPackage.RIGHT_UNBOUNDED_RANGE:
      {
        RightUnboundedRange rightUnboundedRange = (RightUnboundedRange)theEObject;
        T result = caseRightUnboundedRange(rightUnboundedRange);
        if (result == null) result = caseRange(rightUnboundedRange);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoLDSLPackage.GRID:
      {
        Grid grid = (Grid)theEObject;
        T result = caseGrid(grid);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoLDSLPackage.OFFSET:
      {
        Offset offset = (Offset)theEObject;
        T result = caseOffset(offset);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GoLDSLPackage.SIZE:
      {
        Size size = (Size)theEObject;
        T result = caseSize(size);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DSL</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DSL</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSL(DSL object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Board</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Board</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoard(Board object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Objects</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Objects</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjects(Objects object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Shape Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Shape Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseShapeDef(ShapeDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cell Pairs</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cell Pairs</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCellPairs(CellPairs object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cells</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cells</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCells(Cells object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cell Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cell Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCellDef(CellDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Shape Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Shape Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseShapeRef(ShapeRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cell</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cell</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCell(Cell object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRule(Rule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAction(Action object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCondition(Condition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Condition Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Condition Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConditionRule(ConditionRule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Condition Rules</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Condition Rules</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConditionRules(ConditionRules object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Range</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Range</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRange(Range object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bounded Range</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bounded Range</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoundedRange(BoundedRange object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Left Unbounded Range</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Left Unbounded Range</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLeftUnboundedRange(LeftUnboundedRange object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Right Unbounded Range</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Right Unbounded Range</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRightUnboundedRange(RightUnboundedRange object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Grid</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Grid</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGrid(Grid object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Offset</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Offset</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOffset(Offset object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Size</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Size</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSize(Size object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //GoLDSLSwitch
