/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.cdt.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.cdt.CDTPackage;
import org.openhealthtools.mdht.uml.cda.cdt.CDTPlugin;
import org.openhealthtools.mdht.uml.cda.cdt.UnstructuredDocument;
import org.openhealthtools.mdht.uml.cda.cdt.util.CDTValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Unstructured Document</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.UnstructuredDocument#validateUnstructuredDocumentPatientRoleHasId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Patient Role Has Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.UnstructuredDocument#validateUnstructuredDocumentAssignedAuthorHasAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Assigned Author Has Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.UnstructuredDocument#validateUnstructuredDocumentAssignedAuthorHasTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Assigned Author Has Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.UnstructuredDocument#validateUnstructuredDocumentHasRepresentedCustodianOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Represented Custodian Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.UnstructuredDocument#validateUnstructuredDocumentHasRepresentedCustodianOrganizationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Represented Custodian Organization Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.UnstructuredDocument#validateUnstructuredDocumentHasRepresentedCustodianOrganizationName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Represented Custodian Organization Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.UnstructuredDocument#validateUnstructuredDocumentHasRepresentedCustodianOrganizationTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Represented Custodian Organization Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.UnstructuredDocument#validateUnstructuredDocumentHasRepresentedCustodianOrganizationAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Represented Custodian Organization Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.UnstructuredDocument#validateUnstructuredDocumentHasNonXMLBodyText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Non XML Body Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.UnstructuredDocument#validateUnstructuredDocumentHasTextReferenceOrRepresentation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Text Reference Or Representation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.UnstructuredDocument#validateUnstructuredDocumentHasTextMediaTypeValueSet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Text Media Type Value Set</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.UnstructuredDocument#validateUnstructuredDocumentEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.UnstructuredDocument#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
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
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentPatientRoleHasId(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Patient Role Has Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentPatientRoleHasId(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_PATIENT_ROLE_HAS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not recordTarget.patientRole.id->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentPatientRoleHasId(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Patient Role Has Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentPatientRoleHasId(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_PATIENT_ROLE_HAS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not recordTarget.patientRole.id->isEmpty()
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentPatientRoleHasId(UnstructuredDocument unstructuredDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_PATIENT_ROLE_HAS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_PATIENT_ROLE_HAS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_PATIENT_ROLE_HAS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_DOCUMENT_PATIENT_ROLE_HAS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, CDTValidator.DIAGNOSTIC_SOURCE,
					CDTValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_PATIENT_ROLE_HAS_ID,
					CDTPlugin.INSTANCE.getString("UnstructuredDocumentPatientRoleHasId"),
					new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentAssignedAuthorHasAddr(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Assigned Author Has Addr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentAssignedAuthorHasAddr(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_ASSIGNED_AUTHOR_HAS_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not author.assignedAuthor.addr->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentAssignedAuthorHasAddr(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Assigned Author Has Addr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentAssignedAuthorHasAddr(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_ASSIGNED_AUTHOR_HAS_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not author.assignedAuthor.addr->isEmpty()
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentAssignedAuthorHasAddr(UnstructuredDocument unstructuredDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_ASSIGNED_AUTHOR_HAS_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_ASSIGNED_AUTHOR_HAS_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_ASSIGNED_AUTHOR_HAS_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_DOCUMENT_ASSIGNED_AUTHOR_HAS_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, CDTValidator.DIAGNOSTIC_SOURCE,
					CDTValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_ASSIGNED_AUTHOR_HAS_ADDR,
					CDTPlugin.INSTANCE.getString("UnstructuredDocumentAssignedAuthorHasAddr"),
					new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentAssignedAuthorHasTelecom(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Assigned Author Has Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentAssignedAuthorHasTelecom(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_ASSIGNED_AUTHOR_HAS_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not author.assignedAuthor.telecom->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentAssignedAuthorHasTelecom(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Assigned Author Has Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentAssignedAuthorHasTelecom(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_ASSIGNED_AUTHOR_HAS_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not author.assignedAuthor.telecom->isEmpty()
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentAssignedAuthorHasTelecom(
			UnstructuredDocument unstructuredDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_ASSIGNED_AUTHOR_HAS_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_ASSIGNED_AUTHOR_HAS_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_ASSIGNED_AUTHOR_HAS_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_DOCUMENT_ASSIGNED_AUTHOR_HAS_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, CDTValidator.DIAGNOSTIC_SOURCE,
					CDTValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_ASSIGNED_AUTHOR_HAS_TELECOM,
					CDTPlugin.INSTANCE.getString("UnstructuredDocumentAssignedAuthorHasTelecom"),
					new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentHasRepresentedCustodianOrganization(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Represented Custodian Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasRepresentedCustodianOrganization(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not custodian.assignedCustodian.representedCustodianOrganization.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentHasRepresentedCustodianOrganization(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Represented Custodian Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasRepresentedCustodianOrganization(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not custodian.assignedCustodian.representedCustodianOrganization.oclIsUndefined()
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentHasRepresentedCustodianOrganization(
			UnstructuredDocument unstructuredDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, CDTValidator.DIAGNOSTIC_SOURCE,
					CDTValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION,
					CDTPlugin.INSTANCE.getString("UnstructuredDocumentHasRepresentedCustodianOrganization"),
					new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentHasRepresentedCustodianOrganizationId(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Represented Custodian Organization Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasRepresentedCustodianOrganizationId(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not custodian.assignedCustodian.representedCustodianOrganization.id->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentHasRepresentedCustodianOrganizationId(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Represented Custodian Organization Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasRepresentedCustodianOrganizationId(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not custodian.assignedCustodian.representedCustodianOrganization.id->isEmpty()
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentHasRepresentedCustodianOrganizationId(
			UnstructuredDocument unstructuredDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					CDTValidator.DIAGNOSTIC_SOURCE,
					CDTValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_ID,
					CDTPlugin.INSTANCE.getString("UnstructuredDocumentHasRepresentedCustodianOrganizationId"),
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
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not custodian.assignedCustodian.representedCustodianOrganization.name.oclIsUndefined()";

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
	 * not custodian.assignedCustodian.representedCustodianOrganization.name.oclIsUndefined()
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
			helper.setContext(CDTPackage.Literals.UNSTRUCTURED_DOCUMENT);
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
					CDTValidator.DIAGNOSTIC_SOURCE,
					CDTValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_NAME,
					CDTPlugin.INSTANCE.getString("UnstructuredDocumentHasRepresentedCustodianOrganizationName"),
					new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentHasRepresentedCustodianOrganizationTelecom(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Represented Custodian Organization Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasRepresentedCustodianOrganizationTelecom(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not custodian.assignedCustodian.representedCustodianOrganization.telecom.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentHasRepresentedCustodianOrganizationTelecom(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Represented Custodian Organization Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasRepresentedCustodianOrganizationTelecom(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not custodian.assignedCustodian.representedCustodianOrganization.telecom.oclIsUndefined()
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentHasRepresentedCustodianOrganizationTelecom(
			UnstructuredDocument unstructuredDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					CDTValidator.DIAGNOSTIC_SOURCE,
					CDTValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_TELECOM,
					CDTPlugin.INSTANCE.getString("UnstructuredDocumentHasRepresentedCustodianOrganizationTelecom"),
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
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not custodian.assignedCustodian.representedCustodianOrganization.addr.oclIsUndefined()";

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
	 * not custodian.assignedCustodian.representedCustodianOrganization.addr.oclIsUndefined()
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
			helper.setContext(CDTPackage.Literals.UNSTRUCTURED_DOCUMENT);
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
					CDTValidator.DIAGNOSTIC_SOURCE,
					CDTValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_ADDR,
					CDTPlugin.INSTANCE.getString("UnstructuredDocumentHasRepresentedCustodianOrganizationAddr"),
					new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentHasNonXMLBodyText(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Non XML Body Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasNonXMLBodyText(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_NON_XML_BODY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.component.nonXMLBody.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentHasNonXMLBodyText(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Non XML Body Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasNonXMLBodyText(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_NON_XML_BODY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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
	public static boolean validateUnstructuredDocumentHasNonXMLBodyText(UnstructuredDocument unstructuredDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_NON_XML_BODY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_NON_XML_BODY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_NON_XML_BODY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_NON_XML_BODY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, CDTValidator.DIAGNOSTIC_SOURCE,
					CDTValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_HAS_NON_XML_BODY_TEXT,
					CDTPlugin.INSTANCE.getString("UnstructuredDocumentHasNonXMLBodyText"),
					new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentHasTextReferenceOrRepresentation(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Text Reference Or Representation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasTextReferenceOrRepresentation(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_TEXT_REFERENCE_OR_REPRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(not self.component.nonXMLBody.text.reference.oclIsUndefined() and self.component.nonXMLBody.text.reference.isDefined('value')) or (self.component.nonXMLBody.text.representation = datatypes::BinaryDataEncoding::B64 and self.component.nonXMLBody.text.isDefined('mediaType'))";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentHasTextReferenceOrRepresentation(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Text Reference Or Representation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasTextReferenceOrRepresentation(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_TEXT_REFERENCE_OR_REPRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (not self.component.nonXMLBody.text.reference.oclIsUndefined() and self.component.nonXMLBody.text.reference.isDefined('value')) or (self.component.nonXMLBody.text.representation = datatypes::BinaryDataEncoding::B64 and self.component.nonXMLBody.text.isDefined('mediaType'))
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentHasTextReferenceOrRepresentation(
			UnstructuredDocument unstructuredDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_TEXT_REFERENCE_OR_REPRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_TEXT_REFERENCE_OR_REPRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_TEXT_REFERENCE_OR_REPRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_TEXT_REFERENCE_OR_REPRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, CDTValidator.DIAGNOSTIC_SOURCE,
					CDTValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_HAS_TEXT_REFERENCE_OR_REPRESENTATION,
					CDTPlugin.INSTANCE.getString("UnstructuredDocumentHasTextReferenceOrRepresentation"),
					new Object[] { unstructuredDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentHasTextMediaTypeValueSet(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Text Media Type Value Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasTextMediaTypeValueSet(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_TEXT_MEDIA_TYPE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component.nonXMLBody.text.isDefined('mediaType') implies (self.component.nonXMLBody.text.mediaType = 'application/msword' or self.component.nonXMLBody.text.mediaType = 'application/pdf' or self.component.nonXMLBody.text.mediaType = 'text/plain' or self.component.nonXMLBody.text.mediaType = 'text/rtf' or self.component.nonXMLBody.text.mediaType = 'text/html' or self.component.nonXMLBody.text.mediaType = 'image/gif' or self.component.nonXMLBody.text.mediaType = 'image/tiff' or self.component.nonXMLBody.text.mediaType = 'image/jpeg' or self.component.nonXMLBody.text.mediaType = 'image/png')";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentHasTextMediaTypeValueSet(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Text Media Type Value Set</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentHasTextMediaTypeValueSet(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_TEXT_MEDIA_TYPE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.component.nonXMLBody.text.isDefined('mediaType') implies (self.component.nonXMLBody.text.mediaType = 'application/msword' or self.component.nonXMLBody.text.mediaType = 'application/pdf' or self.component.nonXMLBody.text.mediaType = 'text/plain' or self.component.nonXMLBody.text.mediaType = 'text/rtf' or self.component.nonXMLBody.text.mediaType = 'text/html' or self.component.nonXMLBody.text.mediaType = 'image/gif' or self.component.nonXMLBody.text.mediaType = 'image/tiff' or self.component.nonXMLBody.text.mediaType = 'image/jpeg' or self.component.nonXMLBody.text.mediaType = 'image/png')
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUnstructuredDocumentHasTextMediaTypeValueSet(
			UnstructuredDocument unstructuredDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_TEXT_MEDIA_TYPE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_TEXT_MEDIA_TYPE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_TEXT_MEDIA_TYPE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_TEXT_MEDIA_TYPE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, CDTValidator.DIAGNOSTIC_SOURCE,
					CDTValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_HAS_TEXT_MEDIA_TYPE_VALUE_SET,
					CDTPlugin.INSTANCE.getString("UnstructuredDocumentHasTextMediaTypeValueSet"),
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
			helper.setContext(CDTPackage.Literals.UNSTRUCTURED_DOCUMENT);
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
					Diagnostic.ERROR, CDTValidator.DIAGNOSTIC_SOURCE,
					CDTValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_EFFECTIVE_TIME,
					CDTPlugin.INSTANCE.getString("UnstructuredDocumentEffectiveTime"),
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
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.19.1')";

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
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.19.1')
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
			helper.setContext(CDTPackage.Literals.UNSTRUCTURED_DOCUMENT);
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
					Diagnostic.ERROR, CDTValidator.DIAGNOSTIC_SOURCE,
					CDTValidator.UNSTRUCTURED_DOCUMENT__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID,
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
