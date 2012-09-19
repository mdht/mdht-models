/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.openhealthtools.mdht.uml.cda.mu2consol.*;
import org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints;
import org.openhealthtools.mdht.uml.cda.mu2consol.HospitalAdmissionDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.HospitalAdmissionMedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.mu2consol.HospitalDischargeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.InstructionsSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.MedicationsAdministeredSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolFactory;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.PostoperativeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.PostprocedureDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.PreoperativeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class Mu2consolFactoryImpl extends EFactoryImpl implements
		Mu2consolFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static Mu2consolFactory init() {
		try {
			Mu2consolFactory theMu2consolFactory = (Mu2consolFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/mu2consol"); 
			if (theMu2consolFactory != null) {
				return theMu2consolFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Mu2consolFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public Mu2consolFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Mu2consolPackage.GENERAL_HEADER_CONSTRAINTS: return createGeneralHeaderConstraints();
			case Mu2consolPackage.SUMMARY_OF_CARE_RECORD: return createSummaryOfCareRecord();
			case Mu2consolPackage.PLAN_OF_CARE_SECTION: return createPlanOfCareSection();
			case Mu2consolPackage.ASSESSMENT_AND_PLAN_SECTION: return createAssessmentAndPlanSection();
			case Mu2consolPackage.ASSESSMENT_SECTION: return createAssessmentSection();
			case Mu2consolPackage.HOSPITAL_ADMISSION_DIAGNOSIS_SECTION: return createHospitalAdmissionDiagnosisSection();
			case Mu2consolPackage.HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION: return createHospitalDischargeDiagnosisSection();
			case Mu2consolPackage.POSTOPERATIVE_DIAGNOSIS_SECTION: return createPostoperativeDiagnosisSection();
			case Mu2consolPackage.PREOPERATIVE_DIAGNOSIS_SECTION: return createPreoperativeDiagnosisSection();
			case Mu2consolPackage.HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL: return createHospitalAdmissionMedicationsSectionEntriesOptional();
			case Mu2consolPackage.SOCIAL_HISTORY_SECTION: return createSocialHistorySection();
			case Mu2consolPackage.SMOKING_STATUS_OBSERVATION: return createSmokingStatusObservation();
			case Mu2consolPackage.RESULTS_SECTION: return createResultsSection();
			case Mu2consolPackage.RESULT_ORGANIZER: return createResultOrganizer();
			case Mu2consolPackage.RESULT_OBSERVATION: return createResultObservation();
			case Mu2consolPackage.POSTPROCEDURE_DIAGNOSIS_SECTION: return createPostprocedureDiagnosisSection();
			case Mu2consolPackage.FUNCTIONAL_STATUS_SECTION: return createFunctionalStatusSection();
			case Mu2consolPackage.INSTRUCTIONS_SECTION: return createInstructionsSection();
			case Mu2consolPackage.MEDICATIONS_ADMINISTERED_SECTION: return createMedicationsAdministeredSection();
			case Mu2consolPackage.CLINICAL_OFFICE_VISIT_SUMMARY: return createClinicalOfficeVisitSummary();
			case Mu2consolPackage.TRANSITION_OF_CARE_AMBULATORY_SUMMARY: return createTransitionOfCareAmbulatorySummary();
			case Mu2consolPackage.TRANSITION_OF_CARE_INPATIENT_SUMMARY: return createTransitionOfCareInpatientSummary();
			case Mu2consolPackage.VIEW_DOWNLOAD_TRANSMIT_SUMMARY: return createViewDownloadTransmitSummary();
			case Mu2consolPackage.VDT_INPATIENT_SUMMARY: return createVDTInpatientSummary();
			case Mu2consolPackage.VDT_AMBULATORY_SUMMARY: return createVDTAmbulatorySummary();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralHeaderConstraints createGeneralHeaderConstraints() {
		GeneralHeaderConstraintsImpl generalHeaderConstraints = new GeneralHeaderConstraintsImpl();
		return generalHeaderConstraints;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SummaryOfCareRecord createSummaryOfCareRecord() {
		SummaryOfCareRecordImpl summaryOfCareRecord = new SummaryOfCareRecordImpl();
		return summaryOfCareRecord;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfCareSection createPlanOfCareSection() {
		PlanOfCareSectionImpl planOfCareSection = new PlanOfCareSectionImpl();
		return planOfCareSection;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentAndPlanSection createAssessmentAndPlanSection() {
		AssessmentAndPlanSectionImpl assessmentAndPlanSection = new AssessmentAndPlanSectionImpl();
		return assessmentAndPlanSection;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public InstructionsSection createInstructionsSection() {
		InstructionsSectionImpl instructionsSection = new InstructionsSectionImpl();
		return instructionsSection;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalOfficeVisitSummary createClinicalOfficeVisitSummary() {
		ClinicalOfficeVisitSummaryImpl clinicalOfficeVisitSummary = new ClinicalOfficeVisitSummaryImpl();
		return clinicalOfficeVisitSummary;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionOfCareAmbulatorySummary createTransitionOfCareAmbulatorySummary() {
		TransitionOfCareAmbulatorySummaryImpl transitionOfCareAmbulatorySummary = new TransitionOfCareAmbulatorySummaryImpl();
		return transitionOfCareAmbulatorySummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionOfCareInpatientSummary createTransitionOfCareInpatientSummary() {
		TransitionOfCareInpatientSummaryImpl transitionOfCareInpatientSummary = new TransitionOfCareInpatientSummaryImpl();
		return transitionOfCareInpatientSummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewDownloadTransmitSummary createViewDownloadTransmitSummary() {
		ViewDownloadTransmitSummaryImpl viewDownloadTransmitSummary = new ViewDownloadTransmitSummaryImpl();
		return viewDownloadTransmitSummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VDTInpatientSummary createVDTInpatientSummary() {
		VDTInpatientSummaryImpl vdtInpatientSummary = new VDTInpatientSummaryImpl();
		return vdtInpatientSummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VDTAmbulatorySummary createVDTAmbulatorySummary() {
		VDTAmbulatorySummaryImpl vdtAmbulatorySummary = new VDTAmbulatorySummaryImpl();
		return vdtAmbulatorySummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultObservation createResultObservation() {
		ResultObservationImpl resultObservation = new ResultObservationImpl();
		return resultObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultOrganizer createResultOrganizer() {
		ResultOrganizerImpl resultOrganizer = new ResultOrganizerImpl();
		return resultOrganizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultsSection createResultsSection() {
		ResultsSectionImpl resultsSection = new ResultsSectionImpl();
		return resultsSection;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentSection createAssessmentSection() {
		AssessmentSectionImpl assessmentSection = new AssessmentSectionImpl();
		return assessmentSection;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalAdmissionDiagnosisSection createHospitalAdmissionDiagnosisSection() {
		HospitalAdmissionDiagnosisSectionImpl hospitalAdmissionDiagnosisSection = new HospitalAdmissionDiagnosisSectionImpl();
		return hospitalAdmissionDiagnosisSection;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalDischargeDiagnosisSection createHospitalDischargeDiagnosisSection() {
		HospitalDischargeDiagnosisSectionImpl hospitalDischargeDiagnosisSection = new HospitalDischargeDiagnosisSectionImpl();
		return hospitalDischargeDiagnosisSection;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PostoperativeDiagnosisSection createPostoperativeDiagnosisSection() {
		PostoperativeDiagnosisSectionImpl postoperativeDiagnosisSection = new PostoperativeDiagnosisSectionImpl();
		return postoperativeDiagnosisSection;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PostprocedureDiagnosisSection createPostprocedureDiagnosisSection() {
		PostprocedureDiagnosisSectionImpl postprocedureDiagnosisSection = new PostprocedureDiagnosisSectionImpl();
		return postprocedureDiagnosisSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalStatusSection createFunctionalStatusSection() {
		FunctionalStatusSectionImpl functionalStatusSection = new FunctionalStatusSectionImpl();
		return functionalStatusSection;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PreoperativeDiagnosisSection createPreoperativeDiagnosisSection() {
		PreoperativeDiagnosisSectionImpl preoperativeDiagnosisSection = new PreoperativeDiagnosisSectionImpl();
		return preoperativeDiagnosisSection;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationsAdministeredSection createMedicationsAdministeredSection() {
		MedicationsAdministeredSectionImpl medicationsAdministeredSection = new MedicationsAdministeredSectionImpl();
		return medicationsAdministeredSection;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalAdmissionMedicationsSectionEntriesOptional createHospitalAdmissionMedicationsSectionEntriesOptional() {
		HospitalAdmissionMedicationsSectionEntriesOptionalImpl hospitalAdmissionMedicationsSectionEntriesOptional = new HospitalAdmissionMedicationsSectionEntriesOptionalImpl();
		return hospitalAdmissionMedicationsSectionEntriesOptional;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SocialHistorySection createSocialHistorySection() {
		SocialHistorySectionImpl socialHistorySection = new SocialHistorySectionImpl();
		return socialHistorySection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmokingStatusObservation createSmokingStatusObservation() {
		SmokingStatusObservationImpl smokingStatusObservation = new SmokingStatusObservationImpl();
		return smokingStatusObservation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Mu2consolPackage getMu2consolPackage() {
		return (Mu2consolPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Mu2consolPackage getPackage() {
		return Mu2consolPackage.eINSTANCE;
	}

} // Mu2consolFactoryImpl
