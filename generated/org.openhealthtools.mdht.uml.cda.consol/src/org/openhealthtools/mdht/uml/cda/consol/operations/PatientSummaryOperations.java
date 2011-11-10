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
import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesReactionsSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.DiagnosticResultsSection;
import org.openhealthtools.mdht.uml.cda.consol.EncountersSection;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.PatientSummary;
import org.openhealthtools.mdht.uml.cda.consol.PayersSection;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.PregnancyHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemListSection;
import org.openhealthtools.mdht.uml.cda.consol.PurposeSection;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSection;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.SurgeriesSection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalDocumentOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Patient Summary</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryServiceEventRequired(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Service Event Required</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryServiceEventClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Service Event Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryServiceEventEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Service Event Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryLanguageCodeFormat(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Language Code Format</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryNoTemplateIdExtension(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary No Template Id Extension</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryHasEffectiveTimeSeconds(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Effective Time Seconds</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryHasEffectiveTimeZone(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Effective Time Zone</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryOneOrTwoRecordTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary One Or Two Record Target</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryHasAssignedAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Assigned Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryHasAssignedAuthorNullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Assigned Author Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryHasInformationRecipient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Information Recipient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryPersonHasName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Person Has Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryRolesShallHaveAddrAndTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Roles Shall Have Addr And Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryRolesShouldHaveAddrAndTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Roles Should Have Addr And Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryOrganizationsHaveContactInfo(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Organizations Have Contact Info</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryTimePreciseToDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Time Precise To Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryTimePreciseToYear(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Time Precise To Year</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryTelephoneMatchesRegex(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Telephone Matches Regex</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryHasTelephoneDialingDigits(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Telephone Dialing Digits</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryUnknownTelephoneUsesNullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Unknown Telephone Uses Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryTypeIdExtension(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Type Id Extension</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryIdRootFormat(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Id Root Format</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryOidLength(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Oid Length</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryLanguageCodeForm(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Language Code Form</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummarySetIdAndVersionNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Set Id And Version Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummarySetIdAndIdAreUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Set Id And Id Are Unique</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryCopyTimeNotPresent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Copy Time Not Present</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryHasRecordTargetPatientRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Record Target Patient Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryHasPatientBirthTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Patient Birth Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryHasAdministrativeGenderCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Administrative Gender Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryHasProviderOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Provider Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryHasAuthorTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Author Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryHasAssignedAuthorId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Assigned Author Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryHasAssignedAuthorPersonOrDevice(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Assigned Author Person Or Device</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryHasDataEntererAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Data Enterer Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryHasDataEntererTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Data Enterer Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryHasInformant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Informant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryHasInformantAssignedPersonOrRelatedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Informant Assigned Person Or Related Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryLegalAuthenticatorHasAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Legal Authenticator Has Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryAuthenticatorHasAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Authenticator Has Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryTimePreciseToSecond(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Time Precise To Second</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryTimePreciseToYearAndDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Time Precise To Year And Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryHealthcareProvider(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Healthcare Provider</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryRealmCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryTypeId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryLanguageCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Language Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryAdvanceDirectivesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Advance Directives Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryAllergiesReactionsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Allergies Reactions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryProblemListSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Problem List Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryEncountersSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Encounters Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryImmunizationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Immunizations Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryPayersSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Payers Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryMedicationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryPlanOfCareSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryPregnancyHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Pregnancy History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummarySurgeriesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Surgeries Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryVitalSignsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryDiagnosticResultsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Diagnostic Results Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryFamilyHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Family History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummarySocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryResultsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Results Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryMedicalEquipmentSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Medical Equipment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryFunctionalStatusSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Functional Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#validatePatientSummaryPurposeSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Purpose Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#getAdvanceDirectivesSection() <em>Get Advance Directives Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#getAllergiesReactionsSection() <em>Get Allergies Reactions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#getProblemListSection() <em>Get Problem List Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#getEncountersSection() <em>Get Encounters Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#getImmunizationsSection() <em>Get Immunizations Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#getPayersSection() <em>Get Payers Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#getMedicationsSection() <em>Get Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#getPlanOfCareSection() <em>Get Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#getPregnancyHistorySection() <em>Get Pregnancy History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#getSurgeriesSection() <em>Get Surgeries Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#getVitalSignsSection() <em>Get Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#getDiagnosticResultsSection() <em>Get Diagnostic Results Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#getFamilyHistorySection() <em>Get Family History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#getSocialHistorySection() <em>Get Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#getResultsSection() <em>Get Results Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#getMedicalEquipmentSection() <em>Get Medical Equipment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#getFunctionalStatusSection() <em>Get Functional Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientSummary#getPurposeSection() <em>Get Purpose Section</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PatientSummaryOperations extends ClinicalDocumentOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientSummaryOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryServiceEventRequired(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Service Event Required</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryServiceEventRequired(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_SERVICE_EVENT_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->one(doc : cda::DocumentationOf | not doc.serviceEvent.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryServiceEventRequired(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Service Event Required</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryServiceEventRequired(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_SERVICE_EVENT_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.documentationOf->one(doc : cda::DocumentationOf | not doc.serviceEvent.oclIsUndefined())
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryServiceEventRequired(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_SERVICE_EVENT_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_SERVICE_EVENT_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_SERVICE_EVENT_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_SERVICE_EVENT_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_SERVICE_EVENT_REQUIRED,
					ConsolPlugin.INSTANCE.getString("PatientSummaryServiceEventRequired"),
					new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryServiceEventClassCode(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Service Event Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryServiceEventClassCode(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->one(doc : cda::DocumentationOf | doc.serviceEvent.classCode = vocab::ActClassRoot::PCPR)";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryServiceEventClassCode(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Service Event Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryServiceEventClassCode(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.documentationOf->one(doc : cda::DocumentationOf | doc.serviceEvent.classCode = vocab::ActClassRoot::PCPR)
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryServiceEventClassCode(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_SERVICE_EVENT_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("PatientSummaryServiceEventClassCode"),
					new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryServiceEventEffectiveTime(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Service Event Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryServiceEventEffectiveTime(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->one(doc : cda::DocumentationOf | "
			+ "   not doc.serviceEvent.effectiveTime.low.oclIsUndefined() and not doc.serviceEvent.effectiveTime.high.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryServiceEventEffectiveTime(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Service Event Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryServiceEventEffectiveTime(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.documentationOf->one(doc : cda::DocumentationOf | 
	 *    not doc.serviceEvent.effectiveTime.low.oclIsUndefined() and not doc.serviceEvent.effectiveTime.high.oclIsUndefined())
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryServiceEventEffectiveTime(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_SERVICE_EVENT_EFFECTIVE_TIME,
					ConsolPlugin.INSTANCE.getString("PatientSummaryServiceEventEffectiveTime"),
					new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryLanguageCodeFormat(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Language Code Format</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryLanguageCodeFormat(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_LANGUAGE_CODE_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.languageCode.matches('code','(([a-z]{2})(\\\\-[A-Z]{2})?)')";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryLanguageCodeFormat(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Language Code Format</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryLanguageCodeFormat(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_LANGUAGE_CODE_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.languageCode.matches('code','(([a-z]{2})(\\\\-[A-Z]{2})?)')
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryLanguageCodeFormat(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_LANGUAGE_CODE_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_LANGUAGE_CODE_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_LANGUAGE_CODE_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_LANGUAGE_CODE_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_LANGUAGE_CODE_FORMAT,
					ConsolPlugin.INSTANCE.getString("PatientSummaryLanguageCodeFormat"),
					new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryNoTemplateIdExtension(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary No Template Id Extension</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryNoTemplateIdExtension(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_NO_TEMPLATE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->forAll(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1' implies id.extension.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryNoTemplateIdExtension(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary No Template Id Extension</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryNoTemplateIdExtension(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_NO_TEMPLATE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->forAll(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1' implies id.extension.oclIsUndefined())
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryNoTemplateIdExtension(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_NO_TEMPLATE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_NO_TEMPLATE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_NO_TEMPLATE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_NO_TEMPLATE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_NO_TEMPLATE_ID_EXTENSION,
					ConsolPlugin.INSTANCE.getString("PatientSummaryNoTemplateIdExtension"),
					new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryHasEffectiveTimeSeconds(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Effective Time Seconds</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryHasEffectiveTimeSeconds(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_HAS_EFFECTIVE_TIME_SECONDS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime.value.size() >= 4";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryHasEffectiveTimeSeconds(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Effective Time Seconds</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryHasEffectiveTimeSeconds(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_HAS_EFFECTIVE_TIME_SECONDS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.effectiveTime.value.size() >= 4
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryHasEffectiveTimeSeconds(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_HAS_EFFECTIVE_TIME_SECONDS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_HAS_EFFECTIVE_TIME_SECONDS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_HAS_EFFECTIVE_TIME_SECONDS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_HAS_EFFECTIVE_TIME_SECONDS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_HAS_EFFECTIVE_TIME_SECONDS,
					ConsolPlugin.INSTANCE.getString("PatientSummaryHasEffectiveTimeSeconds"),
					new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryHasEffectiveTimeZone(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Effective Time Zone</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryHasEffectiveTimeZone(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_HAS_EFFECTIVE_TIME_ZONE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime.value.size() >= 19";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryHasEffectiveTimeZone(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Effective Time Zone</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryHasEffectiveTimeZone(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_HAS_EFFECTIVE_TIME_ZONE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.effectiveTime.value.size() >= 19
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryHasEffectiveTimeZone(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_HAS_EFFECTIVE_TIME_ZONE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_HAS_EFFECTIVE_TIME_ZONE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_HAS_EFFECTIVE_TIME_ZONE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_HAS_EFFECTIVE_TIME_ZONE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_HAS_EFFECTIVE_TIME_ZONE,
					ConsolPlugin.INSTANCE.getString("PatientSummaryHasEffectiveTimeZone"),
					new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryOneOrTwoRecordTarget(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary One Or Two Record Target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryOneOrTwoRecordTarget(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_ONE_OR_TWO_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->size() = 1 or self.recordTarget->size() =2";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryOneOrTwoRecordTarget(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary One Or Two Record Target</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryOneOrTwoRecordTarget(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_ONE_OR_TWO_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->size() = 1 or self.recordTarget->size() =2
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryOneOrTwoRecordTarget(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_ONE_OR_TWO_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_ONE_OR_TWO_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_ONE_OR_TWO_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_ONE_OR_TWO_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_ONE_OR_TWO_RECORD_TARGET,
					ConsolPlugin.INSTANCE.getString("PatientSummaryOneOrTwoRecordTarget"),
					new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryHasAssignedAuthor(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Assigned Author</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryHasAssignedAuthor(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.assignedAuthor.assignedPerson.oclIsUndefined() "
			+ "   or not author.assignedAuthor.representedOrganization.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryHasAssignedAuthor(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Assigned Author</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryHasAssignedAuthor(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.author->exists(author : cda::Author | not author.assignedAuthor.assignedPerson.oclIsUndefined() 
	 *    or not author.assignedAuthor.representedOrganization.oclIsUndefined())
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryHasAssignedAuthor(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_HAS_ASSIGNED_AUTHOR,
					ConsolPlugin.INSTANCE.getString("PatientSummaryHasAssignedAuthor"), new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryHasAssignedAuthorNullFlavor(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Assigned Author Null Flavor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryHasAssignedAuthorNullFlavor(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_HAS_ASSIGNED_AUTHOR_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | (not author.assignedAuthor.representedOrganization.oclIsUndefined()"
			+ "      and author.assignedAuthor.assignedPerson.oclIsUndefined() and author.assignedAuthor.assignedAuthoringDevice.oclIsUndefined())"
			+ "   implies author.assignedAuthor.id->one(id : datatypes::II | id.nullFlavor = vocab::NullFlavor::NA))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryHasAssignedAuthorNullFlavor(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Assigned Author Null Flavor</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryHasAssignedAuthorNullFlavor(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_HAS_ASSIGNED_AUTHOR_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.author->exists(author : cda::Author | (not author.assignedAuthor.representedOrganization.oclIsUndefined()
	 *       and author.assignedAuthor.assignedPerson.oclIsUndefined() and author.assignedAuthor.assignedAuthoringDevice.oclIsUndefined())
	 *    implies author.assignedAuthor.id->one(id : datatypes::II | id.nullFlavor = vocab::NullFlavor::NA))
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryHasAssignedAuthorNullFlavor(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_HAS_ASSIGNED_AUTHOR_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_HAS_ASSIGNED_AUTHOR_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_HAS_ASSIGNED_AUTHOR_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PATIENT_SUMMARY_HAS_ASSIGNED_AUTHOR_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_HAS_ASSIGNED_AUTHOR_NULL_FLAVOR,
					ConsolPlugin.INSTANCE.getString("PatientSummaryHasAssignedAuthorNullFlavor"),
					new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryHasInformationRecipient(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Information Recipient</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryHasInformationRecipient(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_HAS_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informationRecipient->size() > 0";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryHasInformationRecipient(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Information Recipient</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryHasInformationRecipient(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_HAS_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.informationRecipient->size() > 0
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryHasInformationRecipient(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_HAS_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_HAS_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_HAS_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_HAS_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_HAS_INFORMATION_RECIPIENT,
					ConsolPlugin.INSTANCE.getString("PatientSummaryHasInformationRecipient"),
					new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryPersonHasName(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Person Has Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryPersonHasName(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_PERSON_HAS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryPersonHasName(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Person Has Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryPersonHasName(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_PERSON_HAS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryPersonHasName(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_PERSON_HAS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_PERSON_HAS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_PERSON_HAS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_PERSON_HAS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_PERSON_HAS_NAME,
					ConsolPlugin.INSTANCE.getString("PatientSummaryPersonHasName"), new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryRolesShallHaveAddrAndTelecom(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Roles Shall Have Addr And Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryRolesShallHaveAddrAndTelecom(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_ROLES_SHALL_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryRolesShallHaveAddrAndTelecom(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Roles Shall Have Addr And Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryRolesShallHaveAddrAndTelecom(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_ROLES_SHALL_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryRolesShallHaveAddrAndTelecom(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_ROLES_SHALL_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_ROLES_SHALL_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_ROLES_SHALL_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PATIENT_SUMMARY_ROLES_SHALL_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_ROLES_SHALL_HAVE_ADDR_AND_TELECOM,
					ConsolPlugin.INSTANCE.getString("PatientSummaryRolesShallHaveAddrAndTelecom"),
					new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryRolesShouldHaveAddrAndTelecom(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Roles Should Have Addr And Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryRolesShouldHaveAddrAndTelecom(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_ROLES_SHOULD_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryRolesShouldHaveAddrAndTelecom(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Roles Should Have Addr And Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryRolesShouldHaveAddrAndTelecom(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_ROLES_SHOULD_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryRolesShouldHaveAddrAndTelecom(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_ROLES_SHOULD_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_ROLES_SHOULD_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_ROLES_SHOULD_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PATIENT_SUMMARY_ROLES_SHOULD_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_ROLES_SHOULD_HAVE_ADDR_AND_TELECOM,
					ConsolPlugin.INSTANCE.getString("PatientSummaryRolesShouldHaveAddrAndTelecom"),
					new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryOrganizationsHaveContactInfo(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Organizations Have Contact Info</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryOrganizationsHaveContactInfo(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_ORGANIZATIONS_HAVE_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryOrganizationsHaveContactInfo(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Organizations Have Contact Info</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryOrganizationsHaveContactInfo(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_ORGANIZATIONS_HAVE_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryOrganizationsHaveContactInfo(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_ORGANIZATIONS_HAVE_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_ORGANIZATIONS_HAVE_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_ORGANIZATIONS_HAVE_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PATIENT_SUMMARY_ORGANIZATIONS_HAVE_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_ORGANIZATIONS_HAVE_CONTACT_INFO,
					ConsolPlugin.INSTANCE.getString("PatientSummaryOrganizationsHaveContactInfo"),
					new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryTimePreciseToDay(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Time Precise To Day</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryTimePreciseToDay(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryTimePreciseToDay(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Time Precise To Day</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryTimePreciseToDay(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryTimePreciseToDay(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_TIME_PRECISE_TO_DAY,
					ConsolPlugin.INSTANCE.getString("PatientSummaryTimePreciseToDay"), new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryTimePreciseToYear(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Time Precise To Year</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryTimePreciseToYear(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "cda::OrganizationPartOf.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject)-> union(  cda::MaintainedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union( cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::ServiceEvent.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::EncounterParticipant.allInstances()->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(self.participant->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(cda::OrganizationPartOf.allInstances().effectiveTime->union(cda::MaintainedEntity.allInstances().effectiveTime)->union( cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::ServiceEvent.allInstances().effectiveTime)->union(cda::EncounterParticipant.allInstances().time)->union(self.participant.time)->select(current : datatypes::IVL_TS  |  ((not current.low.oclIsUndefined()) and (current.low.value.oclIsUndefined() or current.low.value.size() < 4)) or ((not current.center.oclIsUndefined()) and (current.center.value.oclIsUndefined() or current.center.value.size() < 4)) or ((not current.high.oclIsUndefined()) and (current.high.value.oclIsUndefined() or current.high.value.size() < 4)) or (current.low.oclIsUndefined() and current.center.oclIsUndefined() and current.high.oclIsUndefined()) ).oclAsType( ecore::EObject))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryTimePreciseToYear(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Time Precise To Year</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryTimePreciseToYear(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::OrganizationPartOf.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject)-> union(  cda::MaintainedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union( cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::ServiceEvent.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::EncounterParticipant.allInstances()->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(self.participant->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(cda::OrganizationPartOf.allInstances().effectiveTime->union(cda::MaintainedEntity.allInstances().effectiveTime)->union( cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::ServiceEvent.allInstances().effectiveTime)->union(cda::EncounterParticipant.allInstances().time)->union(self.participant.time)->select(current : datatypes::IVL_TS  |  ((not current.low.oclIsUndefined()) and (current.low.value.oclIsUndefined() or current.low.value.size() < 4)) or ((not current.center.oclIsUndefined()) and (current.center.value.oclIsUndefined() or current.center.value.size() < 4)) or ((not current.high.oclIsUndefined()) and (current.high.value.oclIsUndefined() or current.high.value.size() < 4)) or (current.low.oclIsUndefined() and current.center.oclIsUndefined() and current.high.oclIsUndefined()) ).oclAsType( ecore::EObject))
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryTimePreciseToYear(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_TIME_PRECISE_TO_YEAR,
					ConsolPlugin.INSTANCE.getString("PatientSummaryTimePreciseToYear"), new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryTelephoneMatchesRegex(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Telephone Matches Regex</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryTelephoneMatchesRegex(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_TELEPHONE_MATCHES_REGEX__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryTelephoneMatchesRegex(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Telephone Matches Regex</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryTelephoneMatchesRegex(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_TELEPHONE_MATCHES_REGEX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryTelephoneMatchesRegex(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_TELEPHONE_MATCHES_REGEX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_TELEPHONE_MATCHES_REGEX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_TELEPHONE_MATCHES_REGEX__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_TELEPHONE_MATCHES_REGEX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_TELEPHONE_MATCHES_REGEX,
					ConsolPlugin.INSTANCE.getString("PatientSummaryTelephoneMatchesRegex"),
					new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryHasTelephoneDialingDigits(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Telephone Dialing Digits</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryHasTelephoneDialingDigits(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_HAS_TELEPHONE_DIALING_DIGITS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryHasTelephoneDialingDigits(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Telephone Dialing Digits</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryHasTelephoneDialingDigits(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_HAS_TELEPHONE_DIALING_DIGITS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryHasTelephoneDialingDigits(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_HAS_TELEPHONE_DIALING_DIGITS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_HAS_TELEPHONE_DIALING_DIGITS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_HAS_TELEPHONE_DIALING_DIGITS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_HAS_TELEPHONE_DIALING_DIGITS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_HAS_TELEPHONE_DIALING_DIGITS,
					ConsolPlugin.INSTANCE.getString("PatientSummaryHasTelephoneDialingDigits"),
					new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryUnknownTelephoneUsesNullFlavor(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Unknown Telephone Uses Null Flavor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryUnknownTelephoneUsesNullFlavor(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_UNKNOWN_TELEPHONE_USES_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryUnknownTelephoneUsesNullFlavor(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Unknown Telephone Uses Null Flavor</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryUnknownTelephoneUsesNullFlavor(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_UNKNOWN_TELEPHONE_USES_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryUnknownTelephoneUsesNullFlavor(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_UNKNOWN_TELEPHONE_USES_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_UNKNOWN_TELEPHONE_USES_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_UNKNOWN_TELEPHONE_USES_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PATIENT_SUMMARY_UNKNOWN_TELEPHONE_USES_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_UNKNOWN_TELEPHONE_USES_NULL_FLAVOR,
					ConsolPlugin.INSTANCE.getString("PatientSummaryUnknownTelephoneUsesNullFlavor"),
					new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryTypeIdExtension(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Type Id Extension</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryTypeIdExtension(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.typeId.extension = 'POCD_HD000040'";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryTypeIdExtension(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Type Id Extension</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryTypeIdExtension(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.typeId.extension = 'POCD_HD000040'
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryTypeIdExtension(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_TYPE_ID_EXTENSION,
					ConsolPlugin.INSTANCE.getString("PatientSummaryTypeIdExtension"), new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryIdRootFormat(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Id Root Format</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryIdRootFormat(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_ID_ROOT_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.id.matches('root','([0-2])(.([1-9][0-9]*|0))+') or self.id.matches('root','([A-Fa-f0-9]{8})(\\\\-[A-Fa-f0-9]{4}){3}(\\\\-[A-Fa-f0-9]{12})')";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryIdRootFormat(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Id Root Format</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryIdRootFormat(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_ID_ROOT_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.id.matches('root','([0-2])(.([1-9][0-9]*|0))+') or self.id.matches('root','([A-Fa-f0-9]{8})(\\\\-[A-Fa-f0-9]{4}){3}(\\\\-[A-Fa-f0-9]{12})')
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryIdRootFormat(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_ID_ROOT_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_ID_ROOT_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_ID_ROOT_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_ID_ROOT_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_ID_ROOT_FORMAT,
					ConsolPlugin.INSTANCE.getString("PatientSummaryIdRootFormat"), new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryOidLength(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Oid Length</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryOidLength(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_OID_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.id->select((not id.root.oclIsUndefined()) and id.root.size() > 64 )";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryOidLength(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Oid Length</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryOidLength(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_OID_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.id->select((not id.root.oclIsUndefined()) and id.root.size() > 64 )
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryOidLength(PatientSummary patientSummary, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_OID_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_OID_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_OID_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_OID_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_OID_LENGTH,
					ConsolPlugin.INSTANCE.getString("PatientSummaryOidLength"), new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryLanguageCodeForm(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Language Code Form</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryLanguageCodeForm(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_LANGUAGE_CODE_FORM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.languageCode.matches('code','(([a-z]{2})(\\\\-[A-Z]{2})?)')";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryLanguageCodeForm(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Language Code Form</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryLanguageCodeForm(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_LANGUAGE_CODE_FORM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.languageCode.matches('code','(([a-z]{2})(\\\\-[A-Z]{2})?)')
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryLanguageCodeForm(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_LANGUAGE_CODE_FORM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_LANGUAGE_CODE_FORM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_LANGUAGE_CODE_FORM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_LANGUAGE_CODE_FORM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_LANGUAGE_CODE_FORM,
					ConsolPlugin.INSTANCE.getString("PatientSummaryLanguageCodeForm"), new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummarySetIdAndVersionNumber(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Set Id And Version Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummarySetIdAndVersionNumber(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_SET_ID_AND_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.setId.oclIsUndefined() and self.versionNumber.oclIsUndefined())"
			+ "   xor (not self.setId.oclIsUndefined() and not self.versionNumber.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummarySetIdAndVersionNumber(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Set Id And Version Number</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummarySetIdAndVersionNumber(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_SET_ID_AND_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.setId.oclIsUndefined() and self.versionNumber.oclIsUndefined())
	 *    xor (not self.setId.oclIsUndefined() and not self.versionNumber.oclIsUndefined())
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummarySetIdAndVersionNumber(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_SET_ID_AND_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_SET_ID_AND_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_SET_ID_AND_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_SET_ID_AND_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_SET_ID_AND_VERSION_NUMBER,
					ConsolPlugin.INSTANCE.getString("PatientSummarySetIdAndVersionNumber"),
					new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummarySetIdAndIdAreUnique(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Set Id And Id Are Unique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummarySetIdAndIdAreUnique(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_SET_ID_AND_ID_ARE_UNIQUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(not self.setId.oclIsUndefined() and not self.id.oclIsUndefined())"
			+ "   implies (self.setId.root <> self.id.root or self.setId.extension <> self.id.extension)";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummarySetIdAndIdAreUnique(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Set Id And Id Are Unique</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummarySetIdAndIdAreUnique(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_SET_ID_AND_ID_ARE_UNIQUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (not self.setId.oclIsUndefined() and not self.id.oclIsUndefined())
	 *    implies (self.setId.root <> self.id.root or self.setId.extension <> self.id.extension)
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummarySetIdAndIdAreUnique(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_SET_ID_AND_ID_ARE_UNIQUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_SET_ID_AND_ID_ARE_UNIQUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_SET_ID_AND_ID_ARE_UNIQUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_SET_ID_AND_ID_ARE_UNIQUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_SET_ID_AND_ID_ARE_UNIQUE,
					ConsolPlugin.INSTANCE.getString("PatientSummarySetIdAndIdAreUnique"),
					new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryCopyTimeNotPresent(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Copy Time Not Present</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryCopyTimeNotPresent(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_COPY_TIME_NOT_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.copyTime.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryCopyTimeNotPresent(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Copy Time Not Present</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryCopyTimeNotPresent(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_COPY_TIME_NOT_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.copyTime.oclIsUndefined()
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryCopyTimeNotPresent(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_COPY_TIME_NOT_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_COPY_TIME_NOT_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_COPY_TIME_NOT_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_COPY_TIME_NOT_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_COPY_TIME_NOT_PRESENT,
					ConsolPlugin.INSTANCE.getString("PatientSummaryCopyTimeNotPresent"),
					new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryHasRecordTargetPatientRole(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Record Target Patient Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryHasRecordTargetPatientRole(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_HAS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->size() > 0 and self.recordTarget->exists(target : cda::RecordTarget | not target.patientRole.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryHasRecordTargetPatientRole(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Record Target Patient Role</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryHasRecordTargetPatientRole(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_HAS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->size() > 0 and self.recordTarget->exists(target : cda::RecordTarget | not target.patientRole.oclIsUndefined())
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryHasRecordTargetPatientRole(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_HAS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_HAS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_HAS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PATIENT_SUMMARY_HAS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_HAS_RECORD_TARGET_PATIENT_ROLE,
					ConsolPlugin.INSTANCE.getString("PatientSummaryHasRecordTargetPatientRole"),
					new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryHasPatientBirthTime(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Patient Birth Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryHasPatientBirthTime(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_HAS_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->forAll(target : cda::RecordTarget | not target.patientRole.oclIsUndefined()"
			+ "   implies (not target.patientRole.patient.birthTime.value.oclIsUndefined()"
			+ "      or not target.patientRole.patient.birthTime.nullFlavor.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryHasPatientBirthTime(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Patient Birth Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryHasPatientBirthTime(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_HAS_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->forAll(target : cda::RecordTarget | not target.patientRole.oclIsUndefined()
	 *    implies (not target.patientRole.patient.birthTime.value.oclIsUndefined()
	 *       or not target.patientRole.patient.birthTime.nullFlavor.oclIsUndefined()))
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryHasPatientBirthTime(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_HAS_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_HAS_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_HAS_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_HAS_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_HAS_PATIENT_BIRTH_TIME,
					ConsolPlugin.INSTANCE.getString("PatientSummaryHasPatientBirthTime"),
					new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryHasAdministrativeGenderCode(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Administrative Gender Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryHasAdministrativeGenderCode(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_HAS_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->forAll(target : cda::RecordTarget | not target.patientRole.oclIsUndefined()"
			+ "   implies (not target.patientRole.patient.administrativeGenderCode.code.oclIsUndefined()"
			+ "      or not target.patientRole.patient.administrativeGenderCode.nullFlavor.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryHasAdministrativeGenderCode(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Administrative Gender Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryHasAdministrativeGenderCode(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_HAS_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->forAll(target : cda::RecordTarget | not target.patientRole.oclIsUndefined()
	 *    implies (not target.patientRole.patient.administrativeGenderCode.code.oclIsUndefined()
	 *       or not target.patientRole.patient.administrativeGenderCode.nullFlavor.oclIsUndefined()))
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryHasAdministrativeGenderCode(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_HAS_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_HAS_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_HAS_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PATIENT_SUMMARY_HAS_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_HAS_ADMINISTRATIVE_GENDER_CODE,
					ConsolPlugin.INSTANCE.getString("PatientSummaryHasAdministrativeGenderCode"),
					new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryHasProviderOrganization(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Provider Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryHasProviderOrganization(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_HAS_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->exists(target : cda::RecordTarget | not target.patientRole.providerOrganization.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryHasProviderOrganization(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Provider Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryHasProviderOrganization(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_HAS_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->exists(target : cda::RecordTarget | not target.patientRole.providerOrganization.oclIsUndefined())
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryHasProviderOrganization(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_HAS_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_HAS_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_HAS_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_HAS_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_HAS_PROVIDER_ORGANIZATION,
					ConsolPlugin.INSTANCE.getString("PatientSummaryHasProviderOrganization"),
					new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryHasAuthorTime(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Author Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryHasAuthorTime(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->forAll(author : cda::Author | not author.time.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryHasAuthorTime(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Author Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryHasAuthorTime(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.author->forAll(author : cda::Author | not author.time.oclIsUndefined())
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryHasAuthorTime(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_HAS_AUTHOR_TIME,
					ConsolPlugin.INSTANCE.getString("PatientSummaryHasAuthorTime"), new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryHasAssignedAuthorId(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Assigned Author Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryHasAssignedAuthorId(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->forAll(author : cda::Author | author.assignedAuthor.id->size() > 0)";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryHasAssignedAuthorId(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Assigned Author Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryHasAssignedAuthorId(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.author->forAll(author : cda::Author | author.assignedAuthor.id->size() > 0)
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryHasAssignedAuthorId(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_HAS_ASSIGNED_AUTHOR_ID,
					ConsolPlugin.INSTANCE.getString("PatientSummaryHasAssignedAuthorId"),
					new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryHasAssignedAuthorPersonOrDevice(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Assigned Author Person Or Device</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryHasAssignedAuthorPersonOrDevice(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->forAll(author : cda::Author | not author.assignedAuthor.assignedPerson.oclIsUndefined() "
			+ "   or not author.assignedAuthor.assignedAuthoringDevice.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryHasAssignedAuthorPersonOrDevice(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Assigned Author Person Or Device</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryHasAssignedAuthorPersonOrDevice(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.author->forAll(author : cda::Author | not author.assignedAuthor.assignedPerson.oclIsUndefined() 
	 *    or not author.assignedAuthor.assignedAuthoringDevice.oclIsUndefined())
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryHasAssignedAuthorPersonOrDevice(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PATIENT_SUMMARY_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE,
					ConsolPlugin.INSTANCE.getString("PatientSummaryHasAssignedAuthorPersonOrDevice"),
					new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryHasDataEntererAssignedPerson(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Data Enterer Assigned Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryHasDataEntererAssignedPerson(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_HAS_DATA_ENTERER_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.dataEnterer.oclIsUndefined() implies not self.dataEnterer.assignedEntity.assignedPerson.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryHasDataEntererAssignedPerson(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Data Enterer Assigned Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryHasDataEntererAssignedPerson(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_HAS_DATA_ENTERER_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.dataEnterer.oclIsUndefined() implies not self.dataEnterer.assignedEntity.assignedPerson.oclIsUndefined()
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryHasDataEntererAssignedPerson(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_HAS_DATA_ENTERER_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_HAS_DATA_ENTERER_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_HAS_DATA_ENTERER_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PATIENT_SUMMARY_HAS_DATA_ENTERER_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_HAS_DATA_ENTERER_ASSIGNED_PERSON,
					ConsolPlugin.INSTANCE.getString("PatientSummaryHasDataEntererAssignedPerson"),
					new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryHasDataEntererTime(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Data Enterer Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryHasDataEntererTime(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_HAS_DATA_ENTERER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.dataEnterer.oclIsUndefined() implies not self.dataEnterer.time.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryHasDataEntererTime(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Data Enterer Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryHasDataEntererTime(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_HAS_DATA_ENTERER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.dataEnterer.oclIsUndefined() implies not self.dataEnterer.time.oclIsUndefined()
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryHasDataEntererTime(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_HAS_DATA_ENTERER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_HAS_DATA_ENTERER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_HAS_DATA_ENTERER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_HAS_DATA_ENTERER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_HAS_DATA_ENTERER_TIME,
					ConsolPlugin.INSTANCE.getString("PatientSummaryHasDataEntererTime"),
					new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryHasInformant(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Informant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryHasInformant(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_HAS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->size() > 0";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryHasInformant(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Informant</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryHasInformant(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_HAS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.informant->size() > 0
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryHasInformant(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_HAS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_HAS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_HAS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_HAS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_HAS_INFORMANT,
					ConsolPlugin.INSTANCE.getString("PatientSummaryHasInformant"), new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryHasInformantAssignedPersonOrRelatedPerson(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Informant Assigned Person Or Related Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryHasInformantAssignedPersonOrRelatedPerson(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->forAll(i : cda::Informant12 | not i.assignedEntity.assignedPerson.oclIsUndefined()"
			+ "   or not i.relatedEntity.relatedPerson.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryHasInformantAssignedPersonOrRelatedPerson(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Has Informant Assigned Person Or Related Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryHasInformantAssignedPersonOrRelatedPerson(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.informant->forAll(i : cda::Informant12 | not i.assignedEntity.assignedPerson.oclIsUndefined()
	 *    or not i.relatedEntity.relatedPerson.oclIsUndefined())
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryHasInformantAssignedPersonOrRelatedPerson(
			PatientSummary patientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PATIENT_SUMMARY_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON,
					ConsolPlugin.INSTANCE.getString("PatientSummaryHasInformantAssignedPersonOrRelatedPerson"),
					new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryLegalAuthenticatorHasAssignedPerson(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Legal Authenticator Has Assigned Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryLegalAuthenticatorHasAssignedPerson(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.legalAuthenticator.oclIsUndefined() implies not self.legalAuthenticator.assignedEntity.assignedPerson.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryLegalAuthenticatorHasAssignedPerson(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Legal Authenticator Has Assigned Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryLegalAuthenticatorHasAssignedPerson(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.legalAuthenticator.oclIsUndefined() implies not self.legalAuthenticator.assignedEntity.assignedPerson.oclIsUndefined()
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryLegalAuthenticatorHasAssignedPerson(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PATIENT_SUMMARY_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON,
					ConsolPlugin.INSTANCE.getString("PatientSummaryLegalAuthenticatorHasAssignedPerson"),
					new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryAuthenticatorHasAssignedPerson(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Authenticator Has Assigned Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryAuthenticatorHasAssignedPerson(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authenticator->forAll(auth : cda::Authenticator | auth.assignedEntity->forAll(entity : cda::AssignedEntity |"
			+ "   not entity.assignedPerson.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryAuthenticatorHasAssignedPerson(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Authenticator Has Assigned Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryAuthenticatorHasAssignedPerson(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.authenticator->forAll(auth : cda::Authenticator | auth.assignedEntity->forAll(entity : cda::AssignedEntity |
	 *    not entity.assignedPerson.oclIsUndefined()))
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryAuthenticatorHasAssignedPerson(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PATIENT_SUMMARY_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_AUTHENTICATOR_HAS_ASSIGNED_PERSON,
					ConsolPlugin.INSTANCE.getString("PatientSummaryAuthenticatorHasAssignedPerson"),
					new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryTimePreciseToSecond(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Time Precise To Second</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryTimePreciseToSecond(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_TIME_PRECISE_TO_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryTimePreciseToSecond(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Time Precise To Second</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryTimePreciseToSecond(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_TIME_PRECISE_TO_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryTimePreciseToSecond(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_TIME_PRECISE_TO_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_TIME_PRECISE_TO_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_TIME_PRECISE_TO_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_TIME_PRECISE_TO_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_TIME_PRECISE_TO_SECOND,
					ConsolPlugin.INSTANCE.getString("PatientSummaryTimePreciseToSecond"),
					new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryTimePreciseToYearAndDay(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Time Precise To Year And Day</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryTimePreciseToYearAndDay(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_TIME_PRECISE_TO_YEAR_AND_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "cda::OrganizationPartOf.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject)-> union(  cda::MaintainedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union( cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::ServiceEvent.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::EncounterParticipant.allInstances()->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(self.participant->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(cda::OrganizationPartOf.allInstances().effectiveTime->union(cda::MaintainedEntity.allInstances().effectiveTime)->union( cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::ServiceEvent.allInstances().effectiveTime)->union(cda::EncounterParticipant.allInstances().time)->union(self.participant.time)->select(current : datatypes::IVL_TS  |  ((not current.low.oclIsUndefined()) and (current.low.value.oclIsUndefined() or current.low.value.size() < 8)) or ((not current.center.oclIsUndefined()) and (current.center.value.oclIsUndefined() or current.center.value.size() < 8)) or ((not current.high.oclIsUndefined()) and (current.high.value.oclIsUndefined() or current.high.value.size() < 8)) or (current.low.oclIsUndefined() and current.center.oclIsUndefined() and current.high.oclIsUndefined()) ).oclAsType( ecore::EObject))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryTimePreciseToYearAndDay(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Time Precise To Year And Day</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryTimePreciseToYearAndDay(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_TIME_PRECISE_TO_YEAR_AND_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::OrganizationPartOf.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject)-> union(  cda::MaintainedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union( cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::ServiceEvent.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::EncounterParticipant.allInstances()->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(self.participant->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(cda::OrganizationPartOf.allInstances().effectiveTime->union(cda::MaintainedEntity.allInstances().effectiveTime)->union( cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::ServiceEvent.allInstances().effectiveTime)->union(cda::EncounterParticipant.allInstances().time)->union(self.participant.time)->select(current : datatypes::IVL_TS  |  ((not current.low.oclIsUndefined()) and (current.low.value.oclIsUndefined() or current.low.value.size() < 8)) or ((not current.center.oclIsUndefined()) and (current.center.value.oclIsUndefined() or current.center.value.size() < 8)) or ((not current.high.oclIsUndefined()) and (current.high.value.oclIsUndefined() or current.high.value.size() < 8)) or (current.low.oclIsUndefined() and current.center.oclIsUndefined() and current.high.oclIsUndefined()) ).oclAsType( ecore::EObject))
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryTimePreciseToYearAndDay(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_TIME_PRECISE_TO_YEAR_AND_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_TIME_PRECISE_TO_YEAR_AND_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_TIME_PRECISE_TO_YEAR_AND_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_TIME_PRECISE_TO_YEAR_AND_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_TIME_PRECISE_TO_YEAR_AND_DAY,
					ConsolPlugin.INSTANCE.getString("PatientSummaryTimePreciseToYearAndDay"),
					new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryHealthcareProvider(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Healthcare Provider</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryHealthcareProvider(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_HEALTHCARE_PROVIDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf.serviceEvent.performer->size() > 0";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryHealthcareProvider(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Healthcare Provider</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryHealthcareProvider(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_HEALTHCARE_PROVIDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.documentationOf.serviceEvent.performer->size() > 0
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryHealthcareProvider(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_HEALTHCARE_PROVIDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_HEALTHCARE_PROVIDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_HEALTHCARE_PROVIDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_HEALTHCARE_PROVIDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_HEALTHCARE_PROVIDER,
					ConsolPlugin.INSTANCE.getString("PatientSummaryHealthcareProvider"),
					new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryTemplateId(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryTemplateId(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.32.1')";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryTemplateId(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryTemplateId(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.32.1')
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryTemplateId(PatientSummary patientSummary, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("PatientSummaryTemplateId"), new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryRealmCode(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Realm Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryRealmCode(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.realmCode->isEmpty() or self.realmCode->exists(element | element.isNullFlavorUndefined())) implies (self.realmCode->size() = 1 and self.realmCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = element.oclAsType(datatypes::CS) in " + "value.code = 'US'))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryRealmCode(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Realm Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryRealmCode(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.realmCode->isEmpty() or self.realmCode->exists(element | element.isNullFlavorUndefined())) implies (self.realmCode->size() = 1 and self.realmCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = element.oclAsType(datatypes::CS) in 
	 * value.code = 'US'))
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryRealmCode(PatientSummary patientSummary, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_REALM_CODE,
					ConsolPlugin.INSTANCE.getString("PatientSummaryRealmCode"), new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryTypeId(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Type Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryTypeId(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.typeId.oclIsUndefined() or self.typeId.isNullFlavorUndefined()) implies (not self.typeId.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryTypeId(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Type Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryTypeId(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.typeId.oclIsUndefined() or self.typeId.isNullFlavorUndefined()) implies (not self.typeId.oclIsUndefined())
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryTypeId(PatientSummary patientSummary, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_TYPE_ID,
					ConsolPlugin.INSTANCE.getString("PatientSummaryTypeId"), new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryId(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryId(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id.oclIsUndefined() or self.id.isNullFlavorUndefined()) implies (not self.id.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryId(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryId(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id.oclIsUndefined() or self.id.isNullFlavorUndefined()) implies (not self.id.oclIsUndefined())
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryId(PatientSummary patientSummary, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_ID,
					ConsolPlugin.INSTANCE.getString("PatientSummaryId"), new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryCode(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryCode(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryCode(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryCode(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryCode(PatientSummary patientSummary, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_CODE,
					ConsolPlugin.INSTANCE.getString("PatientSummaryCode"), new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryTitle(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryTitle(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryTitle(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryTitle(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryTitle(PatientSummary patientSummary, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_TITLE,
					ConsolPlugin.INSTANCE.getString("PatientSummaryTitle"), new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryEffectiveTime(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryEffectiveTime(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryEffectiveTime(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryEffectiveTime(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryEffectiveTime(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_EFFECTIVE_TIME,
					ConsolPlugin.INSTANCE.getString("PatientSummaryEffectiveTime"), new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryLanguageCode(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Language Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryLanguageCode(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.languageCode.oclIsUndefined() or self.languageCode.isNullFlavorUndefined()) implies (not self.languageCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryLanguageCode(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Language Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryLanguageCode(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.languageCode.oclIsUndefined() or self.languageCode.isNullFlavorUndefined()) implies (not self.languageCode.oclIsUndefined())
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryLanguageCode(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_LANGUAGE_CODE,
					ConsolPlugin.INSTANCE.getString("PatientSummaryLanguageCode"), new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryAdvanceDirectivesSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Advance Directives Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryAdvanceDirectivesSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_ADVANCE_DIRECTIVES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdvanceDirectivesSection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryAdvanceDirectivesSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Advance Directives Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryAdvanceDirectivesSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_ADVANCE_DIRECTIVES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdvanceDirectivesSection))
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryAdvanceDirectivesSection(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_ADVANCE_DIRECTIVES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_ADVANCE_DIRECTIVES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_ADVANCE_DIRECTIVES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_ADVANCE_DIRECTIVES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_ADVANCE_DIRECTIVES_SECTION,
					ConsolPlugin.INSTANCE.getString("PatientSummaryAdvanceDirectivesSection"),
					new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryAllergiesReactionsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Allergies Reactions Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryAllergiesReactionsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_ALLERGIES_REACTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesReactionsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryAllergiesReactionsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Allergies Reactions Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryAllergiesReactionsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_ALLERGIES_REACTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesReactionsSection))
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryAllergiesReactionsSection(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_ALLERGIES_REACTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_ALLERGIES_REACTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_ALLERGIES_REACTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_ALLERGIES_REACTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_ALLERGIES_REACTIONS_SECTION,
					ConsolPlugin.INSTANCE.getString("PatientSummaryAllergiesReactionsSection"),
					new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryProblemListSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Problem List Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryProblemListSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_PROBLEM_LIST_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemListSection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryProblemListSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Problem List Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryProblemListSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_PROBLEM_LIST_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemListSection))
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryProblemListSection(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_PROBLEM_LIST_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_PROBLEM_LIST_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_PROBLEM_LIST_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_PROBLEM_LIST_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_PROBLEM_LIST_SECTION,
					ConsolPlugin.INSTANCE.getString("PatientSummaryProblemListSection"),
					new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryEncountersSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Encounters Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryEncountersSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_ENCOUNTERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::EncountersSection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryEncountersSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Encounters Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryEncountersSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_ENCOUNTERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::EncountersSection))
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryEncountersSection(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_ENCOUNTERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_ENCOUNTERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_ENCOUNTERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_ENCOUNTERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_ENCOUNTERS_SECTION,
					ConsolPlugin.INSTANCE.getString("PatientSummaryEncountersSection"), new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryImmunizationsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Immunizations Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryImmunizationsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryImmunizationsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Immunizations Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryImmunizationsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSection))
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryImmunizationsSection(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_IMMUNIZATIONS_SECTION,
					ConsolPlugin.INSTANCE.getString("PatientSummaryImmunizationsSection"),
					new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryPayersSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Payers Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryPayersSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_PAYERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PayersSection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryPayersSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Payers Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryPayersSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_PAYERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PayersSection))
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryPayersSection(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_PAYERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_PAYERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_PAYERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_PAYERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_PAYERS_SECTION,
					ConsolPlugin.INSTANCE.getString("PatientSummaryPayersSection"), new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryMedicationsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Medications Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryMedicationsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryMedicationsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Medications Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryMedicationsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSection))
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryMedicationsSection(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_MEDICATIONS_SECTION,
					ConsolPlugin.INSTANCE.getString("PatientSummaryMedicationsSection"),
					new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryPlanOfCareSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Plan Of Care Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryPlanOfCareSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryPlanOfCareSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Plan Of Care Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryPlanOfCareSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection))
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryPlanOfCareSection(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_PLAN_OF_CARE_SECTION,
					ConsolPlugin.INSTANCE.getString("PatientSummaryPlanOfCareSection"), new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryPregnancyHistorySection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Pregnancy History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryPregnancyHistorySection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_PREGNANCY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PregnancyHistorySection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryPregnancyHistorySection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Pregnancy History Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryPregnancyHistorySection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_PREGNANCY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PregnancyHistorySection))
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryPregnancyHistorySection(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_PREGNANCY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_PREGNANCY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_PREGNANCY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_PREGNANCY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_PREGNANCY_HISTORY_SECTION,
					ConsolPlugin.INSTANCE.getString("PatientSummaryPregnancyHistorySection"),
					new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummarySurgeriesSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Surgeries Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummarySurgeriesSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_SURGERIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SurgeriesSection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummarySurgeriesSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Surgeries Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummarySurgeriesSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_SURGERIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SurgeriesSection))
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummarySurgeriesSection(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_SURGERIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_SURGERIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_SURGERIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_SURGERIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_SURGERIES_SECTION,
					ConsolPlugin.INSTANCE.getString("PatientSummarySurgeriesSection"), new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryVitalSignsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Vital Signs Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryVitalSignsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryVitalSignsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Vital Signs Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryVitalSignsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSection))
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryVitalSignsSection(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_VITAL_SIGNS_SECTION,
					ConsolPlugin.INSTANCE.getString("PatientSummaryVitalSignsSection"), new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryDiagnosticResultsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Diagnostic Results Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryDiagnosticResultsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_DIAGNOSTIC_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DiagnosticResultsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryDiagnosticResultsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Diagnostic Results Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryDiagnosticResultsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_DIAGNOSTIC_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DiagnosticResultsSection))
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryDiagnosticResultsSection(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_DIAGNOSTIC_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_DIAGNOSTIC_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_DIAGNOSTIC_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_DIAGNOSTIC_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_DIAGNOSTIC_RESULTS_SECTION,
					ConsolPlugin.INSTANCE.getString("PatientSummaryDiagnosticResultsSection"),
					new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryFamilyHistorySection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Family History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryFamilyHistorySection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryFamilyHistorySection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Family History Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryFamilyHistorySection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection))
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryFamilyHistorySection(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_FAMILY_HISTORY_SECTION,
					ConsolPlugin.INSTANCE.getString("PatientSummaryFamilyHistorySection"),
					new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummarySocialHistorySection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Social History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummarySocialHistorySection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummarySocialHistorySection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Social History Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummarySocialHistorySection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection))
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummarySocialHistorySection(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_SOCIAL_HISTORY_SECTION,
					ConsolPlugin.INSTANCE.getString("PatientSummarySocialHistorySection"),
					new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryResultsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Results Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryResultsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryResultsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Results Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryResultsSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSection))
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryResultsSection(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_RESULTS_SECTION,
					ConsolPlugin.INSTANCE.getString("PatientSummaryResultsSection"), new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryMedicalEquipmentSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Medical Equipment Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryMedicalEquipmentSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicalEquipmentSection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryMedicalEquipmentSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Medical Equipment Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryMedicalEquipmentSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicalEquipmentSection))
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryMedicalEquipmentSection(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_MEDICAL_EQUIPMENT_SECTION,
					ConsolPlugin.INSTANCE.getString("PatientSummaryMedicalEquipmentSection"),
					new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryFunctionalStatusSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Functional Status Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryFunctionalStatusSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FunctionalStatusSection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryFunctionalStatusSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Functional Status Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryFunctionalStatusSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FunctionalStatusSection))
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryFunctionalStatusSection(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_FUNCTIONAL_STATUS_SECTION,
					ConsolPlugin.INSTANCE.getString("PatientSummaryFunctionalStatusSection"),
					new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientSummaryPurposeSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Purpose Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryPurposeSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_SUMMARY_PURPOSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PurposeSection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientSummaryPurposeSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Summary Purpose Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientSummaryPurposeSection(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_SUMMARY_PURPOSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PurposeSection))
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePatientSummaryPurposeSection(PatientSummary patientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_SUMMARY_PURPOSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_SUMMARY);
			try {
				VALIDATE_PATIENT_SUMMARY_PURPOSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_SUMMARY_PURPOSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_SUMMARY_PURPOSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_PURPOSE_SECTION,
					ConsolPlugin.INSTANCE.getString("PatientSummaryPurposeSection"), new Object[] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getAdvanceDirectivesSection(PatientSummary) <em>Get Advance Directives Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvanceDirectivesSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ADVANCE_DIRECTIVES_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdvanceDirectivesSection))->asSequence()->first().oclAsType(consol::AdvanceDirectivesSection)";

	/**
	 * The cached OCL query for the '{@link #getAdvanceDirectivesSection(PatientSummary) <em>Get Advance Directives Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvanceDirectivesSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ADVANCE_DIRECTIVES_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdvanceDirectivesSection))->asSequence()->first().oclAsType(consol::AdvanceDirectivesSection)
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static AdvanceDirectivesSection getAdvanceDirectivesSection(PatientSummary patientSummary) {
		if (GET_ADVANCE_DIRECTIVES_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PATIENT_SUMMARY,
				ConsolPackage.Literals.PATIENT_SUMMARY.getEAllOperations().get(98));
			try {
				GET_ADVANCE_DIRECTIVES_SECTION__EOCL_QRY = helper.createQuery(GET_ADVANCE_DIRECTIVES_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ADVANCE_DIRECTIVES_SECTION__EOCL_QRY);
		return (AdvanceDirectivesSection) query.evaluate(patientSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAllergiesReactionsSection(PatientSummary) <em>Get Allergies Reactions Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergiesReactionsSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ALLERGIES_REACTIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesReactionsSection))->asSequence()->first().oclAsType(consol::AllergiesReactionsSection)";

	/**
	 * The cached OCL query for the '{@link #getAllergiesReactionsSection(PatientSummary) <em>Get Allergies Reactions Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergiesReactionsSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ALLERGIES_REACTIONS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesReactionsSection))->asSequence()->first().oclAsType(consol::AllergiesReactionsSection)
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static AllergiesReactionsSection getAllergiesReactionsSection(PatientSummary patientSummary) {
		if (GET_ALLERGIES_REACTIONS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PATIENT_SUMMARY,
				ConsolPackage.Literals.PATIENT_SUMMARY.getEAllOperations().get(99));
			try {
				GET_ALLERGIES_REACTIONS_SECTION__EOCL_QRY = helper.createQuery(GET_ALLERGIES_REACTIONS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ALLERGIES_REACTIONS_SECTION__EOCL_QRY);
		return (AllergiesReactionsSection) query.evaluate(patientSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemListSection(PatientSummary) <em>Get Problem List Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemListSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_LIST_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemListSection))->asSequence()->first().oclAsType(consol::ProblemListSection)";

	/**
	 * The cached OCL query for the '{@link #getProblemListSection(PatientSummary) <em>Get Problem List Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemListSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_LIST_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemListSection))->asSequence()->first().oclAsType(consol::ProblemListSection)
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static ProblemListSection getProblemListSection(PatientSummary patientSummary) {
		if (GET_PROBLEM_LIST_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PATIENT_SUMMARY,
				ConsolPackage.Literals.PATIENT_SUMMARY.getEAllOperations().get(100));
			try {
				GET_PROBLEM_LIST_SECTION__EOCL_QRY = helper.createQuery(GET_PROBLEM_LIST_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_LIST_SECTION__EOCL_QRY);
		return (ProblemListSection) query.evaluate(patientSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getEncountersSection(PatientSummary) <em>Get Encounters Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncountersSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ENCOUNTERS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::EncountersSection))->asSequence()->first().oclAsType(consol::EncountersSection)";

	/**
	 * The cached OCL query for the '{@link #getEncountersSection(PatientSummary) <em>Get Encounters Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncountersSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ENCOUNTERS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::EncountersSection))->asSequence()->first().oclAsType(consol::EncountersSection)
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EncountersSection getEncountersSection(PatientSummary patientSummary) {
		if (GET_ENCOUNTERS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PATIENT_SUMMARY,
				ConsolPackage.Literals.PATIENT_SUMMARY.getEAllOperations().get(101));
			try {
				GET_ENCOUNTERS_SECTION__EOCL_QRY = helper.createQuery(GET_ENCOUNTERS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ENCOUNTERS_SECTION__EOCL_QRY);
		return (EncountersSection) query.evaluate(patientSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getImmunizationsSection(PatientSummary) <em>Get Immunizations Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmunizationsSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_IMMUNIZATIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSection))->asSequence()->first().oclAsType(consol::ImmunizationsSection)";

	/**
	 * The cached OCL query for the '{@link #getImmunizationsSection(PatientSummary) <em>Get Immunizations Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmunizationsSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_IMMUNIZATIONS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSection))->asSequence()->first().oclAsType(consol::ImmunizationsSection)
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static ImmunizationsSection getImmunizationsSection(PatientSummary patientSummary) {
		if (GET_IMMUNIZATIONS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PATIENT_SUMMARY,
				ConsolPackage.Literals.PATIENT_SUMMARY.getEAllOperations().get(102));
			try {
				GET_IMMUNIZATIONS_SECTION__EOCL_QRY = helper.createQuery(GET_IMMUNIZATIONS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_IMMUNIZATIONS_SECTION__EOCL_QRY);
		return (ImmunizationsSection) query.evaluate(patientSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPayersSection(PatientSummary) <em>Get Payers Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayersSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PAYERS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PayersSection))->asSequence()->first().oclAsType(consol::PayersSection)";

	/**
	 * The cached OCL query for the '{@link #getPayersSection(PatientSummary) <em>Get Payers Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayersSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PAYERS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PayersSection))->asSequence()->first().oclAsType(consol::PayersSection)
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static PayersSection getPayersSection(PatientSummary patientSummary) {
		if (GET_PAYERS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PATIENT_SUMMARY,
				ConsolPackage.Literals.PATIENT_SUMMARY.getEAllOperations().get(103));
			try {
				GET_PAYERS_SECTION__EOCL_QRY = helper.createQuery(GET_PAYERS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PAYERS_SECTION__EOCL_QRY);
		return (PayersSection) query.evaluate(patientSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicationsSection(PatientSummary) <em>Get Medications Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationsSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSection))->asSequence()->first().oclAsType(consol::MedicationsSection)";

	/**
	 * The cached OCL query for the '{@link #getMedicationsSection(PatientSummary) <em>Get Medications Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationsSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATIONS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSection))->asSequence()->first().oclAsType(consol::MedicationsSection)
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static MedicationsSection getMedicationsSection(PatientSummary patientSummary) {
		if (GET_MEDICATIONS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PATIENT_SUMMARY,
				ConsolPackage.Literals.PATIENT_SUMMARY.getEAllOperations().get(104));
			try {
				GET_MEDICATIONS_SECTION__EOCL_QRY = helper.createQuery(GET_MEDICATIONS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATIONS_SECTION__EOCL_QRY);
		return (MedicationsSection) query.evaluate(patientSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPlanOfCareSection(PatientSummary) <em>Get Plan Of Care Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfCareSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLAN_OF_CARE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection))->asSequence()->first().oclAsType(consol::PlanOfCareSection)";

	/**
	 * The cached OCL query for the '{@link #getPlanOfCareSection(PatientSummary) <em>Get Plan Of Care Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfCareSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLAN_OF_CARE_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection))->asSequence()->first().oclAsType(consol::PlanOfCareSection)
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static PlanOfCareSection getPlanOfCareSection(PatientSummary patientSummary) {
		if (GET_PLAN_OF_CARE_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PATIENT_SUMMARY,
				ConsolPackage.Literals.PATIENT_SUMMARY.getEAllOperations().get(105));
			try {
				GET_PLAN_OF_CARE_SECTION__EOCL_QRY = helper.createQuery(GET_PLAN_OF_CARE_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PLAN_OF_CARE_SECTION__EOCL_QRY);
		return (PlanOfCareSection) query.evaluate(patientSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPregnancyHistorySection(PatientSummary) <em>Get Pregnancy History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPregnancyHistorySection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PREGNANCY_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PregnancyHistorySection))->asSequence()->first().oclAsType(consol::PregnancyHistorySection)";

	/**
	 * The cached OCL query for the '{@link #getPregnancyHistorySection(PatientSummary) <em>Get Pregnancy History Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPregnancyHistorySection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PREGNANCY_HISTORY_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PregnancyHistorySection))->asSequence()->first().oclAsType(consol::PregnancyHistorySection)
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static PregnancyHistorySection getPregnancyHistorySection(PatientSummary patientSummary) {
		if (GET_PREGNANCY_HISTORY_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PATIENT_SUMMARY,
				ConsolPackage.Literals.PATIENT_SUMMARY.getEAllOperations().get(106));
			try {
				GET_PREGNANCY_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_PREGNANCY_HISTORY_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PREGNANCY_HISTORY_SECTION__EOCL_QRY);
		return (PregnancyHistorySection) query.evaluate(patientSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getSurgeriesSection(PatientSummary) <em>Get Surgeries Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurgeriesSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SURGERIES_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SurgeriesSection))->asSequence()->first().oclAsType(consol::SurgeriesSection)";

	/**
	 * The cached OCL query for the '{@link #getSurgeriesSection(PatientSummary) <em>Get Surgeries Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurgeriesSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SURGERIES_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SurgeriesSection))->asSequence()->first().oclAsType(consol::SurgeriesSection)
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static SurgeriesSection getSurgeriesSection(PatientSummary patientSummary) {
		if (GET_SURGERIES_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PATIENT_SUMMARY,
				ConsolPackage.Literals.PATIENT_SUMMARY.getEAllOperations().get(107));
			try {
				GET_SURGERIES_SECTION__EOCL_QRY = helper.createQuery(GET_SURGERIES_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SURGERIES_SECTION__EOCL_QRY);
		return (SurgeriesSection) query.evaluate(patientSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getVitalSignsSection(PatientSummary) <em>Get Vital Signs Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignsSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_VITAL_SIGNS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSection))->asSequence()->first().oclAsType(consol::VitalSignsSection)";

	/**
	 * The cached OCL query for the '{@link #getVitalSignsSection(PatientSummary) <em>Get Vital Signs Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignsSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_VITAL_SIGNS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSection))->asSequence()->first().oclAsType(consol::VitalSignsSection)
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static VitalSignsSection getVitalSignsSection(PatientSummary patientSummary) {
		if (GET_VITAL_SIGNS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PATIENT_SUMMARY,
				ConsolPackage.Literals.PATIENT_SUMMARY.getEAllOperations().get(108));
			try {
				GET_VITAL_SIGNS_SECTION__EOCL_QRY = helper.createQuery(GET_VITAL_SIGNS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_VITAL_SIGNS_SECTION__EOCL_QRY);
		return (VitalSignsSection) query.evaluate(patientSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getDiagnosticResultsSection(PatientSummary) <em>Get Diagnostic Results Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosticResultsSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DIAGNOSTIC_RESULTS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DiagnosticResultsSection))->asSequence()->first().oclAsType(consol::DiagnosticResultsSection)";

	/**
	 * The cached OCL query for the '{@link #getDiagnosticResultsSection(PatientSummary) <em>Get Diagnostic Results Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosticResultsSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DIAGNOSTIC_RESULTS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DiagnosticResultsSection))->asSequence()->first().oclAsType(consol::DiagnosticResultsSection)
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static DiagnosticResultsSection getDiagnosticResultsSection(PatientSummary patientSummary) {
		if (GET_DIAGNOSTIC_RESULTS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PATIENT_SUMMARY,
				ConsolPackage.Literals.PATIENT_SUMMARY.getEAllOperations().get(109));
			try {
				GET_DIAGNOSTIC_RESULTS_SECTION__EOCL_QRY = helper.createQuery(GET_DIAGNOSTIC_RESULTS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_DIAGNOSTIC_RESULTS_SECTION__EOCL_QRY);
		return (DiagnosticResultsSection) query.evaluate(patientSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getFamilyHistorySection(PatientSummary) <em>Get Family History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyHistorySection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FAMILY_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection))->asSequence()->first().oclAsType(consol::FamilyHistorySection)";

	/**
	 * The cached OCL query for the '{@link #getFamilyHistorySection(PatientSummary) <em>Get Family History Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyHistorySection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FAMILY_HISTORY_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection))->asSequence()->first().oclAsType(consol::FamilyHistorySection)
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static FamilyHistorySection getFamilyHistorySection(PatientSummary patientSummary) {
		if (GET_FAMILY_HISTORY_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PATIENT_SUMMARY,
				ConsolPackage.Literals.PATIENT_SUMMARY.getEAllOperations().get(110));
			try {
				GET_FAMILY_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_FAMILY_HISTORY_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_FAMILY_HISTORY_SECTION__EOCL_QRY);
		return (FamilyHistorySection) query.evaluate(patientSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getSocialHistorySection(PatientSummary) <em>Get Social History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialHistorySection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SOCIAL_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection))->asSequence()->first().oclAsType(consol::SocialHistorySection)";

	/**
	 * The cached OCL query for the '{@link #getSocialHistorySection(PatientSummary) <em>Get Social History Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialHistorySection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SOCIAL_HISTORY_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection))->asSequence()->first().oclAsType(consol::SocialHistorySection)
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static SocialHistorySection getSocialHistorySection(PatientSummary patientSummary) {
		if (GET_SOCIAL_HISTORY_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PATIENT_SUMMARY,
				ConsolPackage.Literals.PATIENT_SUMMARY.getEAllOperations().get(111));
			try {
				GET_SOCIAL_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_SOCIAL_HISTORY_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SOCIAL_HISTORY_SECTION__EOCL_QRY);
		return (SocialHistorySection) query.evaluate(patientSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getResultsSection(PatientSummary) <em>Get Results Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultsSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RESULTS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSection))->asSequence()->first().oclAsType(consol::ResultsSection)";

	/**
	 * The cached OCL query for the '{@link #getResultsSection(PatientSummary) <em>Get Results Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultsSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RESULTS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSection))->asSequence()->first().oclAsType(consol::ResultsSection)
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static ResultsSection getResultsSection(PatientSummary patientSummary) {
		if (GET_RESULTS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PATIENT_SUMMARY,
				ConsolPackage.Literals.PATIENT_SUMMARY.getEAllOperations().get(112));
			try {
				GET_RESULTS_SECTION__EOCL_QRY = helper.createQuery(GET_RESULTS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_RESULTS_SECTION__EOCL_QRY);
		return (ResultsSection) query.evaluate(patientSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicalEquipmentSection(PatientSummary) <em>Get Medical Equipment Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicalEquipmentSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICAL_EQUIPMENT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicalEquipmentSection))->asSequence()->first().oclAsType(consol::MedicalEquipmentSection)";

	/**
	 * The cached OCL query for the '{@link #getMedicalEquipmentSection(PatientSummary) <em>Get Medical Equipment Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicalEquipmentSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICAL_EQUIPMENT_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicalEquipmentSection))->asSequence()->first().oclAsType(consol::MedicalEquipmentSection)
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static MedicalEquipmentSection getMedicalEquipmentSection(PatientSummary patientSummary) {
		if (GET_MEDICAL_EQUIPMENT_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PATIENT_SUMMARY,
				ConsolPackage.Literals.PATIENT_SUMMARY.getEAllOperations().get(113));
			try {
				GET_MEDICAL_EQUIPMENT_SECTION__EOCL_QRY = helper.createQuery(GET_MEDICAL_EQUIPMENT_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICAL_EQUIPMENT_SECTION__EOCL_QRY);
		return (MedicalEquipmentSection) query.evaluate(patientSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getFunctionalStatusSection(PatientSummary) <em>Get Functional Status Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalStatusSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FUNCTIONAL_STATUS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FunctionalStatusSection))->asSequence()->first().oclAsType(consol::FunctionalStatusSection)";

	/**
	 * The cached OCL query for the '{@link #getFunctionalStatusSection(PatientSummary) <em>Get Functional Status Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalStatusSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FUNCTIONAL_STATUS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FunctionalStatusSection))->asSequence()->first().oclAsType(consol::FunctionalStatusSection)
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static FunctionalStatusSection getFunctionalStatusSection(PatientSummary patientSummary) {
		if (GET_FUNCTIONAL_STATUS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PATIENT_SUMMARY,
				ConsolPackage.Literals.PATIENT_SUMMARY.getEAllOperations().get(114));
			try {
				GET_FUNCTIONAL_STATUS_SECTION__EOCL_QRY = helper.createQuery(GET_FUNCTIONAL_STATUS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_FUNCTIONAL_STATUS_SECTION__EOCL_QRY);
		return (FunctionalStatusSection) query.evaluate(patientSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPurposeSection(PatientSummary) <em>Get Purpose Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurposeSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PURPOSE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PurposeSection))->asSequence()->first().oclAsType(consol::PurposeSection)";

	/**
	 * The cached OCL query for the '{@link #getPurposeSection(PatientSummary) <em>Get Purpose Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurposeSection(PatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PURPOSE_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PurposeSection))->asSequence()->first().oclAsType(consol::PurposeSection)
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static PurposeSection getPurposeSection(PatientSummary patientSummary) {
		if (GET_PURPOSE_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PATIENT_SUMMARY,
				ConsolPackage.Literals.PATIENT_SUMMARY.getEAllOperations().get(115));
			try {
				GET_PURPOSE_SECTION__EOCL_QRY = helper.createQuery(GET_PURPOSE_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PURPOSE_SECTION__EOCL_QRY);
		return (PurposeSection) query.evaluate(patientSummary);
	}

} // PatientSummaryOperations
