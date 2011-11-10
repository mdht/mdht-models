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
import org.openhealthtools.mdht.uml.cda.consol.ExternalReference;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>External Reference</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ExternalReference#validateExternalReferenceHasNoCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Reference Has No Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ExternalReference#validateExternalReferenceHasReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Reference Has Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ExternalReference#validateExternalReferenceHasReferenceExternalDocument(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Reference Has Reference External Document</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ExternalReference#validateExternalReferenceHasReferenceExternalDocumentID(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Reference Has Reference External Document ID</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ExternalReference#validateExternalReferenceHasReferenceExternalDocumentText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Reference Has Reference External Document Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ExternalReference#validateExternalReferenceTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Reference Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ExternalReference#validateExternalReferenceClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Reference Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ExternalReference#validateExternalReferenceMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Reference Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ExternalReference#validateExternalReferenceId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Reference Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ExternalReference#validateExternalReferenceText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Reference Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExternalReferenceOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalReferenceOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExternalReferenceHasNoCode(ExternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Reference Has No Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalReferenceHasNoCode(ExternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXTERNAL_REFERENCE_HAS_NO_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() implies self.code.nullFlavor = vocab::NullFlavor::NA";

	/**
	 * The cached OCL invariant for the '{@link #validateExternalReferenceHasNoCode(ExternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Reference Has No Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalReferenceHasNoCode(ExternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_EXTERNAL_REFERENCE_HAS_NO_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.code.oclIsUndefined() implies self.code.nullFlavor = vocab::NullFlavor::NA
	 * @param externalReference The receiving '<em><b>External Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateExternalReferenceHasNoCode(ExternalReference externalReference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_EXTERNAL_REFERENCE_HAS_NO_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.EXTERNAL_REFERENCE);
			try {
				VALIDATE_EXTERNAL_REFERENCE_HAS_NO_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EXTERNAL_REFERENCE_HAS_NO_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EXTERNAL_REFERENCE_HAS_NO_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			externalReference)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.EXTERNAL_REFERENCE__EXTERNAL_REFERENCE_HAS_NO_CODE,
					ConsolPlugin.INSTANCE.getString("ExternalReferenceHasNoCode"), new Object[] { externalReference }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExternalReferenceHasReference(ExternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Reference Has Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalReferenceHasReference(ExternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXTERNAL_REFERENCE_HAS_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->select(r| r.typeCode <> vocab::x_ActRelationshipExternalReference::REFR and r.typeCode <> vocab::x_ActRelationshipExternalReference::SPRT)->size() = 0";

	/**
	 * The cached OCL invariant for the '{@link #validateExternalReferenceHasReference(ExternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Reference Has Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalReferenceHasReference(ExternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_EXTERNAL_REFERENCE_HAS_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.reference->select(r| r.typeCode <> vocab::x_ActRelationshipExternalReference::REFR and r.typeCode <> vocab::x_ActRelationshipExternalReference::SPRT)->size() = 0
	 * @param externalReference The receiving '<em><b>External Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateExternalReferenceHasReference(ExternalReference externalReference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_EXTERNAL_REFERENCE_HAS_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.EXTERNAL_REFERENCE);
			try {
				VALIDATE_EXTERNAL_REFERENCE_HAS_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EXTERNAL_REFERENCE_HAS_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EXTERNAL_REFERENCE_HAS_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			externalReference)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.EXTERNAL_REFERENCE__EXTERNAL_REFERENCE_HAS_REFERENCE,
					ConsolPlugin.INSTANCE.getString("ExternalReferenceHasReference"),
					new Object[] { externalReference }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExternalReferenceHasReferenceExternalDocument(ExternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Reference Has Reference External Document</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalReferenceHasReferenceExternalDocument(ExternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXTERNAL_REFERENCE_HAS_REFERENCE_EXTERNAL_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference.externalDocument->select(ed | ed.classCode =  vocab::ActClassDocument::DOC and ed.moodCode =  vocab::ActMood::EVN )->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateExternalReferenceHasReferenceExternalDocument(ExternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Reference Has Reference External Document</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalReferenceHasReferenceExternalDocument(ExternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_EXTERNAL_REFERENCE_HAS_REFERENCE_EXTERNAL_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.reference.externalDocument->select(ed | ed.classCode =  vocab::ActClassDocument::DOC and ed.moodCode =  vocab::ActMood::EVN )->size() = 1
	 * @param externalReference The receiving '<em><b>External Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateExternalReferenceHasReferenceExternalDocument(ExternalReference externalReference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_EXTERNAL_REFERENCE_HAS_REFERENCE_EXTERNAL_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.EXTERNAL_REFERENCE);
			try {
				VALIDATE_EXTERNAL_REFERENCE_HAS_REFERENCE_EXTERNAL_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EXTERNAL_REFERENCE_HAS_REFERENCE_EXTERNAL_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_EXTERNAL_REFERENCE_HAS_REFERENCE_EXTERNAL_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			externalReference)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.EXTERNAL_REFERENCE__EXTERNAL_REFERENCE_HAS_REFERENCE_EXTERNAL_DOCUMENT,
					ConsolPlugin.INSTANCE.getString("ExternalReferenceHasReferenceExternalDocument"),
					new Object[] { externalReference }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExternalReferenceHasReferenceExternalDocumentID(ExternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Reference Has Reference External Document ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalReferenceHasReferenceExternalDocumentID(ExternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXTERNAL_REFERENCE_HAS_REFERENCE_EXTERNAL_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->select(  r | r.externalDocument.id->isEmpty() )->size() = 0";

	/**
	 * The cached OCL invariant for the '{@link #validateExternalReferenceHasReferenceExternalDocumentID(ExternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Reference Has Reference External Document ID</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalReferenceHasReferenceExternalDocumentID(ExternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_EXTERNAL_REFERENCE_HAS_REFERENCE_EXTERNAL_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.reference->select(  r | r.externalDocument.id->isEmpty() )->size() = 0
	 * @param externalReference The receiving '<em><b>External Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateExternalReferenceHasReferenceExternalDocumentID(ExternalReference externalReference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_EXTERNAL_REFERENCE_HAS_REFERENCE_EXTERNAL_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.EXTERNAL_REFERENCE);
			try {
				VALIDATE_EXTERNAL_REFERENCE_HAS_REFERENCE_EXTERNAL_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EXTERNAL_REFERENCE_HAS_REFERENCE_EXTERNAL_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_EXTERNAL_REFERENCE_HAS_REFERENCE_EXTERNAL_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			externalReference)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.EXTERNAL_REFERENCE__EXTERNAL_REFERENCE_HAS_REFERENCE_EXTERNAL_DOCUMENT_ID,
					ConsolPlugin.INSTANCE.getString("ExternalReferenceHasReferenceExternalDocumentID"),
					new Object[] { externalReference }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExternalReferenceHasReferenceExternalDocumentText(ExternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Reference Has Reference External Document Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalReferenceHasReferenceExternalDocumentText(ExternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXTERNAL_REFERENCE_HAS_REFERENCE_EXTERNAL_DOCUMENT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->select(  r | r.externalDocument.text.reference.oclIsUndefined()  )->size() = 0";

	/**
	 * The cached OCL invariant for the '{@link #validateExternalReferenceHasReferenceExternalDocumentText(ExternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Reference Has Reference External Document Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalReferenceHasReferenceExternalDocumentText(ExternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_EXTERNAL_REFERENCE_HAS_REFERENCE_EXTERNAL_DOCUMENT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.reference->select(  r | r.externalDocument.text.reference.oclIsUndefined()  )->size() = 0
	 * @param externalReference The receiving '<em><b>External Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateExternalReferenceHasReferenceExternalDocumentText(
			ExternalReference externalReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_EXTERNAL_REFERENCE_HAS_REFERENCE_EXTERNAL_DOCUMENT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.EXTERNAL_REFERENCE);
			try {
				VALIDATE_EXTERNAL_REFERENCE_HAS_REFERENCE_EXTERNAL_DOCUMENT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EXTERNAL_REFERENCE_HAS_REFERENCE_EXTERNAL_DOCUMENT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_EXTERNAL_REFERENCE_HAS_REFERENCE_EXTERNAL_DOCUMENT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			externalReference)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.EXTERNAL_REFERENCE__EXTERNAL_REFERENCE_HAS_REFERENCE_EXTERNAL_DOCUMENT_TEXT,
					ConsolPlugin.INSTANCE.getString("ExternalReferenceHasReferenceExternalDocumentText"),
					new Object[] { externalReference }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExternalReferenceTemplateId(ExternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Reference Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalReferenceTemplateId(ExternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXTERNAL_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.4')";

	/**
	 * The cached OCL invariant for the '{@link #validateExternalReferenceTemplateId(ExternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Reference Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalReferenceTemplateId(ExternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_EXTERNAL_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.4')
	 * @param externalReference The receiving '<em><b>External Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateExternalReferenceTemplateId(ExternalReference externalReference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_EXTERNAL_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.EXTERNAL_REFERENCE);
			try {
				VALIDATE_EXTERNAL_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EXTERNAL_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EXTERNAL_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			externalReference)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.EXTERNAL_REFERENCE__EXTERNAL_REFERENCE_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("ExternalReferenceTemplateId"), new Object[] { externalReference }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExternalReferenceClassCode(ExternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Reference Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalReferenceClassCode(ExternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXTERNAL_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";

	/**
	 * The cached OCL invariant for the '{@link #validateExternalReferenceClassCode(ExternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Reference Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalReferenceClassCode(ExternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_EXTERNAL_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.classCode=vocab::x_ActClassDocumentEntryAct::ACT
	 * @param externalReference The receiving '<em><b>External Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateExternalReferenceClassCode(ExternalReference externalReference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_EXTERNAL_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.EXTERNAL_REFERENCE);
			try {
				VALIDATE_EXTERNAL_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EXTERNAL_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EXTERNAL_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			externalReference)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.EXTERNAL_REFERENCE__EXTERNAL_REFERENCE_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("ExternalReferenceClassCode"), new Object[] { externalReference }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExternalReferenceMoodCode(ExternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Reference Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalReferenceMoodCode(ExternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXTERNAL_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateExternalReferenceMoodCode(ExternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Reference Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalReferenceMoodCode(ExternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_EXTERNAL_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_DocumentActMood::EVN
	 * @param externalReference The receiving '<em><b>External Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateExternalReferenceMoodCode(ExternalReference externalReference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_EXTERNAL_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.EXTERNAL_REFERENCE);
			try {
				VALIDATE_EXTERNAL_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EXTERNAL_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EXTERNAL_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			externalReference)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.EXTERNAL_REFERENCE__EXTERNAL_REFERENCE_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("ExternalReferenceMoodCode"), new Object[] { externalReference }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExternalReferenceId(ExternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Reference Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalReferenceId(ExternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXTERNAL_REFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateExternalReferenceId(ExternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Reference Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalReferenceId(ExternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_EXTERNAL_REFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
	 * @param externalReference The receiving '<em><b>External Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateExternalReferenceId(ExternalReference externalReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_EXTERNAL_REFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.EXTERNAL_REFERENCE);
			try {
				VALIDATE_EXTERNAL_REFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EXTERNAL_REFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EXTERNAL_REFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			externalReference)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.EXTERNAL_REFERENCE__EXTERNAL_REFERENCE_ID,
					ConsolPlugin.INSTANCE.getString("ExternalReferenceId"), new Object[] { externalReference }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExternalReferenceText(ExternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Reference Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalReferenceText(ExternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXTERNAL_REFERENCE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateExternalReferenceText(ExternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Reference Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalReferenceText(ExternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_EXTERNAL_REFERENCE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())
	 * @param externalReference The receiving '<em><b>External Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateExternalReferenceText(ExternalReference externalReference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_EXTERNAL_REFERENCE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.EXTERNAL_REFERENCE);
			try {
				VALIDATE_EXTERNAL_REFERENCE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EXTERNAL_REFERENCE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EXTERNAL_REFERENCE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			externalReference)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.EXTERNAL_REFERENCE__EXTERNAL_REFERENCE_TEXT,
					ConsolPlugin.INSTANCE.getString("ExternalReferenceText"), new Object[] { externalReference }));
			}
			return false;
		}
		return true;
	}

} // ExternalReferenceOperations
