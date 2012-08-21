/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.uml.cda.ClinicalDocument;

import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.*;

import org.openhealthtools.mdht.uml.hl7.rim.Act;
import org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides
 * an adapter <code>createXXX</code> method for each class of the model. <!--
 * end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage
 * @generated
 */
public class Mu2consolAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static Mu2consolPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public Mu2consolAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Mu2consolPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc --> This implementation returns <code>true</code> if
	 * the object is either the model's package or is an instance object of the
	 * model. <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected Mu2consolSwitch<Adapter> modelSwitch = new Mu2consolSwitch<Adapter>() {
			@Override
			public Adapter caseGeneralHeaderConstraints(GeneralHeaderConstraints object) {
				return createGeneralHeaderConstraintsAdapter();
			}
			@Override
			public Adapter caseSummaryOfCareRecord(SummaryOfCareRecord object) {
				return createSummaryOfCareRecordAdapter();
			}
			@Override
			public Adapter casePlanOfCareSection(PlanOfCareSection object) {
				return createPlanOfCareSectionAdapter();
			}
			@Override
			public Adapter caseAssessmentAndPlanSection(AssessmentAndPlanSection object) {
				return createAssessmentAndPlanSectionAdapter();
			}
			@Override
			public Adapter caseAssessmentSection(AssessmentSection object) {
				return createAssessmentSectionAdapter();
			}
			@Override
			public Adapter caseHospitalAdmissionDiagnosisSection(HospitalAdmissionDiagnosisSection object) {
				return createHospitalAdmissionDiagnosisSectionAdapter();
			}
			@Override
			public Adapter caseHospitalDischargeDiagnosisSection(HospitalDischargeDiagnosisSection object) {
				return createHospitalDischargeDiagnosisSectionAdapter();
			}
			@Override
			public Adapter casePostoperativeDiagnosisSection(PostoperativeDiagnosisSection object) {
				return createPostoperativeDiagnosisSectionAdapter();
			}
			@Override
			public Adapter casePreoperativeDiagnosisSection(PreoperativeDiagnosisSection object) {
				return createPreoperativeDiagnosisSectionAdapter();
			}
			@Override
			public Adapter caseMedicationsAdministeredSection(MedicationsAdministeredSection object) {
				return createMedicationsAdministeredSectionAdapter();
			}
			@Override
			public Adapter caseHospitalAdmissionMedicationsSectionEntriesOptional(HospitalAdmissionMedicationsSectionEntriesOptional object) {
				return createHospitalAdmissionMedicationsSectionEntriesOptionalAdapter();
			}
			@Override
			public Adapter caseAllergiesSectionEntriesOptional(AllergiesSectionEntriesOptional object) {
				return createAllergiesSectionEntriesOptionalAdapter();
			}
			@Override
			public Adapter casePostprocedureDiagnosisSection(PostprocedureDiagnosisSection object) {
				return createPostprocedureDiagnosisSectionAdapter();
			}
			@Override
			public Adapter caseAssessmentAndPlanForCarePlanning(AssessmentAndPlanForCarePlanning object) {
				return createAssessmentAndPlanForCarePlanningAdapter();
			}
			@Override
			public Adapter caseAssessmentAndPlanForConditionOrConcern(AssessmentAndPlanForConditionOrConcern object) {
				return createAssessmentAndPlanForConditionOrConcernAdapter();
			}
			@Override
			public Adapter caseInstructionsSection(InstructionsSection object) {
				return createInstructionsSectionAdapter();
			}
			@Override
			public Adapter caseInfrastructureRoot(InfrastructureRoot object) {
				return createInfrastructureRootAdapter();
			}
			@Override
			public Adapter caseAct(Act object) {
				return createActAdapter();
			}
			@Override
			public Adapter caseClinicalDocument(ClinicalDocument object) {
				return createClinicalDocumentAdapter();
			}
			@Override
			public Adapter caseSection(Section object) {
				return createSectionAdapter();
			}
			@Override
			public Adapter caseConsol_PlanOfCareSection(org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection object) {
				return createConsol_PlanOfCareSectionAdapter();
			}
			@Override
			public Adapter caseConsol_AssessmentAndPlanSection(org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection object) {
				return createConsol_AssessmentAndPlanSectionAdapter();
			}
			@Override
			public Adapter caseConsol_AssessmentSection(org.openhealthtools.mdht.uml.cda.consol.AssessmentSection object) {
				return createConsol_AssessmentSectionAdapter();
			}
			@Override
			public Adapter caseConsol_HospitalAdmissionDiagnosisSection(org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosisSection object) {
				return createConsol_HospitalAdmissionDiagnosisSectionAdapter();
			}
			@Override
			public Adapter caseConsol_HospitalDischargeDiagnosisSection(org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosisSection object) {
				return createConsol_HospitalDischargeDiagnosisSectionAdapter();
			}
			@Override
			public Adapter caseConsol_PostoperativeDiagnosisSection(org.openhealthtools.mdht.uml.cda.consol.PostoperativeDiagnosisSection object) {
				return createConsol_PostoperativeDiagnosisSectionAdapter();
			}
			@Override
			public Adapter caseConsol_PreoperativeDiagnosisSection(org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosisSection object) {
				return createConsol_PreoperativeDiagnosisSectionAdapter();
			}
			@Override
			public Adapter caseConsol_MedicationsAdministeredSection(org.openhealthtools.mdht.uml.cda.consol.MedicationsAdministeredSection object) {
				return createConsol_MedicationsAdministeredSectionAdapter();
			}
			@Override
			public Adapter caseConsol_HospitalAdmissionMedicationsSectionEntriesOptional(org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionMedicationsSectionEntriesOptional object) {
				return createConsol_HospitalAdmissionMedicationsSectionEntriesOptionalAdapter();
			}
			@Override
			public Adapter caseConsol_AllergiesSectionEntriesOptional(org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional object) {
				return createConsol_AllergiesSectionEntriesOptionalAdapter();
			}
			@Override
			public Adapter caseConsol_PostprocedureDiagnosisSection(org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosisSection object) {
				return createConsol_PostprocedureDiagnosisSectionAdapter();
			}
			@Override
			public Adapter caseConsol_InstructionsSection(org.openhealthtools.mdht.uml.cda.consol.InstructionsSection object) {
				return createConsol_InstructionsSectionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints <em>General Header Constraints</em>}'.
	 * <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints
	 * @generated
	 */
	public Adapter createGeneralHeaderConstraintsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord <em>Summary Of Care Record</em>}'.
	 * <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord
	 * @generated
	 */
	public Adapter createSummaryOfCareRecordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentAndPlanForCarePlanning <em>Assessment And Plan For Care Planning</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentAndPlanForCarePlanning
	 * @generated
	 */
	public Adapter createAssessmentAndPlanForCarePlanningAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.mu2consol.PlanOfCareSection <em>Plan Of Care Section</em>}'.
	 * <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.mu2consol.PlanOfCareSection
	 * @generated
	 */
	public Adapter createPlanOfCareSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentAndPlanForConditionOrConcern
	 * <em>Assessment And Plan For Condition Or Concern</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentAndPlanForConditionOrConcern
	 * @generated
	 */
	public Adapter createAssessmentAndPlanForConditionOrConcernAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentAndPlanSection <em>Assessment And Plan Section</em>}'.
	 * <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentAndPlanSection
	 * @generated
	 */
	public Adapter createAssessmentAndPlanSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.mu2consol.InstructionsSection <em>Instructions Section</em>}'.
	 * <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.mu2consol.InstructionsSection
	 * @generated
	 */
	public Adapter createInstructionsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.mu2consol.HospitalAdmissionDiagnosisSection <em>Hospital Admission Diagnosis Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.mu2consol.HospitalAdmissionDiagnosisSection
	 * @generated
	 */
	public Adapter createHospitalAdmissionDiagnosisSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.mu2consol.HospitalDischargeDiagnosisSection <em>Hospital Discharge Diagnosis Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.mu2consol.HospitalDischargeDiagnosisSection
	 * @generated
	 */
	public Adapter createHospitalDischargeDiagnosisSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.mu2consol.PostoperativeDiagnosisSection <em>Postoperative Diagnosis Section</em>}'.
	 * <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.mu2consol.PostoperativeDiagnosisSection
	 * @generated
	 */
	public Adapter createPostoperativeDiagnosisSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.mu2consol.PostprocedureDiagnosisSection <em>Postprocedure Diagnosis Section</em>}'.
	 * <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.mu2consol.PostprocedureDiagnosisSection
	 * @generated
	 */
	public Adapter createPostprocedureDiagnosisSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.mu2consol.PreoperativeDiagnosisSection <em>Preoperative Diagnosis Section</em>}'.
	 * <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.mu2consol.PreoperativeDiagnosisSection
	 * @generated
	 */
	public Adapter createPreoperativeDiagnosisSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.mu2consol.MedicationsAdministeredSection <em>Medications Administered Section</em>}'.
	 * <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.mu2consol.MedicationsAdministeredSection
	 * @generated
	 */
	public Adapter createMedicationsAdministeredSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.HospitalAdmissionMedicationsSectionEntriesOptional
	 * <em>Hospital Admission Medications Section Entries Optional</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.mu2consol.HospitalAdmissionMedicationsSectionEntriesOptional
	 * @generated
	 */
	public Adapter createHospitalAdmissionMedicationsSectionEntriesOptionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.mu2consol.AllergiesSectionEntriesOptional <em>Allergies Section Entries Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.mu2consol.AllergiesSectionEntriesOptional
	 * @generated
	 */
	public Adapter createAllergiesSectionEntriesOptionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot <em>Infrastructure Root</em>}'.
	 * <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot
	 * @generated
	 */
	public Adapter createInfrastructureRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.openhealthtools.mdht.uml.hl7.rim.Act <em>Act</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.hl7.rim.Act
	 * @generated
	 */
	public Adapter createActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument <em>Clinical Document</em>}'.
	 * <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ClinicalDocument
	 * @generated
	 */
	public Adapter createClinicalDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.openhealthtools.mdht.uml.cda.Section <em>Section</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Section
	 * @generated
	 */
	public Adapter createSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection <em>Assessment And Plan Section</em>}'.
	 * <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection
	 * @generated
	 */
	public Adapter createConsol_AssessmentAndPlanSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection <em>Plan Of Care Section</em>}'.
	 * <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection
	 * @generated
	 */
	public Adapter createConsol_PlanOfCareSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentSection <em>Assessment Section</em>}'.
	 * <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentSection
	 * @generated
	 */
	public Adapter createAssessmentSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.InstructionsSection <em>Instructions Section</em>}'.
	 * <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.InstructionsSection
	 * @generated
	 */
	public Adapter createConsol_InstructionsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentSection <em>Assessment Section</em>}'.
	 * <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AssessmentSection
	 * @generated
	 */
	public Adapter createConsol_AssessmentSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosisSection <em>Hospital Admission Diagnosis Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosisSection
	 * @generated
	 */
	public Adapter createConsol_HospitalAdmissionDiagnosisSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosisSection <em>Hospital Discharge Diagnosis Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosisSection
	 * @generated
	 */
	public Adapter createConsol_HospitalDischargeDiagnosisSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PostoperativeDiagnosisSection <em>Postoperative Diagnosis Section</em>}'.
	 * <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PostoperativeDiagnosisSection
	 * @generated
	 */
	public Adapter createConsol_PostoperativeDiagnosisSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosisSection <em>Postprocedure Diagnosis Section</em>}'.
	 * <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosisSection
	 * @generated
	 */
	public Adapter createConsol_PostprocedureDiagnosisSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosisSection <em>Preoperative Diagnosis Section</em>}'.
	 * <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosisSection
	 * @generated
	 */
	public Adapter createConsol_PreoperativeDiagnosisSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsAdministeredSection <em>Medications Administered Section</em>}'.
	 * <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.MedicationsAdministeredSection
	 * @generated
	 */
	public Adapter createConsol_MedicationsAdministeredSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionMedicationsSectionEntriesOptional
	 * <em>Hospital Admission Medications Section Entries Optional</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionMedicationsSectionEntriesOptional
	 * @generated
	 */
	public Adapter createConsol_HospitalAdmissionMedicationsSectionEntriesOptionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional <em>Allergies Section Entries Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional
	 * @generated
	 */
	public Adapter createConsol_AllergiesSectionEntriesOptionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc --> This
	 * default implementation returns null. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // Mu2consolAdapterFactory
