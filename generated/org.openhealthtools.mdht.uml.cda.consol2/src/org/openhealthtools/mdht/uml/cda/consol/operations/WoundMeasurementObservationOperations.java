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

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.WoundMeasurementObservation;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Wound Measurement Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundMeasurementObservation#validateWoundMeasurementObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Measurement Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundMeasurementObservation#validateWoundMeasurementObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Measurement Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundMeasurementObservation#validateWoundMeasurementObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Measurement Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundMeasurementObservation#validateWoundMeasurementObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Measurement Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundMeasurementObservation#validateWoundMeasurementObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Measurement Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundMeasurementObservation#validateWoundMeasurementObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Measurement Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundMeasurementObservation#validateWoundMeasurementObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Measurement Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundMeasurementObservation#validateWoundMeasurementObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Measurement Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundMeasurementObservation#validateWoundMeasurementObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Measurement Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundMeasurementObservation#validateWoundMeasurementObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Measurement Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WoundMeasurementObservationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WoundMeasurementObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateWoundMeasurementObservationTemplateId(WoundMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Measurement Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundMeasurementObservationTemplateId(WoundMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_WOUND_MEASUREMENT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.133')";

	/**
	 * The cached OCL invariant for the '{@link #validateWoundMeasurementObservationTemplateId(WoundMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Measurement Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundMeasurementObservationTemplateId(WoundMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_WOUND_MEASUREMENT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param woundMeasurementObservation The receiving '<em><b>Wound Measurement Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateWoundMeasurementObservationTemplateId(
			WoundMeasurementObservation woundMeasurementObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_WOUND_MEASUREMENT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.WOUND_MEASUREMENT_OBSERVATION);
			try {
				VALIDATE_WOUND_MEASUREMENT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_WOUND_MEASUREMENT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_WOUND_MEASUREMENT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			woundMeasurementObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.WOUND_MEASUREMENT_OBSERVATION__WOUND_MEASUREMENT_OBSERVATION_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("WoundMeasurementObservationWoundMeasurementObservationTemplateId"),
					new Object[] { woundMeasurementObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateWoundMeasurementObservationClassCode(WoundMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Measurement Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundMeasurementObservationClassCode(WoundMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_WOUND_MEASUREMENT_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateWoundMeasurementObservationClassCode(WoundMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Measurement Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundMeasurementObservationClassCode(WoundMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_WOUND_MEASUREMENT_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param woundMeasurementObservation The receiving '<em><b>Wound Measurement Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateWoundMeasurementObservationClassCode(
			WoundMeasurementObservation woundMeasurementObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_WOUND_MEASUREMENT_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.WOUND_MEASUREMENT_OBSERVATION);
			try {
				VALIDATE_WOUND_MEASUREMENT_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_WOUND_MEASUREMENT_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_WOUND_MEASUREMENT_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			woundMeasurementObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.WOUND_MEASUREMENT_OBSERVATION__WOUND_MEASUREMENT_OBSERVATION_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("WoundMeasurementObservationWoundMeasurementObservationClassCode"),
					new Object[] { woundMeasurementObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateWoundMeasurementObservationMoodCode(WoundMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Measurement Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundMeasurementObservationMoodCode(WoundMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_WOUND_MEASUREMENT_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateWoundMeasurementObservationMoodCode(WoundMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Measurement Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundMeasurementObservationMoodCode(WoundMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_WOUND_MEASUREMENT_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param woundMeasurementObservation The receiving '<em><b>Wound Measurement Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateWoundMeasurementObservationMoodCode(
			WoundMeasurementObservation woundMeasurementObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_WOUND_MEASUREMENT_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.WOUND_MEASUREMENT_OBSERVATION);
			try {
				VALIDATE_WOUND_MEASUREMENT_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_WOUND_MEASUREMENT_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_WOUND_MEASUREMENT_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			woundMeasurementObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.WOUND_MEASUREMENT_OBSERVATION__WOUND_MEASUREMENT_OBSERVATION_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("WoundMeasurementObservationWoundMeasurementObservationMoodCode"),
					new Object[] { woundMeasurementObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateWoundMeasurementObservationId(WoundMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Measurement Observation Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundMeasurementObservationId(WoundMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_WOUND_MEASUREMENT_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateWoundMeasurementObservationId(WoundMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Measurement Observation Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundMeasurementObservationId(WoundMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_WOUND_MEASUREMENT_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param woundMeasurementObservation The receiving '<em><b>Wound Measurement Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateWoundMeasurementObservationId(
			WoundMeasurementObservation woundMeasurementObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_WOUND_MEASUREMENT_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.WOUND_MEASUREMENT_OBSERVATION);
			try {
				VALIDATE_WOUND_MEASUREMENT_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_WOUND_MEASUREMENT_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_WOUND_MEASUREMENT_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			woundMeasurementObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.WOUND_MEASUREMENT_OBSERVATION__WOUND_MEASUREMENT_OBSERVATION_ID,
					ConsolPlugin.INSTANCE.getString("WoundMeasurementObservationWoundMeasurementObservationId"),
					new Object[] { woundMeasurementObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateWoundMeasurementObservationCodeP(WoundMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Measurement Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundMeasurementObservationCodeP(WoundMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_WOUND_MEASUREMENT_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateWoundMeasurementObservationCodeP(WoundMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Measurement Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundMeasurementObservationCodeP(WoundMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_WOUND_MEASUREMENT_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param woundMeasurementObservation The receiving '<em><b>Wound Measurement Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateWoundMeasurementObservationCodeP(
			WoundMeasurementObservation woundMeasurementObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_WOUND_MEASUREMENT_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.WOUND_MEASUREMENT_OBSERVATION);
			try {
				VALIDATE_WOUND_MEASUREMENT_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_WOUND_MEASUREMENT_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_WOUND_MEASUREMENT_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			woundMeasurementObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.WOUND_MEASUREMENT_OBSERVATION__WOUND_MEASUREMENT_OBSERVATION_CODE_P,
					ConsolPlugin.INSTANCE.getString("WoundMeasurementObservationWoundMeasurementObservationCodeP"),
					new Object[] { woundMeasurementObservation }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.WoundMeasurementObservationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.WoundMeasurementObservationCodeP", passToken);
				}
				passToken.add(woundMeasurementObservation);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateWoundMeasurementObservationCode(WoundMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Measurement Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundMeasurementObservationCode(WoundMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_WOUND_MEASUREMENT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = '39125-0' or value.code = '39127-6' or value.code = '39126-8'))";

	/**
	 * The cached OCL invariant for the '{@link #validateWoundMeasurementObservationCode(WoundMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Measurement Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundMeasurementObservationCode(WoundMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_WOUND_MEASUREMENT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param woundMeasurementObservation The receiving '<em><b>Wound Measurement Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateWoundMeasurementObservationCode(
			WoundMeasurementObservation woundMeasurementObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.WoundMeasurementObservationCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(woundMeasurementObservation)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_WOUND_MEASUREMENT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.WOUND_MEASUREMENT_OBSERVATION);
			try {
				VALIDATE_WOUND_MEASUREMENT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_WOUND_MEASUREMENT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_WOUND_MEASUREMENT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			woundMeasurementObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.WOUND_MEASUREMENT_OBSERVATION__WOUND_MEASUREMENT_OBSERVATION_CODE,
					ConsolPlugin.INSTANCE.getString("WoundMeasurementObservationWoundMeasurementObservationCode"),
					new Object[] { woundMeasurementObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateWoundMeasurementObservationStatusCode(WoundMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Measurement Observation Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundMeasurementObservationStatusCode(WoundMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_WOUND_MEASUREMENT_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " + "value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateWoundMeasurementObservationStatusCode(WoundMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Measurement Observation Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundMeasurementObservationStatusCode(WoundMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_WOUND_MEASUREMENT_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param woundMeasurementObservation The receiving '<em><b>Wound Measurement Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateWoundMeasurementObservationStatusCode(
			WoundMeasurementObservation woundMeasurementObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_WOUND_MEASUREMENT_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.WOUND_MEASUREMENT_OBSERVATION);
			try {
				VALIDATE_WOUND_MEASUREMENT_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_WOUND_MEASUREMENT_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_WOUND_MEASUREMENT_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			woundMeasurementObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.WOUND_MEASUREMENT_OBSERVATION__WOUND_MEASUREMENT_OBSERVATION_STATUS_CODE,
					ConsolPlugin.INSTANCE.getString("WoundMeasurementObservationWoundMeasurementObservationStatusCode"),
					new Object[] { woundMeasurementObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateWoundMeasurementObservationStatusCodeP(WoundMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Measurement Observation Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundMeasurementObservationStatusCodeP(WoundMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_WOUND_MEASUREMENT_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateWoundMeasurementObservationStatusCodeP(WoundMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Measurement Observation Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundMeasurementObservationStatusCodeP(WoundMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_WOUND_MEASUREMENT_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param woundMeasurementObservation The receiving '<em><b>Wound Measurement Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateWoundMeasurementObservationStatusCodeP(
			WoundMeasurementObservation woundMeasurementObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_WOUND_MEASUREMENT_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.WOUND_MEASUREMENT_OBSERVATION);
			try {
				VALIDATE_WOUND_MEASUREMENT_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_WOUND_MEASUREMENT_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_WOUND_MEASUREMENT_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			woundMeasurementObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.WOUND_MEASUREMENT_OBSERVATION__WOUND_MEASUREMENT_OBSERVATION_STATUS_CODE_P,
					ConsolPlugin.INSTANCE.getString("WoundMeasurementObservationWoundMeasurementObservationStatusCodeP"),
					new Object[] { woundMeasurementObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateWoundMeasurementObservationEffectiveTime(WoundMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Measurement Observation Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundMeasurementObservationEffectiveTime(WoundMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_WOUND_MEASUREMENT_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateWoundMeasurementObservationEffectiveTime(WoundMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Measurement Observation Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundMeasurementObservationEffectiveTime(WoundMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_WOUND_MEASUREMENT_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param woundMeasurementObservation The receiving '<em><b>Wound Measurement Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateWoundMeasurementObservationEffectiveTime(
			WoundMeasurementObservation woundMeasurementObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_WOUND_MEASUREMENT_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.WOUND_MEASUREMENT_OBSERVATION);
			try {
				VALIDATE_WOUND_MEASUREMENT_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_WOUND_MEASUREMENT_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_WOUND_MEASUREMENT_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			woundMeasurementObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.WOUND_MEASUREMENT_OBSERVATION__WOUND_MEASUREMENT_OBSERVATION_EFFECTIVE_TIME,
					ConsolPlugin.INSTANCE.getString("WoundMeasurementObservationWoundMeasurementObservationEffectiveTime"),
					new Object[] { woundMeasurementObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateWoundMeasurementObservationValue(WoundMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Measurement Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundMeasurementObservationValue(WoundMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_WOUND_MEASUREMENT_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::PQ)))";

	/**
	 * The cached OCL invariant for the '{@link #validateWoundMeasurementObservationValue(WoundMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Measurement Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundMeasurementObservationValue(WoundMeasurementObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_WOUND_MEASUREMENT_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param woundMeasurementObservation The receiving '<em><b>Wound Measurement Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateWoundMeasurementObservationValue(
			WoundMeasurementObservation woundMeasurementObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_WOUND_MEASUREMENT_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.WOUND_MEASUREMENT_OBSERVATION);
			try {
				VALIDATE_WOUND_MEASUREMENT_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_WOUND_MEASUREMENT_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_WOUND_MEASUREMENT_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			woundMeasurementObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.WOUND_MEASUREMENT_OBSERVATION__WOUND_MEASUREMENT_OBSERVATION_VALUE,
					ConsolPlugin.INSTANCE.getString("WoundMeasurementObservationWoundMeasurementObservationValue"),
					new Object[] { woundMeasurementObservation }));
			}

			return false;
		}
		return true;
	}

} // WoundMeasurementObservationOperations
