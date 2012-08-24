/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.salmonellosis;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPackage
 * @generated
 */
public interface SalmonellosisFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SalmonellosisFactory eINSTANCE = org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.impl.SalmonellosisFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Case Report</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Case Report</em>'.
   * @generated
   */
  SalmonellosisCaseReport createSalmonellosisCaseReport();

  /**
   * Returns a new object of class '<em>PHCR Social History Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>PHCR Social History Section</em>'.
   * @generated
   */
  SalmonellosisPHCRSocialHistorySection createSalmonellosisPHCRSocialHistorySection();

  /**
   * Returns a new object of class '<em>Possible Exposure Location And Type Act</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Possible Exposure Location And Type Act</em>'.
   * @generated
   */
  SalmonellosisPossibleExposureLocationAndTypeAct createSalmonellosisPossibleExposureLocationAndTypeAct();

  /**
   * Returns a new object of class '<em>HIV Status Observation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>HIV Status Observation</em>'.
   * @generated
   */
  HIVStatusObservation createHIVStatusObservation();

  /**
   * Returns a new object of class '<em>PHCR Relevant Dx Tests Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>PHCR Relevant Dx Tests Section</em>'.
   * @generated
   */
  SalmonellosisPHCRRelevantDxTestsSection createSalmonellosisPHCRRelevantDxTestsSection();

  /**
   * Returns a new object of class '<em>Result Organizer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Result Organizer</em>'.
   * @generated
   */
  SalmonellosisResultOrganizer createSalmonellosisResultOrganizer();

  /**
   * Returns a new object of class '<em>Result Observation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Result Observation</em>'.
   * @generated
   */
  SalmonellosisResultObservation createSalmonellosisResultObservation();

  /**
   * Returns a new object of class '<em>PHCR Clinical Information Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>PHCR Clinical Information Section</em>'.
   * @generated
   */
  SalmonellosisPHCRClinicalInformationSection createSalmonellosisPHCRClinicalInformationSection();

  /**
   * Returns a new object of class '<em>Case Observation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Case Observation</em>'.
   * @generated
   */
  SalmonellosisCaseObservation createSalmonellosisCaseObservation();

  /**
   * Returns a new object of class '<em>Signs And Symptoms Observation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Signs And Symptoms Observation</em>'.
   * @generated
   */
  SalmonellosisSignsAndSymptomsObservation createSalmonellosisSignsAndSymptomsObservation();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SalmonellosisPackage getSalmonellosisPackage();

} //SalmonellosisFactory
