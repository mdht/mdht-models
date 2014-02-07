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

import org.openhealthtools.mdht.uml.cda.consol.ActReference;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Act Reference</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ActReference#validateActReferenceTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Act Reference Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ActReference#validateActReferenceClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Act Reference Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ActReference#validateActReferenceMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Act Reference Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ActReference#validateActReferenceId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Act Reference Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ActReference#validateActReferenceCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Act Reference Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ActReference#validateActReferenceStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Act Reference Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ActReference#validateActReferenceStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Act Reference Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ActReference#validateActReferenceCDNullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Act Reference CD Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ActReference#validateActReferenceCDNullFlavorP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Act Reference CD Null Flavor P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActReferenceOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActReferenceOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateActReferenceTemplateId(ActReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Act Reference Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateActReferenceTemplateId(ActReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ACT_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.122')";

	/**
	 * The cached OCL invariant for the '{@link #validateActReferenceTemplateId(ActReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Act Reference Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateActReferenceTemplateId(ActReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ACT_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param actReference The receiving '<em><b>Act Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateActReferenceTemplateId(ActReference actReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ACT_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ACT_REFERENCE);
			try {
				VALIDATE_ACT_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ACT_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ACT_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			actReference)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ACT_REFERENCE__ACT_REFERENCE_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("ActReferenceTemplateId"), new Object[] { actReference }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateActReferenceClassCode(ActReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Act Reference Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateActReferenceClassCode(ActReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ACT_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";

	/**
	 * The cached OCL invariant for the '{@link #validateActReferenceClassCode(ActReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Act Reference Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateActReferenceClassCode(ActReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ACT_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param actReference The receiving '<em><b>Act Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateActReferenceClassCode(ActReference actReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ACT_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ACT_REFERENCE);
			try {
				VALIDATE_ACT_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ACT_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ACT_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(actReference)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ACT_REFERENCE__ACT_REFERENCE_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("ActReferenceClassCode"), new Object[] { actReference }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateActReferenceMoodCode(ActReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Act Reference Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateActReferenceMoodCode(ActReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ACT_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateActReferenceMoodCode(ActReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Act Reference Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateActReferenceMoodCode(ActReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ACT_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param actReference The receiving '<em><b>Act Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateActReferenceMoodCode(ActReference actReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ACT_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ACT_REFERENCE);
			try {
				VALIDATE_ACT_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ACT_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ACT_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(actReference)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ACT_REFERENCE__ACT_REFERENCE_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("ActReferenceMoodCode"), new Object[] { actReference }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateActReferenceId(ActReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Act Reference Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateActReferenceId(ActReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ACT_REFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (self.id->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateActReferenceId(ActReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Act Reference Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateActReferenceId(ActReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ACT_REFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param actReference The receiving '<em><b>Act Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateActReferenceId(ActReference actReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ACT_REFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ACT_REFERENCE);
			try {
				VALIDATE_ACT_REFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ACT_REFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ACT_REFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(actReference)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ACT_REFERENCE__ACT_REFERENCE_ID, ConsolPlugin.INSTANCE.getString("ActReferenceId"),
					new Object[] { actReference }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateActReferenceCode(ActReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Act Reference Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateActReferenceCode(ActReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ACT_REFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateActReferenceCode(ActReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Act Reference Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateActReferenceCode(ActReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ACT_REFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param actReference The receiving '<em><b>Act Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateActReferenceCode(ActReference actReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ACT_REFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ACT_REFERENCE);
			try {
				VALIDATE_ACT_REFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ACT_REFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ACT_REFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(actReference)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ACT_REFERENCE__ACT_REFERENCE_CODE,
					ConsolPlugin.INSTANCE.getString("ActReferenceCode"), new Object[] { actReference }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateActReferenceStatusCode(ActReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Act Reference Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateActReferenceStatusCode(ActReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ACT_REFERENCE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in "
			+ "not value.codeSystem.oclIsUndefined() or not value.codeSystemName.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateActReferenceStatusCode(ActReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Act Reference Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateActReferenceStatusCode(ActReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ACT_REFERENCE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param actReference The receiving '<em><b>Act Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateActReferenceStatusCode(ActReference actReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ACT_REFERENCE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ACT_REFERENCE);
			try {
				VALIDATE_ACT_REFERENCE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ACT_REFERENCE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ACT_REFERENCE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			actReference)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ACT_REFERENCE__ACT_REFERENCE_STATUS_CODE,
					ConsolPlugin.INSTANCE.getString("ActReferenceStatusCode"), new Object[] { actReference }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateActReferenceStatusCodeP(ActReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Act Reference Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateActReferenceStatusCodeP(ActReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ACT_REFERENCE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateActReferenceStatusCodeP(ActReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Act Reference Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateActReferenceStatusCodeP(ActReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ACT_REFERENCE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param actReference The receiving '<em><b>Act Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateActReferenceStatusCodeP(ActReference actReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ACT_REFERENCE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ACT_REFERENCE);
			try {
				VALIDATE_ACT_REFERENCE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ACT_REFERENCE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ACT_REFERENCE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			actReference)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ACT_REFERENCE__ACT_REFERENCE_STATUS_CODE_P,
					ConsolPlugin.INSTANCE.getString("ActReferenceStatusCodeP"), new Object[] { actReference }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateActReferenceCDNullFlavor(ActReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Act Reference CD Null Flavor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateActReferenceCDNullFlavor(ActReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ACT_REFERENCE_CD_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.code->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not nullFlavor.oclIsUndefined() and nullFlavor.oclIsKindOf(vocab::NullFlavor) and "
			+ "let value : vocab::NullFlavor = nullFlavor.oclAsType(vocab::NullFlavor) in "
			+ "value = vocab::NullFlavor::NP )))";

	/**
	 * The cached OCL invariant for the '{@link #validateActReferenceCDNullFlavor(ActReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Act Reference CD Null Flavor</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateActReferenceCDNullFlavor(ActReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_ACT_REFERENCE_CD_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param actReference The receiving '<em><b>Act Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateActReferenceCDNullFlavor(ActReference actReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ACT_REFERENCE_CD_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ACT_REFERENCE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_ACT_REFERENCE_CD_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ACT_REFERENCE_CD_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_ACT_REFERENCE_CD_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(actReference);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ACT_REFERENCE__ACT_REFERENCE_CD_NULL_FLAVOR,
						ConsolPlugin.INSTANCE.getString("ActReferenceCDNullFlavor"), new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateActReferenceCDNullFlavorP(ActReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Act Reference CD Null Flavor P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateActReferenceCDNullFlavorP(ActReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ACT_REFERENCE_CD_NULL_FLAVOR_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.code->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (isDefined('nullFlavor') )))";

	/**
	 * The cached OCL invariant for the '{@link #validateActReferenceCDNullFlavorP(ActReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Act Reference CD Null Flavor P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateActReferenceCDNullFlavorP(ActReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_ACT_REFERENCE_CD_NULL_FLAVOR_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param actReference The receiving '<em><b>Act Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateActReferenceCDNullFlavorP(ActReference actReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ACT_REFERENCE_CD_NULL_FLAVOR_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ACT_REFERENCE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_ACT_REFERENCE_CD_NULL_FLAVOR_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ACT_REFERENCE_CD_NULL_FLAVOR_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_ACT_REFERENCE_CD_NULL_FLAVOR_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(actReference);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ACT_REFERENCE__ACT_REFERENCE_CD_NULL_FLAVOR_P,
						ConsolPlugin.INSTANCE.getString("ActReferenceCDNullFlavorP"), new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

} // ActReferenceOperations
