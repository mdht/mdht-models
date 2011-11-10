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
import org.openhealthtools.mdht.uml.cda.consol.AllergiesReactionsSection;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSectionProcNote;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentSectionProcNote;
import org.openhealthtools.mdht.uml.cda.consol.CCDVitalSignsSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSectionProcNote;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.DiagnosticFindings;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.ObjectiveSection;
import org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemListSection;
import org.openhealthtools.mdht.uml.cda.consol.ProgressNote;
import org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSectionIHE;
import org.openhealthtools.mdht.uml.cda.consol.SubjectiveSection;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalDocumentOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Progress Note</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNotePersonHasName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Person Has Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteRolesShallHaveAddrAndTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Roles Shall Have Addr And Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteRolesShouldHaveAddrAndTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Roles Should Have Addr And Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteOrganizationsHaveContactInfo(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Organizations Have Contact Info</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteTimePreciseToDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Time Precise To Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteTimePreciseToYear(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Time Precise To Year</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteTelephoneMatchesRegex(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Telephone Matches Regex</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteHasTelephoneDialingDigits(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Telephone Dialing Digits</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteUnknownTelephoneUsesNullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Unknown Telephone Uses Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteTypeIdExtension(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Type Id Extension</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteIdRootFormat(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Id Root Format</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteOidLength(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Oid Length</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteLanguageCodeForm(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Language Code Form</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteSetIdAndVersionNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Set Id And Version Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteSetIdAndIdAreUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Set Id And Id Are Unique</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteCopyTimeNotPresent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Copy Time Not Present</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteHasRecordTargetPatientRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Record Target Patient Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteHasPatientBirthTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Patient Birth Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteHasAdministrativeGenderCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Administrative Gender Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteHasProviderOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Provider Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteHasAuthorTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Author Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteHasAssignedAuthorId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Assigned Author Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteHasAssignedAuthorPersonOrDevice(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Assigned Author Person Or Device</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteHasDataEntererAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Data Enterer Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteHasDataEntererTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Data Enterer Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteHasInformant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Informant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteHasInformantAssignedPersonOrRelatedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Informant Assigned Person Or Related Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteLegalAuthenticatorHasAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Legal Authenticator Has Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteAuthenticatorHasAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Authenticator Has Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteTimePreciseToSecond(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Time Precise To Second</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteTimePreciseToYearAndDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Time Precise To Year And Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteAssessmentAndPlan(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Assessment And Plan</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteBothAssessmentAndPlan(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Both Assessment And Plan</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteHasServiceEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Service Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteHasServiceEventCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Service Event Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteHasServiceEventEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Service Event Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteHasComponentOfElement(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Component Of Element</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteHasEncompassingEncounterId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Encompassing Encounter Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteHasEncompassingEncounterEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Encompassing Encounter Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteHasEncompassingEncounterEffectiveTimeLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Encompassing Encounter Effective Time Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteHasEncompassingEncounterFacilityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Encompassing Encounter Facility Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteRealmCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteTypeId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteLanguageCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Language Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteAlertsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Alerts Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteChiefComplaintSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Chief Complaint Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteMedicationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteObjectiveSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Objective Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNotePhysicalExaminationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Physical Examination Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteProblemSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Problem Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteResultsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Results Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteVitalSignsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteReviewOfSystemsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteSubjectiveSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Subjective Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#getAssessmentAndPlanSection() <em>Get Assessment And Plan Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#getAssessmentSection() <em>Get Assessment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#getPlanSection() <em>Get Plan Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#getAlertsSection() <em>Get Alerts Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#getChiefComplaintSection() <em>Get Chief Complaint Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#getMedicationsSection() <em>Get Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#getObjectiveSection() <em>Get Objective Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#getPhysicalExaminationSection() <em>Get Physical Examination Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#getProblemSection() <em>Get Problem Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#getResultsSection() <em>Get Results Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#getVitalSignsSection() <em>Get Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#getReviewOfSystemsSection() <em>Get Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#getSubjectiveSection() <em>Get Subjective Section</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProgressNoteOperations extends ClinicalDocumentOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgressNoteOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNotePersonHasName(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Person Has Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNotePersonHasName(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_PERSON_HAS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNotePersonHasName(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Person Has Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNotePersonHasName(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_PERSON_HAS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNotePersonHasName(ProgressNote progressNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_PERSON_HAS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_PERSON_HAS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_PERSON_HAS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_PERSON_HAS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_PERSON_HAS_NAME,
					ConsolPlugin.INSTANCE.getString("ProgressNotePersonHasName"), new Object[] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteRolesShallHaveAddrAndTelecom(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Roles Shall Have Addr And Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteRolesShallHaveAddrAndTelecom(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_ROLES_SHALL_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteRolesShallHaveAddrAndTelecom(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Roles Shall Have Addr And Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteRolesShallHaveAddrAndTelecom(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_ROLES_SHALL_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteRolesShallHaveAddrAndTelecom(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_ROLES_SHALL_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_ROLES_SHALL_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_ROLES_SHALL_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROGRESS_NOTE_ROLES_SHALL_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_ROLES_SHALL_HAVE_ADDR_AND_TELECOM,
					ConsolPlugin.INSTANCE.getString("ProgressNoteRolesShallHaveAddrAndTelecom"),
					new Object[] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteRolesShouldHaveAddrAndTelecom(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Roles Should Have Addr And Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteRolesShouldHaveAddrAndTelecom(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_ROLES_SHOULD_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteRolesShouldHaveAddrAndTelecom(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Roles Should Have Addr And Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteRolesShouldHaveAddrAndTelecom(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_ROLES_SHOULD_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteRolesShouldHaveAddrAndTelecom(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_ROLES_SHOULD_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_ROLES_SHOULD_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_ROLES_SHOULD_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROGRESS_NOTE_ROLES_SHOULD_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_ROLES_SHOULD_HAVE_ADDR_AND_TELECOM,
					ConsolPlugin.INSTANCE.getString("ProgressNoteRolesShouldHaveAddrAndTelecom"),
					new Object[] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteOrganizationsHaveContactInfo(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Organizations Have Contact Info</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteOrganizationsHaveContactInfo(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_ORGANIZATIONS_HAVE_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteOrganizationsHaveContactInfo(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Organizations Have Contact Info</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteOrganizationsHaveContactInfo(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_ORGANIZATIONS_HAVE_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteOrganizationsHaveContactInfo(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_ORGANIZATIONS_HAVE_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_ORGANIZATIONS_HAVE_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_ORGANIZATIONS_HAVE_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROGRESS_NOTE_ORGANIZATIONS_HAVE_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_ORGANIZATIONS_HAVE_CONTACT_INFO,
					ConsolPlugin.INSTANCE.getString("ProgressNoteOrganizationsHaveContactInfo"),
					new Object[] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteTimePreciseToDay(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Time Precise To Day</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteTimePreciseToDay(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteTimePreciseToDay(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Time Precise To Day</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteTimePreciseToDay(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteTimePreciseToDay(ProgressNote progressNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_TIME_PRECISE_TO_DAY,
					ConsolPlugin.INSTANCE.getString("ProgressNoteTimePreciseToDay"), new Object[] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteTimePreciseToYear(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Time Precise To Year</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteTimePreciseToYear(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "cda::OrganizationPartOf.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject)-> union(  cda::MaintainedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union( cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::ServiceEvent.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::EncounterParticipant.allInstances()->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(self.participant->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(cda::OrganizationPartOf.allInstances().effectiveTime->union(cda::MaintainedEntity.allInstances().effectiveTime)->union( cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::ServiceEvent.allInstances().effectiveTime)->union(cda::EncounterParticipant.allInstances().time)->union(self.participant.time)->select(current : datatypes::IVL_TS  |  ((not current.low.oclIsUndefined()) and (current.low.value.oclIsUndefined() or current.low.value.size() < 4)) or ((not current.center.oclIsUndefined()) and (current.center.value.oclIsUndefined() or current.center.value.size() < 4)) or ((not current.high.oclIsUndefined()) and (current.high.value.oclIsUndefined() or current.high.value.size() < 4)) or (current.low.oclIsUndefined() and current.center.oclIsUndefined() and current.high.oclIsUndefined()) ).oclAsType( ecore::EObject))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteTimePreciseToYear(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Time Precise To Year</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteTimePreciseToYear(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::OrganizationPartOf.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject)-> union(  cda::MaintainedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union( cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::ServiceEvent.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::EncounterParticipant.allInstances()->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(self.participant->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(cda::OrganizationPartOf.allInstances().effectiveTime->union(cda::MaintainedEntity.allInstances().effectiveTime)->union( cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::ServiceEvent.allInstances().effectiveTime)->union(cda::EncounterParticipant.allInstances().time)->union(self.participant.time)->select(current : datatypes::IVL_TS  |  ((not current.low.oclIsUndefined()) and (current.low.value.oclIsUndefined() or current.low.value.size() < 4)) or ((not current.center.oclIsUndefined()) and (current.center.value.oclIsUndefined() or current.center.value.size() < 4)) or ((not current.high.oclIsUndefined()) and (current.high.value.oclIsUndefined() or current.high.value.size() < 4)) or (current.low.oclIsUndefined() and current.center.oclIsUndefined() and current.high.oclIsUndefined()) ).oclAsType( ecore::EObject))
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteTimePreciseToYear(ProgressNote progressNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_TIME_PRECISE_TO_YEAR,
					ConsolPlugin.INSTANCE.getString("ProgressNoteTimePreciseToYear"), new Object[] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteTelephoneMatchesRegex(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Telephone Matches Regex</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteTelephoneMatchesRegex(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_TELEPHONE_MATCHES_REGEX__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteTelephoneMatchesRegex(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Telephone Matches Regex</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteTelephoneMatchesRegex(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_TELEPHONE_MATCHES_REGEX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteTelephoneMatchesRegex(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_TELEPHONE_MATCHES_REGEX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_TELEPHONE_MATCHES_REGEX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_TELEPHONE_MATCHES_REGEX__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_TELEPHONE_MATCHES_REGEX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_TELEPHONE_MATCHES_REGEX,
					ConsolPlugin.INSTANCE.getString("ProgressNoteTelephoneMatchesRegex"), new Object[] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteHasTelephoneDialingDigits(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Telephone Dialing Digits</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteHasTelephoneDialingDigits(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_HAS_TELEPHONE_DIALING_DIGITS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteHasTelephoneDialingDigits(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Telephone Dialing Digits</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteHasTelephoneDialingDigits(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_HAS_TELEPHONE_DIALING_DIGITS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteHasTelephoneDialingDigits(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_HAS_TELEPHONE_DIALING_DIGITS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_HAS_TELEPHONE_DIALING_DIGITS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_HAS_TELEPHONE_DIALING_DIGITS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_HAS_TELEPHONE_DIALING_DIGITS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_HAS_TELEPHONE_DIALING_DIGITS,
					ConsolPlugin.INSTANCE.getString("ProgressNoteHasTelephoneDialingDigits"),
					new Object[] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteUnknownTelephoneUsesNullFlavor(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Unknown Telephone Uses Null Flavor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteUnknownTelephoneUsesNullFlavor(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_UNKNOWN_TELEPHONE_USES_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteUnknownTelephoneUsesNullFlavor(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Unknown Telephone Uses Null Flavor</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteUnknownTelephoneUsesNullFlavor(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_UNKNOWN_TELEPHONE_USES_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteUnknownTelephoneUsesNullFlavor(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_UNKNOWN_TELEPHONE_USES_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_UNKNOWN_TELEPHONE_USES_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_UNKNOWN_TELEPHONE_USES_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROGRESS_NOTE_UNKNOWN_TELEPHONE_USES_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_UNKNOWN_TELEPHONE_USES_NULL_FLAVOR,
					ConsolPlugin.INSTANCE.getString("ProgressNoteUnknownTelephoneUsesNullFlavor"),
					new Object[] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteTypeIdExtension(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Type Id Extension</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteTypeIdExtension(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.typeId.extension = 'POCD_HD000040'";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteTypeIdExtension(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Type Id Extension</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteTypeIdExtension(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.typeId.extension = 'POCD_HD000040'
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteTypeIdExtension(ProgressNote progressNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_TYPE_ID_EXTENSION,
					ConsolPlugin.INSTANCE.getString("ProgressNoteTypeIdExtension"), new Object[] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteIdRootFormat(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Id Root Format</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteIdRootFormat(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_ID_ROOT_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.id.matches('root','([0-2])(.([1-9][0-9]*|0))+') or self.id.matches('root','([A-Fa-f0-9]{8})(\\\\-[A-Fa-f0-9]{4}){3}(\\\\-[A-Fa-f0-9]{12})')";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteIdRootFormat(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Id Root Format</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteIdRootFormat(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_ID_ROOT_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.id.matches('root','([0-2])(.([1-9][0-9]*|0))+') or self.id.matches('root','([A-Fa-f0-9]{8})(\\\\-[A-Fa-f0-9]{4}){3}(\\\\-[A-Fa-f0-9]{12})')
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteIdRootFormat(ProgressNote progressNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_ID_ROOT_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_ID_ROOT_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_ID_ROOT_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_ID_ROOT_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_ID_ROOT_FORMAT,
					ConsolPlugin.INSTANCE.getString("ProgressNoteIdRootFormat"), new Object[] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteOidLength(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Oid Length</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteOidLength(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_OID_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.id->select((not id.root.oclIsUndefined()) and id.root.size() > 64 )";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteOidLength(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Oid Length</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteOidLength(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_OID_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.id->select((not id.root.oclIsUndefined()) and id.root.size() > 64 )
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteOidLength(ProgressNote progressNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_OID_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_OID_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_OID_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_OID_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_OID_LENGTH,
					ConsolPlugin.INSTANCE.getString("ProgressNoteOidLength"), new Object[] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteLanguageCodeForm(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Language Code Form</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteLanguageCodeForm(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_LANGUAGE_CODE_FORM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.languageCode.matches('code','(([a-z]{2})(\\\\-[A-Z]{2})?)')";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteLanguageCodeForm(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Language Code Form</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteLanguageCodeForm(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_LANGUAGE_CODE_FORM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.languageCode.matches('code','(([a-z]{2})(\\\\-[A-Z]{2})?)')
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteLanguageCodeForm(ProgressNote progressNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_LANGUAGE_CODE_FORM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_LANGUAGE_CODE_FORM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_LANGUAGE_CODE_FORM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_LANGUAGE_CODE_FORM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_LANGUAGE_CODE_FORM,
					ConsolPlugin.INSTANCE.getString("ProgressNoteLanguageCodeForm"), new Object[] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteSetIdAndVersionNumber(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Set Id And Version Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteSetIdAndVersionNumber(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_SET_ID_AND_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.setId.oclIsUndefined() and self.versionNumber.oclIsUndefined())"
			+ "   xor (not self.setId.oclIsUndefined() and not self.versionNumber.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteSetIdAndVersionNumber(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Set Id And Version Number</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteSetIdAndVersionNumber(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_SET_ID_AND_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.setId.oclIsUndefined() and self.versionNumber.oclIsUndefined())
	 *    xor (not self.setId.oclIsUndefined() and not self.versionNumber.oclIsUndefined())
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteSetIdAndVersionNumber(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_SET_ID_AND_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_SET_ID_AND_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_SET_ID_AND_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_SET_ID_AND_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_SET_ID_AND_VERSION_NUMBER,
					ConsolPlugin.INSTANCE.getString("ProgressNoteSetIdAndVersionNumber"), new Object[] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteSetIdAndIdAreUnique(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Set Id And Id Are Unique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteSetIdAndIdAreUnique(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_SET_ID_AND_ID_ARE_UNIQUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(not self.setId.oclIsUndefined() and not self.id.oclIsUndefined())"
			+ "   implies (self.setId.root <> self.id.root or self.setId.extension <> self.id.extension)";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteSetIdAndIdAreUnique(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Set Id And Id Are Unique</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteSetIdAndIdAreUnique(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_SET_ID_AND_ID_ARE_UNIQUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (not self.setId.oclIsUndefined() and not self.id.oclIsUndefined())
	 *    implies (self.setId.root <> self.id.root or self.setId.extension <> self.id.extension)
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteSetIdAndIdAreUnique(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_SET_ID_AND_ID_ARE_UNIQUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_SET_ID_AND_ID_ARE_UNIQUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_SET_ID_AND_ID_ARE_UNIQUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_SET_ID_AND_ID_ARE_UNIQUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_SET_ID_AND_ID_ARE_UNIQUE,
					ConsolPlugin.INSTANCE.getString("ProgressNoteSetIdAndIdAreUnique"), new Object[] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteCopyTimeNotPresent(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Copy Time Not Present</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteCopyTimeNotPresent(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_COPY_TIME_NOT_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.copyTime.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteCopyTimeNotPresent(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Copy Time Not Present</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteCopyTimeNotPresent(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_COPY_TIME_NOT_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.copyTime.oclIsUndefined()
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteCopyTimeNotPresent(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_COPY_TIME_NOT_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_COPY_TIME_NOT_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_COPY_TIME_NOT_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_COPY_TIME_NOT_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_COPY_TIME_NOT_PRESENT,
					ConsolPlugin.INSTANCE.getString("ProgressNoteCopyTimeNotPresent"), new Object[] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteHasRecordTargetPatientRole(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Record Target Patient Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteHasRecordTargetPatientRole(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_HAS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->size() > 0 and self.recordTarget->exists(target : cda::RecordTarget | not target.patientRole.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteHasRecordTargetPatientRole(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Record Target Patient Role</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteHasRecordTargetPatientRole(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_HAS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->size() > 0 and self.recordTarget->exists(target : cda::RecordTarget | not target.patientRole.oclIsUndefined())
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteHasRecordTargetPatientRole(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_HAS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_HAS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_HAS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_HAS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_HAS_RECORD_TARGET_PATIENT_ROLE,
					ConsolPlugin.INSTANCE.getString("ProgressNoteHasRecordTargetPatientRole"),
					new Object[] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteHasPatientBirthTime(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Patient Birth Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteHasPatientBirthTime(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_HAS_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->forAll(target : cda::RecordTarget | not target.patientRole.oclIsUndefined()"
			+ "   implies (not target.patientRole.patient.birthTime.value.oclIsUndefined()"
			+ "      or not target.patientRole.patient.birthTime.nullFlavor.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteHasPatientBirthTime(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Patient Birth Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteHasPatientBirthTime(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_HAS_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->forAll(target : cda::RecordTarget | not target.patientRole.oclIsUndefined()
	 *    implies (not target.patientRole.patient.birthTime.value.oclIsUndefined()
	 *       or not target.patientRole.patient.birthTime.nullFlavor.oclIsUndefined()))
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteHasPatientBirthTime(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_HAS_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_HAS_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_HAS_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_HAS_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_HAS_PATIENT_BIRTH_TIME,
					ConsolPlugin.INSTANCE.getString("ProgressNoteHasPatientBirthTime"), new Object[] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteHasAdministrativeGenderCode(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Administrative Gender Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteHasAdministrativeGenderCode(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_HAS_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->forAll(target : cda::RecordTarget | not target.patientRole.oclIsUndefined()"
			+ "   implies (not target.patientRole.patient.administrativeGenderCode.code.oclIsUndefined()"
			+ "      or not target.patientRole.patient.administrativeGenderCode.nullFlavor.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteHasAdministrativeGenderCode(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Administrative Gender Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteHasAdministrativeGenderCode(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_HAS_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->forAll(target : cda::RecordTarget | not target.patientRole.oclIsUndefined()
	 *    implies (not target.patientRole.patient.administrativeGenderCode.code.oclIsUndefined()
	 *       or not target.patientRole.patient.administrativeGenderCode.nullFlavor.oclIsUndefined()))
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteHasAdministrativeGenderCode(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_HAS_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_HAS_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_HAS_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_HAS_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_HAS_ADMINISTRATIVE_GENDER_CODE,
					ConsolPlugin.INSTANCE.getString("ProgressNoteHasAdministrativeGenderCode"),
					new Object[] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteHasProviderOrganization(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Provider Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteHasProviderOrganization(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_HAS_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->exists(target : cda::RecordTarget | not target.patientRole.providerOrganization.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteHasProviderOrganization(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Provider Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteHasProviderOrganization(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_HAS_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->exists(target : cda::RecordTarget | not target.patientRole.providerOrganization.oclIsUndefined())
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteHasProviderOrganization(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_HAS_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_HAS_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_HAS_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_HAS_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_HAS_PROVIDER_ORGANIZATION,
					ConsolPlugin.INSTANCE.getString("ProgressNoteHasProviderOrganization"),
					new Object[] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteHasAuthorTime(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Author Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteHasAuthorTime(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->forAll(author : cda::Author | not author.time.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteHasAuthorTime(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Author Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteHasAuthorTime(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.author->forAll(author : cda::Author | not author.time.oclIsUndefined())
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteHasAuthorTime(ProgressNote progressNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_HAS_AUTHOR_TIME,
					ConsolPlugin.INSTANCE.getString("ProgressNoteHasAuthorTime"), new Object[] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteHasAssignedAuthorId(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Assigned Author Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteHasAssignedAuthorId(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->forAll(author : cda::Author | author.assignedAuthor.id->size() > 0)";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteHasAssignedAuthorId(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Assigned Author Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteHasAssignedAuthorId(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.author->forAll(author : cda::Author | author.assignedAuthor.id->size() > 0)
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteHasAssignedAuthorId(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_HAS_ASSIGNED_AUTHOR_ID,
					ConsolPlugin.INSTANCE.getString("ProgressNoteHasAssignedAuthorId"), new Object[] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteHasAssignedAuthorPersonOrDevice(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Assigned Author Person Or Device</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteHasAssignedAuthorPersonOrDevice(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->forAll(author : cda::Author | not author.assignedAuthor.assignedPerson.oclIsUndefined() "
			+ "   or not author.assignedAuthor.assignedAuthoringDevice.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteHasAssignedAuthorPersonOrDevice(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Assigned Author Person Or Device</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteHasAssignedAuthorPersonOrDevice(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.author->forAll(author : cda::Author | not author.assignedAuthor.assignedPerson.oclIsUndefined() 
	 *    or not author.assignedAuthor.assignedAuthoringDevice.oclIsUndefined())
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteHasAssignedAuthorPersonOrDevice(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROGRESS_NOTE_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE,
					ConsolPlugin.INSTANCE.getString("ProgressNoteHasAssignedAuthorPersonOrDevice"),
					new Object[] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteHasDataEntererAssignedPerson(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Data Enterer Assigned Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteHasDataEntererAssignedPerson(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_HAS_DATA_ENTERER_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.dataEnterer.oclIsUndefined() implies not self.dataEnterer.assignedEntity.assignedPerson.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteHasDataEntererAssignedPerson(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Data Enterer Assigned Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteHasDataEntererAssignedPerson(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_HAS_DATA_ENTERER_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.dataEnterer.oclIsUndefined() implies not self.dataEnterer.assignedEntity.assignedPerson.oclIsUndefined()
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteHasDataEntererAssignedPerson(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_HAS_DATA_ENTERER_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_HAS_DATA_ENTERER_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_HAS_DATA_ENTERER_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROGRESS_NOTE_HAS_DATA_ENTERER_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_HAS_DATA_ENTERER_ASSIGNED_PERSON,
					ConsolPlugin.INSTANCE.getString("ProgressNoteHasDataEntererAssignedPerson"),
					new Object[] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteHasDataEntererTime(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Data Enterer Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteHasDataEntererTime(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_HAS_DATA_ENTERER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.dataEnterer.oclIsUndefined() implies not self.dataEnterer.time.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteHasDataEntererTime(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Data Enterer Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteHasDataEntererTime(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_HAS_DATA_ENTERER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.dataEnterer.oclIsUndefined() implies not self.dataEnterer.time.oclIsUndefined()
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteHasDataEntererTime(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_HAS_DATA_ENTERER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_HAS_DATA_ENTERER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_HAS_DATA_ENTERER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_HAS_DATA_ENTERER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_HAS_DATA_ENTERER_TIME,
					ConsolPlugin.INSTANCE.getString("ProgressNoteHasDataEntererTime"), new Object[] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteHasInformant(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Informant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteHasInformant(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_HAS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->size() > 0";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteHasInformant(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Informant</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteHasInformant(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_HAS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.informant->size() > 0
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteHasInformant(ProgressNote progressNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_HAS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_HAS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_HAS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_HAS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_HAS_INFORMANT,
					ConsolPlugin.INSTANCE.getString("ProgressNoteHasInformant"), new Object[] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteHasInformantAssignedPersonOrRelatedPerson(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Informant Assigned Person Or Related Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteHasInformantAssignedPersonOrRelatedPerson(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->forAll(i : cda::Informant12 | not i.assignedEntity.assignedPerson.oclIsUndefined()"
			+ "   or not i.relatedEntity.relatedPerson.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteHasInformantAssignedPersonOrRelatedPerson(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Informant Assigned Person Or Related Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteHasInformantAssignedPersonOrRelatedPerson(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.informant->forAll(i : cda::Informant12 | not i.assignedEntity.assignedPerson.oclIsUndefined()
	 *    or not i.relatedEntity.relatedPerson.oclIsUndefined())
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteHasInformantAssignedPersonOrRelatedPerson(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROGRESS_NOTE_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON,
					ConsolPlugin.INSTANCE.getString("ProgressNoteHasInformantAssignedPersonOrRelatedPerson"),
					new Object[] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteLegalAuthenticatorHasAssignedPerson(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Legal Authenticator Has Assigned Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteLegalAuthenticatorHasAssignedPerson(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.legalAuthenticator.oclIsUndefined() implies not self.legalAuthenticator.assignedEntity.assignedPerson.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteLegalAuthenticatorHasAssignedPerson(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Legal Authenticator Has Assigned Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteLegalAuthenticatorHasAssignedPerson(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.legalAuthenticator.oclIsUndefined() implies not self.legalAuthenticator.assignedEntity.assignedPerson.oclIsUndefined()
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteLegalAuthenticatorHasAssignedPerson(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROGRESS_NOTE_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON,
					ConsolPlugin.INSTANCE.getString("ProgressNoteLegalAuthenticatorHasAssignedPerson"),
					new Object[] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteAuthenticatorHasAssignedPerson(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Authenticator Has Assigned Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteAuthenticatorHasAssignedPerson(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authenticator->forAll(auth : cda::Authenticator | auth.assignedEntity->forAll(entity : cda::AssignedEntity |"
			+ "   not entity.assignedPerson.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteAuthenticatorHasAssignedPerson(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Authenticator Has Assigned Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteAuthenticatorHasAssignedPerson(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.authenticator->forAll(auth : cda::Authenticator | auth.assignedEntity->forAll(entity : cda::AssignedEntity |
	 *    not entity.assignedPerson.oclIsUndefined()))
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteAuthenticatorHasAssignedPerson(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROGRESS_NOTE_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_AUTHENTICATOR_HAS_ASSIGNED_PERSON,
					ConsolPlugin.INSTANCE.getString("ProgressNoteAuthenticatorHasAssignedPerson"),
					new Object[] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteTimePreciseToSecond(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Time Precise To Second</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteTimePreciseToSecond(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_TIME_PRECISE_TO_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteTimePreciseToSecond(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Time Precise To Second</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteTimePreciseToSecond(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_TIME_PRECISE_TO_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteTimePreciseToSecond(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_TIME_PRECISE_TO_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_TIME_PRECISE_TO_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_TIME_PRECISE_TO_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_TIME_PRECISE_TO_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_TIME_PRECISE_TO_SECOND,
					ConsolPlugin.INSTANCE.getString("ProgressNoteTimePreciseToSecond"), new Object[] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteTimePreciseToYearAndDay(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Time Precise To Year And Day</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteTimePreciseToYearAndDay(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_TIME_PRECISE_TO_YEAR_AND_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "cda::OrganizationPartOf.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject)-> union(  cda::MaintainedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union( cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::ServiceEvent.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::EncounterParticipant.allInstances()->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(self.participant->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(cda::OrganizationPartOf.allInstances().effectiveTime->union(cda::MaintainedEntity.allInstances().effectiveTime)->union( cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::ServiceEvent.allInstances().effectiveTime)->union(cda::EncounterParticipant.allInstances().time)->union(self.participant.time)->select(current : datatypes::IVL_TS  |  ((not current.low.oclIsUndefined()) and (current.low.value.oclIsUndefined() or current.low.value.size() < 8)) or ((not current.center.oclIsUndefined()) and (current.center.value.oclIsUndefined() or current.center.value.size() < 8)) or ((not current.high.oclIsUndefined()) and (current.high.value.oclIsUndefined() or current.high.value.size() < 8)) or (current.low.oclIsUndefined() and current.center.oclIsUndefined() and current.high.oclIsUndefined()) ).oclAsType( ecore::EObject))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteTimePreciseToYearAndDay(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Time Precise To Year And Day</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteTimePreciseToYearAndDay(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_TIME_PRECISE_TO_YEAR_AND_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::OrganizationPartOf.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject)-> union(  cda::MaintainedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union( cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::ServiceEvent.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::EncounterParticipant.allInstances()->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(self.participant->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(cda::OrganizationPartOf.allInstances().effectiveTime->union(cda::MaintainedEntity.allInstances().effectiveTime)->union( cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::ServiceEvent.allInstances().effectiveTime)->union(cda::EncounterParticipant.allInstances().time)->union(self.participant.time)->select(current : datatypes::IVL_TS  |  ((not current.low.oclIsUndefined()) and (current.low.value.oclIsUndefined() or current.low.value.size() < 8)) or ((not current.center.oclIsUndefined()) and (current.center.value.oclIsUndefined() or current.center.value.size() < 8)) or ((not current.high.oclIsUndefined()) and (current.high.value.oclIsUndefined() or current.high.value.size() < 8)) or (current.low.oclIsUndefined() and current.center.oclIsUndefined() and current.high.oclIsUndefined()) ).oclAsType( ecore::EObject))
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteTimePreciseToYearAndDay(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_TIME_PRECISE_TO_YEAR_AND_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_TIME_PRECISE_TO_YEAR_AND_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_TIME_PRECISE_TO_YEAR_AND_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_TIME_PRECISE_TO_YEAR_AND_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_TIME_PRECISE_TO_YEAR_AND_DAY,
					ConsolPlugin.INSTANCE.getString("ProgressNoteTimePreciseToYearAndDay"),
					new Object[] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteAssessmentAndPlan(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Assessment And Plan</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteAssessmentAndPlan(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_ASSESSMENT_AND_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::AssessmentAndPlanSectionProcNote))"
			+ "   xor (self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::AssessmentSectionProcNote))"
			+ "      and self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::PlanOfCareSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteAssessmentAndPlan(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Assessment And Plan</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteAssessmentAndPlan(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_ASSESSMENT_AND_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::AssessmentAndPlanSectionProcNote))
	 *    xor (self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::AssessmentSectionProcNote))
	 *       and self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::PlanOfCareSection)))
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteAssessmentAndPlan(ProgressNote progressNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_ASSESSMENT_AND_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_ASSESSMENT_AND_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_ASSESSMENT_AND_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_ASSESSMENT_AND_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_ASSESSMENT_AND_PLAN,
					ConsolPlugin.INSTANCE.getString("ProgressNoteAssessmentAndPlan"), new Object[] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteBothAssessmentAndPlan(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Both Assessment And Plan</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteBothAssessmentAndPlan(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_BOTH_ASSESSMENT_AND_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "let assessmentExists : Boolean = self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::AssessmentSectionProcNote)) in"
			+ "  let planExists : Boolean = self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::PlanOfCareSection))"
			+ "    in (assessmentExists or planExists) implies (assessmentExists and planExists)";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteBothAssessmentAndPlan(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Both Assessment And Plan</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteBothAssessmentAndPlan(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_BOTH_ASSESSMENT_AND_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * let assessmentExists : Boolean = self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::AssessmentSectionProcNote)) in
	 *   let planExists : Boolean = self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::PlanOfCareSection))
	 *     in (assessmentExists or planExists) implies (assessmentExists and planExists)
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteBothAssessmentAndPlan(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_BOTH_ASSESSMENT_AND_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_BOTH_ASSESSMENT_AND_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_BOTH_ASSESSMENT_AND_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_BOTH_ASSESSMENT_AND_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_BOTH_ASSESSMENT_AND_PLAN,
					ConsolPlugin.INSTANCE.getString("ProgressNoteBothAssessmentAndPlan"), new Object[] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteHasServiceEvent(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Service Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteHasServiceEvent(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_HAS_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->exists(doc : cda::DocumentationOf | not doc.oclIsUndefined() "
			+ "  and not doc.serviceEvent.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteHasServiceEvent(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Service Event</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteHasServiceEvent(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_HAS_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.documentationOf->exists(doc : cda::DocumentationOf | not doc.oclIsUndefined() 
	 *   and not doc.serviceEvent.oclIsUndefined())
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteHasServiceEvent(ProgressNote progressNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_HAS_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_HAS_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_HAS_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_HAS_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_HAS_SERVICE_EVENT,
					ConsolPlugin.INSTANCE.getString("ProgressNoteHasServiceEvent"), new Object[] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteHasServiceEventCode(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Service Event Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteHasServiceEventCode(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_HAS_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->exists(doc : cda::DocumentationOf | not doc.oclIsUndefined() and not doc.serviceEvent.oclIsUndefined()"
			+ "  and doc.serviceEvent.code.code = '371532007' and doc.serviceEvent.code.codeSystem = '2.16.840.1.113883.6.96' )";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteHasServiceEventCode(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Service Event Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteHasServiceEventCode(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_HAS_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.documentationOf->exists(doc : cda::DocumentationOf | not doc.oclIsUndefined() and not doc.serviceEvent.oclIsUndefined()
	 *   and doc.serviceEvent.code.code = '371532007' and doc.serviceEvent.code.codeSystem = '2.16.840.1.113883.6.96' )
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteHasServiceEventCode(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_HAS_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_HAS_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_HAS_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_HAS_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_HAS_SERVICE_EVENT_CODE,
					ConsolPlugin.INSTANCE.getString("ProgressNoteHasServiceEventCode"), new Object[] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteHasServiceEventEffectiveTime(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Service Event Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteHasServiceEventEffectiveTime(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_HAS_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->exists(doc : cda::DocumentationOf | not doc.oclIsUndefined() and not doc.serviceEvent.oclIsUndefined()"
			+ " and not doc.serviceEvent.effectiveTime.oclIsUndefined() and not doc.serviceEvent.effectiveTime.low.oclIsUndefined() )";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteHasServiceEventEffectiveTime(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Service Event Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteHasServiceEventEffectiveTime(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_HAS_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.documentationOf->exists(doc : cda::DocumentationOf | not doc.oclIsUndefined() and not doc.serviceEvent.oclIsUndefined()
	 *  and not doc.serviceEvent.effectiveTime.oclIsUndefined() and not doc.serviceEvent.effectiveTime.low.oclIsUndefined() )
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteHasServiceEventEffectiveTime(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_HAS_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_HAS_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_HAS_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROGRESS_NOTE_HAS_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_HAS_SERVICE_EVENT_EFFECTIVE_TIME,
					ConsolPlugin.INSTANCE.getString("ProgressNoteHasServiceEventEffectiveTime"),
					new Object[] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteHasComponentOfElement(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Component Of Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteHasComponentOfElement(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_HAS_COMPONENT_OF_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.componentOf.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteHasComponentOfElement(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Component Of Element</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteHasComponentOfElement(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_HAS_COMPONENT_OF_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.componentOf.oclIsUndefined()
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteHasComponentOfElement(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_HAS_COMPONENT_OF_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_HAS_COMPONENT_OF_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_HAS_COMPONENT_OF_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_HAS_COMPONENT_OF_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_HAS_COMPONENT_OF_ELEMENT,
					ConsolPlugin.INSTANCE.getString("ProgressNoteHasComponentOfElement"), new Object[] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteHasEncompassingEncounterId(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Encompassing Encounter Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteHasEncompassingEncounterId(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_HAS_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf.encompassingEncounter.id->notEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteHasEncompassingEncounterId(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Encompassing Encounter Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteHasEncompassingEncounterId(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_HAS_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.componentOf.encompassingEncounter.id->notEmpty()
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteHasEncompassingEncounterId(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_HAS_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_HAS_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_HAS_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_HAS_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_HAS_ENCOMPASSING_ENCOUNTER_ID,
					ConsolPlugin.INSTANCE.getString("ProgressNoteHasEncompassingEncounterId"),
					new Object[] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteHasEncompassingEncounterEffectiveTime(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Encompassing Encounter Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteHasEncompassingEncounterEffectiveTime(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_HAS_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.componentOf.encompassingEncounter.effectiveTime.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteHasEncompassingEncounterEffectiveTime(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Encompassing Encounter Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteHasEncompassingEncounterEffectiveTime(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_HAS_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.componentOf.encompassingEncounter.effectiveTime.oclIsUndefined()
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteHasEncompassingEncounterEffectiveTime(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_HAS_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_HAS_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_HAS_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROGRESS_NOTE_HAS_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_HAS_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME,
					ConsolPlugin.INSTANCE.getString("ProgressNoteHasEncompassingEncounterEffectiveTime"),
					new Object[] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteHasEncompassingEncounterEffectiveTimeLow(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Encompassing Encounter Effective Time Low</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteHasEncompassingEncounterEffectiveTimeLow(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_HAS_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.componentOf.encompassingEncounter.effectiveTime.low.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteHasEncompassingEncounterEffectiveTimeLow(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Encompassing Encounter Effective Time Low</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteHasEncompassingEncounterEffectiveTimeLow(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_HAS_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.componentOf.encompassingEncounter.effectiveTime.low.oclIsUndefined()
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteHasEncompassingEncounterEffectiveTimeLow(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_HAS_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_HAS_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_HAS_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROGRESS_NOTE_HAS_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_HAS_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME_LOW,
					ConsolPlugin.INSTANCE.getString("ProgressNoteHasEncompassingEncounterEffectiveTimeLow"),
					new Object[] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteHasEncompassingEncounterFacilityId(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Encompassing Encounter Facility Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteHasEncompassingEncounterFacilityId(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_HAS_ENCOMPASSING_ENCOUNTER_FACILITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf.encompassingEncounter.location.healthCareFacility.id->notEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteHasEncompassingEncounterFacilityId(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Encompassing Encounter Facility Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteHasEncompassingEncounterFacilityId(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_HAS_ENCOMPASSING_ENCOUNTER_FACILITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.componentOf.encompassingEncounter.location.healthCareFacility.id->notEmpty()
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteHasEncompassingEncounterFacilityId(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_HAS_ENCOMPASSING_ENCOUNTER_FACILITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_HAS_ENCOMPASSING_ENCOUNTER_FACILITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_HAS_ENCOMPASSING_ENCOUNTER_FACILITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROGRESS_NOTE_HAS_ENCOMPASSING_ENCOUNTER_FACILITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_HAS_ENCOMPASSING_ENCOUNTER_FACILITY_ID,
					ConsolPlugin.INSTANCE.getString("ProgressNoteHasEncompassingEncounterFacilityId"),
					new Object[] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteTemplateId(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteTemplateId(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.21.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteTemplateId(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteTemplateId(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.21.1')
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteTemplateId(ProgressNote progressNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("ProgressNoteTemplateId"), new Object[] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteRealmCode(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Realm Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteRealmCode(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.realmCode->isEmpty() or self.realmCode->exists(element | element.isNullFlavorUndefined())) implies (self.realmCode->size() = 1 and self.realmCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = element.oclAsType(datatypes::CS) in " + "value.code = 'US'))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteRealmCode(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Realm Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteRealmCode(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.realmCode->isEmpty() or self.realmCode->exists(element | element.isNullFlavorUndefined())) implies (self.realmCode->size() = 1 and self.realmCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = element.oclAsType(datatypes::CS) in 
	 * value.code = 'US'))
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteRealmCode(ProgressNote progressNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_REALM_CODE,
					ConsolPlugin.INSTANCE.getString("ProgressNoteRealmCode"), new Object[] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteTypeId(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Type Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteTypeId(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.typeId.oclIsUndefined() or self.typeId.isNullFlavorUndefined()) implies (not self.typeId.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteTypeId(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Type Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteTypeId(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.typeId.oclIsUndefined() or self.typeId.isNullFlavorUndefined()) implies (not self.typeId.oclIsUndefined())
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteTypeId(ProgressNote progressNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_TYPE_ID,
					ConsolPlugin.INSTANCE.getString("ProgressNoteTypeId"), new Object[] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteId(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteId(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id.oclIsUndefined() or self.id.isNullFlavorUndefined()) implies (not self.id.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteId(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteId(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id.oclIsUndefined() or self.id.isNullFlavorUndefined()) implies (not self.id.oclIsUndefined())
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteId(ProgressNote progressNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_ID, ConsolPlugin.INSTANCE.getString("ProgressNoteId"),
					new Object[] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteCode(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteCode(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("
			+ "value.codeSystem = '2.16.840.1.113883.6.1' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteCode(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteCode(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.codeSystem = '2.16.840.1.113883.6.1' and not value.code.oclIsUndefined()))
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteCode(ProgressNote progressNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_CODE,
					ConsolPlugin.INSTANCE.getString("ProgressNoteCode"), new Object[] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteTitle(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteTitle(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteTitle(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteTitle(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteTitle(ProgressNote progressNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_TITLE,
					ConsolPlugin.INSTANCE.getString("ProgressNoteTitle"), new Object[] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteEffectiveTime(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteEffectiveTime(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteEffectiveTime(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteEffectiveTime(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteEffectiveTime(ProgressNote progressNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_EFFECTIVE_TIME,
					ConsolPlugin.INSTANCE.getString("ProgressNoteEffectiveTime"), new Object[] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteLanguageCode(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Language Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteLanguageCode(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.languageCode.oclIsUndefined() or self.languageCode.isNullFlavorUndefined()) implies (not self.languageCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteLanguageCode(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Language Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteLanguageCode(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.languageCode.oclIsUndefined() or self.languageCode.isNullFlavorUndefined()) implies (not self.languageCode.oclIsUndefined())
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteLanguageCode(ProgressNote progressNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_LANGUAGE_CODE,
					ConsolPlugin.INSTANCE.getString("ProgressNoteLanguageCode"), new Object[] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteAlertsSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Alerts Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteAlertsSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_ALERTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesReactionsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteAlertsSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Alerts Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteAlertsSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_ALERTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesReactionsSection))
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteAlertsSection(ProgressNote progressNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_ALERTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_ALERTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_ALERTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_ALERTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_ALERTS_SECTION,
					ConsolPlugin.INSTANCE.getString("ProgressNoteAlertsSection"), new Object[] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteChiefComplaintSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Chief Complaint Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteChiefComplaintSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSectionProcNote))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteChiefComplaintSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Chief Complaint Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteChiefComplaintSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSectionProcNote))
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteChiefComplaintSection(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_CHIEF_COMPLAINT_SECTION,
					ConsolPlugin.INSTANCE.getString("ProgressNoteChiefComplaintSection"), new Object[] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteMedicationsSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Medications Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteMedicationsSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteMedicationsSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Medications Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteMedicationsSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSection))
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteMedicationsSection(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_MEDICATIONS_SECTION,
					ConsolPlugin.INSTANCE.getString("ProgressNoteMedicationsSection"), new Object[] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteObjectiveSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Objective Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteObjectiveSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_OBJECTIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ObjectiveSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteObjectiveSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Objective Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteObjectiveSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_OBJECTIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ObjectiveSection))
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteObjectiveSection(ProgressNote progressNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_OBJECTIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_OBJECTIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_OBJECTIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_OBJECTIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_OBJECTIVE_SECTION,
					ConsolPlugin.INSTANCE.getString("ProgressNoteObjectiveSection"), new Object[] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNotePhysicalExaminationSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Physical Examination Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNotePhysicalExaminationSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_PHYSICAL_EXAMINATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PhysicalExamSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNotePhysicalExaminationSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Physical Examination Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNotePhysicalExaminationSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_PHYSICAL_EXAMINATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PhysicalExamSection))
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNotePhysicalExaminationSection(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_PHYSICAL_EXAMINATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_PHYSICAL_EXAMINATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_PHYSICAL_EXAMINATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_PHYSICAL_EXAMINATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_PHYSICAL_EXAMINATION_SECTION,
					ConsolPlugin.INSTANCE.getString("ProgressNotePhysicalExaminationSection"),
					new Object[] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteProblemSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Problem Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteProblemSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemListSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteProblemSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Problem Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteProblemSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemListSection))
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteProblemSection(ProgressNote progressNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_PROBLEM_SECTION,
					ConsolPlugin.INSTANCE.getString("ProgressNoteProblemSection"), new Object[] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteResultsSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Results Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteResultsSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DiagnosticFindings))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteResultsSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Results Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteResultsSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DiagnosticFindings))
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteResultsSection(ProgressNote progressNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_RESULTS_SECTION,
					ConsolPlugin.INSTANCE.getString("ProgressNoteResultsSection"), new Object[] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteVitalSignsSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Vital Signs Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteVitalSignsSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::CCDVitalSignsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteVitalSignsSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Vital Signs Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteVitalSignsSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::CCDVitalSignsSection))
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteVitalSignsSection(ProgressNote progressNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_VITAL_SIGNS_SECTION,
					ConsolPlugin.INSTANCE.getString("ProgressNoteVitalSignsSection"), new Object[] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteReviewOfSystemsSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Review Of Systems Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteReviewOfSystemsSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReviewOfSystemsSectionIHE))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteReviewOfSystemsSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Review Of Systems Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteReviewOfSystemsSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReviewOfSystemsSectionIHE))
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteReviewOfSystemsSection(ProgressNote progressNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_REVIEW_OF_SYSTEMS_SECTION,
					ConsolPlugin.INSTANCE.getString("ProgressNoteReviewOfSystemsSection"),
					new Object[] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteSubjectiveSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Subjective Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteSubjectiveSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_SUBJECTIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SubjectiveSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteSubjectiveSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Subjective Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteSubjectiveSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_SUBJECTIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SubjectiveSection))
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProgressNoteSubjectiveSection(ProgressNote progressNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_SUBJECTIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_SUBJECTIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_SUBJECTIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_SUBJECTIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			progressNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROGRESS_NOTE__PROGRESS_NOTE_SUBJECTIVE_SECTION,
					ConsolPlugin.INSTANCE.getString("ProgressNoteSubjectiveSection"), new Object[] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getAssessmentAndPlanSection(ProgressNote) <em>Get Assessment And Plan Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentAndPlanSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSectionProcNote))->asSequence()->first().oclAsType(consol::AssessmentAndPlanSectionProcNote)";

	/**
	 * The cached OCL query for the '{@link #getAssessmentAndPlanSection(ProgressNote) <em>Get Assessment And Plan Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentAndPlanSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSectionProcNote))->asSequence()->first().oclAsType(consol::AssessmentAndPlanSectionProcNote)
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static AssessmentAndPlanSectionProcNote getAssessmentAndPlanSection(ProgressNote progressNote) {
		if (GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROGRESS_NOTE, ConsolPackage.Literals.PROGRESS_NOTE.getEAllOperations().get(88));
			try {
				GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_QRY = helper.createQuery(GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_QRY);
		return (AssessmentAndPlanSectionProcNote) query.evaluate(progressNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAssessmentSection(ProgressNote) <em>Get Assessment Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ASSESSMENT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSectionProcNote))->asSequence()->first().oclAsType(consol::AssessmentSectionProcNote)";

	/**
	 * The cached OCL query for the '{@link #getAssessmentSection(ProgressNote) <em>Get Assessment Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ASSESSMENT_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSectionProcNote))->asSequence()->first().oclAsType(consol::AssessmentSectionProcNote)
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static AssessmentSectionProcNote getAssessmentSection(ProgressNote progressNote) {
		if (GET_ASSESSMENT_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROGRESS_NOTE, ConsolPackage.Literals.PROGRESS_NOTE.getEAllOperations().get(89));
			try {
				GET_ASSESSMENT_SECTION__EOCL_QRY = helper.createQuery(GET_ASSESSMENT_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ASSESSMENT_SECTION__EOCL_QRY);
		return (AssessmentSectionProcNote) query.evaluate(progressNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPlanSection(ProgressNote) <em>Get Plan Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLAN_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection))->asSequence()->first().oclAsType(consol::PlanOfCareSection)";

	/**
	 * The cached OCL query for the '{@link #getPlanSection(ProgressNote) <em>Get Plan Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLAN_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection))->asSequence()->first().oclAsType(consol::PlanOfCareSection)
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static PlanOfCareSection getPlanSection(ProgressNote progressNote) {
		if (GET_PLAN_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROGRESS_NOTE, ConsolPackage.Literals.PROGRESS_NOTE.getEAllOperations().get(90));
			try {
				GET_PLAN_SECTION__EOCL_QRY = helper.createQuery(GET_PLAN_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PLAN_SECTION__EOCL_QRY);
		return (PlanOfCareSection) query.evaluate(progressNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAlertsSection(ProgressNote) <em>Get Alerts Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlertsSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ALERTS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesReactionsSection))->asSequence()->first().oclAsType(consol::AllergiesReactionsSection)";

	/**
	 * The cached OCL query for the '{@link #getAlertsSection(ProgressNote) <em>Get Alerts Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlertsSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ALERTS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesReactionsSection))->asSequence()->first().oclAsType(consol::AllergiesReactionsSection)
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static AllergiesReactionsSection getAlertsSection(ProgressNote progressNote) {
		if (GET_ALERTS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROGRESS_NOTE, ConsolPackage.Literals.PROGRESS_NOTE.getEAllOperations().get(91));
			try {
				GET_ALERTS_SECTION__EOCL_QRY = helper.createQuery(GET_ALERTS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ALERTS_SECTION__EOCL_QRY);
		return (AllergiesReactionsSection) query.evaluate(progressNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getChiefComplaintSection(ProgressNote) <em>Get Chief Complaint Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChiefComplaintSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CHIEF_COMPLAINT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSectionProcNote))->asSequence()->first().oclAsType(consol::ChiefComplaintSectionProcNote)";

	/**
	 * The cached OCL query for the '{@link #getChiefComplaintSection(ProgressNote) <em>Get Chief Complaint Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChiefComplaintSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSectionProcNote))->asSequence()->first().oclAsType(consol::ChiefComplaintSectionProcNote)
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static ChiefComplaintSectionProcNote getChiefComplaintSection(ProgressNote progressNote) {
		if (GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROGRESS_NOTE, ConsolPackage.Literals.PROGRESS_NOTE.getEAllOperations().get(92));
			try {
				GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY = helper.createQuery(GET_CHIEF_COMPLAINT_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY);
		return (ChiefComplaintSectionProcNote) query.evaluate(progressNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicationsSection(ProgressNote) <em>Get Medications Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationsSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSection))->asSequence()->first().oclAsType(consol::MedicationsSection)";

	/**
	 * The cached OCL query for the '{@link #getMedicationsSection(ProgressNote) <em>Get Medications Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationsSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATIONS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSection))->asSequence()->first().oclAsType(consol::MedicationsSection)
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static MedicationsSection getMedicationsSection(ProgressNote progressNote) {
		if (GET_MEDICATIONS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROGRESS_NOTE, ConsolPackage.Literals.PROGRESS_NOTE.getEAllOperations().get(93));
			try {
				GET_MEDICATIONS_SECTION__EOCL_QRY = helper.createQuery(GET_MEDICATIONS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATIONS_SECTION__EOCL_QRY);
		return (MedicationsSection) query.evaluate(progressNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getObjectiveSection(ProgressNote) <em>Get Objective Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectiveSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_OBJECTIVE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ObjectiveSection))->asSequence()->first().oclAsType(consol::ObjectiveSection)";

	/**
	 * The cached OCL query for the '{@link #getObjectiveSection(ProgressNote) <em>Get Objective Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectiveSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_OBJECTIVE_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ObjectiveSection))->asSequence()->first().oclAsType(consol::ObjectiveSection)
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static ObjectiveSection getObjectiveSection(ProgressNote progressNote) {
		if (GET_OBJECTIVE_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROGRESS_NOTE, ConsolPackage.Literals.PROGRESS_NOTE.getEAllOperations().get(94));
			try {
				GET_OBJECTIVE_SECTION__EOCL_QRY = helper.createQuery(GET_OBJECTIVE_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_OBJECTIVE_SECTION__EOCL_QRY);
		return (ObjectiveSection) query.evaluate(progressNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPhysicalExaminationSection(ProgressNote) <em>Get Physical Examination Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalExaminationSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PHYSICAL_EXAMINATION_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PhysicalExamSection))->asSequence()->first().oclAsType(consol::PhysicalExamSection)";

	/**
	 * The cached OCL query for the '{@link #getPhysicalExaminationSection(ProgressNote) <em>Get Physical Examination Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalExaminationSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PHYSICAL_EXAMINATION_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PhysicalExamSection))->asSequence()->first().oclAsType(consol::PhysicalExamSection)
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static PhysicalExamSection getPhysicalExaminationSection(ProgressNote progressNote) {
		if (GET_PHYSICAL_EXAMINATION_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROGRESS_NOTE, ConsolPackage.Literals.PROGRESS_NOTE.getEAllOperations().get(95));
			try {
				GET_PHYSICAL_EXAMINATION_SECTION__EOCL_QRY = helper.createQuery(GET_PHYSICAL_EXAMINATION_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PHYSICAL_EXAMINATION_SECTION__EOCL_QRY);
		return (PhysicalExamSection) query.evaluate(progressNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemSection(ProgressNote) <em>Get Problem Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemListSection))->asSequence()->first().oclAsType(consol::ProblemListSection)";

	/**
	 * The cached OCL query for the '{@link #getProblemSection(ProgressNote) <em>Get Problem Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemListSection))->asSequence()->first().oclAsType(consol::ProblemListSection)
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static ProblemListSection getProblemSection(ProgressNote progressNote) {
		if (GET_PROBLEM_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROGRESS_NOTE, ConsolPackage.Literals.PROGRESS_NOTE.getEAllOperations().get(96));
			try {
				GET_PROBLEM_SECTION__EOCL_QRY = helper.createQuery(GET_PROBLEM_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_SECTION__EOCL_QRY);
		return (ProblemListSection) query.evaluate(progressNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getResultsSection(ProgressNote) <em>Get Results Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultsSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RESULTS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DiagnosticFindings))->asSequence()->first().oclAsType(consol::DiagnosticFindings)";

	/**
	 * The cached OCL query for the '{@link #getResultsSection(ProgressNote) <em>Get Results Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultsSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RESULTS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DiagnosticFindings))->asSequence()->first().oclAsType(consol::DiagnosticFindings)
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static DiagnosticFindings getResultsSection(ProgressNote progressNote) {
		if (GET_RESULTS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROGRESS_NOTE, ConsolPackage.Literals.PROGRESS_NOTE.getEAllOperations().get(97));
			try {
				GET_RESULTS_SECTION__EOCL_QRY = helper.createQuery(GET_RESULTS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_RESULTS_SECTION__EOCL_QRY);
		return (DiagnosticFindings) query.evaluate(progressNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getVitalSignsSection(ProgressNote) <em>Get Vital Signs Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignsSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_VITAL_SIGNS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::CCDVitalSignsSection))->asSequence()->first().oclAsType(consol::CCDVitalSignsSection)";

	/**
	 * The cached OCL query for the '{@link #getVitalSignsSection(ProgressNote) <em>Get Vital Signs Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignsSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_VITAL_SIGNS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::CCDVitalSignsSection))->asSequence()->first().oclAsType(consol::CCDVitalSignsSection)
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static CCDVitalSignsSection getVitalSignsSection(ProgressNote progressNote) {
		if (GET_VITAL_SIGNS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROGRESS_NOTE, ConsolPackage.Literals.PROGRESS_NOTE.getEAllOperations().get(98));
			try {
				GET_VITAL_SIGNS_SECTION__EOCL_QRY = helper.createQuery(GET_VITAL_SIGNS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_VITAL_SIGNS_SECTION__EOCL_QRY);
		return (CCDVitalSignsSection) query.evaluate(progressNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getReviewOfSystemsSection(ProgressNote) <em>Get Review Of Systems Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewOfSystemsSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReviewOfSystemsSectionIHE))->asSequence()->first().oclAsType(consol::ReviewOfSystemsSectionIHE)";

	/**
	 * The cached OCL query for the '{@link #getReviewOfSystemsSection(ProgressNote) <em>Get Review Of Systems Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewOfSystemsSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReviewOfSystemsSectionIHE))->asSequence()->first().oclAsType(consol::ReviewOfSystemsSectionIHE)
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static ReviewOfSystemsSectionIHE getReviewOfSystemsSection(ProgressNote progressNote) {
		if (GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROGRESS_NOTE, ConsolPackage.Literals.PROGRESS_NOTE.getEAllOperations().get(99));
			try {
				GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY = helper.createQuery(GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY);
		return (ReviewOfSystemsSectionIHE) query.evaluate(progressNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getSubjectiveSection(ProgressNote) <em>Get Subjective Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectiveSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SUBJECTIVE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SubjectiveSection))->asSequence()->first().oclAsType(consol::SubjectiveSection)";

	/**
	 * The cached OCL query for the '{@link #getSubjectiveSection(ProgressNote) <em>Get Subjective Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectiveSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SUBJECTIVE_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SubjectiveSection))->asSequence()->first().oclAsType(consol::SubjectiveSection)
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static SubjectiveSection getSubjectiveSection(ProgressNote progressNote) {
		if (GET_SUBJECTIVE_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROGRESS_NOTE, ConsolPackage.Literals.PROGRESS_NOTE.getEAllOperations().get(100));
			try {
				GET_SUBJECTIVE_SECTION__EOCL_QRY = helper.createQuery(GET_SUBJECTIVE_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SUBJECTIVE_SECTION__EOCL_QRY);
		return (SubjectiveSection) query.evaluate(progressNote);
	}

} // ProgressNoteOperations
