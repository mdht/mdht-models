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
import org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation;

import org.openhealthtools.mdht.uml.cda.consol.ProgressTowardGoalObservation;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Outcome Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationProgTowardGoalObsInversionIndIsTrue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Prog Toward Goal Obs Inversion Ind Is True</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationEntryReferenceGoalObs(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Entry Reference Goal Obs</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationEntryReferenceInterventionAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Entry Reference Intervention Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationAuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationProgressTowardGoalObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Progress Toward Goal Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationEntryRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Entry Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationReferenceTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Reference Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationReferenceExternalDocumentReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Reference External Document Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#getEntryReferenceGoalObss() <em>Get Entry Reference Goal Obss</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#getEntryReferenceInterventionActs() <em>Get Entry Reference Intervention Acts</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#getProgressTowardGoalObservation() <em>Get Progress Toward Goal Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutcomeObservationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutcomeObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOutcomeObservationProgTowardGoalObsInversionIndIsTrue(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Prog Toward Goal Obs Inversion Ind Is True</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOutcomeObservationProgTowardGoalObsInversionIndIsTrue(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OUTCOME_OBSERVATION_PROG_TOWARD_GOAL_OBS_INVERSION_IND_IS_TRUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->select(er : cda::EntryRelationship | er.observation.oclIsTypeOf(consol::ProgressTowardGoalObservation))->forAll(ent : cda::EntryRelationship | ent.inversionInd=true)";

	/**
	 * The cached OCL invariant for the '{@link #validateOutcomeObservationProgTowardGoalObsInversionIndIsTrue(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Prog Toward Goal Obs Inversion Ind Is True</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOutcomeObservationProgTowardGoalObsInversionIndIsTrue(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_OUTCOME_OBSERVATION_PROG_TOWARD_GOAL_OBS_INVERSION_IND_IS_TRUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param outcomeObservation The receiving '<em><b>Outcome Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOutcomeObservationProgTowardGoalObsInversionIndIsTrue(
			OutcomeObservation outcomeObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OUTCOME_OBSERVATION_PROG_TOWARD_GOAL_OBS_INVERSION_IND_IS_TRUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OUTCOME_OBSERVATION);
			try {
				VALIDATE_OUTCOME_OBSERVATION_PROG_TOWARD_GOAL_OBS_INVERSION_IND_IS_TRUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OUTCOME_OBSERVATION_PROG_TOWARD_GOAL_OBS_INVERSION_IND_IS_TRUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_OUTCOME_OBSERVATION_PROG_TOWARD_GOAL_OBS_INVERSION_IND_IS_TRUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			outcomeObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.OUTCOME_OBSERVATION__OUTCOME_OBSERVATION_PROG_TOWARD_GOAL_OBS_INVERSION_IND_IS_TRUE,
					ConsolPlugin.INSTANCE.getString("OutcomeObservationOutcomeObservationProgTowardGoalObsInversionIndIsTrue"),
					new Object[] { outcomeObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOutcomeObservationTemplateId(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOutcomeObservationTemplateId(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OUTCOME_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.144')";

	/**
	 * The cached OCL invariant for the '{@link #validateOutcomeObservationTemplateId(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOutcomeObservationTemplateId(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_OUTCOME_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param outcomeObservation The receiving '<em><b>Outcome Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOutcomeObservationTemplateId(OutcomeObservation outcomeObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OUTCOME_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OUTCOME_OBSERVATION);
			try {
				VALIDATE_OUTCOME_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OUTCOME_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OUTCOME_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			outcomeObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.OUTCOME_OBSERVATION__OUTCOME_OBSERVATION_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("OutcomeObservationOutcomeObservationTemplateId"),
					new Object[] { outcomeObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOutcomeObservationClassCode(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOutcomeObservationClassCode(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OUTCOME_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateOutcomeObservationClassCode(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOutcomeObservationClassCode(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_OUTCOME_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param outcomeObservation The receiving '<em><b>Outcome Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOutcomeObservationClassCode(OutcomeObservation outcomeObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OUTCOME_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OUTCOME_OBSERVATION);
			try {
				VALIDATE_OUTCOME_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OUTCOME_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OUTCOME_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			outcomeObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.OUTCOME_OBSERVATION__OUTCOME_OBSERVATION_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("OutcomeObservationOutcomeObservationClassCode"),
					new Object[] { outcomeObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOutcomeObservationMoodCode(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOutcomeObservationMoodCode(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OUTCOME_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateOutcomeObservationMoodCode(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOutcomeObservationMoodCode(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_OUTCOME_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param outcomeObservation The receiving '<em><b>Outcome Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOutcomeObservationMoodCode(OutcomeObservation outcomeObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OUTCOME_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OUTCOME_OBSERVATION);
			try {
				VALIDATE_OUTCOME_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OUTCOME_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OUTCOME_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			outcomeObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.OUTCOME_OBSERVATION__OUTCOME_OBSERVATION_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("OutcomeObservationOutcomeObservationMoodCode"),
					new Object[] { outcomeObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOutcomeObservationId(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOutcomeObservationId(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OUTCOME_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateOutcomeObservationId(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOutcomeObservationId(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_OUTCOME_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param outcomeObservation The receiving '<em><b>Outcome Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOutcomeObservationId(OutcomeObservation outcomeObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OUTCOME_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OUTCOME_OBSERVATION);
			try {
				VALIDATE_OUTCOME_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OUTCOME_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OUTCOME_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			outcomeObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.OUTCOME_OBSERVATION__OUTCOME_OBSERVATION_ID,
					ConsolPlugin.INSTANCE.getString("OutcomeObservationOutcomeObservationId"),
					new Object[] { outcomeObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOutcomeObservationCodeP(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOutcomeObservationCodeP(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OUTCOME_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateOutcomeObservationCodeP(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOutcomeObservationCodeP(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_OUTCOME_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param outcomeObservation The receiving '<em><b>Outcome Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOutcomeObservationCodeP(OutcomeObservation outcomeObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OUTCOME_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OUTCOME_OBSERVATION);
			try {
				VALIDATE_OUTCOME_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OUTCOME_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OUTCOME_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			outcomeObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.OUTCOME_OBSERVATION__OUTCOME_OBSERVATION_CODE_P,
					ConsolPlugin.INSTANCE.getString("OutcomeObservationOutcomeObservationCodeP"),
					new Object[] { outcomeObservation }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.OutcomeObservationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.OutcomeObservationCodeP", passToken);
				}
				passToken.add(outcomeObservation);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOutcomeObservationCode(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOutcomeObservationCode(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OUTCOME_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateOutcomeObservationCode(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOutcomeObservationCode(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_OUTCOME_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param outcomeObservation The receiving '<em><b>Outcome Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOutcomeObservationCode(OutcomeObservation outcomeObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.OutcomeObservationCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(outcomeObservation)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_OUTCOME_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OUTCOME_OBSERVATION);
			try {
				VALIDATE_OUTCOME_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OUTCOME_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OUTCOME_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			outcomeObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.OUTCOME_OBSERVATION__OUTCOME_OBSERVATION_CODE,
					ConsolPlugin.INSTANCE.getString("OutcomeObservationOutcomeObservationCode"),
					new Object[] { outcomeObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOutcomeObservationValue(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOutcomeObservationValue(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OUTCOME_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateOutcomeObservationValue(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOutcomeObservationValue(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_OUTCOME_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param outcomeObservation The receiving '<em><b>Outcome Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOutcomeObservationValue(OutcomeObservation outcomeObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OUTCOME_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OUTCOME_OBSERVATION);
			try {
				VALIDATE_OUTCOME_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OUTCOME_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OUTCOME_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			outcomeObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.OUTCOME_OBSERVATION__OUTCOME_OBSERVATION_VALUE,
					ConsolPlugin.INSTANCE.getString("OutcomeObservationOutcomeObservationValue"),
					new Object[] { outcomeObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOutcomeObservationEntryReferenceGoalObs(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Entry Reference Goal Obs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOutcomeObservationEntryReferenceGoalObs(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OUTCOME_OBSERVATION_ENTRY_REFERENCE_GOAL_OBS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::EntryReference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::GEVL)";

	/**
	 * The cached OCL invariant for the '{@link #validateOutcomeObservationEntryReferenceGoalObs(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Entry Reference Goal Obs</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOutcomeObservationEntryReferenceGoalObs(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_OUTCOME_OBSERVATION_ENTRY_REFERENCE_GOAL_OBS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param outcomeObservation The receiving '<em><b>Outcome Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOutcomeObservationEntryReferenceGoalObs(OutcomeObservation outcomeObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OUTCOME_OBSERVATION_ENTRY_REFERENCE_GOAL_OBS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OUTCOME_OBSERVATION);
			try {
				VALIDATE_OUTCOME_OBSERVATION_ENTRY_REFERENCE_GOAL_OBS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OUTCOME_OBSERVATION_ENTRY_REFERENCE_GOAL_OBS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OUTCOME_OBSERVATION_ENTRY_REFERENCE_GOAL_OBS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			outcomeObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.OUTCOME_OBSERVATION__OUTCOME_OBSERVATION_ENTRY_REFERENCE_GOAL_OBS,
					ConsolPlugin.INSTANCE.getString("OutcomeObservationOutcomeObservationEntryReferenceGoalObs"),
					new Object[] { outcomeObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOutcomeObservationEntryReferenceInterventionAct(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Entry Reference Intervention Act</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOutcomeObservationEntryReferenceInterventionAct(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OUTCOME_OBSERVATION_ENTRY_REFERENCE_INTERVENTION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::EntryReference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)";

	/**
	 * The cached OCL invariant for the '{@link #validateOutcomeObservationEntryReferenceInterventionAct(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Entry Reference Intervention Act</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOutcomeObservationEntryReferenceInterventionAct(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_OUTCOME_OBSERVATION_ENTRY_REFERENCE_INTERVENTION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param outcomeObservation The receiving '<em><b>Outcome Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOutcomeObservationEntryReferenceInterventionAct(
			OutcomeObservation outcomeObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OUTCOME_OBSERVATION_ENTRY_REFERENCE_INTERVENTION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OUTCOME_OBSERVATION);
			try {
				VALIDATE_OUTCOME_OBSERVATION_ENTRY_REFERENCE_INTERVENTION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OUTCOME_OBSERVATION_ENTRY_REFERENCE_INTERVENTION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_OUTCOME_OBSERVATION_ENTRY_REFERENCE_INTERVENTION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			outcomeObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.OUTCOME_OBSERVATION__OUTCOME_OBSERVATION_ENTRY_REFERENCE_INTERVENTION_ACT,
					ConsolPlugin.INSTANCE.getString("OutcomeObservationOutcomeObservationEntryReferenceInterventionAct"),
					new Object[] { outcomeObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOutcomeObservationAuthorParticipation(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Author Participation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOutcomeObservationAuthorParticipation(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OUTCOME_OBSERVATION_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))";

	/**
	 * The cached OCL invariant for the '{@link #validateOutcomeObservationAuthorParticipation(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Author Participation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOutcomeObservationAuthorParticipation(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_OUTCOME_OBSERVATION_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param outcomeObservation The receiving '<em><b>Outcome Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOutcomeObservationAuthorParticipation(OutcomeObservation outcomeObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OUTCOME_OBSERVATION_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OUTCOME_OBSERVATION);
			try {
				VALIDATE_OUTCOME_OBSERVATION_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OUTCOME_OBSERVATION_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OUTCOME_OBSERVATION_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			outcomeObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.OUTCOME_OBSERVATION__OUTCOME_OBSERVATION_AUTHOR_PARTICIPATION,
					ConsolPlugin.INSTANCE.getString("OutcomeObservationOutcomeObservationAuthorParticipation"),
					new Object[] { outcomeObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOutcomeObservationProgressTowardGoalObservation(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Progress Toward Goal Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOutcomeObservationProgressTowardGoalObservation(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OUTCOME_OBSERVATION_PROGRESS_TOWARD_GOAL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::ProgressTowardGoalObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SPRT)";

	/**
	 * The cached OCL invariant for the '{@link #validateOutcomeObservationProgressTowardGoalObservation(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Progress Toward Goal Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOutcomeObservationProgressTowardGoalObservation(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_OUTCOME_OBSERVATION_PROGRESS_TOWARD_GOAL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param outcomeObservation The receiving '<em><b>Outcome Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOutcomeObservationProgressTowardGoalObservation(
			OutcomeObservation outcomeObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OUTCOME_OBSERVATION_PROGRESS_TOWARD_GOAL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OUTCOME_OBSERVATION);
			try {
				VALIDATE_OUTCOME_OBSERVATION_PROGRESS_TOWARD_GOAL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OUTCOME_OBSERVATION_PROGRESS_TOWARD_GOAL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_OUTCOME_OBSERVATION_PROGRESS_TOWARD_GOAL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			outcomeObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.OUTCOME_OBSERVATION__OUTCOME_OBSERVATION_PROGRESS_TOWARD_GOAL_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("OutcomeObservationOutcomeObservationProgressTowardGoalObservation"),
					new Object[] { outcomeObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOutcomeObservationReference(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOutcomeObservationReference(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OUTCOME_OBSERVATION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->exists(reference : cda::Reference | not reference.oclIsUndefined() and reference.oclIsKindOf(cda::Reference))";

	/**
	 * The cached OCL invariant for the '{@link #validateOutcomeObservationReference(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOutcomeObservationReference(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_OUTCOME_OBSERVATION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param outcomeObservation The receiving '<em><b>Outcome Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOutcomeObservationReference(OutcomeObservation outcomeObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OUTCOME_OBSERVATION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OUTCOME_OBSERVATION);
			try {
				VALIDATE_OUTCOME_OBSERVATION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OUTCOME_OBSERVATION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OUTCOME_OBSERVATION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			outcomeObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.OUTCOME_OBSERVATION__OUTCOME_OBSERVATION_REFERENCE,
					ConsolPlugin.INSTANCE.getString("OutcomeObservationOutcomeObservationReference"),
					new Object[] { outcomeObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOutcomeObservationEntryRelationship(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Entry Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOutcomeObservationEntryRelationship(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OUTCOME_OBSERVATION_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(rim::ActRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateOutcomeObservationEntryRelationship(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Entry Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOutcomeObservationEntryRelationship(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_OUTCOME_OBSERVATION_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param outcomeObservation The receiving '<em><b>Outcome Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOutcomeObservationEntryRelationship(OutcomeObservation outcomeObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OUTCOME_OBSERVATION_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OUTCOME_OBSERVATION);
			try {
				VALIDATE_OUTCOME_OBSERVATION_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OUTCOME_OBSERVATION_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OUTCOME_OBSERVATION_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			outcomeObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.OUTCOME_OBSERVATION__OUTCOME_OBSERVATION_ENTRY_RELATIONSHIP,
					ConsolPlugin.INSTANCE.getString("OutcomeObservationOutcomeObservationEntryRelationship"),
					new Object[] { outcomeObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOutcomeObservationReferenceTypeCode(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Reference Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOutcomeObservationReferenceTypeCode(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OUTCOME_OBSERVATION_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->excluding(null)->reject(typeCode=vocab::x_ActRelationshipExternalReference::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateOutcomeObservationReferenceTypeCode(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Reference Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOutcomeObservationReferenceTypeCode(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_OUTCOME_OBSERVATION_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param outcomeObservation The receiving '<em><b>Outcome Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateOutcomeObservationReferenceTypeCode(OutcomeObservation outcomeObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OUTCOME_OBSERVATION_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OUTCOME_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OUTCOME_OBSERVATION_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OUTCOME_OBSERVATION_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OUTCOME_OBSERVATION_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(outcomeObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.OUTCOME_OBSERVATION__OUTCOME_OBSERVATION_REFERENCE_TYPE_CODE,
						ConsolPlugin.INSTANCE.getString("OutcomeObservationOutcomeObservationReferenceTypeCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOutcomeObservationReferenceExternalDocumentReference(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Reference External Document Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOutcomeObservationReferenceExternalDocumentReference(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OUTCOME_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->excluding(null)->reject(externalDocument->one(externalDocument : cda::ExternalDocument | not externalDocument.oclIsUndefined() and externalDocument.oclIsKindOf(consol::ExternalDocumentReference)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOutcomeObservationReferenceExternalDocumentReference(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Reference External Document Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOutcomeObservationReferenceExternalDocumentReference(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_OUTCOME_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param outcomeObservation The receiving '<em><b>Outcome Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateOutcomeObservationReferenceExternalDocumentReference(
			OutcomeObservation outcomeObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OUTCOME_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OUTCOME_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_OUTCOME_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_OUTCOME_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_OUTCOME_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(outcomeObservation);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.OUTCOME_OBSERVATION__OUTCOME_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE,
						ConsolPlugin.INSTANCE.getString("OutcomeObservationOutcomeObservationReferenceExternalDocumentReference"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getEntryReferenceGoalObss(OutcomeObservation) <em>Get Entry Reference Goal Obss</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryReferenceGoalObss(OutcomeObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ENTRY_REFERENCE_GOAL_OBSS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::EntryReference)).oclAsType(consol::EntryReference)";

	/**
	 * The cached OCL query for the '{@link #getEntryReferenceGoalObss(OutcomeObservation) <em>Get Entry Reference Goal Obss</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryReferenceGoalObss(OutcomeObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ENTRY_REFERENCE_GOAL_OBSS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<EntryReference> getEntryReferenceGoalObss(OutcomeObservation outcomeObservation) {
		if (GET_ENTRY_REFERENCE_GOAL_OBSS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.OUTCOME_OBSERVATION,
				ConsolPackage.Literals.OUTCOME_OBSERVATION.getEAllOperations().get(67));
			try {
				GET_ENTRY_REFERENCE_GOAL_OBSS__EOCL_QRY = helper.createQuery(GET_ENTRY_REFERENCE_GOAL_OBSS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ENTRY_REFERENCE_GOAL_OBSS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<EntryReference> result = (Collection<EntryReference>) query.evaluate(outcomeObservation);
		return new BasicEList.UnmodifiableEList<EntryReference>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getEntryReferenceInterventionActs(OutcomeObservation) <em>Get Entry Reference Intervention Acts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryReferenceInterventionActs(OutcomeObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ENTRY_REFERENCE_INTERVENTION_ACTS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::EntryReference)).oclAsType(consol::EntryReference)";

	/**
	 * The cached OCL query for the '{@link #getEntryReferenceInterventionActs(OutcomeObservation) <em>Get Entry Reference Intervention Acts</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryReferenceInterventionActs(OutcomeObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ENTRY_REFERENCE_INTERVENTION_ACTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<EntryReference> getEntryReferenceInterventionActs(OutcomeObservation outcomeObservation) {
		if (GET_ENTRY_REFERENCE_INTERVENTION_ACTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.OUTCOME_OBSERVATION,
				ConsolPackage.Literals.OUTCOME_OBSERVATION.getEAllOperations().get(68));
			try {
				GET_ENTRY_REFERENCE_INTERVENTION_ACTS__EOCL_QRY = helper.createQuery(GET_ENTRY_REFERENCE_INTERVENTION_ACTS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ENTRY_REFERENCE_INTERVENTION_ACTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<EntryReference> result = (Collection<EntryReference>) query.evaluate(outcomeObservation);
		return new BasicEList.UnmodifiableEList<EntryReference>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getProgressTowardGoalObservation(OutcomeObservation) <em>Get Progress Toward Goal Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgressTowardGoalObservation(OutcomeObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROGRESS_TOWARD_GOAL_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ProgressTowardGoalObservation))->asSequence()->any(true).oclAsType(consol::ProgressTowardGoalObservation)";

	/**
	 * The cached OCL query for the '{@link #getProgressTowardGoalObservation(OutcomeObservation) <em>Get Progress Toward Goal Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgressTowardGoalObservation(OutcomeObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROGRESS_TOWARD_GOAL_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ProgressTowardGoalObservation getProgressTowardGoalObservation(OutcomeObservation outcomeObservation) {
		if (GET_PROGRESS_TOWARD_GOAL_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.OUTCOME_OBSERVATION,
				ConsolPackage.Literals.OUTCOME_OBSERVATION.getEAllOperations().get(69));
			try {
				GET_PROGRESS_TOWARD_GOAL_OBSERVATION__EOCL_QRY = helper.createQuery(GET_PROGRESS_TOWARD_GOAL_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROGRESS_TOWARD_GOAL_OBSERVATION__EOCL_QRY);
		return (ProgressTowardGoalObservation) query.evaluate(outcomeObservation);
	}

} // OutcomeObservationOperations
