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
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.EntryReference;
import org.openhealthtools.mdht.uml.cda.consol.GoalObservation;
import org.openhealthtools.mdht.uml.cda.consol.PriorityPreference;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Goal Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationGoalObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Goal Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationActReferenceER(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Act Reference ER</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationAuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationHealthConcernActER(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Health Concern Act ER</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationPriorityPreference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Priority Preference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationPlannedERs(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Planned ERs</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationReferenceTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Reference Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationReferenceExternalDocumentReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Reference External Document Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#getGoalObservations() <em>Get Goal Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#getActReferenceERs() <em>Get Act Reference ERs</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#getHealthConcernActERs() <em>Get Health Concern Act ERs</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#getPriorityPreference() <em>Get Priority Preference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#getPlannedERss() <em>Get Planned ERss</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GoalObservationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoalObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGoalObservationTemplateId(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationTemplateId(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GOAL_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.121')";

	/**
	 * The cached OCL invariant for the '{@link #validateGoalObservationTemplateId(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationTemplateId(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GOAL_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param goalObservation The receiving '<em><b>Goal Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGoalObservationTemplateId(GoalObservation goalObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GOAL_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GOAL_OBSERVATION);
			try {
				VALIDATE_GOAL_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GOAL_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GOAL_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			goalObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GOAL_OBSERVATION__GOAL_OBSERVATION_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("GoalObservationGoalObservationTemplateId"),
					new Object[] { goalObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGoalObservationClassCode(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationClassCode(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GOAL_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateGoalObservationClassCode(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationClassCode(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GOAL_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param goalObservation The receiving '<em><b>Goal Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGoalObservationClassCode(GoalObservation goalObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GOAL_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GOAL_OBSERVATION);
			try {
				VALIDATE_GOAL_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GOAL_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GOAL_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			goalObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GOAL_OBSERVATION__GOAL_OBSERVATION_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("GoalObservationGoalObservationClassCode"),
					new Object[] { goalObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGoalObservationMoodCode(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationMoodCode(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GOAL_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::GOL";

	/**
	 * The cached OCL invariant for the '{@link #validateGoalObservationMoodCode(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationMoodCode(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GOAL_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param goalObservation The receiving '<em><b>Goal Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGoalObservationMoodCode(GoalObservation goalObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_GOAL_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GOAL_OBSERVATION);
			try {
				VALIDATE_GOAL_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GOAL_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GOAL_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			goalObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GOAL_OBSERVATION__GOAL_OBSERVATION_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("GoalObservationGoalObservationMoodCode"),
					new Object[] { goalObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGoalObservationId(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationId(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GOAL_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateGoalObservationId(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationId(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GOAL_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param goalObservation The receiving '<em><b>Goal Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGoalObservationId(GoalObservation goalObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_GOAL_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GOAL_OBSERVATION);
			try {
				VALIDATE_GOAL_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GOAL_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GOAL_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(goalObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GOAL_OBSERVATION__GOAL_OBSERVATION_ID,
					ConsolPlugin.INSTANCE.getString("GoalObservationGoalObservationId"),
					new Object[] { goalObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGoalObservationCodeP(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationCodeP(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GOAL_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateGoalObservationCodeP(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationCodeP(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GOAL_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param goalObservation The receiving '<em><b>Goal Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGoalObservationCodeP(GoalObservation goalObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_GOAL_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GOAL_OBSERVATION);
			try {
				VALIDATE_GOAL_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GOAL_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GOAL_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			goalObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GOAL_OBSERVATION__GOAL_OBSERVATION_CODE_P,
					ConsolPlugin.INSTANCE.getString("GoalObservationGoalObservationCodeP"),
					new Object[] { goalObservation }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.GoalObservationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.GoalObservationCodeP", passToken);
				}
				passToken.add(goalObservation);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGoalObservationCode(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationCode(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GOAL_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateGoalObservationCode(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationCode(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GOAL_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param goalObservation The receiving '<em><b>Goal Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGoalObservationCode(GoalObservation goalObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.GoalObservationCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(goalObservation)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_GOAL_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GOAL_OBSERVATION);
			try {
				VALIDATE_GOAL_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GOAL_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GOAL_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(goalObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GOAL_OBSERVATION__GOAL_OBSERVATION_CODE,
					ConsolPlugin.INSTANCE.getString("GoalObservationGoalObservationCode"),
					new Object[] { goalObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGoalObservationStatusCode(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationStatusCode(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GOAL_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " + "value.code = 'active')";

	/**
	 * The cached OCL invariant for the '{@link #validateGoalObservationStatusCode(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationStatusCode(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GOAL_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param goalObservation The receiving '<em><b>Goal Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGoalObservationStatusCode(GoalObservation goalObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GOAL_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GOAL_OBSERVATION);
			try {
				VALIDATE_GOAL_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GOAL_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GOAL_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			goalObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GOAL_OBSERVATION__GOAL_OBSERVATION_STATUS_CODE,
					ConsolPlugin.INSTANCE.getString("GoalObservationGoalObservationStatusCode"),
					new Object[] { goalObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGoalObservationStatusCodeP(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationStatusCodeP(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GOAL_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateGoalObservationStatusCodeP(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationStatusCodeP(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GOAL_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param goalObservation The receiving '<em><b>Goal Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGoalObservationStatusCodeP(GoalObservation goalObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GOAL_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GOAL_OBSERVATION);
			try {
				VALIDATE_GOAL_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GOAL_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GOAL_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			goalObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GOAL_OBSERVATION__GOAL_OBSERVATION_STATUS_CODE_P,
					ConsolPlugin.INSTANCE.getString("GoalObservationGoalObservationStatusCodeP"),
					new Object[] { goalObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGoalObservationEffectiveTime(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationEffectiveTime(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GOAL_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateGoalObservationEffectiveTime(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationEffectiveTime(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GOAL_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param goalObservation The receiving '<em><b>Goal Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGoalObservationEffectiveTime(GoalObservation goalObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GOAL_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GOAL_OBSERVATION);
			try {
				VALIDATE_GOAL_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GOAL_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GOAL_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			goalObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GOAL_OBSERVATION__GOAL_OBSERVATION_EFFECTIVE_TIME,
					ConsolPlugin.INSTANCE.getString("GoalObservationGoalObservationEffectiveTime"),
					new Object[] { goalObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGoalObservationValue(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationValue(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GOAL_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateGoalObservationValue(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationValue(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GOAL_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param goalObservation The receiving '<em><b>Goal Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGoalObservationValue(GoalObservation goalObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_GOAL_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GOAL_OBSERVATION);
			try {
				VALIDATE_GOAL_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GOAL_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GOAL_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			goalObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GOAL_OBSERVATION__GOAL_OBSERVATION_VALUE,
					ConsolPlugin.INSTANCE.getString("GoalObservationGoalObservationValue"),
					new Object[] { goalObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGoalObservationGoalObservation(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Goal Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationGoalObservation(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GOAL_OBSERVATION_GOAL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::GoalObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateGoalObservationGoalObservation(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Goal Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationGoalObservation(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GOAL_OBSERVATION_GOAL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param goalObservation The receiving '<em><b>Goal Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGoalObservationGoalObservation(GoalObservation goalObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GOAL_OBSERVATION_GOAL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GOAL_OBSERVATION);
			try {
				VALIDATE_GOAL_OBSERVATION_GOAL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GOAL_OBSERVATION_GOAL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GOAL_OBSERVATION_GOAL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			goalObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GOAL_OBSERVATION__GOAL_OBSERVATION_GOAL_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("GoalObservationGoalObservationGoalObservation"),
					new Object[] { goalObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGoalObservationActReferenceER(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Act Reference ER</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationActReferenceER(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GOAL_OBSERVATION_ACT_REFERENCE_ER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::EntryReference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateGoalObservationActReferenceER(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Act Reference ER</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationActReferenceER(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GOAL_OBSERVATION_ACT_REFERENCE_ER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param goalObservation The receiving '<em><b>Goal Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGoalObservationActReferenceER(GoalObservation goalObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GOAL_OBSERVATION_ACT_REFERENCE_ER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GOAL_OBSERVATION);
			try {
				VALIDATE_GOAL_OBSERVATION_ACT_REFERENCE_ER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GOAL_OBSERVATION_ACT_REFERENCE_ER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GOAL_OBSERVATION_ACT_REFERENCE_ER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			goalObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GOAL_OBSERVATION__GOAL_OBSERVATION_ACT_REFERENCE_ER,
					ConsolPlugin.INSTANCE.getString("GoalObservationGoalObservationActReferenceER"),
					new Object[] { goalObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGoalObservationAuthorParticipation(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Author Participation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationAuthorParticipation(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GOAL_OBSERVATION_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))";

	/**
	 * The cached OCL invariant for the '{@link #validateGoalObservationAuthorParticipation(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Author Participation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationAuthorParticipation(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GOAL_OBSERVATION_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param goalObservation The receiving '<em><b>Goal Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGoalObservationAuthorParticipation(GoalObservation goalObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GOAL_OBSERVATION_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GOAL_OBSERVATION);
			try {
				VALIDATE_GOAL_OBSERVATION_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GOAL_OBSERVATION_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GOAL_OBSERVATION_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			goalObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GOAL_OBSERVATION__GOAL_OBSERVATION_AUTHOR_PARTICIPATION,
					ConsolPlugin.INSTANCE.getString("GoalObservationGoalObservationAuthorParticipation"),
					new Object[] { goalObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGoalObservationHealthConcernActER(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Health Concern Act ER</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationHealthConcernActER(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GOAL_OBSERVATION_HEALTH_CONCERN_ACT_ER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::EntryReference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateGoalObservationHealthConcernActER(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Health Concern Act ER</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationHealthConcernActER(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GOAL_OBSERVATION_HEALTH_CONCERN_ACT_ER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param goalObservation The receiving '<em><b>Goal Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGoalObservationHealthConcernActER(GoalObservation goalObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GOAL_OBSERVATION_HEALTH_CONCERN_ACT_ER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GOAL_OBSERVATION);
			try {
				VALIDATE_GOAL_OBSERVATION_HEALTH_CONCERN_ACT_ER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GOAL_OBSERVATION_HEALTH_CONCERN_ACT_ER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GOAL_OBSERVATION_HEALTH_CONCERN_ACT_ER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			goalObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GOAL_OBSERVATION__GOAL_OBSERVATION_HEALTH_CONCERN_ACT_ER,
					ConsolPlugin.INSTANCE.getString("GoalObservationGoalObservationHealthConcernActER"),
					new Object[] { goalObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGoalObservationPriorityPreference(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Priority Preference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationPriorityPreference(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GOAL_OBSERVATION_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::PriorityPreference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateGoalObservationPriorityPreference(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Priority Preference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationPriorityPreference(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GOAL_OBSERVATION_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param goalObservation The receiving '<em><b>Goal Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGoalObservationPriorityPreference(GoalObservation goalObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GOAL_OBSERVATION_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GOAL_OBSERVATION);
			try {
				VALIDATE_GOAL_OBSERVATION_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GOAL_OBSERVATION_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GOAL_OBSERVATION_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			goalObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GOAL_OBSERVATION__GOAL_OBSERVATION_PRIORITY_PREFERENCE,
					ConsolPlugin.INSTANCE.getString("GoalObservationGoalObservationPriorityPreference"),
					new Object[] { goalObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGoalObservationPlannedERs(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Planned ERs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationPlannedERs(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GOAL_OBSERVATION_PLANNED_ERS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::EntryReference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateGoalObservationPlannedERs(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Planned ERs</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationPlannedERs(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GOAL_OBSERVATION_PLANNED_ERS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param goalObservation The receiving '<em><b>Goal Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGoalObservationPlannedERs(GoalObservation goalObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GOAL_OBSERVATION_PLANNED_ERS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GOAL_OBSERVATION);
			try {
				VALIDATE_GOAL_OBSERVATION_PLANNED_ERS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GOAL_OBSERVATION_PLANNED_ERS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GOAL_OBSERVATION_PLANNED_ERS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			goalObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GOAL_OBSERVATION__GOAL_OBSERVATION_PLANNED_ERS,
					ConsolPlugin.INSTANCE.getString("GoalObservationGoalObservationPlannedERs"),
					new Object[] { goalObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGoalObservationReference(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationReference(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GOAL_OBSERVATION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->exists(reference : cda::Reference | not reference.oclIsUndefined() and reference.oclIsKindOf(cda::Reference))";

	/**
	 * The cached OCL invariant for the '{@link #validateGoalObservationReference(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationReference(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GOAL_OBSERVATION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param goalObservation The receiving '<em><b>Goal Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGoalObservationReference(GoalObservation goalObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GOAL_OBSERVATION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GOAL_OBSERVATION);
			try {
				VALIDATE_GOAL_OBSERVATION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GOAL_OBSERVATION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GOAL_OBSERVATION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			goalObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GOAL_OBSERVATION__GOAL_OBSERVATION_REFERENCE,
					ConsolPlugin.INSTANCE.getString("GoalObservationGoalObservationReference"),
					new Object[] { goalObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGoalObservationReferenceTypeCode(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Reference Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationReferenceTypeCode(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GOAL_OBSERVATION_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->excluding(null)->reject(typeCode=vocab::x_ActRelationshipExternalReference::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateGoalObservationReferenceTypeCode(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Reference Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationReferenceTypeCode(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GOAL_OBSERVATION_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param goalObservation The receiving '<em><b>Goal Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGoalObservationReferenceTypeCode(GoalObservation goalObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GOAL_OBSERVATION_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GOAL_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GOAL_OBSERVATION_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GOAL_OBSERVATION_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GOAL_OBSERVATION_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(goalObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GOAL_OBSERVATION__GOAL_OBSERVATION_REFERENCE_TYPE_CODE,
						ConsolPlugin.INSTANCE.getString("GoalObservationGoalObservationReferenceTypeCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGoalObservationReferenceExternalDocumentReference(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Reference External Document Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationReferenceExternalDocumentReference(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GOAL_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->excluding(null)->reject(externalDocument->one(externalDocument : cda::ExternalDocument | not externalDocument.oclIsUndefined() and externalDocument.oclIsKindOf(consol::ExternalDocumentReference)))";

	/**
	 * The cached OCL invariant for the '{@link #validateGoalObservationReferenceExternalDocumentReference(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Reference External Document Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationReferenceExternalDocumentReference(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GOAL_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param goalObservation The receiving '<em><b>Goal Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGoalObservationReferenceExternalDocumentReference(GoalObservation goalObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GOAL_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GOAL_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GOAL_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GOAL_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GOAL_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(goalObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GOAL_OBSERVATION__GOAL_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE,
						ConsolPlugin.INSTANCE.getString("GoalObservationGoalObservationReferenceExternalDocumentReference"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getGoalObservations(GoalObservation) <em>Get Goal Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalObservations(GoalObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_GOAL_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::GoalObservation)).oclAsType(consol::GoalObservation)";

	/**
	 * The cached OCL query for the '{@link #getGoalObservations(GoalObservation) <em>Get Goal Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalObservations(GoalObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_GOAL_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<GoalObservation> getGoalObservations(GoalObservation goalObservation) {
		if (GET_GOAL_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.GOAL_OBSERVATION,
				ConsolPackage.Literals.GOAL_OBSERVATION.getEAllOperations().get(70));
			try {
				GET_GOAL_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_GOAL_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_GOAL_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<GoalObservation> result = (Collection<GoalObservation>) query.evaluate(goalObservation);
		return new BasicEList.UnmodifiableEList<GoalObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getActReferenceERs(GoalObservation) <em>Get Act Reference ERs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActReferenceERs(GoalObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ACT_REFERENCE_ERS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::EntryReference)).oclAsType(consol::EntryReference)";

	/**
	 * The cached OCL query for the '{@link #getActReferenceERs(GoalObservation) <em>Get Act Reference ERs</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActReferenceERs(GoalObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ACT_REFERENCE_ERS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<EntryReference> getActReferenceERs(GoalObservation goalObservation) {
		if (GET_ACT_REFERENCE_ERS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.GOAL_OBSERVATION,
				ConsolPackage.Literals.GOAL_OBSERVATION.getEAllOperations().get(71));
			try {
				GET_ACT_REFERENCE_ERS__EOCL_QRY = helper.createQuery(GET_ACT_REFERENCE_ERS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ACT_REFERENCE_ERS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<EntryReference> result = (Collection<EntryReference>) query.evaluate(goalObservation);
		return new BasicEList.UnmodifiableEList<EntryReference>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getHealthConcernActERs(GoalObservation) <em>Get Health Concern Act ERs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthConcernActERs(GoalObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HEALTH_CONCERN_ACT_ERS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::EntryReference)).oclAsType(consol::EntryReference)";

	/**
	 * The cached OCL query for the '{@link #getHealthConcernActERs(GoalObservation) <em>Get Health Concern Act ERs</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthConcernActERs(GoalObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HEALTH_CONCERN_ACT_ERS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<EntryReference> getHealthConcernActERs(GoalObservation goalObservation) {
		if (GET_HEALTH_CONCERN_ACT_ERS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.GOAL_OBSERVATION,
				ConsolPackage.Literals.GOAL_OBSERVATION.getEAllOperations().get(72));
			try {
				GET_HEALTH_CONCERN_ACT_ERS__EOCL_QRY = helper.createQuery(GET_HEALTH_CONCERN_ACT_ERS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HEALTH_CONCERN_ACT_ERS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<EntryReference> result = (Collection<EntryReference>) query.evaluate(goalObservation);
		return new BasicEList.UnmodifiableEList<EntryReference>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getPriorityPreference(GoalObservation) <em>Get Priority Preference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorityPreference(GoalObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PRIORITY_PREFERENCE__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::PriorityPreference))->asSequence()->any(true).oclAsType(consol::PriorityPreference)";

	/**
	 * The cached OCL query for the '{@link #getPriorityPreference(GoalObservation) <em>Get Priority Preference</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorityPreference(GoalObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PRIORITY_PREFERENCE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static PriorityPreference getPriorityPreference(GoalObservation goalObservation) {
		if (GET_PRIORITY_PREFERENCE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.GOAL_OBSERVATION,
				ConsolPackage.Literals.GOAL_OBSERVATION.getEAllOperations().get(73));
			try {
				GET_PRIORITY_PREFERENCE__EOCL_QRY = helper.createQuery(GET_PRIORITY_PREFERENCE__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PRIORITY_PREFERENCE__EOCL_QRY);
		return (PriorityPreference) query.evaluate(goalObservation);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPlannedERss(GoalObservation) <em>Get Planned ERss</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedERss(GoalObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLANNED_ERSS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::EntryReference)).oclAsType(consol::EntryReference)";

	/**
	 * The cached OCL query for the '{@link #getPlannedERss(GoalObservation) <em>Get Planned ERss</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedERss(GoalObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLANNED_ERSS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<EntryReference> getPlannedERss(GoalObservation goalObservation) {
		if (GET_PLANNED_ERSS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.GOAL_OBSERVATION,
				ConsolPackage.Literals.GOAL_OBSERVATION.getEAllOperations().get(74));
			try {
				GET_PLANNED_ERSS__EOCL_QRY = helper.createQuery(GET_PLANNED_ERSS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PLANNED_ERSS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<EntryReference> result = (Collection<EntryReference>) query.evaluate(goalObservation);
		return new BasicEList.UnmodifiableEList<EntryReference>(result.size(), result.toArray());
	}

} // GoalObservationOperations
