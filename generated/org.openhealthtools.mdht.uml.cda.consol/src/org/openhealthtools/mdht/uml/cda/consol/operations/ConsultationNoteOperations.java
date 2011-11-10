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
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.ConsultationNote;
import org.openhealthtools.mdht.uml.cda.consol.DiagnosticFindings;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.IHEHistoryOfPresentIllness;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.PastMedicalHistorySectionConsult;
import org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemListSection;
import org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.SurgeriesSection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalDocumentOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Consultation Note</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNotePersonHasName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Person Has Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteRolesShallHaveAddrAndTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Roles Shall Have Addr And Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteRolesShouldHaveAddrAndTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Roles Should Have Addr And Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteOrganizationsHaveContactInfo(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Organizations Have Contact Info</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteTimePreciseToDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Time Precise To Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteTimePreciseToYear(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Time Precise To Year</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteTelephoneMatchesRegex(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Telephone Matches Regex</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteHasTelephoneDialingDigits(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Has Telephone Dialing Digits</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteUnknownTelephoneUsesNullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Unknown Telephone Uses Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteTypeIdExtension(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Type Id Extension</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteIdRootFormat(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Id Root Format</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteOidLength(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Oid Length</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteLanguageCodeForm(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Language Code Form</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteSetIdAndVersionNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Set Id And Version Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteSetIdAndIdAreUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Set Id And Id Are Unique</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteCopyTimeNotPresent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Copy Time Not Present</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteHasRecordTargetPatientRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Has Record Target Patient Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteHasPatientBirthTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Has Patient Birth Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteHasAdministrativeGenderCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Has Administrative Gender Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteHasProviderOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Has Provider Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteHasAuthorTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Has Author Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteHasAssignedAuthorId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Has Assigned Author Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteHasAssignedAuthorPersonOrDevice(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Has Assigned Author Person Or Device</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteHasDataEntererAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Has Data Enterer Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteHasDataEntererTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Has Data Enterer Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteHasInformant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Has Informant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteHasInformantAssignedPersonOrRelatedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Has Informant Assigned Person Or Related Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteLegalAuthenticatorHasAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Legal Authenticator Has Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteAuthenticatorHasAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Authenticator Has Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteTimePreciseToSecond(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Time Precise To Second</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteTimePreciseToYearAndDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Time Precise To Year And Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteReferralOrVisit(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Referral Or Visit</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteRealmCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteTypeId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteLanguageCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Language Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteHistoryOfPresentIllness(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note History Of Present Illness</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNotePhysicalExamination(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Physical Examination</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteProblemSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Problem Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteProceduresSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Procedures Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNotePastMedicalHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Past Medical History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteImmunizationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Immunizations Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteMedicationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteAlertsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Alerts Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteSocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteFamilyHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Family History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteReviewOfSystemsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteVitalSignsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteGeneralStatusSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note General Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteDiagnosticFindings(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Diagnostic Findings</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#getHistoryOfPresentIllness() <em>Get History Of Present Illness</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#getPhysicalExamination() <em>Get Physical Examination</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#getProblemSection() <em>Get Problem Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#getProceduresSection() <em>Get Procedures Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#getPastMedicalHistorySection() <em>Get Past Medical History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#getImmunizationsSection() <em>Get Immunizations Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#getMedicationsSection() <em>Get Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#getAlertsSection() <em>Get Alerts Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#getSocialHistorySection() <em>Get Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#getFamilyHistorySection() <em>Get Family History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#getReviewOfSystemsSection() <em>Get Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#getVitalSignsSection() <em>Get Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#getGeneralStatusSection() <em>Get General Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#getDiagnosticFindings() <em>Get Diagnostic Findings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConsultationNoteOperations extends ClinicalDocumentOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsultationNoteOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNotePersonHasName(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Person Has Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNotePersonHasName(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_PERSON_HAS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNotePersonHasName(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Person Has Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNotePersonHasName(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_NOTE_PERSON_HAS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNotePersonHasName(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_NOTE_PERSON_HAS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_PERSON_HAS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_PERSON_HAS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE_PERSON_HAS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_PERSON_HAS_NAME,
					ConsolPlugin.INSTANCE.getString("ConsultationNotePersonHasName"), new Object[] { consultationNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteRolesShallHaveAddrAndTelecom(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Roles Shall Have Addr And Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteRolesShallHaveAddrAndTelecom(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_ROLES_SHALL_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteRolesShallHaveAddrAndTelecom(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Roles Shall Have Addr And Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteRolesShallHaveAddrAndTelecom(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_NOTE_ROLES_SHALL_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNoteRolesShallHaveAddrAndTelecom(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_NOTE_ROLES_SHALL_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_ROLES_SHALL_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_ROLES_SHALL_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONSULTATION_NOTE_ROLES_SHALL_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_ROLES_SHALL_HAVE_ADDR_AND_TELECOM,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteRolesShallHaveAddrAndTelecom"),
					new Object[] { consultationNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteRolesShouldHaveAddrAndTelecom(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Roles Should Have Addr And Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteRolesShouldHaveAddrAndTelecom(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_ROLES_SHOULD_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteRolesShouldHaveAddrAndTelecom(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Roles Should Have Addr And Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteRolesShouldHaveAddrAndTelecom(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_NOTE_ROLES_SHOULD_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNoteRolesShouldHaveAddrAndTelecom(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_NOTE_ROLES_SHOULD_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_ROLES_SHOULD_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_ROLES_SHOULD_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONSULTATION_NOTE_ROLES_SHOULD_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_ROLES_SHOULD_HAVE_ADDR_AND_TELECOM,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteRolesShouldHaveAddrAndTelecom"),
					new Object[] { consultationNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteOrganizationsHaveContactInfo(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Organizations Have Contact Info</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteOrganizationsHaveContactInfo(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_ORGANIZATIONS_HAVE_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteOrganizationsHaveContactInfo(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Organizations Have Contact Info</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteOrganizationsHaveContactInfo(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_NOTE_ORGANIZATIONS_HAVE_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNoteOrganizationsHaveContactInfo(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_NOTE_ORGANIZATIONS_HAVE_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_ORGANIZATIONS_HAVE_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_ORGANIZATIONS_HAVE_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONSULTATION_NOTE_ORGANIZATIONS_HAVE_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_ORGANIZATIONS_HAVE_CONTACT_INFO,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteOrganizationsHaveContactInfo"),
					new Object[] { consultationNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteTimePreciseToDay(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Time Precise To Day</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteTimePreciseToDay(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteTimePreciseToDay(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Time Precise To Day</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteTimePreciseToDay(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_NOTE_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNoteTimePreciseToDay(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_NOTE_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_TIME_PRECISE_TO_DAY,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteTimePreciseToDay"),
					new Object[] { consultationNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteTimePreciseToYear(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Time Precise To Year</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteTimePreciseToYear(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "cda::OrganizationPartOf.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject)-> union(  cda::MaintainedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union( cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::ServiceEvent.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::EncounterParticipant.allInstances()->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(self.participant->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(cda::OrganizationPartOf.allInstances().effectiveTime->union(cda::MaintainedEntity.allInstances().effectiveTime)->union( cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::ServiceEvent.allInstances().effectiveTime)->union(cda::EncounterParticipant.allInstances().time)->union(self.participant.time)->select(current : datatypes::IVL_TS  |  ((not current.low.oclIsUndefined()) and (current.low.value.oclIsUndefined() or current.low.value.size() < 4)) or ((not current.center.oclIsUndefined()) and (current.center.value.oclIsUndefined() or current.center.value.size() < 4)) or ((not current.high.oclIsUndefined()) and (current.high.value.oclIsUndefined() or current.high.value.size() < 4)) or (current.low.oclIsUndefined() and current.center.oclIsUndefined() and current.high.oclIsUndefined()) ).oclAsType( ecore::EObject))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteTimePreciseToYear(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Time Precise To Year</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteTimePreciseToYear(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_NOTE_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::OrganizationPartOf.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject)-> union(  cda::MaintainedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union( cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::ServiceEvent.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::EncounterParticipant.allInstances()->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(self.participant->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(cda::OrganizationPartOf.allInstances().effectiveTime->union(cda::MaintainedEntity.allInstances().effectiveTime)->union( cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::ServiceEvent.allInstances().effectiveTime)->union(cda::EncounterParticipant.allInstances().time)->union(self.participant.time)->select(current : datatypes::IVL_TS  |  ((not current.low.oclIsUndefined()) and (current.low.value.oclIsUndefined() or current.low.value.size() < 4)) or ((not current.center.oclIsUndefined()) and (current.center.value.oclIsUndefined() or current.center.value.size() < 4)) or ((not current.high.oclIsUndefined()) and (current.high.value.oclIsUndefined() or current.high.value.size() < 4)) or (current.low.oclIsUndefined() and current.center.oclIsUndefined() and current.high.oclIsUndefined()) ).oclAsType( ecore::EObject))
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNoteTimePreciseToYear(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_NOTE_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_TIME_PRECISE_TO_YEAR,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteTimePreciseToYear"),
					new Object[] { consultationNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteTelephoneMatchesRegex(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Telephone Matches Regex</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteTelephoneMatchesRegex(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_TELEPHONE_MATCHES_REGEX__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteTelephoneMatchesRegex(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Telephone Matches Regex</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteTelephoneMatchesRegex(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_NOTE_TELEPHONE_MATCHES_REGEX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNoteTelephoneMatchesRegex(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_NOTE_TELEPHONE_MATCHES_REGEX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_TELEPHONE_MATCHES_REGEX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_TELEPHONE_MATCHES_REGEX__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE_TELEPHONE_MATCHES_REGEX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_TELEPHONE_MATCHES_REGEX,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteTelephoneMatchesRegex"),
					new Object[] { consultationNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteHasTelephoneDialingDigits(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Has Telephone Dialing Digits</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteHasTelephoneDialingDigits(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_HAS_TELEPHONE_DIALING_DIGITS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteHasTelephoneDialingDigits(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Has Telephone Dialing Digits</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteHasTelephoneDialingDigits(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_NOTE_HAS_TELEPHONE_DIALING_DIGITS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNoteHasTelephoneDialingDigits(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_NOTE_HAS_TELEPHONE_DIALING_DIGITS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_HAS_TELEPHONE_DIALING_DIGITS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_HAS_TELEPHONE_DIALING_DIGITS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONSULTATION_NOTE_HAS_TELEPHONE_DIALING_DIGITS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_HAS_TELEPHONE_DIALING_DIGITS,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteHasTelephoneDialingDigits"),
					new Object[] { consultationNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteUnknownTelephoneUsesNullFlavor(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Unknown Telephone Uses Null Flavor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteUnknownTelephoneUsesNullFlavor(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_UNKNOWN_TELEPHONE_USES_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteUnknownTelephoneUsesNullFlavor(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Unknown Telephone Uses Null Flavor</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteUnknownTelephoneUsesNullFlavor(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_NOTE_UNKNOWN_TELEPHONE_USES_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNoteUnknownTelephoneUsesNullFlavor(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_NOTE_UNKNOWN_TELEPHONE_USES_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_UNKNOWN_TELEPHONE_USES_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_UNKNOWN_TELEPHONE_USES_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONSULTATION_NOTE_UNKNOWN_TELEPHONE_USES_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_UNKNOWN_TELEPHONE_USES_NULL_FLAVOR,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteUnknownTelephoneUsesNullFlavor"),
					new Object[] { consultationNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteTypeIdExtension(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Type Id Extension</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteTypeIdExtension(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.typeId.extension = 'POCD_HD000040'";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteTypeIdExtension(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Type Id Extension</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteTypeIdExtension(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_NOTE_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.typeId.extension = 'POCD_HD000040'
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNoteTypeIdExtension(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_NOTE_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_TYPE_ID_EXTENSION,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteTypeIdExtension"),
					new Object[] { consultationNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteIdRootFormat(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Id Root Format</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteIdRootFormat(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_ID_ROOT_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.id.matches('root','([0-2])(.([1-9][0-9]*|0))+') or self.id.matches('root','([A-Fa-f0-9]{8})(\\\\-[A-Fa-f0-9]{4}){3}(\\\\-[A-Fa-f0-9]{12})')";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteIdRootFormat(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Id Root Format</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteIdRootFormat(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_NOTE_ID_ROOT_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.id.matches('root','([0-2])(.([1-9][0-9]*|0))+') or self.id.matches('root','([A-Fa-f0-9]{8})(\\\\-[A-Fa-f0-9]{4}){3}(\\\\-[A-Fa-f0-9]{12})')
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNoteIdRootFormat(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_NOTE_ID_ROOT_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_ID_ROOT_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_ID_ROOT_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE_ID_ROOT_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_ID_ROOT_FORMAT,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteIdRootFormat"), new Object[] { consultationNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteOidLength(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Oid Length</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteOidLength(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_OID_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.id->select((not id.root.oclIsUndefined()) and id.root.size() > 64 )";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteOidLength(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Oid Length</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteOidLength(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_NOTE_OID_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.id->select((not id.root.oclIsUndefined()) and id.root.size() > 64 )
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNoteOidLength(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_NOTE_OID_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_OID_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_OID_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE_OID_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_OID_LENGTH,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteOidLength"), new Object[] { consultationNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteLanguageCodeForm(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Language Code Form</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteLanguageCodeForm(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_LANGUAGE_CODE_FORM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.languageCode.matches('code','(([a-z]{2})(\\\\-[A-Z]{2})?)')";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteLanguageCodeForm(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Language Code Form</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteLanguageCodeForm(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_NOTE_LANGUAGE_CODE_FORM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.languageCode.matches('code','(([a-z]{2})(\\\\-[A-Z]{2})?)')
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNoteLanguageCodeForm(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_NOTE_LANGUAGE_CODE_FORM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_LANGUAGE_CODE_FORM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_LANGUAGE_CODE_FORM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE_LANGUAGE_CODE_FORM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_LANGUAGE_CODE_FORM,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteLanguageCodeForm"),
					new Object[] { consultationNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteSetIdAndVersionNumber(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Set Id And Version Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteSetIdAndVersionNumber(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_SET_ID_AND_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.setId.oclIsUndefined() and self.versionNumber.oclIsUndefined())"
			+ "   xor (not self.setId.oclIsUndefined() and not self.versionNumber.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteSetIdAndVersionNumber(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Set Id And Version Number</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteSetIdAndVersionNumber(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_NOTE_SET_ID_AND_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.setId.oclIsUndefined() and self.versionNumber.oclIsUndefined())
	 *    xor (not self.setId.oclIsUndefined() and not self.versionNumber.oclIsUndefined())
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNoteSetIdAndVersionNumber(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_NOTE_SET_ID_AND_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_SET_ID_AND_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_SET_ID_AND_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE_SET_ID_AND_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_SET_ID_AND_VERSION_NUMBER,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteSetIdAndVersionNumber"),
					new Object[] { consultationNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteSetIdAndIdAreUnique(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Set Id And Id Are Unique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteSetIdAndIdAreUnique(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_SET_ID_AND_ID_ARE_UNIQUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(not self.setId.oclIsUndefined() and not self.id.oclIsUndefined())"
			+ "   implies (self.setId.root <> self.id.root or self.setId.extension <> self.id.extension)";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteSetIdAndIdAreUnique(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Set Id And Id Are Unique</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteSetIdAndIdAreUnique(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_NOTE_SET_ID_AND_ID_ARE_UNIQUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (not self.setId.oclIsUndefined() and not self.id.oclIsUndefined())
	 *    implies (self.setId.root <> self.id.root or self.setId.extension <> self.id.extension)
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNoteSetIdAndIdAreUnique(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_NOTE_SET_ID_AND_ID_ARE_UNIQUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_SET_ID_AND_ID_ARE_UNIQUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_SET_ID_AND_ID_ARE_UNIQUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE_SET_ID_AND_ID_ARE_UNIQUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_SET_ID_AND_ID_ARE_UNIQUE,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteSetIdAndIdAreUnique"),
					new Object[] { consultationNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteCopyTimeNotPresent(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Copy Time Not Present</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteCopyTimeNotPresent(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_COPY_TIME_NOT_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.copyTime.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteCopyTimeNotPresent(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Copy Time Not Present</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteCopyTimeNotPresent(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_NOTE_COPY_TIME_NOT_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.copyTime.oclIsUndefined()
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNoteCopyTimeNotPresent(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_NOTE_COPY_TIME_NOT_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_COPY_TIME_NOT_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_COPY_TIME_NOT_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE_COPY_TIME_NOT_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_COPY_TIME_NOT_PRESENT,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteCopyTimeNotPresent"),
					new Object[] { consultationNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteHasRecordTargetPatientRole(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Has Record Target Patient Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteHasRecordTargetPatientRole(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_HAS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->size() > 0 and self.recordTarget->exists(target : cda::RecordTarget | not target.patientRole.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteHasRecordTargetPatientRole(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Has Record Target Patient Role</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteHasRecordTargetPatientRole(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_NOTE_HAS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->size() > 0 and self.recordTarget->exists(target : cda::RecordTarget | not target.patientRole.oclIsUndefined())
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNoteHasRecordTargetPatientRole(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_NOTE_HAS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_HAS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_HAS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONSULTATION_NOTE_HAS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_HAS_RECORD_TARGET_PATIENT_ROLE,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteHasRecordTargetPatientRole"),
					new Object[] { consultationNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteHasPatientBirthTime(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Has Patient Birth Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteHasPatientBirthTime(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_HAS_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->forAll(target : cda::RecordTarget | not target.patientRole.oclIsUndefined()"
			+ "   implies (not target.patientRole.patient.birthTime.value.oclIsUndefined()"
			+ "      or not target.patientRole.patient.birthTime.nullFlavor.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteHasPatientBirthTime(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Has Patient Birth Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteHasPatientBirthTime(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_NOTE_HAS_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->forAll(target : cda::RecordTarget | not target.patientRole.oclIsUndefined()
	 *    implies (not target.patientRole.patient.birthTime.value.oclIsUndefined()
	 *       or not target.patientRole.patient.birthTime.nullFlavor.oclIsUndefined()))
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNoteHasPatientBirthTime(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_NOTE_HAS_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_HAS_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_HAS_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE_HAS_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_HAS_PATIENT_BIRTH_TIME,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteHasPatientBirthTime"),
					new Object[] { consultationNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteHasAdministrativeGenderCode(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Has Administrative Gender Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteHasAdministrativeGenderCode(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_HAS_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->forAll(target : cda::RecordTarget | not target.patientRole.oclIsUndefined()"
			+ "   implies (not target.patientRole.patient.administrativeGenderCode.code.oclIsUndefined()"
			+ "      or not target.patientRole.patient.administrativeGenderCode.nullFlavor.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteHasAdministrativeGenderCode(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Has Administrative Gender Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteHasAdministrativeGenderCode(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_NOTE_HAS_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->forAll(target : cda::RecordTarget | not target.patientRole.oclIsUndefined()
	 *    implies (not target.patientRole.patient.administrativeGenderCode.code.oclIsUndefined()
	 *       or not target.patientRole.patient.administrativeGenderCode.nullFlavor.oclIsUndefined()))
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNoteHasAdministrativeGenderCode(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_NOTE_HAS_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_HAS_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_HAS_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONSULTATION_NOTE_HAS_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_HAS_ADMINISTRATIVE_GENDER_CODE,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteHasAdministrativeGenderCode"),
					new Object[] { consultationNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteHasProviderOrganization(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Has Provider Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteHasProviderOrganization(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_HAS_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->exists(target : cda::RecordTarget | not target.patientRole.providerOrganization.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteHasProviderOrganization(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Has Provider Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteHasProviderOrganization(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_NOTE_HAS_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->exists(target : cda::RecordTarget | not target.patientRole.providerOrganization.oclIsUndefined())
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNoteHasProviderOrganization(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_NOTE_HAS_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_HAS_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_HAS_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE_HAS_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_HAS_PROVIDER_ORGANIZATION,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteHasProviderOrganization"),
					new Object[] { consultationNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteHasAuthorTime(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Has Author Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteHasAuthorTime(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->forAll(author : cda::Author | not author.time.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteHasAuthorTime(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Has Author Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteHasAuthorTime(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_NOTE_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.author->forAll(author : cda::Author | not author.time.oclIsUndefined())
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNoteHasAuthorTime(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_NOTE_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_HAS_AUTHOR_TIME,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteHasAuthorTime"), new Object[] { consultationNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteHasAssignedAuthorId(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Has Assigned Author Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteHasAssignedAuthorId(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->forAll(author : cda::Author | author.assignedAuthor.id->size() > 0)";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteHasAssignedAuthorId(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Has Assigned Author Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteHasAssignedAuthorId(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_NOTE_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.author->forAll(author : cda::Author | author.assignedAuthor.id->size() > 0)
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNoteHasAssignedAuthorId(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_NOTE_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_HAS_ASSIGNED_AUTHOR_ID,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteHasAssignedAuthorId"),
					new Object[] { consultationNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteHasAssignedAuthorPersonOrDevice(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Has Assigned Author Person Or Device</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteHasAssignedAuthorPersonOrDevice(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->forAll(author : cda::Author | not author.assignedAuthor.assignedPerson.oclIsUndefined() "
			+ "   or not author.assignedAuthor.assignedAuthoringDevice.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteHasAssignedAuthorPersonOrDevice(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Has Assigned Author Person Or Device</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteHasAssignedAuthorPersonOrDevice(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_NOTE_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.author->forAll(author : cda::Author | not author.assignedAuthor.assignedPerson.oclIsUndefined() 
	 *    or not author.assignedAuthor.assignedAuthoringDevice.oclIsUndefined())
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNoteHasAssignedAuthorPersonOrDevice(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_NOTE_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONSULTATION_NOTE_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteHasAssignedAuthorPersonOrDevice"),
					new Object[] { consultationNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteHasDataEntererAssignedPerson(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Has Data Enterer Assigned Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteHasDataEntererAssignedPerson(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_HAS_DATA_ENTERER_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.dataEnterer.oclIsUndefined() implies not self.dataEnterer.assignedEntity.assignedPerson.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteHasDataEntererAssignedPerson(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Has Data Enterer Assigned Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteHasDataEntererAssignedPerson(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_NOTE_HAS_DATA_ENTERER_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.dataEnterer.oclIsUndefined() implies not self.dataEnterer.assignedEntity.assignedPerson.oclIsUndefined()
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNoteHasDataEntererAssignedPerson(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_NOTE_HAS_DATA_ENTERER_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_HAS_DATA_ENTERER_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_HAS_DATA_ENTERER_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONSULTATION_NOTE_HAS_DATA_ENTERER_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_HAS_DATA_ENTERER_ASSIGNED_PERSON,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteHasDataEntererAssignedPerson"),
					new Object[] { consultationNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteHasDataEntererTime(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Has Data Enterer Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteHasDataEntererTime(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_HAS_DATA_ENTERER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.dataEnterer.oclIsUndefined() implies not self.dataEnterer.time.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteHasDataEntererTime(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Has Data Enterer Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteHasDataEntererTime(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_NOTE_HAS_DATA_ENTERER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.dataEnterer.oclIsUndefined() implies not self.dataEnterer.time.oclIsUndefined()
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNoteHasDataEntererTime(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_NOTE_HAS_DATA_ENTERER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_HAS_DATA_ENTERER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_HAS_DATA_ENTERER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE_HAS_DATA_ENTERER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_HAS_DATA_ENTERER_TIME,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteHasDataEntererTime"),
					new Object[] { consultationNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteHasInformant(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Has Informant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteHasInformant(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_HAS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->size() > 0";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteHasInformant(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Has Informant</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteHasInformant(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_NOTE_HAS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.informant->size() > 0
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNoteHasInformant(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_NOTE_HAS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_HAS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_HAS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE_HAS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_HAS_INFORMANT,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteHasInformant"), new Object[] { consultationNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteHasInformantAssignedPersonOrRelatedPerson(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Has Informant Assigned Person Or Related Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteHasInformantAssignedPersonOrRelatedPerson(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->forAll(i : cda::Informant12 | not i.assignedEntity.assignedPerson.oclIsUndefined()"
			+ "   or not i.relatedEntity.relatedPerson.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteHasInformantAssignedPersonOrRelatedPerson(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Has Informant Assigned Person Or Related Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteHasInformantAssignedPersonOrRelatedPerson(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_NOTE_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.informant->forAll(i : cda::Informant12 | not i.assignedEntity.assignedPerson.oclIsUndefined()
	 *    or not i.relatedEntity.relatedPerson.oclIsUndefined())
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNoteHasInformantAssignedPersonOrRelatedPerson(
			ConsultationNote consultationNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_NOTE_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONSULTATION_NOTE_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteHasInformantAssignedPersonOrRelatedPerson"),
					new Object[] { consultationNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteLegalAuthenticatorHasAssignedPerson(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Legal Authenticator Has Assigned Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteLegalAuthenticatorHasAssignedPerson(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.legalAuthenticator.oclIsUndefined() implies not self.legalAuthenticator.assignedEntity.assignedPerson.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteLegalAuthenticatorHasAssignedPerson(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Legal Authenticator Has Assigned Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteLegalAuthenticatorHasAssignedPerson(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_NOTE_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.legalAuthenticator.oclIsUndefined() implies not self.legalAuthenticator.assignedEntity.assignedPerson.oclIsUndefined()
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNoteLegalAuthenticatorHasAssignedPerson(
			ConsultationNote consultationNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_NOTE_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONSULTATION_NOTE_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteLegalAuthenticatorHasAssignedPerson"),
					new Object[] { consultationNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteAuthenticatorHasAssignedPerson(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Authenticator Has Assigned Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteAuthenticatorHasAssignedPerson(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authenticator->forAll(auth : cda::Authenticator | auth.assignedEntity->forAll(entity : cda::AssignedEntity |"
			+ "   not entity.assignedPerson.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteAuthenticatorHasAssignedPerson(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Authenticator Has Assigned Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteAuthenticatorHasAssignedPerson(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_NOTE_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.authenticator->forAll(auth : cda::Authenticator | auth.assignedEntity->forAll(entity : cda::AssignedEntity |
	 *    not entity.assignedPerson.oclIsUndefined()))
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNoteAuthenticatorHasAssignedPerson(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_NOTE_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONSULTATION_NOTE_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_AUTHENTICATOR_HAS_ASSIGNED_PERSON,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteAuthenticatorHasAssignedPerson"),
					new Object[] { consultationNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteTimePreciseToSecond(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Time Precise To Second</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteTimePreciseToSecond(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_TIME_PRECISE_TO_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteTimePreciseToSecond(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Time Precise To Second</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteTimePreciseToSecond(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_NOTE_TIME_PRECISE_TO_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNoteTimePreciseToSecond(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_NOTE_TIME_PRECISE_TO_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_TIME_PRECISE_TO_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_TIME_PRECISE_TO_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE_TIME_PRECISE_TO_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_TIME_PRECISE_TO_SECOND,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteTimePreciseToSecond"),
					new Object[] { consultationNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteTimePreciseToYearAndDay(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Time Precise To Year And Day</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteTimePreciseToYearAndDay(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_TIME_PRECISE_TO_YEAR_AND_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "cda::OrganizationPartOf.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject)-> union(  cda::MaintainedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union( cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::ServiceEvent.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::EncounterParticipant.allInstances()->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(self.participant->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(cda::OrganizationPartOf.allInstances().effectiveTime->union(cda::MaintainedEntity.allInstances().effectiveTime)->union( cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::ServiceEvent.allInstances().effectiveTime)->union(cda::EncounterParticipant.allInstances().time)->union(self.participant.time)->select(current : datatypes::IVL_TS  |  ((not current.low.oclIsUndefined()) and (current.low.value.oclIsUndefined() or current.low.value.size() < 8)) or ((not current.center.oclIsUndefined()) and (current.center.value.oclIsUndefined() or current.center.value.size() < 8)) or ((not current.high.oclIsUndefined()) and (current.high.value.oclIsUndefined() or current.high.value.size() < 8)) or (current.low.oclIsUndefined() and current.center.oclIsUndefined() and current.high.oclIsUndefined()) ).oclAsType( ecore::EObject))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteTimePreciseToYearAndDay(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Time Precise To Year And Day</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteTimePreciseToYearAndDay(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_NOTE_TIME_PRECISE_TO_YEAR_AND_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::OrganizationPartOf.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject)-> union(  cda::MaintainedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union( cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::ServiceEvent.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::EncounterParticipant.allInstances()->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(self.participant->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(cda::OrganizationPartOf.allInstances().effectiveTime->union(cda::MaintainedEntity.allInstances().effectiveTime)->union( cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::ServiceEvent.allInstances().effectiveTime)->union(cda::EncounterParticipant.allInstances().time)->union(self.participant.time)->select(current : datatypes::IVL_TS  |  ((not current.low.oclIsUndefined()) and (current.low.value.oclIsUndefined() or current.low.value.size() < 8)) or ((not current.center.oclIsUndefined()) and (current.center.value.oclIsUndefined() or current.center.value.size() < 8)) or ((not current.high.oclIsUndefined()) and (current.high.value.oclIsUndefined() or current.high.value.size() < 8)) or (current.low.oclIsUndefined() and current.center.oclIsUndefined() and current.high.oclIsUndefined()) ).oclAsType( ecore::EObject))
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNoteTimePreciseToYearAndDay(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_NOTE_TIME_PRECISE_TO_YEAR_AND_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_TIME_PRECISE_TO_YEAR_AND_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_TIME_PRECISE_TO_YEAR_AND_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONSULTATION_NOTE_TIME_PRECISE_TO_YEAR_AND_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_TIME_PRECISE_TO_YEAR_AND_DAY,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteTimePreciseToYearAndDay"),
					new Object[] { consultationNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteReferralOrVisit(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Referral Or Visit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteReferralOrVisit(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_REFERRAL_OR_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::ReasonForReferralSection))"
			+ "   xor self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::ReasonForVisitSectionConsult))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteReferralOrVisit(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Referral Or Visit</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteReferralOrVisit(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_NOTE_REFERRAL_OR_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::ReasonForReferralSection))
	 *    xor self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::ReasonForVisitSectionConsult))
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNoteReferralOrVisit(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_NOTE_REFERRAL_OR_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_REFERRAL_OR_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_REFERRAL_OR_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE_REFERRAL_OR_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_REFERRAL_OR_VISIT,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteReferralOrVisit"),
					new Object[] { consultationNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteTemplateId(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteTemplateId(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.4')";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteTemplateId(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteTemplateId(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_NOTE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.4')
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNoteTemplateId(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_NOTE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteTemplateId"), new Object[] { consultationNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteRealmCode(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Realm Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteRealmCode(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.realmCode->isEmpty() or self.realmCode->exists(element | element.isNullFlavorUndefined())) implies (self.realmCode->size() = 1 and self.realmCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = element.oclAsType(datatypes::CS) in " + "value.code = 'US'))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteRealmCode(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Realm Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteRealmCode(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_NOTE_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.realmCode->isEmpty() or self.realmCode->exists(element | element.isNullFlavorUndefined())) implies (self.realmCode->size() = 1 and self.realmCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = element.oclAsType(datatypes::CS) in 
	 * value.code = 'US'))
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNoteRealmCode(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_NOTE_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_REALM_CODE,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteRealmCode"), new Object[] { consultationNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteTypeId(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Type Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteTypeId(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.typeId.oclIsUndefined() or self.typeId.isNullFlavorUndefined()) implies (not self.typeId.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteTypeId(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Type Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteTypeId(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_NOTE_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.typeId.oclIsUndefined() or self.typeId.isNullFlavorUndefined()) implies (not self.typeId.oclIsUndefined())
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNoteTypeId(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_NOTE_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_TYPE_ID,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteTypeId"), new Object[] { consultationNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteId(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteId(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id.oclIsUndefined() or self.id.isNullFlavorUndefined()) implies (not self.id.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteId(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteId(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_NOTE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id.oclIsUndefined() or self.id.isNullFlavorUndefined()) implies (not self.id.oclIsUndefined())
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNoteId(ConsultationNote consultationNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_NOTE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_ID,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteId"), new Object[] { consultationNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteCode(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteCode(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("
			+ "value.codeSystem = '2.16.840.1.113883.6.1' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteCode(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteCode(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_NOTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.codeSystem = '2.16.840.1.113883.6.1' and not value.code.oclIsUndefined()))
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNoteCode(ConsultationNote consultationNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_NOTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_CODE,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteCode"), new Object[] { consultationNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteTitle(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteTitle(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteTitle(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteTitle(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_NOTE_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNoteTitle(ConsultationNote consultationNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_NOTE_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_TITLE,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteTitle"), new Object[] { consultationNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteEffectiveTime(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteEffectiveTime(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteEffectiveTime(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteEffectiveTime(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_NOTE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNoteEffectiveTime(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_NOTE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_EFFECTIVE_TIME,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteEffectiveTime"), new Object[] { consultationNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteLanguageCode(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Language Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteLanguageCode(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.languageCode.oclIsUndefined() or self.languageCode.isNullFlavorUndefined()) implies (not self.languageCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteLanguageCode(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Language Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteLanguageCode(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_NOTE_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.languageCode.oclIsUndefined() or self.languageCode.isNullFlavorUndefined()) implies (not self.languageCode.oclIsUndefined())
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNoteLanguageCode(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_NOTE_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_LANGUAGE_CODE,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteLanguageCode"), new Object[] { consultationNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteHistoryOfPresentIllness(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note History Of Present Illness</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteHistoryOfPresentIllness(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_HISTORY_OF_PRESENT_ILLNESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::IHEHistoryOfPresentIllness))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteHistoryOfPresentIllness(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note History Of Present Illness</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteHistoryOfPresentIllness(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_NOTE_HISTORY_OF_PRESENT_ILLNESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::IHEHistoryOfPresentIllness))
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNoteHistoryOfPresentIllness(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_NOTE_HISTORY_OF_PRESENT_ILLNESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_HISTORY_OF_PRESENT_ILLNESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_HISTORY_OF_PRESENT_ILLNESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE_HISTORY_OF_PRESENT_ILLNESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_HISTORY_OF_PRESENT_ILLNESS,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteHistoryOfPresentIllness"),
					new Object[] { consultationNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNotePhysicalExamination(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Physical Examination</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNotePhysicalExamination(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_PHYSICAL_EXAMINATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PhysicalExamSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNotePhysicalExamination(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Physical Examination</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNotePhysicalExamination(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_NOTE_PHYSICAL_EXAMINATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PhysicalExamSection))
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNotePhysicalExamination(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_NOTE_PHYSICAL_EXAMINATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_PHYSICAL_EXAMINATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_PHYSICAL_EXAMINATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE_PHYSICAL_EXAMINATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_PHYSICAL_EXAMINATION,
					ConsolPlugin.INSTANCE.getString("ConsultationNotePhysicalExamination"),
					new Object[] { consultationNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteProblemSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Problem Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteProblemSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemListSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteProblemSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Problem Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteProblemSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_NOTE_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemListSection))
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNoteProblemSection(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_NOTE_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_PROBLEM_SECTION,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteProblemSection"),
					new Object[] { consultationNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteProceduresSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Procedures Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteProceduresSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SurgeriesSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteProceduresSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Procedures Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteProceduresSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_NOTE_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SurgeriesSection))
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNoteProceduresSection(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_NOTE_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_PROCEDURES_SECTION,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteProceduresSection"),
					new Object[] { consultationNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNotePastMedicalHistorySection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Past Medical History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNotePastMedicalHistorySection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_PAST_MEDICAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PastMedicalHistorySectionConsult))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNotePastMedicalHistorySection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Past Medical History Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNotePastMedicalHistorySection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_NOTE_PAST_MEDICAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PastMedicalHistorySectionConsult))
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNotePastMedicalHistorySection(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_NOTE_PAST_MEDICAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_PAST_MEDICAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_PAST_MEDICAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONSULTATION_NOTE_PAST_MEDICAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_PAST_MEDICAL_HISTORY_SECTION,
					ConsolPlugin.INSTANCE.getString("ConsultationNotePastMedicalHistorySection"),
					new Object[] { consultationNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteImmunizationsSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Immunizations Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteImmunizationsSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteImmunizationsSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Immunizations Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteImmunizationsSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_NOTE_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSection))
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNoteImmunizationsSection(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_NOTE_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_IMMUNIZATIONS_SECTION,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteImmunizationsSection"),
					new Object[] { consultationNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteMedicationsSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Medications Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteMedicationsSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteMedicationsSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Medications Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteMedicationsSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_NOTE_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSection))
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNoteMedicationsSection(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_NOTE_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_MEDICATIONS_SECTION,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteMedicationsSection"),
					new Object[] { consultationNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteAlertsSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Alerts Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteAlertsSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_ALERTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesReactionsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteAlertsSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Alerts Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteAlertsSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_NOTE_ALERTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesReactionsSection))
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNoteAlertsSection(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_NOTE_ALERTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_ALERTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_ALERTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE_ALERTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_ALERTS_SECTION,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteAlertsSection"), new Object[] { consultationNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteSocialHistorySection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Social History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteSocialHistorySection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteSocialHistorySection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Social History Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteSocialHistorySection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_NOTE_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection))
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNoteSocialHistorySection(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_NOTE_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_SOCIAL_HISTORY_SECTION,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteSocialHistorySection"),
					new Object[] { consultationNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteFamilyHistorySection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Family History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteFamilyHistorySection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteFamilyHistorySection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Family History Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteFamilyHistorySection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_NOTE_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection))
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNoteFamilyHistorySection(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_NOTE_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_FAMILY_HISTORY_SECTION,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteFamilyHistorySection"),
					new Object[] { consultationNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteReviewOfSystemsSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Review Of Systems Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteReviewOfSystemsSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReviewOfSystemsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteReviewOfSystemsSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Review Of Systems Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteReviewOfSystemsSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_NOTE_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReviewOfSystemsSection))
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNoteReviewOfSystemsSection(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_NOTE_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_REVIEW_OF_SYSTEMS_SECTION,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteReviewOfSystemsSection"),
					new Object[] { consultationNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteVitalSignsSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Vital Signs Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteVitalSignsSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteVitalSignsSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Vital Signs Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteVitalSignsSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_NOTE_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSection))
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNoteVitalSignsSection(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_NOTE_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_VITAL_SIGNS_SECTION,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteVitalSignsSection"),
					new Object[] { consultationNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteGeneralStatusSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note General Status Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteGeneralStatusSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::GeneralStatusSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteGeneralStatusSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note General Status Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteGeneralStatusSection(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_NOTE_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::GeneralStatusSection))
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNoteGeneralStatusSection(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_NOTE_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_GENERAL_STATUS_SECTION,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteGeneralStatusSection"),
					new Object[] { consultationNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsultationNoteDiagnosticFindings(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Diagnostic Findings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteDiagnosticFindings(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSULTATION_NOTE_DIAGNOSTIC_FINDINGS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DiagnosticFindings))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsultationNoteDiagnosticFindings(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Diagnostic Findings</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsultationNoteDiagnosticFindings(ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSULTATION_NOTE_DIAGNOSTIC_FINDINGS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DiagnosticFindings))
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsultationNoteDiagnosticFindings(ConsultationNote consultationNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSULTATION_NOTE_DIAGNOSTIC_FINDINGS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONSULTATION_NOTE);
			try {
				VALIDATE_CONSULTATION_NOTE_DIAGNOSTIC_FINDINGS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_NOTE_DIAGNOSTIC_FINDINGS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_NOTE_DIAGNOSTIC_FINDINGS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			consultationNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONSULTATION_NOTE__CONSULTATION_NOTE_DIAGNOSTIC_FINDINGS,
					ConsolPlugin.INSTANCE.getString("ConsultationNoteDiagnosticFindings"),
					new Object[] { consultationNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getHistoryOfPresentIllness(ConsultationNote) <em>Get History Of Present Illness</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoryOfPresentIllness(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HISTORY_OF_PRESENT_ILLNESS__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::IHEHistoryOfPresentIllness))->asSequence()->first().oclAsType(consol::IHEHistoryOfPresentIllness)";

	/**
	 * The cached OCL query for the '{@link #getHistoryOfPresentIllness(ConsultationNote) <em>Get History Of Present Illness</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoryOfPresentIllness(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HISTORY_OF_PRESENT_ILLNESS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::IHEHistoryOfPresentIllness))->asSequence()->first().oclAsType(consol::IHEHistoryOfPresentIllness)
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static IHEHistoryOfPresentIllness getHistoryOfPresentIllness(ConsultationNote consultationNote) {
		if (GET_HISTORY_OF_PRESENT_ILLNESS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONSULTATION_NOTE,
				ConsolPackage.Literals.CONSULTATION_NOTE.getEAllOperations().get(83));
			try {
				GET_HISTORY_OF_PRESENT_ILLNESS__EOCL_QRY = helper.createQuery(GET_HISTORY_OF_PRESENT_ILLNESS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HISTORY_OF_PRESENT_ILLNESS__EOCL_QRY);
		return (IHEHistoryOfPresentIllness) query.evaluate(consultationNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPhysicalExamination(ConsultationNote) <em>Get Physical Examination</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalExamination(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PHYSICAL_EXAMINATION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PhysicalExamSection))->asSequence()->first().oclAsType(consol::PhysicalExamSection)";

	/**
	 * The cached OCL query for the '{@link #getPhysicalExamination(ConsultationNote) <em>Get Physical Examination</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalExamination(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PHYSICAL_EXAMINATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PhysicalExamSection))->asSequence()->first().oclAsType(consol::PhysicalExamSection)
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static PhysicalExamSection getPhysicalExamination(ConsultationNote consultationNote) {
		if (GET_PHYSICAL_EXAMINATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONSULTATION_NOTE,
				ConsolPackage.Literals.CONSULTATION_NOTE.getEAllOperations().get(84));
			try {
				GET_PHYSICAL_EXAMINATION__EOCL_QRY = helper.createQuery(GET_PHYSICAL_EXAMINATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PHYSICAL_EXAMINATION__EOCL_QRY);
		return (PhysicalExamSection) query.evaluate(consultationNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemSection(ConsultationNote) <em>Get Problem Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemSection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemListSection))->asSequence()->first().oclAsType(consol::ProblemListSection)";

	/**
	 * The cached OCL query for the '{@link #getProblemSection(ConsultationNote) <em>Get Problem Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemSection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemListSection))->asSequence()->first().oclAsType(consol::ProblemListSection)
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static ProblemListSection getProblemSection(ConsultationNote consultationNote) {
		if (GET_PROBLEM_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONSULTATION_NOTE,
				ConsolPackage.Literals.CONSULTATION_NOTE.getEAllOperations().get(85));
			try {
				GET_PROBLEM_SECTION__EOCL_QRY = helper.createQuery(GET_PROBLEM_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_SECTION__EOCL_QRY);
		return (ProblemListSection) query.evaluate(consultationNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProceduresSection(ConsultationNote) <em>Get Procedures Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProceduresSection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROCEDURES_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SurgeriesSection))->asSequence()->first().oclAsType(consol::SurgeriesSection)";

	/**
	 * The cached OCL query for the '{@link #getProceduresSection(ConsultationNote) <em>Get Procedures Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProceduresSection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROCEDURES_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SurgeriesSection))->asSequence()->first().oclAsType(consol::SurgeriesSection)
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static SurgeriesSection getProceduresSection(ConsultationNote consultationNote) {
		if (GET_PROCEDURES_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONSULTATION_NOTE,
				ConsolPackage.Literals.CONSULTATION_NOTE.getEAllOperations().get(86));
			try {
				GET_PROCEDURES_SECTION__EOCL_QRY = helper.createQuery(GET_PROCEDURES_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURES_SECTION__EOCL_QRY);
		return (SurgeriesSection) query.evaluate(consultationNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPastMedicalHistorySection(ConsultationNote) <em>Get Past Medical History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPastMedicalHistorySection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PAST_MEDICAL_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PastMedicalHistorySectionConsult))->asSequence()->first().oclAsType(consol::PastMedicalHistorySectionConsult)";

	/**
	 * The cached OCL query for the '{@link #getPastMedicalHistorySection(ConsultationNote) <em>Get Past Medical History Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPastMedicalHistorySection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PAST_MEDICAL_HISTORY_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PastMedicalHistorySectionConsult))->asSequence()->first().oclAsType(consol::PastMedicalHistorySectionConsult)
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static PastMedicalHistorySectionConsult getPastMedicalHistorySection(ConsultationNote consultationNote) {
		if (GET_PAST_MEDICAL_HISTORY_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONSULTATION_NOTE,
				ConsolPackage.Literals.CONSULTATION_NOTE.getEAllOperations().get(87));
			try {
				GET_PAST_MEDICAL_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_PAST_MEDICAL_HISTORY_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PAST_MEDICAL_HISTORY_SECTION__EOCL_QRY);
		return (PastMedicalHistorySectionConsult) query.evaluate(consultationNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getImmunizationsSection(ConsultationNote) <em>Get Immunizations Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmunizationsSection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_IMMUNIZATIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSection))->asSequence()->first().oclAsType(consol::ImmunizationsSection)";

	/**
	 * The cached OCL query for the '{@link #getImmunizationsSection(ConsultationNote) <em>Get Immunizations Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmunizationsSection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_IMMUNIZATIONS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSection))->asSequence()->first().oclAsType(consol::ImmunizationsSection)
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static ImmunizationsSection getImmunizationsSection(ConsultationNote consultationNote) {
		if (GET_IMMUNIZATIONS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONSULTATION_NOTE,
				ConsolPackage.Literals.CONSULTATION_NOTE.getEAllOperations().get(88));
			try {
				GET_IMMUNIZATIONS_SECTION__EOCL_QRY = helper.createQuery(GET_IMMUNIZATIONS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_IMMUNIZATIONS_SECTION__EOCL_QRY);
		return (ImmunizationsSection) query.evaluate(consultationNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicationsSection(ConsultationNote) <em>Get Medications Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationsSection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSection))->asSequence()->first().oclAsType(consol::MedicationsSection)";

	/**
	 * The cached OCL query for the '{@link #getMedicationsSection(ConsultationNote) <em>Get Medications Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationsSection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATIONS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSection))->asSequence()->first().oclAsType(consol::MedicationsSection)
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static MedicationsSection getMedicationsSection(ConsultationNote consultationNote) {
		if (GET_MEDICATIONS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONSULTATION_NOTE,
				ConsolPackage.Literals.CONSULTATION_NOTE.getEAllOperations().get(89));
			try {
				GET_MEDICATIONS_SECTION__EOCL_QRY = helper.createQuery(GET_MEDICATIONS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATIONS_SECTION__EOCL_QRY);
		return (MedicationsSection) query.evaluate(consultationNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAlertsSection(ConsultationNote) <em>Get Alerts Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlertsSection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ALERTS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesReactionsSection))->asSequence()->first().oclAsType(consol::AllergiesReactionsSection)";

	/**
	 * The cached OCL query for the '{@link #getAlertsSection(ConsultationNote) <em>Get Alerts Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlertsSection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ALERTS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesReactionsSection))->asSequence()->first().oclAsType(consol::AllergiesReactionsSection)
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static AllergiesReactionsSection getAlertsSection(ConsultationNote consultationNote) {
		if (GET_ALERTS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONSULTATION_NOTE,
				ConsolPackage.Literals.CONSULTATION_NOTE.getEAllOperations().get(90));
			try {
				GET_ALERTS_SECTION__EOCL_QRY = helper.createQuery(GET_ALERTS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ALERTS_SECTION__EOCL_QRY);
		return (AllergiesReactionsSection) query.evaluate(consultationNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getSocialHistorySection(ConsultationNote) <em>Get Social History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialHistorySection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SOCIAL_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection))->asSequence()->first().oclAsType(consol::SocialHistorySection)";

	/**
	 * The cached OCL query for the '{@link #getSocialHistorySection(ConsultationNote) <em>Get Social History Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialHistorySection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SOCIAL_HISTORY_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection))->asSequence()->first().oclAsType(consol::SocialHistorySection)
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static SocialHistorySection getSocialHistorySection(ConsultationNote consultationNote) {
		if (GET_SOCIAL_HISTORY_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONSULTATION_NOTE,
				ConsolPackage.Literals.CONSULTATION_NOTE.getEAllOperations().get(91));
			try {
				GET_SOCIAL_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_SOCIAL_HISTORY_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SOCIAL_HISTORY_SECTION__EOCL_QRY);
		return (SocialHistorySection) query.evaluate(consultationNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getFamilyHistorySection(ConsultationNote) <em>Get Family History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyHistorySection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FAMILY_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection))->asSequence()->first().oclAsType(consol::FamilyHistorySection)";

	/**
	 * The cached OCL query for the '{@link #getFamilyHistorySection(ConsultationNote) <em>Get Family History Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyHistorySection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FAMILY_HISTORY_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection))->asSequence()->first().oclAsType(consol::FamilyHistorySection)
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static FamilyHistorySection getFamilyHistorySection(ConsultationNote consultationNote) {
		if (GET_FAMILY_HISTORY_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONSULTATION_NOTE,
				ConsolPackage.Literals.CONSULTATION_NOTE.getEAllOperations().get(92));
			try {
				GET_FAMILY_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_FAMILY_HISTORY_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_FAMILY_HISTORY_SECTION__EOCL_QRY);
		return (FamilyHistorySection) query.evaluate(consultationNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getReviewOfSystemsSection(ConsultationNote) <em>Get Review Of Systems Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewOfSystemsSection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReviewOfSystemsSection))->asSequence()->first().oclAsType(consol::ReviewOfSystemsSection)";

	/**
	 * The cached OCL query for the '{@link #getReviewOfSystemsSection(ConsultationNote) <em>Get Review Of Systems Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewOfSystemsSection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReviewOfSystemsSection))->asSequence()->first().oclAsType(consol::ReviewOfSystemsSection)
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static ReviewOfSystemsSection getReviewOfSystemsSection(ConsultationNote consultationNote) {
		if (GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONSULTATION_NOTE,
				ConsolPackage.Literals.CONSULTATION_NOTE.getEAllOperations().get(93));
			try {
				GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY = helper.createQuery(GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY);
		return (ReviewOfSystemsSection) query.evaluate(consultationNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getVitalSignsSection(ConsultationNote) <em>Get Vital Signs Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignsSection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_VITAL_SIGNS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSection))->asSequence()->first().oclAsType(consol::VitalSignsSection)";

	/**
	 * The cached OCL query for the '{@link #getVitalSignsSection(ConsultationNote) <em>Get Vital Signs Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignsSection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_VITAL_SIGNS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSection))->asSequence()->first().oclAsType(consol::VitalSignsSection)
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static VitalSignsSection getVitalSignsSection(ConsultationNote consultationNote) {
		if (GET_VITAL_SIGNS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONSULTATION_NOTE,
				ConsolPackage.Literals.CONSULTATION_NOTE.getEAllOperations().get(94));
			try {
				GET_VITAL_SIGNS_SECTION__EOCL_QRY = helper.createQuery(GET_VITAL_SIGNS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_VITAL_SIGNS_SECTION__EOCL_QRY);
		return (VitalSignsSection) query.evaluate(consultationNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getGeneralStatusSection(ConsultationNote) <em>Get General Status Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralStatusSection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_GENERAL_STATUS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::GeneralStatusSection))->asSequence()->first().oclAsType(consol::GeneralStatusSection)";

	/**
	 * The cached OCL query for the '{@link #getGeneralStatusSection(ConsultationNote) <em>Get General Status Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralStatusSection(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_GENERAL_STATUS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::GeneralStatusSection))->asSequence()->first().oclAsType(consol::GeneralStatusSection)
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static GeneralStatusSection getGeneralStatusSection(ConsultationNote consultationNote) {
		if (GET_GENERAL_STATUS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONSULTATION_NOTE,
				ConsolPackage.Literals.CONSULTATION_NOTE.getEAllOperations().get(95));
			try {
				GET_GENERAL_STATUS_SECTION__EOCL_QRY = helper.createQuery(GET_GENERAL_STATUS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_GENERAL_STATUS_SECTION__EOCL_QRY);
		return (GeneralStatusSection) query.evaluate(consultationNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getDiagnosticFindings(ConsultationNote) <em>Get Diagnostic Findings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosticFindings(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DIAGNOSTIC_FINDINGS__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DiagnosticFindings))->asSequence()->first().oclAsType(consol::DiagnosticFindings)";

	/**
	 * The cached OCL query for the '{@link #getDiagnosticFindings(ConsultationNote) <em>Get Diagnostic Findings</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosticFindings(ConsultationNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DIAGNOSTIC_FINDINGS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DiagnosticFindings))->asSequence()->first().oclAsType(consol::DiagnosticFindings)
	 * @param consultationNote The receiving '<em><b>Consultation Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static DiagnosticFindings getDiagnosticFindings(ConsultationNote consultationNote) {
		if (GET_DIAGNOSTIC_FINDINGS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONSULTATION_NOTE,
				ConsolPackage.Literals.CONSULTATION_NOTE.getEAllOperations().get(96));
			try {
				GET_DIAGNOSTIC_FINDINGS__EOCL_QRY = helper.createQuery(GET_DIAGNOSTIC_FINDINGS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_DIAGNOSTIC_FINDINGS__EOCL_QRY);
		return (DiagnosticFindings) query.evaluate(consultationNote);
	}

} // ConsultationNoteOperations
