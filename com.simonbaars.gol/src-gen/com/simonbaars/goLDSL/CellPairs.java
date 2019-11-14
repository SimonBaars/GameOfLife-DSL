/**
 * generated by Xtext 2.19.0
 */
package com.simonbaars.goLDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cell Pairs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.simonbaars.goLDSL.CellPairs#getCells <em>Cells</em>}</li>
 * </ul>
 *
 * @see com.simonbaars.goLDSL.GoLDSLPackage#getCellPairs()
 * @model
 * @generated
 */
public interface CellPairs extends CellsDef
{
  /**
   * Returns the value of the '<em><b>Cells</b></em>' containment reference list.
   * The list contents are of type {@link com.simonbaars.goLDSL.Cell}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cells</em>' containment reference list.
   * @see com.simonbaars.goLDSL.GoLDSLPackage#getCellPairs_Cells()
   * @model containment="true"
   * @generated
   */
  EList<Cell> getCells();

} // CellPairs
