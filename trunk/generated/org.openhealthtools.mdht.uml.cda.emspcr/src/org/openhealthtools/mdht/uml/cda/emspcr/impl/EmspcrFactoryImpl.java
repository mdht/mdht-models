/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EmspcrFactoryImpl extends EFactoryImpl implements EmspcrFactory {
	/**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static EmspcrFactory init() {
    try
    {
      EmspcrFactory theEmspcrFactory = (EmspcrFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/emspcr"); 
      if (theEmspcrFactory != null)
      {
        return theEmspcrFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new EmspcrFactoryImpl();
  }

	/**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EmspcrFactoryImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public EObject create(EClass eClass) {
    switch (eClass.getClassifierID())
    {
      case EmspcrPackage.PATIENT_CARE_REPORT: return createPatientCareReport();
      case EmspcrPackage.EMS_BILLING_SECTION: return createEMSBillingSection();
      case EmspcrPackage.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION: return createEMSInjuryIncidentDescriptionSection();
      case EmspcrPackage.EMS_CURRENT_MEDICATION_SECTION: return createEMSCurrentMedicationSection();
      case EmspcrPackage.EMS_CARDIAC_ARREST_EVENT_SECTION: return createEMSCardiacArrestEventSection();
      case EmspcrPackage.EMS_ADVANCE_DIRECTIVES_SECTION: return createEMSAdvanceDirectivesSection();
      case EmspcrPackage.EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION: return createEMSAllergiesAndAdverseReactionsSection();
      case EmspcrPackage.EMS_PAST_MEDICAL_HISTORY_SECTION: return createEMSPastMedicalHistorySection();
      case EmspcrPackage.EMS_SOCIAL_HISTORY_SECTION: return createEMSSocialHistorySection();
      case EmspcrPackage.EMS_PHYSICAL_ASSESSMENT_SECTION: return createEMSPhysicalAssessmentSection();
      case EmspcrPackage.EMS_MEDICATIONS_ADMINISTERED_SECTION: return createEMSMedicationsAdministeredSection();
      case EmspcrPackage.EMS_PROCEDURES_PERFORMED_SECTION: return createEMSProceduresPerformedSection();
      case EmspcrPackage.EMS_PATIENT_CARE_NARRATIVE_SECTION: return createEMSPatientCareNarrativeSection();
      case EmspcrPackage.EMS_SCENE_SECTION: return createEMSSceneSection();
      case EmspcrPackage.EMS_DISPATCH_SECTION: return createEMSDispatchSection();
      case EmspcrPackage.EMS_DISPOSITION_SECTION: return createEMSDispositionSection();
      case EmspcrPackage.EMS_PERSONNEL_ADVERSE_EVENT_SECTION: return createEMSPersonnelAdverseEventSection();
      case EmspcrPackage.EMS_PROTOCOL_SECTION: return createEMSProtocolSection();
      case EmspcrPackage.EMS_RESPONSE_SECTION: return createEMSResponseSection();
      case EmspcrPackage.EMS_SITUATION_SECTION: return createEMSSituationSection();
      case EmspcrPackage.EMS_TIMES_SECTION: return createEMSTimesSection();
      case EmspcrPackage.EMS_VITAL_SIGNS_SECTION: return createEMSVitalSignsSection();
      case EmspcrPackage.DERIVED_ENTRY: return createDerivedEntry();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PatientCareReport createPatientCareReport() {
    PatientCareReportImpl patientCareReport = new PatientCareReportImpl();
    return patientCareReport;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EMSBillingSection createEMSBillingSection() {
    EMSBillingSectionImpl emsBillingSection = new EMSBillingSectionImpl();
    return emsBillingSection;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EMSInjuryIncidentDescriptionSection createEMSInjuryIncidentDescriptionSection() {
    EMSInjuryIncidentDescriptionSectionImpl emsInjuryIncidentDescriptionSection = new EMSInjuryIncidentDescriptionSectionImpl();
    return emsInjuryIncidentDescriptionSection;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EMSCurrentMedicationSection createEMSCurrentMedicationSection() {
    EMSCurrentMedicationSectionImpl emsCurrentMedicationSection = new EMSCurrentMedicationSectionImpl();
    return emsCurrentMedicationSection;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EMSCardiacArrestEventSection createEMSCardiacArrestEventSection() {
    EMSCardiacArrestEventSectionImpl emsCardiacArrestEventSection = new EMSCardiacArrestEventSectionImpl();
    return emsCardiacArrestEventSection;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EMSAdvanceDirectivesSection createEMSAdvanceDirectivesSection() {
    EMSAdvanceDirectivesSectionImpl emsAdvanceDirectivesSection = new EMSAdvanceDirectivesSectionImpl();
    return emsAdvanceDirectivesSection;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EMSAllergiesAndAdverseReactionsSection createEMSAllergiesAndAdverseReactionsSection() {
    EMSAllergiesAndAdverseReactionsSectionImpl emsAllergiesAndAdverseReactionsSection = new EMSAllergiesAndAdverseReactionsSectionImpl();
    return emsAllergiesAndAdverseReactionsSection;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EMSPastMedicalHistorySection createEMSPastMedicalHistorySection() {
    EMSPastMedicalHistorySectionImpl emsPastMedicalHistorySection = new EMSPastMedicalHistorySectionImpl();
    return emsPastMedicalHistorySection;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EMSSocialHistorySection createEMSSocialHistorySection() {
    EMSSocialHistorySectionImpl emsSocialHistorySection = new EMSSocialHistorySectionImpl();
    return emsSocialHistorySection;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EMSPhysicalAssessmentSection createEMSPhysicalAssessmentSection() {
    EMSPhysicalAssessmentSectionImpl emsPhysicalAssessmentSection = new EMSPhysicalAssessmentSectionImpl();
    return emsPhysicalAssessmentSection;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EMSMedicationsAdministeredSection createEMSMedicationsAdministeredSection() {
    EMSMedicationsAdministeredSectionImpl emsMedicationsAdministeredSection = new EMSMedicationsAdministeredSectionImpl();
    return emsMedicationsAdministeredSection;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EMSProceduresPerformedSection createEMSProceduresPerformedSection() {
    EMSProceduresPerformedSectionImpl emsProceduresPerformedSection = new EMSProceduresPerformedSectionImpl();
    return emsProceduresPerformedSection;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EMSPatientCareNarrativeSection createEMSPatientCareNarrativeSection() {
    EMSPatientCareNarrativeSectionImpl emsPatientCareNarrativeSection = new EMSPatientCareNarrativeSectionImpl();
    return emsPatientCareNarrativeSection;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EMSSceneSection createEMSSceneSection() {
    EMSSceneSectionImpl emsSceneSection = new EMSSceneSectionImpl();
    return emsSceneSection;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EMSDispatchSection createEMSDispatchSection() {
    EMSDispatchSectionImpl emsDispatchSection = new EMSDispatchSectionImpl();
    return emsDispatchSection;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EMSDispositionSection createEMSDispositionSection() {
    EMSDispositionSectionImpl emsDispositionSection = new EMSDispositionSectionImpl();
    return emsDispositionSection;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EMSPersonnelAdverseEventSection createEMSPersonnelAdverseEventSection() {
    EMSPersonnelAdverseEventSectionImpl emsPersonnelAdverseEventSection = new EMSPersonnelAdverseEventSectionImpl();
    return emsPersonnelAdverseEventSection;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EMSProtocolSection createEMSProtocolSection() {
    EMSProtocolSectionImpl emsProtocolSection = new EMSProtocolSectionImpl();
    return emsProtocolSection;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EMSResponseSection createEMSResponseSection() {
    EMSResponseSectionImpl emsResponseSection = new EMSResponseSectionImpl();
    return emsResponseSection;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EMSSituationSection createEMSSituationSection() {
    EMSSituationSectionImpl emsSituationSection = new EMSSituationSectionImpl();
    return emsSituationSection;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EMSTimesSection createEMSTimesSection() {
    EMSTimesSectionImpl emsTimesSection = new EMSTimesSectionImpl();
    return emsTimesSection;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EMSVitalSignsSection createEMSVitalSignsSection() {
    EMSVitalSignsSectionImpl emsVitalSignsSection = new EMSVitalSignsSectionImpl();
    return emsVitalSignsSection;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DerivedEntry createDerivedEntry() {
    DerivedEntryImpl derivedEntry = new DerivedEntryImpl();
    return derivedEntry;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EmspcrPackage getEmspcrPackage() {
    return (EmspcrPackage)getEPackage();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
	@Deprecated
	public static EmspcrPackage getPackage() {
    return EmspcrPackage.eINSTANCE;
  }

} // EmspcrFactoryImpl
