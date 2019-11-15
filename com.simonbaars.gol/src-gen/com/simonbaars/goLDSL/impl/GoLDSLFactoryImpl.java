/**
 * generated by Xtext 2.19.0
 */
package com.simonbaars.goLDSL.impl;

import com.simonbaars.goLDSL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GoLDSLFactoryImpl extends EFactoryImpl implements GoLDSLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static GoLDSLFactory init()
  {
    try
    {
      GoLDSLFactory theGoLDSLFactory = (GoLDSLFactory)EPackage.Registry.INSTANCE.getEFactory(GoLDSLPackage.eNS_URI);
      if (theGoLDSLFactory != null)
      {
        return theGoLDSLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new GoLDSLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GoLDSLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case GoLDSLPackage.DSL: return createDSL();
      case GoLDSLPackage.BOARD: return createBoard();
      case GoLDSLPackage.OBJECTS: return createObjects();
      case GoLDSLPackage.SHAPE_DEF: return createShapeDef();
      case GoLDSLPackage.CELL_PAIRS: return createCellPairs();
      case GoLDSLPackage.CELLS: return createCells();
      case GoLDSLPackage.CELL_DEF: return createCellDef();
      case GoLDSLPackage.SHAPE_REF: return createShapeRef();
      case GoLDSLPackage.CELL: return createCell();
      case GoLDSLPackage.RULE: return createRule();
      case GoLDSLPackage.ACTION: return createAction();
      case GoLDSLPackage.CONDITION: return createCondition();
      case GoLDSLPackage.CONDITION_RULE: return createConditionRule();
      case GoLDSLPackage.CONDITION_RULES: return createConditionRules();
      case GoLDSLPackage.LIVES: return createLives();
      case GoLDSLPackage.RANGE: return createRange();
      case GoLDSLPackage.BOUNDED_RANGE: return createBoundedRange();
      case GoLDSLPackage.UNBOUNDED_RANGE: return createUnboundedRange();
      case GoLDSLPackage.LEFT_UNBOUNDED_RANGE: return createLeftUnboundedRange();
      case GoLDSLPackage.RIGHT_UNBOUNDED_RANGE: return createRightUnboundedRange();
      case GoLDSLPackage.GRID: return createGrid();
      case GoLDSLPackage.OFFSET: return createOffset();
      case GoLDSLPackage.SIZE: return createSize();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case GoLDSLPackage.BOOL_OPERATOR:
        return createBoolOperatorFromString(eDataType, initialValue);
      case GoLDSLPackage.GRID_PART:
        return createGridPartFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case GoLDSLPackage.BOOL_OPERATOR:
        return convertBoolOperatorToString(eDataType, instanceValue);
      case GoLDSLPackage.GRID_PART:
        return convertGridPartToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DSL createDSL()
  {
    DSLImpl dsl = new DSLImpl();
    return dsl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Board createBoard()
  {
    BoardImpl board = new BoardImpl();
    return board;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Objects createObjects()
  {
    ObjectsImpl objects = new ObjectsImpl();
    return objects;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ShapeDef createShapeDef()
  {
    ShapeDefImpl shapeDef = new ShapeDefImpl();
    return shapeDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CellPairs createCellPairs()
  {
    CellPairsImpl cellPairs = new CellPairsImpl();
    return cellPairs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Cells createCells()
  {
    CellsImpl cells = new CellsImpl();
    return cells;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CellDef createCellDef()
  {
    CellDefImpl cellDef = new CellDefImpl();
    return cellDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ShapeRef createShapeRef()
  {
    ShapeRefImpl shapeRef = new ShapeRefImpl();
    return shapeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Cell createCell()
  {
    CellImpl cell = new CellImpl();
    return cell;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Rule createRule()
  {
    RuleImpl rule = new RuleImpl();
    return rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Action createAction()
  {
    ActionImpl action = new ActionImpl();
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Condition createCondition()
  {
    ConditionImpl condition = new ConditionImpl();
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ConditionRule createConditionRule()
  {
    ConditionRuleImpl conditionRule = new ConditionRuleImpl();
    return conditionRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ConditionRules createConditionRules()
  {
    ConditionRulesImpl conditionRules = new ConditionRulesImpl();
    return conditionRules;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Lives createLives()
  {
    LivesImpl lives = new LivesImpl();
    return lives;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Range createRange()
  {
    RangeImpl range = new RangeImpl();
    return range;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BoundedRange createBoundedRange()
  {
    BoundedRangeImpl boundedRange = new BoundedRangeImpl();
    return boundedRange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UnboundedRange createUnboundedRange()
  {
    UnboundedRangeImpl unboundedRange = new UnboundedRangeImpl();
    return unboundedRange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LeftUnboundedRange createLeftUnboundedRange()
  {
    LeftUnboundedRangeImpl leftUnboundedRange = new LeftUnboundedRangeImpl();
    return leftUnboundedRange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RightUnboundedRange createRightUnboundedRange()
  {
    RightUnboundedRangeImpl rightUnboundedRange = new RightUnboundedRangeImpl();
    return rightUnboundedRange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Grid createGrid()
  {
    GridImpl grid = new GridImpl();
    return grid;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Offset createOffset()
  {
    OffsetImpl offset = new OffsetImpl();
    return offset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Size createSize()
  {
    SizeImpl size = new SizeImpl();
    return size;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoolOperator createBoolOperatorFromString(EDataType eDataType, String initialValue)
  {
    BoolOperator result = BoolOperator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBoolOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GridPart createGridPartFromString(EDataType eDataType, String initialValue)
  {
    GridPart result = GridPart.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertGridPartToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GoLDSLPackage getGoLDSLPackage()
  {
    return (GoLDSLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static GoLDSLPackage getPackage()
  {
    return GoLDSLPackage.eINSTANCE;
  }

} //GoLDSLFactoryImpl
