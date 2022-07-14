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
import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ProgressTowardGoalObservation;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Progress Toward Goal Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressTowardGoalObservation#validateProgressTowardGoalObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Toward Goal Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressTowardGoalObservation#validateProgressTowardGoalObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Toward Goal Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressTowardGoalObservation#validateProgressTowardGoalObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Toward Goal Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressTowardGoalObservation#validateProgressTowardGoalObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Toward Goal Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressTowardGoalObservation#validateProgressTowardGoalObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Toward Goal Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressTowardGoalObservation#validateProgressTowardGoalObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Toward Goal Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressTowardGoalObservation#validateProgressTowardGoalObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Toward Goal Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressTowardGoalObservation#validateProgressTowardGoalObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Toward Goal Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressTowardGoalObservation#validateProgressTowardGoalObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Toward Goal Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressTowardGoalObservation#validateProgressTowardGoalObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Toward Goal Observation Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProgressTowardGoalObservationOperations extends ClinicalStatementOperations {
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
	protected ProgressTowardGoalObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressTowardGoalObservationTemplateId(ProgressTowardGoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Toward Goal Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressTowardGoalObservationTemplateId(ProgressTowardGoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.110')";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressTowardGoalObservationTemplateId(ProgressTowardGoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Toward Goal Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressTowardGoalObservationTemplateId(ProgressTowardGoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressTowardGoalObservation The receiving '<em><b>Progress Toward Goal Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProgressTowardGoalObservationTemplateId(
			ProgressTowardGoalObservation progressTowardGoalObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ProgressTowardGoalObservationProgressTowardGoalObservationTemplateId", "ERROR");

		if (VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_TOWARD_GOAL_OBSERVATION);
			try {
				VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				progressTowardGoalObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROGRESS_TOWARD_GOAL_OBSERVATION__PROGRESS_TOWARD_GOAL_OBSERVATION_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString(
							"ProgressTowardGoalObservationProgressTowardGoalObservationTemplateId"),
						new Object[] { progressTowardGoalObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressTowardGoalObservationClassCode(ProgressTowardGoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Toward Goal Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressTowardGoalObservationClassCode(ProgressTowardGoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressTowardGoalObservationClassCode(ProgressTowardGoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Toward Goal Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressTowardGoalObservationClassCode(ProgressTowardGoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressTowardGoalObservation The receiving '<em><b>Progress Toward Goal Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProgressTowardGoalObservationClassCode(
			ProgressTowardGoalObservation progressTowardGoalObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ProgressTowardGoalObservationProgressTowardGoalObservationClassCode", "ERROR");

		if (VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_TOWARD_GOAL_OBSERVATION);
			try {
				VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				progressTowardGoalObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROGRESS_TOWARD_GOAL_OBSERVATION__PROGRESS_TOWARD_GOAL_OBSERVATION_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString(
							"ProgressTowardGoalObservationProgressTowardGoalObservationClassCode"),
						new Object[] { progressTowardGoalObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressTowardGoalObservationMoodCode(ProgressTowardGoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Toward Goal Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressTowardGoalObservationMoodCode(ProgressTowardGoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressTowardGoalObservationMoodCode(ProgressTowardGoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Toward Goal Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressTowardGoalObservationMoodCode(ProgressTowardGoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressTowardGoalObservation The receiving '<em><b>Progress Toward Goal Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProgressTowardGoalObservationMoodCode(
			ProgressTowardGoalObservation progressTowardGoalObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProgressTowardGoalObservationProgressTowardGoalObservationMoodCode", "ERROR");

		if (VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_TOWARD_GOAL_OBSERVATION);
			try {
				VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				progressTowardGoalObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROGRESS_TOWARD_GOAL_OBSERVATION__PROGRESS_TOWARD_GOAL_OBSERVATION_MOOD_CODE,
						ConsolPlugin.INSTANCE.getString(
							"ProgressTowardGoalObservationProgressTowardGoalObservationMoodCode"),
						new Object[] { progressTowardGoalObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressTowardGoalObservationId(ProgressTowardGoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Toward Goal Observation Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressTowardGoalObservationId(ProgressTowardGoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (( not self.id->isEmpty()) )";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressTowardGoalObservationId(ProgressTowardGoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Toward Goal Observation Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressTowardGoalObservationId(ProgressTowardGoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressTowardGoalObservation The receiving '<em><b>Progress Toward Goal Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProgressTowardGoalObservationId(
			ProgressTowardGoalObservation progressTowardGoalObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProgressTowardGoalObservationProgressTowardGoalObservationId", "ERROR");

		if (VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_TOWARD_GOAL_OBSERVATION);
			try {
				VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				progressTowardGoalObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROGRESS_TOWARD_GOAL_OBSERVATION__PROGRESS_TOWARD_GOAL_OBSERVATION_ID,
						ConsolPlugin.INSTANCE.getString("ProgressTowardGoalObservationProgressTowardGoalObservationId"),
						new Object[] { progressTowardGoalObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressTowardGoalObservationCodeP(ProgressTowardGoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Toward Goal Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressTowardGoalObservationCodeP(ProgressTowardGoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressTowardGoalObservationCodeP(ProgressTowardGoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Toward Goal Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressTowardGoalObservationCodeP(ProgressTowardGoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressTowardGoalObservation The receiving '<em><b>Progress Toward Goal Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProgressTowardGoalObservationCodeP(
			ProgressTowardGoalObservation progressTowardGoalObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProgressTowardGoalObservationProgressTowardGoalObservationCodeP", "ERROR");

		if (VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_TOWARD_GOAL_OBSERVATION);
			try {
				VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				progressTowardGoalObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROGRESS_TOWARD_GOAL_OBSERVATION__PROGRESS_TOWARD_GOAL_OBSERVATION_CODE_P,
						ConsolPlugin.INSTANCE.getString(
							"ProgressTowardGoalObservationProgressTowardGoalObservationCodeP"),
						new Object[] { progressTowardGoalObservation }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.ProgressTowardGoalObservationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.consol.ProgressTowardGoalObservationCodeP", passToken);
				}
				passToken.add(progressTowardGoalObservation);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressTowardGoalObservationCode(ProgressTowardGoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Toward Goal Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressTowardGoalObservationCode(ProgressTowardGoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = 'ASSERTION' and value.codeSystem = '2.16.840.1.113883.5.4')";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressTowardGoalObservationCode(ProgressTowardGoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Toward Goal Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressTowardGoalObservationCode(ProgressTowardGoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressTowardGoalObservation The receiving '<em><b>Progress Toward Goal Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProgressTowardGoalObservationCode(
			ProgressTowardGoalObservation progressTowardGoalObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.ProgressTowardGoalObservationCodeP");
		if ((passToken instanceof Collection<?>) &&
				((Collection<?>) passToken).contains(progressTowardGoalObservation)) {
			// I have a free pass to short-circuit
			return true;
		}

		DatatypesUtil.increment(context, "ProgressTowardGoalObservationProgressTowardGoalObservationCode", "ERROR");

		if (VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_TOWARD_GOAL_OBSERVATION);
			try {
				VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				progressTowardGoalObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROGRESS_TOWARD_GOAL_OBSERVATION__PROGRESS_TOWARD_GOAL_OBSERVATION_CODE,
						ConsolPlugin.INSTANCE.getString(
							"ProgressTowardGoalObservationProgressTowardGoalObservationCode"),
						new Object[] { progressTowardGoalObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressTowardGoalObservationStatusCode(ProgressTowardGoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Toward Goal Observation Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressTowardGoalObservationStatusCode(ProgressTowardGoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and " +
			"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " + "value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressTowardGoalObservationStatusCode(ProgressTowardGoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Toward Goal Observation Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressTowardGoalObservationStatusCode(ProgressTowardGoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressTowardGoalObservation The receiving '<em><b>Progress Toward Goal Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProgressTowardGoalObservationStatusCode(
			ProgressTowardGoalObservation progressTowardGoalObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ProgressTowardGoalObservationProgressTowardGoalObservationStatusCode", "ERROR");

		if (VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_TOWARD_GOAL_OBSERVATION);
			try {
				VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				progressTowardGoalObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROGRESS_TOWARD_GOAL_OBSERVATION__PROGRESS_TOWARD_GOAL_OBSERVATION_STATUS_CODE,
						ConsolPlugin.INSTANCE.getString(
							"ProgressTowardGoalObservationProgressTowardGoalObservationStatusCode"),
						new Object[] { progressTowardGoalObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressTowardGoalObservationStatusCodeP(ProgressTowardGoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Toward Goal Observation Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressTowardGoalObservationStatusCodeP(ProgressTowardGoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressTowardGoalObservationStatusCodeP(ProgressTowardGoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Toward Goal Observation Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressTowardGoalObservationStatusCodeP(ProgressTowardGoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressTowardGoalObservation The receiving '<em><b>Progress Toward Goal Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProgressTowardGoalObservationStatusCodeP(
			ProgressTowardGoalObservation progressTowardGoalObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ProgressTowardGoalObservationProgressTowardGoalObservationStatusCodeP", "ERROR");

		if (VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_TOWARD_GOAL_OBSERVATION);
			try {
				VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				progressTowardGoalObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROGRESS_TOWARD_GOAL_OBSERVATION__PROGRESS_TOWARD_GOAL_OBSERVATION_STATUS_CODE_P,
						ConsolPlugin.INSTANCE.getString(
							"ProgressTowardGoalObservationProgressTowardGoalObservationStatusCodeP"),
						new Object[] { progressTowardGoalObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressTowardGoalObservationValue(ProgressTowardGoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Toward Goal Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressTowardGoalObservationValue(ProgressTowardGoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = element.oclAsType(datatypes::CD) in " +
			"value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '390801001' or value.code = '390802008' or value.code = '706905005' or value.code = '706906006')))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressTowardGoalObservationValue(ProgressTowardGoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Toward Goal Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressTowardGoalObservationValue(ProgressTowardGoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressTowardGoalObservation The receiving '<em><b>Progress Toward Goal Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProgressTowardGoalObservationValue(
			ProgressTowardGoalObservation progressTowardGoalObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProgressTowardGoalObservationProgressTowardGoalObservationValue", "ERROR");

		if (VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_TOWARD_GOAL_OBSERVATION);
			try {
				VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				progressTowardGoalObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROGRESS_TOWARD_GOAL_OBSERVATION__PROGRESS_TOWARD_GOAL_OBSERVATION_VALUE,
						ConsolPlugin.INSTANCE.getString(
							"ProgressTowardGoalObservationProgressTowardGoalObservationValue"),
						new Object[] { progressTowardGoalObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressTowardGoalObservationValueP(ProgressTowardGoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Toward Goal Observation Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressTowardGoalObservationValueP(ProgressTowardGoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() =  1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressTowardGoalObservationValueP(ProgressTowardGoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Toward Goal Observation Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressTowardGoalObservationValueP(ProgressTowardGoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progressTowardGoalObservation The receiving '<em><b>Progress Toward Goal Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProgressTowardGoalObservationValueP(
			ProgressTowardGoalObservation progressTowardGoalObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProgressTowardGoalObservationProgressTowardGoalObservationValueP", "ERROR");

		if (VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROGRESS_TOWARD_GOAL_OBSERVATION);
			try {
				VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				progressTowardGoalObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROGRESS_TOWARD_GOAL_OBSERVATION__PROGRESS_TOWARD_GOAL_OBSERVATION_VALUE_P,
						ConsolPlugin.INSTANCE.getString(
							"ProgressTowardGoalObservationProgressTowardGoalObservationValueP"),
						new Object[] { progressTowardGoalObservation }));
			}

			return false;
		}
		return true;
	}

} // ProgressTowardGoalObservationOperations
