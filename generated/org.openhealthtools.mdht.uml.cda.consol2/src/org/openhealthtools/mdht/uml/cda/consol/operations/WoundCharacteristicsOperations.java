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
import org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristics;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Wound Characteristics</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristics#validateWoundCharacteristicsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristics Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristics#validateWoundCharacteristicsClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristics Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristics#validateWoundCharacteristicsMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristics Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristics#validateWoundCharacteristicsId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristics Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristics#validateWoundCharacteristicsCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristics Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristics#validateWoundCharacteristicsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristics Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristics#validateWoundCharacteristicsStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristics Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristics#validateWoundCharacteristicsStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristics Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristics#validateWoundCharacteristicsEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristics Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristics#validateWoundCharacteristicsValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristics Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristics#validateWoundCharacteristicsValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristics Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristics#validateWoundCharacteristicsCDCodeSystem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristics CD Code System</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WoundCharacteristicsOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WoundCharacteristicsOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateWoundCharacteristicsTemplateId(WoundCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristics Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundCharacteristicsTemplateId(WoundCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_WOUND_CHARACTERISTICS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.134')";

	/**
	 * The cached OCL invariant for the '{@link #validateWoundCharacteristicsTemplateId(WoundCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristics Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundCharacteristicsTemplateId(WoundCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_WOUND_CHARACTERISTICS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param woundCharacteristics The receiving '<em><b>Wound Characteristics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateWoundCharacteristicsTemplateId(WoundCharacteristics woundCharacteristics,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_WOUND_CHARACTERISTICS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.WOUND_CHARACTERISTICS);
			try {
				VALIDATE_WOUND_CHARACTERISTICS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_WOUND_CHARACTERISTICS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_WOUND_CHARACTERISTICS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			woundCharacteristics)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.WOUND_CHARACTERISTICS__WOUND_CHARACTERISTICS_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("WoundCharacteristicsTemplateId"),
					new Object[] { woundCharacteristics }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateWoundCharacteristicsClassCode(WoundCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristics Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundCharacteristicsClassCode(WoundCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_WOUND_CHARACTERISTICS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateWoundCharacteristicsClassCode(WoundCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristics Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundCharacteristicsClassCode(WoundCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_WOUND_CHARACTERISTICS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param woundCharacteristics The receiving '<em><b>Wound Characteristics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateWoundCharacteristicsClassCode(WoundCharacteristics woundCharacteristics,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_WOUND_CHARACTERISTICS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.WOUND_CHARACTERISTICS);
			try {
				VALIDATE_WOUND_CHARACTERISTICS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_WOUND_CHARACTERISTICS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_WOUND_CHARACTERISTICS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			woundCharacteristics)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.WOUND_CHARACTERISTICS__WOUND_CHARACTERISTICS_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("WoundCharacteristicsClassCode"),
					new Object[] { woundCharacteristics }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateWoundCharacteristicsMoodCode(WoundCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristics Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundCharacteristicsMoodCode(WoundCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_WOUND_CHARACTERISTICS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateWoundCharacteristicsMoodCode(WoundCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristics Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundCharacteristicsMoodCode(WoundCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_WOUND_CHARACTERISTICS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param woundCharacteristics The receiving '<em><b>Wound Characteristics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateWoundCharacteristicsMoodCode(WoundCharacteristics woundCharacteristics,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_WOUND_CHARACTERISTICS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.WOUND_CHARACTERISTICS);
			try {
				VALIDATE_WOUND_CHARACTERISTICS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_WOUND_CHARACTERISTICS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_WOUND_CHARACTERISTICS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			woundCharacteristics)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.WOUND_CHARACTERISTICS__WOUND_CHARACTERISTICS_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("WoundCharacteristicsMoodCode"),
					new Object[] { woundCharacteristics }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateWoundCharacteristicsId(WoundCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristics Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundCharacteristicsId(WoundCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_WOUND_CHARACTERISTICS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateWoundCharacteristicsId(WoundCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristics Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundCharacteristicsId(WoundCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_WOUND_CHARACTERISTICS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param woundCharacteristics The receiving '<em><b>Wound Characteristics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateWoundCharacteristicsId(WoundCharacteristics woundCharacteristics,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_WOUND_CHARACTERISTICS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.WOUND_CHARACTERISTICS);
			try {
				VALIDATE_WOUND_CHARACTERISTICS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_WOUND_CHARACTERISTICS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_WOUND_CHARACTERISTICS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			woundCharacteristics)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.WOUND_CHARACTERISTICS__WOUND_CHARACTERISTICS_ID,
					ConsolPlugin.INSTANCE.getString("WoundCharacteristicsId"), new Object[] { woundCharacteristics }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateWoundCharacteristicsCodeP(WoundCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristics Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundCharacteristicsCodeP(WoundCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_WOUND_CHARACTERISTICS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateWoundCharacteristicsCodeP(WoundCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristics Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundCharacteristicsCodeP(WoundCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_WOUND_CHARACTERISTICS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param woundCharacteristics The receiving '<em><b>Wound Characteristics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateWoundCharacteristicsCodeP(WoundCharacteristics woundCharacteristics,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_WOUND_CHARACTERISTICS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.WOUND_CHARACTERISTICS);
			try {
				VALIDATE_WOUND_CHARACTERISTICS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_WOUND_CHARACTERISTICS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_WOUND_CHARACTERISTICS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			woundCharacteristics)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.WOUND_CHARACTERISTICS__WOUND_CHARACTERISTICS_CODE_P,
					ConsolPlugin.INSTANCE.getString("WoundCharacteristicsCodeP"), new Object[] { woundCharacteristics }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristicsCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristicsCodeP", passToken);
				}
				passToken.add(woundCharacteristics);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateWoundCharacteristicsCode(WoundCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristics Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundCharacteristicsCode(WoundCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_WOUND_CHARACTERISTICS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " + "value.code = 'ASSERTION')";

	/**
	 * The cached OCL invariant for the '{@link #validateWoundCharacteristicsCode(WoundCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristics Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundCharacteristicsCode(WoundCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_WOUND_CHARACTERISTICS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param woundCharacteristics The receiving '<em><b>Wound Characteristics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateWoundCharacteristicsCode(WoundCharacteristics woundCharacteristics,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristicsCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(woundCharacteristics)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_WOUND_CHARACTERISTICS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.WOUND_CHARACTERISTICS);
			try {
				VALIDATE_WOUND_CHARACTERISTICS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_WOUND_CHARACTERISTICS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_WOUND_CHARACTERISTICS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			woundCharacteristics)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.WOUND_CHARACTERISTICS__WOUND_CHARACTERISTICS_CODE,
					ConsolPlugin.INSTANCE.getString("WoundCharacteristicsCode"), new Object[] { woundCharacteristics }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateWoundCharacteristicsStatusCode(WoundCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristics Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundCharacteristicsStatusCode(WoundCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_WOUND_CHARACTERISTICS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " + "value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateWoundCharacteristicsStatusCode(WoundCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristics Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundCharacteristicsStatusCode(WoundCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_WOUND_CHARACTERISTICS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param woundCharacteristics The receiving '<em><b>Wound Characteristics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateWoundCharacteristicsStatusCode(WoundCharacteristics woundCharacteristics,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_WOUND_CHARACTERISTICS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.WOUND_CHARACTERISTICS);
			try {
				VALIDATE_WOUND_CHARACTERISTICS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_WOUND_CHARACTERISTICS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_WOUND_CHARACTERISTICS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			woundCharacteristics)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.WOUND_CHARACTERISTICS__WOUND_CHARACTERISTICS_STATUS_CODE,
					ConsolPlugin.INSTANCE.getString("WoundCharacteristicsStatusCode"),
					new Object[] { woundCharacteristics }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateWoundCharacteristicsStatusCodeP(WoundCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristics Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundCharacteristicsStatusCodeP(WoundCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_WOUND_CHARACTERISTICS_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateWoundCharacteristicsStatusCodeP(WoundCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristics Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundCharacteristicsStatusCodeP(WoundCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_WOUND_CHARACTERISTICS_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param woundCharacteristics The receiving '<em><b>Wound Characteristics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateWoundCharacteristicsStatusCodeP(WoundCharacteristics woundCharacteristics,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_WOUND_CHARACTERISTICS_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.WOUND_CHARACTERISTICS);
			try {
				VALIDATE_WOUND_CHARACTERISTICS_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_WOUND_CHARACTERISTICS_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_WOUND_CHARACTERISTICS_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			woundCharacteristics)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.WOUND_CHARACTERISTICS__WOUND_CHARACTERISTICS_STATUS_CODE_P,
					ConsolPlugin.INSTANCE.getString("WoundCharacteristicsStatusCodeP"),
					new Object[] { woundCharacteristics }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateWoundCharacteristicsEffectiveTime(WoundCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristics Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundCharacteristicsEffectiveTime(WoundCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_WOUND_CHARACTERISTICS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateWoundCharacteristicsEffectiveTime(WoundCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristics Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundCharacteristicsEffectiveTime(WoundCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_WOUND_CHARACTERISTICS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param woundCharacteristics The receiving '<em><b>Wound Characteristics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateWoundCharacteristicsEffectiveTime(WoundCharacteristics woundCharacteristics,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_WOUND_CHARACTERISTICS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.WOUND_CHARACTERISTICS);
			try {
				VALIDATE_WOUND_CHARACTERISTICS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_WOUND_CHARACTERISTICS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_WOUND_CHARACTERISTICS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			woundCharacteristics)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.WOUND_CHARACTERISTICS__WOUND_CHARACTERISTICS_EFFECTIVE_TIME,
					ConsolPlugin.INSTANCE.getString("WoundCharacteristicsEffectiveTime"),
					new Object[] { woundCharacteristics }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateWoundCharacteristicsValue(WoundCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristics Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundCharacteristicsValue(WoundCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_WOUND_CHARACTERISTICS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.96' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateWoundCharacteristicsValue(WoundCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristics Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundCharacteristicsValue(WoundCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_WOUND_CHARACTERISTICS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param woundCharacteristics The receiving '<em><b>Wound Characteristics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateWoundCharacteristicsValue(WoundCharacteristics woundCharacteristics,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_WOUND_CHARACTERISTICS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.WOUND_CHARACTERISTICS);
			try {
				VALIDATE_WOUND_CHARACTERISTICS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_WOUND_CHARACTERISTICS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_WOUND_CHARACTERISTICS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			woundCharacteristics)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.WOUND_CHARACTERISTICS__WOUND_CHARACTERISTICS_VALUE,
					ConsolPlugin.INSTANCE.getString("WoundCharacteristicsValue"), new Object[] { woundCharacteristics }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateWoundCharacteristicsValueP(WoundCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristics Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundCharacteristicsValueP(WoundCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_WOUND_CHARACTERISTICS_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateWoundCharacteristicsValueP(WoundCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristics Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundCharacteristicsValueP(WoundCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_WOUND_CHARACTERISTICS_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param woundCharacteristics The receiving '<em><b>Wound Characteristics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateWoundCharacteristicsValueP(WoundCharacteristics woundCharacteristics,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_WOUND_CHARACTERISTICS_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.WOUND_CHARACTERISTICS);
			try {
				VALIDATE_WOUND_CHARACTERISTICS_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_WOUND_CHARACTERISTICS_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_WOUND_CHARACTERISTICS_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			woundCharacteristics)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.WOUND_CHARACTERISTICS__WOUND_CHARACTERISTICS_VALUE_P,
					ConsolPlugin.INSTANCE.getString("WoundCharacteristicsValueP"),
					new Object[] { woundCharacteristics }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateWoundCharacteristicsCDCodeSystem(WoundCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristics CD Code System</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundCharacteristicsCDCodeSystem(WoundCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_WOUND_CHARACTERISTICS_CD_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.code->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not codeSystem.oclIsUndefined() )))";

	/**
	 * The cached OCL invariant for the '{@link #validateWoundCharacteristicsCDCodeSystem(WoundCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristics CD Code System</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundCharacteristicsCDCodeSystem(WoundCharacteristics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_WOUND_CHARACTERISTICS_CD_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param woundCharacteristics The receiving '<em><b>Wound Characteristics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateWoundCharacteristicsCDCodeSystem(WoundCharacteristics woundCharacteristics,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_WOUND_CHARACTERISTICS_CD_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.WOUND_CHARACTERISTICS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_WOUND_CHARACTERISTICS_CD_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_WOUND_CHARACTERISTICS_CD_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_WOUND_CHARACTERISTICS_CD_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(woundCharacteristics);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.WOUND_CHARACTERISTICS__WOUND_CHARACTERISTICS_CD_CODE_SYSTEM,
						ConsolPlugin.INSTANCE.getString("WoundCharacteristicsCDCodeSystem"), new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

} // WoundCharacteristicsOperations
