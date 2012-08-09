/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.uml.cda.ClinicalDocument;

import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentSection;
import org.openhealthtools.mdht.uml.cda.consol.EncountersSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.mu2consol.*;

import org.openhealthtools.mdht.uml.hl7.rim.Act;
import org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance
 * hierarchy. It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the
 * result of the switch. <!-- end-user-doc -->
 * 
 * @see org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage
 * @generated
 */
public class Mu2consolSwitch<T> {
	/**
	 * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static Mu2consolPackage modelPackage;

	/**
	 * Creates an instance of the switch. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public Mu2consolSwitch() {
		if (modelPackage == null) {
			modelPackage = Mu2consolPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns
	 * a non null result; it yields that result. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the first non-null result returned by a <code>caseXXX</code>
	 *         call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns
	 * a non null result; it yields that result. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the first non-null result returned by a <code>caseXXX</code>
	 *         call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		} else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return eSuperTypes.isEmpty() ? defaultCase(theEObject) : doSwitch(
					eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns
	 * a non null result; it yields that result. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the first non-null result returned by a <code>caseXXX</code>
	 *         call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case Mu2consolPackage.GENERAL_HEADER_CONSTRAINTS: {
			GeneralHeaderConstraints generalHeaderConstraints = (GeneralHeaderConstraints) theEObject;
			T result = caseGeneralHeaderConstraints(generalHeaderConstraints);
			if (result == null)
				result = caseClinicalDocument(generalHeaderConstraints);
			if (result == null)
				result = caseAct(generalHeaderConstraints);
			if (result == null)
				result = caseInfrastructureRoot(generalHeaderConstraints);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Mu2consolPackage.SUMMARY_OF_CARE_RECORD: {
			SummaryOfCareRecord summaryOfCareRecord = (SummaryOfCareRecord) theEObject;
			T result = caseSummaryOfCareRecord(summaryOfCareRecord);
			if (result == null)
				result = caseGeneralHeaderConstraints(summaryOfCareRecord);
			if (result == null)
				result = caseClinicalDocument(summaryOfCareRecord);
			if (result == null)
				result = caseAct(summaryOfCareRecord);
			if (result == null)
				result = caseInfrastructureRoot(summaryOfCareRecord);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Mu2consolPackage.ENCOUNTERS_SECTION: {
			EncountersSection encountersSection = (EncountersSection) theEObject;
			T result = caseEncountersSection(encountersSection);
			if (result == null)
				result = caseConsol_EncountersSection(encountersSection);
			if (result == null)
				result = caseEncountersSectionEntriesOptional(encountersSection);
			if (result == null)
				result = caseSection(encountersSection);
			if (result == null)
				result = caseAct(encountersSection);
			if (result == null)
				result = caseInfrastructureRoot(encountersSection);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Mu2consolPackage.PLAN_OF_CARE_SECTION: {
			PlanOfCareSection planOfCareSection = (PlanOfCareSection) theEObject;
			T result = casePlanOfCareSection(planOfCareSection);
			if (result == null)
				result = caseConsol_PlanOfCareSection(planOfCareSection);
			if (result == null)
				result = caseSection(planOfCareSection);
			if (result == null)
				result = caseAct(planOfCareSection);
			if (result == null)
				result = caseInfrastructureRoot(planOfCareSection);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Mu2consolPackage.ASSESSMENT_AND_PLAN_SECTION: {
			AssessmentAndPlanSection assessmentAndPlanSection = (AssessmentAndPlanSection) theEObject;
			T result = caseAssessmentAndPlanSection(assessmentAndPlanSection);
			if (result == null)
				result = caseConsol_AssessmentAndPlanSection(assessmentAndPlanSection);
			if (result == null)
				result = caseSection(assessmentAndPlanSection);
			if (result == null)
				result = caseAct(assessmentAndPlanSection);
			if (result == null)
				result = caseInfrastructureRoot(assessmentAndPlanSection);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Mu2consolPackage.INSTRUCTIONS_SECTION: {
			InstructionsSection instructionsSection = (InstructionsSection) theEObject;
			T result = caseInstructionsSection(instructionsSection);
			if (result == null)
				result = caseConsol_InstructionsSection(instructionsSection);
			if (result == null)
				result = caseSection(instructionsSection);
			if (result == null)
				result = caseAct(instructionsSection);
			if (result == null)
				result = caseInfrastructureRoot(instructionsSection);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Mu2consolPackage.ASSESSMENT_SECTION: {
			AssessmentSection assessmentSection = (AssessmentSection) theEObject;
			T result = caseAssessmentSection(assessmentSection);
			if (result == null)
				result = caseConsol_AssessmentSection(assessmentSection);
			if (result == null)
				result = caseSection(assessmentSection);
			if (result == null)
				result = caseAct(assessmentSection);
			if (result == null)
				result = caseInfrastructureRoot(assessmentSection);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Mu2consolPackage.HOSPITAL_ADMISSION_DIAGNOSIS_SECTION: {
			HospitalAdmissionDiagnosisSection hospitalAdmissionDiagnosisSection = (HospitalAdmissionDiagnosisSection) theEObject;
			T result = caseHospitalAdmissionDiagnosisSection(hospitalAdmissionDiagnosisSection);
			if (result == null)
				result = caseConsol_HospitalAdmissionDiagnosisSection(hospitalAdmissionDiagnosisSection);
			if (result == null)
				result = caseSection(hospitalAdmissionDiagnosisSection);
			if (result == null)
				result = caseAct(hospitalAdmissionDiagnosisSection);
			if (result == null)
				result = caseInfrastructureRoot(hospitalAdmissionDiagnosisSection);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Mu2consolPackage.HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION: {
			HospitalDischargeDiagnosisSection hospitalDischargeDiagnosisSection = (HospitalDischargeDiagnosisSection) theEObject;
			T result = caseHospitalDischargeDiagnosisSection(hospitalDischargeDiagnosisSection);
			if (result == null)
				result = caseConsol_HospitalDischargeDiagnosisSection(hospitalDischargeDiagnosisSection);
			if (result == null)
				result = caseSection(hospitalDischargeDiagnosisSection);
			if (result == null)
				result = caseAct(hospitalDischargeDiagnosisSection);
			if (result == null)
				result = caseInfrastructureRoot(hospitalDischargeDiagnosisSection);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Mu2consolPackage.POSTOPERATIVE_DIAGNOSIS_SECTION: {
			PostoperativeDiagnosisSection postoperativeDiagnosisSection = (PostoperativeDiagnosisSection) theEObject;
			T result = casePostoperativeDiagnosisSection(postoperativeDiagnosisSection);
			if (result == null)
				result = caseConsol_PostoperativeDiagnosisSection(postoperativeDiagnosisSection);
			if (result == null)
				result = caseSection(postoperativeDiagnosisSection);
			if (result == null)
				result = caseAct(postoperativeDiagnosisSection);
			if (result == null)
				result = caseInfrastructureRoot(postoperativeDiagnosisSection);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Mu2consolPackage.PREOPERATIVE_DIAGNOSIS_SECTION: {
			PreoperativeDiagnosisSection preoperativeDiagnosisSection = (PreoperativeDiagnosisSection) theEObject;
			T result = casePreoperativeDiagnosisSection(preoperativeDiagnosisSection);
			if (result == null)
				result = caseConsol_PreoperativeDiagnosisSection(preoperativeDiagnosisSection);
			if (result == null)
				result = caseSection(preoperativeDiagnosisSection);
			if (result == null)
				result = caseAct(preoperativeDiagnosisSection);
			if (result == null)
				result = caseInfrastructureRoot(preoperativeDiagnosisSection);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Mu2consolPackage.MEDICATIONS_ADMINISTERED_SECTION: {
			MedicationsAdministeredSection medicationsAdministeredSection = (MedicationsAdministeredSection) theEObject;
			T result = caseMedicationsAdministeredSection(medicationsAdministeredSection);
			if (result == null)
				result = caseConsol_MedicationsAdministeredSection(medicationsAdministeredSection);
			if (result == null)
				result = caseSection(medicationsAdministeredSection);
			if (result == null)
				result = caseAct(medicationsAdministeredSection);
			if (result == null)
				result = caseInfrastructureRoot(medicationsAdministeredSection);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Mu2consolPackage.HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL: {
			HospitalAdmissionMedicationsSectionEntriesOptional hospitalAdmissionMedicationsSectionEntriesOptional = (HospitalAdmissionMedicationsSectionEntriesOptional) theEObject;
			T result = caseHospitalAdmissionMedicationsSectionEntriesOptional(hospitalAdmissionMedicationsSectionEntriesOptional);
			if (result == null)
				result = caseConsol_HospitalAdmissionMedicationsSectionEntriesOptional(hospitalAdmissionMedicationsSectionEntriesOptional);
			if (result == null)
				result = caseSection(hospitalAdmissionMedicationsSectionEntriesOptional);
			if (result == null)
				result = caseAct(hospitalAdmissionMedicationsSectionEntriesOptional);
			if (result == null)
				result = caseInfrastructureRoot(hospitalAdmissionMedicationsSectionEntriesOptional);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Mu2consolPackage.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION: {
			HospitalDischargeMedicationsSection hospitalDischargeMedicationsSection = (HospitalDischargeMedicationsSection) theEObject;
			T result = caseHospitalDischargeMedicationsSection(hospitalDischargeMedicationsSection);
			if (result == null)
				result = caseConsol_HospitalDischargeMedicationsSection(hospitalDischargeMedicationsSection);
			if (result == null)
				result = caseHospitalDischargeMedicationsSectionEntriesOptional(hospitalDischargeMedicationsSection);
			if (result == null)
				result = caseSection(hospitalDischargeMedicationsSection);
			if (result == null)
				result = caseAct(hospitalDischargeMedicationsSection);
			if (result == null)
				result = caseInfrastructureRoot(hospitalDischargeMedicationsSection);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Mu2consolPackage.ALLERGIES_SECTION_ENTRIES_OPTIONAL: {
			AllergiesSectionEntriesOptional allergiesSectionEntriesOptional = (AllergiesSectionEntriesOptional) theEObject;
			T result = caseAllergiesSectionEntriesOptional(allergiesSectionEntriesOptional);
			if (result == null)
				result = caseConsol_AllergiesSectionEntriesOptional(allergiesSectionEntriesOptional);
			if (result == null)
				result = caseSection(allergiesSectionEntriesOptional);
			if (result == null)
				result = caseAct(allergiesSectionEntriesOptional);
			if (result == null)
				result = caseInfrastructureRoot(allergiesSectionEntriesOptional);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Mu2consolPackage.POSTPROCEDURE_DIAGNOSIS_SECTION: {
			PostprocedureDiagnosisSection postprocedureDiagnosisSection = (PostprocedureDiagnosisSection) theEObject;
			T result = casePostprocedureDiagnosisSection(postprocedureDiagnosisSection);
			if (result == null)
				result = caseConsol_PostprocedureDiagnosisSection(postprocedureDiagnosisSection);
			if (result == null)
				result = caseSection(postprocedureDiagnosisSection);
			if (result == null)
				result = caseAct(postprocedureDiagnosisSection);
			if (result == null)
				result = caseInfrastructureRoot(postprocedureDiagnosisSection);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Mu2consolPackage.VDT_AMBULATORY_PATIENT_INFO: {
			VDTAmbulatoryPatientInfo vdtAmbulatoryPatientInfo = (VDTAmbulatoryPatientInfo) theEObject;
			T result = caseVDTAmbulatoryPatientInfo(vdtAmbulatoryPatientInfo);
			if (result == null)
				result = caseGeneralHeaderConstraints(vdtAmbulatoryPatientInfo);
			if (result == null)
				result = caseClinicalDocument(vdtAmbulatoryPatientInfo);
			if (result == null)
				result = caseAct(vdtAmbulatoryPatientInfo);
			if (result == null)
				result = caseInfrastructureRoot(vdtAmbulatoryPatientInfo);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Mu2consolPackage.CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD: {
			CreateTransmitSummaryOfCareRecord createTransmitSummaryOfCareRecord = (CreateTransmitSummaryOfCareRecord) theEObject;
			T result = caseCreateTransmitSummaryOfCareRecord(createTransmitSummaryOfCareRecord);
			if (result == null)
				result = caseGeneralHeaderConstraints(createTransmitSummaryOfCareRecord);
			if (result == null)
				result = caseClinicalDocument(createTransmitSummaryOfCareRecord);
			if (result == null)
				result = caseAct(createTransmitSummaryOfCareRecord);
			if (result == null)
				result = caseInfrastructureRoot(createTransmitSummaryOfCareRecord);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Mu2consolPackage.VDT_INPATIENT_PATIENT_INFO: {
			VDTInpatientPatientInfo vdtInpatientPatientInfo = (VDTInpatientPatientInfo) theEObject;
			T result = caseVDTInpatientPatientInfo(vdtInpatientPatientInfo);
			if (result == null)
				result = caseGeneralHeaderConstraints(vdtInpatientPatientInfo);
			if (result == null)
				result = caseClinicalDocument(vdtInpatientPatientInfo);
			if (result == null)
				result = caseAct(vdtInpatientPatientInfo);
			if (result == null)
				result = caseInfrastructureRoot(vdtInpatientPatientInfo);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Mu2consolPackage.CLINICAL_OFFICE_VISIT_SUMMARY: {
			ClinicalOfficeVisitSummary clinicalOfficeVisitSummary = (ClinicalOfficeVisitSummary) theEObject;
			T result = caseClinicalOfficeVisitSummary(clinicalOfficeVisitSummary);
			if (result == null)
				result = caseGeneralHeaderConstraints(clinicalOfficeVisitSummary);
			if (result == null)
				result = caseClinicalDocument(clinicalOfficeVisitSummary);
			if (result == null)
				result = caseAct(clinicalOfficeVisitSummary);
			if (result == null)
				result = caseInfrastructureRoot(clinicalOfficeVisitSummary);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Mu2consolPackage.ASSESSMENT_AND_PLAN_FOR_CARE_PLANNING: {
			AssessmentAndPlanForCarePlanning assessmentAndPlanForCarePlanning = (AssessmentAndPlanForCarePlanning) theEObject;
			T result = caseAssessmentAndPlanForCarePlanning(assessmentAndPlanForCarePlanning);
			if (result == null)
				result = caseConsol_AssessmentAndPlanSection(assessmentAndPlanForCarePlanning);
			if (result == null)
				result = caseSection(assessmentAndPlanForCarePlanning);
			if (result == null)
				result = caseAct(assessmentAndPlanForCarePlanning);
			if (result == null)
				result = caseInfrastructureRoot(assessmentAndPlanForCarePlanning);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Mu2consolPackage.ASSESSMENT_AND_PLAN_FOR_CONDITION_OR_CONCERN: {
			AssessmentAndPlanForConditionOrConcern assessmentAndPlanForConditionOrConcern = (AssessmentAndPlanForConditionOrConcern) theEObject;
			T result = caseAssessmentAndPlanForConditionOrConcern(assessmentAndPlanForConditionOrConcern);
			if (result == null)
				result = caseConsol_AssessmentAndPlanSection(assessmentAndPlanForConditionOrConcern);
			if (result == null)
				result = caseSection(assessmentAndPlanForConditionOrConcern);
			if (result == null)
				result = caseAct(assessmentAndPlanForConditionOrConcern);
			if (result == null)
				result = caseInfrastructureRoot(assessmentAndPlanForConditionOrConcern);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>General Header Constraints</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>General Header Constraints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralHeaderConstraints(GeneralHeaderConstraints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Summary Of Care Record</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Summary Of Care Record</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSummaryOfCareRecord(SummaryOfCareRecord object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>VDT Ambulatory Patient Info</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>VDT Ambulatory Patient Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVDTAmbulatoryPatientInfo(VDTAmbulatoryPatientInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Clinical Office Visit Summary</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Clinical Office Visit Summary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClinicalOfficeVisitSummary(ClinicalOfficeVisitSummary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Assessment And Plan For Care Planning</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Assessment And Plan For Care Planning</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssessmentAndPlanForCarePlanning(
			AssessmentAndPlanForCarePlanning object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Plan Of Care Section</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Plan Of Care Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanOfCareSection(PlanOfCareSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Assessment And Plan For Condition Or Concern</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null
	 * result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Assessment And Plan For Condition Or Concern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssessmentAndPlanForConditionOrConcern(
			AssessmentAndPlanForConditionOrConcern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Assessment And Plan Section</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Assessment And Plan Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssessmentAndPlanSection(AssessmentAndPlanSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Instructions Section</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Instructions Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstructionsSection(InstructionsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Hospital Admission Diagnosis Section</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Hospital Admission Diagnosis Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHospitalAdmissionDiagnosisSection(
			HospitalAdmissionDiagnosisSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Hospital Discharge Diagnosis Section</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Hospital Discharge Diagnosis Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHospitalDischargeDiagnosisSection(
			HospitalDischargeDiagnosisSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Postoperative Diagnosis Section</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Postoperative Diagnosis Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostoperativeDiagnosisSection(
			PostoperativeDiagnosisSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Postprocedure Diagnosis Section</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Postprocedure Diagnosis Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostprocedureDiagnosisSection(
			PostprocedureDiagnosisSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Encounters Section</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Encounters Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncountersSection(EncountersSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Preoperative Diagnosis Section</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Preoperative Diagnosis Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreoperativeDiagnosisSection(
			PreoperativeDiagnosisSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Medications Administered Section</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Medications Administered Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationsAdministeredSection(
			MedicationsAdministeredSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Hospital Admission Medications Section Entries Optional</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null
	 * result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Hospital Admission Medications Section Entries Optional</em>
	 *         '.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHospitalAdmissionMedicationsSectionEntriesOptional(
			HospitalAdmissionMedicationsSectionEntriesOptional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Hospital Discharge Medications Section</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Hospital Discharge Medications Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHospitalDischargeMedicationsSection(
			HospitalDischargeMedicationsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Allergies Section Entries Optional</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Allergies Section Entries Optional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllergiesSectionEntriesOptional(
			AllergiesSectionEntriesOptional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>VDT Inpatient Patient Info</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>VDT Inpatient Patient Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVDTInpatientPatientInfo(VDTInpatientPatientInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Create Transmit Summary Of Care Record</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Create Transmit Summary Of Care Record</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateTransmitSummaryOfCareRecord(
			CreateTransmitSummaryOfCareRecord object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Infrastructure Root</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Infrastructure Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfrastructureRoot(InfrastructureRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Act</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAct(Act object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Clinical Document</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Clinical Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClinicalDocument(ClinicalDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Section</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSection(Section object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Assessment And Plan Section</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Assessment And Plan Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsol_AssessmentAndPlanSection(
			org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Plan Of Care Section</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Plan Of Care Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsol_PlanOfCareSection(
			org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Assessment Section</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Assessment Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssessmentSection(AssessmentSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Instructions Section</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Instructions Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsol_InstructionsSection(
			org.openhealthtools.mdht.uml.cda.consol.InstructionsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Assessment Section</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Assessment Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsol_AssessmentSection(
			org.openhealthtools.mdht.uml.cda.consol.AssessmentSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Hospital Admission Diagnosis Section</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Hospital Admission Diagnosis Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsol_HospitalAdmissionDiagnosisSection(
			org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosisSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Hospital Discharge Diagnosis Section</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Hospital Discharge Diagnosis Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsol_HospitalDischargeDiagnosisSection(
			org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosisSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Postoperative Diagnosis Section</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Postoperative Diagnosis Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsol_PostoperativeDiagnosisSection(
			org.openhealthtools.mdht.uml.cda.consol.PostoperativeDiagnosisSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Postprocedure Diagnosis Section</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Postprocedure Diagnosis Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsol_PostprocedureDiagnosisSection(
			org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosisSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Encounters Section Entries Optional</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Encounters Section Entries Optional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncountersSectionEntriesOptional(
			EncountersSectionEntriesOptional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Encounters Section</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Encounters Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsol_EncountersSection(
			org.openhealthtools.mdht.uml.cda.consol.EncountersSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Preoperative Diagnosis Section</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Preoperative Diagnosis Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsol_PreoperativeDiagnosisSection(
			org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosisSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Medications Administered Section</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Medications Administered Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsol_MedicationsAdministeredSection(
			org.openhealthtools.mdht.uml.cda.consol.MedicationsAdministeredSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Hospital Admission Medications Section Entries Optional</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null
	 * result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Hospital Admission Medications Section Entries Optional</em>
	 *         '.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsol_HospitalAdmissionMedicationsSectionEntriesOptional(
			org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionMedicationsSectionEntriesOptional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Hospital Discharge Medications Section Entries Optional</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null
	 * result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Hospital Discharge Medications Section Entries Optional</em>
	 *         '.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHospitalDischargeMedicationsSectionEntriesOptional(
			HospitalDischargeMedicationsSectionEntriesOptional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Hospital Discharge Medications Section</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Hospital Discharge Medications Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsol_HospitalDischargeMedicationsSection(
			org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Allergies Section Entries Optional</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Allergies Section Entries Optional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsol_AllergiesSectionEntriesOptional(
			org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>EObject</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch, but this is
	 * the last case anyway. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} // Mu2consolSwitch
