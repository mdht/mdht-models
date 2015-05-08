/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.ExternalDocumentReference;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>External Document Reference</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ExternalDocumentReference#validateExternalDocumentReferenceTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ExternalDocumentReference#validateExternalDocumentReferenceClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ExternalDocumentReference#validateExternalDocumentReferenceMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ExternalDocumentReference#validateExternalDocumentReferenceCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ExternalDocumentReference#validateExternalDocumentReferenceCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ExternalDocumentReference#validateExternalDocumentReferenceReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ExternalDocumentReference#validateExternalDocumentReferenceReferenceExternalDocumentClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Reference External Document Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ExternalDocumentReference#validateExternalDocumentReferenceReferenceExternalDocumentMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Reference External Document Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ExternalDocumentReference#validateExternalDocumentReferenceReferenceExternalDocumentId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Reference External Document Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ExternalDocumentReference#validateExternalDocumentReferenceReferenceExternalDocumentCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Reference External Document Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ExternalDocumentReference#validateExternalDocumentReferenceReferenceExternalDocumentSetId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Reference External Document Set Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ExternalDocumentReference#validateExternalDocumentReferenceReferenceExternalDocumentVersionNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Reference External Document Version Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ExternalDocumentReference#validateExternalDocumentReferenceReferenceTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Reference Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ExternalDocumentReference#validateExternalDocumentReferenceReferenceExternalDocument(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Reference External Document</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExternalDocumentReferenceOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalDocumentReferenceOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExternalDocumentReferenceTemplateId(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalDocumentReferenceTemplateId(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.115')";

	/**
	 * The cached OCL invariant for the '{@link #validateExternalDocumentReferenceTemplateId(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalDocumentReferenceTemplateId(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param externalDocumentReference The receiving '<em><b>External Document Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateExternalDocumentReferenceTemplateId(
			ExternalDocumentReference externalDocumentReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.EXTERNAL_DOCUMENT_REFERENCE);
			try {
				VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			externalDocumentReference)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.EXTERNAL_DOCUMENT_REFERENCE__EXTERNAL_DOCUMENT_REFERENCE_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("ExternalDocumentReferenceExternalDocumentReferenceTemplateId"),
					new Object[] { externalDocumentReference }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExternalDocumentReferenceClassCode(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalDocumentReferenceClassCode(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateExternalDocumentReferenceClassCode(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalDocumentReferenceClassCode(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param externalDocumentReference The receiving '<em><b>External Document Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateExternalDocumentReferenceClassCode(
			ExternalDocumentReference externalDocumentReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.EXTERNAL_DOCUMENT_REFERENCE);
			try {
				VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			externalDocumentReference)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.EXTERNAL_DOCUMENT_REFERENCE__EXTERNAL_DOCUMENT_REFERENCE_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("ExternalDocumentReferenceExternalDocumentReferenceClassCode"),
					new Object[] { externalDocumentReference }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExternalDocumentReferenceMoodCode(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalDocumentReferenceMoodCode(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateExternalDocumentReferenceMoodCode(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalDocumentReferenceMoodCode(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param externalDocumentReference The receiving '<em><b>External Document Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateExternalDocumentReferenceMoodCode(
			ExternalDocumentReference externalDocumentReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.EXTERNAL_DOCUMENT_REFERENCE);
			try {
				VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			externalDocumentReference)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.EXTERNAL_DOCUMENT_REFERENCE__EXTERNAL_DOCUMENT_REFERENCE_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("ExternalDocumentReferenceExternalDocumentReferenceMoodCode"),
					new Object[] { externalDocumentReference }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExternalDocumentReferenceCodeP(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalDocumentReferenceCodeP(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateExternalDocumentReferenceCodeP(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalDocumentReferenceCodeP(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param externalDocumentReference The receiving '<em><b>External Document Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateExternalDocumentReferenceCodeP(ExternalDocumentReference externalDocumentReference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.EXTERNAL_DOCUMENT_REFERENCE);
			try {
				VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			externalDocumentReference)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.EXTERNAL_DOCUMENT_REFERENCE__EXTERNAL_DOCUMENT_REFERENCE_CODE_P,
					ConsolPlugin.INSTANCE.getString("ExternalDocumentReferenceExternalDocumentReferenceCodeP"),
					new Object[] { externalDocumentReference }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.ExternalDocumentReferenceCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.ExternalDocumentReferenceCodeP", passToken);
				}
				passToken.add(externalDocumentReference);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExternalDocumentReferenceCode(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalDocumentReferenceCode(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = 'DOCCLIN' and value.codeSystem = '2.16.840.1.113883.5.6')";

	/**
	 * The cached OCL invariant for the '{@link #validateExternalDocumentReferenceCode(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalDocumentReferenceCode(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param externalDocumentReference The receiving '<em><b>External Document Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateExternalDocumentReferenceCode(ExternalDocumentReference externalDocumentReference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.ExternalDocumentReferenceCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(externalDocumentReference)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.EXTERNAL_DOCUMENT_REFERENCE);
			try {
				VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			externalDocumentReference)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.EXTERNAL_DOCUMENT_REFERENCE__EXTERNAL_DOCUMENT_REFERENCE_CODE,
					ConsolPlugin.INSTANCE.getString("ExternalDocumentReferenceExternalDocumentReferenceCode"),
					new Object[] { externalDocumentReference }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExternalDocumentReferenceReference(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalDocumentReferenceReference(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->one(reference : cda::Reference | not reference.oclIsUndefined() and reference.oclIsKindOf(cda::Reference))";

	/**
	 * The cached OCL invariant for the '{@link #validateExternalDocumentReferenceReference(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalDocumentReferenceReference(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param externalDocumentReference The receiving '<em><b>External Document Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateExternalDocumentReferenceReference(
			ExternalDocumentReference externalDocumentReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.EXTERNAL_DOCUMENT_REFERENCE);
			try {
				VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			externalDocumentReference)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.EXTERNAL_DOCUMENT_REFERENCE__EXTERNAL_DOCUMENT_REFERENCE_REFERENCE,
					ConsolPlugin.INSTANCE.getString("ExternalDocumentReferenceExternalDocumentReferenceReference"),
					new Object[] { externalDocumentReference }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExternalDocumentReferenceReferenceExternalDocumentClassCode(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Reference External Document Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalDocumentReferenceReferenceExternalDocumentClassCode(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->excluding(null).externalDocument->excluding(null)->reject(classCode=vocab::ActClassDocument::DOCCLIN)";

	/**
	 * The cached OCL invariant for the '{@link #validateExternalDocumentReferenceReferenceExternalDocumentClassCode(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Reference External Document Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalDocumentReferenceReferenceExternalDocumentClassCode(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param externalDocumentReference The receiving '<em><b>External Document Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateExternalDocumentReferenceReferenceExternalDocumentClassCode(
			ExternalDocumentReference externalDocumentReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.EXTERNAL_DOCUMENT_REFERENCE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(externalDocumentReference);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.EXTERNAL_DOCUMENT_REFERENCE__EXTERNAL_DOCUMENT_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString("ExternalDocumentReferenceExternalDocumentReferenceReferenceExternalDocumentClassCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExternalDocumentReferenceReferenceExternalDocumentMoodCode(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Reference External Document Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalDocumentReferenceReferenceExternalDocumentMoodCode(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->excluding(null).externalDocument->excluding(null)->reject(isDefined('moodCode') and moodCode=vocab::ActMood::EVN)";

	/**
	 * The cached OCL invariant for the '{@link #validateExternalDocumentReferenceReferenceExternalDocumentMoodCode(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Reference External Document Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalDocumentReferenceReferenceExternalDocumentMoodCode(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param externalDocumentReference The receiving '<em><b>External Document Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateExternalDocumentReferenceReferenceExternalDocumentMoodCode(
			ExternalDocumentReference externalDocumentReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.EXTERNAL_DOCUMENT_REFERENCE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(externalDocumentReference);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.EXTERNAL_DOCUMENT_REFERENCE__EXTERNAL_DOCUMENT_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT_MOOD_CODE,
						ConsolPlugin.INSTANCE.getString("ExternalDocumentReferenceExternalDocumentReferenceReferenceExternalDocumentMoodCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExternalDocumentReferenceReferenceExternalDocumentId(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Reference External Document Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalDocumentReferenceReferenceExternalDocumentId(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->excluding(null).externalDocument->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (id->size() = 1))";

	/**
	 * The cached OCL invariant for the '{@link #validateExternalDocumentReferenceReferenceExternalDocumentId(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Reference External Document Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalDocumentReferenceReferenceExternalDocumentId(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param externalDocumentReference The receiving '<em><b>External Document Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateExternalDocumentReferenceReferenceExternalDocumentId(
			ExternalDocumentReference externalDocumentReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.EXTERNAL_DOCUMENT_REFERENCE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(externalDocumentReference);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.EXTERNAL_DOCUMENT_REFERENCE__EXTERNAL_DOCUMENT_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT_ID,
						ConsolPlugin.INSTANCE.getString("ExternalDocumentReferenceExternalDocumentReferenceReferenceExternalDocumentId"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExternalDocumentReferenceReferenceExternalDocumentCode(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Reference External Document Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalDocumentReferenceReferenceExternalDocumentCode(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->excluding(null).externalDocument->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateExternalDocumentReferenceReferenceExternalDocumentCode(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Reference External Document Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalDocumentReferenceReferenceExternalDocumentCode(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param externalDocumentReference The receiving '<em><b>External Document Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateExternalDocumentReferenceReferenceExternalDocumentCode(
			ExternalDocumentReference externalDocumentReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.EXTERNAL_DOCUMENT_REFERENCE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(externalDocumentReference);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.EXTERNAL_DOCUMENT_REFERENCE__EXTERNAL_DOCUMENT_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT_CODE,
						ConsolPlugin.INSTANCE.getString("ExternalDocumentReferenceExternalDocumentReferenceReferenceExternalDocumentCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExternalDocumentReferenceReferenceExternalDocumentSetId(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Reference External Document Set Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalDocumentReferenceReferenceExternalDocumentSetId(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->excluding(null).externalDocument->excluding(null)->reject((setId.oclIsUndefined() or setId.isNullFlavorUndefined()) implies (not setId.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateExternalDocumentReferenceReferenceExternalDocumentSetId(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Reference External Document Set Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalDocumentReferenceReferenceExternalDocumentSetId(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param externalDocumentReference The receiving '<em><b>External Document Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateExternalDocumentReferenceReferenceExternalDocumentSetId(
			ExternalDocumentReference externalDocumentReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.EXTERNAL_DOCUMENT_REFERENCE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(externalDocumentReference);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.EXTERNAL_DOCUMENT_REFERENCE__EXTERNAL_DOCUMENT_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT_SET_ID,
						ConsolPlugin.INSTANCE.getString("ExternalDocumentReferenceExternalDocumentReferenceReferenceExternalDocumentSetId"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExternalDocumentReferenceReferenceExternalDocumentVersionNumber(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Reference External Document Version Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalDocumentReferenceReferenceExternalDocumentVersionNumber(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->excluding(null).externalDocument->excluding(null)->reject((versionNumber.oclIsUndefined() or versionNumber.isNullFlavorUndefined()) implies (not versionNumber.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateExternalDocumentReferenceReferenceExternalDocumentVersionNumber(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Reference External Document Version Number</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalDocumentReferenceReferenceExternalDocumentVersionNumber(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param externalDocumentReference The receiving '<em><b>External Document Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateExternalDocumentReferenceReferenceExternalDocumentVersionNumber(
			ExternalDocumentReference externalDocumentReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.EXTERNAL_DOCUMENT_REFERENCE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(externalDocumentReference);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.EXTERNAL_DOCUMENT_REFERENCE__EXTERNAL_DOCUMENT_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT_VERSION_NUMBER,
						ConsolPlugin.INSTANCE.getString("ExternalDocumentReferenceExternalDocumentReferenceReferenceExternalDocumentVersionNumber"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExternalDocumentReferenceReferenceTypeCode(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Reference Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalDocumentReferenceReferenceTypeCode(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->excluding(null)->reject(typeCode=vocab::x_ActRelationshipExternalReference::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateExternalDocumentReferenceReferenceTypeCode(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Reference Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalDocumentReferenceReferenceTypeCode(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param externalDocumentReference The receiving '<em><b>External Document Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateExternalDocumentReferenceReferenceTypeCode(
			ExternalDocumentReference externalDocumentReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.EXTERNAL_DOCUMENT_REFERENCE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(externalDocumentReference);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.EXTERNAL_DOCUMENT_REFERENCE__EXTERNAL_DOCUMENT_REFERENCE_REFERENCE_TYPE_CODE,
						ConsolPlugin.INSTANCE.getString("ExternalDocumentReferenceExternalDocumentReferenceReferenceTypeCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExternalDocumentReferenceReferenceExternalDocument(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Reference External Document</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalDocumentReferenceReferenceExternalDocument(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->excluding(null)->reject(externalDocument->one(externalDocument : cda::ExternalDocument | not externalDocument.oclIsUndefined() and externalDocument.oclIsKindOf(cda::ExternalDocument)))";

	/**
	 * The cached OCL invariant for the '{@link #validateExternalDocumentReferenceReferenceExternalDocument(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate External Document Reference Reference External Document</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExternalDocumentReferenceReferenceExternalDocument(ExternalDocumentReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param externalDocumentReference The receiving '<em><b>External Document Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateExternalDocumentReferenceReferenceExternalDocument(
			ExternalDocumentReference externalDocumentReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.EXTERNAL_DOCUMENT_REFERENCE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_EXTERNAL_DOCUMENT_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(externalDocumentReference);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.EXTERNAL_DOCUMENT_REFERENCE__EXTERNAL_DOCUMENT_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT,
						ConsolPlugin.INSTANCE.getString("ExternalDocumentReferenceExternalDocumentReferenceReferenceExternalDocument"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

} // ExternalDocumentReferenceOperations
