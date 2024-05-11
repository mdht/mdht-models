/**
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;

import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.SexualOrientationObservation;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Sexual Orientation Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SexualOrientationObservation#validateSexualOrientationObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sexual Orientation Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SexualOrientationObservation#validateSexualOrientationObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sexual Orientation Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SexualOrientationObservation#validateSexualOrientationObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sexual Orientation Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SexualOrientationObservation#validateSexualOrientationObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sexual Orientation Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SexualOrientationObservation#validateSexualOrientationObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sexual Orientation Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SexualOrientationObservation#validateSexualOrientationObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sexual Orientation Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SexualOrientationObservation#validateSexualOrientationObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sexual Orientation Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SexualOrientationObservation#validateSexualOrientationObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sexual Orientation Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SexualOrientationObservation#validateSexualOrientationObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sexual Orientation Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SexualOrientationObservation#validateSexualOrientationObservationIVLTSLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sexual Orientation Observation IVLTS Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SexualOrientationObservation#validateSexualOrientationObservationIVLTSHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sexual Orientation Observation IVLTS High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SexualOrientationObservation#validateSocialHistoryObservationV4TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation V4 Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SexualOrientationObservationOperations extends SocialHistoryObservationV4Operations {

	protected static final ThreadLocal<OCL> EOCL_ENV = new ThreadLocal<OCL>() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SexualOrientationObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSexualOrientationObservationCodeP(SexualOrientationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sexual Orientation Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSexualOrientationObservationCodeP(SexualOrientationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSexualOrientationObservationCodeP(SexualOrientationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sexual Orientation Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSexualOrientationObservationCodeP(SexualOrientationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param sexualOrientationObservation The receiving '<em><b>Sexual Orientation Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSexualOrientationObservationCodeP(
			SexualOrientationObservation sexualOrientationObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "SexualOrientationObservationSexualOrientationObservationCodeP", "ERROR");

		if (VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SEXUAL_ORIENTATION_OBSERVATION);
			try {
				VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				sexualOrientationObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SEXUAL_ORIENTATION_OBSERVATION__SEXUAL_ORIENTATION_OBSERVATION_CODE_P,
						ConsolPlugin.INSTANCE.getString(
							"SexualOrientationObservationSexualOrientationObservationCodeP"),
						new Object[] { sexualOrientationObservation }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.SexualOrientationObservationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.SexualOrientationObservationCodeP", passToken);
				}
				passToken.add(sexualOrientationObservation);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSexualOrientationObservationCode(SexualOrientationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sexual Orientation Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSexualOrientationObservationCode(SexualOrientationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = '76690-7' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateSexualOrientationObservationCode(SexualOrientationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sexual Orientation Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSexualOrientationObservationCode(SexualOrientationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param sexualOrientationObservation The receiving '<em><b>Sexual Orientation Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSexualOrientationObservationCode(
			SexualOrientationObservation sexualOrientationObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.SexualOrientationObservationCodeP");
		if ((passToken instanceof Collection<?>) &&
				((Collection<?>) passToken).contains(sexualOrientationObservation)) {
			// I have a free pass to short-circuit
			return true;
		}

		DatatypesUtil.increment(context, "SexualOrientationObservationSexualOrientationObservationCode", "ERROR");

		if (VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SEXUAL_ORIENTATION_OBSERVATION);
			try {
				VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				sexualOrientationObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SEXUAL_ORIENTATION_OBSERVATION__SEXUAL_ORIENTATION_OBSERVATION_CODE,
						ConsolPlugin.INSTANCE.getString("SexualOrientationObservationSexualOrientationObservationCode"),
						new Object[] { sexualOrientationObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSexualOrientationObservationStatusCodeP(SexualOrientationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sexual Orientation Observation Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSexualOrientationObservationStatusCodeP(SexualOrientationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSexualOrientationObservationStatusCodeP(SexualOrientationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sexual Orientation Observation Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSexualOrientationObservationStatusCodeP(SexualOrientationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param sexualOrientationObservation The receiving '<em><b>Sexual Orientation Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSexualOrientationObservationStatusCodeP(
			SexualOrientationObservation sexualOrientationObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "SexualOrientationObservationSexualOrientationObservationStatusCodeP", "ERROR");

		if (VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SEXUAL_ORIENTATION_OBSERVATION);
			try {
				VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				sexualOrientationObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SEXUAL_ORIENTATION_OBSERVATION__SEXUAL_ORIENTATION_OBSERVATION_STATUS_CODE_P,
						ConsolPlugin.INSTANCE.getString(
							"SexualOrientationObservationSexualOrientationObservationStatusCodeP"),
						new Object[] { sexualOrientationObservation }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.SexualOrientationObservationStatusCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.consol.SexualOrientationObservationStatusCodeP", passToken);
				}
				passToken.add(sexualOrientationObservation);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSexualOrientationObservationStatusCode(SexualOrientationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sexual Orientation Observation Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSexualOrientationObservationStatusCode(SexualOrientationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and " +
			"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " + "value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateSexualOrientationObservationStatusCode(SexualOrientationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sexual Orientation Observation Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSexualOrientationObservationStatusCode(SexualOrientationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param sexualOrientationObservation The receiving '<em><b>Sexual Orientation Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSexualOrientationObservationStatusCode(
			SexualOrientationObservation sexualOrientationObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.SexualOrientationObservationStatusCodeP");
		if ((passToken instanceof Collection<?>) &&
				((Collection<?>) passToken).contains(sexualOrientationObservation)) {
			// I have a free pass to short-circuit
			return true;
		}

		DatatypesUtil.increment(context, "SexualOrientationObservationSexualOrientationObservationStatusCode", "ERROR");

		if (VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SEXUAL_ORIENTATION_OBSERVATION);
			try {
				VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				sexualOrientationObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SEXUAL_ORIENTATION_OBSERVATION__SEXUAL_ORIENTATION_OBSERVATION_STATUS_CODE,
						ConsolPlugin.INSTANCE.getString(
							"SexualOrientationObservationSexualOrientationObservationStatusCode"),
						new Object[] { sexualOrientationObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSexualOrientationObservationEffectiveTime(SexualOrientationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sexual Orientation Observation Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSexualOrientationObservationEffectiveTime(SexualOrientationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSexualOrientationObservationEffectiveTime(SexualOrientationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sexual Orientation Observation Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSexualOrientationObservationEffectiveTime(SexualOrientationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param sexualOrientationObservation The receiving '<em><b>Sexual Orientation Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSexualOrientationObservationEffectiveTime(
			SexualOrientationObservation sexualOrientationObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "SexualOrientationObservationSexualOrientationObservationEffectiveTime", "ERROR");

		if (VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SEXUAL_ORIENTATION_OBSERVATION);
			try {
				VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				sexualOrientationObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SEXUAL_ORIENTATION_OBSERVATION__SEXUAL_ORIENTATION_OBSERVATION_EFFECTIVE_TIME,
						ConsolPlugin.INSTANCE.getString(
							"SexualOrientationObservationSexualOrientationObservationEffectiveTime"),
						new Object[] { sexualOrientationObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSexualOrientationObservationValue(SexualOrientationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sexual Orientation Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSexualOrientationObservationValue(SexualOrientationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = element.oclAsType(datatypes::CD) in " +
			"value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '20430005' or value.code = '38628009' or value.code = '42035005' or value.code = '765288000')))";

	/**
	 * The cached OCL invariant for the '{@link #validateSexualOrientationObservationValue(SexualOrientationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sexual Orientation Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSexualOrientationObservationValue(SexualOrientationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param sexualOrientationObservation The receiving '<em><b>Sexual Orientation Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSexualOrientationObservationValue(
			SexualOrientationObservation sexualOrientationObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "SexualOrientationObservationSexualOrientationObservationValue", "ERROR");

		if (VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SEXUAL_ORIENTATION_OBSERVATION);
			try {
				VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				sexualOrientationObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SEXUAL_ORIENTATION_OBSERVATION__SEXUAL_ORIENTATION_OBSERVATION_VALUE,
						ConsolPlugin.INSTANCE.getString(
							"SexualOrientationObservationSexualOrientationObservationValue"),
						new Object[] { sexualOrientationObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSexualOrientationObservationValueP(SexualOrientationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sexual Orientation Observation Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSexualOrientationObservationValueP(SexualOrientationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateSexualOrientationObservationValueP(SexualOrientationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sexual Orientation Observation Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSexualOrientationObservationValueP(SexualOrientationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param sexualOrientationObservation The receiving '<em><b>Sexual Orientation Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSexualOrientationObservationValueP(
			SexualOrientationObservation sexualOrientationObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "SexualOrientationObservationSexualOrientationObservationValueP", "ERROR");

		if (VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SEXUAL_ORIENTATION_OBSERVATION);
			try {
				VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				sexualOrientationObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SEXUAL_ORIENTATION_OBSERVATION__SEXUAL_ORIENTATION_OBSERVATION_VALUE_P,
						ConsolPlugin.INSTANCE.getString(
							"SexualOrientationObservationSexualOrientationObservationValueP"),
						new Object[] { sexualOrientationObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSexualOrientationObservationClassCode(SexualOrientationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sexual Orientation Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSexualOrientationObservationClassCode(SexualOrientationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateSexualOrientationObservationClassCode(SexualOrientationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sexual Orientation Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSexualOrientationObservationClassCode(SexualOrientationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param sexualOrientationObservation The receiving '<em><b>Sexual Orientation Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSexualOrientationObservationClassCode(
			SexualOrientationObservation sexualOrientationObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "SexualOrientationObservationSexualOrientationObservationClassCode", "ERROR");

		if (VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SEXUAL_ORIENTATION_OBSERVATION);
			try {
				VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				sexualOrientationObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SEXUAL_ORIENTATION_OBSERVATION__SEXUAL_ORIENTATION_OBSERVATION_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString(
							"SexualOrientationObservationSexualOrientationObservationClassCode"),
						new Object[] { sexualOrientationObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSexualOrientationObservationMoodCode(SexualOrientationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sexual Orientation Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSexualOrientationObservationMoodCode(SexualOrientationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateSexualOrientationObservationMoodCode(SexualOrientationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sexual Orientation Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSexualOrientationObservationMoodCode(SexualOrientationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param sexualOrientationObservation The receiving '<em><b>Sexual Orientation Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSexualOrientationObservationMoodCode(
			SexualOrientationObservation sexualOrientationObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "SexualOrientationObservationSexualOrientationObservationMoodCode", "ERROR");

		if (VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SEXUAL_ORIENTATION_OBSERVATION);
			try {
				VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				sexualOrientationObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SEXUAL_ORIENTATION_OBSERVATION__SEXUAL_ORIENTATION_OBSERVATION_MOOD_CODE,
						ConsolPlugin.INSTANCE.getString(
							"SexualOrientationObservationSexualOrientationObservationMoodCode"),
						new Object[] { sexualOrientationObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSexualOrientationObservationIVLTSLow(SexualOrientationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sexual Orientation Observation IVLTS Low</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSexualOrientationObservationIVLTSLow(SexualOrientationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((low.oclIsUndefined() or low.isNullFlavorUndefined()) implies (not low.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateSexualOrientationObservationIVLTSLow(SexualOrientationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sexual Orientation Observation IVLTS Low</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSexualOrientationObservationIVLTSLow(SexualOrientationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param sexualOrientationObservation The receiving '<em><b>Sexual Orientation Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateSexualOrientationObservationIVLTSLow(
			SexualOrientationObservation sexualOrientationObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "SexualOrientationObservationSexualOrientationObservationIVLTSLow", "ERROR");

		if (VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SEXUAL_ORIENTATION_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			sexualOrientationObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.SEXUAL_ORIENTATION_OBSERVATION__SEXUAL_ORIENTATION_OBSERVATION_IVLTS_LOW,
							ConsolPlugin.INSTANCE.getString(
								"SexualOrientationObservationSexualOrientationObservationIVLTSLow"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSexualOrientationObservationIVLTSHigh(SexualOrientationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sexual Orientation Observation IVLTS High</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSexualOrientationObservationIVLTSHigh(SexualOrientationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((high.oclIsUndefined() or high.isNullFlavorUndefined()) implies (not high.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateSexualOrientationObservationIVLTSHigh(SexualOrientationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sexual Orientation Observation IVLTS High</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSexualOrientationObservationIVLTSHigh(SexualOrientationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param sexualOrientationObservation The receiving '<em><b>Sexual Orientation Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateSexualOrientationObservationIVLTSHigh(
			SexualOrientationObservation sexualOrientationObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "SexualOrientationObservationSexualOrientationObservationIVLTSHigh", "INFO");

		if (VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SEXUAL_ORIENTATION_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			sexualOrientationObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.SEXUAL_ORIENTATION_OBSERVATION__SEXUAL_ORIENTATION_OBSERVATION_IVLTS_HIGH,
							ConsolPlugin.INSTANCE.getString(
								"SexualOrientationObservationSexualOrientationObservationIVLTSHigh"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistoryObservationV4TemplateId(SexualOrientationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation V4 Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryObservationV4TemplateId(SexualOrientationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_OBSERVATION_V4_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.501' and id.extension = '2023-05-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistoryObservationV4TemplateId(SexualOrientationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation V4 Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistoryObservationV4TemplateId(SexualOrientationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SOCIAL_HISTORY_OBSERVATION_V4_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param sexualOrientationObservation The receiving '<em><b>Sexual Orientation Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSocialHistoryObservationV4TemplateId(
			SexualOrientationObservation sexualOrientationObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "SexualOrientationObservationSocialHistoryObservationV4TemplateId", "ERROR");

		if (VALIDATE_SOCIAL_HISTORY_OBSERVATION_V4_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SEXUAL_ORIENTATION_OBSERVATION);
			try {
				VALIDATE_SOCIAL_HISTORY_OBSERVATION_V4_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_SOCIAL_HISTORY_OBSERVATION_V4_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SOCIAL_HISTORY_OBSERVATION_V4_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				sexualOrientationObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SEXUAL_ORIENTATION_OBSERVATION__SOCIAL_HISTORY_OBSERVATION_V4_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString(
							"SexualOrientationObservationSocialHistoryObservationV4TemplateId"),
						new Object[] { sexualOrientationObservation }));
			}

			return false;
		}
		return true;
	}

} // SexualOrientationObservationOperations
