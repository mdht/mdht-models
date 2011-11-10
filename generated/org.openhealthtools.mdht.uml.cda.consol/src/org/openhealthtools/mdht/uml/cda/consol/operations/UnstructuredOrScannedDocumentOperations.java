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
import org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalDocumentOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Unstructured Or Scanned Document</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentPersonHasName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Person Has Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentRolesShallHaveAddrAndTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Roles Shall Have Addr And Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentRolesShouldHaveAddrAndTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Roles Should Have Addr And Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentOrganizationsHaveContactInfo(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Organizations Have Contact Info</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentTimePreciseToDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Time Precise To Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentTimePreciseToYear(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Time Precise To Year</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentTelephoneMatchesRegex(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Telephone Matches Regex</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentHasTelephoneDialingDigits(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Telephone Dialing Digits</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentUnknownTelephoneUsesNullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Unknown Telephone Uses Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentTypeIdExtension(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Type Id Extension</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentIdRootFormat(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Id Root Format</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentOidLength(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Oid Length</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentLanguageCodeForm(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Language Code Form</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentSetIdAndVersionNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Set Id And Version Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentSetIdAndIdAreUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Set Id And Id Are Unique</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentCopyTimeNotPresent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Copy Time Not Present</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentHasRecordTargetPatientRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Record Target Patient Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentHasPatientBirthTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Patient Birth Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentHasAdministrativeGenderCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Administrative Gender Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentHasProviderOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Provider Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentHasAuthorTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Author Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentHasAssignedAuthorId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Assigned Author Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentHasAssignedAuthorPersonOrDevice(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Assigned Author Person Or Device</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentHasDataEntererAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Data Enterer Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentHasDataEntererTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Data Enterer Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentHasInformant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Informant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentHasInformantAssignedPersonOrRelatedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Informant Assigned Person Or Related Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentLegalAuthenticatorHasAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Legal Authenticator Has Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentAuthenticatorHasAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Authenticator Has Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentTimePreciseToSecond(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Time Precise To Second</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentTimePreciseToYearAndDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Time Precise To Year And Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Represented Custodian Organization Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Represented Custodian Organization Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentTypeIdFixed(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Type Id Fixed</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentHasOneRecordTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has One Record Target</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentHasAssignedAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Assigned Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentPatientRoleId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Patient Role Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentHasPatientRoleAddress(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Patient Role Address</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentHasPatientName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Patient Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentHasPatientGenderCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Patient Gender Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentHasPatientBirthYear(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Patient Birth Year</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentHasOriginalAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Original Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentHasScanningDevice(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Scanning Device</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentHasScanDataEnterer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Scan Data Enterer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentLegalAuthenticatorAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Legal Authenticator Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentHasNonXMLBody(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Non XML Body</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentHasNonXMLBodyBinaryText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Non XML Body Binary Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentHasNonXMLBodyTextMediaType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Non XML Body Text Media Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentHasNonXMLBodyTextRepresentation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Non XML Body Text Representation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentNoStructuredData(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document No Structured Data</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentOnePatientPerDocument(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document One Patient Per Document</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentPatientRoleHasId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Patient Role Has Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentAssignedAuthorHasAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Assigned Author Has Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentAssignedAuthorHasTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Assigned Author Has Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Represented Custodian Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Represented Custodian Organization Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Represented Custodian Organization Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentHasNonXMLBodyText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Non XML Body Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentHasTextReferenceOrRepresentation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Text Reference Or Representation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentHasTextMediaTypeValueSet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Text Media Type Value Set</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentRealmCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentTypeId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentLanguageCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Language Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnstructuredOrScannedDocumentOperations extends ClinicalDocumentOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnstructuredOrScannedDocumentOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentPersonHasName(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Person Has Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentPersonHasName(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_PERSON_HAS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentPersonHasName(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Person Has Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentPersonHasName(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_PERSON_HAS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentPersonHasName(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_PERSON_HAS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_PERSON_HAS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_PERSON_HAS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_PERSON_HAS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_PERSON_HAS_NAME,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentPersonHasName"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentRolesShallHaveAddrAndTelecom(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Roles Shall Have Addr And Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentRolesShallHaveAddrAndTelecom(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ROLES_SHALL_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentRolesShallHaveAddrAndTelecom(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Roles Shall Have Addr And Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentRolesShallHaveAddrAndTelecom(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ROLES_SHALL_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentRolesShallHaveAddrAndTelecom(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ROLES_SHALL_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ROLES_SHALL_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ROLES_SHALL_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ROLES_SHALL_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_ROLES_SHALL_HAVE_ADDR_AND_TELECOM,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentRolesShallHaveAddrAndTelecom"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentRolesShouldHaveAddrAndTelecom(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Roles Should Have Addr And Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentRolesShouldHaveAddrAndTelecom(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ROLES_SHOULD_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentRolesShouldHaveAddrAndTelecom(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Roles Should Have Addr And Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentRolesShouldHaveAddrAndTelecom(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ROLES_SHOULD_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentRolesShouldHaveAddrAndTelecom(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ROLES_SHOULD_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ROLES_SHOULD_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ROLES_SHOULD_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ROLES_SHOULD_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_ROLES_SHOULD_HAVE_ADDR_AND_TELECOM,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentRolesShouldHaveAddrAndTelecom"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentOrganizationsHaveContactInfo(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Organizations Have Contact Info</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentOrganizationsHaveContactInfo(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ORGANIZATIONS_HAVE_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentOrganizationsHaveContactInfo(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Organizations Have Contact Info</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentOrganizationsHaveContactInfo(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ORGANIZATIONS_HAVE_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentOrganizationsHaveContactInfo(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ORGANIZATIONS_HAVE_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ORGANIZATIONS_HAVE_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ORGANIZATIONS_HAVE_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ORGANIZATIONS_HAVE_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_ORGANIZATIONS_HAVE_CONTACT_INFO,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentOrganizationsHaveContactInfo"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentTimePreciseToDay(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Time Precise To Day</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentTimePreciseToDay(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentTimePreciseToDay(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Time Precise To Day</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentTimePreciseToDay(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentTimePreciseToDay(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_TIME_PRECISE_TO_DAY,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentTimePreciseToDay"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentTimePreciseToYear(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Time Precise To Year</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentTimePreciseToYear(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "cda::OrganizationPartOf.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject)-> union(  cda::MaintainedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union( cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::ServiceEvent.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::EncounterParticipant.allInstances()->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(self.participant->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(cda::OrganizationPartOf.allInstances().effectiveTime->union(cda::MaintainedEntity.allInstances().effectiveTime)->union( cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::ServiceEvent.allInstances().effectiveTime)->union(cda::EncounterParticipant.allInstances().time)->union(self.participant.time)->select(current : datatypes::IVL_TS  |  ((not current.low.oclIsUndefined()) and (current.low.value.oclIsUndefined() or current.low.value.size() < 4)) or ((not current.center.oclIsUndefined()) and (current.center.value.oclIsUndefined() or current.center.value.size() < 4)) or ((not current.high.oclIsUndefined()) and (current.high.value.oclIsUndefined() or current.high.value.size() < 4)) or (current.low.oclIsUndefined() and current.center.oclIsUndefined() and current.high.oclIsUndefined()) ).oclAsType( ecore::EObject))";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentTimePreciseToYear(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Time Precise To Year</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentTimePreciseToYear(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::OrganizationPartOf.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject)-> union(  cda::MaintainedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union( cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::ServiceEvent.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::EncounterParticipant.allInstances()->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(self.participant->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(cda::OrganizationPartOf.allInstances().effectiveTime->union(cda::MaintainedEntity.allInstances().effectiveTime)->union( cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::ServiceEvent.allInstances().effectiveTime)->union(cda::EncounterParticipant.allInstances().time)->union(self.participant.time)->select(current : datatypes::IVL_TS  |  ((not current.low.oclIsUndefined()) and (current.low.value.oclIsUndefined() or current.low.value.size() < 4)) or ((not current.center.oclIsUndefined()) and (current.center.value.oclIsUndefined() or current.center.value.size() < 4)) or ((not current.high.oclIsUndefined()) and (current.high.value.oclIsUndefined() or current.high.value.size() < 4)) or (current.low.oclIsUndefined() and current.center.oclIsUndefined() and current.high.oclIsUndefined()) ).oclAsType( ecore::EObject))
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentTimePreciseToYear(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_TIME_PRECISE_TO_YEAR,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentTimePreciseToYear"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentTelephoneMatchesRegex(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Telephone Matches Regex</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentTelephoneMatchesRegex(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TELEPHONE_MATCHES_REGEX__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentTelephoneMatchesRegex(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Telephone Matches Regex</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentTelephoneMatchesRegex(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TELEPHONE_MATCHES_REGEX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentTelephoneMatchesRegex(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TELEPHONE_MATCHES_REGEX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TELEPHONE_MATCHES_REGEX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TELEPHONE_MATCHES_REGEX__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TELEPHONE_MATCHES_REGEX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_TELEPHONE_MATCHES_REGEX,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentTelephoneMatchesRegex"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentHasTelephoneDialingDigits(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Telephone Dialing Digits</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasTelephoneDialingDigits(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_TELEPHONE_DIALING_DIGITS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentHasTelephoneDialingDigits(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Telephone Dialing Digits</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasTelephoneDialingDigits(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_TELEPHONE_DIALING_DIGITS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentHasTelephoneDialingDigits(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_TELEPHONE_DIALING_DIGITS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_TELEPHONE_DIALING_DIGITS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_TELEPHONE_DIALING_DIGITS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_TELEPHONE_DIALING_DIGITS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_TELEPHONE_DIALING_DIGITS,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentHasTelephoneDialingDigits"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentUnknownTelephoneUsesNullFlavor(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Unknown Telephone Uses Null Flavor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentUnknownTelephoneUsesNullFlavor(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_UNKNOWN_TELEPHONE_USES_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentUnknownTelephoneUsesNullFlavor(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Unknown Telephone Uses Null Flavor</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentUnknownTelephoneUsesNullFlavor(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_UNKNOWN_TELEPHONE_USES_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentUnknownTelephoneUsesNullFlavor(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_UNKNOWN_TELEPHONE_USES_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_UNKNOWN_TELEPHONE_USES_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_UNKNOWN_TELEPHONE_USES_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_UNKNOWN_TELEPHONE_USES_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_UNKNOWN_TELEPHONE_USES_NULL_FLAVOR,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentUnknownTelephoneUsesNullFlavor"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentTypeIdExtension(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Type Id Extension</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentTypeIdExtension(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.typeId.extension = 'POCD_HD000040'";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentTypeIdExtension(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Type Id Extension</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentTypeIdExtension(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.typeId.extension = 'POCD_HD000040'
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentTypeIdExtension(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_TYPE_ID_EXTENSION,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentTypeIdExtension"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentIdRootFormat(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Id Root Format</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentIdRootFormat(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ID_ROOT_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.id.matches('root','([0-2])(.([1-9][0-9]*|0))+') or self.id.matches('root','([A-Fa-f0-9]{8})(\\\\-[A-Fa-f0-9]{4}){3}(\\\\-[A-Fa-f0-9]{12})')";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentIdRootFormat(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Id Root Format</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentIdRootFormat(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ID_ROOT_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.id.matches('root','([0-2])(.([1-9][0-9]*|0))+') or self.id.matches('root','([A-Fa-f0-9]{8})(\\\\-[A-Fa-f0-9]{4}){3}(\\\\-[A-Fa-f0-9]{12})')
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentIdRootFormat(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ID_ROOT_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ID_ROOT_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ID_ROOT_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ID_ROOT_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_ID_ROOT_FORMAT,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentIdRootFormat"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentOidLength(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Oid Length</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentOidLength(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_OID_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.id->select((not id.root.oclIsUndefined()) and id.root.size() > 64 )";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentOidLength(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Oid Length</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentOidLength(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_OID_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.id->select((not id.root.oclIsUndefined()) and id.root.size() > 64 )
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentOidLength(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_OID_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_OID_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_OID_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_OID_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_OID_LENGTH,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentOidLength"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentLanguageCodeForm(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Language Code Form</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentLanguageCodeForm(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_LANGUAGE_CODE_FORM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.languageCode.matches('code','(([a-z]{2})(\\\\-[A-Z]{2})?)')";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentLanguageCodeForm(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Language Code Form</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentLanguageCodeForm(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_LANGUAGE_CODE_FORM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.languageCode.matches('code','(([a-z]{2})(\\\\-[A-Z]{2})?)')
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentLanguageCodeForm(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_LANGUAGE_CODE_FORM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_LANGUAGE_CODE_FORM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_LANGUAGE_CODE_FORM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_LANGUAGE_CODE_FORM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_LANGUAGE_CODE_FORM,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentLanguageCodeForm"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentSetIdAndVersionNumber(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Set Id And Version Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentSetIdAndVersionNumber(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_SET_ID_AND_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.setId.oclIsUndefined() and self.versionNumber.oclIsUndefined())"
			+ "   xor (not self.setId.oclIsUndefined() and not self.versionNumber.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentSetIdAndVersionNumber(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Set Id And Version Number</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentSetIdAndVersionNumber(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_SET_ID_AND_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.setId.oclIsUndefined() and self.versionNumber.oclIsUndefined())
	 *    xor (not self.setId.oclIsUndefined() and not self.versionNumber.oclIsUndefined())
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentSetIdAndVersionNumber(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_SET_ID_AND_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_SET_ID_AND_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_SET_ID_AND_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_SET_ID_AND_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_SET_ID_AND_VERSION_NUMBER,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentSetIdAndVersionNumber"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentSetIdAndIdAreUnique(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Set Id And Id Are Unique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentSetIdAndIdAreUnique(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_SET_ID_AND_ID_ARE_UNIQUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(not self.setId.oclIsUndefined() and not self.id.oclIsUndefined())"
			+ "   implies (self.setId.root <> self.id.root or self.setId.extension <> self.id.extension)";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentSetIdAndIdAreUnique(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Set Id And Id Are Unique</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentSetIdAndIdAreUnique(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_SET_ID_AND_ID_ARE_UNIQUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (not self.setId.oclIsUndefined() and not self.id.oclIsUndefined())
	 *    implies (self.setId.root <> self.id.root or self.setId.extension <> self.id.extension)
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentSetIdAndIdAreUnique(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_SET_ID_AND_ID_ARE_UNIQUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_SET_ID_AND_ID_ARE_UNIQUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_SET_ID_AND_ID_ARE_UNIQUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_SET_ID_AND_ID_ARE_UNIQUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_SET_ID_AND_ID_ARE_UNIQUE,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentSetIdAndIdAreUnique"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentCopyTimeNotPresent(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Copy Time Not Present</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentCopyTimeNotPresent(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_COPY_TIME_NOT_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.copyTime.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentCopyTimeNotPresent(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Copy Time Not Present</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentCopyTimeNotPresent(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_COPY_TIME_NOT_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.copyTime.oclIsUndefined()
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentCopyTimeNotPresent(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_COPY_TIME_NOT_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_COPY_TIME_NOT_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_COPY_TIME_NOT_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_COPY_TIME_NOT_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_COPY_TIME_NOT_PRESENT,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentCopyTimeNotPresent"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentHasRecordTargetPatientRole(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Record Target Patient Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasRecordTargetPatientRole(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->size() > 0 and self.recordTarget->exists(target : cda::RecordTarget | not target.patientRole.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentHasRecordTargetPatientRole(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Record Target Patient Role</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasRecordTargetPatientRole(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->size() > 0 and self.recordTarget->exists(target : cda::RecordTarget | not target.patientRole.oclIsUndefined())
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentHasRecordTargetPatientRole(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_RECORD_TARGET_PATIENT_ROLE,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentHasRecordTargetPatientRole"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentHasPatientBirthTime(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Patient Birth Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasPatientBirthTime(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->forAll(target : cda::RecordTarget | not target.patientRole.oclIsUndefined()"
			+ "   implies (not target.patientRole.patient.birthTime.value.oclIsUndefined()"
			+ "      or not target.patientRole.patient.birthTime.nullFlavor.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentHasPatientBirthTime(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Patient Birth Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasPatientBirthTime(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->forAll(target : cda::RecordTarget | not target.patientRole.oclIsUndefined()
	 *    implies (not target.patientRole.patient.birthTime.value.oclIsUndefined()
	 *       or not target.patientRole.patient.birthTime.nullFlavor.oclIsUndefined()))
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentHasPatientBirthTime(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PATIENT_BIRTH_TIME,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentHasPatientBirthTime"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentHasAdministrativeGenderCode(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Administrative Gender Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasAdministrativeGenderCode(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->forAll(target : cda::RecordTarget | not target.patientRole.oclIsUndefined()"
			+ "   implies (not target.patientRole.patient.administrativeGenderCode.code.oclIsUndefined()"
			+ "      or not target.patientRole.patient.administrativeGenderCode.nullFlavor.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentHasAdministrativeGenderCode(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Administrative Gender Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasAdministrativeGenderCode(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->forAll(target : cda::RecordTarget | not target.patientRole.oclIsUndefined()
	 *    implies (not target.patientRole.patient.administrativeGenderCode.code.oclIsUndefined()
	 *       or not target.patientRole.patient.administrativeGenderCode.nullFlavor.oclIsUndefined()))
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentHasAdministrativeGenderCode(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_ADMINISTRATIVE_GENDER_CODE,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentHasAdministrativeGenderCode"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentHasProviderOrganization(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Provider Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasProviderOrganization(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->exists(target : cda::RecordTarget | not target.patientRole.providerOrganization.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentHasProviderOrganization(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Provider Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasProviderOrganization(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->exists(target : cda::RecordTarget | not target.patientRole.providerOrganization.oclIsUndefined())
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentHasProviderOrganization(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PROVIDER_ORGANIZATION,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentHasProviderOrganization"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentHasAuthorTime(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Author Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasAuthorTime(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->forAll(author : cda::Author | not author.time.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentHasAuthorTime(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Author Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasAuthorTime(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.author->forAll(author : cda::Author | not author.time.oclIsUndefined())
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentHasAuthorTime(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_AUTHOR_TIME,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentHasAuthorTime"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentHasAssignedAuthorId(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Assigned Author Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasAssignedAuthorId(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->forAll(author : cda::Author | author.assignedAuthor.id->size() > 0)";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentHasAssignedAuthorId(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Assigned Author Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasAssignedAuthorId(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.author->forAll(author : cda::Author | author.assignedAuthor.id->size() > 0)
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentHasAssignedAuthorId(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_ASSIGNED_AUTHOR_ID,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentHasAssignedAuthorId"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentHasAssignedAuthorPersonOrDevice(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Assigned Author Person Or Device</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasAssignedAuthorPersonOrDevice(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->forAll(author : cda::Author | not author.assignedAuthor.assignedPerson.oclIsUndefined() "
			+ "   or not author.assignedAuthor.assignedAuthoringDevice.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentHasAssignedAuthorPersonOrDevice(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Assigned Author Person Or Device</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasAssignedAuthorPersonOrDevice(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.author->forAll(author : cda::Author | not author.assignedAuthor.assignedPerson.oclIsUndefined() 
	 *    or not author.assignedAuthor.assignedAuthoringDevice.oclIsUndefined())
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentHasAssignedAuthorPersonOrDevice(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentHasAssignedAuthorPersonOrDevice"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentHasDataEntererAssignedPerson(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Data Enterer Assigned Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasDataEntererAssignedPerson(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_DATA_ENTERER_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.dataEnterer.oclIsUndefined() implies not self.dataEnterer.assignedEntity.assignedPerson.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentHasDataEntererAssignedPerson(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Data Enterer Assigned Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasDataEntererAssignedPerson(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_DATA_ENTERER_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.dataEnterer.oclIsUndefined() implies not self.dataEnterer.assignedEntity.assignedPerson.oclIsUndefined()
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentHasDataEntererAssignedPerson(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_DATA_ENTERER_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_DATA_ENTERER_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_DATA_ENTERER_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_DATA_ENTERER_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_DATA_ENTERER_ASSIGNED_PERSON,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentHasDataEntererAssignedPerson"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentHasDataEntererTime(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Data Enterer Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasDataEntererTime(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_DATA_ENTERER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.dataEnterer.oclIsUndefined() implies not self.dataEnterer.time.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentHasDataEntererTime(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Data Enterer Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasDataEntererTime(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_DATA_ENTERER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.dataEnterer.oclIsUndefined() implies not self.dataEnterer.time.oclIsUndefined()
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentHasDataEntererTime(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_DATA_ENTERER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_DATA_ENTERER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_DATA_ENTERER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_DATA_ENTERER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_DATA_ENTERER_TIME,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentHasDataEntererTime"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentHasInformant(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Informant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasInformant(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->size() > 0";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentHasInformant(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Informant</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasInformant(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.informant->size() > 0
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentHasInformant(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_INFORMANT,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentHasInformant"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentHasInformantAssignedPersonOrRelatedPerson(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Informant Assigned Person Or Related Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasInformantAssignedPersonOrRelatedPerson(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->forAll(i : cda::Informant12 | not i.assignedEntity.assignedPerson.oclIsUndefined()"
			+ "   or not i.relatedEntity.relatedPerson.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentHasInformantAssignedPersonOrRelatedPerson(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Informant Assigned Person Or Related Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasInformantAssignedPersonOrRelatedPerson(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.informant->forAll(i : cda::Informant12 | not i.assignedEntity.assignedPerson.oclIsUndefined()
	 *    or not i.relatedEntity.relatedPerson.oclIsUndefined())
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentHasInformantAssignedPersonOrRelatedPerson(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentHasInformantAssignedPersonOrRelatedPerson"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentLegalAuthenticatorHasAssignedPerson(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Legal Authenticator Has Assigned Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentLegalAuthenticatorHasAssignedPerson(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.legalAuthenticator.oclIsUndefined() implies not self.legalAuthenticator.assignedEntity.assignedPerson.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentLegalAuthenticatorHasAssignedPerson(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Legal Authenticator Has Assigned Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentLegalAuthenticatorHasAssignedPerson(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.legalAuthenticator.oclIsUndefined() implies not self.legalAuthenticator.assignedEntity.assignedPerson.oclIsUndefined()
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentLegalAuthenticatorHasAssignedPerson(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentLegalAuthenticatorHasAssignedPerson"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentAuthenticatorHasAssignedPerson(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Authenticator Has Assigned Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentAuthenticatorHasAssignedPerson(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authenticator->forAll(auth : cda::Authenticator | auth.assignedEntity->forAll(entity : cda::AssignedEntity |"
			+ "   not entity.assignedPerson.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentAuthenticatorHasAssignedPerson(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Authenticator Has Assigned Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentAuthenticatorHasAssignedPerson(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.authenticator->forAll(auth : cda::Authenticator | auth.assignedEntity->forAll(entity : cda::AssignedEntity |
	 *    not entity.assignedPerson.oclIsUndefined()))
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentAuthenticatorHasAssignedPerson(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_AUTHENTICATOR_HAS_ASSIGNED_PERSON,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentAuthenticatorHasAssignedPerson"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentTimePreciseToSecond(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Time Precise To Second</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentTimePreciseToSecond(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TIME_PRECISE_TO_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentTimePreciseToSecond(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Time Precise To Second</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentTimePreciseToSecond(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TIME_PRECISE_TO_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentTimePreciseToSecond(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TIME_PRECISE_TO_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TIME_PRECISE_TO_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TIME_PRECISE_TO_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TIME_PRECISE_TO_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_TIME_PRECISE_TO_SECOND,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentTimePreciseToSecond"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentTimePreciseToYearAndDay(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Time Precise To Year And Day</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentTimePreciseToYearAndDay(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TIME_PRECISE_TO_YEAR_AND_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "cda::OrganizationPartOf.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject)-> union(  cda::MaintainedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union( cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::ServiceEvent.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::EncounterParticipant.allInstances()->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(self.participant->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(cda::OrganizationPartOf.allInstances().effectiveTime->union(cda::MaintainedEntity.allInstances().effectiveTime)->union( cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::ServiceEvent.allInstances().effectiveTime)->union(cda::EncounterParticipant.allInstances().time)->union(self.participant.time)->select(current : datatypes::IVL_TS  |  ((not current.low.oclIsUndefined()) and (current.low.value.oclIsUndefined() or current.low.value.size() < 8)) or ((not current.center.oclIsUndefined()) and (current.center.value.oclIsUndefined() or current.center.value.size() < 8)) or ((not current.high.oclIsUndefined()) and (current.high.value.oclIsUndefined() or current.high.value.size() < 8)) or (current.low.oclIsUndefined() and current.center.oclIsUndefined() and current.high.oclIsUndefined()) ).oclAsType( ecore::EObject))";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentTimePreciseToYearAndDay(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Time Precise To Year And Day</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentTimePreciseToYearAndDay(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TIME_PRECISE_TO_YEAR_AND_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::OrganizationPartOf.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject)-> union(  cda::MaintainedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union( cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::ServiceEvent.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::EncounterParticipant.allInstances()->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(self.participant->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(cda::OrganizationPartOf.allInstances().effectiveTime->union(cda::MaintainedEntity.allInstances().effectiveTime)->union( cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::ServiceEvent.allInstances().effectiveTime)->union(cda::EncounterParticipant.allInstances().time)->union(self.participant.time)->select(current : datatypes::IVL_TS  |  ((not current.low.oclIsUndefined()) and (current.low.value.oclIsUndefined() or current.low.value.size() < 8)) or ((not current.center.oclIsUndefined()) and (current.center.value.oclIsUndefined() or current.center.value.size() < 8)) or ((not current.high.oclIsUndefined()) and (current.high.value.oclIsUndefined() or current.high.value.size() < 8)) or (current.low.oclIsUndefined() and current.center.oclIsUndefined() and current.high.oclIsUndefined()) ).oclAsType( ecore::EObject))
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentTimePreciseToYearAndDay(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TIME_PRECISE_TO_YEAR_AND_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TIME_PRECISE_TO_YEAR_AND_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TIME_PRECISE_TO_YEAR_AND_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TIME_PRECISE_TO_YEAR_AND_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_TIME_PRECISE_TO_YEAR_AND_DAY,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentTimePreciseToYearAndDay"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationName(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Represented Custodian Organization Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationName(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not custodian.assignedCustodian.representedCustodianOrganization.name.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationName(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Represented Custodian Organization Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationName(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not custodian.assignedCustodian.representedCustodianOrganization.name.oclIsUndefined()
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationName(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_NAME,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationName"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationAddr(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Represented Custodian Organization Addr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationAddr(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not custodian.assignedCustodian.representedCustodianOrganization.addr.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationAddr(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Represented Custodian Organization Addr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationAddr(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not custodian.assignedCustodian.representedCustodianOrganization.addr.oclIsUndefined()
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationAddr(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_ADDR,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationAddr"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentTypeIdFixed(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Type Id Fixed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentTypeIdFixed(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TYPE_ID_FIXED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.typeId.root = '2.16.840.1.113883.1.3' and self.typeId.extension = 'POCD_HD000040'";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentTypeIdFixed(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Type Id Fixed</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentTypeIdFixed(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TYPE_ID_FIXED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.typeId.root = '2.16.840.1.113883.1.3' and self.typeId.extension = 'POCD_HD000040'
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentTypeIdFixed(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TYPE_ID_FIXED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TYPE_ID_FIXED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TYPE_ID_FIXED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TYPE_ID_FIXED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_TYPE_ID_FIXED,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentTypeIdFixed"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentHasOneRecordTarget(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has One Record Target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasOneRecordTarget(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_ONE_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentHasOneRecordTarget(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has One Record Target</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasOneRecordTarget(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_ONE_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->size() = 1
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentHasOneRecordTarget(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_ONE_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_ONE_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_ONE_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_ONE_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_ONE_RECORD_TARGET,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentHasOneRecordTarget"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentHasAssignedAuthor(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Assigned Author</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasAssignedAuthor(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.assignedAuthor.assignedPerson.oclIsUndefined() "
			+ "   or not author.assignedAuthor.representedOrganization.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentHasAssignedAuthor(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Assigned Author</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasAssignedAuthor(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.author->exists(author : cda::Author | not author.assignedAuthor.assignedPerson.oclIsUndefined() 
	 *    or not author.assignedAuthor.representedOrganization.oclIsUndefined())
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentHasAssignedAuthor(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_ASSIGNED_AUTHOR,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentHasAssignedAuthor"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentPatientRoleId(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Patient Role Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentPatientRoleId(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->forAll(target : cda::RecordTarget | not target.patientRole.oclIsUndefined()"
			+ "   and target.patientRole.id->forAll(roleId : datatypes::II | not roleId.root.oclIsUndefined()"
			+ "   and not roleId.extension.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentPatientRoleId(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Patient Role Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentPatientRoleId(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->forAll(target : cda::RecordTarget | not target.patientRole.oclIsUndefined()
	 *    and target.patientRole.id->forAll(roleId : datatypes::II | not roleId.root.oclIsUndefined()
	 *    and not roleId.extension.oclIsUndefined()))
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentPatientRoleId(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_PATIENT_ROLE_ID,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentPatientRoleId"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentHasPatientRoleAddress(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Patient Role Address</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasPatientRoleAddress(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PATIENT_ROLE_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->exists(target : cda::RecordTarget | not target.patientRole.oclIsUndefined()"
			+ "   and target.patientRole.addr->exists(address : datatypes::AD | address.country->exists(c : datatypes::ADXP |"
			+ "   not c.oclIsUndefined() and c.getText().size() > 0)))";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentHasPatientRoleAddress(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Patient Role Address</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasPatientRoleAddress(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PATIENT_ROLE_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->exists(target : cda::RecordTarget | not target.patientRole.oclIsUndefined()
	 *    and target.patientRole.addr->exists(address : datatypes::AD | address.country->exists(c : datatypes::ADXP |
	 *    not c.oclIsUndefined() and c.getText().size() > 0)))
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentHasPatientRoleAddress(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PATIENT_ROLE_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PATIENT_ROLE_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PATIENT_ROLE_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PATIENT_ROLE_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PATIENT_ROLE_ADDRESS,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentHasPatientRoleAddress"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentHasPatientName(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Patient Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasPatientName(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PATIENT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->exists(target : cda::RecordTarget | not target.patientRole.patient.oclIsUndefined()"
			+ "   and target.patientRole.patient.name->exists(name: datatypes::PN |"
			+ "      not name.given->isEmpty() and not name.family->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentHasPatientName(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Patient Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasPatientName(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PATIENT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->exists(target : cda::RecordTarget | not target.patientRole.patient.oclIsUndefined()
	 *    and target.patientRole.patient.name->exists(name: datatypes::PN |
	 *       not name.given->isEmpty() and not name.family->isEmpty()))
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentHasPatientName(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PATIENT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PATIENT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PATIENT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PATIENT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PATIENT_NAME,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentHasPatientName"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentHasPatientGenderCode(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Patient Gender Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasPatientGenderCode(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PATIENT_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->one(target : cda::RecordTarget |"
			+ "   not target.patientRole.patient.administrativeGenderCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentHasPatientGenderCode(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Patient Gender Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasPatientGenderCode(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PATIENT_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->one(target : cda::RecordTarget |
	 *    not target.patientRole.patient.administrativeGenderCode.oclIsUndefined())
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentHasPatientGenderCode(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PATIENT_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PATIENT_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PATIENT_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PATIENT_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PATIENT_GENDER_CODE,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentHasPatientGenderCode"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentHasPatientBirthYear(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Patient Birth Year</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasPatientBirthYear(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PATIENT_BIRTH_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->one(target : cda::RecordTarget |"
			+ "   not target.patientRole.patient.birthTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentHasPatientBirthYear(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Patient Birth Year</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasPatientBirthYear(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PATIENT_BIRTH_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->one(target : cda::RecordTarget |
	 *    not target.patientRole.patient.birthTime.oclIsUndefined())
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentHasPatientBirthYear(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PATIENT_BIRTH_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PATIENT_BIRTH_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PATIENT_BIRTH_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PATIENT_BIRTH_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PATIENT_BIRTH_YEAR,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentHasPatientBirthYear"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentHasOriginalAuthor(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Original Author</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasOriginalAuthor(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_ORIGINAL_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(ihe::ScanOriginalAuthor))";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentHasOriginalAuthor(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Original Author</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasOriginalAuthor(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_ORIGINAL_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(ihe::ScanOriginalAuthor))
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentHasOriginalAuthor(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_ORIGINAL_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_ORIGINAL_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_ORIGINAL_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_ORIGINAL_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_ORIGINAL_AUTHOR,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentHasOriginalAuthor"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentHasScanningDevice(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Scanning Device</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasScanningDevice(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_SCANNING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(ihe::ScanningDevice))";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentHasScanningDevice(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Scanning Device</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasScanningDevice(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_SCANNING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(ihe::ScanningDevice))
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentHasScanningDevice(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_SCANNING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_SCANNING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_SCANNING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_SCANNING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_SCANNING_DEVICE,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentHasScanningDevice"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentHasScanDataEnterer(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Scan Data Enterer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasScanDataEnterer(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_SCAN_DATA_ENTERER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.dataEnterer.oclIsUndefined() and self.dataEnterer.oclIsKindOf(ihe::ScanDataEnterer)";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentHasScanDataEnterer(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Scan Data Enterer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasScanDataEnterer(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_SCAN_DATA_ENTERER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.dataEnterer.oclIsUndefined() and self.dataEnterer.oclIsKindOf(ihe::ScanDataEnterer)
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentHasScanDataEnterer(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_SCAN_DATA_ENTERER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_SCAN_DATA_ENTERER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_SCAN_DATA_ENTERER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_SCAN_DATA_ENTERER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_SCAN_DATA_ENTERER,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentHasScanDataEnterer"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentLegalAuthenticatorAssignedEntityId(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Legal Authenticator Assigned Entity Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentLegalAuthenticatorAssignedEntityId(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.legalAuthenticator.assignedEntity.id->size() > 0 implies ("
			+ "   self.legalAuthenticator.assignedEntity.id->forAll(ident : datatypes::II |"
			+ "      not ident.root.oclIsUndefined() and not ident.extension.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentLegalAuthenticatorAssignedEntityId(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Legal Authenticator Assigned Entity Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentLegalAuthenticatorAssignedEntityId(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.legalAuthenticator.assignedEntity.id->size() > 0 implies (
	 *    self.legalAuthenticator.assignedEntity.id->forAll(ident : datatypes::II |
	 *       not ident.root.oclIsUndefined() and not ident.extension.oclIsUndefined()))
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentLegalAuthenticatorAssignedEntityId(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ID,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentLegalAuthenticatorAssignedEntityId"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentHasNonXMLBody(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Non XML Body</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasNonXMLBody(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.component.nonXMLBody.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentHasNonXMLBody(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Non XML Body</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasNonXMLBody(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.component.nonXMLBody.oclIsUndefined()
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentHasNonXMLBody(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentHasNonXMLBody"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentHasNonXMLBodyBinaryText(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Non XML Body Binary Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasNonXMLBodyBinaryText(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY_BINARY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.component.nonXMLBody.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentHasNonXMLBodyBinaryText(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Non XML Body Binary Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasNonXMLBodyBinaryText(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY_BINARY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.component.nonXMLBody.text.oclIsUndefined()
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentHasNonXMLBodyBinaryText(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY_BINARY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY_BINARY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY_BINARY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY_BINARY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY_BINARY_TEXT,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentHasNonXMLBodyBinaryText"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentHasNonXMLBodyTextMediaType(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Non XML Body Text Media Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasNonXMLBodyTextMediaType(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY_TEXT_MEDIA_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component.nonXMLBody.text.mediaType = 'application/pdf' or self.component.nonXMLBody.text.mediaType = 'text/plain'";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentHasNonXMLBodyTextMediaType(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Non XML Body Text Media Type</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasNonXMLBodyTextMediaType(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY_TEXT_MEDIA_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.component.nonXMLBody.text.mediaType = 'application/pdf' or self.component.nonXMLBody.text.mediaType = 'text/plain'
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentHasNonXMLBodyTextMediaType(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY_TEXT_MEDIA_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY_TEXT_MEDIA_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY_TEXT_MEDIA_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY_TEXT_MEDIA_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY_TEXT_MEDIA_TYPE,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentHasNonXMLBodyTextMediaType"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentHasNonXMLBodyTextRepresentation(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Non XML Body Text Representation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasNonXMLBodyTextRepresentation(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY_TEXT_REPRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component.nonXMLBody.text.representation = datatypes::BinaryDataEncoding::B64";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentHasNonXMLBodyTextRepresentation(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Non XML Body Text Representation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasNonXMLBodyTextRepresentation(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY_TEXT_REPRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.component.nonXMLBody.text.representation = datatypes::BinaryDataEncoding::B64
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentHasNonXMLBodyTextRepresentation(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY_TEXT_REPRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY_TEXT_REPRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY_TEXT_REPRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY_TEXT_REPRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY_TEXT_REPRESENTATION,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentHasNonXMLBodyTextRepresentation"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentNoStructuredData(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document No Structured Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentNoStructuredData(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_NO_STRUCTURED_DATA__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component.structuredBody.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentNoStructuredData(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document No Structured Data</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentNoStructuredData(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_NO_STRUCTURED_DATA__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.component.structuredBody.oclIsUndefined()
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentNoStructuredData(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_NO_STRUCTURED_DATA__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_NO_STRUCTURED_DATA__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_NO_STRUCTURED_DATA__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_NO_STRUCTURED_DATA__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_NO_STRUCTURED_DATA,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentNoStructuredData"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentOnePatientPerDocument(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document One Patient Per Document</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentOnePatientPerDocument(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ONE_PATIENT_PER_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->one(record : cda::RecordTarget | not record.patientRole.oclIsUndefined() and not record.patientRole.patient.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentOnePatientPerDocument(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document One Patient Per Document</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentOnePatientPerDocument(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ONE_PATIENT_PER_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->one(record : cda::RecordTarget | not record.patientRole.oclIsUndefined() and not record.patientRole.patient.oclIsUndefined())
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentOnePatientPerDocument(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ONE_PATIENT_PER_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ONE_PATIENT_PER_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ONE_PATIENT_PER_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ONE_PATIENT_PER_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_ONE_PATIENT_PER_DOCUMENT,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentOnePatientPerDocument"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentPatientRoleHasId(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Patient Role Has Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentPatientRoleHasId(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_PATIENT_ROLE_HAS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not recordTarget.patientRole.id->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentPatientRoleHasId(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Patient Role Has Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentPatientRoleHasId(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_PATIENT_ROLE_HAS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not recordTarget.patientRole.id->isEmpty()
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentPatientRoleHasId(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_PATIENT_ROLE_HAS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_PATIENT_ROLE_HAS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_PATIENT_ROLE_HAS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_PATIENT_ROLE_HAS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_PATIENT_ROLE_HAS_ID,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentPatientRoleHasId"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentAssignedAuthorHasAddr(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Assigned Author Has Addr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentAssignedAuthorHasAddr(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ASSIGNED_AUTHOR_HAS_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not author.assignedAuthor.addr->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentAssignedAuthorHasAddr(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Assigned Author Has Addr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentAssignedAuthorHasAddr(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ASSIGNED_AUTHOR_HAS_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not author.assignedAuthor.addr->isEmpty()
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentAssignedAuthorHasAddr(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ASSIGNED_AUTHOR_HAS_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ASSIGNED_AUTHOR_HAS_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ASSIGNED_AUTHOR_HAS_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ASSIGNED_AUTHOR_HAS_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_ASSIGNED_AUTHOR_HAS_ADDR,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentAssignedAuthorHasAddr"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentAssignedAuthorHasTelecom(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Assigned Author Has Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentAssignedAuthorHasTelecom(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ASSIGNED_AUTHOR_HAS_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not author.assignedAuthor.telecom->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentAssignedAuthorHasTelecom(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Assigned Author Has Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentAssignedAuthorHasTelecom(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ASSIGNED_AUTHOR_HAS_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not author.assignedAuthor.telecom->isEmpty()
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentAssignedAuthorHasTelecom(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ASSIGNED_AUTHOR_HAS_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ASSIGNED_AUTHOR_HAS_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ASSIGNED_AUTHOR_HAS_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ASSIGNED_AUTHOR_HAS_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_ASSIGNED_AUTHOR_HAS_TELECOM,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentAssignedAuthorHasTelecom"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganization(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Represented Custodian Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganization(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not custodian.assignedCustodian.representedCustodianOrganization.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganization(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Represented Custodian Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganization(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not custodian.assignedCustodian.representedCustodianOrganization.oclIsUndefined()
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganization(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentHasRepresentedCustodianOrganization"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationId(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Represented Custodian Organization Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationId(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not custodian.assignedCustodian.representedCustodianOrganization.id->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationId(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Represented Custodian Organization Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationId(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not custodian.assignedCustodian.representedCustodianOrganization.id->isEmpty()
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationId(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_ID,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationId"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationTelecom(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Represented Custodian Organization Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationTelecom(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not custodian.assignedCustodian.representedCustodianOrganization.telecom.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationTelecom(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Represented Custodian Organization Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationTelecom(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not custodian.assignedCustodian.representedCustodianOrganization.telecom.oclIsUndefined()
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationTelecom(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_TELECOM,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationTelecom"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentHasNonXMLBodyText(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Non XML Body Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasNonXMLBodyText(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.component.nonXMLBody.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentHasNonXMLBodyText(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Non XML Body Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasNonXMLBodyText(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.component.nonXMLBody.text.oclIsUndefined()
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentHasNonXMLBodyText(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY_TEXT,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentHasNonXMLBodyText"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentHasTextReferenceOrRepresentation(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Text Reference Or Representation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasTextReferenceOrRepresentation(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_TEXT_REFERENCE_OR_REPRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(not self.component.nonXMLBody.text.reference.oclIsUndefined() and self.component.nonXMLBody.text.reference.isDefined('value')) or (self.component.nonXMLBody.text.representation = datatypes::BinaryDataEncoding::B64 and self.component.nonXMLBody.text.isDefined('mediaType') and self.component.nonXMLBody.text.getText().size() > 0)";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentHasTextReferenceOrRepresentation(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Text Reference Or Representation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasTextReferenceOrRepresentation(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_TEXT_REFERENCE_OR_REPRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (not self.component.nonXMLBody.text.reference.oclIsUndefined() and self.component.nonXMLBody.text.reference.isDefined('value')) or (self.component.nonXMLBody.text.representation = datatypes::BinaryDataEncoding::B64 and self.component.nonXMLBody.text.isDefined('mediaType') and self.component.nonXMLBody.text.getText().size() > 0)
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentHasTextReferenceOrRepresentation(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_TEXT_REFERENCE_OR_REPRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_TEXT_REFERENCE_OR_REPRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_TEXT_REFERENCE_OR_REPRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_TEXT_REFERENCE_OR_REPRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_TEXT_REFERENCE_OR_REPRESENTATION,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentHasTextReferenceOrRepresentation"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentHasTextMediaTypeValueSet(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Text Media Type Value Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasTextMediaTypeValueSet(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_TEXT_MEDIA_TYPE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component.nonXMLBody.text.isDefined('mediaType') implies (self.component.nonXMLBody.text.mediaType = 'application/msword' or self.component.nonXMLBody.text.mediaType = 'application/pdf' or self.component.nonXMLBody.text.mediaType = 'text/plain' or self.component.nonXMLBody.text.mediaType = 'text/rtf' or self.component.nonXMLBody.text.mediaType = 'text/html' or self.component.nonXMLBody.text.mediaType = 'image/gif' or self.component.nonXMLBody.text.mediaType = 'image/tiff' or self.component.nonXMLBody.text.mediaType = 'image/jpeg' or self.component.nonXMLBody.text.mediaType = 'image/png')";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentHasTextMediaTypeValueSet(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Text Media Type Value Set</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentHasTextMediaTypeValueSet(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_TEXT_MEDIA_TYPE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.component.nonXMLBody.text.isDefined('mediaType') implies (self.component.nonXMLBody.text.mediaType = 'application/msword' or self.component.nonXMLBody.text.mediaType = 'application/pdf' or self.component.nonXMLBody.text.mediaType = 'text/plain' or self.component.nonXMLBody.text.mediaType = 'text/rtf' or self.component.nonXMLBody.text.mediaType = 'text/html' or self.component.nonXMLBody.text.mediaType = 'image/gif' or self.component.nonXMLBody.text.mediaType = 'image/tiff' or self.component.nonXMLBody.text.mediaType = 'image/jpeg' or self.component.nonXMLBody.text.mediaType = 'image/png')
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentHasTextMediaTypeValueSet(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_TEXT_MEDIA_TYPE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_TEXT_MEDIA_TYPE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_TEXT_MEDIA_TYPE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_TEXT_MEDIA_TYPE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_TEXT_MEDIA_TYPE_VALUE_SET,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentHasTextMediaTypeValueSet"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentTemplateId(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentTemplateId(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.19.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentTemplateId(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentTemplateId(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.19.1')
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentTemplateId(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentTemplateId"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentRealmCode(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Realm Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentRealmCode(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.realmCode->isEmpty() or self.realmCode->exists(element | element.isNullFlavorUndefined())) implies (self.realmCode->size() = 1 and self.realmCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = element.oclAsType(datatypes::CS) in " + "value.code = 'US'))";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentRealmCode(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Realm Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentRealmCode(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.realmCode->isEmpty() or self.realmCode->exists(element | element.isNullFlavorUndefined())) implies (self.realmCode->size() = 1 and self.realmCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = element.oclAsType(datatypes::CS) in 
	 * value.code = 'US'))
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentRealmCode(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_REALM_CODE,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentRealmCode"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentTypeId(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Type Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentTypeId(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.typeId.oclIsUndefined() or self.typeId.isNullFlavorUndefined()) implies (not self.typeId.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentTypeId(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Type Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentTypeId(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.typeId.oclIsUndefined() or self.typeId.isNullFlavorUndefined()) implies (not self.typeId.oclIsUndefined())
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentTypeId(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_TYPE_ID,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentTypeId"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentId(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentId(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id.oclIsUndefined() or self.id.isNullFlavorUndefined()) implies (not self.id.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentId(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentId(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id.oclIsUndefined() or self.id.isNullFlavorUndefined()) implies (not self.id.oclIsUndefined())
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentId(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_ID,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentId"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentCode(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentCode(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentCode(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentCode(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentCode(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_CODE,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentCode"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentTitle(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentTitle(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentTitle(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentTitle(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentTitle(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_TITLE,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentTitle"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentEffectiveTime(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentEffectiveTime(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentEffectiveTime(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentEffectiveTime(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentEffectiveTime(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_EFFECTIVE_TIME,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentEffectiveTime"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredOrScannedDocumentLanguageCode(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Language Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentLanguageCode(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.languageCode.oclIsUndefined() or self.languageCode.isNullFlavorUndefined()) implies (not self.languageCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredOrScannedDocumentLanguageCode(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Language Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredOrScannedDocumentLanguageCode(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.languageCode.oclIsUndefined() or self.languageCode.isNullFlavorUndefined()) implies (not self.languageCode.oclIsUndefined())
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredOrScannedDocumentLanguageCode(
			UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_LANGUAGE_CODE,
					ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentLanguageCode"),
					new Object[] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

} // UnstructuredOrScannedDocumentOperations
