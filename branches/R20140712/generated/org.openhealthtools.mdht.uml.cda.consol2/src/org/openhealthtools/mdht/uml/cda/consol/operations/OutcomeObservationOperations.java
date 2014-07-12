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
import org.openhealthtools.mdht.uml.cda.consol.ExternalDocumentReference;
import org.openhealthtools.mdht.uml.cda.consol.GoalObservation;
import org.openhealthtools.mdht.uml.cda.consol.InterventionAct;
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationActReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Act Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationActReference2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Act Reference2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationAuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationGoalObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Goal Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationProgressTowardGoalObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Progress Toward Goal Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationInterventionAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Intervention Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationExternalDocumentReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation External Document Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#getActReferences() <em>Get Act References</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#getActReference2s() <em>Get Act Reference2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#getGoalObservations() <em>Get Goal Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#getProgressTowardGoalObservation() <em>Get Progress Toward Goal Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#getInterventionActs() <em>Get Intervention Acts</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#getExternalDocumentReferences() <em>Get External Document References</em>}</li>
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
					ConsolPlugin.INSTANCE.getString("OutcomeObservationTemplateId"),
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
					ConsolPlugin.INSTANCE.getString("OutcomeObservationClassCode"), new Object[] { outcomeObservation }));
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
					ConsolPlugin.INSTANCE.getString("OutcomeObservationMoodCode"), new Object[] { outcomeObservation }));
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
	protected static final String VALIDATE_OUTCOME_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (self.id->size() = 1)";

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
					ConsolPlugin.INSTANCE.getString("OutcomeObservationId"), new Object[] { outcomeObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOutcomeObservationActReference(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Act Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOutcomeObservationActReference(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OUTCOME_OBSERVATION_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::ActReference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::GEVL)";

	/**
	 * The cached OCL invariant for the '{@link #validateOutcomeObservationActReference(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Act Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOutcomeObservationActReference(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_OUTCOME_OBSERVATION_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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

	public static boolean validateOutcomeObservationActReference(OutcomeObservation outcomeObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OUTCOME_OBSERVATION_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OUTCOME_OBSERVATION);
			try {
				VALIDATE_OUTCOME_OBSERVATION_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OUTCOME_OBSERVATION_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OUTCOME_OBSERVATION_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			outcomeObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.OUTCOME_OBSERVATION__OUTCOME_OBSERVATION_ACT_REFERENCE,
					ConsolPlugin.INSTANCE.getString("OutcomeObservationActReference"),
					new Object[] { outcomeObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOutcomeObservationActReference2(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Act Reference2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOutcomeObservationActReference2(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OUTCOME_OBSERVATION_ACT_REFERENCE2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::ActReference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)";

	/**
	 * The cached OCL invariant for the '{@link #validateOutcomeObservationActReference2(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Act Reference2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOutcomeObservationActReference2(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_OUTCOME_OBSERVATION_ACT_REFERENCE2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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

	public static boolean validateOutcomeObservationActReference2(OutcomeObservation outcomeObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OUTCOME_OBSERVATION_ACT_REFERENCE2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OUTCOME_OBSERVATION);
			try {
				VALIDATE_OUTCOME_OBSERVATION_ACT_REFERENCE2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OUTCOME_OBSERVATION_ACT_REFERENCE2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OUTCOME_OBSERVATION_ACT_REFERENCE2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			outcomeObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.OUTCOME_OBSERVATION__OUTCOME_OBSERVATION_ACT_REFERENCE2,
					ConsolPlugin.INSTANCE.getString("OutcomeObservationActReference2"),
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
					ConsolPlugin.INSTANCE.getString("OutcomeObservationAuthorParticipation"),
					new Object[] { outcomeObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOutcomeObservationGoalObservation(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Goal Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOutcomeObservationGoalObservation(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OUTCOME_OBSERVATION_GOAL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::GoalObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::GEVL)";

	/**
	 * The cached OCL invariant for the '{@link #validateOutcomeObservationGoalObservation(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Goal Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOutcomeObservationGoalObservation(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_OUTCOME_OBSERVATION_GOAL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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

	public static boolean validateOutcomeObservationGoalObservation(OutcomeObservation outcomeObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OUTCOME_OBSERVATION_GOAL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OUTCOME_OBSERVATION);
			try {
				VALIDATE_OUTCOME_OBSERVATION_GOAL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OUTCOME_OBSERVATION_GOAL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OUTCOME_OBSERVATION_GOAL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			outcomeObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.OUTCOME_OBSERVATION__OUTCOME_OBSERVATION_GOAL_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("OutcomeObservationGoalObservation"),
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
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.OUTCOME_OBSERVATION__OUTCOME_OBSERVATION_PROGRESS_TOWARD_GOAL_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("OutcomeObservationProgressTowardGoalObservation"),
					new Object[] { outcomeObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOutcomeObservationInterventionAct(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Intervention Act</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOutcomeObservationInterventionAct(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OUTCOME_OBSERVATION_INTERVENTION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::InterventionAct) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)";

	/**
	 * The cached OCL invariant for the '{@link #validateOutcomeObservationInterventionAct(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Intervention Act</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOutcomeObservationInterventionAct(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_OUTCOME_OBSERVATION_INTERVENTION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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

	public static boolean validateOutcomeObservationInterventionAct(OutcomeObservation outcomeObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OUTCOME_OBSERVATION_INTERVENTION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OUTCOME_OBSERVATION);
			try {
				VALIDATE_OUTCOME_OBSERVATION_INTERVENTION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OUTCOME_OBSERVATION_INTERVENTION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OUTCOME_OBSERVATION_INTERVENTION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			outcomeObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.OUTCOME_OBSERVATION__OUTCOME_OBSERVATION_INTERVENTION_ACT,
					ConsolPlugin.INSTANCE.getString("OutcomeObservationInterventionAct"),
					new Object[] { outcomeObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOutcomeObservationExternalDocumentReference(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation External Document Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOutcomeObservationExternalDocumentReference(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OUTCOME_OBSERVATION_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::ExternalDocumentReference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateOutcomeObservationExternalDocumentReference(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation External Document Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOutcomeObservationExternalDocumentReference(OutcomeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_OUTCOME_OBSERVATION_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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

	public static boolean validateOutcomeObservationExternalDocumentReference(OutcomeObservation outcomeObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_OUTCOME_OBSERVATION_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OUTCOME_OBSERVATION);
			try {
				VALIDATE_OUTCOME_OBSERVATION_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OUTCOME_OBSERVATION_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_OUTCOME_OBSERVATION_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			outcomeObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.OUTCOME_OBSERVATION__OUTCOME_OBSERVATION_EXTERNAL_DOCUMENT_REFERENCE,
					ConsolPlugin.INSTANCE.getString("OutcomeObservationExternalDocumentReference"),
					new Object[] { outcomeObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getActReferences(OutcomeObservation) <em>Get Act References</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActReferences(OutcomeObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ACT_REFERENCES__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::ActReference)).oclAsType(consol::ActReference)";

	/**
	 * The cached OCL query for the '{@link #getActReferences(OutcomeObservation) <em>Get Act References</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActReferences(OutcomeObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ACT_REFERENCES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<ActReference> getActReferences(OutcomeObservation outcomeObservation) {
		if (GET_ACT_REFERENCES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.OUTCOME_OBSERVATION,
				ConsolPackage.Literals.OUTCOME_OBSERVATION.getEAllOperations().get(62));
			try {
				GET_ACT_REFERENCES__EOCL_QRY = helper.createQuery(GET_ACT_REFERENCES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ACT_REFERENCES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ActReference> result = (Collection<ActReference>) query.evaluate(outcomeObservation);
		return new BasicEList.UnmodifiableEList<ActReference>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getActReference2s(OutcomeObservation) <em>Get Act Reference2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActReference2s(OutcomeObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ACT_REFERENCE2S__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::ActReference)).oclAsType(consol::ActReference)";

	/**
	 * The cached OCL query for the '{@link #getActReference2s(OutcomeObservation) <em>Get Act Reference2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActReference2s(OutcomeObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ACT_REFERENCE2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<ActReference> getActReference2s(OutcomeObservation outcomeObservation) {
		if (GET_ACT_REFERENCE2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.OUTCOME_OBSERVATION,
				ConsolPackage.Literals.OUTCOME_OBSERVATION.getEAllOperations().get(63));
			try {
				GET_ACT_REFERENCE2S__EOCL_QRY = helper.createQuery(GET_ACT_REFERENCE2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ACT_REFERENCE2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ActReference> result = (Collection<ActReference>) query.evaluate(outcomeObservation);
		return new BasicEList.UnmodifiableEList<ActReference>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getGoalObservations(OutcomeObservation) <em>Get Goal Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalObservations(OutcomeObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_GOAL_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::GoalObservation)).oclAsType(consol::GoalObservation)";

	/**
	 * The cached OCL query for the '{@link #getGoalObservations(OutcomeObservation) <em>Get Goal Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalObservations(OutcomeObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_GOAL_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<GoalObservation> getGoalObservations(OutcomeObservation outcomeObservation) {
		if (GET_GOAL_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.OUTCOME_OBSERVATION,
				ConsolPackage.Literals.OUTCOME_OBSERVATION.getEAllOperations().get(64));
			try {
				GET_GOAL_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_GOAL_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_GOAL_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<GoalObservation> result = (Collection<GoalObservation>) query.evaluate(outcomeObservation);
		return new BasicEList.UnmodifiableEList<GoalObservation>(result.size(), result.toArray());
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
				ConsolPackage.Literals.OUTCOME_OBSERVATION.getEAllOperations().get(65));
			try {
				GET_PROGRESS_TOWARD_GOAL_OBSERVATION__EOCL_QRY = helper.createQuery(GET_PROGRESS_TOWARD_GOAL_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROGRESS_TOWARD_GOAL_OBSERVATION__EOCL_QRY);
		return (ProgressTowardGoalObservation) query.evaluate(outcomeObservation);
	}

	/**
	 * The cached OCL expression body for the '{@link #getInterventionActs(OutcomeObservation) <em>Get Intervention Acts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterventionActs(OutcomeObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INTERVENTION_ACTS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::InterventionAct)).oclAsType(consol::InterventionAct)";

	/**
	 * The cached OCL query for the '{@link #getInterventionActs(OutcomeObservation) <em>Get Intervention Acts</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterventionActs(OutcomeObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INTERVENTION_ACTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<InterventionAct> getInterventionActs(OutcomeObservation outcomeObservation) {
		if (GET_INTERVENTION_ACTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.OUTCOME_OBSERVATION,
				ConsolPackage.Literals.OUTCOME_OBSERVATION.getEAllOperations().get(66));
			try {
				GET_INTERVENTION_ACTS__EOCL_QRY = helper.createQuery(GET_INTERVENTION_ACTS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INTERVENTION_ACTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<InterventionAct> result = (Collection<InterventionAct>) query.evaluate(outcomeObservation);
		return new BasicEList.UnmodifiableEList<InterventionAct>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getExternalDocumentReferences(OutcomeObservation) <em>Get External Document References</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalDocumentReferences(OutcomeObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_EXTERNAL_DOCUMENT_REFERENCES__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::ExternalDocumentReference)).oclAsType(consol::ExternalDocumentReference)";

	/**
	 * The cached OCL query for the '{@link #getExternalDocumentReferences(OutcomeObservation) <em>Get External Document References</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalDocumentReferences(OutcomeObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_EXTERNAL_DOCUMENT_REFERENCES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<ExternalDocumentReference> getExternalDocumentReferences(OutcomeObservation outcomeObservation) {
		if (GET_EXTERNAL_DOCUMENT_REFERENCES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.OUTCOME_OBSERVATION,
				ConsolPackage.Literals.OUTCOME_OBSERVATION.getEAllOperations().get(67));
			try {
				GET_EXTERNAL_DOCUMENT_REFERENCES__EOCL_QRY = helper.createQuery(GET_EXTERNAL_DOCUMENT_REFERENCES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_EXTERNAL_DOCUMENT_REFERENCES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ExternalDocumentReference> result = (Collection<ExternalDocumentReference>) query.evaluate(outcomeObservation);
		return new BasicEList.UnmodifiableEList<ExternalDocumentReference>(result.size(), result.toArray());
	}

} // OutcomeObservationOperations
