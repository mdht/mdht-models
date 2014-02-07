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

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.ActReference;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.GoalObservation;
import org.openhealthtools.mdht.uml.cda.consol.PatientPriorityPreference;

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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationPatientPriorityPreference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Patient Priority Preference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationActReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Act Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#getPatientPriorityPreference() <em>Get Patient Priority Preference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#getGoalObservations() <em>Get Goal Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#getActReferences() <em>Get Act References</em>}</li>
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
					ConsolPlugin.INSTANCE.getString("GoalObservationTemplateId"), new Object[] { goalObservation }));
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
					ConsolPlugin.INSTANCE.getString("GoalObservationClassCode"), new Object[] { goalObservation }));
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
					ConsolPlugin.INSTANCE.getString("GoalObservationMoodCode"), new Object[] { goalObservation }));
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
	protected static final String VALIDATE_GOAL_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

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
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GOAL_OBSERVATION__GOAL_OBSERVATION_CODE,
					ConsolPlugin.INSTANCE.getString("GoalObservationCode"), new Object[] { goalObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGoalObservationPatientPriorityPreference(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Patient Priority Preference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationPatientPriorityPreference(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GOAL_OBSERVATION_PATIENT_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::PatientPriorityPreference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)";

	/**
	 * The cached OCL invariant for the '{@link #validateGoalObservationPatientPriorityPreference(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Patient Priority Preference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationPatientPriorityPreference(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GOAL_OBSERVATION_PATIENT_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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

	public static boolean validateGoalObservationPatientPriorityPreference(GoalObservation goalObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GOAL_OBSERVATION_PATIENT_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GOAL_OBSERVATION);
			try {
				VALIDATE_GOAL_OBSERVATION_PATIENT_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GOAL_OBSERVATION_PATIENT_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GOAL_OBSERVATION_PATIENT_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			goalObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GOAL_OBSERVATION__GOAL_OBSERVATION_PATIENT_PRIORITY_PREFERENCE,
					ConsolPlugin.INSTANCE.getString("GoalObservationPatientPriorityPreference"),
					new Object[] { goalObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGoalObservation(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservation(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GOAL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::GoalObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateGoalObservation(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservation(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GOAL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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

	public static boolean validateGoalObservation(GoalObservation goalObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_GOAL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GOAL_OBSERVATION);
			try {
				VALIDATE_GOAL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GOAL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GOAL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(goalObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GOAL_OBSERVATION__GOAL_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("GoalObservation"), new Object[] { goalObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGoalObservationActReference(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Act Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationActReference(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GOAL_OBSERVATION_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::ActReference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateGoalObservationActReference(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Act Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGoalObservationActReference(GoalObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GOAL_OBSERVATION_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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

	public static boolean validateGoalObservationActReference(GoalObservation goalObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GOAL_OBSERVATION_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GOAL_OBSERVATION);
			try {
				VALIDATE_GOAL_OBSERVATION_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GOAL_OBSERVATION_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GOAL_OBSERVATION_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			goalObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GOAL_OBSERVATION__GOAL_OBSERVATION_ACT_REFERENCE,
					ConsolPlugin.INSTANCE.getString("GoalObservationActReference"), new Object[] { goalObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getPatientPriorityPreference(GoalObservation) <em>Get Patient Priority Preference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientPriorityPreference(GoalObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PATIENT_PRIORITY_PREFERENCE__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::PatientPriorityPreference))->asSequence()->any(true).oclAsType(consol::PatientPriorityPreference)";

	/**
	 * The cached OCL query for the '{@link #getPatientPriorityPreference(GoalObservation) <em>Get Patient Priority Preference</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientPriorityPreference(GoalObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PATIENT_PRIORITY_PREFERENCE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static PatientPriorityPreference getPatientPriorityPreference(GoalObservation goalObservation) {
		if (GET_PATIENT_PRIORITY_PREFERENCE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.GOAL_OBSERVATION,
				ConsolPackage.Literals.GOAL_OBSERVATION.getEAllOperations().get(58));
			try {
				GET_PATIENT_PRIORITY_PREFERENCE__EOCL_QRY = helper.createQuery(GET_PATIENT_PRIORITY_PREFERENCE__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PATIENT_PRIORITY_PREFERENCE__EOCL_QRY);
		return (PatientPriorityPreference) query.evaluate(goalObservation);
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
				ConsolPackage.Literals.GOAL_OBSERVATION.getEAllOperations().get(59));
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
	 * The cached OCL expression body for the '{@link #getActReferences(GoalObservation) <em>Get Act References</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActReferences(GoalObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ACT_REFERENCES__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::ActReference)).oclAsType(consol::ActReference)";

	/**
	 * The cached OCL query for the '{@link #getActReferences(GoalObservation) <em>Get Act References</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActReferences(GoalObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ACT_REFERENCES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<ActReference> getActReferences(GoalObservation goalObservation) {
		if (GET_ACT_REFERENCES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.GOAL_OBSERVATION,
				ConsolPackage.Literals.GOAL_OBSERVATION.getEAllOperations().get(60));
			try {
				GET_ACT_REFERENCES__EOCL_QRY = helper.createQuery(GET_ACT_REFERENCES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ACT_REFERENCES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ActReference> result = (Collection<ActReference>) query.evaluate(goalObservation);
		return new BasicEList.UnmodifiableEList<ActReference>(result.size(), result.toArray());
	}

} // GoalObservationOperations
