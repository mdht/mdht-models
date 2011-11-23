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

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Unstructured Or Scanned Document</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Represented Custodian Organization Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Represented Custodian Organization Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Represented Custodian Organization Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentHasNonXMLBodyText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Non XML Body Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentHasTextReferenceOrRepresentation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Text Reference Or Representation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentHasTextMediaTypeValueSet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Text Media Type Value Set</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentLanguageCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Language Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentTypeId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnstructuredOrScannedDocumentOperations extends GeneralHeaderConstraintsOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnstructuredOrScannedDocumentOperations() {
		super();
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
	public static  boolean validateUnstructuredOrScannedDocumentTypeIdFixed(UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TYPE_ID_FIXED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TYPE_ID_FIXED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TYPE_ID_FIXED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TYPE_ID_FIXED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_TYPE_ID_FIXED,
						 ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentTypeIdFixed"),
						 new Object [] { unstructuredOrScannedDocument }));
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
	public static  boolean validateUnstructuredOrScannedDocumentHasOneRecordTarget(UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_ONE_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_ONE_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_ONE_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_ONE_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_ONE_RECORD_TARGET,
						 ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentHasOneRecordTarget"),
						 new Object [] { unstructuredOrScannedDocument }));
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
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.assignedAuthor.assignedPerson.oclIsUndefined() "+
"   or not author.assignedAuthor.representedOrganization.oclIsUndefined())";

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
	public static  boolean validateUnstructuredOrScannedDocumentHasAssignedAuthor(UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_ASSIGNED_AUTHOR,
						 ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentHasAssignedAuthor"),
						 new Object [] { unstructuredOrScannedDocument }));
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
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->forAll(target : cda::RecordTarget | not target.patientRole.oclIsUndefined()"+
"   and target.patientRole.id->forAll(roleId : datatypes::II | not roleId.root.oclIsUndefined()"+
"   and not roleId.extension.oclIsUndefined()))";

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
	public static  boolean validateUnstructuredOrScannedDocumentPatientRoleId(UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_PATIENT_ROLE_ID,
						 ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentPatientRoleId"),
						 new Object [] { unstructuredOrScannedDocument }));
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
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PATIENT_ROLE_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->exists(target : cda::RecordTarget | not target.patientRole.oclIsUndefined()"+
"   and target.patientRole.addr->exists(address : datatypes::AD | address.country->exists(c : datatypes::ADXP |"+
"   not c.oclIsUndefined() and c.getText().size() > 0)))";

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
	public static  boolean validateUnstructuredOrScannedDocumentHasPatientRoleAddress(UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PATIENT_ROLE_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PATIENT_ROLE_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PATIENT_ROLE_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PATIENT_ROLE_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PATIENT_ROLE_ADDRESS,
						 ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentHasPatientRoleAddress"),
						 new Object [] { unstructuredOrScannedDocument }));
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
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PATIENT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->exists(target : cda::RecordTarget | not target.patientRole.patient.oclIsUndefined()"+
"   and target.patientRole.patient.name->exists(name: datatypes::PN |"+
"      not name.given->isEmpty() and not name.family->isEmpty()))";

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
	public static  boolean validateUnstructuredOrScannedDocumentHasPatientName(UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PATIENT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PATIENT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PATIENT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PATIENT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PATIENT_NAME,
						 ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentHasPatientName"),
						 new Object [] { unstructuredOrScannedDocument }));
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
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PATIENT_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->one(target : cda::RecordTarget |"+
"   not target.patientRole.patient.administrativeGenderCode.oclIsUndefined())";

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
	public static  boolean validateUnstructuredOrScannedDocumentHasPatientGenderCode(UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PATIENT_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PATIENT_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PATIENT_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PATIENT_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PATIENT_GENDER_CODE,
						 ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentHasPatientGenderCode"),
						 new Object [] { unstructuredOrScannedDocument }));
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
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PATIENT_BIRTH_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->one(target : cda::RecordTarget |"+
"   not target.patientRole.patient.birthTime.oclIsUndefined())";

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
	public static  boolean validateUnstructuredOrScannedDocumentHasPatientBirthYear(UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PATIENT_BIRTH_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PATIENT_BIRTH_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PATIENT_BIRTH_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PATIENT_BIRTH_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PATIENT_BIRTH_YEAR,
						 ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentHasPatientBirthYear"),
						 new Object [] { unstructuredOrScannedDocument }));
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
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_ORIGINAL_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::ScanOriginalAuthor))";

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
	 * self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::ScanOriginalAuthor))
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateUnstructuredOrScannedDocumentHasOriginalAuthor(UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_ORIGINAL_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_ORIGINAL_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_ORIGINAL_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_ORIGINAL_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_ORIGINAL_AUTHOR,
						 ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentHasOriginalAuthor"),
						 new Object [] { unstructuredOrScannedDocument }));
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
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_SCANNING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::ScanningDevice))";

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
	 * self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::ScanningDevice))
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateUnstructuredOrScannedDocumentHasScanningDevice(UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_SCANNING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_SCANNING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_SCANNING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_SCANNING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_SCANNING_DEVICE,
						 ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentHasScanningDevice"),
						 new Object [] { unstructuredOrScannedDocument }));
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
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_SCAN_DATA_ENTERER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.dataEnterer.oclIsUndefined() and self.dataEnterer.oclIsKindOf(consol::ScanDataEnterer)";

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
	 * not self.dataEnterer.oclIsUndefined() and self.dataEnterer.oclIsKindOf(consol::ScanDataEnterer)
	 * @param unstructuredOrScannedDocument The receiving '<em><b>Unstructured Or Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateUnstructuredOrScannedDocumentHasScanDataEnterer(UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_SCAN_DATA_ENTERER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_SCAN_DATA_ENTERER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_SCAN_DATA_ENTERER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_SCAN_DATA_ENTERER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_SCAN_DATA_ENTERER,
						 ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentHasScanDataEnterer"),
						 new Object [] { unstructuredOrScannedDocument }));
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
	protected static final String VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.legalAuthenticator.assignedEntity.id->size() > 0 implies ("+
"   self.legalAuthenticator.assignedEntity.id->forAll(ident : datatypes::II |"+
"      not ident.root.oclIsUndefined() and not ident.extension.oclIsUndefined()))";

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
	public static  boolean validateUnstructuredOrScannedDocumentLegalAuthenticatorAssignedEntityId(UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ID,
						 ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentLegalAuthenticatorAssignedEntityId"),
						 new Object [] { unstructuredOrScannedDocument }));
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
	public static  boolean validateUnstructuredOrScannedDocumentHasNonXMLBody(UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY,
						 ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentHasNonXMLBody"),
						 new Object [] { unstructuredOrScannedDocument }));
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
	public static  boolean validateUnstructuredOrScannedDocumentHasNonXMLBodyBinaryText(UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY_BINARY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY_BINARY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY_BINARY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY_BINARY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY_BINARY_TEXT,
						 ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentHasNonXMLBodyBinaryText"),
						 new Object [] { unstructuredOrScannedDocument }));
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
	public static  boolean validateUnstructuredOrScannedDocumentHasNonXMLBodyTextMediaType(UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY_TEXT_MEDIA_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY_TEXT_MEDIA_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY_TEXT_MEDIA_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY_TEXT_MEDIA_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY_TEXT_MEDIA_TYPE,
						 ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentHasNonXMLBodyTextMediaType"),
						 new Object [] { unstructuredOrScannedDocument }));
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
	public static  boolean validateUnstructuredOrScannedDocumentHasNonXMLBodyTextRepresentation(UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY_TEXT_REPRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY_TEXT_REPRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY_TEXT_REPRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY_TEXT_REPRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY_TEXT_REPRESENTATION,
						 ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentHasNonXMLBodyTextRepresentation"),
						 new Object [] { unstructuredOrScannedDocument }));
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
	public static  boolean validateUnstructuredOrScannedDocumentNoStructuredData(UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_NO_STRUCTURED_DATA__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_NO_STRUCTURED_DATA__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_NO_STRUCTURED_DATA__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_NO_STRUCTURED_DATA__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_NO_STRUCTURED_DATA,
						 ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentNoStructuredData"),
						 new Object [] { unstructuredOrScannedDocument }));
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
	public static  boolean validateUnstructuredOrScannedDocumentOnePatientPerDocument(UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ONE_PATIENT_PER_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ONE_PATIENT_PER_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ONE_PATIENT_PER_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ONE_PATIENT_PER_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_ONE_PATIENT_PER_DOCUMENT,
						 ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentOnePatientPerDocument"),
						 new Object [] { unstructuredOrScannedDocument }));
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
	public static  boolean validateUnstructuredOrScannedDocumentPatientRoleHasId(UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_PATIENT_ROLE_HAS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_PATIENT_ROLE_HAS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_PATIENT_ROLE_HAS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_PATIENT_ROLE_HAS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_PATIENT_ROLE_HAS_ID,
						 ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentPatientRoleHasId"),
						 new Object [] { unstructuredOrScannedDocument }));
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
	public static  boolean validateUnstructuredOrScannedDocumentAssignedAuthorHasAddr(UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ASSIGNED_AUTHOR_HAS_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ASSIGNED_AUTHOR_HAS_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ASSIGNED_AUTHOR_HAS_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ASSIGNED_AUTHOR_HAS_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_ASSIGNED_AUTHOR_HAS_ADDR,
						 ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentAssignedAuthorHasAddr"),
						 new Object [] { unstructuredOrScannedDocument }));
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
	public static  boolean validateUnstructuredOrScannedDocumentAssignedAuthorHasTelecom(UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ASSIGNED_AUTHOR_HAS_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ASSIGNED_AUTHOR_HAS_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ASSIGNED_AUTHOR_HAS_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ASSIGNED_AUTHOR_HAS_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_ASSIGNED_AUTHOR_HAS_TELECOM,
						 ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentAssignedAuthorHasTelecom"),
						 new Object [] { unstructuredOrScannedDocument }));
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
	public static  boolean validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganization(UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION,
						 ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentHasRepresentedCustodianOrganization"),
						 new Object [] { unstructuredOrScannedDocument }));
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
	public static  boolean validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationId(UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_ID,
						 ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationId"),
						 new Object [] { unstructuredOrScannedDocument }));
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
	public static  boolean validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationName(UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_NAME,
						 ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationName"),
						 new Object [] { unstructuredOrScannedDocument }));
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
	public static  boolean validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationTelecom(UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_TELECOM,
						 ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationTelecom"),
						 new Object [] { unstructuredOrScannedDocument }));
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
	public static  boolean validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationAddr(UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_ADDR,
						 ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationAddr"),
						 new Object [] { unstructuredOrScannedDocument }));
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
	public static  boolean validateUnstructuredOrScannedDocumentHasNonXMLBodyText(UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY_TEXT,
						 ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentHasNonXMLBodyText"),
						 new Object [] { unstructuredOrScannedDocument }));
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
	public static  boolean validateUnstructuredOrScannedDocumentHasTextReferenceOrRepresentation(UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_TEXT_REFERENCE_OR_REPRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_TEXT_REFERENCE_OR_REPRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_TEXT_REFERENCE_OR_REPRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_TEXT_REFERENCE_OR_REPRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_TEXT_REFERENCE_OR_REPRESENTATION,
						 ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentHasTextReferenceOrRepresentation"),
						 new Object [] { unstructuredOrScannedDocument }));
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
	public static  boolean validateUnstructuredOrScannedDocumentHasTextMediaTypeValueSet(UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_TEXT_MEDIA_TYPE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_TEXT_MEDIA_TYPE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_TEXT_MEDIA_TYPE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_TEXT_MEDIA_TYPE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_TEXT_MEDIA_TYPE_VALUE_SET,
						 ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentHasTextMediaTypeValueSet"),
						 new Object [] { unstructuredOrScannedDocument }));
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
	public static  boolean validateUnstructuredOrScannedDocumentCode(UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_CODE,
						 ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentCode"),
						 new Object [] { unstructuredOrScannedDocument }));
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
	public static  boolean validateUnstructuredOrScannedDocumentEffectiveTime(UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_EFFECTIVE_TIME,
						 ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentEffectiveTime"),
						 new Object [] { unstructuredOrScannedDocument }));
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
	public static  boolean validateUnstructuredOrScannedDocumentId(UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_ID,
						 ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentId"),
						 new Object [] { unstructuredOrScannedDocument }));
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
	public static  boolean validateUnstructuredOrScannedDocumentLanguageCode(UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_LANGUAGE_CODE,
						 ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentLanguageCode"),
						 new Object [] { unstructuredOrScannedDocument }));
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
	public static  boolean validateUnstructuredOrScannedDocumentTitle(UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_TITLE,
						 ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentTitle"),
						 new Object [] { unstructuredOrScannedDocument }));
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
	public static  boolean validateUnstructuredOrScannedDocumentTypeId(UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__UNSTRUCTURED_OR_SCANNED_DOCUMENT_TYPE_ID,
						 ConsolPlugin.INSTANCE.getString("UnstructuredOrScannedDocumentTypeId"),
						 new Object [] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTemplateId(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.19.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTemplateId(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(UnstructuredOrScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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
	public static  boolean validateGeneralHeaderConstraintsTemplateId(UnstructuredOrScannedDocument unstructuredOrScannedDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_OR_SCANNED_DOCUMENT);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(unstructuredOrScannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.UNSTRUCTURED_OR_SCANNED_DOCUMENT__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "GeneralHeaderConstraintsTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(unstructuredOrScannedDocument, context) }),
						 new Object [] { unstructuredOrScannedDocument }));
			}
			return false;
		}
		return true;
	}

} // UnstructuredOrScannedDocumentOperations