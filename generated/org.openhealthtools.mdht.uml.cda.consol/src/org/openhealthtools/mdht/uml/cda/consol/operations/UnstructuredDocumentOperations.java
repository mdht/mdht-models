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
import org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalDocumentOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Unstructured Document</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentPersonHasName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Person Has Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentRolesShallHaveAddrAndTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Roles Shall Have Addr And Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentRolesShouldHaveAddrAndTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Roles Should Have Addr And Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentOrganizationsHaveContactInfo(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Organizations Have Contact Info</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentTimePreciseToDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Time Precise To Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentTimePreciseToYear(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Time Precise To Year</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentTelephoneMatchesRegex(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Telephone Matches Regex</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentHasTelephoneDialingDigits(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Telephone Dialing Digits</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentUnknownTelephoneUsesNullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Unknown Telephone Uses Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentTypeIdExtension(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Type Id Extension</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentIdRootFormat(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Id Root Format</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentOidLength(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Oid Length</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentLanguageCodeForm(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Language Code Form</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentSetIdAndVersionNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Set Id And Version Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentSetIdAndIdAreUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Set Id And Id Are Unique</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentCopyTimeNotPresent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Copy Time Not Present</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentHasRecordTargetPatientRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Record Target Patient Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentHasPatientBirthTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Patient Birth Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentHasAdministrativeGenderCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Administrative Gender Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentHasProviderOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Provider Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentHasAuthorTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Author Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentHasAssignedAuthorId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Assigned Author Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentHasAssignedAuthorPersonOrDevice(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Assigned Author Person Or Device</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentHasDataEntererAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Data Enterer Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentHasDataEntererTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Data Enterer Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentHasInformant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Informant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentHasInformantAssignedPersonOrRelatedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Informant Assigned Person Or Related Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentLegalAuthenticatorHasAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Legal Authenticator Has Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentAuthenticatorHasAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Authenticator Has Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentTimePreciseToSecond(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Time Precise To Second</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentTimePreciseToYearAndDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Time Precise To Year And Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentTypeIdFixed(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Type Id Fixed</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentHasOneRecordTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has One Record Target</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentHasAssignedAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Assigned Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentPatientRoleId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Patient Role Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentHasPatientRoleAddress(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Patient Role Address</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentHasPatientName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Patient Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentHasPatientGenderCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Patient Gender Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentHasPatientBirthYear(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Patient Birth Year</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentHasOriginalAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Original Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentHasScanningDevice(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Scanning Device</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentHasScanDataEnterer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Scan Data Enterer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentHasRepresentedCustodianOrganizationName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Represented Custodian Organization Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentHasRepresentedCustodianOrganizationAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Represented Custodian Organization Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentLegalAuthenticatorAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Legal Authenticator Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentHasNonXMLBody(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Non XML Body</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentHasNonXMLBodyBinaryText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Non XML Body Binary Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentHasNonXMLBodyTextMediaType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Non XML Body Text Media Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentHasNonXMLBodyTextRepresentation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Non XML Body Text Representation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentNoStructuredData(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document No Structured Data</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentOnePatientPerDocument(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document One Patient Per Document</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentTypeId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentConfidentialityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Confidentiality Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentLanguageCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Language Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnstructuredDocumentOperations extends ClinicalDocumentOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnstructuredDocumentOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentPersonHasName(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Person Has Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentPersonHasName(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_PERSON_HAS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentPersonHasName(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Person Has Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentPersonHasName(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_PERSON_HAS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentPersonHasName(UnstructuredDocument unstructuredDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_PERSON_HAS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_PERSON_HAS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_PERSON_HAS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_DOCUMENT_PERSON_HAS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_PERSON_HAS_NAME,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocumentPersonHasName"),
					new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentRolesShallHaveAddrAndTelecom(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Roles Shall Have Addr And Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentRolesShallHaveAddrAndTelecom(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_ROLES_SHALL_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentRolesShallHaveAddrAndTelecom(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Roles Shall Have Addr And Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentRolesShallHaveAddrAndTelecom(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_ROLES_SHALL_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentRolesShallHaveAddrAndTelecom(
			UnstructuredDocument unstructuredDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_ROLES_SHALL_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_ROLES_SHALL_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_ROLES_SHALL_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_DOCUMENT_ROLES_SHALL_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_ROLES_SHALL_HAVE_ADDR_AND_TELECOM,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocumentRolesShallHaveAddrAndTelecom"),
					new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentRolesShouldHaveAddrAndTelecom(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Roles Should Have Addr And Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentRolesShouldHaveAddrAndTelecom(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_ROLES_SHOULD_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentRolesShouldHaveAddrAndTelecom(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Roles Should Have Addr And Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentRolesShouldHaveAddrAndTelecom(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_ROLES_SHOULD_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentRolesShouldHaveAddrAndTelecom(
			UnstructuredDocument unstructuredDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_ROLES_SHOULD_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_ROLES_SHOULD_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_ROLES_SHOULD_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_DOCUMENT_ROLES_SHOULD_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_ROLES_SHOULD_HAVE_ADDR_AND_TELECOM,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocumentRolesShouldHaveAddrAndTelecom"),
					new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentOrganizationsHaveContactInfo(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Organizations Have Contact Info</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentOrganizationsHaveContactInfo(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_ORGANIZATIONS_HAVE_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentOrganizationsHaveContactInfo(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Organizations Have Contact Info</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentOrganizationsHaveContactInfo(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_ORGANIZATIONS_HAVE_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentOrganizationsHaveContactInfo(
			UnstructuredDocument unstructuredDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_ORGANIZATIONS_HAVE_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_ORGANIZATIONS_HAVE_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_ORGANIZATIONS_HAVE_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_DOCUMENT_ORGANIZATIONS_HAVE_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_ORGANIZATIONS_HAVE_CONTACT_INFO,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocumentOrganizationsHaveContactInfo"),
					new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentTimePreciseToDay(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Time Precise To Day</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentTimePreciseToDay(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentTimePreciseToDay(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Time Precise To Day</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentTimePreciseToDay(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentTimePreciseToDay(UnstructuredDocument unstructuredDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_DOCUMENT_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_TIME_PRECISE_TO_DAY,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocumentTimePreciseToDay"),
					new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentTimePreciseToYear(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Time Precise To Year</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentTimePreciseToYear(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "cda::OrganizationPartOf.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject)-> union(  cda::MaintainedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union( cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::ServiceEvent.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::EncounterParticipant.allInstances()->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(self.participant->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(cda::OrganizationPartOf.allInstances().effectiveTime->union(cda::MaintainedEntity.allInstances().effectiveTime)->union( cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::ServiceEvent.allInstances().effectiveTime)->union(cda::EncounterParticipant.allInstances().time)->union(self.participant.time)->select(current : datatypes::IVL_TS  |  ((not current.low.oclIsUndefined()) and (current.low.value.oclIsUndefined() or current.low.value.size() < 4)) or ((not current.center.oclIsUndefined()) and (current.center.value.oclIsUndefined() or current.center.value.size() < 4)) or ((not current.high.oclIsUndefined()) and (current.high.value.oclIsUndefined() or current.high.value.size() < 4)) or (current.low.oclIsUndefined() and current.center.oclIsUndefined() and current.high.oclIsUndefined()) ).oclAsType( ecore::EObject))";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentTimePreciseToYear(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Time Precise To Year</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentTimePreciseToYear(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::OrganizationPartOf.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject)-> union(  cda::MaintainedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union( cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::ServiceEvent.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::EncounterParticipant.allInstances()->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(self.participant->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(cda::OrganizationPartOf.allInstances().effectiveTime->union(cda::MaintainedEntity.allInstances().effectiveTime)->union( cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::ServiceEvent.allInstances().effectiveTime)->union(cda::EncounterParticipant.allInstances().time)->union(self.participant.time)->select(current : datatypes::IVL_TS  |  ((not current.low.oclIsUndefined()) and (current.low.value.oclIsUndefined() or current.low.value.size() < 4)) or ((not current.center.oclIsUndefined()) and (current.center.value.oclIsUndefined() or current.center.value.size() < 4)) or ((not current.high.oclIsUndefined()) and (current.high.value.oclIsUndefined() or current.high.value.size() < 4)) or (current.low.oclIsUndefined() and current.center.oclIsUndefined() and current.high.oclIsUndefined()) ).oclAsType( ecore::EObject))
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentTimePreciseToYear(UnstructuredDocument unstructuredDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_DOCUMENT_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_TIME_PRECISE_TO_YEAR,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocumentTimePreciseToYear"),
					new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentTelephoneMatchesRegex(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Telephone Matches Regex</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentTelephoneMatchesRegex(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_TELEPHONE_MATCHES_REGEX__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentTelephoneMatchesRegex(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Telephone Matches Regex</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentTelephoneMatchesRegex(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_TELEPHONE_MATCHES_REGEX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentTelephoneMatchesRegex(UnstructuredDocument unstructuredDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_TELEPHONE_MATCHES_REGEX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_TELEPHONE_MATCHES_REGEX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_TELEPHONE_MATCHES_REGEX__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_DOCUMENT_TELEPHONE_MATCHES_REGEX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_TELEPHONE_MATCHES_REGEX,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocumentTelephoneMatchesRegex"),
					new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentHasTelephoneDialingDigits(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Telephone Dialing Digits</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasTelephoneDialingDigits(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_TELEPHONE_DIALING_DIGITS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentHasTelephoneDialingDigits(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Telephone Dialing Digits</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasTelephoneDialingDigits(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_TELEPHONE_DIALING_DIGITS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentHasTelephoneDialingDigits(
			UnstructuredDocument unstructuredDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_TELEPHONE_DIALING_DIGITS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_TELEPHONE_DIALING_DIGITS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_TELEPHONE_DIALING_DIGITS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_TELEPHONE_DIALING_DIGITS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_HAS_TELEPHONE_DIALING_DIGITS,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocumentHasTelephoneDialingDigits"),
					new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentUnknownTelephoneUsesNullFlavor(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Unknown Telephone Uses Null Flavor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentUnknownTelephoneUsesNullFlavor(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_UNKNOWN_TELEPHONE_USES_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentUnknownTelephoneUsesNullFlavor(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Unknown Telephone Uses Null Flavor</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentUnknownTelephoneUsesNullFlavor(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_UNKNOWN_TELEPHONE_USES_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentUnknownTelephoneUsesNullFlavor(
			UnstructuredDocument unstructuredDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_UNKNOWN_TELEPHONE_USES_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_UNKNOWN_TELEPHONE_USES_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_UNKNOWN_TELEPHONE_USES_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_DOCUMENT_UNKNOWN_TELEPHONE_USES_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_UNKNOWN_TELEPHONE_USES_NULL_FLAVOR,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocumentUnknownTelephoneUsesNullFlavor"),
					new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentTypeIdExtension(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Type Id Extension</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentTypeIdExtension(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.typeId.extension = 'POCD_HD000040'";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentTypeIdExtension(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Type Id Extension</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentTypeIdExtension(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.typeId.extension = 'POCD_HD000040'
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentTypeIdExtension(UnstructuredDocument unstructuredDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_DOCUMENT_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_TYPE_ID_EXTENSION,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocumentTypeIdExtension"),
					new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentIdRootFormat(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Id Root Format</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentIdRootFormat(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_ID_ROOT_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.id.matches('root','([0-2])(.([1-9][0-9]*|0))+') or self.id.matches('root','([A-Fa-f0-9]{8})(\\\\-[A-Fa-f0-9]{4}){3}(\\\\-[A-Fa-f0-9]{12})')";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentIdRootFormat(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Id Root Format</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentIdRootFormat(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_ID_ROOT_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.id.matches('root','([0-2])(.([1-9][0-9]*|0))+') or self.id.matches('root','([A-Fa-f0-9]{8})(\\\\-[A-Fa-f0-9]{4}){3}(\\\\-[A-Fa-f0-9]{12})')
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentIdRootFormat(UnstructuredDocument unstructuredDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_ID_ROOT_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_ID_ROOT_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_ID_ROOT_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_DOCUMENT_ID_ROOT_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_ID_ROOT_FORMAT,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocumentIdRootFormat"),
					new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentOidLength(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Oid Length</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentOidLength(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_OID_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.id->select((not id.root.oclIsUndefined()) and id.root.size() > 64 )";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentOidLength(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Oid Length</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentOidLength(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_OID_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.id->select((not id.root.oclIsUndefined()) and id.root.size() > 64 )
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentOidLength(UnstructuredDocument unstructuredDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_OID_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_OID_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_OID_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_DOCUMENT_OID_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_OID_LENGTH,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocumentOidLength"),
					new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentLanguageCodeForm(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Language Code Form</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentLanguageCodeForm(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_LANGUAGE_CODE_FORM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.languageCode.matches('code','(([a-z]{2})(\\\\-[A-Z]{2})?)')";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentLanguageCodeForm(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Language Code Form</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentLanguageCodeForm(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_LANGUAGE_CODE_FORM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.languageCode.matches('code','(([a-z]{2})(\\\\-[A-Z]{2})?)')
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentLanguageCodeForm(UnstructuredDocument unstructuredDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_LANGUAGE_CODE_FORM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_LANGUAGE_CODE_FORM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_LANGUAGE_CODE_FORM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_DOCUMENT_LANGUAGE_CODE_FORM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_LANGUAGE_CODE_FORM,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocumentLanguageCodeForm"),
					new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentSetIdAndVersionNumber(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Set Id And Version Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentSetIdAndVersionNumber(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_SET_ID_AND_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.setId.oclIsUndefined() and self.versionNumber.oclIsUndefined())"
			+ "   xor (not self.setId.oclIsUndefined() and not self.versionNumber.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentSetIdAndVersionNumber(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Set Id And Version Number</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentSetIdAndVersionNumber(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_SET_ID_AND_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.setId.oclIsUndefined() and self.versionNumber.oclIsUndefined())
	 *    xor (not self.setId.oclIsUndefined() and not self.versionNumber.oclIsUndefined())
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentSetIdAndVersionNumber(UnstructuredDocument unstructuredDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_SET_ID_AND_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_SET_ID_AND_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_SET_ID_AND_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_DOCUMENT_SET_ID_AND_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_SET_ID_AND_VERSION_NUMBER,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocumentSetIdAndVersionNumber"),
					new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentSetIdAndIdAreUnique(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Set Id And Id Are Unique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentSetIdAndIdAreUnique(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_SET_ID_AND_ID_ARE_UNIQUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(not self.setId.oclIsUndefined() and not self.id.oclIsUndefined())"
			+ "   implies (self.setId.root <> self.id.root or self.setId.extension <> self.id.extension)";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentSetIdAndIdAreUnique(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Set Id And Id Are Unique</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentSetIdAndIdAreUnique(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_SET_ID_AND_ID_ARE_UNIQUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (not self.setId.oclIsUndefined() and not self.id.oclIsUndefined())
	 *    implies (self.setId.root <> self.id.root or self.setId.extension <> self.id.extension)
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentSetIdAndIdAreUnique(UnstructuredDocument unstructuredDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_SET_ID_AND_ID_ARE_UNIQUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_SET_ID_AND_ID_ARE_UNIQUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_SET_ID_AND_ID_ARE_UNIQUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_DOCUMENT_SET_ID_AND_ID_ARE_UNIQUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_SET_ID_AND_ID_ARE_UNIQUE,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocumentSetIdAndIdAreUnique"),
					new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentCopyTimeNotPresent(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Copy Time Not Present</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentCopyTimeNotPresent(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_COPY_TIME_NOT_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.copyTime.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentCopyTimeNotPresent(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Copy Time Not Present</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentCopyTimeNotPresent(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_COPY_TIME_NOT_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.copyTime.oclIsUndefined()
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentCopyTimeNotPresent(UnstructuredDocument unstructuredDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_COPY_TIME_NOT_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_COPY_TIME_NOT_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_COPY_TIME_NOT_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_DOCUMENT_COPY_TIME_NOT_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_COPY_TIME_NOT_PRESENT,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocumentCopyTimeNotPresent"),
					new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentHasRecordTargetPatientRole(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Record Target Patient Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasRecordTargetPatientRole(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->size() > 0 and self.recordTarget->exists(target : cda::RecordTarget | not target.patientRole.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentHasRecordTargetPatientRole(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Record Target Patient Role</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasRecordTargetPatientRole(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->size() > 0 and self.recordTarget->exists(target : cda::RecordTarget | not target.patientRole.oclIsUndefined())
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentHasRecordTargetPatientRole(
			UnstructuredDocument unstructuredDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_HAS_RECORD_TARGET_PATIENT_ROLE,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocumentHasRecordTargetPatientRole"),
					new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentHasPatientBirthTime(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Patient Birth Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasPatientBirthTime(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->forAll(target : cda::RecordTarget | not target.patientRole.oclIsUndefined()"
			+ "   implies (not target.patientRole.patient.birthTime.value.oclIsUndefined()"
			+ "      or not target.patientRole.patient.birthTime.nullFlavor.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentHasPatientBirthTime(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Patient Birth Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasPatientBirthTime(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->forAll(target : cda::RecordTarget | not target.patientRole.oclIsUndefined()
	 *    implies (not target.patientRole.patient.birthTime.value.oclIsUndefined()
	 *       or not target.patientRole.patient.birthTime.nullFlavor.oclIsUndefined()))
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentHasPatientBirthTime(UnstructuredDocument unstructuredDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_HAS_PATIENT_BIRTH_TIME,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocumentHasPatientBirthTime"),
					new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentHasAdministrativeGenderCode(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Administrative Gender Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasAdministrativeGenderCode(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->forAll(target : cda::RecordTarget | not target.patientRole.oclIsUndefined()"
			+ "   implies (not target.patientRole.patient.administrativeGenderCode.code.oclIsUndefined()"
			+ "      or not target.patientRole.patient.administrativeGenderCode.nullFlavor.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentHasAdministrativeGenderCode(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Administrative Gender Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasAdministrativeGenderCode(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->forAll(target : cda::RecordTarget | not target.patientRole.oclIsUndefined()
	 *    implies (not target.patientRole.patient.administrativeGenderCode.code.oclIsUndefined()
	 *       or not target.patientRole.patient.administrativeGenderCode.nullFlavor.oclIsUndefined()))
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentHasAdministrativeGenderCode(
			UnstructuredDocument unstructuredDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_HAS_ADMINISTRATIVE_GENDER_CODE,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocumentHasAdministrativeGenderCode"),
					new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentHasProviderOrganization(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Provider Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasProviderOrganization(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->exists(target : cda::RecordTarget | not target.patientRole.providerOrganization.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentHasProviderOrganization(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Provider Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasProviderOrganization(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->exists(target : cda::RecordTarget | not target.patientRole.providerOrganization.oclIsUndefined())
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentHasProviderOrganization(
			UnstructuredDocument unstructuredDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_HAS_PROVIDER_ORGANIZATION,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocumentHasProviderOrganization"),
					new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentHasAuthorTime(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Author Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasAuthorTime(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->forAll(author : cda::Author | not author.time.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentHasAuthorTime(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Author Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasAuthorTime(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.author->forAll(author : cda::Author | not author.time.oclIsUndefined())
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentHasAuthorTime(UnstructuredDocument unstructuredDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_HAS_AUTHOR_TIME,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocumentHasAuthorTime"),
					new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentHasAssignedAuthorId(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Assigned Author Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasAssignedAuthorId(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->forAll(author : cda::Author | author.assignedAuthor.id->size() > 0)";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentHasAssignedAuthorId(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Assigned Author Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasAssignedAuthorId(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.author->forAll(author : cda::Author | author.assignedAuthor.id->size() > 0)
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentHasAssignedAuthorId(UnstructuredDocument unstructuredDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_HAS_ASSIGNED_AUTHOR_ID,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocumentHasAssignedAuthorId"),
					new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentHasAssignedAuthorPersonOrDevice(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Assigned Author Person Or Device</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasAssignedAuthorPersonOrDevice(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->forAll(author : cda::Author | not author.assignedAuthor.assignedPerson.oclIsUndefined() "
			+ "   or not author.assignedAuthor.assignedAuthoringDevice.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentHasAssignedAuthorPersonOrDevice(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Assigned Author Person Or Device</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasAssignedAuthorPersonOrDevice(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.author->forAll(author : cda::Author | not author.assignedAuthor.assignedPerson.oclIsUndefined() 
	 *    or not author.assignedAuthor.assignedAuthoringDevice.oclIsUndefined())
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentHasAssignedAuthorPersonOrDevice(
			UnstructuredDocument unstructuredDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocumentHasAssignedAuthorPersonOrDevice"),
					new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentHasDataEntererAssignedPerson(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Data Enterer Assigned Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasDataEntererAssignedPerson(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_DATA_ENTERER_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.dataEnterer.oclIsUndefined() implies not self.dataEnterer.assignedEntity.assignedPerson.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentHasDataEntererAssignedPerson(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Data Enterer Assigned Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasDataEntererAssignedPerson(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_DATA_ENTERER_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.dataEnterer.oclIsUndefined() implies not self.dataEnterer.assignedEntity.assignedPerson.oclIsUndefined()
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentHasDataEntererAssignedPerson(
			UnstructuredDocument unstructuredDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_DATA_ENTERER_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_DATA_ENTERER_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_DATA_ENTERER_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_DATA_ENTERER_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_HAS_DATA_ENTERER_ASSIGNED_PERSON,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocumentHasDataEntererAssignedPerson"),
					new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentHasDataEntererTime(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Data Enterer Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasDataEntererTime(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_DATA_ENTERER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.dataEnterer.oclIsUndefined() implies not self.dataEnterer.time.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentHasDataEntererTime(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Data Enterer Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasDataEntererTime(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_DATA_ENTERER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.dataEnterer.oclIsUndefined() implies not self.dataEnterer.time.oclIsUndefined()
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentHasDataEntererTime(UnstructuredDocument unstructuredDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_DATA_ENTERER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_DATA_ENTERER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_DATA_ENTERER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_DATA_ENTERER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_HAS_DATA_ENTERER_TIME,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocumentHasDataEntererTime"),
					new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentHasInformant(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Informant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasInformant(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->size() > 0";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentHasInformant(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Informant</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasInformant(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.informant->size() > 0
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentHasInformant(UnstructuredDocument unstructuredDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_HAS_INFORMANT,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocumentHasInformant"),
					new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentHasInformantAssignedPersonOrRelatedPerson(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Informant Assigned Person Or Related Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasInformantAssignedPersonOrRelatedPerson(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->forAll(i : cda::Informant12 | not i.assignedEntity.assignedPerson.oclIsUndefined()"
			+ "   or not i.relatedEntity.relatedPerson.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentHasInformantAssignedPersonOrRelatedPerson(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Informant Assigned Person Or Related Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasInformantAssignedPersonOrRelatedPerson(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.informant->forAll(i : cda::Informant12 | not i.assignedEntity.assignedPerson.oclIsUndefined()
	 *    or not i.relatedEntity.relatedPerson.oclIsUndefined())
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentHasInformantAssignedPersonOrRelatedPerson(
			UnstructuredDocument unstructuredDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocumentHasInformantAssignedPersonOrRelatedPerson"),
					new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentLegalAuthenticatorHasAssignedPerson(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Legal Authenticator Has Assigned Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentLegalAuthenticatorHasAssignedPerson(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.legalAuthenticator.oclIsUndefined() implies not self.legalAuthenticator.assignedEntity.assignedPerson.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentLegalAuthenticatorHasAssignedPerson(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Legal Authenticator Has Assigned Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentLegalAuthenticatorHasAssignedPerson(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.legalAuthenticator.oclIsUndefined() implies not self.legalAuthenticator.assignedEntity.assignedPerson.oclIsUndefined()
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentLegalAuthenticatorHasAssignedPerson(
			UnstructuredDocument unstructuredDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_DOCUMENT_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocumentLegalAuthenticatorHasAssignedPerson"),
					new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentAuthenticatorHasAssignedPerson(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Authenticator Has Assigned Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentAuthenticatorHasAssignedPerson(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authenticator->forAll(auth : cda::Authenticator | auth.assignedEntity->forAll(entity : cda::AssignedEntity |"
			+ "   not entity.assignedPerson.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentAuthenticatorHasAssignedPerson(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Authenticator Has Assigned Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentAuthenticatorHasAssignedPerson(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.authenticator->forAll(auth : cda::Authenticator | auth.assignedEntity->forAll(entity : cda::AssignedEntity |
	 *    not entity.assignedPerson.oclIsUndefined()))
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentAuthenticatorHasAssignedPerson(
			UnstructuredDocument unstructuredDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_DOCUMENT_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_AUTHENTICATOR_HAS_ASSIGNED_PERSON,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocumentAuthenticatorHasAssignedPerson"),
					new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentTimePreciseToSecond(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Time Precise To Second</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentTimePreciseToSecond(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_TIME_PRECISE_TO_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentTimePreciseToSecond(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Time Precise To Second</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentTimePreciseToSecond(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_TIME_PRECISE_TO_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentTimePreciseToSecond(UnstructuredDocument unstructuredDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_TIME_PRECISE_TO_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_TIME_PRECISE_TO_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_TIME_PRECISE_TO_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_DOCUMENT_TIME_PRECISE_TO_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_TIME_PRECISE_TO_SECOND,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocumentTimePreciseToSecond"),
					new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentTimePreciseToYearAndDay(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Time Precise To Year And Day</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentTimePreciseToYearAndDay(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_TIME_PRECISE_TO_YEAR_AND_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "cda::OrganizationPartOf.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject)-> union(  cda::MaintainedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union( cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::ServiceEvent.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::EncounterParticipant.allInstances()->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(self.participant->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(cda::OrganizationPartOf.allInstances().effectiveTime->union(cda::MaintainedEntity.allInstances().effectiveTime)->union( cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::ServiceEvent.allInstances().effectiveTime)->union(cda::EncounterParticipant.allInstances().time)->union(self.participant.time)->select(current : datatypes::IVL_TS  |  ((not current.low.oclIsUndefined()) and (current.low.value.oclIsUndefined() or current.low.value.size() < 8)) or ((not current.center.oclIsUndefined()) and (current.center.value.oclIsUndefined() or current.center.value.size() < 8)) or ((not current.high.oclIsUndefined()) and (current.high.value.oclIsUndefined() or current.high.value.size() < 8)) or (current.low.oclIsUndefined() and current.center.oclIsUndefined() and current.high.oclIsUndefined()) ).oclAsType( ecore::EObject))";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentTimePreciseToYearAndDay(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Time Precise To Year And Day</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentTimePreciseToYearAndDay(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_TIME_PRECISE_TO_YEAR_AND_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::OrganizationPartOf.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject)-> union(  cda::MaintainedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union( cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::ServiceEvent.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::EncounterParticipant.allInstances()->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(self.participant->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(cda::OrganizationPartOf.allInstances().effectiveTime->union(cda::MaintainedEntity.allInstances().effectiveTime)->union( cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::ServiceEvent.allInstances().effectiveTime)->union(cda::EncounterParticipant.allInstances().time)->union(self.participant.time)->select(current : datatypes::IVL_TS  |  ((not current.low.oclIsUndefined()) and (current.low.value.oclIsUndefined() or current.low.value.size() < 8)) or ((not current.center.oclIsUndefined()) and (current.center.value.oclIsUndefined() or current.center.value.size() < 8)) or ((not current.high.oclIsUndefined()) and (current.high.value.oclIsUndefined() or current.high.value.size() < 8)) or (current.low.oclIsUndefined() and current.center.oclIsUndefined() and current.high.oclIsUndefined()) ).oclAsType( ecore::EObject))
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentTimePreciseToYearAndDay(
			UnstructuredDocument unstructuredDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_TIME_PRECISE_TO_YEAR_AND_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_TIME_PRECISE_TO_YEAR_AND_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_TIME_PRECISE_TO_YEAR_AND_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_DOCUMENT_TIME_PRECISE_TO_YEAR_AND_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_TIME_PRECISE_TO_YEAR_AND_DAY,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocumentTimePreciseToYearAndDay"),
					new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentTypeIdFixed(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Type Id Fixed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentTypeIdFixed(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_TYPE_ID_FIXED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.typeId.root = '2.16.840.1.113883.1.3' and self.typeId.extension = 'POCD_HD000040'";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentTypeIdFixed(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Type Id Fixed</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentTypeIdFixed(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_TYPE_ID_FIXED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.typeId.root = '2.16.840.1.113883.1.3' and self.typeId.extension = 'POCD_HD000040'
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentTypeIdFixed(UnstructuredDocument unstructuredDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_TYPE_ID_FIXED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_TYPE_ID_FIXED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_TYPE_ID_FIXED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_DOCUMENT_TYPE_ID_FIXED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_TYPE_ID_FIXED,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocumentTypeIdFixed"),
					new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentHasOneRecordTarget(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has One Record Target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasOneRecordTarget(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_ONE_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentHasOneRecordTarget(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has One Record Target</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasOneRecordTarget(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_ONE_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->size() = 1
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentHasOneRecordTarget(UnstructuredDocument unstructuredDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_ONE_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_ONE_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_ONE_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_ONE_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_HAS_ONE_RECORD_TARGET,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocumentHasOneRecordTarget"),
					new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentHasAssignedAuthor(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Assigned Author</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasAssignedAuthor(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.assignedAuthor.assignedPerson.oclIsUndefined() "
			+ "   or not author.assignedAuthor.representedOrganization.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentHasAssignedAuthor(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Assigned Author</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasAssignedAuthor(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.author->exists(author : cda::Author | not author.assignedAuthor.assignedPerson.oclIsUndefined() 
	 *    or not author.assignedAuthor.representedOrganization.oclIsUndefined())
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentHasAssignedAuthor(UnstructuredDocument unstructuredDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_HAS_ASSIGNED_AUTHOR,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocumentHasAssignedAuthor"),
					new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentPatientRoleId(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Patient Role Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentPatientRoleId(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->forAll(target : cda::RecordTarget | not target.patientRole.oclIsUndefined()"
			+ "   and target.patientRole.id->forAll(roleId : datatypes::II | not roleId.root.oclIsUndefined()"
			+ "   and not roleId.extension.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentPatientRoleId(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Patient Role Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentPatientRoleId(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->forAll(target : cda::RecordTarget | not target.patientRole.oclIsUndefined()
	 *    and target.patientRole.id->forAll(roleId : datatypes::II | not roleId.root.oclIsUndefined()
	 *    and not roleId.extension.oclIsUndefined()))
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentPatientRoleId(UnstructuredDocument unstructuredDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_DOCUMENT_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_PATIENT_ROLE_ID,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocumentPatientRoleId"),
					new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentHasPatientRoleAddress(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Patient Role Address</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasPatientRoleAddress(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_PATIENT_ROLE_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->exists(target : cda::RecordTarget | not target.patientRole.oclIsUndefined()"
			+ "   and target.patientRole.addr->exists(address : datatypes::AD | address.country->exists(c : datatypes::ADXP |"
			+ "   not c.oclIsUndefined() and c.getText().size() > 0)))";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentHasPatientRoleAddress(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Patient Role Address</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasPatientRoleAddress(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_PATIENT_ROLE_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->exists(target : cda::RecordTarget | not target.patientRole.oclIsUndefined()
	 *    and target.patientRole.addr->exists(address : datatypes::AD | address.country->exists(c : datatypes::ADXP |
	 *    not c.oclIsUndefined() and c.getText().size() > 0)))
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentHasPatientRoleAddress(UnstructuredDocument unstructuredDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_PATIENT_ROLE_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_PATIENT_ROLE_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_PATIENT_ROLE_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_PATIENT_ROLE_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_HAS_PATIENT_ROLE_ADDRESS,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocumentHasPatientRoleAddress"),
					new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentHasPatientName(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Patient Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasPatientName(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_PATIENT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->exists(target : cda::RecordTarget | not target.patientRole.patient.oclIsUndefined()"
			+ "   and target.patientRole.patient.name->exists(name: datatypes::PN |"
			+ "      not name.given->isEmpty() and not name.family->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentHasPatientName(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Patient Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasPatientName(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_PATIENT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->exists(target : cda::RecordTarget | not target.patientRole.patient.oclIsUndefined()
	 *    and target.patientRole.patient.name->exists(name: datatypes::PN |
	 *       not name.given->isEmpty() and not name.family->isEmpty()))
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentHasPatientName(UnstructuredDocument unstructuredDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_PATIENT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_PATIENT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_PATIENT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_PATIENT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_HAS_PATIENT_NAME,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocumentHasPatientName"),
					new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentHasPatientGenderCode(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Patient Gender Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasPatientGenderCode(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_PATIENT_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->one(target : cda::RecordTarget |"
			+ "   not target.patientRole.patient.administrativeGenderCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentHasPatientGenderCode(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Patient Gender Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasPatientGenderCode(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_PATIENT_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->one(target : cda::RecordTarget |
	 *    not target.patientRole.patient.administrativeGenderCode.oclIsUndefined())
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentHasPatientGenderCode(UnstructuredDocument unstructuredDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_PATIENT_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_PATIENT_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_PATIENT_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_PATIENT_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_HAS_PATIENT_GENDER_CODE,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocumentHasPatientGenderCode"),
					new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentHasPatientBirthYear(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Patient Birth Year</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasPatientBirthYear(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_PATIENT_BIRTH_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->one(target : cda::RecordTarget |"
			+ "   not target.patientRole.patient.birthTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentHasPatientBirthYear(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Patient Birth Year</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasPatientBirthYear(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_PATIENT_BIRTH_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->one(target : cda::RecordTarget |
	 *    not target.patientRole.patient.birthTime.oclIsUndefined())
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentHasPatientBirthYear(UnstructuredDocument unstructuredDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_PATIENT_BIRTH_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_PATIENT_BIRTH_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_PATIENT_BIRTH_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_PATIENT_BIRTH_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_HAS_PATIENT_BIRTH_YEAR,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocumentHasPatientBirthYear"),
					new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentHasOriginalAuthor(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Original Author</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasOriginalAuthor(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_ORIGINAL_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(ihe::ScanOriginalAuthor))";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentHasOriginalAuthor(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Original Author</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasOriginalAuthor(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_ORIGINAL_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(ihe::ScanOriginalAuthor))
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentHasOriginalAuthor(UnstructuredDocument unstructuredDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_ORIGINAL_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_ORIGINAL_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_ORIGINAL_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_ORIGINAL_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_HAS_ORIGINAL_AUTHOR,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocumentHasOriginalAuthor"),
					new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentHasScanningDevice(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Scanning Device</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasScanningDevice(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_SCANNING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(ihe::ScanningDevice))";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentHasScanningDevice(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Scanning Device</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasScanningDevice(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_SCANNING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(ihe::ScanningDevice))
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentHasScanningDevice(UnstructuredDocument unstructuredDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_SCANNING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_SCANNING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_SCANNING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_SCANNING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_HAS_SCANNING_DEVICE,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocumentHasScanningDevice"),
					new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentHasScanDataEnterer(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Scan Data Enterer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasScanDataEnterer(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_SCAN_DATA_ENTERER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.dataEnterer.oclIsUndefined() and self.dataEnterer.oclIsKindOf(ihe::ScanDataEnterer)";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentHasScanDataEnterer(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Scan Data Enterer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasScanDataEnterer(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_SCAN_DATA_ENTERER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.dataEnterer.oclIsUndefined() and self.dataEnterer.oclIsKindOf(ihe::ScanDataEnterer)
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentHasScanDataEnterer(UnstructuredDocument unstructuredDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_SCAN_DATA_ENTERER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_SCAN_DATA_ENTERER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_SCAN_DATA_ENTERER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_SCAN_DATA_ENTERER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_HAS_SCAN_DATA_ENTERER,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocumentHasScanDataEnterer"),
					new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentHasRepresentedCustodianOrganizationName(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Represented Custodian Organization Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasRepresentedCustodianOrganizationName(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.custodian.assignedCustodian.representedCustodianOrganization.name.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentHasRepresentedCustodianOrganizationName(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Represented Custodian Organization Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasRepresentedCustodianOrganizationName(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.custodian.assignedCustodian.representedCustodianOrganization.name.oclIsUndefined()
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentHasRepresentedCustodianOrganizationName(
			UnstructuredDocument unstructuredDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_NAME,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocumentHasRepresentedCustodianOrganizationName"),
					new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentHasRepresentedCustodianOrganizationAddr(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Represented Custodian Organization Addr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasRepresentedCustodianOrganizationAddr(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.custodian.assignedCustodian.representedCustodianOrganization.addr.oclIsUndefined()"
			+ "   and self.custodian.assignedCustodian.representedCustodianOrganization.addr.country->exists(c : datatypes::ADXP |"
			+ "      not c.oclIsUndefined() and c.getText().size() > 0)";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentHasRepresentedCustodianOrganizationAddr(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Represented Custodian Organization Addr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasRepresentedCustodianOrganizationAddr(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.custodian.assignedCustodian.representedCustodianOrganization.addr.oclIsUndefined()
	 *    and self.custodian.assignedCustodian.representedCustodianOrganization.addr.country->exists(c : datatypes::ADXP |
	 *       not c.oclIsUndefined() and c.getText().size() > 0)
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentHasRepresentedCustodianOrganizationAddr(
			UnstructuredDocument unstructuredDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_ADDR,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocumentHasRepresentedCustodianOrganizationAddr"),
					new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentLegalAuthenticatorAssignedEntityId(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Legal Authenticator Assigned Entity Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentLegalAuthenticatorAssignedEntityId(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.legalAuthenticator.assignedEntity.id->size() > 0 implies ("
			+ "   self.legalAuthenticator.assignedEntity.id->forAll(ident : datatypes::II |"
			+ "      not ident.root.oclIsUndefined() and not ident.extension.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentLegalAuthenticatorAssignedEntityId(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Legal Authenticator Assigned Entity Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentLegalAuthenticatorAssignedEntityId(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.legalAuthenticator.assignedEntity.id->size() > 0 implies (
	 *    self.legalAuthenticator.assignedEntity.id->forAll(ident : datatypes::II |
	 *       not ident.root.oclIsUndefined() and not ident.extension.oclIsUndefined()))
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentLegalAuthenticatorAssignedEntityId(
			UnstructuredDocument unstructuredDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_DOCUMENT_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ID,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocumentLegalAuthenticatorAssignedEntityId"),
					new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentHasNonXMLBody(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Non XML Body</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasNonXMLBody(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_NON_XML_BODY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.component.nonXMLBody.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentHasNonXMLBody(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Non XML Body</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasNonXMLBody(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_NON_XML_BODY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.component.nonXMLBody.oclIsUndefined()
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentHasNonXMLBody(UnstructuredDocument unstructuredDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_NON_XML_BODY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_NON_XML_BODY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_NON_XML_BODY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_NON_XML_BODY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_HAS_NON_XML_BODY,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocumentHasNonXMLBody"),
					new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentHasNonXMLBodyBinaryText(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Non XML Body Binary Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasNonXMLBodyBinaryText(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_NON_XML_BODY_BINARY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.component.nonXMLBody.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentHasNonXMLBodyBinaryText(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Non XML Body Binary Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasNonXMLBodyBinaryText(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_NON_XML_BODY_BINARY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.component.nonXMLBody.text.oclIsUndefined()
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentHasNonXMLBodyBinaryText(
			UnstructuredDocument unstructuredDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_NON_XML_BODY_BINARY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_NON_XML_BODY_BINARY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_NON_XML_BODY_BINARY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_NON_XML_BODY_BINARY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_HAS_NON_XML_BODY_BINARY_TEXT,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocumentHasNonXMLBodyBinaryText"),
					new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentHasNonXMLBodyTextMediaType(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Non XML Body Text Media Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasNonXMLBodyTextMediaType(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_NON_XML_BODY_TEXT_MEDIA_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component.nonXMLBody.text.mediaType = 'application/pdf' or self.component.nonXMLBody.text.mediaType = 'text/plain'";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentHasNonXMLBodyTextMediaType(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Non XML Body Text Media Type</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasNonXMLBodyTextMediaType(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_NON_XML_BODY_TEXT_MEDIA_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.component.nonXMLBody.text.mediaType = 'application/pdf' or self.component.nonXMLBody.text.mediaType = 'text/plain'
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentHasNonXMLBodyTextMediaType(
			UnstructuredDocument unstructuredDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_NON_XML_BODY_TEXT_MEDIA_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_NON_XML_BODY_TEXT_MEDIA_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_NON_XML_BODY_TEXT_MEDIA_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_NON_XML_BODY_TEXT_MEDIA_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_HAS_NON_XML_BODY_TEXT_MEDIA_TYPE,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocumentHasNonXMLBodyTextMediaType"),
					new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentHasNonXMLBodyTextRepresentation(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Non XML Body Text Representation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasNonXMLBodyTextRepresentation(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_NON_XML_BODY_TEXT_REPRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component.nonXMLBody.text.representation = datatypes::BinaryDataEncoding::B64";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentHasNonXMLBodyTextRepresentation(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Non XML Body Text Representation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasNonXMLBodyTextRepresentation(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_NON_XML_BODY_TEXT_REPRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.component.nonXMLBody.text.representation = datatypes::BinaryDataEncoding::B64
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentHasNonXMLBodyTextRepresentation(
			UnstructuredDocument unstructuredDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_NON_XML_BODY_TEXT_REPRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_NON_XML_BODY_TEXT_REPRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_NON_XML_BODY_TEXT_REPRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_NON_XML_BODY_TEXT_REPRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_HAS_NON_XML_BODY_TEXT_REPRESENTATION,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocumentHasNonXMLBodyTextRepresentation"),
					new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentNoStructuredData(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document No Structured Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentNoStructuredData(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_NO_STRUCTURED_DATA__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component.structuredBody.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentNoStructuredData(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document No Structured Data</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentNoStructuredData(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_NO_STRUCTURED_DATA__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.component.structuredBody.oclIsUndefined()
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentNoStructuredData(UnstructuredDocument unstructuredDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_NO_STRUCTURED_DATA__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_NO_STRUCTURED_DATA__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_NO_STRUCTURED_DATA__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_DOCUMENT_NO_STRUCTURED_DATA__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_NO_STRUCTURED_DATA,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocumentNoStructuredData"),
					new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentOnePatientPerDocument(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document One Patient Per Document</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentOnePatientPerDocument(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_ONE_PATIENT_PER_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->one(record : cda::RecordTarget | not record.patientRole.oclIsUndefined() and not record.patientRole.patient.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentOnePatientPerDocument(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document One Patient Per Document</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentOnePatientPerDocument(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_ONE_PATIENT_PER_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->one(record : cda::RecordTarget | not record.patientRole.oclIsUndefined() and not record.patientRole.patient.oclIsUndefined())
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentOnePatientPerDocument(UnstructuredDocument unstructuredDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_ONE_PATIENT_PER_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_ONE_PATIENT_PER_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_ONE_PATIENT_PER_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_DOCUMENT_ONE_PATIENT_PER_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_ONE_PATIENT_PER_DOCUMENT,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocumentOnePatientPerDocument"),
					new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentTemplateId(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentTemplateId(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.62.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentTemplateId(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentTemplateId(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.62.1')
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentTemplateId(UnstructuredDocument unstructuredDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocumentTemplateId"),
					new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentTypeId(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Type Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentTypeId(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.typeId.oclIsUndefined() or self.typeId.isNullFlavorUndefined()) implies (not self.typeId.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentTypeId(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Type Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentTypeId(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.typeId.oclIsUndefined() or self.typeId.isNullFlavorUndefined()) implies (not self.typeId.oclIsUndefined())
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentTypeId(UnstructuredDocument unstructuredDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_DOCUMENT_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_TYPE_ID,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocumentTypeId"),
					new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentId(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentId(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id.oclIsUndefined() or self.id.isNullFlavorUndefined()) implies (not self.id.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentId(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentId(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id.oclIsUndefined() or self.id.isNullFlavorUndefined()) implies (not self.id.oclIsUndefined())
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentId(UnstructuredDocument unstructuredDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_ID,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocumentId"), new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentCode(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentCode(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentCode(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentCode(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentCode(UnstructuredDocument unstructuredDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_CODE,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocumentCode"), new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentTitle(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentTitle(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentTitle(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentTitle(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentTitle(UnstructuredDocument unstructuredDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_DOCUMENT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_TITLE,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocumentTitle"), new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentEffectiveTime(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentEffectiveTime(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentEffectiveTime(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentEffectiveTime(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentEffectiveTime(UnstructuredDocument unstructuredDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_DOCUMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_EFFECTIVE_TIME,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocumentEffectiveTime"),
					new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentConfidentialityCode(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Confidentiality Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentConfidentialityCode(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.confidentialityCode.oclIsUndefined() or self.confidentialityCode.isNullFlavorUndefined()) implies (not self.confidentialityCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentConfidentialityCode(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Confidentiality Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentConfidentialityCode(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.confidentialityCode.oclIsUndefined() or self.confidentialityCode.isNullFlavorUndefined()) implies (not self.confidentialityCode.oclIsUndefined())
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentConfidentialityCode(UnstructuredDocument unstructuredDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_DOCUMENT_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_CONFIDENTIALITY_CODE,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocumentConfidentialityCode"),
					new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentLanguageCode(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Language Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentLanguageCode(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.languageCode.oclIsUndefined() or self.languageCode.isNullFlavorUndefined()) implies (not self.languageCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentLanguageCode(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Language Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentLanguageCode(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.languageCode.oclIsUndefined() or self.languageCode.isNullFlavorUndefined()) implies (not self.languageCode.oclIsUndefined())
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentLanguageCode(UnstructuredDocument unstructuredDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_DOCUMENT_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_LANGUAGE_CODE,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocumentLanguageCode"),
					new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

} // UnstructuredDocumentOperations
