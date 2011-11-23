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

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalDocumentOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>General Header Constraints</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsPersonHasName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Person Has Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRolesShallHaveAddrAndTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Roles Shall Have Addr And Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRolesShouldHaveAddrAndTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Roles Should Have Addr And Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsOrganizationsHaveContactInfo(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Organizations Have Contact Info</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsTimePreciseToDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Time Precise To Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsTimePreciseToYear(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Time Precise To Year</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsTelephoneMatchesRegex(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Telephone Matches Regex</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsHasTelephoneDialingDigits(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Telephone Dialing Digits</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsUnknownTelephoneUsesNullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Unknown Telephone Uses Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsTypeIdExtension(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Type Id Extension</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsIdRootFormat(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Id Root Format</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsOidLength(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Oid Length</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLanguageCodeForm(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Language Code Form</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsSetIdAndVersionNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Set Id And Version Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsSetIdAndIdAreUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Set Id And Id Are Unique</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCopyTimeNotPresent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Copy Time Not Present</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsHasRecordTargetPatientRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Record Target Patient Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsHasPatientBirthTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Patient Birth Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsHasAdministrativeGenderCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Administrative Gender Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsHasProviderOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Provider Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsHasAuthorTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Author Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsHasAssignedAuthorId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Assigned Author Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDevice(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Assigned Author Person Or Device</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsHasDataEntererAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Data Enterer Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsHasDataEntererTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Data Enterer Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsHasInformant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Informant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Informant Assigned Person Or Related Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Has Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorHasAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Has Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsTimePreciseToSecond(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Time Precise To Second</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsTimePreciseToYearAndDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Time Precise To Year And Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRealmCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsTypeId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLanguageCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Language Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneralHeaderConstraintsOperations extends ClinicalDocumentOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralHeaderConstraintsOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsPersonHasName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Person Has Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsPersonHasName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_PERSON_HAS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsPersonHasName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Person Has Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsPersonHasName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_PERSON_HAS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsPersonHasName(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_PERSON_HAS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_PERSON_HAS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_PERSON_HAS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_PERSON_HAS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_PERSON_HAS_NAME,
						 ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsPersonHasName"),
						 new Object [] { generalHeaderConstraints }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRolesShallHaveAddrAndTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Roles Shall Have Addr And Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRolesShallHaveAddrAndTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_ROLES_SHALL_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRolesShallHaveAddrAndTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Roles Shall Have Addr And Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRolesShallHaveAddrAndTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_ROLES_SHALL_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsRolesShallHaveAddrAndTelecom(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_ROLES_SHALL_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_ROLES_SHALL_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_ROLES_SHALL_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_ROLES_SHALL_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_ROLES_SHALL_HAVE_ADDR_AND_TELECOM,
						 ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsRolesShallHaveAddrAndTelecom"),
						 new Object [] { generalHeaderConstraints }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRolesShouldHaveAddrAndTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Roles Should Have Addr And Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRolesShouldHaveAddrAndTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_ROLES_SHOULD_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRolesShouldHaveAddrAndTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Roles Should Have Addr And Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRolesShouldHaveAddrAndTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_ROLES_SHOULD_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsRolesShouldHaveAddrAndTelecom(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_ROLES_SHOULD_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_ROLES_SHOULD_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_ROLES_SHOULD_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_ROLES_SHOULD_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_ROLES_SHOULD_HAVE_ADDR_AND_TELECOM,
						 ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsRolesShouldHaveAddrAndTelecom"),
						 new Object [] { generalHeaderConstraints }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsOrganizationsHaveContactInfo(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Organizations Have Contact Info</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsOrganizationsHaveContactInfo(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_ORGANIZATIONS_HAVE_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsOrganizationsHaveContactInfo(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Organizations Have Contact Info</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsOrganizationsHaveContactInfo(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_ORGANIZATIONS_HAVE_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsOrganizationsHaveContactInfo(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_ORGANIZATIONS_HAVE_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_ORGANIZATIONS_HAVE_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_ORGANIZATIONS_HAVE_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_ORGANIZATIONS_HAVE_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_ORGANIZATIONS_HAVE_CONTACT_INFO,
						 ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsOrganizationsHaveContactInfo"),
						 new Object [] { generalHeaderConstraints }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTimePreciseToDay(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Time Precise To Day</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTimePreciseToDay(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTimePreciseToDay(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Time Precise To Day</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTimePreciseToDay(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsTimePreciseToDay(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_DAY,
						 ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsTimePreciseToDay"),
						 new Object [] { generalHeaderConstraints }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTimePreciseToYear(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Time Precise To Year</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTimePreciseToYear(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "cda::OrganizationPartOf.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject)-> union(  cda::MaintainedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union( cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::ServiceEvent.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::EncounterParticipant.allInstances()->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(self.participant->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(cda::OrganizationPartOf.allInstances().effectiveTime->union(cda::MaintainedEntity.allInstances().effectiveTime)->union( cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::ServiceEvent.allInstances().effectiveTime)->union(cda::EncounterParticipant.allInstances().time)->union(self.participant.time)->select(current : datatypes::IVL_TS  |  ((not current.low.oclIsUndefined()) and (current.low.value.oclIsUndefined() or current.low.value.size() < 4)) or ((not current.center.oclIsUndefined()) and (current.center.value.oclIsUndefined() or current.center.value.size() < 4)) or ((not current.high.oclIsUndefined()) and (current.high.value.oclIsUndefined() or current.high.value.size() < 4)) or (current.low.oclIsUndefined() and current.center.oclIsUndefined() and current.high.oclIsUndefined()) ).oclAsType( ecore::EObject))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTimePreciseToYear(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Time Precise To Year</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTimePreciseToYear(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::OrganizationPartOf.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject)-> union(  cda::MaintainedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union( cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::ServiceEvent.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::EncounterParticipant.allInstances()->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(self.participant->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(cda::OrganizationPartOf.allInstances().effectiveTime->union(cda::MaintainedEntity.allInstances().effectiveTime)->union( cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::ServiceEvent.allInstances().effectiveTime)->union(cda::EncounterParticipant.allInstances().time)->union(self.participant.time)->select(current : datatypes::IVL_TS  |  ((not current.low.oclIsUndefined()) and (current.low.value.oclIsUndefined() or current.low.value.size() < 4)) or ((not current.center.oclIsUndefined()) and (current.center.value.oclIsUndefined() or current.center.value.size() < 4)) or ((not current.high.oclIsUndefined()) and (current.high.value.oclIsUndefined() or current.high.value.size() < 4)) or (current.low.oclIsUndefined() and current.center.oclIsUndefined() and current.high.oclIsUndefined()) ).oclAsType( ecore::EObject))
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsTimePreciseToYear(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_YEAR,
						 ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsTimePreciseToYear"),
						 new Object [] { generalHeaderConstraints }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTelephoneMatchesRegex(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Telephone Matches Regex</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTelephoneMatchesRegex(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TELEPHONE_MATCHES_REGEX__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTelephoneMatchesRegex(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Telephone Matches Regex</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTelephoneMatchesRegex(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TELEPHONE_MATCHES_REGEX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsTelephoneMatchesRegex(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TELEPHONE_MATCHES_REGEX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_TELEPHONE_MATCHES_REGEX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TELEPHONE_MATCHES_REGEX__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TELEPHONE_MATCHES_REGEX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_TELEPHONE_MATCHES_REGEX,
						 ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsTelephoneMatchesRegex"),
						 new Object [] { generalHeaderConstraints }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsHasTelephoneDialingDigits(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Telephone Dialing Digits</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsHasTelephoneDialingDigits(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_TELEPHONE_DIALING_DIGITS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsHasTelephoneDialingDigits(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Telephone Dialing Digits</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsHasTelephoneDialingDigits(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_TELEPHONE_DIALING_DIGITS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsHasTelephoneDialingDigits(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_TELEPHONE_DIALING_DIGITS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_TELEPHONE_DIALING_DIGITS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_TELEPHONE_DIALING_DIGITS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_TELEPHONE_DIALING_DIGITS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_HAS_TELEPHONE_DIALING_DIGITS,
						 ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsHasTelephoneDialingDigits"),
						 new Object [] { generalHeaderConstraints }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsUnknownTelephoneUsesNullFlavor(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Unknown Telephone Uses Null Flavor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsUnknownTelephoneUsesNullFlavor(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_UNKNOWN_TELEPHONE_USES_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsUnknownTelephoneUsesNullFlavor(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Unknown Telephone Uses Null Flavor</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsUnknownTelephoneUsesNullFlavor(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_UNKNOWN_TELEPHONE_USES_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsUnknownTelephoneUsesNullFlavor(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_UNKNOWN_TELEPHONE_USES_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_UNKNOWN_TELEPHONE_USES_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_UNKNOWN_TELEPHONE_USES_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_UNKNOWN_TELEPHONE_USES_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_UNKNOWN_TELEPHONE_USES_NULL_FLAVOR,
						 ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsUnknownTelephoneUsesNullFlavor"),
						 new Object [] { generalHeaderConstraints }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTypeIdExtension(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Type Id Extension</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTypeIdExtension(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.typeId.extension = 'POCD_HD000040'";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTypeIdExtension(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Type Id Extension</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTypeIdExtension(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.typeId.extension = 'POCD_HD000040'
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsTypeIdExtension(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_TYPE_ID_EXTENSION,
						 ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsTypeIdExtension"),
						 new Object [] { generalHeaderConstraints }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsIdRootFormat(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Id Root Format</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsIdRootFormat(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_ID_ROOT_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.id.matches('root','([0-2])(.([1-9][0-9]*|0))+') or self.id.matches('root','([A-Fa-f0-9]{8})(\\\\-[A-Fa-f0-9]{4}){3}(\\\\-[A-Fa-f0-9]{12})')";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsIdRootFormat(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Id Root Format</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsIdRootFormat(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_ID_ROOT_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.id.matches('root','([0-2])(.([1-9][0-9]*|0))+') or self.id.matches('root','([A-Fa-f0-9]{8})(\\\\-[A-Fa-f0-9]{4}){3}(\\\\-[A-Fa-f0-9]{12})')
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsIdRootFormat(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_ID_ROOT_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_ID_ROOT_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_ID_ROOT_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_ID_ROOT_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_ID_ROOT_FORMAT,
						 ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsIdRootFormat"),
						 new Object [] { generalHeaderConstraints }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsOidLength(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Oid Length</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsOidLength(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_OID_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.id->select((not id.root.oclIsUndefined()) and id.root.size() > 64 )";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsOidLength(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Oid Length</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsOidLength(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_OID_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.id->select((not id.root.oclIsUndefined()) and id.root.size() > 64 )
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsOidLength(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_OID_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_OID_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_OID_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_OID_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_OID_LENGTH,
						 ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsOidLength"),
						 new Object [] { generalHeaderConstraints }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsLanguageCodeForm(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Language Code Form</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsLanguageCodeForm(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_LANGUAGE_CODE_FORM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.languageCode.matches('code','(([a-z]{2})(\\\\-[A-Z]{2})?)')";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsLanguageCodeForm(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Language Code Form</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsLanguageCodeForm(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_LANGUAGE_CODE_FORM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.languageCode.matches('code','(([a-z]{2})(\\\\-[A-Z]{2})?)')
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsLanguageCodeForm(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_LANGUAGE_CODE_FORM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_LANGUAGE_CODE_FORM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_LANGUAGE_CODE_FORM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_LANGUAGE_CODE_FORM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_LANGUAGE_CODE_FORM,
						 ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsLanguageCodeForm"),
						 new Object [] { generalHeaderConstraints }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsSetIdAndVersionNumber(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Set Id And Version Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsSetIdAndVersionNumber(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_SET_ID_AND_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.setId.oclIsUndefined() and self.versionNumber.oclIsUndefined())"+
"   xor (not self.setId.oclIsUndefined() and not self.versionNumber.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsSetIdAndVersionNumber(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Set Id And Version Number</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsSetIdAndVersionNumber(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_SET_ID_AND_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.setId.oclIsUndefined() and self.versionNumber.oclIsUndefined())
	 *    xor (not self.setId.oclIsUndefined() and not self.versionNumber.oclIsUndefined())
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsSetIdAndVersionNumber(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_SET_ID_AND_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_SET_ID_AND_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_SET_ID_AND_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_SET_ID_AND_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_SET_ID_AND_VERSION_NUMBER,
						 ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsSetIdAndVersionNumber"),
						 new Object [] { generalHeaderConstraints }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsSetIdAndIdAreUnique(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Set Id And Id Are Unique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsSetIdAndIdAreUnique(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_SET_ID_AND_ID_ARE_UNIQUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(not self.setId.oclIsUndefined() and not self.id.oclIsUndefined())"+
"   implies (self.setId.root <> self.id.root or self.setId.extension <> self.id.extension)";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsSetIdAndIdAreUnique(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Set Id And Id Are Unique</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsSetIdAndIdAreUnique(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_SET_ID_AND_ID_ARE_UNIQUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (not self.setId.oclIsUndefined() and not self.id.oclIsUndefined())
	 *    implies (self.setId.root <> self.id.root or self.setId.extension <> self.id.extension)
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsSetIdAndIdAreUnique(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_SET_ID_AND_ID_ARE_UNIQUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_SET_ID_AND_ID_ARE_UNIQUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_SET_ID_AND_ID_ARE_UNIQUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_SET_ID_AND_ID_ARE_UNIQUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_SET_ID_AND_ID_ARE_UNIQUE,
						 ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsSetIdAndIdAreUnique"),
						 new Object [] { generalHeaderConstraints }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsCopyTimeNotPresent(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Copy Time Not Present</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCopyTimeNotPresent(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_COPY_TIME_NOT_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.copyTime.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsCopyTimeNotPresent(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Copy Time Not Present</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCopyTimeNotPresent(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_COPY_TIME_NOT_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.copyTime.oclIsUndefined()
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsCopyTimeNotPresent(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_COPY_TIME_NOT_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_COPY_TIME_NOT_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_COPY_TIME_NOT_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_COPY_TIME_NOT_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_COPY_TIME_NOT_PRESENT,
						 ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsCopyTimeNotPresent"),
						 new Object [] { generalHeaderConstraints }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsHasRecordTargetPatientRole(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Record Target Patient Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsHasRecordTargetPatientRole(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->size() > 0 and self.recordTarget->exists(target : cda::RecordTarget | not target.patientRole.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsHasRecordTargetPatientRole(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Record Target Patient Role</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsHasRecordTargetPatientRole(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->size() > 0 and self.recordTarget->exists(target : cda::RecordTarget | not target.patientRole.oclIsUndefined())
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsHasRecordTargetPatientRole(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_HAS_RECORD_TARGET_PATIENT_ROLE,
						 ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsHasRecordTargetPatientRole"),
						 new Object [] { generalHeaderConstraints }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsHasPatientBirthTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Patient Birth Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsHasPatientBirthTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->forAll(target : cda::RecordTarget | not target.patientRole.oclIsUndefined()"+
"   implies (not target.patientRole.patient.birthTime.value.oclIsUndefined()"+
"      or not target.patientRole.patient.birthTime.nullFlavor.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsHasPatientBirthTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Patient Birth Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsHasPatientBirthTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->forAll(target : cda::RecordTarget | not target.patientRole.oclIsUndefined()
	 *    implies (not target.patientRole.patient.birthTime.value.oclIsUndefined()
	 *       or not target.patientRole.patient.birthTime.nullFlavor.oclIsUndefined()))
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsHasPatientBirthTime(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_HAS_PATIENT_BIRTH_TIME,
						 ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsHasPatientBirthTime"),
						 new Object [] { generalHeaderConstraints }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsHasAdministrativeGenderCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Administrative Gender Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsHasAdministrativeGenderCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->forAll(target : cda::RecordTarget | not target.patientRole.oclIsUndefined()"+
"   implies (not target.patientRole.patient.administrativeGenderCode.code.oclIsUndefined()"+
"      or not target.patientRole.patient.administrativeGenderCode.nullFlavor.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsHasAdministrativeGenderCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Administrative Gender Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsHasAdministrativeGenderCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->forAll(target : cda::RecordTarget | not target.patientRole.oclIsUndefined()
	 *    implies (not target.patientRole.patient.administrativeGenderCode.code.oclIsUndefined()
	 *       or not target.patientRole.patient.administrativeGenderCode.nullFlavor.oclIsUndefined()))
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsHasAdministrativeGenderCode(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_HAS_ADMINISTRATIVE_GENDER_CODE,
						 ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsHasAdministrativeGenderCode"),
						 new Object [] { generalHeaderConstraints }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsHasProviderOrganization(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Provider Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsHasProviderOrganization(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->exists(target : cda::RecordTarget | not target.patientRole.providerOrganization.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsHasProviderOrganization(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Provider Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsHasProviderOrganization(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->exists(target : cda::RecordTarget | not target.patientRole.providerOrganization.oclIsUndefined())
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsHasProviderOrganization(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_HAS_PROVIDER_ORGANIZATION,
						 ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsHasProviderOrganization"),
						 new Object [] { generalHeaderConstraints }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsHasAuthorTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Author Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsHasAuthorTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->forAll(author : cda::Author | not author.time.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsHasAuthorTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Author Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsHasAuthorTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.author->forAll(author : cda::Author | not author.time.oclIsUndefined())
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsHasAuthorTime(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_HAS_AUTHOR_TIME,
						 ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsHasAuthorTime"),
						 new Object [] { generalHeaderConstraints }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsHasAssignedAuthorId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Assigned Author Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsHasAssignedAuthorId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->forAll(author : cda::Author | author.assignedAuthor.id->size() > 0)";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsHasAssignedAuthorId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Assigned Author Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsHasAssignedAuthorId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.author->forAll(author : cda::Author | author.assignedAuthor.id->size() > 0)
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsHasAssignedAuthorId(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_HAS_ASSIGNED_AUTHOR_ID,
						 ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsHasAssignedAuthorId"),
						 new Object [] { generalHeaderConstraints }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDevice(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Assigned Author Person Or Device</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDevice(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->forAll(author : cda::Author | not author.assignedAuthor.assignedPerson.oclIsUndefined() "+
"   or not author.assignedAuthor.assignedAuthoringDevice.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDevice(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Assigned Author Person Or Device</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDevice(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.author->forAll(author : cda::Author | not author.assignedAuthor.assignedPerson.oclIsUndefined() 
	 *    or not author.assignedAuthor.assignedAuthoringDevice.oclIsUndefined())
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDevice(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE,
						 ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsHasAssignedAuthorPersonOrDevice"),
						 new Object [] { generalHeaderConstraints }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsHasDataEntererAssignedPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Data Enterer Assigned Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsHasDataEntererAssignedPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_DATA_ENTERER_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.dataEnterer.oclIsUndefined() implies not self.dataEnterer.assignedEntity.assignedPerson.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsHasDataEntererAssignedPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Data Enterer Assigned Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsHasDataEntererAssignedPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_DATA_ENTERER_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.dataEnterer.oclIsUndefined() implies not self.dataEnterer.assignedEntity.assignedPerson.oclIsUndefined()
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsHasDataEntererAssignedPerson(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_DATA_ENTERER_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_DATA_ENTERER_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_DATA_ENTERER_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_DATA_ENTERER_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_HAS_DATA_ENTERER_ASSIGNED_PERSON,
						 ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsHasDataEntererAssignedPerson"),
						 new Object [] { generalHeaderConstraints }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsHasDataEntererTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Data Enterer Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsHasDataEntererTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_DATA_ENTERER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.dataEnterer.oclIsUndefined() implies not self.dataEnterer.time.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsHasDataEntererTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Data Enterer Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsHasDataEntererTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_DATA_ENTERER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.dataEnterer.oclIsUndefined() implies not self.dataEnterer.time.oclIsUndefined()
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsHasDataEntererTime(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_DATA_ENTERER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_DATA_ENTERER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_DATA_ENTERER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_DATA_ENTERER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_HAS_DATA_ENTERER_TIME,
						 ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsHasDataEntererTime"),
						 new Object [] { generalHeaderConstraints }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsHasInformant(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Informant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsHasInformant(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->size() > 0";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsHasInformant(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Informant</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsHasInformant(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.informant->size() > 0
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsHasInformant(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_HAS_INFORMANT,
						 ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsHasInformant"),
						 new Object [] { generalHeaderConstraints }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Informant Assigned Person Or Related Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->forAll(i : cda::Informant12 | not i.assignedEntity.assignedPerson.oclIsUndefined()"+
"   or not i.relatedEntity.relatedPerson.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Informant Assigned Person Or Related Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.informant->forAll(i : cda::Informant12 | not i.assignedEntity.assignedPerson.oclIsUndefined()
	 *    or not i.relatedEntity.relatedPerson.oclIsUndefined())
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPerson(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON,
						 ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPerson"),
						 new Object [] { generalHeaderConstraints }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Has Assigned Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.legalAuthenticator.oclIsUndefined() implies not self.legalAuthenticator.assignedEntity.assignedPerson.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Has Assigned Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.legalAuthenticator.oclIsUndefined() implies not self.legalAuthenticator.assignedEntity.assignedPerson.oclIsUndefined()
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON,
						 ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson"),
						 new Object [] { generalHeaderConstraints }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsAuthenticatorHasAssignedPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Has Assigned Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthenticatorHasAssignedPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authenticator->forAll(auth : cda::Authenticator | auth.assignedEntity->forAll(entity : cda::AssignedEntity |"+
"   not entity.assignedPerson.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsAuthenticatorHasAssignedPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Has Assigned Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthenticatorHasAssignedPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.authenticator->forAll(auth : cda::Authenticator | auth.assignedEntity->forAll(entity : cda::AssignedEntity |
	 *    not entity.assignedPerson.oclIsUndefined()))
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsAuthenticatorHasAssignedPerson(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_HAS_ASSIGNED_PERSON,
						 ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsAuthenticatorHasAssignedPerson"),
						 new Object [] { generalHeaderConstraints }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTimePreciseToSecond(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Time Precise To Second</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTimePreciseToSecond(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTimePreciseToSecond(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Time Precise To Second</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTimePreciseToSecond(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsTimePreciseToSecond(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_SECOND,
						 ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsTimePreciseToSecond"),
						 new Object [] { generalHeaderConstraints }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTimePreciseToYearAndDay(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Time Precise To Year And Day</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTimePreciseToYearAndDay(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_YEAR_AND_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "cda::OrganizationPartOf.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject)-> union(  cda::MaintainedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union( cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::ServiceEvent.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::EncounterParticipant.allInstances()->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(self.participant->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(cda::OrganizationPartOf.allInstances().effectiveTime->union(cda::MaintainedEntity.allInstances().effectiveTime)->union( cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::ServiceEvent.allInstances().effectiveTime)->union(cda::EncounterParticipant.allInstances().time)->union(self.participant.time)->select(current : datatypes::IVL_TS  |  ((not current.low.oclIsUndefined()) and (current.low.value.oclIsUndefined() or current.low.value.size() < 8)) or ((not current.center.oclIsUndefined()) and (current.center.value.oclIsUndefined() or current.center.value.size() < 8)) or ((not current.high.oclIsUndefined()) and (current.high.value.oclIsUndefined() or current.high.value.size() < 8)) or (current.low.oclIsUndefined() and current.center.oclIsUndefined() and current.high.oclIsUndefined()) ).oclAsType( ecore::EObject))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTimePreciseToYearAndDay(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Time Precise To Year And Day</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTimePreciseToYearAndDay(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_YEAR_AND_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::OrganizationPartOf.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject)-> union(  cda::MaintainedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union( cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::ServiceEvent.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::EncounterParticipant.allInstances()->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(self.participant->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(cda::OrganizationPartOf.allInstances().effectiveTime->union(cda::MaintainedEntity.allInstances().effectiveTime)->union( cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::ServiceEvent.allInstances().effectiveTime)->union(cda::EncounterParticipant.allInstances().time)->union(self.participant.time)->select(current : datatypes::IVL_TS  |  ((not current.low.oclIsUndefined()) and (current.low.value.oclIsUndefined() or current.low.value.size() < 8)) or ((not current.center.oclIsUndefined()) and (current.center.value.oclIsUndefined() or current.center.value.size() < 8)) or ((not current.high.oclIsUndefined()) and (current.high.value.oclIsUndefined() or current.high.value.size() < 8)) or (current.low.oclIsUndefined() and current.center.oclIsUndefined() and current.high.oclIsUndefined()) ).oclAsType( ecore::EObject))
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsTimePreciseToYearAndDay(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_YEAR_AND_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_YEAR_AND_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_YEAR_AND_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_YEAR_AND_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_YEAR_AND_DAY,
						 ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsTimePreciseToYearAndDay"),
						 new Object [] { generalHeaderConstraints }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTemplateId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.3')";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTemplateId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.3')
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsTemplateId(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsTemplateId"),
						 new Object [] { generalHeaderConstraints }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRealmCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Realm Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRealmCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.realmCode->isEmpty() or self.realmCode->exists(element | element.isNullFlavorUndefined())) implies (self.realmCode->size() = 1 and self.realmCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = element.oclAsType(datatypes::CS) in "+
"value.code = 'US'))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRealmCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Realm Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRealmCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.realmCode->isEmpty() or self.realmCode->exists(element | element.isNullFlavorUndefined())) implies (self.realmCode->size() = 1 and self.realmCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = element.oclAsType(datatypes::CS) in 
	 * value.code = 'US'))
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsRealmCode(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_REALM_CODE,
						 ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsRealmCode"),
						 new Object [] { generalHeaderConstraints }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTypeId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Type Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTypeId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.typeId.oclIsUndefined() or self.typeId.isNullFlavorUndefined()) implies (not self.typeId.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTypeId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Type Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTypeId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.typeId.oclIsUndefined() or self.typeId.isNullFlavorUndefined()) implies (not self.typeId.oclIsUndefined())
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsTypeId(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_TYPE_ID,
						 ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsTypeId"),
						 new Object [] { generalHeaderConstraints }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id.oclIsUndefined() or self.id.isNullFlavorUndefined()) implies (not self.id.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id.oclIsUndefined() or self.id.isNullFlavorUndefined()) implies (not self.id.oclIsUndefined())
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsId(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_ID,
						 ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsId"),
						 new Object [] { generalHeaderConstraints }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsCode(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_CODE,
						 ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsCode"),
						 new Object [] { generalHeaderConstraints }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTitle(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTitle(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTitle(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTitle(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsTitle(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_TITLE,
						 ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsTitle"),
						 new Object [] { generalHeaderConstraints }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsEffectiveTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsEffectiveTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsEffectiveTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsEffectiveTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsEffectiveTime(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_EFFECTIVE_TIME,
						 ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsEffectiveTime"),
						 new Object [] { generalHeaderConstraints }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsLanguageCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Language Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsLanguageCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.languageCode.oclIsUndefined() or self.languageCode.isNullFlavorUndefined()) implies (not self.languageCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsLanguageCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Language Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsLanguageCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.languageCode.oclIsUndefined() or self.languageCode.isNullFlavorUndefined()) implies (not self.languageCode.oclIsUndefined())
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsLanguageCode(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_LANGUAGE_CODE,
						 ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsLanguageCode"),
						 new Object [] { generalHeaderConstraints }));
			}
			return false;
		}
		return true;
	}

} // GeneralHeaderConstraintsOperations