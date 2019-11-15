/**
 * generated by Xtext 2.19.0
 */
package com.simonbaars.goLDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Offset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.simonbaars.goLDSL.Offset#getX <em>X</em>}</li>
 *   <li>{@link com.simonbaars.goLDSL.Offset#getY <em>Y</em>}</li>
 * </ul>
 *
 * @see com.simonbaars.goLDSL.GoLDSLPackage#getOffset()
 * @model
 * @generated
 */
public interface Offset extends EObject
{
  /**
   * Returns the value of the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>X</em>' attribute.
   * @see #setX(int)
   * @see com.simonbaars.goLDSL.GoLDSLPackage#getOffset_X()
   * @model
   * @generated
   */
  int getX();

  /**
   * Sets the value of the '{@link com.simonbaars.goLDSL.Offset#getX <em>X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>X</em>' attribute.
   * @see #getX()
   * @generated
   */
  void setX(int value);

  /**
   * Returns the value of the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Y</em>' attribute.
   * @see #setY(int)
   * @see com.simonbaars.goLDSL.GoLDSLPackage#getOffset_Y()
   * @model
   * @generated
   */
  int getY();

  /**
   * Sets the value of the '{@link com.simonbaars.goLDSL.Offset#getY <em>Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Y</em>' attribute.
   * @see #getY()
   * @generated
   */
  void setY(int value);

} // Offset
