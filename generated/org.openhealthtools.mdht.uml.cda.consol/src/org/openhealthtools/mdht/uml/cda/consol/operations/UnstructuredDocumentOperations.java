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

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Unstructured Document</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentConfidentialityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Confidentiality Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentLanguageCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Language Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentTypeId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnstructuredDocumentOperations extends GeneralHeaderConstraintsOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnstructuredDocumentOperations() {
		super();
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
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_ORIGINAL_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::ScanOriginalAuthor))";

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
	 * self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::ScanOriginalAuthor))
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
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_SCANNING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::ScanningDevice))";

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
	 * self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::ScanningDevice))
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
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_SCAN_DATA_ENTERER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.dataEnterer.oclIsUndefined() and self.dataEnterer.oclIsKindOf(consol::ScanDataEnterer)";

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
	 * not self.dataEnterer.oclIsUndefined() and self.dataEnterer.oclIsKindOf(consol::ScanDataEnterer)
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
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTemplateId(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.62.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTemplateId(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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
	public static boolean validateGeneralHeaderConstraintsTemplateId(UnstructuredDocument unstructuredDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"GeneralHeaderConstraintsTemplateId",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									unstructuredDocument, context) }), new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

} // UnstructuredDocumentOperations
