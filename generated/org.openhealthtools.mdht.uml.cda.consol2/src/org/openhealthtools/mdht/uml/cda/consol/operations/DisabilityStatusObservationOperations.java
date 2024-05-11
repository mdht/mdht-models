/**
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservationV2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.DisabilityStatusObservation;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Disability Status Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DisabilityStatusObservation#validateDisabilityStatusObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disability Status Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DisabilityStatusObservation#validateDisabilityStatusObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disability Status Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DisabilityStatusObservation#validateDisabilityStatusObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disability Status Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DisabilityStatusObservation#validateDisabilityStatusObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disability Status Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DisabilityStatusObservation#validateDisabilityStatusObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disability Status Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DisabilityStatusObservation#validateDisabilityStatusObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disability Status Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DisabilityStatusObservation#validateDisabilityStatusObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disability Status Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DisabilityStatusObservation#validateDisabilityStatusObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disability Status Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DisabilityStatusObservation#validateDisabilityStatusObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disability Status Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DisabilityStatusObservation#validateDisabilityStatusObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disability Status Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DisabilityStatusObservation#validateDisabilityStatusObservationAssessmentScaleObservationV2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disability Status Observation Assessment Scale Observation V2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DisabilityStatusObservation#getAssessmentScaleObservationV2s() <em>Get Assessment Scale Observation V2s</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DisabilityStatusObservationOperations extends ClinicalStatementOperations {

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
	protected DisabilityStatusObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDisabilityStatusObservationTemplateId(DisabilityStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disability Status Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDisabilityStatusObservationTemplateId(DisabilityStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISABILITY_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.505' and id.extension = '2023-05-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateDisabilityStatusObservationTemplateId(DisabilityStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disability Status Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDisabilityStatusObservationTemplateId(DisabilityStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_DISABILITY_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param disabilityStatusObservation The receiving '<em><b>Disability Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDisabilityStatusObservationTemplateId(
			DisabilityStatusObservation disabilityStatusObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "DisabilityStatusObservationDisabilityStatusObservationTemplateId", "ERROR");

		if (VALIDATE_DISABILITY_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISABILITY_STATUS_OBSERVATION);
			try {
				VALIDATE_DISABILITY_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_DISABILITY_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_DISABILITY_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				disabilityStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DISABILITY_STATUS_OBSERVATION__DISABILITY_STATUS_OBSERVATION_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString(
							"DisabilityStatusObservationDisabilityStatusObservationTemplateId"),
						new Object[] { disabilityStatusObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDisabilityStatusObservationCodeP(DisabilityStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disability Status Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDisabilityStatusObservationCodeP(DisabilityStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISABILITY_STATUS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateDisabilityStatusObservationCodeP(DisabilityStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disability Status Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDisabilityStatusObservationCodeP(DisabilityStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_DISABILITY_STATUS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param disabilityStatusObservation The receiving '<em><b>Disability Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDisabilityStatusObservationCodeP(
			DisabilityStatusObservation disabilityStatusObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "DisabilityStatusObservationDisabilityStatusObservationCodeP", "ERROR");

		if (VALIDATE_DISABILITY_STATUS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISABILITY_STATUS_OBSERVATION);
			try {
				VALIDATE_DISABILITY_STATUS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_DISABILITY_STATUS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_DISABILITY_STATUS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				disabilityStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DISABILITY_STATUS_OBSERVATION__DISABILITY_STATUS_OBSERVATION_CODE_P,
						ConsolPlugin.INSTANCE.getString("DisabilityStatusObservationDisabilityStatusObservationCodeP"),
						new Object[] { disabilityStatusObservation }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.DisabilityStatusObservationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.DisabilityStatusObservationCodeP", passToken);
				}
				passToken.add(disabilityStatusObservation);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDisabilityStatusObservationCode(DisabilityStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disability Status Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDisabilityStatusObservationCode(DisabilityStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISABILITY_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = '89571-4' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateDisabilityStatusObservationCode(DisabilityStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disability Status Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDisabilityStatusObservationCode(DisabilityStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_DISABILITY_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param disabilityStatusObservation The receiving '<em><b>Disability Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDisabilityStatusObservationCode(
			DisabilityStatusObservation disabilityStatusObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.DisabilityStatusObservationCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(disabilityStatusObservation)) {
			// I have a free pass to short-circuit
			return true;
		}

		DatatypesUtil.increment(context, "DisabilityStatusObservationDisabilityStatusObservationCode", "ERROR");

		if (VALIDATE_DISABILITY_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISABILITY_STATUS_OBSERVATION);
			try {
				VALIDATE_DISABILITY_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_DISABILITY_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_DISABILITY_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				disabilityStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DISABILITY_STATUS_OBSERVATION__DISABILITY_STATUS_OBSERVATION_CODE,
						ConsolPlugin.INSTANCE.getString("DisabilityStatusObservationDisabilityStatusObservationCode"),
						new Object[] { disabilityStatusObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDisabilityStatusObservationStatusCodeP(DisabilityStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disability Status Observation Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDisabilityStatusObservationStatusCodeP(DisabilityStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISABILITY_STATUS_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateDisabilityStatusObservationStatusCodeP(DisabilityStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disability Status Observation Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDisabilityStatusObservationStatusCodeP(DisabilityStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_DISABILITY_STATUS_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param disabilityStatusObservation The receiving '<em><b>Disability Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDisabilityStatusObservationStatusCodeP(
			DisabilityStatusObservation disabilityStatusObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "DisabilityStatusObservationDisabilityStatusObservationStatusCodeP", "ERROR");

		if (VALIDATE_DISABILITY_STATUS_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISABILITY_STATUS_OBSERVATION);
			try {
				VALIDATE_DISABILITY_STATUS_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_DISABILITY_STATUS_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_DISABILITY_STATUS_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				disabilityStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DISABILITY_STATUS_OBSERVATION__DISABILITY_STATUS_OBSERVATION_STATUS_CODE_P,
						ConsolPlugin.INSTANCE.getString(
							"DisabilityStatusObservationDisabilityStatusObservationStatusCodeP"),
						new Object[] { disabilityStatusObservation }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.DisabilityStatusObservationStatusCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.consol.DisabilityStatusObservationStatusCodeP", passToken);
				}
				passToken.add(disabilityStatusObservation);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDisabilityStatusObservationStatusCode(DisabilityStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disability Status Observation Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDisabilityStatusObservationStatusCode(DisabilityStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISABILITY_STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and " +
			"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " + "value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateDisabilityStatusObservationStatusCode(DisabilityStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disability Status Observation Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDisabilityStatusObservationStatusCode(DisabilityStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_DISABILITY_STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param disabilityStatusObservation The receiving '<em><b>Disability Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDisabilityStatusObservationStatusCode(
			DisabilityStatusObservation disabilityStatusObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.DisabilityStatusObservationStatusCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(disabilityStatusObservation)) {
			// I have a free pass to short-circuit
			return true;
		}

		DatatypesUtil.increment(context, "DisabilityStatusObservationDisabilityStatusObservationStatusCode", "ERROR");

		if (VALIDATE_DISABILITY_STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISABILITY_STATUS_OBSERVATION);
			try {
				VALIDATE_DISABILITY_STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_DISABILITY_STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_DISABILITY_STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				disabilityStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DISABILITY_STATUS_OBSERVATION__DISABILITY_STATUS_OBSERVATION_STATUS_CODE,
						ConsolPlugin.INSTANCE.getString(
							"DisabilityStatusObservationDisabilityStatusObservationStatusCode"),
						new Object[] { disabilityStatusObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDisabilityStatusObservationEffectiveTime(DisabilityStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disability Status Observation Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDisabilityStatusObservationEffectiveTime(DisabilityStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISABILITY_STATUS_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateDisabilityStatusObservationEffectiveTime(DisabilityStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disability Status Observation Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDisabilityStatusObservationEffectiveTime(DisabilityStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_DISABILITY_STATUS_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param disabilityStatusObservation The receiving '<em><b>Disability Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDisabilityStatusObservationEffectiveTime(
			DisabilityStatusObservation disabilityStatusObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "DisabilityStatusObservationDisabilityStatusObservationEffectiveTime", "ERROR");

		if (VALIDATE_DISABILITY_STATUS_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISABILITY_STATUS_OBSERVATION);
			try {
				VALIDATE_DISABILITY_STATUS_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_DISABILITY_STATUS_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_DISABILITY_STATUS_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				disabilityStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DISABILITY_STATUS_OBSERVATION__DISABILITY_STATUS_OBSERVATION_EFFECTIVE_TIME,
						ConsolPlugin.INSTANCE.getString(
							"DisabilityStatusObservationDisabilityStatusObservationEffectiveTime"),
						new Object[] { disabilityStatusObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDisabilityStatusObservationValue(DisabilityStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disability Status Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDisabilityStatusObservationValue(DisabilityStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISABILITY_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = element.oclAsType(datatypes::CD) in " +
			"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA29240-1' or value.code = 'LA29241-9' or value.code = 'LA29242-7' or value.code = 'LA29243-5' or value.code = 'LA29244-3')))";

	/**
	 * The cached OCL invariant for the '{@link #validateDisabilityStatusObservationValue(DisabilityStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disability Status Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDisabilityStatusObservationValue(DisabilityStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_DISABILITY_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param disabilityStatusObservation The receiving '<em><b>Disability Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDisabilityStatusObservationValue(
			DisabilityStatusObservation disabilityStatusObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "DisabilityStatusObservationDisabilityStatusObservationValue", "ERROR");

		if (VALIDATE_DISABILITY_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISABILITY_STATUS_OBSERVATION);
			try {
				VALIDATE_DISABILITY_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_DISABILITY_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_DISABILITY_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				disabilityStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DISABILITY_STATUS_OBSERVATION__DISABILITY_STATUS_OBSERVATION_VALUE,
						ConsolPlugin.INSTANCE.getString("DisabilityStatusObservationDisabilityStatusObservationValue"),
						new Object[] { disabilityStatusObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDisabilityStatusObservationValueP(DisabilityStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disability Status Observation Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDisabilityStatusObservationValueP(DisabilityStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISABILITY_STATUS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() =  1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDisabilityStatusObservationValueP(DisabilityStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disability Status Observation Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDisabilityStatusObservationValueP(DisabilityStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_DISABILITY_STATUS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param disabilityStatusObservation The receiving '<em><b>Disability Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDisabilityStatusObservationValueP(
			DisabilityStatusObservation disabilityStatusObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "DisabilityStatusObservationDisabilityStatusObservationValueP", "ERROR");

		if (VALIDATE_DISABILITY_STATUS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISABILITY_STATUS_OBSERVATION);
			try {
				VALIDATE_DISABILITY_STATUS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_DISABILITY_STATUS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_DISABILITY_STATUS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				disabilityStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DISABILITY_STATUS_OBSERVATION__DISABILITY_STATUS_OBSERVATION_VALUE_P,
						ConsolPlugin.INSTANCE.getString("DisabilityStatusObservationDisabilityStatusObservationValueP"),
						new Object[] { disabilityStatusObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDisabilityStatusObservationClassCode(DisabilityStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disability Status Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDisabilityStatusObservationClassCode(DisabilityStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISABILITY_STATUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateDisabilityStatusObservationClassCode(DisabilityStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disability Status Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDisabilityStatusObservationClassCode(DisabilityStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_DISABILITY_STATUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param disabilityStatusObservation The receiving '<em><b>Disability Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDisabilityStatusObservationClassCode(
			DisabilityStatusObservation disabilityStatusObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "DisabilityStatusObservationDisabilityStatusObservationClassCode", "ERROR");

		if (VALIDATE_DISABILITY_STATUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISABILITY_STATUS_OBSERVATION);
			try {
				VALIDATE_DISABILITY_STATUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_DISABILITY_STATUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_DISABILITY_STATUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				disabilityStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DISABILITY_STATUS_OBSERVATION__DISABILITY_STATUS_OBSERVATION_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString(
							"DisabilityStatusObservationDisabilityStatusObservationClassCode"),
						new Object[] { disabilityStatusObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDisabilityStatusObservationMoodCode(DisabilityStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disability Status Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDisabilityStatusObservationMoodCode(DisabilityStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISABILITY_STATUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateDisabilityStatusObservationMoodCode(DisabilityStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disability Status Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDisabilityStatusObservationMoodCode(DisabilityStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_DISABILITY_STATUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param disabilityStatusObservation The receiving '<em><b>Disability Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDisabilityStatusObservationMoodCode(
			DisabilityStatusObservation disabilityStatusObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "DisabilityStatusObservationDisabilityStatusObservationMoodCode", "ERROR");

		if (VALIDATE_DISABILITY_STATUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISABILITY_STATUS_OBSERVATION);
			try {
				VALIDATE_DISABILITY_STATUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_DISABILITY_STATUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_DISABILITY_STATUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				disabilityStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DISABILITY_STATUS_OBSERVATION__DISABILITY_STATUS_OBSERVATION_MOOD_CODE,
						ConsolPlugin.INSTANCE.getString(
							"DisabilityStatusObservationDisabilityStatusObservationMoodCode"),
						new Object[] { disabilityStatusObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDisabilityStatusObservationAssessmentScaleObservationV2(DisabilityStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disability Status Observation Assessment Scale Observation V2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDisabilityStatusObservationAssessmentScaleObservationV2(DisabilityStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISABILITY_STATUS_OBSERVATION_ASSESSMENT_SCALE_OBSERVATION_V2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::AssessmentScaleObservationV2))";

	/**
	 * The cached OCL invariant for the '{@link #validateDisabilityStatusObservationAssessmentScaleObservationV2(DisabilityStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disability Status Observation Assessment Scale Observation V2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDisabilityStatusObservationAssessmentScaleObservationV2(DisabilityStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_DISABILITY_STATUS_OBSERVATION_ASSESSMENT_SCALE_OBSERVATION_V2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param disabilityStatusObservation The receiving '<em><b>Disability Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDisabilityStatusObservationAssessmentScaleObservationV2(
			DisabilityStatusObservation disabilityStatusObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "DisabilityStatusObservationDisabilityStatusObservationAssessmentScaleObservationV2", "INFO");

		if (VALIDATE_DISABILITY_STATUS_OBSERVATION_ASSESSMENT_SCALE_OBSERVATION_V2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISABILITY_STATUS_OBSERVATION);
			try {
				VALIDATE_DISABILITY_STATUS_OBSERVATION_ASSESSMENT_SCALE_OBSERVATION_V2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_DISABILITY_STATUS_OBSERVATION_ASSESSMENT_SCALE_OBSERVATION_V2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_DISABILITY_STATUS_OBSERVATION_ASSESSMENT_SCALE_OBSERVATION_V2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				disabilityStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DISABILITY_STATUS_OBSERVATION__DISABILITY_STATUS_OBSERVATION_ASSESSMENT_SCALE_OBSERVATION_V2,
						ConsolPlugin.INSTANCE.getString(
							"DisabilityStatusObservationDisabilityStatusObservationAssessmentScaleObservationV2"),
						new Object[] { disabilityStatusObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getAssessmentScaleObservationV2s(DisabilityStatusObservation) <em>Get Assessment Scale Observation V2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentScaleObservationV2s(DisabilityStatusObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ASSESSMENT_SCALE_OBSERVATION_V2S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AssessmentScaleObservationV2)).oclAsType(consol::AssessmentScaleObservationV2)";

	/**
	 * The cached OCL query for the '{@link #getAssessmentScaleObservationV2s(DisabilityStatusObservation) <em>Get Assessment Scale Observation V2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentScaleObservationV2s(DisabilityStatusObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ASSESSMENT_SCALE_OBSERVATION_V2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<AssessmentScaleObservationV2> getAssessmentScaleObservationV2s(
			DisabilityStatusObservation disabilityStatusObservation) {

		if (GET_ASSESSMENT_SCALE_OBSERVATION_V2S__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISABILITY_STATUS_OBSERVATION,
				ConsolPackage.Literals.DISABILITY_STATUS_OBSERVATION.getEAllOperations().get(62));
			try {
				GET_ASSESSMENT_SCALE_OBSERVATION_V2S__EOCL_QRY = helper.createQuery(
					GET_ASSESSMENT_SCALE_OBSERVATION_V2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_ASSESSMENT_SCALE_OBSERVATION_V2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<AssessmentScaleObservationV2> result = (Collection<AssessmentScaleObservationV2>) query.evaluate(
			disabilityStatusObservation);
		return new BasicEList.UnmodifiableEList<AssessmentScaleObservationV2>(result.size(), result.toArray());
	}

} // DisabilityStatusObservationOperations
