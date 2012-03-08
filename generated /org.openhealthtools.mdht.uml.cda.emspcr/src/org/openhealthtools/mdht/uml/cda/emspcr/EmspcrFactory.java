/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage
 * @generated
 */
public interface EmspcrFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EmspcrFactory eINSTANCE = org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Patient Care Report</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Patient Care Report</em>'.
   * @generated
   */
  PatientCareReport createPatientCareReport();

  /**
   * Returns a new object of class '<em>Billing</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Billing</em>'.
   * @generated
   */
  Billing createBilling();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  EmspcrPackage getEmspcrPackage();

} //EmspcrFactory
