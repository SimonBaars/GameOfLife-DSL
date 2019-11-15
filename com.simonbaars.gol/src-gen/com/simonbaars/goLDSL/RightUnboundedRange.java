/**
 * generated by Xtext 2.19.0
 */
package com.simonbaars.goLDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Right Unbounded Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.simonbaars.goLDSL.RightUnboundedRange#getHigherBound <em>Higher Bound</em>}</li>
 * </ul>
 *
 * @see com.simonbaars.goLDSL.GoLDSLPackage#getRightUnboundedRange()
 * @model
 * @generated
 */
public interface RightUnboundedRange extends Range
{
  /**
   * Returns the value of the '<em><b>Higher Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Higher Bound</em>' attribute.
   * @see #setHigherBound(int)
   * @see com.simonbaars.goLDSL.GoLDSLPackage#getRightUnboundedRange_HigherBound()
   * @model
   * @generated
   */
  int getHigherBound();

  /**
   * Sets the value of the '{@link com.simonbaars.goLDSL.RightUnboundedRange#getHigherBound <em>Higher Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Higher Bound</em>' attribute.
   * @see #getHigherBound()
   * @generated
   */
  void setHigherBound(int value);

} // RightUnboundedRange
