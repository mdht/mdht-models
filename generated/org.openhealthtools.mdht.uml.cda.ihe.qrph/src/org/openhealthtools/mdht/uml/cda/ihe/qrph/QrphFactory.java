/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.qrph;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.QrphPackage
 * @generated
 */
public interface QrphFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  QrphFactory eINSTANCE = org.openhealthtools.mdht.uml.cda.ihe.qrph.impl.QrphFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Early Hearing Care Plan Document</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Early Hearing Care Plan Document</em>'.
   * @generated
   */
  EarlyHearingCarePlanDocument createEarlyHearingCarePlanDocument();

  /**
   * Returns a new object of class '<em>Risk Indicators For Hearing Loss Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Risk Indicators For Hearing Loss Section</em>'.
   * @generated
   */
  RiskIndicatorsForHearingLossSection createRiskIndicatorsForHearingLossSection();

  /**
   * Returns a new object of class '<em>Hearing Screening Coded Results Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Hearing Screening Coded Results Section</em>'.
   * @generated
   */
  HearingScreeningCodedResultsSection createHearingScreeningCodedResultsSection();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  QrphPackage getQrphPackage();

} //QrphFactory
