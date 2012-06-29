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
   * Returns a new object of class '<em>EMS Billing Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EMS Billing Section</em>'.
   * @generated
   */
  EMSBillingSection createEMSBillingSection();

  /**
   * Returns a new object of class '<em>Derived CDA Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Derived CDA Section</em>'.
   * @generated
   */
  DerivedCDASection createDerivedCDASection();

  /**
   * Returns a new object of class '<em>Derived Entry</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Derived Entry</em>'.
   * @generated
   */
  DerivedEntry createDerivedEntry();

  /**
   * Returns a new object of class '<em>EMS Injury Incident Description Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EMS Injury Incident Description Section</em>'.
   * @generated
   */
  EMSInjuryIncidentDescriptionSection createEMSInjuryIncidentDescriptionSection();

  /**
   * Returns a new object of class '<em>EMS Current Medication Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EMS Current Medication Section</em>'.
   * @generated
   */
  EMSCurrentMedicationSection createEMSCurrentMedicationSection();

  /**
   * Returns a new object of class '<em>EMS Cardiac Arrest Event Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EMS Cardiac Arrest Event Section</em>'.
   * @generated
   */
  EMSCardiacArrestEventSection createEMSCardiacArrestEventSection();

  /**
   * Returns a new object of class '<em>EMS Advance Directives Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EMS Advance Directives Section</em>'.
   * @generated
   */
  EMSAdvanceDirectivesSection createEMSAdvanceDirectivesSection();

  /**
   * Returns a new object of class '<em>EMS Allergies And Adverse Reactions Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EMS Allergies And Adverse Reactions Section</em>'.
   * @generated
   */
  EMSAllergiesAndAdverseReactionsSection createEMSAllergiesAndAdverseReactionsSection();

  /**
   * Returns a new object of class '<em>EMS Past Medical History</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EMS Past Medical History</em>'.
   * @generated
   */
  EMSPastMedicalHistory createEMSPastMedicalHistory();

  /**
   * Returns a new object of class '<em>EMS Social History</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EMS Social History</em>'.
   * @generated
   */
  EMSSocialHistory createEMSSocialHistory();

  /**
   * Returns a new object of class '<em>EMS Physical Assessment Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EMS Physical Assessment Section</em>'.
   * @generated
   */
  EMSPhysicalAssessmentSection createEMSPhysicalAssessmentSection();

  /**
   * Returns a new object of class '<em>EMS Medications Administered Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EMS Medications Administered Section</em>'.
   * @generated
   */
  EMSMedicationsAdministeredSection createEMSMedicationsAdministeredSection();

  /**
   * Returns a new object of class '<em>EMS Procedures Performed Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EMS Procedures Performed Section</em>'.
   * @generated
   */
  EMSProceduresPerformedSection createEMSProceduresPerformedSection();

  /**
   * Returns a new object of class '<em>EMS Patient Care Narrative</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EMS Patient Care Narrative</em>'.
   * @generated
   */
  EMSPatientCareNarrative createEMSPatientCareNarrative();

  /**
   * Returns a new object of class '<em>EMS Scene Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EMS Scene Section</em>'.
   * @generated
   */
  EMSSceneSection createEMSSceneSection();

  /**
   * Returns a new object of class '<em>EMS Vital Signs Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EMS Vital Signs Section</em>'.
   * @generated
   */
  EMSVitalSignsSection createEMSVitalSignsSection();

  /**
   * Returns a new object of class '<em>EMS Dispatch</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EMS Dispatch</em>'.
   * @generated
   */
  EMSDispatch createEMSDispatch();

  /**
   * Returns a new object of class '<em>EMS Response</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EMS Response</em>'.
   * @generated
   */
  EMSResponse createEMSResponse();

  /**
   * Returns a new object of class '<em>EMS Disposition Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EMS Disposition Section</em>'.
   * @generated
   */
  EMSDispositionSection createEMSDispositionSection();

  /**
   * Returns a new object of class '<em>EMS Personnel Adverse Event</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EMS Personnel Adverse Event</em>'.
   * @generated
   */
  EMSPersonnelAdverseEvent createEMSPersonnelAdverseEvent();

  /**
   * Returns a new object of class '<em>EMS Protocol Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EMS Protocol Section</em>'.
   * @generated
   */
  EMSProtocolSection createEMSProtocolSection();

  /**
   * Returns a new object of class '<em>EMS Situation Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EMS Situation Section</em>'.
   * @generated
   */
  EMSSituationSection createEMSSituationSection();

  /**
   * Returns a new object of class '<em>EMS Times Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EMS Times Section</em>'.
   * @generated
   */
  EMSTimesSection createEMSTimesSection();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  EmspcrPackage getEmspcrPackage();

} //EmspcrFactory
