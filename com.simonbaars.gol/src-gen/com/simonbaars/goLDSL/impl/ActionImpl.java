/**
 * generated by Xtext 2.19.0
 */
package com.simonbaars.goLDSL.impl;

import com.simonbaars.goLDSL.Action;
import com.simonbaars.goLDSL.GoLDSLPackage;
import com.simonbaars.goLDSL.Objects;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.simonbaars.goLDSL.impl.ActionImpl#getObjects <em>Objects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionImpl extends MinimalEObjectImpl.Container implements Action
{
  /**
   * The cached value of the '{@link #getObjects() <em>Objects</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjects()
   * @generated
   * @ordered
   */
  protected Objects objects;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActionImpl()
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
    return GoLDSLPackage.Literals.ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Objects getObjects()
  {
    return objects;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetObjects(Objects newObjects, NotificationChain msgs)
  {
    Objects oldObjects = objects;
    objects = newObjects;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoLDSLPackage.ACTION__OBJECTS, oldObjects, newObjects);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setObjects(Objects newObjects)
  {
    if (newObjects != objects)
    {
      NotificationChain msgs = null;
      if (objects != null)
        msgs = ((InternalEObject)objects).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoLDSLPackage.ACTION__OBJECTS, null, msgs);
      if (newObjects != null)
        msgs = ((InternalEObject)newObjects).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoLDSLPackage.ACTION__OBJECTS, null, msgs);
      msgs = basicSetObjects(newObjects, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoLDSLPackage.ACTION__OBJECTS, newObjects, newObjects));
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
      case GoLDSLPackage.ACTION__OBJECTS:
        return basicSetObjects(null, msgs);
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
      case GoLDSLPackage.ACTION__OBJECTS:
        return getObjects();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GoLDSLPackage.ACTION__OBJECTS:
        setObjects((Objects)newValue);
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
      case GoLDSLPackage.ACTION__OBJECTS:
        setObjects((Objects)null);
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
      case GoLDSLPackage.ACTION__OBJECTS:
        return objects != null;
    }
    return super.eIsSet(featureID);
  }

} //ActionImpl