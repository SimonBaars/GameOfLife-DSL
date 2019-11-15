/**
 * generated by Xtext 2.19.0
 */
package com.simonbaars.goLDSL.impl;

import com.simonbaars.goLDSL.CellDef;
import com.simonbaars.goLDSL.Cells;
import com.simonbaars.goLDSL.GoLDSLPackage;
import com.simonbaars.goLDSL.Grid;
import com.simonbaars.goLDSL.Objects;
import com.simonbaars.goLDSL.ShapeRef;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Objects</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.simonbaars.goLDSL.impl.ObjectsImpl#getShapes <em>Shapes</em>}</li>
 *   <li>{@link com.simonbaars.goLDSL.impl.ObjectsImpl#getCell <em>Cell</em>}</li>
 *   <li>{@link com.simonbaars.goLDSL.impl.ObjectsImpl#getCells <em>Cells</em>}</li>
 *   <li>{@link com.simonbaars.goLDSL.impl.ObjectsImpl#getGrids <em>Grids</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectsImpl extends MinimalEObjectImpl.Container implements Objects
{
  /**
   * The cached value of the '{@link #getShapes() <em>Shapes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShapes()
   * @generated
   * @ordered
   */
  protected EList<ShapeRef> shapes;

  /**
   * The cached value of the '{@link #getCell() <em>Cell</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCell()
   * @generated
   * @ordered
   */
  protected EList<CellDef> cell;

  /**
   * The cached value of the '{@link #getCells() <em>Cells</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCells()
   * @generated
   * @ordered
   */
  protected EList<Cells> cells;

  /**
   * The cached value of the '{@link #getGrids() <em>Grids</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGrids()
   * @generated
   * @ordered
   */
  protected EList<Grid> grids;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ObjectsImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GoLDSLPackage.Literals.OBJECTS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ShapeRef> getShapes()
  {
    if (shapes == null)
    {
      shapes = new EObjectContainmentEList<ShapeRef>(ShapeRef.class, this, GoLDSLPackage.OBJECTS__SHAPES);
    }
    return shapes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<CellDef> getCell()
  {
    if (cell == null)
    {
      cell = new EObjectContainmentEList<CellDef>(CellDef.class, this, GoLDSLPackage.OBJECTS__CELL);
    }
    return cell;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Cells> getCells()
  {
    if (cells == null)
    {
      cells = new EObjectContainmentEList<Cells>(Cells.class, this, GoLDSLPackage.OBJECTS__CELLS);
    }
    return cells;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Grid> getGrids()
  {
    if (grids == null)
    {
      grids = new EObjectContainmentEList<Grid>(Grid.class, this, GoLDSLPackage.OBJECTS__GRIDS);
    }
    return grids;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case GoLDSLPackage.OBJECTS__SHAPES:
        return ((InternalEList<?>)getShapes()).basicRemove(otherEnd, msgs);
      case GoLDSLPackage.OBJECTS__CELL:
        return ((InternalEList<?>)getCell()).basicRemove(otherEnd, msgs);
      case GoLDSLPackage.OBJECTS__CELLS:
        return ((InternalEList<?>)getCells()).basicRemove(otherEnd, msgs);
      case GoLDSLPackage.OBJECTS__GRIDS:
        return ((InternalEList<?>)getGrids()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GoLDSLPackage.OBJECTS__SHAPES:
        return getShapes();
      case GoLDSLPackage.OBJECTS__CELL:
        return getCell();
      case GoLDSLPackage.OBJECTS__CELLS:
        return getCells();
      case GoLDSLPackage.OBJECTS__GRIDS:
        return getGrids();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GoLDSLPackage.OBJECTS__SHAPES:
        getShapes().clear();
        getShapes().addAll((Collection<? extends ShapeRef>)newValue);
        return;
      case GoLDSLPackage.OBJECTS__CELL:
        getCell().clear();
        getCell().addAll((Collection<? extends CellDef>)newValue);
        return;
      case GoLDSLPackage.OBJECTS__CELLS:
        getCells().clear();
        getCells().addAll((Collection<? extends Cells>)newValue);
        return;
      case GoLDSLPackage.OBJECTS__GRIDS:
        getGrids().clear();
        getGrids().addAll((Collection<? extends Grid>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GoLDSLPackage.OBJECTS__SHAPES:
        getShapes().clear();
        return;
      case GoLDSLPackage.OBJECTS__CELL:
        getCell().clear();
        return;
      case GoLDSLPackage.OBJECTS__CELLS:
        getCells().clear();
        return;
      case GoLDSLPackage.OBJECTS__GRIDS:
        getGrids().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GoLDSLPackage.OBJECTS__SHAPES:
        return shapes != null && !shapes.isEmpty();
      case GoLDSLPackage.OBJECTS__CELL:
        return cell != null && !cell.isEmpty();
      case GoLDSLPackage.OBJECTS__CELLS:
        return cells != null && !cells.isEmpty();
      case GoLDSLPackage.OBJECTS__GRIDS:
        return grids != null && !grids.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ObjectsImpl
