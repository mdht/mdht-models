/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.AdmissionMedicationHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesReactionsSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.DiagnosticResultsSection;
import org.openhealthtools.mdht.uml.cda.consol.DischargeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.DischargeDiet;
import org.openhealthtools.mdht.uml.cda.consol.DischargeSummary;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllness;
import org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalCourseSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsAdministeredSection;
import org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemListSection;
import org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalDocumentOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Discharge Summary</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryPersonHasName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Person Has Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryRolesShallHaveAddrAndTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Roles Shall Have Addr And Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryRolesShouldHaveAddrAndTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Roles Should Have Addr And Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryOrganizationsHaveContactInfo(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Organizations Have Contact Info</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryTimePreciseToDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Time Precise To Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryTimePreciseToYear(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Time Precise To Year</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryTelephoneMatchesRegex(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Telephone Matches Regex</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryHasTelephoneDialingDigits(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Has Telephone Dialing Digits</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryUnknownTelephoneUsesNullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Unknown Telephone Uses Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryTypeIdExtension(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Type Id Extension</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryIdRootFormat(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Id Root Format</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryOidLength(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Oid Length</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryLanguageCodeForm(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Language Code Form</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummarySetIdAndVersionNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Set Id And Version Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummarySetIdAndIdAreUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Set Id And Id Are Unique</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryCopyTimeNotPresent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Copy Time Not Present</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryHasRecordTargetPatientRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Has Record Target Patient Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryHasPatientBirthTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Has Patient Birth Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryHasAdministrativeGenderCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Has Administrative Gender Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryHasProviderOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Has Provider Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryHasAuthorTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Has Author Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryHasAssignedAuthorId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Has Assigned Author Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryHasAssignedAuthorPersonOrDevice(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Has Assigned Author Person Or Device</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryHasDataEntererAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Has Data Enterer Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryHasDataEntererTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Has Data Enterer Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryHasInformant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Has Informant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryHasInformantAssignedPersonOrRelatedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Has Informant Assigned Person Or Related Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryLegalAuthenticatorHasAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Legal Authenticator Has Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryAuthenticatorHasAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Authenticator Has Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryTimePreciseToSecond(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Time Precise To Second</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryTimePreciseToYearAndDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Time Precise To Year And Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryMedicalSummaryProblemConcernEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Medical Summary Problem Concern Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryMedicalSummaryAllergyConcernEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Medical Summary Allergy Concern Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryMedicalSummaryMedications(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Medical Summary Medications</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryRealmCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryTypeId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryLanguageCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Language Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryProblemListSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Problem List Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryAdmissionMedicationHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Admission Medication History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryHospitalAdmissionDiagnosisSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Admission Diagnosis Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryAdvanceDirectivesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Advance Directives Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryAllergiesReactionsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Allergies Reactions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryDischargeDiagnosisSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Discharge Diagnosis Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryDischargeDiet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Discharge Diet</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryHospitalDischargeMedicationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Discharge Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryDiagnosticResultsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Diagnostic Results Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryFunctionalStatusSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Functional Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryHistoryOfPresentIllness(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary History Of Present Illness</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryHospitalCourseSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Course Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryMedicalEquipmentSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Medical Equipment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryPhysicalExamSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Physical Exam Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryPlanOfCareSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryHistoryOfPastIllnessSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary History Of Past Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryReviewOfSystemsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryMedicationsAdministeredSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Medications Administered Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryVitalSignsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getProblemListSection() <em>Get Problem List Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getAdmissionMedicationHistorySection() <em>Get Admission Medication History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getHospitalAdmissionDiagnosisSection() <em>Get Hospital Admission Diagnosis Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getAdvanceDirectivesSection() <em>Get Advance Directives Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getAllergiesReactionsSection() <em>Get Allergies Reactions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getDischargeDiagnosisSection() <em>Get Discharge Diagnosis Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getDischargeDiet() <em>Get Discharge Diet</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getHospitalDischargeMedicationsSection() <em>Get Hospital Discharge Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getDiagnosticResultsSection() <em>Get Diagnostic Results Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getFunctionalStatusSection() <em>Get Functional Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getHistoryOfPresentIllness() <em>Get History Of Present Illness</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getHospitalCourseSection() <em>Get Hospital Course Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getMedicalEquipmentSection() <em>Get Medical Equipment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getPhysicalExamSection() <em>Get Physical Exam Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getPlanOfCareSection() <em>Get Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getHistoryOfPastIllnessSection() <em>Get History Of Past Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getReviewOfSystemsSection() <em>Get Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getMedicationsAdministeredSection() <em>Get Medications Administered Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getVitalSignsSection() <em>Get Vital Signs Section</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DischargeSummaryOperations extends ClinicalDocumentOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DischargeSummaryOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryPersonHasName(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Person Has Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryPersonHasName(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_PERSON_HAS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryPersonHasName(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Person Has Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryPersonHasName(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_PERSON_HAS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeSummaryPersonHasName(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_SUMMARY_PERSON_HAS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_PERSON_HAS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_PERSON_HAS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_PERSON_HAS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_PERSON_HAS_NAME,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryPersonHasName"), new Object[] { dischargeSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryRolesShallHaveAddrAndTelecom(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Roles Shall Have Addr And Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryRolesShallHaveAddrAndTelecom(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_ROLES_SHALL_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryRolesShallHaveAddrAndTelecom(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Roles Shall Have Addr And Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryRolesShallHaveAddrAndTelecom(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_ROLES_SHALL_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeSummaryRolesShallHaveAddrAndTelecom(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_SUMMARY_ROLES_SHALL_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_ROLES_SHALL_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_ROLES_SHALL_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_DISCHARGE_SUMMARY_ROLES_SHALL_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_ROLES_SHALL_HAVE_ADDR_AND_TELECOM,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryRolesShallHaveAddrAndTelecom"),
					new Object[] { dischargeSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryRolesShouldHaveAddrAndTelecom(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Roles Should Have Addr And Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryRolesShouldHaveAddrAndTelecom(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_ROLES_SHOULD_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryRolesShouldHaveAddrAndTelecom(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Roles Should Have Addr And Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryRolesShouldHaveAddrAndTelecom(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_ROLES_SHOULD_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeSummaryRolesShouldHaveAddrAndTelecom(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_SUMMARY_ROLES_SHOULD_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_ROLES_SHOULD_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_ROLES_SHOULD_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_DISCHARGE_SUMMARY_ROLES_SHOULD_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_ROLES_SHOULD_HAVE_ADDR_AND_TELECOM,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryRolesShouldHaveAddrAndTelecom"),
					new Object[] { dischargeSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryOrganizationsHaveContactInfo(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Organizations Have Contact Info</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryOrganizationsHaveContactInfo(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_ORGANIZATIONS_HAVE_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryOrganizationsHaveContactInfo(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Organizations Have Contact Info</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryOrganizationsHaveContactInfo(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_ORGANIZATIONS_HAVE_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeSummaryOrganizationsHaveContactInfo(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_SUMMARY_ORGANIZATIONS_HAVE_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_ORGANIZATIONS_HAVE_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_ORGANIZATIONS_HAVE_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_DISCHARGE_SUMMARY_ORGANIZATIONS_HAVE_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_ORGANIZATIONS_HAVE_CONTACT_INFO,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryOrganizationsHaveContactInfo"),
					new Object[] { dischargeSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryTimePreciseToDay(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Time Precise To Day</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryTimePreciseToDay(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryTimePreciseToDay(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Time Precise To Day</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryTimePreciseToDay(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeSummaryTimePreciseToDay(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_SUMMARY_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_TIME_PRECISE_TO_DAY,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryTimePreciseToDay"),
					new Object[] { dischargeSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryTimePreciseToYear(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Time Precise To Year</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryTimePreciseToYear(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "cda::OrganizationPartOf.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject)-> union(  cda::MaintainedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union( cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::ServiceEvent.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::EncounterParticipant.allInstances()->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(self.participant->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(cda::OrganizationPartOf.allInstances().effectiveTime->union(cda::MaintainedEntity.allInstances().effectiveTime)->union( cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::ServiceEvent.allInstances().effectiveTime)->union(cda::EncounterParticipant.allInstances().time)->union(self.participant.time)->select(current : datatypes::IVL_TS  |  ((not current.low.oclIsUndefined()) and (current.low.value.oclIsUndefined() or current.low.value.size() < 4)) or ((not current.center.oclIsUndefined()) and (current.center.value.oclIsUndefined() or current.center.value.size() < 4)) or ((not current.high.oclIsUndefined()) and (current.high.value.oclIsUndefined() or current.high.value.size() < 4)) or (current.low.oclIsUndefined() and current.center.oclIsUndefined() and current.high.oclIsUndefined()) ).oclAsType( ecore::EObject))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryTimePreciseToYear(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Time Precise To Year</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryTimePreciseToYear(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::OrganizationPartOf.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject)-> union(  cda::MaintainedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union( cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::ServiceEvent.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::EncounterParticipant.allInstances()->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(self.participant->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(cda::OrganizationPartOf.allInstances().effectiveTime->union(cda::MaintainedEntity.allInstances().effectiveTime)->union( cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::ServiceEvent.allInstances().effectiveTime)->union(cda::EncounterParticipant.allInstances().time)->union(self.participant.time)->select(current : datatypes::IVL_TS  |  ((not current.low.oclIsUndefined()) and (current.low.value.oclIsUndefined() or current.low.value.size() < 4)) or ((not current.center.oclIsUndefined()) and (current.center.value.oclIsUndefined() or current.center.value.size() < 4)) or ((not current.high.oclIsUndefined()) and (current.high.value.oclIsUndefined() or current.high.value.size() < 4)) or (current.low.oclIsUndefined() and current.center.oclIsUndefined() and current.high.oclIsUndefined()) ).oclAsType( ecore::EObject))
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeSummaryTimePreciseToYear(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_SUMMARY_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_TIME_PRECISE_TO_YEAR,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryTimePreciseToYear"),
					new Object[] { dischargeSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryTelephoneMatchesRegex(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Telephone Matches Regex</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryTelephoneMatchesRegex(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_TELEPHONE_MATCHES_REGEX__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryTelephoneMatchesRegex(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Telephone Matches Regex</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryTelephoneMatchesRegex(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_TELEPHONE_MATCHES_REGEX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeSummaryTelephoneMatchesRegex(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_SUMMARY_TELEPHONE_MATCHES_REGEX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_TELEPHONE_MATCHES_REGEX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_TELEPHONE_MATCHES_REGEX__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_TELEPHONE_MATCHES_REGEX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_TELEPHONE_MATCHES_REGEX,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryTelephoneMatchesRegex"),
					new Object[] { dischargeSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryHasTelephoneDialingDigits(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Has Telephone Dialing Digits</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryHasTelephoneDialingDigits(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_HAS_TELEPHONE_DIALING_DIGITS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryHasTelephoneDialingDigits(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Has Telephone Dialing Digits</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryHasTelephoneDialingDigits(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_HAS_TELEPHONE_DIALING_DIGITS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeSummaryHasTelephoneDialingDigits(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_SUMMARY_HAS_TELEPHONE_DIALING_DIGITS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_HAS_TELEPHONE_DIALING_DIGITS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_HAS_TELEPHONE_DIALING_DIGITS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_DISCHARGE_SUMMARY_HAS_TELEPHONE_DIALING_DIGITS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_HAS_TELEPHONE_DIALING_DIGITS,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryHasTelephoneDialingDigits"),
					new Object[] { dischargeSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryUnknownTelephoneUsesNullFlavor(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Unknown Telephone Uses Null Flavor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryUnknownTelephoneUsesNullFlavor(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_UNKNOWN_TELEPHONE_USES_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryUnknownTelephoneUsesNullFlavor(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Unknown Telephone Uses Null Flavor</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryUnknownTelephoneUsesNullFlavor(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_UNKNOWN_TELEPHONE_USES_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeSummaryUnknownTelephoneUsesNullFlavor(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_SUMMARY_UNKNOWN_TELEPHONE_USES_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_UNKNOWN_TELEPHONE_USES_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_UNKNOWN_TELEPHONE_USES_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_DISCHARGE_SUMMARY_UNKNOWN_TELEPHONE_USES_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_UNKNOWN_TELEPHONE_USES_NULL_FLAVOR,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryUnknownTelephoneUsesNullFlavor"),
					new Object[] { dischargeSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryTypeIdExtension(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Type Id Extension</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryTypeIdExtension(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.typeId.extension = 'POCD_HD000040'";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryTypeIdExtension(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Type Id Extension</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryTypeIdExtension(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.typeId.extension = 'POCD_HD000040'
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeSummaryTypeIdExtension(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_SUMMARY_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_TYPE_ID_EXTENSION,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryTypeIdExtension"),
					new Object[] { dischargeSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryIdRootFormat(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Id Root Format</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryIdRootFormat(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_ID_ROOT_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.id.matches('root','([0-2])(.([1-9][0-9]*|0))+') or self.id.matches('root','([A-Fa-f0-9]{8})(\\\\-[A-Fa-f0-9]{4}){3}(\\\\-[A-Fa-f0-9]{12})')";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryIdRootFormat(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Id Root Format</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryIdRootFormat(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_ID_ROOT_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.id.matches('root','([0-2])(.([1-9][0-9]*|0))+') or self.id.matches('root','([A-Fa-f0-9]{8})(\\\\-[A-Fa-f0-9]{4}){3}(\\\\-[A-Fa-f0-9]{12})')
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeSummaryIdRootFormat(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_SUMMARY_ID_ROOT_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_ID_ROOT_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_ID_ROOT_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_ID_ROOT_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_ID_ROOT_FORMAT,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryIdRootFormat"), new Object[] { dischargeSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryOidLength(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Oid Length</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryOidLength(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_OID_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.id->select((not id.root.oclIsUndefined()) and id.root.size() > 64 )";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryOidLength(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Oid Length</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryOidLength(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_OID_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.id->select((not id.root.oclIsUndefined()) and id.root.size() > 64 )
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeSummaryOidLength(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_SUMMARY_OID_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_OID_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_OID_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_OID_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_OID_LENGTH,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryOidLength"), new Object[] { dischargeSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryLanguageCodeForm(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Language Code Form</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryLanguageCodeForm(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_LANGUAGE_CODE_FORM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.languageCode.matches('code','(([a-z]{2})(\\\\-[A-Z]{2})?)')";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryLanguageCodeForm(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Language Code Form</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryLanguageCodeForm(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_LANGUAGE_CODE_FORM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.languageCode.matches('code','(([a-z]{2})(\\\\-[A-Z]{2})?)')
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeSummaryLanguageCodeForm(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_SUMMARY_LANGUAGE_CODE_FORM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_LANGUAGE_CODE_FORM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_LANGUAGE_CODE_FORM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_LANGUAGE_CODE_FORM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_LANGUAGE_CODE_FORM,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryLanguageCodeForm"),
					new Object[] { dischargeSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummarySetIdAndVersionNumber(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Set Id And Version Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummarySetIdAndVersionNumber(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_SET_ID_AND_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.setId.oclIsUndefined() and self.versionNumber.oclIsUndefined())"
			+ "   xor (not self.setId.oclIsUndefined() and not self.versionNumber.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummarySetIdAndVersionNumber(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Set Id And Version Number</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummarySetIdAndVersionNumber(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_SET_ID_AND_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.setId.oclIsUndefined() and self.versionNumber.oclIsUndefined())
	 *    xor (not self.setId.oclIsUndefined() and not self.versionNumber.oclIsUndefined())
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeSummarySetIdAndVersionNumber(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_SUMMARY_SET_ID_AND_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_SET_ID_AND_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_SET_ID_AND_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_SET_ID_AND_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_SET_ID_AND_VERSION_NUMBER,
					ConsolPlugin.INSTANCE.getString("DischargeSummarySetIdAndVersionNumber"),
					new Object[] { dischargeSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummarySetIdAndIdAreUnique(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Set Id And Id Are Unique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummarySetIdAndIdAreUnique(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_SET_ID_AND_ID_ARE_UNIQUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(not self.setId.oclIsUndefined() and not self.id.oclIsUndefined())"
			+ "   implies (self.setId.root <> self.id.root or self.setId.extension <> self.id.extension)";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummarySetIdAndIdAreUnique(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Set Id And Id Are Unique</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummarySetIdAndIdAreUnique(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_SET_ID_AND_ID_ARE_UNIQUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (not self.setId.oclIsUndefined() and not self.id.oclIsUndefined())
	 *    implies (self.setId.root <> self.id.root or self.setId.extension <> self.id.extension)
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeSummarySetIdAndIdAreUnique(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_SUMMARY_SET_ID_AND_ID_ARE_UNIQUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_SET_ID_AND_ID_ARE_UNIQUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_SET_ID_AND_ID_ARE_UNIQUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_SET_ID_AND_ID_ARE_UNIQUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_SET_ID_AND_ID_ARE_UNIQUE,
					ConsolPlugin.INSTANCE.getString("DischargeSummarySetIdAndIdAreUnique"),
					new Object[] { dischargeSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryCopyTimeNotPresent(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Copy Time Not Present</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryCopyTimeNotPresent(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COPY_TIME_NOT_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.copyTime.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryCopyTimeNotPresent(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Copy Time Not Present</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryCopyTimeNotPresent(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_COPY_TIME_NOT_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.copyTime.oclIsUndefined()
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeSummaryCopyTimeNotPresent(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_SUMMARY_COPY_TIME_NOT_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_COPY_TIME_NOT_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_COPY_TIME_NOT_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_COPY_TIME_NOT_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COPY_TIME_NOT_PRESENT,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryCopyTimeNotPresent"),
					new Object[] { dischargeSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryHasRecordTargetPatientRole(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Has Record Target Patient Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryHasRecordTargetPatientRole(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_HAS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->size() > 0 and self.recordTarget->exists(target : cda::RecordTarget | not target.patientRole.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryHasRecordTargetPatientRole(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Has Record Target Patient Role</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryHasRecordTargetPatientRole(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_HAS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->size() > 0 and self.recordTarget->exists(target : cda::RecordTarget | not target.patientRole.oclIsUndefined())
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeSummaryHasRecordTargetPatientRole(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_SUMMARY_HAS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_HAS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_HAS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_DISCHARGE_SUMMARY_HAS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_HAS_RECORD_TARGET_PATIENT_ROLE,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryHasRecordTargetPatientRole"),
					new Object[] { dischargeSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryHasPatientBirthTime(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Has Patient Birth Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryHasPatientBirthTime(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_HAS_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->forAll(target : cda::RecordTarget | not target.patientRole.oclIsUndefined()"
			+ "   implies (not target.patientRole.patient.birthTime.value.oclIsUndefined()"
			+ "      or not target.patientRole.patient.birthTime.nullFlavor.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryHasPatientBirthTime(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Has Patient Birth Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryHasPatientBirthTime(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_HAS_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->forAll(target : cda::RecordTarget | not target.patientRole.oclIsUndefined()
	 *    implies (not target.patientRole.patient.birthTime.value.oclIsUndefined()
	 *       or not target.patientRole.patient.birthTime.nullFlavor.oclIsUndefined()))
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeSummaryHasPatientBirthTime(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_SUMMARY_HAS_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_HAS_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_HAS_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_HAS_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_HAS_PATIENT_BIRTH_TIME,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryHasPatientBirthTime"),
					new Object[] { dischargeSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryHasAdministrativeGenderCode(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Has Administrative Gender Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryHasAdministrativeGenderCode(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_HAS_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->forAll(target : cda::RecordTarget | not target.patientRole.oclIsUndefined()"
			+ "   implies (not target.patientRole.patient.administrativeGenderCode.code.oclIsUndefined()"
			+ "      or not target.patientRole.patient.administrativeGenderCode.nullFlavor.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryHasAdministrativeGenderCode(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Has Administrative Gender Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryHasAdministrativeGenderCode(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_HAS_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->forAll(target : cda::RecordTarget | not target.patientRole.oclIsUndefined()
	 *    implies (not target.patientRole.patient.administrativeGenderCode.code.oclIsUndefined()
	 *       or not target.patientRole.patient.administrativeGenderCode.nullFlavor.oclIsUndefined()))
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeSummaryHasAdministrativeGenderCode(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_SUMMARY_HAS_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_HAS_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_HAS_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_DISCHARGE_SUMMARY_HAS_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_HAS_ADMINISTRATIVE_GENDER_CODE,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryHasAdministrativeGenderCode"),
					new Object[] { dischargeSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryHasProviderOrganization(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Has Provider Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryHasProviderOrganization(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_HAS_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->exists(target : cda::RecordTarget | not target.patientRole.providerOrganization.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryHasProviderOrganization(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Has Provider Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryHasProviderOrganization(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_HAS_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->exists(target : cda::RecordTarget | not target.patientRole.providerOrganization.oclIsUndefined())
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeSummaryHasProviderOrganization(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_SUMMARY_HAS_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_HAS_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_HAS_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_HAS_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_HAS_PROVIDER_ORGANIZATION,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryHasProviderOrganization"),
					new Object[] { dischargeSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryHasAuthorTime(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Has Author Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryHasAuthorTime(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->forAll(author : cda::Author | not author.time.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryHasAuthorTime(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Has Author Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryHasAuthorTime(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.author->forAll(author : cda::Author | not author.time.oclIsUndefined())
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeSummaryHasAuthorTime(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_SUMMARY_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_HAS_AUTHOR_TIME,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryHasAuthorTime"), new Object[] { dischargeSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryHasAssignedAuthorId(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Has Assigned Author Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryHasAssignedAuthorId(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->forAll(author : cda::Author | author.assignedAuthor.id->size() > 0)";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryHasAssignedAuthorId(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Has Assigned Author Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryHasAssignedAuthorId(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.author->forAll(author : cda::Author | author.assignedAuthor.id->size() > 0)
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeSummaryHasAssignedAuthorId(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_SUMMARY_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_HAS_ASSIGNED_AUTHOR_ID,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryHasAssignedAuthorId"),
					new Object[] { dischargeSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryHasAssignedAuthorPersonOrDevice(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Has Assigned Author Person Or Device</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryHasAssignedAuthorPersonOrDevice(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->forAll(author : cda::Author | not author.assignedAuthor.assignedPerson.oclIsUndefined() "
			+ "   or not author.assignedAuthor.assignedAuthoringDevice.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryHasAssignedAuthorPersonOrDevice(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Has Assigned Author Person Or Device</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryHasAssignedAuthorPersonOrDevice(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.author->forAll(author : cda::Author | not author.assignedAuthor.assignedPerson.oclIsUndefined() 
	 *    or not author.assignedAuthor.assignedAuthoringDevice.oclIsUndefined())
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeSummaryHasAssignedAuthorPersonOrDevice(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_SUMMARY_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_DISCHARGE_SUMMARY_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryHasAssignedAuthorPersonOrDevice"),
					new Object[] { dischargeSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryHasDataEntererAssignedPerson(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Has Data Enterer Assigned Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryHasDataEntererAssignedPerson(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_HAS_DATA_ENTERER_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.dataEnterer.oclIsUndefined() implies not self.dataEnterer.assignedEntity.assignedPerson.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryHasDataEntererAssignedPerson(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Has Data Enterer Assigned Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryHasDataEntererAssignedPerson(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_HAS_DATA_ENTERER_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.dataEnterer.oclIsUndefined() implies not self.dataEnterer.assignedEntity.assignedPerson.oclIsUndefined()
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeSummaryHasDataEntererAssignedPerson(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_SUMMARY_HAS_DATA_ENTERER_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_HAS_DATA_ENTERER_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_HAS_DATA_ENTERER_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_DISCHARGE_SUMMARY_HAS_DATA_ENTERER_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_HAS_DATA_ENTERER_ASSIGNED_PERSON,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryHasDataEntererAssignedPerson"),
					new Object[] { dischargeSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryHasDataEntererTime(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Has Data Enterer Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryHasDataEntererTime(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_HAS_DATA_ENTERER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.dataEnterer.oclIsUndefined() implies not self.dataEnterer.time.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryHasDataEntererTime(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Has Data Enterer Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryHasDataEntererTime(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_HAS_DATA_ENTERER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.dataEnterer.oclIsUndefined() implies not self.dataEnterer.time.oclIsUndefined()
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeSummaryHasDataEntererTime(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_SUMMARY_HAS_DATA_ENTERER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_HAS_DATA_ENTERER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_HAS_DATA_ENTERER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_HAS_DATA_ENTERER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_HAS_DATA_ENTERER_TIME,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryHasDataEntererTime"),
					new Object[] { dischargeSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryHasInformant(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Has Informant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryHasInformant(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_HAS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->size() > 0";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryHasInformant(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Has Informant</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryHasInformant(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_HAS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.informant->size() > 0
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeSummaryHasInformant(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_SUMMARY_HAS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_HAS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_HAS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_HAS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_HAS_INFORMANT,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryHasInformant"), new Object[] { dischargeSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryHasInformantAssignedPersonOrRelatedPerson(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Has Informant Assigned Person Or Related Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryHasInformantAssignedPersonOrRelatedPerson(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->forAll(i : cda::Informant12 | not i.assignedEntity.assignedPerson.oclIsUndefined()"
			+ "   or not i.relatedEntity.relatedPerson.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryHasInformantAssignedPersonOrRelatedPerson(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Has Informant Assigned Person Or Related Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryHasInformantAssignedPersonOrRelatedPerson(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.informant->forAll(i : cda::Informant12 | not i.assignedEntity.assignedPerson.oclIsUndefined()
	 *    or not i.relatedEntity.relatedPerson.oclIsUndefined())
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeSummaryHasInformantAssignedPersonOrRelatedPerson(
			DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_SUMMARY_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_DISCHARGE_SUMMARY_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryHasInformantAssignedPersonOrRelatedPerson"),
					new Object[] { dischargeSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryLegalAuthenticatorHasAssignedPerson(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Legal Authenticator Has Assigned Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryLegalAuthenticatorHasAssignedPerson(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.legalAuthenticator.oclIsUndefined() implies not self.legalAuthenticator.assignedEntity.assignedPerson.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryLegalAuthenticatorHasAssignedPerson(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Legal Authenticator Has Assigned Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryLegalAuthenticatorHasAssignedPerson(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.legalAuthenticator.oclIsUndefined() implies not self.legalAuthenticator.assignedEntity.assignedPerson.oclIsUndefined()
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeSummaryLegalAuthenticatorHasAssignedPerson(
			DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_SUMMARY_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_DISCHARGE_SUMMARY_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryLegalAuthenticatorHasAssignedPerson"),
					new Object[] { dischargeSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryAuthenticatorHasAssignedPerson(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Authenticator Has Assigned Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryAuthenticatorHasAssignedPerson(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authenticator->forAll(auth : cda::Authenticator | auth.assignedEntity->forAll(entity : cda::AssignedEntity |"
			+ "   not entity.assignedPerson.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryAuthenticatorHasAssignedPerson(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Authenticator Has Assigned Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryAuthenticatorHasAssignedPerson(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.authenticator->forAll(auth : cda::Authenticator | auth.assignedEntity->forAll(entity : cda::AssignedEntity |
	 *    not entity.assignedPerson.oclIsUndefined()))
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeSummaryAuthenticatorHasAssignedPerson(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_SUMMARY_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_DISCHARGE_SUMMARY_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_AUTHENTICATOR_HAS_ASSIGNED_PERSON,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryAuthenticatorHasAssignedPerson"),
					new Object[] { dischargeSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryTimePreciseToSecond(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Time Precise To Second</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryTimePreciseToSecond(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_TIME_PRECISE_TO_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryTimePreciseToSecond(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Time Precise To Second</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryTimePreciseToSecond(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_TIME_PRECISE_TO_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeSummaryTimePreciseToSecond(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_SUMMARY_TIME_PRECISE_TO_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_TIME_PRECISE_TO_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_TIME_PRECISE_TO_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_TIME_PRECISE_TO_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_TIME_PRECISE_TO_SECOND,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryTimePreciseToSecond"),
					new Object[] { dischargeSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryTimePreciseToYearAndDay(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Time Precise To Year And Day</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryTimePreciseToYearAndDay(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_TIME_PRECISE_TO_YEAR_AND_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "cda::OrganizationPartOf.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject)-> union(  cda::MaintainedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union( cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::ServiceEvent.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::EncounterParticipant.allInstances()->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(self.participant->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(cda::OrganizationPartOf.allInstances().effectiveTime->union(cda::MaintainedEntity.allInstances().effectiveTime)->union( cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::ServiceEvent.allInstances().effectiveTime)->union(cda::EncounterParticipant.allInstances().time)->union(self.participant.time)->select(current : datatypes::IVL_TS  |  ((not current.low.oclIsUndefined()) and (current.low.value.oclIsUndefined() or current.low.value.size() < 8)) or ((not current.center.oclIsUndefined()) and (current.center.value.oclIsUndefined() or current.center.value.size() < 8)) or ((not current.high.oclIsUndefined()) and (current.high.value.oclIsUndefined() or current.high.value.size() < 8)) or (current.low.oclIsUndefined() and current.center.oclIsUndefined() and current.high.oclIsUndefined()) ).oclAsType( ecore::EObject))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryTimePreciseToYearAndDay(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Time Precise To Year And Day</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryTimePreciseToYearAndDay(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_TIME_PRECISE_TO_YEAR_AND_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::OrganizationPartOf.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject)-> union(  cda::MaintainedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union( cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::ServiceEvent.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::EncounterParticipant.allInstances()->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(self.participant->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(cda::OrganizationPartOf.allInstances().effectiveTime->union(cda::MaintainedEntity.allInstances().effectiveTime)->union( cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::ServiceEvent.allInstances().effectiveTime)->union(cda::EncounterParticipant.allInstances().time)->union(self.participant.time)->select(current : datatypes::IVL_TS  |  ((not current.low.oclIsUndefined()) and (current.low.value.oclIsUndefined() or current.low.value.size() < 8)) or ((not current.center.oclIsUndefined()) and (current.center.value.oclIsUndefined() or current.center.value.size() < 8)) or ((not current.high.oclIsUndefined()) and (current.high.value.oclIsUndefined() or current.high.value.size() < 8)) or (current.low.oclIsUndefined() and current.center.oclIsUndefined() and current.high.oclIsUndefined()) ).oclAsType( ecore::EObject))
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeSummaryTimePreciseToYearAndDay(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_SUMMARY_TIME_PRECISE_TO_YEAR_AND_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_TIME_PRECISE_TO_YEAR_AND_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_TIME_PRECISE_TO_YEAR_AND_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_DISCHARGE_SUMMARY_TIME_PRECISE_TO_YEAR_AND_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_TIME_PRECISE_TO_YEAR_AND_DAY,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryTimePreciseToYearAndDay"),
					new Object[] { dischargeSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryMedicalSummaryProblemConcernEntry(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Medical Summary Problem Concern Entry</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryMedicalSummaryProblemConcernEntry(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_MEDICAL_SUMMARY_PROBLEM_CONCERN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getSections()->exists(sect : cda::Section | sect.getActs()->exists(act : cda::Act | act.oclIsKindOf(ihe::ProblemConcernEntry)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryMedicalSummaryProblemConcernEntry(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Medical Summary Problem Concern Entry</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryMedicalSummaryProblemConcernEntry(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_MEDICAL_SUMMARY_PROBLEM_CONCERN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSections()->exists(sect : cda::Section | sect.getActs()->exists(act : cda::Act | act.oclIsKindOf(ihe::ProblemConcernEntry)))
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeSummaryMedicalSummaryProblemConcernEntry(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_SUMMARY_MEDICAL_SUMMARY_PROBLEM_CONCERN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_MEDICAL_SUMMARY_PROBLEM_CONCERN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_MEDICAL_SUMMARY_PROBLEM_CONCERN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_DISCHARGE_SUMMARY_MEDICAL_SUMMARY_PROBLEM_CONCERN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_MEDICAL_SUMMARY_PROBLEM_CONCERN_ENTRY,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryMedicalSummaryProblemConcernEntry"),
					new Object[] { dischargeSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryMedicalSummaryAllergyConcernEntry(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Medical Summary Allergy Concern Entry</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryMedicalSummaryAllergyConcernEntry(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_MEDICAL_SUMMARY_ALLERGY_CONCERN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getSections()->exists(sect : cda::Section | sect.getActs()->exists(act : cda::Act | act.oclIsKindOf(ihe::AllergyIntoleranceConcern)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryMedicalSummaryAllergyConcernEntry(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Medical Summary Allergy Concern Entry</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryMedicalSummaryAllergyConcernEntry(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_MEDICAL_SUMMARY_ALLERGY_CONCERN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSections()->exists(sect : cda::Section | sect.getActs()->exists(act : cda::Act | act.oclIsKindOf(ihe::AllergyIntoleranceConcern)))
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeSummaryMedicalSummaryAllergyConcernEntry(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_SUMMARY_MEDICAL_SUMMARY_ALLERGY_CONCERN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_MEDICAL_SUMMARY_ALLERGY_CONCERN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_MEDICAL_SUMMARY_ALLERGY_CONCERN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_DISCHARGE_SUMMARY_MEDICAL_SUMMARY_ALLERGY_CONCERN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_MEDICAL_SUMMARY_ALLERGY_CONCERN_ENTRY,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryMedicalSummaryAllergyConcernEntry"),
					new Object[] { dischargeSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryMedicalSummaryMedications(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Medical Summary Medications</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryMedicalSummaryMedications(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_MEDICAL_SUMMARY_MEDICATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getSections()->exists(sect : cda::Section | sect.getSubstanceAdministrations()->exists(sub : cda::SubstanceAdministration | sub.oclIsKindOf(ihe::Medication)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryMedicalSummaryMedications(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Medical Summary Medications</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryMedicalSummaryMedications(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_MEDICAL_SUMMARY_MEDICATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSections()->exists(sect : cda::Section | sect.getSubstanceAdministrations()->exists(sub : cda::SubstanceAdministration | sub.oclIsKindOf(ihe::Medication)))
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeSummaryMedicalSummaryMedications(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_SUMMARY_MEDICAL_SUMMARY_MEDICATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_MEDICAL_SUMMARY_MEDICATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_MEDICAL_SUMMARY_MEDICATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_DISCHARGE_SUMMARY_MEDICAL_SUMMARY_MEDICATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_MEDICAL_SUMMARY_MEDICATIONS,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryMedicalSummaryMedications"),
					new Object[] { dischargeSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryTemplateId(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryTemplateId(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.48.2')";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryTemplateId(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryTemplateId(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.48.2')
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeSummaryTemplateId(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_SUMMARY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryTemplateId"), new Object[] { dischargeSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryRealmCode(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Realm Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryRealmCode(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.realmCode->isEmpty() or self.realmCode->exists(element | element.isNullFlavorUndefined())) implies (self.realmCode->size() = 1 and self.realmCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = element.oclAsType(datatypes::CS) in " + "value.code = 'US'))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryRealmCode(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Realm Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryRealmCode(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.realmCode->isEmpty() or self.realmCode->exists(element | element.isNullFlavorUndefined())) implies (self.realmCode->size() = 1 and self.realmCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = element.oclAsType(datatypes::CS) in 
	 * value.code = 'US'))
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeSummaryRealmCode(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_SUMMARY_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_REALM_CODE,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryRealmCode"), new Object[] { dischargeSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryTypeId(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Type Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryTypeId(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.typeId.oclIsUndefined() or self.typeId.isNullFlavorUndefined()) implies (not self.typeId.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryTypeId(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Type Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryTypeId(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.typeId.oclIsUndefined() or self.typeId.isNullFlavorUndefined()) implies (not self.typeId.oclIsUndefined())
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeSummaryTypeId(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_SUMMARY_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_TYPE_ID,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryTypeId"), new Object[] { dischargeSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryId(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryId(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id.oclIsUndefined() or self.id.isNullFlavorUndefined()) implies (not self.id.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryId(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryId(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id.oclIsUndefined() or self.id.isNullFlavorUndefined()) implies (not self.id.oclIsUndefined())
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeSummaryId(DischargeSummary dischargeSummary, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_SUMMARY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_ID,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryId"), new Object[] { dischargeSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryCode(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryCode(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("
			+ "value.codeSystem = '2.16.840.1.113883.6.1'))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryCode(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryCode(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.codeSystem = '2.16.840.1.113883.6.1'))
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeSummaryCode(DischargeSummary dischargeSummary, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_SUMMARY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_CODE,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryCode"), new Object[] { dischargeSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryTitle(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryTitle(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryTitle(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryTitle(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeSummaryTitle(DischargeSummary dischargeSummary, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_SUMMARY_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_TITLE,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryTitle"), new Object[] { dischargeSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryEffectiveTime(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryEffectiveTime(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryEffectiveTime(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryEffectiveTime(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeSummaryEffectiveTime(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_SUMMARY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_EFFECTIVE_TIME,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryEffectiveTime"), new Object[] { dischargeSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryLanguageCode(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Language Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryLanguageCode(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.languageCode.oclIsUndefined() or self.languageCode.isNullFlavorUndefined()) implies (not self.languageCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryLanguageCode(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Language Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryLanguageCode(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.languageCode.oclIsUndefined() or self.languageCode.isNullFlavorUndefined()) implies (not self.languageCode.oclIsUndefined())
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeSummaryLanguageCode(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_SUMMARY_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_LANGUAGE_CODE,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryLanguageCode"), new Object[] { dischargeSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryProblemListSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Problem List Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryProblemListSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_PROBLEM_LIST_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemListSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryProblemListSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Problem List Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryProblemListSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_PROBLEM_LIST_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemListSection))
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeSummaryProblemListSection(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_SUMMARY_PROBLEM_LIST_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_PROBLEM_LIST_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_PROBLEM_LIST_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_PROBLEM_LIST_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_PROBLEM_LIST_SECTION,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryProblemListSection"),
					new Object[] { dischargeSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryAdmissionMedicationHistorySection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Admission Medication History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryAdmissionMedicationHistorySection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_ADMISSION_MEDICATION_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdmissionMedicationHistorySection))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryAdmissionMedicationHistorySection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Admission Medication History Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryAdmissionMedicationHistorySection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_ADMISSION_MEDICATION_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdmissionMedicationHistorySection))
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeSummaryAdmissionMedicationHistorySection(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_SUMMARY_ADMISSION_MEDICATION_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_ADMISSION_MEDICATION_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_ADMISSION_MEDICATION_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_DISCHARGE_SUMMARY_ADMISSION_MEDICATION_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_ADMISSION_MEDICATION_HISTORY_SECTION,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryAdmissionMedicationHistorySection"),
					new Object[] { dischargeSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryHospitalAdmissionDiagnosisSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Admission Diagnosis Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryHospitalAdmissionDiagnosisSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalAdmissionDiagnosisSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryHospitalAdmissionDiagnosisSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Admission Diagnosis Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryHospitalAdmissionDiagnosisSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalAdmissionDiagnosisSection))
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeSummaryHospitalAdmissionDiagnosisSection(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryHospitalAdmissionDiagnosisSection"),
					new Object[] { dischargeSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryAdvanceDirectivesSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Advance Directives Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryAdvanceDirectivesSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_ADVANCE_DIRECTIVES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdvanceDirectivesSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryAdvanceDirectivesSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Advance Directives Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryAdvanceDirectivesSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_ADVANCE_DIRECTIVES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdvanceDirectivesSection))
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeSummaryAdvanceDirectivesSection(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_SUMMARY_ADVANCE_DIRECTIVES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_ADVANCE_DIRECTIVES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_ADVANCE_DIRECTIVES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_ADVANCE_DIRECTIVES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_ADVANCE_DIRECTIVES_SECTION,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryAdvanceDirectivesSection"),
					new Object[] { dischargeSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryAllergiesReactionsSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Allergies Reactions Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryAllergiesReactionsSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_ALLERGIES_REACTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesReactionsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryAllergiesReactionsSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Allergies Reactions Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryAllergiesReactionsSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_ALLERGIES_REACTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesReactionsSection))
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeSummaryAllergiesReactionsSection(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_SUMMARY_ALLERGIES_REACTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_ALLERGIES_REACTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_ALLERGIES_REACTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_DISCHARGE_SUMMARY_ALLERGIES_REACTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_ALLERGIES_REACTIONS_SECTION,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryAllergiesReactionsSection"),
					new Object[] { dischargeSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryDischargeDiagnosisSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Discharge Diagnosis Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryDischargeDiagnosisSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_DISCHARGE_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DischargeDiagnosisSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryDischargeDiagnosisSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Discharge Diagnosis Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryDischargeDiagnosisSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_DISCHARGE_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DischargeDiagnosisSection))
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeSummaryDischargeDiagnosisSection(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_SUMMARY_DISCHARGE_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_DISCHARGE_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_DISCHARGE_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_DISCHARGE_SUMMARY_DISCHARGE_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_DISCHARGE_DIAGNOSIS_SECTION,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeDiagnosisSection"),
					new Object[] { dischargeSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryDischargeDiet(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Discharge Diet</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryDischargeDiet(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_DISCHARGE_DIET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DischargeDiet))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryDischargeDiet(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Discharge Diet</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryDischargeDiet(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_DISCHARGE_DIET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DischargeDiet))
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeSummaryDischargeDiet(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_SUMMARY_DISCHARGE_DIET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_DISCHARGE_DIET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_DISCHARGE_DIET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_DISCHARGE_DIET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_DISCHARGE_DIET,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeDiet"), new Object[] { dischargeSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryHospitalDischargeMedicationsSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Discharge Medications Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryHospitalDischargeMedicationsSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeMedicationsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryHospitalDischargeMedicationsSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Discharge Medications Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryHospitalDischargeMedicationsSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeMedicationsSection))
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeSummaryHospitalDischargeMedicationsSection(
			DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryHospitalDischargeMedicationsSection"),
					new Object[] { dischargeSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryDiagnosticResultsSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Diagnostic Results Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryDiagnosticResultsSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_DIAGNOSTIC_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DiagnosticResultsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryDiagnosticResultsSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Diagnostic Results Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryDiagnosticResultsSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_DIAGNOSTIC_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DiagnosticResultsSection))
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeSummaryDiagnosticResultsSection(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_SUMMARY_DIAGNOSTIC_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_DIAGNOSTIC_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_DIAGNOSTIC_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_DIAGNOSTIC_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_DIAGNOSTIC_RESULTS_SECTION,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryDiagnosticResultsSection"),
					new Object[] { dischargeSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryFunctionalStatusSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Functional Status Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryFunctionalStatusSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FunctionalStatusSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryFunctionalStatusSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Functional Status Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryFunctionalStatusSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FunctionalStatusSection))
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeSummaryFunctionalStatusSection(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_SUMMARY_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_FUNCTIONAL_STATUS_SECTION,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryFunctionalStatusSection"),
					new Object[] { dischargeSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryHistoryOfPresentIllness(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary History Of Present Illness</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryHistoryOfPresentIllness(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_HISTORY_OF_PRESENT_ILLNESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPresentIllness))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryHistoryOfPresentIllness(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary History Of Present Illness</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryHistoryOfPresentIllness(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_HISTORY_OF_PRESENT_ILLNESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPresentIllness))
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeSummaryHistoryOfPresentIllness(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_SUMMARY_HISTORY_OF_PRESENT_ILLNESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_HISTORY_OF_PRESENT_ILLNESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_HISTORY_OF_PRESENT_ILLNESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_HISTORY_OF_PRESENT_ILLNESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_HISTORY_OF_PRESENT_ILLNESS,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryHistoryOfPresentIllness"),
					new Object[] { dischargeSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryHospitalCourseSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Course Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryHospitalCourseSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_COURSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalCourseSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryHospitalCourseSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Course Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryHospitalCourseSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_COURSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalCourseSection))
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeSummaryHospitalCourseSection(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_COURSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_COURSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_COURSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_COURSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_HOSPITAL_COURSE_SECTION,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryHospitalCourseSection"),
					new Object[] { dischargeSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryMedicalEquipmentSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Medical Equipment Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryMedicalEquipmentSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicalEquipmentSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryMedicalEquipmentSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Medical Equipment Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryMedicalEquipmentSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicalEquipmentSection))
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeSummaryMedicalEquipmentSection(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_SUMMARY_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_MEDICAL_EQUIPMENT_SECTION,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryMedicalEquipmentSection"),
					new Object[] { dischargeSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryPhysicalExamSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Physical Exam Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryPhysicalExamSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_PHYSICAL_EXAM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PhysicalExamSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryPhysicalExamSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Physical Exam Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryPhysicalExamSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_PHYSICAL_EXAM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PhysicalExamSection))
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeSummaryPhysicalExamSection(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_SUMMARY_PHYSICAL_EXAM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_PHYSICAL_EXAM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_PHYSICAL_EXAM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_PHYSICAL_EXAM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_PHYSICAL_EXAM_SECTION,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryPhysicalExamSection"),
					new Object[] { dischargeSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryPlanOfCareSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Plan Of Care Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryPlanOfCareSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryPlanOfCareSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Plan Of Care Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryPlanOfCareSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection))
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeSummaryPlanOfCareSection(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_PLAN_OF_CARE_SECTION,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryPlanOfCareSection"),
					new Object[] { dischargeSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryHistoryOfPastIllnessSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary History Of Past Illness Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryHistoryOfPastIllnessSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_HISTORY_OF_PAST_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPastIllnessSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryHistoryOfPastIllnessSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary History Of Past Illness Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryHistoryOfPastIllnessSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_HISTORY_OF_PAST_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPastIllnessSection))
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeSummaryHistoryOfPastIllnessSection(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_SUMMARY_HISTORY_OF_PAST_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_HISTORY_OF_PAST_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_HISTORY_OF_PAST_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_DISCHARGE_SUMMARY_HISTORY_OF_PAST_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_HISTORY_OF_PAST_ILLNESS_SECTION,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryHistoryOfPastIllnessSection"),
					new Object[] { dischargeSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryReviewOfSystemsSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Review Of Systems Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryReviewOfSystemsSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReviewOfSystemsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryReviewOfSystemsSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Review Of Systems Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryReviewOfSystemsSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReviewOfSystemsSection))
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeSummaryReviewOfSystemsSection(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_SUMMARY_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_REVIEW_OF_SYSTEMS_SECTION,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryReviewOfSystemsSection"),
					new Object[] { dischargeSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryMedicationsAdministeredSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Medications Administered Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryMedicationsAdministeredSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_MEDICATIONS_ADMINISTERED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsAdministeredSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryMedicationsAdministeredSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Medications Administered Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryMedicationsAdministeredSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_MEDICATIONS_ADMINISTERED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsAdministeredSection))
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeSummaryMedicationsAdministeredSection(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_SUMMARY_MEDICATIONS_ADMINISTERED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_MEDICATIONS_ADMINISTERED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_MEDICATIONS_ADMINISTERED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_DISCHARGE_SUMMARY_MEDICATIONS_ADMINISTERED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_MEDICATIONS_ADMINISTERED_SECTION,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryMedicationsAdministeredSection"),
					new Object[] { dischargeSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryVitalSignsSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Vital Signs Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryVitalSignsSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryVitalSignsSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Vital Signs Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryVitalSignsSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSection))
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDischargeSummaryVitalSignsSection(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISCHARGE_SUMMARY_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_VITAL_SIGNS_SECTION,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryVitalSignsSection"),
					new Object[] { dischargeSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemListSection(DischargeSummary) <em>Get Problem List Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemListSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_LIST_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemListSection))->asSequence()->first().oclAsType(consol::ProblemListSection)";

	/**
	 * The cached OCL query for the '{@link #getProblemListSection(DischargeSummary) <em>Get Problem List Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemListSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_LIST_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemListSection))->asSequence()->first().oclAsType(consol::ProblemListSection)
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static ProblemListSection getProblemListSection(DischargeSummary dischargeSummary) {
		if (GET_PROBLEM_LIST_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY,
				ConsolPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(90));
			try {
				GET_PROBLEM_LIST_SECTION__EOCL_QRY = helper.createQuery(GET_PROBLEM_LIST_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_LIST_SECTION__EOCL_QRY);
		return (ProblemListSection) query.evaluate(dischargeSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAdmissionMedicationHistorySection(DischargeSummary) <em>Get Admission Medication History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdmissionMedicationHistorySection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ADMISSION_MEDICATION_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdmissionMedicationHistorySection))->asSequence()->first().oclAsType(consol::AdmissionMedicationHistorySection)";

	/**
	 * The cached OCL query for the '{@link #getAdmissionMedicationHistorySection(DischargeSummary) <em>Get Admission Medication History Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdmissionMedicationHistorySection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ADMISSION_MEDICATION_HISTORY_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdmissionMedicationHistorySection))->asSequence()->first().oclAsType(consol::AdmissionMedicationHistorySection)
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static AdmissionMedicationHistorySection getAdmissionMedicationHistorySection(
			DischargeSummary dischargeSummary) {
		if (GET_ADMISSION_MEDICATION_HISTORY_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY,
				ConsolPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(91));
			try {
				GET_ADMISSION_MEDICATION_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_ADMISSION_MEDICATION_HISTORY_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ADMISSION_MEDICATION_HISTORY_SECTION__EOCL_QRY);
		return (AdmissionMedicationHistorySection) query.evaluate(dischargeSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getHospitalAdmissionDiagnosisSection(DischargeSummary) <em>Get Hospital Admission Diagnosis Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHospitalAdmissionDiagnosisSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalAdmissionDiagnosisSection))->asSequence()->first().oclAsType(consol::HospitalAdmissionDiagnosisSection)";

	/**
	 * The cached OCL query for the '{@link #getHospitalAdmissionDiagnosisSection(DischargeSummary) <em>Get Hospital Admission Diagnosis Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHospitalAdmissionDiagnosisSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalAdmissionDiagnosisSection))->asSequence()->first().oclAsType(consol::HospitalAdmissionDiagnosisSection)
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static HospitalAdmissionDiagnosisSection getHospitalAdmissionDiagnosisSection(
			DischargeSummary dischargeSummary) {
		if (GET_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY,
				ConsolPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(92));
			try {
				GET_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__EOCL_QRY = helper.createQuery(GET_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__EOCL_QRY);
		return (HospitalAdmissionDiagnosisSection) query.evaluate(dischargeSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAdvanceDirectivesSection(DischargeSummary) <em>Get Advance Directives Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvanceDirectivesSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ADVANCE_DIRECTIVES_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdvanceDirectivesSection))->asSequence()->first().oclAsType(consol::AdvanceDirectivesSection)";

	/**
	 * The cached OCL query for the '{@link #getAdvanceDirectivesSection(DischargeSummary) <em>Get Advance Directives Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvanceDirectivesSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ADVANCE_DIRECTIVES_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdvanceDirectivesSection))->asSequence()->first().oclAsType(consol::AdvanceDirectivesSection)
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static AdvanceDirectivesSection getAdvanceDirectivesSection(DischargeSummary dischargeSummary) {
		if (GET_ADVANCE_DIRECTIVES_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY,
				ConsolPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(93));
			try {
				GET_ADVANCE_DIRECTIVES_SECTION__EOCL_QRY = helper.createQuery(GET_ADVANCE_DIRECTIVES_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ADVANCE_DIRECTIVES_SECTION__EOCL_QRY);
		return (AdvanceDirectivesSection) query.evaluate(dischargeSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAllergiesReactionsSection(DischargeSummary) <em>Get Allergies Reactions Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergiesReactionsSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ALLERGIES_REACTIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesReactionsSection))->asSequence()->first().oclAsType(consol::AllergiesReactionsSection)";

	/**
	 * The cached OCL query for the '{@link #getAllergiesReactionsSection(DischargeSummary) <em>Get Allergies Reactions Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergiesReactionsSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ALLERGIES_REACTIONS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesReactionsSection))->asSequence()->first().oclAsType(consol::AllergiesReactionsSection)
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static AllergiesReactionsSection getAllergiesReactionsSection(DischargeSummary dischargeSummary) {
		if (GET_ALLERGIES_REACTIONS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY,
				ConsolPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(94));
			try {
				GET_ALLERGIES_REACTIONS_SECTION__EOCL_QRY = helper.createQuery(GET_ALLERGIES_REACTIONS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ALLERGIES_REACTIONS_SECTION__EOCL_QRY);
		return (AllergiesReactionsSection) query.evaluate(dischargeSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getDischargeDiagnosisSection(DischargeSummary) <em>Get Discharge Diagnosis Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDischargeDiagnosisSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DISCHARGE_DIAGNOSIS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DischargeDiagnosisSection))->asSequence()->first().oclAsType(consol::DischargeDiagnosisSection)";

	/**
	 * The cached OCL query for the '{@link #getDischargeDiagnosisSection(DischargeSummary) <em>Get Discharge Diagnosis Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDischargeDiagnosisSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DISCHARGE_DIAGNOSIS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DischargeDiagnosisSection))->asSequence()->first().oclAsType(consol::DischargeDiagnosisSection)
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static DischargeDiagnosisSection getDischargeDiagnosisSection(DischargeSummary dischargeSummary) {
		if (GET_DISCHARGE_DIAGNOSIS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY,
				ConsolPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(95));
			try {
				GET_DISCHARGE_DIAGNOSIS_SECTION__EOCL_QRY = helper.createQuery(GET_DISCHARGE_DIAGNOSIS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_DISCHARGE_DIAGNOSIS_SECTION__EOCL_QRY);
		return (DischargeDiagnosisSection) query.evaluate(dischargeSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getDischargeDiet(DischargeSummary) <em>Get Discharge Diet</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDischargeDiet(DischargeSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DISCHARGE_DIET__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DischargeDiet))->asSequence()->first().oclAsType(consol::DischargeDiet)";

	/**
	 * The cached OCL query for the '{@link #getDischargeDiet(DischargeSummary) <em>Get Discharge Diet</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDischargeDiet(DischargeSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DISCHARGE_DIET__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DischargeDiet))->asSequence()->first().oclAsType(consol::DischargeDiet)
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static DischargeDiet getDischargeDiet(DischargeSummary dischargeSummary) {
		if (GET_DISCHARGE_DIET__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY,
				ConsolPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(96));
			try {
				GET_DISCHARGE_DIET__EOCL_QRY = helper.createQuery(GET_DISCHARGE_DIET__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_DISCHARGE_DIET__EOCL_QRY);
		return (DischargeDiet) query.evaluate(dischargeSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getHospitalDischargeMedicationsSection(DischargeSummary) <em>Get Hospital Discharge Medications Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHospitalDischargeMedicationsSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeMedicationsSection))->asSequence()->first().oclAsType(consol::HospitalDischargeMedicationsSection)";

	/**
	 * The cached OCL query for the '{@link #getHospitalDischargeMedicationsSection(DischargeSummary) <em>Get Hospital Discharge Medications Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHospitalDischargeMedicationsSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeMedicationsSection))->asSequence()->first().oclAsType(consol::HospitalDischargeMedicationsSection)
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static HospitalDischargeMedicationsSection getHospitalDischargeMedicationsSection(
			DischargeSummary dischargeSummary) {
		if (GET_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY,
				ConsolPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(97));
			try {
				GET_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__EOCL_QRY = helper.createQuery(GET_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__EOCL_QRY);
		return (HospitalDischargeMedicationsSection) query.evaluate(dischargeSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getDiagnosticResultsSection(DischargeSummary) <em>Get Diagnostic Results Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosticResultsSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DIAGNOSTIC_RESULTS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DiagnosticResultsSection))->asSequence()->first().oclAsType(consol::DiagnosticResultsSection)";

	/**
	 * The cached OCL query for the '{@link #getDiagnosticResultsSection(DischargeSummary) <em>Get Diagnostic Results Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosticResultsSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DIAGNOSTIC_RESULTS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DiagnosticResultsSection))->asSequence()->first().oclAsType(consol::DiagnosticResultsSection)
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static DiagnosticResultsSection getDiagnosticResultsSection(DischargeSummary dischargeSummary) {
		if (GET_DIAGNOSTIC_RESULTS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY,
				ConsolPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(98));
			try {
				GET_DIAGNOSTIC_RESULTS_SECTION__EOCL_QRY = helper.createQuery(GET_DIAGNOSTIC_RESULTS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_DIAGNOSTIC_RESULTS_SECTION__EOCL_QRY);
		return (DiagnosticResultsSection) query.evaluate(dischargeSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getFunctionalStatusSection(DischargeSummary) <em>Get Functional Status Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalStatusSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FUNCTIONAL_STATUS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FunctionalStatusSection))->asSequence()->first().oclAsType(consol::FunctionalStatusSection)";

	/**
	 * The cached OCL query for the '{@link #getFunctionalStatusSection(DischargeSummary) <em>Get Functional Status Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalStatusSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FUNCTIONAL_STATUS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FunctionalStatusSection))->asSequence()->first().oclAsType(consol::FunctionalStatusSection)
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static FunctionalStatusSection getFunctionalStatusSection(DischargeSummary dischargeSummary) {
		if (GET_FUNCTIONAL_STATUS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY,
				ConsolPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(99));
			try {
				GET_FUNCTIONAL_STATUS_SECTION__EOCL_QRY = helper.createQuery(GET_FUNCTIONAL_STATUS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_FUNCTIONAL_STATUS_SECTION__EOCL_QRY);
		return (FunctionalStatusSection) query.evaluate(dischargeSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getHistoryOfPresentIllness(DischargeSummary) <em>Get History Of Present Illness</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoryOfPresentIllness(DischargeSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HISTORY_OF_PRESENT_ILLNESS__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPresentIllness))->asSequence()->first().oclAsType(consol::HistoryOfPresentIllness)";

	/**
	 * The cached OCL query for the '{@link #getHistoryOfPresentIllness(DischargeSummary) <em>Get History Of Present Illness</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoryOfPresentIllness(DischargeSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HISTORY_OF_PRESENT_ILLNESS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPresentIllness))->asSequence()->first().oclAsType(consol::HistoryOfPresentIllness)
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static HistoryOfPresentIllness getHistoryOfPresentIllness(DischargeSummary dischargeSummary) {
		if (GET_HISTORY_OF_PRESENT_ILLNESS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY,
				ConsolPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(100));
			try {
				GET_HISTORY_OF_PRESENT_ILLNESS__EOCL_QRY = helper.createQuery(GET_HISTORY_OF_PRESENT_ILLNESS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HISTORY_OF_PRESENT_ILLNESS__EOCL_QRY);
		return (HistoryOfPresentIllness) query.evaluate(dischargeSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getHospitalCourseSection(DischargeSummary) <em>Get Hospital Course Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHospitalCourseSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HOSPITAL_COURSE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalCourseSection))->asSequence()->first().oclAsType(consol::HospitalCourseSection)";

	/**
	 * The cached OCL query for the '{@link #getHospitalCourseSection(DischargeSummary) <em>Get Hospital Course Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHospitalCourseSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HOSPITAL_COURSE_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalCourseSection))->asSequence()->first().oclAsType(consol::HospitalCourseSection)
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static HospitalCourseSection getHospitalCourseSection(DischargeSummary dischargeSummary) {
		if (GET_HOSPITAL_COURSE_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY,
				ConsolPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(101));
			try {
				GET_HOSPITAL_COURSE_SECTION__EOCL_QRY = helper.createQuery(GET_HOSPITAL_COURSE_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HOSPITAL_COURSE_SECTION__EOCL_QRY);
		return (HospitalCourseSection) query.evaluate(dischargeSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicalEquipmentSection(DischargeSummary) <em>Get Medical Equipment Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicalEquipmentSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICAL_EQUIPMENT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicalEquipmentSection))->asSequence()->first().oclAsType(consol::MedicalEquipmentSection)";

	/**
	 * The cached OCL query for the '{@link #getMedicalEquipmentSection(DischargeSummary) <em>Get Medical Equipment Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicalEquipmentSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICAL_EQUIPMENT_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicalEquipmentSection))->asSequence()->first().oclAsType(consol::MedicalEquipmentSection)
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static MedicalEquipmentSection getMedicalEquipmentSection(DischargeSummary dischargeSummary) {
		if (GET_MEDICAL_EQUIPMENT_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY,
				ConsolPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(102));
			try {
				GET_MEDICAL_EQUIPMENT_SECTION__EOCL_QRY = helper.createQuery(GET_MEDICAL_EQUIPMENT_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICAL_EQUIPMENT_SECTION__EOCL_QRY);
		return (MedicalEquipmentSection) query.evaluate(dischargeSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPhysicalExamSection(DischargeSummary) <em>Get Physical Exam Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalExamSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PHYSICAL_EXAM_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PhysicalExamSection))->asSequence()->first().oclAsType(consol::PhysicalExamSection)";

	/**
	 * The cached OCL query for the '{@link #getPhysicalExamSection(DischargeSummary) <em>Get Physical Exam Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalExamSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PHYSICAL_EXAM_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PhysicalExamSection))->asSequence()->first().oclAsType(consol::PhysicalExamSection)
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static PhysicalExamSection getPhysicalExamSection(DischargeSummary dischargeSummary) {
		if (GET_PHYSICAL_EXAM_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY,
				ConsolPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(103));
			try {
				GET_PHYSICAL_EXAM_SECTION__EOCL_QRY = helper.createQuery(GET_PHYSICAL_EXAM_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PHYSICAL_EXAM_SECTION__EOCL_QRY);
		return (PhysicalExamSection) query.evaluate(dischargeSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPlanOfCareSection(DischargeSummary) <em>Get Plan Of Care Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfCareSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLAN_OF_CARE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection))->asSequence()->first().oclAsType(consol::PlanOfCareSection)";

	/**
	 * The cached OCL query for the '{@link #getPlanOfCareSection(DischargeSummary) <em>Get Plan Of Care Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfCareSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLAN_OF_CARE_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection))->asSequence()->first().oclAsType(consol::PlanOfCareSection)
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static PlanOfCareSection getPlanOfCareSection(DischargeSummary dischargeSummary) {
		if (GET_PLAN_OF_CARE_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY,
				ConsolPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(104));
			try {
				GET_PLAN_OF_CARE_SECTION__EOCL_QRY = helper.createQuery(GET_PLAN_OF_CARE_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PLAN_OF_CARE_SECTION__EOCL_QRY);
		return (PlanOfCareSection) query.evaluate(dischargeSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getHistoryOfPastIllnessSection(DischargeSummary) <em>Get History Of Past Illness Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoryOfPastIllnessSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HISTORY_OF_PAST_ILLNESS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPastIllnessSection))->asSequence()->first().oclAsType(consol::HistoryOfPastIllnessSection)";

	/**
	 * The cached OCL query for the '{@link #getHistoryOfPastIllnessSection(DischargeSummary) <em>Get History Of Past Illness Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoryOfPastIllnessSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HISTORY_OF_PAST_ILLNESS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPastIllnessSection))->asSequence()->first().oclAsType(consol::HistoryOfPastIllnessSection)
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static HistoryOfPastIllnessSection getHistoryOfPastIllnessSection(DischargeSummary dischargeSummary) {
		if (GET_HISTORY_OF_PAST_ILLNESS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY,
				ConsolPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(105));
			try {
				GET_HISTORY_OF_PAST_ILLNESS_SECTION__EOCL_QRY = helper.createQuery(GET_HISTORY_OF_PAST_ILLNESS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HISTORY_OF_PAST_ILLNESS_SECTION__EOCL_QRY);
		return (HistoryOfPastIllnessSection) query.evaluate(dischargeSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getReviewOfSystemsSection(DischargeSummary) <em>Get Review Of Systems Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewOfSystemsSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReviewOfSystemsSection))->asSequence()->first().oclAsType(consol::ReviewOfSystemsSection)";

	/**
	 * The cached OCL query for the '{@link #getReviewOfSystemsSection(DischargeSummary) <em>Get Review Of Systems Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewOfSystemsSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReviewOfSystemsSection))->asSequence()->first().oclAsType(consol::ReviewOfSystemsSection)
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static ReviewOfSystemsSection getReviewOfSystemsSection(DischargeSummary dischargeSummary) {
		if (GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY,
				ConsolPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(106));
			try {
				GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY = helper.createQuery(GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY);
		return (ReviewOfSystemsSection) query.evaluate(dischargeSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicationsAdministeredSection(DischargeSummary) <em>Get Medications Administered Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationsAdministeredSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATIONS_ADMINISTERED_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsAdministeredSection))->asSequence()->first().oclAsType(consol::MedicationsAdministeredSection)";

	/**
	 * The cached OCL query for the '{@link #getMedicationsAdministeredSection(DischargeSummary) <em>Get Medications Administered Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationsAdministeredSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATIONS_ADMINISTERED_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsAdministeredSection))->asSequence()->first().oclAsType(consol::MedicationsAdministeredSection)
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static MedicationsAdministeredSection getMedicationsAdministeredSection(DischargeSummary dischargeSummary) {
		if (GET_MEDICATIONS_ADMINISTERED_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY,
				ConsolPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(107));
			try {
				GET_MEDICATIONS_ADMINISTERED_SECTION__EOCL_QRY = helper.createQuery(GET_MEDICATIONS_ADMINISTERED_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATIONS_ADMINISTERED_SECTION__EOCL_QRY);
		return (MedicationsAdministeredSection) query.evaluate(dischargeSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getVitalSignsSection(DischargeSummary) <em>Get Vital Signs Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignsSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_VITAL_SIGNS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSection))->asSequence()->first().oclAsType(consol::VitalSignsSection)";

	/**
	 * The cached OCL query for the '{@link #getVitalSignsSection(DischargeSummary) <em>Get Vital Signs Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignsSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_VITAL_SIGNS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSection))->asSequence()->first().oclAsType(consol::VitalSignsSection)
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static VitalSignsSection getVitalSignsSection(DischargeSummary dischargeSummary) {
		if (GET_VITAL_SIGNS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY,
				ConsolPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(108));
			try {
				GET_VITAL_SIGNS_SECTION__EOCL_QRY = helper.createQuery(GET_VITAL_SIGNS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_VITAL_SIGNS_SECTION__EOCL_QRY);
		return (VitalSignsSection) query.evaluate(dischargeSummary);
	}

} // DischargeSummaryOperations
