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
import org.openhealthtools.mdht.uml.cda.consol.CCDVitalSignsSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.DiagnosticFindings;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.IHEHistoryOfPresentIllness;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemListSection;
import org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSectionIHE;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.SurgeriesSection;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalDocumentOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>History And Physical</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#validateHistoryAndPhysicalPersonHasName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Person Has Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#validateHistoryAndPhysicalRolesShallHaveAddrAndTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Roles Shall Have Addr And Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#validateHistoryAndPhysicalRolesShouldHaveAddrAndTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Roles Should Have Addr And Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#validateHistoryAndPhysicalOrganizationsHaveContactInfo(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Organizations Have Contact Info</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#validateHistoryAndPhysicalTimePreciseToDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Time Precise To Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#validateHistoryAndPhysicalTimePreciseToYear(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Time Precise To Year</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#validateHistoryAndPhysicalTelephoneMatchesRegex(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Telephone Matches Regex</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#validateHistoryAndPhysicalHasTelephoneDialingDigits(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Has Telephone Dialing Digits</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#validateHistoryAndPhysicalUnknownTelephoneUsesNullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Unknown Telephone Uses Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#validateHistoryAndPhysicalTypeIdExtension(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Type Id Extension</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#validateHistoryAndPhysicalIdRootFormat(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Id Root Format</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#validateHistoryAndPhysicalOidLength(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Oid Length</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#validateHistoryAndPhysicalLanguageCodeForm(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Language Code Form</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#validateHistoryAndPhysicalSetIdAndVersionNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Set Id And Version Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#validateHistoryAndPhysicalSetIdAndIdAreUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Set Id And Id Are Unique</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#validateHistoryAndPhysicalCopyTimeNotPresent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Copy Time Not Present</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#validateHistoryAndPhysicalHasRecordTargetPatientRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Has Record Target Patient Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#validateHistoryAndPhysicalHasPatientBirthTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Has Patient Birth Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#validateHistoryAndPhysicalHasAdministrativeGenderCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Has Administrative Gender Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#validateHistoryAndPhysicalHasProviderOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Has Provider Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#validateHistoryAndPhysicalHasAuthorTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Has Author Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#validateHistoryAndPhysicalHasAssignedAuthorId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Has Assigned Author Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#validateHistoryAndPhysicalHasAssignedAuthorPersonOrDevice(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Has Assigned Author Person Or Device</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#validateHistoryAndPhysicalHasDataEntererAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Has Data Enterer Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#validateHistoryAndPhysicalHasDataEntererTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Has Data Enterer Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#validateHistoryAndPhysicalHasInformant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Has Informant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#validateHistoryAndPhysicalHasInformantAssignedPersonOrRelatedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Has Informant Assigned Person Or Related Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#validateHistoryAndPhysicalLegalAuthenticatorHasAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Legal Authenticator Has Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#validateHistoryAndPhysicalAuthenticatorHasAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Authenticator Has Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#validateHistoryAndPhysicalTimePreciseToSecond(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Time Precise To Second</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#validateHistoryAndPhysicalTimePreciseToYearAndDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Time Precise To Year And Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#validateHistoryAndPhysicalAssessmentAndPlan(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Assessment And Plan</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#validateHistoryAndPhysicalBothAssessmentAndPlan(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Both Assessment And Plan</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#validateHistoryAndPhysicalReasonForVisitAndChiefComplaint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Reason For Visit And Chief Complaint</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#validateHistoryAndPhysicalBothReasonForVisitAndChiefComplaint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Both Reason For Visit And Chief Complaint</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#validateHistoryAndPhysicalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#validateHistoryAndPhysicalRealmCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#validateHistoryAndPhysicalTypeId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#validateHistoryAndPhysicalId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#validateHistoryAndPhysicalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#validateHistoryAndPhysicalTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#validateHistoryAndPhysicalEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#validateHistoryAndPhysicalLanguageCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Language Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#validateHistoryAndPhysicalHistoryOfPresentIllness(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical History Of Present Illness</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#validateHistoryAndPhysicalPastMedicalHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Past Medical History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#validateHistoryAndPhysicalMedicationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#validateHistoryAndPhysicalAlertsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Alerts Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#validateHistoryAndPhysicalSocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#validateHistoryAndPhysicalFamilyHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Family History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#validateHistoryAndPhysicalReviewOfSystemsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#validateHistoryAndPhysicalPhysicalExaminationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Physical Examination Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#validateHistoryAndPhysicalVitalSignsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#validateHistoryAndPhysicalGeneralStatusSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical General Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#validateHistoryAndPhysicalDiagnosticFindings(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Diagnostic Findings</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#validateHistoryAndPhysicalProblemSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Problem Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#validateHistoryAndPhysicalProceduresSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Procedures Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#validateHistoryAndPhysicalImmunizationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Immunizations Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#getHistoryOfPresentIllness() <em>Get History Of Present Illness</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#getPastMedicalHistorySection() <em>Get Past Medical History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#getMedicationsSection() <em>Get Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#getAlertsSection() <em>Get Alerts Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#getSocialHistorySection() <em>Get Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#getFamilyHistorySection() <em>Get Family History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#getReviewOfSystemsSection() <em>Get Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#getPhysicalExaminationSection() <em>Get Physical Examination Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#getVitalSignsSection() <em>Get Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#getGeneralStatusSection() <em>Get General Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#getDiagnosticFindings() <em>Get Diagnostic Findings</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#getProblemSection() <em>Get Problem Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#getProceduresSection() <em>Get Procedures Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysical#getImmunizationsSection() <em>Get Immunizations Section</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HistoryAndPhysicalOperations extends ClinicalDocumentOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HistoryAndPhysicalOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalPersonHasName(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Person Has Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalPersonHasName(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_PERSON_HAS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalPersonHasName(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Person Has Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalPersonHasName(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_PERSON_HAS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHistoryAndPhysicalPersonHasName(HistoryAndPhysical historyAndPhysical,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_PERSON_HAS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_PERSON_HAS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_PERSON_HAS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_PERSON_HAS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_PERSON_HAS_NAME,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalPersonHasName"),
					new Object[] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalRolesShallHaveAddrAndTelecom(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Roles Shall Have Addr And Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalRolesShallHaveAddrAndTelecom(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_ROLES_SHALL_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalRolesShallHaveAddrAndTelecom(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Roles Shall Have Addr And Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalRolesShallHaveAddrAndTelecom(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_ROLES_SHALL_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHistoryAndPhysicalRolesShallHaveAddrAndTelecom(HistoryAndPhysical historyAndPhysical,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_ROLES_SHALL_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_ROLES_SHALL_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_ROLES_SHALL_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_ROLES_SHALL_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_ROLES_SHALL_HAVE_ADDR_AND_TELECOM,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalRolesShallHaveAddrAndTelecom"),
					new Object[] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalRolesShouldHaveAddrAndTelecom(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Roles Should Have Addr And Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalRolesShouldHaveAddrAndTelecom(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_ROLES_SHOULD_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalRolesShouldHaveAddrAndTelecom(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Roles Should Have Addr And Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalRolesShouldHaveAddrAndTelecom(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_ROLES_SHOULD_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHistoryAndPhysicalRolesShouldHaveAddrAndTelecom(
			HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_ROLES_SHOULD_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_ROLES_SHOULD_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_ROLES_SHOULD_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_ROLES_SHOULD_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_ROLES_SHOULD_HAVE_ADDR_AND_TELECOM,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalRolesShouldHaveAddrAndTelecom"),
					new Object[] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalOrganizationsHaveContactInfo(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Organizations Have Contact Info</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalOrganizationsHaveContactInfo(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_ORGANIZATIONS_HAVE_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalOrganizationsHaveContactInfo(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Organizations Have Contact Info</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalOrganizationsHaveContactInfo(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_ORGANIZATIONS_HAVE_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHistoryAndPhysicalOrganizationsHaveContactInfo(HistoryAndPhysical historyAndPhysical,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_ORGANIZATIONS_HAVE_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_ORGANIZATIONS_HAVE_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_ORGANIZATIONS_HAVE_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_ORGANIZATIONS_HAVE_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_ORGANIZATIONS_HAVE_CONTACT_INFO,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalOrganizationsHaveContactInfo"),
					new Object[] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalTimePreciseToDay(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Time Precise To Day</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalTimePreciseToDay(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalTimePreciseToDay(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Time Precise To Day</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalTimePreciseToDay(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHistoryAndPhysicalTimePreciseToDay(HistoryAndPhysical historyAndPhysical,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_TIME_PRECISE_TO_DAY,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalTimePreciseToDay"),
					new Object[] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalTimePreciseToYear(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Time Precise To Year</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalTimePreciseToYear(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "cda::OrganizationPartOf.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject)-> union(  cda::MaintainedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union( cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::ServiceEvent.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::EncounterParticipant.allInstances()->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(self.participant->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(cda::OrganizationPartOf.allInstances().effectiveTime->union(cda::MaintainedEntity.allInstances().effectiveTime)->union( cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::ServiceEvent.allInstances().effectiveTime)->union(cda::EncounterParticipant.allInstances().time)->union(self.participant.time)->select(current : datatypes::IVL_TS  |  ((not current.low.oclIsUndefined()) and (current.low.value.oclIsUndefined() or current.low.value.size() < 4)) or ((not current.center.oclIsUndefined()) and (current.center.value.oclIsUndefined() or current.center.value.size() < 4)) or ((not current.high.oclIsUndefined()) and (current.high.value.oclIsUndefined() or current.high.value.size() < 4)) or (current.low.oclIsUndefined() and current.center.oclIsUndefined() and current.high.oclIsUndefined()) ).oclAsType( ecore::EObject))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalTimePreciseToYear(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Time Precise To Year</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalTimePreciseToYear(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::OrganizationPartOf.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject)-> union(  cda::MaintainedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union( cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::ServiceEvent.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::EncounterParticipant.allInstances()->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(self.participant->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(cda::OrganizationPartOf.allInstances().effectiveTime->union(cda::MaintainedEntity.allInstances().effectiveTime)->union( cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::ServiceEvent.allInstances().effectiveTime)->union(cda::EncounterParticipant.allInstances().time)->union(self.participant.time)->select(current : datatypes::IVL_TS  |  ((not current.low.oclIsUndefined()) and (current.low.value.oclIsUndefined() or current.low.value.size() < 4)) or ((not current.center.oclIsUndefined()) and (current.center.value.oclIsUndefined() or current.center.value.size() < 4)) or ((not current.high.oclIsUndefined()) and (current.high.value.oclIsUndefined() or current.high.value.size() < 4)) or (current.low.oclIsUndefined() and current.center.oclIsUndefined() and current.high.oclIsUndefined()) ).oclAsType( ecore::EObject))
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHistoryAndPhysicalTimePreciseToYear(HistoryAndPhysical historyAndPhysical,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_TIME_PRECISE_TO_YEAR,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalTimePreciseToYear"),
					new Object[] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalTelephoneMatchesRegex(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Telephone Matches Regex</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalTelephoneMatchesRegex(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_TELEPHONE_MATCHES_REGEX__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalTelephoneMatchesRegex(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Telephone Matches Regex</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalTelephoneMatchesRegex(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_TELEPHONE_MATCHES_REGEX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHistoryAndPhysicalTelephoneMatchesRegex(HistoryAndPhysical historyAndPhysical,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_TELEPHONE_MATCHES_REGEX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_TELEPHONE_MATCHES_REGEX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_TELEPHONE_MATCHES_REGEX__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_TELEPHONE_MATCHES_REGEX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_TELEPHONE_MATCHES_REGEX,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalTelephoneMatchesRegex"),
					new Object[] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalHasTelephoneDialingDigits(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Has Telephone Dialing Digits</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalHasTelephoneDialingDigits(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_HAS_TELEPHONE_DIALING_DIGITS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalHasTelephoneDialingDigits(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Has Telephone Dialing Digits</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalHasTelephoneDialingDigits(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_HAS_TELEPHONE_DIALING_DIGITS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHistoryAndPhysicalHasTelephoneDialingDigits(HistoryAndPhysical historyAndPhysical,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_HAS_TELEPHONE_DIALING_DIGITS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_HAS_TELEPHONE_DIALING_DIGITS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_HAS_TELEPHONE_DIALING_DIGITS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_HAS_TELEPHONE_DIALING_DIGITS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_HAS_TELEPHONE_DIALING_DIGITS,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalHasTelephoneDialingDigits"),
					new Object[] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalUnknownTelephoneUsesNullFlavor(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Unknown Telephone Uses Null Flavor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalUnknownTelephoneUsesNullFlavor(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_UNKNOWN_TELEPHONE_USES_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalUnknownTelephoneUsesNullFlavor(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Unknown Telephone Uses Null Flavor</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalUnknownTelephoneUsesNullFlavor(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_UNKNOWN_TELEPHONE_USES_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHistoryAndPhysicalUnknownTelephoneUsesNullFlavor(
			HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_UNKNOWN_TELEPHONE_USES_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_UNKNOWN_TELEPHONE_USES_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_UNKNOWN_TELEPHONE_USES_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_UNKNOWN_TELEPHONE_USES_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_UNKNOWN_TELEPHONE_USES_NULL_FLAVOR,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalUnknownTelephoneUsesNullFlavor"),
					new Object[] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalTypeIdExtension(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Type Id Extension</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalTypeIdExtension(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.typeId.extension = 'POCD_HD000040'";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalTypeIdExtension(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Type Id Extension</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalTypeIdExtension(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.typeId.extension = 'POCD_HD000040'
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHistoryAndPhysicalTypeIdExtension(HistoryAndPhysical historyAndPhysical,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_TYPE_ID_EXTENSION,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalTypeIdExtension"),
					new Object[] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalIdRootFormat(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Id Root Format</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalIdRootFormat(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_ID_ROOT_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.id.matches('root','([0-2])(.([1-9][0-9]*|0))+') or self.id.matches('root','([A-Fa-f0-9]{8})(\\\\-[A-Fa-f0-9]{4}){3}(\\\\-[A-Fa-f0-9]{12})')";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalIdRootFormat(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Id Root Format</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalIdRootFormat(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_ID_ROOT_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.id.matches('root','([0-2])(.([1-9][0-9]*|0))+') or self.id.matches('root','([A-Fa-f0-9]{8})(\\\\-[A-Fa-f0-9]{4}){3}(\\\\-[A-Fa-f0-9]{12})')
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHistoryAndPhysicalIdRootFormat(HistoryAndPhysical historyAndPhysical,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_ID_ROOT_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_ID_ROOT_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_ID_ROOT_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_ID_ROOT_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_ID_ROOT_FORMAT,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalIdRootFormat"),
					new Object[] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalOidLength(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Oid Length</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalOidLength(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_OID_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.id->select((not id.root.oclIsUndefined()) and id.root.size() > 64 )";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalOidLength(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Oid Length</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalOidLength(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_OID_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.id->select((not id.root.oclIsUndefined()) and id.root.size() > 64 )
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHistoryAndPhysicalOidLength(HistoryAndPhysical historyAndPhysical,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_OID_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_OID_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_OID_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_OID_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_OID_LENGTH,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalOidLength"), new Object[] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalLanguageCodeForm(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Language Code Form</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalLanguageCodeForm(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_LANGUAGE_CODE_FORM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.languageCode.matches('code','(([a-z]{2})(\\\\-[A-Z]{2})?)')";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalLanguageCodeForm(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Language Code Form</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalLanguageCodeForm(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_LANGUAGE_CODE_FORM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.languageCode.matches('code','(([a-z]{2})(\\\\-[A-Z]{2})?)')
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHistoryAndPhysicalLanguageCodeForm(HistoryAndPhysical historyAndPhysical,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_LANGUAGE_CODE_FORM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_LANGUAGE_CODE_FORM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_LANGUAGE_CODE_FORM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_LANGUAGE_CODE_FORM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_LANGUAGE_CODE_FORM,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalLanguageCodeForm"),
					new Object[] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalSetIdAndVersionNumber(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Set Id And Version Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalSetIdAndVersionNumber(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_SET_ID_AND_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.setId.oclIsUndefined() and self.versionNumber.oclIsUndefined())"
			+ "   xor (not self.setId.oclIsUndefined() and not self.versionNumber.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalSetIdAndVersionNumber(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Set Id And Version Number</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalSetIdAndVersionNumber(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_SET_ID_AND_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.setId.oclIsUndefined() and self.versionNumber.oclIsUndefined())
	 *    xor (not self.setId.oclIsUndefined() and not self.versionNumber.oclIsUndefined())
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHistoryAndPhysicalSetIdAndVersionNumber(HistoryAndPhysical historyAndPhysical,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_SET_ID_AND_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_SET_ID_AND_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_SET_ID_AND_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_SET_ID_AND_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_SET_ID_AND_VERSION_NUMBER,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalSetIdAndVersionNumber"),
					new Object[] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalSetIdAndIdAreUnique(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Set Id And Id Are Unique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalSetIdAndIdAreUnique(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_SET_ID_AND_ID_ARE_UNIQUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(not self.setId.oclIsUndefined() and not self.id.oclIsUndefined())"
			+ "   implies (self.setId.root <> self.id.root or self.setId.extension <> self.id.extension)";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalSetIdAndIdAreUnique(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Set Id And Id Are Unique</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalSetIdAndIdAreUnique(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_SET_ID_AND_ID_ARE_UNIQUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (not self.setId.oclIsUndefined() and not self.id.oclIsUndefined())
	 *    implies (self.setId.root <> self.id.root or self.setId.extension <> self.id.extension)
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHistoryAndPhysicalSetIdAndIdAreUnique(HistoryAndPhysical historyAndPhysical,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_SET_ID_AND_ID_ARE_UNIQUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_SET_ID_AND_ID_ARE_UNIQUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_SET_ID_AND_ID_ARE_UNIQUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_SET_ID_AND_ID_ARE_UNIQUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_SET_ID_AND_ID_ARE_UNIQUE,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalSetIdAndIdAreUnique"),
					new Object[] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalCopyTimeNotPresent(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Copy Time Not Present</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalCopyTimeNotPresent(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_COPY_TIME_NOT_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.copyTime.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalCopyTimeNotPresent(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Copy Time Not Present</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalCopyTimeNotPresent(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_COPY_TIME_NOT_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.copyTime.oclIsUndefined()
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHistoryAndPhysicalCopyTimeNotPresent(HistoryAndPhysical historyAndPhysical,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_COPY_TIME_NOT_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_COPY_TIME_NOT_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_COPY_TIME_NOT_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_COPY_TIME_NOT_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_COPY_TIME_NOT_PRESENT,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalCopyTimeNotPresent"),
					new Object[] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalHasRecordTargetPatientRole(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Has Record Target Patient Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalHasRecordTargetPatientRole(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_HAS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->size() > 0 and self.recordTarget->exists(target : cda::RecordTarget | not target.patientRole.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalHasRecordTargetPatientRole(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Has Record Target Patient Role</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalHasRecordTargetPatientRole(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_HAS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->size() > 0 and self.recordTarget->exists(target : cda::RecordTarget | not target.patientRole.oclIsUndefined())
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHistoryAndPhysicalHasRecordTargetPatientRole(HistoryAndPhysical historyAndPhysical,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_HAS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_HAS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_HAS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_HAS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_HAS_RECORD_TARGET_PATIENT_ROLE,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalHasRecordTargetPatientRole"),
					new Object[] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalHasPatientBirthTime(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Has Patient Birth Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalHasPatientBirthTime(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_HAS_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->forAll(target : cda::RecordTarget | not target.patientRole.oclIsUndefined()"
			+ "   implies (not target.patientRole.patient.birthTime.value.oclIsUndefined()"
			+ "      or not target.patientRole.patient.birthTime.nullFlavor.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalHasPatientBirthTime(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Has Patient Birth Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalHasPatientBirthTime(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_HAS_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->forAll(target : cda::RecordTarget | not target.patientRole.oclIsUndefined()
	 *    implies (not target.patientRole.patient.birthTime.value.oclIsUndefined()
	 *       or not target.patientRole.patient.birthTime.nullFlavor.oclIsUndefined()))
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHistoryAndPhysicalHasPatientBirthTime(HistoryAndPhysical historyAndPhysical,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_HAS_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_HAS_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_HAS_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_HAS_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_HAS_PATIENT_BIRTH_TIME,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalHasPatientBirthTime"),
					new Object[] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalHasAdministrativeGenderCode(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Has Administrative Gender Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalHasAdministrativeGenderCode(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_HAS_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->forAll(target : cda::RecordTarget | not target.patientRole.oclIsUndefined()"
			+ "   implies (not target.patientRole.patient.administrativeGenderCode.code.oclIsUndefined()"
			+ "      or not target.patientRole.patient.administrativeGenderCode.nullFlavor.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalHasAdministrativeGenderCode(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Has Administrative Gender Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalHasAdministrativeGenderCode(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_HAS_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->forAll(target : cda::RecordTarget | not target.patientRole.oclIsUndefined()
	 *    implies (not target.patientRole.patient.administrativeGenderCode.code.oclIsUndefined()
	 *       or not target.patientRole.patient.administrativeGenderCode.nullFlavor.oclIsUndefined()))
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHistoryAndPhysicalHasAdministrativeGenderCode(HistoryAndPhysical historyAndPhysical,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_HAS_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_HAS_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_HAS_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_HAS_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_HAS_ADMINISTRATIVE_GENDER_CODE,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalHasAdministrativeGenderCode"),
					new Object[] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalHasProviderOrganization(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Has Provider Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalHasProviderOrganization(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_HAS_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->exists(target : cda::RecordTarget | not target.patientRole.providerOrganization.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalHasProviderOrganization(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Has Provider Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalHasProviderOrganization(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_HAS_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->exists(target : cda::RecordTarget | not target.patientRole.providerOrganization.oclIsUndefined())
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHistoryAndPhysicalHasProviderOrganization(HistoryAndPhysical historyAndPhysical,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_HAS_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_HAS_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_HAS_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_HAS_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_HAS_PROVIDER_ORGANIZATION,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalHasProviderOrganization"),
					new Object[] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalHasAuthorTime(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Has Author Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalHasAuthorTime(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->forAll(author : cda::Author | not author.time.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalHasAuthorTime(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Has Author Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalHasAuthorTime(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.author->forAll(author : cda::Author | not author.time.oclIsUndefined())
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHistoryAndPhysicalHasAuthorTime(HistoryAndPhysical historyAndPhysical,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_HAS_AUTHOR_TIME,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalHasAuthorTime"),
					new Object[] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalHasAssignedAuthorId(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Has Assigned Author Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalHasAssignedAuthorId(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->forAll(author : cda::Author | author.assignedAuthor.id->size() > 0)";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalHasAssignedAuthorId(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Has Assigned Author Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalHasAssignedAuthorId(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.author->forAll(author : cda::Author | author.assignedAuthor.id->size() > 0)
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHistoryAndPhysicalHasAssignedAuthorId(HistoryAndPhysical historyAndPhysical,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_HAS_ASSIGNED_AUTHOR_ID,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalHasAssignedAuthorId"),
					new Object[] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalHasAssignedAuthorPersonOrDevice(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Has Assigned Author Person Or Device</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalHasAssignedAuthorPersonOrDevice(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->forAll(author : cda::Author | not author.assignedAuthor.assignedPerson.oclIsUndefined() "
			+ "   or not author.assignedAuthor.assignedAuthoringDevice.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalHasAssignedAuthorPersonOrDevice(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Has Assigned Author Person Or Device</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalHasAssignedAuthorPersonOrDevice(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.author->forAll(author : cda::Author | not author.assignedAuthor.assignedPerson.oclIsUndefined() 
	 *    or not author.assignedAuthor.assignedAuthoringDevice.oclIsUndefined())
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHistoryAndPhysicalHasAssignedAuthorPersonOrDevice(
			HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalHasAssignedAuthorPersonOrDevice"),
					new Object[] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalHasDataEntererAssignedPerson(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Has Data Enterer Assigned Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalHasDataEntererAssignedPerson(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_HAS_DATA_ENTERER_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.dataEnterer.oclIsUndefined() implies not self.dataEnterer.assignedEntity.assignedPerson.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalHasDataEntererAssignedPerson(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Has Data Enterer Assigned Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalHasDataEntererAssignedPerson(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_HAS_DATA_ENTERER_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.dataEnterer.oclIsUndefined() implies not self.dataEnterer.assignedEntity.assignedPerson.oclIsUndefined()
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHistoryAndPhysicalHasDataEntererAssignedPerson(HistoryAndPhysical historyAndPhysical,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_HAS_DATA_ENTERER_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_HAS_DATA_ENTERER_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_HAS_DATA_ENTERER_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_HAS_DATA_ENTERER_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_HAS_DATA_ENTERER_ASSIGNED_PERSON,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalHasDataEntererAssignedPerson"),
					new Object[] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalHasDataEntererTime(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Has Data Enterer Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalHasDataEntererTime(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_HAS_DATA_ENTERER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.dataEnterer.oclIsUndefined() implies not self.dataEnterer.time.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalHasDataEntererTime(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Has Data Enterer Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalHasDataEntererTime(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_HAS_DATA_ENTERER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.dataEnterer.oclIsUndefined() implies not self.dataEnterer.time.oclIsUndefined()
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHistoryAndPhysicalHasDataEntererTime(HistoryAndPhysical historyAndPhysical,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_HAS_DATA_ENTERER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_HAS_DATA_ENTERER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_HAS_DATA_ENTERER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_HAS_DATA_ENTERER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_HAS_DATA_ENTERER_TIME,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalHasDataEntererTime"),
					new Object[] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalHasInformant(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Has Informant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalHasInformant(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_HAS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->size() > 0";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalHasInformant(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Has Informant</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalHasInformant(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_HAS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.informant->size() > 0
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHistoryAndPhysicalHasInformant(HistoryAndPhysical historyAndPhysical,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_HAS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_HAS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_HAS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_HAS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_HAS_INFORMANT,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalHasInformant"),
					new Object[] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalHasInformantAssignedPersonOrRelatedPerson(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Has Informant Assigned Person Or Related Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalHasInformantAssignedPersonOrRelatedPerson(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->forAll(i : cda::Informant12 | not i.assignedEntity.assignedPerson.oclIsUndefined()"
			+ "   or not i.relatedEntity.relatedPerson.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalHasInformantAssignedPersonOrRelatedPerson(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Has Informant Assigned Person Or Related Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalHasInformantAssignedPersonOrRelatedPerson(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.informant->forAll(i : cda::Informant12 | not i.assignedEntity.assignedPerson.oclIsUndefined()
	 *    or not i.relatedEntity.relatedPerson.oclIsUndefined())
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHistoryAndPhysicalHasInformantAssignedPersonOrRelatedPerson(
			HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalHasInformantAssignedPersonOrRelatedPerson"),
					new Object[] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalLegalAuthenticatorHasAssignedPerson(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Legal Authenticator Has Assigned Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalLegalAuthenticatorHasAssignedPerson(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.legalAuthenticator.oclIsUndefined() implies not self.legalAuthenticator.assignedEntity.assignedPerson.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalLegalAuthenticatorHasAssignedPerson(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Legal Authenticator Has Assigned Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalLegalAuthenticatorHasAssignedPerson(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.legalAuthenticator.oclIsUndefined() implies not self.legalAuthenticator.assignedEntity.assignedPerson.oclIsUndefined()
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHistoryAndPhysicalLegalAuthenticatorHasAssignedPerson(
			HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalLegalAuthenticatorHasAssignedPerson"),
					new Object[] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalAuthenticatorHasAssignedPerson(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Authenticator Has Assigned Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalAuthenticatorHasAssignedPerson(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authenticator->forAll(auth : cda::Authenticator | auth.assignedEntity->forAll(entity : cda::AssignedEntity |"
			+ "   not entity.assignedPerson.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalAuthenticatorHasAssignedPerson(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Authenticator Has Assigned Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalAuthenticatorHasAssignedPerson(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.authenticator->forAll(auth : cda::Authenticator | auth.assignedEntity->forAll(entity : cda::AssignedEntity |
	 *    not entity.assignedPerson.oclIsUndefined()))
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHistoryAndPhysicalAuthenticatorHasAssignedPerson(
			HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalAuthenticatorHasAssignedPerson"),
					new Object[] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalTimePreciseToSecond(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Time Precise To Second</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalTimePreciseToSecond(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_TIME_PRECISE_TO_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalTimePreciseToSecond(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Time Precise To Second</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalTimePreciseToSecond(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_TIME_PRECISE_TO_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHistoryAndPhysicalTimePreciseToSecond(HistoryAndPhysical historyAndPhysical,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_TIME_PRECISE_TO_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_TIME_PRECISE_TO_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_TIME_PRECISE_TO_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_TIME_PRECISE_TO_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_TIME_PRECISE_TO_SECOND,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalTimePreciseToSecond"),
					new Object[] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalTimePreciseToYearAndDay(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Time Precise To Year And Day</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalTimePreciseToYearAndDay(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_TIME_PRECISE_TO_YEAR_AND_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "cda::OrganizationPartOf.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject)-> union(  cda::MaintainedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union( cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::ServiceEvent.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::EncounterParticipant.allInstances()->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(self.participant->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(cda::OrganizationPartOf.allInstances().effectiveTime->union(cda::MaintainedEntity.allInstances().effectiveTime)->union( cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::ServiceEvent.allInstances().effectiveTime)->union(cda::EncounterParticipant.allInstances().time)->union(self.participant.time)->select(current : datatypes::IVL_TS  |  ((not current.low.oclIsUndefined()) and (current.low.value.oclIsUndefined() or current.low.value.size() < 8)) or ((not current.center.oclIsUndefined()) and (current.center.value.oclIsUndefined() or current.center.value.size() < 8)) or ((not current.high.oclIsUndefined()) and (current.high.value.oclIsUndefined() or current.high.value.size() < 8)) or (current.low.oclIsUndefined() and current.center.oclIsUndefined() and current.high.oclIsUndefined()) ).oclAsType( ecore::EObject))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalTimePreciseToYearAndDay(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Time Precise To Year And Day</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalTimePreciseToYearAndDay(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_TIME_PRECISE_TO_YEAR_AND_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::OrganizationPartOf.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject)-> union(  cda::MaintainedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union( cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::ServiceEvent.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::EncounterParticipant.allInstances()->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(self.participant->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(cda::OrganizationPartOf.allInstances().effectiveTime->union(cda::MaintainedEntity.allInstances().effectiveTime)->union( cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::ServiceEvent.allInstances().effectiveTime)->union(cda::EncounterParticipant.allInstances().time)->union(self.participant.time)->select(current : datatypes::IVL_TS  |  ((not current.low.oclIsUndefined()) and (current.low.value.oclIsUndefined() or current.low.value.size() < 8)) or ((not current.center.oclIsUndefined()) and (current.center.value.oclIsUndefined() or current.center.value.size() < 8)) or ((not current.high.oclIsUndefined()) and (current.high.value.oclIsUndefined() or current.high.value.size() < 8)) or (current.low.oclIsUndefined() and current.center.oclIsUndefined() and current.high.oclIsUndefined()) ).oclAsType( ecore::EObject))
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHistoryAndPhysicalTimePreciseToYearAndDay(HistoryAndPhysical historyAndPhysical,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_TIME_PRECISE_TO_YEAR_AND_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_TIME_PRECISE_TO_YEAR_AND_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_TIME_PRECISE_TO_YEAR_AND_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_TIME_PRECISE_TO_YEAR_AND_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_TIME_PRECISE_TO_YEAR_AND_DAY,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalTimePreciseToYearAndDay"),
					new Object[] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalAssessmentAndPlan(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Assessment And Plan</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalAssessmentAndPlan(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_ASSESSMENT_AND_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::AssessmentAndPlanSection))"
			+ "   xor (self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::AssessmentSection))"
			+ "      and self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::PlanSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalAssessmentAndPlan(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Assessment And Plan</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalAssessmentAndPlan(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_ASSESSMENT_AND_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::AssessmentAndPlanSection))
	 *    xor (self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::AssessmentSection))
	 *       and self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::PlanSection)))
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHistoryAndPhysicalAssessmentAndPlan(HistoryAndPhysical historyAndPhysical,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_ASSESSMENT_AND_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_ASSESSMENT_AND_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_ASSESSMENT_AND_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_ASSESSMENT_AND_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_ASSESSMENT_AND_PLAN,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalAssessmentAndPlan"),
					new Object[] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalBothAssessmentAndPlan(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Both Assessment And Plan</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalBothAssessmentAndPlan(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_BOTH_ASSESSMENT_AND_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "let assessmentExists : Boolean = self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::AssessmentSection)) in"
			+ "  let planExists : Boolean = self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::PlanSection))"
			+ "    in (assessmentExists or planExists) implies (assessmentExists and planExists)";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalBothAssessmentAndPlan(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Both Assessment And Plan</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalBothAssessmentAndPlan(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_BOTH_ASSESSMENT_AND_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * let assessmentExists : Boolean = self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::AssessmentSection)) in
	 *   let planExists : Boolean = self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::PlanSection))
	 *     in (assessmentExists or planExists) implies (assessmentExists and planExists)
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHistoryAndPhysicalBothAssessmentAndPlan(HistoryAndPhysical historyAndPhysical,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_BOTH_ASSESSMENT_AND_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_BOTH_ASSESSMENT_AND_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_BOTH_ASSESSMENT_AND_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_BOTH_ASSESSMENT_AND_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_BOTH_ASSESSMENT_AND_PLAN,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalBothAssessmentAndPlan"),
					new Object[] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalReasonForVisitAndChiefComplaint(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Reason For Visit And Chief Complaint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalReasonForVisitAndChiefComplaint(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_REASON_FOR_VISIT_AND_CHIEF_COMPLAINT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::ReasonForVisitAndChiefComplaintSection))"
			+ "   xor (self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::ReasonForVisitSection))"
			+ "      and self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::ChiefComplaintSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalReasonForVisitAndChiefComplaint(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Reason For Visit And Chief Complaint</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalReasonForVisitAndChiefComplaint(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_REASON_FOR_VISIT_AND_CHIEF_COMPLAINT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::ReasonForVisitAndChiefComplaintSection))
	 *    xor (self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::ReasonForVisitSection))
	 *       and self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::ChiefComplaintSection)))
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHistoryAndPhysicalReasonForVisitAndChiefComplaint(
			HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_REASON_FOR_VISIT_AND_CHIEF_COMPLAINT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_REASON_FOR_VISIT_AND_CHIEF_COMPLAINT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_REASON_FOR_VISIT_AND_CHIEF_COMPLAINT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_REASON_FOR_VISIT_AND_CHIEF_COMPLAINT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_REASON_FOR_VISIT_AND_CHIEF_COMPLAINT,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalReasonForVisitAndChiefComplaint"),
					new Object[] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalBothReasonForVisitAndChiefComplaint(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Both Reason For Visit And Chief Complaint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalBothReasonForVisitAndChiefComplaint(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_BOTH_REASON_FOR_VISIT_AND_CHIEF_COMPLAINT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "let reasonExists : Boolean = self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::ReasonForVisitSection)) in"
			+ "  let complaintExists : Boolean = self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::ChiefComplaintSection))"
			+ "    in (reasonExists or complaintExists) implies (reasonExists and complaintExists)";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalBothReasonForVisitAndChiefComplaint(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Both Reason For Visit And Chief Complaint</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalBothReasonForVisitAndChiefComplaint(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_BOTH_REASON_FOR_VISIT_AND_CHIEF_COMPLAINT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * let reasonExists : Boolean = self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::ReasonForVisitSection)) in
	 *   let complaintExists : Boolean = self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::ChiefComplaintSection))
	 *     in (reasonExists or complaintExists) implies (reasonExists and complaintExists)
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHistoryAndPhysicalBothReasonForVisitAndChiefComplaint(
			HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_BOTH_REASON_FOR_VISIT_AND_CHIEF_COMPLAINT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_BOTH_REASON_FOR_VISIT_AND_CHIEF_COMPLAINT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_BOTH_REASON_FOR_VISIT_AND_CHIEF_COMPLAINT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_BOTH_REASON_FOR_VISIT_AND_CHIEF_COMPLAINT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_BOTH_REASON_FOR_VISIT_AND_CHIEF_COMPLAINT,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalBothReasonForVisitAndChiefComplaint"),
					new Object[] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalTemplateId(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalTemplateId(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.2')";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalTemplateId(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalTemplateId(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.2')
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHistoryAndPhysicalTemplateId(HistoryAndPhysical historyAndPhysical,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalTemplateId"),
					new Object[] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalRealmCode(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Realm Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalRealmCode(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.realmCode->isEmpty() or self.realmCode->exists(element | element.isNullFlavorUndefined())) implies (self.realmCode->size() = 1 and self.realmCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = element.oclAsType(datatypes::CS) in " + "value.code = 'US'))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalRealmCode(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Realm Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalRealmCode(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.realmCode->isEmpty() or self.realmCode->exists(element | element.isNullFlavorUndefined())) implies (self.realmCode->size() = 1 and self.realmCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = element.oclAsType(datatypes::CS) in 
	 * value.code = 'US'))
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHistoryAndPhysicalRealmCode(HistoryAndPhysical historyAndPhysical,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_REALM_CODE,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalRealmCode"), new Object[] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalTypeId(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Type Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalTypeId(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.typeId.oclIsUndefined() or self.typeId.isNullFlavorUndefined()) implies (not self.typeId.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalTypeId(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Type Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalTypeId(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.typeId.oclIsUndefined() or self.typeId.isNullFlavorUndefined()) implies (not self.typeId.oclIsUndefined())
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHistoryAndPhysicalTypeId(HistoryAndPhysical historyAndPhysical,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_TYPE_ID,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalTypeId"), new Object[] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalId(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalId(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id.oclIsUndefined() or self.id.isNullFlavorUndefined()) implies (not self.id.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalId(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalId(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id.oclIsUndefined() or self.id.isNullFlavorUndefined()) implies (not self.id.oclIsUndefined())
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHistoryAndPhysicalId(HistoryAndPhysical historyAndPhysical,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_ID,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalId"), new Object[] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalCode(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalCode(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("
			+ "value.codeSystem = '2.16.840.1.113883.6.1' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalCode(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalCode(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.codeSystem = '2.16.840.1.113883.6.1' and not value.code.oclIsUndefined()))
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHistoryAndPhysicalCode(HistoryAndPhysical historyAndPhysical,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_CODE,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalCode"), new Object[] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalTitle(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalTitle(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalTitle(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalTitle(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHistoryAndPhysicalTitle(HistoryAndPhysical historyAndPhysical,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_TITLE,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalTitle"), new Object[] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalEffectiveTime(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalEffectiveTime(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalEffectiveTime(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalEffectiveTime(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHistoryAndPhysicalEffectiveTime(HistoryAndPhysical historyAndPhysical,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_EFFECTIVE_TIME,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalEffectiveTime"),
					new Object[] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalLanguageCode(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Language Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalLanguageCode(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.languageCode.oclIsUndefined() or self.languageCode.isNullFlavorUndefined()) implies (not self.languageCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalLanguageCode(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Language Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalLanguageCode(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.languageCode.oclIsUndefined() or self.languageCode.isNullFlavorUndefined()) implies (not self.languageCode.oclIsUndefined())
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHistoryAndPhysicalLanguageCode(HistoryAndPhysical historyAndPhysical,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_LANGUAGE_CODE,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalLanguageCode"),
					new Object[] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalHistoryOfPresentIllness(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical History Of Present Illness</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalHistoryOfPresentIllness(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_HISTORY_OF_PRESENT_ILLNESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::IHEHistoryOfPresentIllness))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalHistoryOfPresentIllness(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical History Of Present Illness</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalHistoryOfPresentIllness(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_HISTORY_OF_PRESENT_ILLNESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::IHEHistoryOfPresentIllness))
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHistoryAndPhysicalHistoryOfPresentIllness(HistoryAndPhysical historyAndPhysical,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_HISTORY_OF_PRESENT_ILLNESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_HISTORY_OF_PRESENT_ILLNESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_HISTORY_OF_PRESENT_ILLNESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_HISTORY_OF_PRESENT_ILLNESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_HISTORY_OF_PRESENT_ILLNESS,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalHistoryOfPresentIllness"),
					new Object[] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalPastMedicalHistorySection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Past Medical History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalPastMedicalHistorySection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_PAST_MEDICAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPastIllnessSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalPastMedicalHistorySection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Past Medical History Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalPastMedicalHistorySection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_PAST_MEDICAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPastIllnessSection))
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHistoryAndPhysicalPastMedicalHistorySection(HistoryAndPhysical historyAndPhysical,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_PAST_MEDICAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_PAST_MEDICAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_PAST_MEDICAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_PAST_MEDICAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_PAST_MEDICAL_HISTORY_SECTION,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalPastMedicalHistorySection"),
					new Object[] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalMedicationsSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Medications Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalMedicationsSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalMedicationsSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Medications Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalMedicationsSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSection))
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHistoryAndPhysicalMedicationsSection(HistoryAndPhysical historyAndPhysical,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_MEDICATIONS_SECTION,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalMedicationsSection"),
					new Object[] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalAlertsSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Alerts Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalAlertsSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_ALERTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesReactionsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalAlertsSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Alerts Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalAlertsSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_ALERTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesReactionsSection))
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHistoryAndPhysicalAlertsSection(HistoryAndPhysical historyAndPhysical,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_ALERTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_ALERTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_ALERTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_ALERTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_ALERTS_SECTION,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalAlertsSection"),
					new Object[] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalSocialHistorySection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Social History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalSocialHistorySection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalSocialHistorySection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Social History Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalSocialHistorySection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection))
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHistoryAndPhysicalSocialHistorySection(HistoryAndPhysical historyAndPhysical,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_SOCIAL_HISTORY_SECTION,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalSocialHistorySection"),
					new Object[] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalFamilyHistorySection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Family History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalFamilyHistorySection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalFamilyHistorySection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Family History Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalFamilyHistorySection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection))
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHistoryAndPhysicalFamilyHistorySection(HistoryAndPhysical historyAndPhysical,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_FAMILY_HISTORY_SECTION,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalFamilyHistorySection"),
					new Object[] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalReviewOfSystemsSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Review Of Systems Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalReviewOfSystemsSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReviewOfSystemsSectionIHE))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalReviewOfSystemsSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Review Of Systems Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalReviewOfSystemsSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReviewOfSystemsSectionIHE))
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHistoryAndPhysicalReviewOfSystemsSection(HistoryAndPhysical historyAndPhysical,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_REVIEW_OF_SYSTEMS_SECTION,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalReviewOfSystemsSection"),
					new Object[] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalPhysicalExaminationSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Physical Examination Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalPhysicalExaminationSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_PHYSICAL_EXAMINATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PhysicalExamSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalPhysicalExaminationSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Physical Examination Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalPhysicalExaminationSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_PHYSICAL_EXAMINATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PhysicalExamSection))
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHistoryAndPhysicalPhysicalExaminationSection(HistoryAndPhysical historyAndPhysical,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_PHYSICAL_EXAMINATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_PHYSICAL_EXAMINATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_PHYSICAL_EXAMINATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_PHYSICAL_EXAMINATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_PHYSICAL_EXAMINATION_SECTION,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalPhysicalExaminationSection"),
					new Object[] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalVitalSignsSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Vital Signs Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalVitalSignsSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::CCDVitalSignsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalVitalSignsSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Vital Signs Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalVitalSignsSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::CCDVitalSignsSection))
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHistoryAndPhysicalVitalSignsSection(HistoryAndPhysical historyAndPhysical,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_VITAL_SIGNS_SECTION,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalVitalSignsSection"),
					new Object[] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalGeneralStatusSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical General Status Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalGeneralStatusSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::GeneralStatusSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalGeneralStatusSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical General Status Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalGeneralStatusSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::GeneralStatusSection))
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHistoryAndPhysicalGeneralStatusSection(HistoryAndPhysical historyAndPhysical,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_GENERAL_STATUS_SECTION,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalGeneralStatusSection"),
					new Object[] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalDiagnosticFindings(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Diagnostic Findings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalDiagnosticFindings(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_DIAGNOSTIC_FINDINGS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DiagnosticFindings))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalDiagnosticFindings(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Diagnostic Findings</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalDiagnosticFindings(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_DIAGNOSTIC_FINDINGS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DiagnosticFindings))
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHistoryAndPhysicalDiagnosticFindings(HistoryAndPhysical historyAndPhysical,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_DIAGNOSTIC_FINDINGS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_DIAGNOSTIC_FINDINGS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_DIAGNOSTIC_FINDINGS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_DIAGNOSTIC_FINDINGS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_DIAGNOSTIC_FINDINGS,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalDiagnosticFindings"),
					new Object[] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalProblemSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Problem Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalProblemSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemListSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalProblemSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Problem Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalProblemSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemListSection))
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHistoryAndPhysicalProblemSection(HistoryAndPhysical historyAndPhysical,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_PROBLEM_SECTION,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalProblemSection"),
					new Object[] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalProceduresSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Procedures Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalProceduresSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SurgeriesSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalProceduresSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Procedures Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalProceduresSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SurgeriesSection))
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHistoryAndPhysicalProceduresSection(HistoryAndPhysical historyAndPhysical,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_PROCEDURES_SECTION,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalProceduresSection"),
					new Object[] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalImmunizationsSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Immunizations Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalImmunizationsSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalImmunizationsSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Immunizations Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalImmunizationsSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSection))
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHistoryAndPhysicalImmunizationsSection(HistoryAndPhysical historyAndPhysical,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_IMMUNIZATIONS_SECTION,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalImmunizationsSection"),
					new Object[] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getHistoryOfPresentIllness(HistoryAndPhysical) <em>Get History Of Present Illness</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoryOfPresentIllness(HistoryAndPhysical)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HISTORY_OF_PRESENT_ILLNESS__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::IHEHistoryOfPresentIllness))->asSequence()->first().oclAsType(consol::IHEHistoryOfPresentIllness)";

	/**
	 * The cached OCL query for the '{@link #getHistoryOfPresentIllness(HistoryAndPhysical) <em>Get History Of Present Illness</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoryOfPresentIllness(HistoryAndPhysical)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HISTORY_OF_PRESENT_ILLNESS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::IHEHistoryOfPresentIllness))->asSequence()->first().oclAsType(consol::IHEHistoryOfPresentIllness)
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static IHEHistoryOfPresentIllness getHistoryOfPresentIllness(HistoryAndPhysical historyAndPhysical) {
		if (GET_HISTORY_OF_PRESENT_ILLNESS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL,
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL.getEAllOperations().get(86));
			try {
				GET_HISTORY_OF_PRESENT_ILLNESS__EOCL_QRY = helper.createQuery(GET_HISTORY_OF_PRESENT_ILLNESS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HISTORY_OF_PRESENT_ILLNESS__EOCL_QRY);
		return (IHEHistoryOfPresentIllness) query.evaluate(historyAndPhysical);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPastMedicalHistorySection(HistoryAndPhysical) <em>Get Past Medical History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPastMedicalHistorySection(HistoryAndPhysical)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PAST_MEDICAL_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPastIllnessSection))->asSequence()->first().oclAsType(consol::HistoryOfPastIllnessSection)";

	/**
	 * The cached OCL query for the '{@link #getPastMedicalHistorySection(HistoryAndPhysical) <em>Get Past Medical History Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPastMedicalHistorySection(HistoryAndPhysical)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PAST_MEDICAL_HISTORY_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPastIllnessSection))->asSequence()->first().oclAsType(consol::HistoryOfPastIllnessSection)
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static HistoryOfPastIllnessSection getPastMedicalHistorySection(HistoryAndPhysical historyAndPhysical) {
		if (GET_PAST_MEDICAL_HISTORY_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL,
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL.getEAllOperations().get(87));
			try {
				GET_PAST_MEDICAL_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_PAST_MEDICAL_HISTORY_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PAST_MEDICAL_HISTORY_SECTION__EOCL_QRY);
		return (HistoryOfPastIllnessSection) query.evaluate(historyAndPhysical);
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicationsSection(HistoryAndPhysical) <em>Get Medications Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationsSection(HistoryAndPhysical)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSection))->asSequence()->first().oclAsType(consol::MedicationsSection)";

	/**
	 * The cached OCL query for the '{@link #getMedicationsSection(HistoryAndPhysical) <em>Get Medications Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationsSection(HistoryAndPhysical)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATIONS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSection))->asSequence()->first().oclAsType(consol::MedicationsSection)
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static MedicationsSection getMedicationsSection(HistoryAndPhysical historyAndPhysical) {
		if (GET_MEDICATIONS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL,
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL.getEAllOperations().get(88));
			try {
				GET_MEDICATIONS_SECTION__EOCL_QRY = helper.createQuery(GET_MEDICATIONS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATIONS_SECTION__EOCL_QRY);
		return (MedicationsSection) query.evaluate(historyAndPhysical);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAlertsSection(HistoryAndPhysical) <em>Get Alerts Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlertsSection(HistoryAndPhysical)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ALERTS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesReactionsSection))->asSequence()->first().oclAsType(consol::AllergiesReactionsSection)";

	/**
	 * The cached OCL query for the '{@link #getAlertsSection(HistoryAndPhysical) <em>Get Alerts Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlertsSection(HistoryAndPhysical)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ALERTS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesReactionsSection))->asSequence()->first().oclAsType(consol::AllergiesReactionsSection)
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static AllergiesReactionsSection getAlertsSection(HistoryAndPhysical historyAndPhysical) {
		if (GET_ALERTS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL,
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL.getEAllOperations().get(89));
			try {
				GET_ALERTS_SECTION__EOCL_QRY = helper.createQuery(GET_ALERTS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ALERTS_SECTION__EOCL_QRY);
		return (AllergiesReactionsSection) query.evaluate(historyAndPhysical);
	}

	/**
	 * The cached OCL expression body for the '{@link #getSocialHistorySection(HistoryAndPhysical) <em>Get Social History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialHistorySection(HistoryAndPhysical)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SOCIAL_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection))->asSequence()->first().oclAsType(consol::SocialHistorySection)";

	/**
	 * The cached OCL query for the '{@link #getSocialHistorySection(HistoryAndPhysical) <em>Get Social History Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialHistorySection(HistoryAndPhysical)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SOCIAL_HISTORY_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection))->asSequence()->first().oclAsType(consol::SocialHistorySection)
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static SocialHistorySection getSocialHistorySection(HistoryAndPhysical historyAndPhysical) {
		if (GET_SOCIAL_HISTORY_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL,
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL.getEAllOperations().get(90));
			try {
				GET_SOCIAL_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_SOCIAL_HISTORY_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SOCIAL_HISTORY_SECTION__EOCL_QRY);
		return (SocialHistorySection) query.evaluate(historyAndPhysical);
	}

	/**
	 * The cached OCL expression body for the '{@link #getFamilyHistorySection(HistoryAndPhysical) <em>Get Family History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyHistorySection(HistoryAndPhysical)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FAMILY_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection))->asSequence()->first().oclAsType(consol::FamilyHistorySection)";

	/**
	 * The cached OCL query for the '{@link #getFamilyHistorySection(HistoryAndPhysical) <em>Get Family History Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyHistorySection(HistoryAndPhysical)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FAMILY_HISTORY_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection))->asSequence()->first().oclAsType(consol::FamilyHistorySection)
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static FamilyHistorySection getFamilyHistorySection(HistoryAndPhysical historyAndPhysical) {
		if (GET_FAMILY_HISTORY_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL,
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL.getEAllOperations().get(91));
			try {
				GET_FAMILY_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_FAMILY_HISTORY_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_FAMILY_HISTORY_SECTION__EOCL_QRY);
		return (FamilyHistorySection) query.evaluate(historyAndPhysical);
	}

	/**
	 * The cached OCL expression body for the '{@link #getReviewOfSystemsSection(HistoryAndPhysical) <em>Get Review Of Systems Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewOfSystemsSection(HistoryAndPhysical)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReviewOfSystemsSectionIHE))->asSequence()->first().oclAsType(consol::ReviewOfSystemsSectionIHE)";

	/**
	 * The cached OCL query for the '{@link #getReviewOfSystemsSection(HistoryAndPhysical) <em>Get Review Of Systems Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewOfSystemsSection(HistoryAndPhysical)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReviewOfSystemsSectionIHE))->asSequence()->first().oclAsType(consol::ReviewOfSystemsSectionIHE)
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static ReviewOfSystemsSectionIHE getReviewOfSystemsSection(HistoryAndPhysical historyAndPhysical) {
		if (GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL,
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL.getEAllOperations().get(92));
			try {
				GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY = helper.createQuery(GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY);
		return (ReviewOfSystemsSectionIHE) query.evaluate(historyAndPhysical);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPhysicalExaminationSection(HistoryAndPhysical) <em>Get Physical Examination Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalExaminationSection(HistoryAndPhysical)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PHYSICAL_EXAMINATION_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PhysicalExamSection))->asSequence()->first().oclAsType(consol::PhysicalExamSection)";

	/**
	 * The cached OCL query for the '{@link #getPhysicalExaminationSection(HistoryAndPhysical) <em>Get Physical Examination Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalExaminationSection(HistoryAndPhysical)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PHYSICAL_EXAMINATION_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PhysicalExamSection))->asSequence()->first().oclAsType(consol::PhysicalExamSection)
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static PhysicalExamSection getPhysicalExaminationSection(HistoryAndPhysical historyAndPhysical) {
		if (GET_PHYSICAL_EXAMINATION_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL,
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL.getEAllOperations().get(93));
			try {
				GET_PHYSICAL_EXAMINATION_SECTION__EOCL_QRY = helper.createQuery(GET_PHYSICAL_EXAMINATION_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PHYSICAL_EXAMINATION_SECTION__EOCL_QRY);
		return (PhysicalExamSection) query.evaluate(historyAndPhysical);
	}

	/**
	 * The cached OCL expression body for the '{@link #getVitalSignsSection(HistoryAndPhysical) <em>Get Vital Signs Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignsSection(HistoryAndPhysical)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_VITAL_SIGNS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::CCDVitalSignsSection))->asSequence()->first().oclAsType(consol::CCDVitalSignsSection)";

	/**
	 * The cached OCL query for the '{@link #getVitalSignsSection(HistoryAndPhysical) <em>Get Vital Signs Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignsSection(HistoryAndPhysical)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_VITAL_SIGNS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::CCDVitalSignsSection))->asSequence()->first().oclAsType(consol::CCDVitalSignsSection)
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static CCDVitalSignsSection getVitalSignsSection(HistoryAndPhysical historyAndPhysical) {
		if (GET_VITAL_SIGNS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL,
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL.getEAllOperations().get(94));
			try {
				GET_VITAL_SIGNS_SECTION__EOCL_QRY = helper.createQuery(GET_VITAL_SIGNS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_VITAL_SIGNS_SECTION__EOCL_QRY);
		return (CCDVitalSignsSection) query.evaluate(historyAndPhysical);
	}

	/**
	 * The cached OCL expression body for the '{@link #getGeneralStatusSection(HistoryAndPhysical) <em>Get General Status Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralStatusSection(HistoryAndPhysical)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_GENERAL_STATUS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::GeneralStatusSection))->asSequence()->first().oclAsType(consol::GeneralStatusSection)";

	/**
	 * The cached OCL query for the '{@link #getGeneralStatusSection(HistoryAndPhysical) <em>Get General Status Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralStatusSection(HistoryAndPhysical)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_GENERAL_STATUS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::GeneralStatusSection))->asSequence()->first().oclAsType(consol::GeneralStatusSection)
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static GeneralStatusSection getGeneralStatusSection(HistoryAndPhysical historyAndPhysical) {
		if (GET_GENERAL_STATUS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL,
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL.getEAllOperations().get(95));
			try {
				GET_GENERAL_STATUS_SECTION__EOCL_QRY = helper.createQuery(GET_GENERAL_STATUS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_GENERAL_STATUS_SECTION__EOCL_QRY);
		return (GeneralStatusSection) query.evaluate(historyAndPhysical);
	}

	/**
	 * The cached OCL expression body for the '{@link #getDiagnosticFindings(HistoryAndPhysical) <em>Get Diagnostic Findings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosticFindings(HistoryAndPhysical)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DIAGNOSTIC_FINDINGS__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DiagnosticFindings))->asSequence()->first().oclAsType(consol::DiagnosticFindings)";

	/**
	 * The cached OCL query for the '{@link #getDiagnosticFindings(HistoryAndPhysical) <em>Get Diagnostic Findings</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosticFindings(HistoryAndPhysical)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DIAGNOSTIC_FINDINGS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DiagnosticFindings))->asSequence()->first().oclAsType(consol::DiagnosticFindings)
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static DiagnosticFindings getDiagnosticFindings(HistoryAndPhysical historyAndPhysical) {
		if (GET_DIAGNOSTIC_FINDINGS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL,
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL.getEAllOperations().get(96));
			try {
				GET_DIAGNOSTIC_FINDINGS__EOCL_QRY = helper.createQuery(GET_DIAGNOSTIC_FINDINGS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_DIAGNOSTIC_FINDINGS__EOCL_QRY);
		return (DiagnosticFindings) query.evaluate(historyAndPhysical);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemSection(HistoryAndPhysical) <em>Get Problem Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemSection(HistoryAndPhysical)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemListSection))->asSequence()->first().oclAsType(consol::ProblemListSection)";

	/**
	 * The cached OCL query for the '{@link #getProblemSection(HistoryAndPhysical) <em>Get Problem Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemSection(HistoryAndPhysical)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemListSection))->asSequence()->first().oclAsType(consol::ProblemListSection)
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static ProblemListSection getProblemSection(HistoryAndPhysical historyAndPhysical) {
		if (GET_PROBLEM_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL,
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL.getEAllOperations().get(97));
			try {
				GET_PROBLEM_SECTION__EOCL_QRY = helper.createQuery(GET_PROBLEM_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_SECTION__EOCL_QRY);
		return (ProblemListSection) query.evaluate(historyAndPhysical);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProceduresSection(HistoryAndPhysical) <em>Get Procedures Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProceduresSection(HistoryAndPhysical)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROCEDURES_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SurgeriesSection))->asSequence()->first().oclAsType(consol::SurgeriesSection)";

	/**
	 * The cached OCL query for the '{@link #getProceduresSection(HistoryAndPhysical) <em>Get Procedures Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProceduresSection(HistoryAndPhysical)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROCEDURES_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SurgeriesSection))->asSequence()->first().oclAsType(consol::SurgeriesSection)
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static SurgeriesSection getProceduresSection(HistoryAndPhysical historyAndPhysical) {
		if (GET_PROCEDURES_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL,
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL.getEAllOperations().get(98));
			try {
				GET_PROCEDURES_SECTION__EOCL_QRY = helper.createQuery(GET_PROCEDURES_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURES_SECTION__EOCL_QRY);
		return (SurgeriesSection) query.evaluate(historyAndPhysical);
	}

	/**
	 * The cached OCL expression body for the '{@link #getImmunizationsSection(HistoryAndPhysical) <em>Get Immunizations Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmunizationsSection(HistoryAndPhysical)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_IMMUNIZATIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSection))->asSequence()->first().oclAsType(consol::ImmunizationsSection)";

	/**
	 * The cached OCL query for the '{@link #getImmunizationsSection(HistoryAndPhysical) <em>Get Immunizations Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmunizationsSection(HistoryAndPhysical)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_IMMUNIZATIONS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSection))->asSequence()->first().oclAsType(consol::ImmunizationsSection)
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static ImmunizationsSection getImmunizationsSection(HistoryAndPhysical historyAndPhysical) {
		if (GET_IMMUNIZATIONS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL,
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL.getEAllOperations().get(99));
			try {
				GET_IMMUNIZATIONS_SECTION__EOCL_QRY = helper.createQuery(GET_IMMUNIZATIONS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_IMMUNIZATIONS_SECTION__EOCL_QRY);
		return (ImmunizationsSection) query.evaluate(historyAndPhysical);
	}

} // HistoryAndPhysicalOperations
