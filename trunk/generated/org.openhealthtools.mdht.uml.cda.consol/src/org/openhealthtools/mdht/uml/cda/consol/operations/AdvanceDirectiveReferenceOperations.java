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

import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveReference;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.ReferenceOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Advance Directive Reference</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveReference#validateAdvanceDirectiveReferenceHasURL(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Reference Has URL</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveReference#validateAdvanceDirectiveReferenceHasMIMEType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Reference Has MIME Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveReference#validateAdvanceDirectiveReferenceExternalDocumentHasId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Reference External Document Has Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveReference#validateAdvanceDirectiveReferenceTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Reference Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveReference#validateAdvanceDirectiveReferenceTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Reference Type Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdvanceDirectiveReferenceOperations extends ReferenceOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdvanceDirectiveReferenceOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveReferenceHasURL(AdvanceDirectiveReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Reference Has URL</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveReferenceHasURL(AdvanceDirectiveReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_REFERENCE_HAS_URL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.externalDocument.text.reference.hasContent()";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveReferenceHasURL(AdvanceDirectiveReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Reference Has URL</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveReferenceHasURL(AdvanceDirectiveReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_REFERENCE_HAS_URL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.externalDocument.text.reference.hasContent()
	 * @param advanceDirectiveReference The receiving '<em><b>Advance Directive Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAdvanceDirectiveReferenceHasURL(AdvanceDirectiveReference advanceDirectiveReference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_REFERENCE_HAS_URL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_REFERENCE);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_REFERENCE_HAS_URL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_REFERENCE_HAS_URL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVANCE_DIRECTIVE_REFERENCE_HAS_URL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			advanceDirectiveReference)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ADVANCE_DIRECTIVE_REFERENCE__ADVANCE_DIRECTIVE_REFERENCE_HAS_URL,
					ConsolPlugin.INSTANCE.getString("AdvanceDirectiveReferenceHasURL"),
					new Object[] { advanceDirectiveReference }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveReferenceHasMIMEType(AdvanceDirectiveReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Reference Has MIME Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveReferenceHasMIMEType(AdvanceDirectiveReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_REFERENCE_HAS_MIME_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.externalDocument.text.isDefined('mediaType')";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveReferenceHasMIMEType(AdvanceDirectiveReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Reference Has MIME Type</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveReferenceHasMIMEType(AdvanceDirectiveReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_REFERENCE_HAS_MIME_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.externalDocument.text.isDefined('mediaType')
	 * @param advanceDirectiveReference The receiving '<em><b>Advance Directive Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAdvanceDirectiveReferenceHasMIMEType(
			AdvanceDirectiveReference advanceDirectiveReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_REFERENCE_HAS_MIME_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_REFERENCE);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_REFERENCE_HAS_MIME_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_REFERENCE_HAS_MIME_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVANCE_DIRECTIVE_REFERENCE_HAS_MIME_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			advanceDirectiveReference)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ADVANCE_DIRECTIVE_REFERENCE__ADVANCE_DIRECTIVE_REFERENCE_HAS_MIME_TYPE,
					ConsolPlugin.INSTANCE.getString("AdvanceDirectiveReferenceHasMIMEType"),
					new Object[] { advanceDirectiveReference }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveReferenceExternalDocumentHasId(AdvanceDirectiveReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Reference External Document Has Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveReferenceExternalDocumentHasId(AdvanceDirectiveReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_REFERENCE_EXTERNAL_DOCUMENT_HAS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.externalDocument.id->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveReferenceExternalDocumentHasId(AdvanceDirectiveReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Reference External Document Has Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveReferenceExternalDocumentHasId(AdvanceDirectiveReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_REFERENCE_EXTERNAL_DOCUMENT_HAS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.externalDocument.id->isEmpty()
	 * @param advanceDirectiveReference The receiving '<em><b>Advance Directive Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAdvanceDirectiveReferenceExternalDocumentHasId(
			AdvanceDirectiveReference advanceDirectiveReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_REFERENCE_EXTERNAL_DOCUMENT_HAS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_REFERENCE);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_REFERENCE_EXTERNAL_DOCUMENT_HAS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_REFERENCE_EXTERNAL_DOCUMENT_HAS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ADVANCE_DIRECTIVE_REFERENCE_EXTERNAL_DOCUMENT_HAS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			advanceDirectiveReference)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ADVANCE_DIRECTIVE_REFERENCE__ADVANCE_DIRECTIVE_REFERENCE_EXTERNAL_DOCUMENT_HAS_ID,
					ConsolPlugin.INSTANCE.getString("AdvanceDirectiveReferenceExternalDocumentHasId"),
					new Object[] { advanceDirectiveReference }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveReferenceTemplateId(AdvanceDirectiveReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Reference Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveReferenceTemplateId(AdvanceDirectiveReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.36')";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveReferenceTemplateId(AdvanceDirectiveReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Reference Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveReferenceTemplateId(AdvanceDirectiveReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.36')
	 * @param advanceDirectiveReference The receiving '<em><b>Advance Directive Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAdvanceDirectiveReferenceTemplateId(
			AdvanceDirectiveReference advanceDirectiveReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_REFERENCE);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVANCE_DIRECTIVE_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			advanceDirectiveReference)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ADVANCE_DIRECTIVE_REFERENCE__ADVANCE_DIRECTIVE_REFERENCE_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("AdvanceDirectiveReferenceTemplateId"),
					new Object[] { advanceDirectiveReference }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveReferenceTypeCode(AdvanceDirectiveReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Reference Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveReferenceTypeCode(AdvanceDirectiveReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('typeCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveReferenceTypeCode(AdvanceDirectiveReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Reference Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveReferenceTypeCode(AdvanceDirectiveReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * isDefined('typeCode')
	 * @param advanceDirectiveReference The receiving '<em><b>Advance Directive Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAdvanceDirectiveReferenceTypeCode(
			AdvanceDirectiveReference advanceDirectiveReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_REFERENCE);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVANCE_DIRECTIVE_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			advanceDirectiveReference)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ADVANCE_DIRECTIVE_REFERENCE__ADVANCE_DIRECTIVE_REFERENCE_TYPE_CODE,
					ConsolPlugin.INSTANCE.getString("AdvanceDirectiveReferenceTypeCode"),
					new Object[] { advanceDirectiveReference }));
			}
			return false;
		}
		return true;
	}

} // AdvanceDirectiveReferenceOperations
