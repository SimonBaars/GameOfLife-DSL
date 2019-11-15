/**
 * generated by Xtext 2.19.0
 */
package com.simonbaars.goLDSL.util;

import com.simonbaars.goLDSL.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.simonbaars.goLDSL.GoLDSLPackage
 * @generated
 */
public class GoLDSLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static GoLDSLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GoLDSLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = GoLDSLPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GoLDSLSwitch<Adapter> modelSwitch =
    new GoLDSLSwitch<Adapter>()
    {
      @Override
      public Adapter caseDSL(DSL object)
      {
        return createDSLAdapter();
      }
      @Override
      public Adapter caseBoard(Board object)
      {
        return createBoardAdapter();
      }
      @Override
      public Adapter caseObjects(Objects object)
      {
        return createObjectsAdapter();
      }
      @Override
      public Adapter caseShapeDef(ShapeDef object)
      {
        return createShapeDefAdapter();
      }
      @Override
      public Adapter caseCellPairs(CellPairs object)
      {
        return createCellPairsAdapter();
      }
      @Override
      public Adapter caseCellsDef(CellsDef object)
      {
        return createCellsDefAdapter();
      }
      @Override
      public Adapter caseCellDef(CellDef object)
      {
        return createCellDefAdapter();
      }
      @Override
      public Adapter caseShapeRef(ShapeRef object)
      {
        return createShapeRefAdapter();
      }
      @Override
      public Adapter caseCell(Cell object)
      {
        return createCellAdapter();
      }
      @Override
      public Adapter caseRule(Rule object)
      {
        return createRuleAdapter();
      }
      @Override
      public Adapter caseAction(Action object)
      {
        return createActionAdapter();
      }
      @Override
      public Adapter caseCondition(Condition object)
      {
        return createConditionAdapter();
      }
      @Override
      public Adapter caseConditionRule(ConditionRule object)
      {
        return createConditionRuleAdapter();
      }
      @Override
      public Adapter caseConditionRules(ConditionRules object)
      {
        return createConditionRulesAdapter();
      }
      @Override
      public Adapter caseLives(Lives object)
      {
        return createLivesAdapter();
      }
      @Override
      public Adapter caseRange(Range object)
      {
        return createRangeAdapter();
      }
      @Override
      public Adapter caseBoundedRange(BoundedRange object)
      {
        return createBoundedRangeAdapter();
      }
      @Override
      public Adapter caseUnboundedRange(UnboundedRange object)
      {
        return createUnboundedRangeAdapter();
      }
      @Override
      public Adapter caseLeftUnboundedRange(LeftUnboundedRange object)
      {
        return createLeftUnboundedRangeAdapter();
      }
      @Override
      public Adapter caseRightUnboundedRange(RightUnboundedRange object)
      {
        return createRightUnboundedRangeAdapter();
      }
      @Override
      public Adapter caseGrid(Grid object)
      {
        return createGridAdapter();
      }
      @Override
      public Adapter caseGridOffset(GridOffset object)
      {
        return createGridOffsetAdapter();
      }
      @Override
      public Adapter caseSize(Size object)
      {
        return createSizeAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.simonbaars.goLDSL.DSL <em>DSL</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.simonbaars.goLDSL.DSL
   * @generated
   */
  public Adapter createDSLAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.simonbaars.goLDSL.Board <em>Board</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.simonbaars.goLDSL.Board
   * @generated
   */
  public Adapter createBoardAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.simonbaars.goLDSL.Objects <em>Objects</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.simonbaars.goLDSL.Objects
   * @generated
   */
  public Adapter createObjectsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.simonbaars.goLDSL.ShapeDef <em>Shape Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.simonbaars.goLDSL.ShapeDef
   * @generated
   */
  public Adapter createShapeDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.simonbaars.goLDSL.CellPairs <em>Cell Pairs</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.simonbaars.goLDSL.CellPairs
   * @generated
   */
  public Adapter createCellPairsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.simonbaars.goLDSL.CellsDef <em>Cells Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.simonbaars.goLDSL.CellsDef
   * @generated
   */
  public Adapter createCellsDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.simonbaars.goLDSL.CellDef <em>Cell Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.simonbaars.goLDSL.CellDef
   * @generated
   */
  public Adapter createCellDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.simonbaars.goLDSL.ShapeRef <em>Shape Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.simonbaars.goLDSL.ShapeRef
   * @generated
   */
  public Adapter createShapeRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.simonbaars.goLDSL.Cell <em>Cell</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.simonbaars.goLDSL.Cell
   * @generated
   */
  public Adapter createCellAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.simonbaars.goLDSL.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.simonbaars.goLDSL.Rule
   * @generated
   */
  public Adapter createRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.simonbaars.goLDSL.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.simonbaars.goLDSL.Action
   * @generated
   */
  public Adapter createActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.simonbaars.goLDSL.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.simonbaars.goLDSL.Condition
   * @generated
   */
  public Adapter createConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.simonbaars.goLDSL.ConditionRule <em>Condition Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.simonbaars.goLDSL.ConditionRule
   * @generated
   */
  public Adapter createConditionRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.simonbaars.goLDSL.ConditionRules <em>Condition Rules</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.simonbaars.goLDSL.ConditionRules
   * @generated
   */
  public Adapter createConditionRulesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.simonbaars.goLDSL.Lives <em>Lives</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.simonbaars.goLDSL.Lives
   * @generated
   */
  public Adapter createLivesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.simonbaars.goLDSL.Range <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.simonbaars.goLDSL.Range
   * @generated
   */
  public Adapter createRangeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.simonbaars.goLDSL.BoundedRange <em>Bounded Range</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.simonbaars.goLDSL.BoundedRange
   * @generated
   */
  public Adapter createBoundedRangeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.simonbaars.goLDSL.UnboundedRange <em>Unbounded Range</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.simonbaars.goLDSL.UnboundedRange
   * @generated
   */
  public Adapter createUnboundedRangeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.simonbaars.goLDSL.LeftUnboundedRange <em>Left Unbounded Range</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.simonbaars.goLDSL.LeftUnboundedRange
   * @generated
   */
  public Adapter createLeftUnboundedRangeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.simonbaars.goLDSL.RightUnboundedRange <em>Right Unbounded Range</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.simonbaars.goLDSL.RightUnboundedRange
   * @generated
   */
  public Adapter createRightUnboundedRangeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.simonbaars.goLDSL.Grid <em>Grid</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.simonbaars.goLDSL.Grid
   * @generated
   */
  public Adapter createGridAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.simonbaars.goLDSL.GridOffset <em>Grid Offset</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.simonbaars.goLDSL.GridOffset
   * @generated
   */
  public Adapter createGridOffsetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.simonbaars.goLDSL.Size <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.simonbaars.goLDSL.Size
   * @generated
   */
  public Adapter createSizeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //GoLDSLAdapterFactory
