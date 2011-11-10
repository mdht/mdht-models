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
import org.openhealthtools.mdht.uml.cda.consol.Condition;
import org.openhealthtools.mdht.uml.cda.consol.ConditionEntry;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.EpisodeObservation;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Condition</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Condition#validateConditionEntryRelationshipRequired(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Relationship Required</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Condition#validateConditionSubjectOfTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Subject Of Target</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Condition#validateConditionContainsProblemObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Contains Problem Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Condition#validateConditionContainsAlertObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Contains Alert Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Condition#validateConditionContainsPatientAwareness(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Contains Patient Awareness</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Condition#validateConditionEffectiveTimeLowHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Effective Time Low High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Condition#validateConditionHasRelatedObservations(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Has Related Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Condition#validateConditionRelatedObservationsTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Related Observations Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Condition#validateConditionHasRelatedReferencesTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Has Related References Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Condition#validateConditionHasTreatingProvider(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Has Treating Provider</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Condition#validateConditionHasProviderId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Has Provider Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Condition#validateConditionHasProviderTreatmentTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Has Provider Treatment Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Condition#validateConditionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Condition#validateConditionClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Condition#validateConditionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Condition#validateConditionId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Condition#validateConditionCodeNullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Code Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Condition#validateConditionEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Condition#validateConditionConditionEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Condition Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Condition#validateConditionEpisodeObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Episode Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Condition#getConditionEntries() <em>Get Condition Entries</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Condition#getEpisodeObservation() <em>Get Episode Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEntryRelationshipRequired(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Relationship Required</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryRelationshipRequired(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_ENTRY_RELATIONSHIP_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.entryRelationship->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionEntryRelationshipRequired(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Relationship Required</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryRelationshipRequired(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_ENTRY_RELATIONSHIP_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.entryRelationship->isEmpty()
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConditionEntryRelationshipRequired(Condition condition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_CONDITION_ENTRY_RELATIONSHIP_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONDITION);
			try {
				VALIDATE_CONDITION_ENTRY_RELATIONSHIP_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_ENTRY_RELATIONSHIP_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_ENTRY_RELATIONSHIP_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			condition)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONDITION__CONDITION_ENTRY_RELATIONSHIP_REQUIRED,
					ConsolPlugin.INSTANCE.getString("ConditionEntryRelationshipRequired"), new Object[] { condition }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionSubjectOfTarget(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Subject Of Target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionSubjectOfTarget(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_SUBJECT_OF_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getEntryRelationshipTargets(vocab::x_ActRelationshipEntryRelationship::SUBJ, cda::ClinicalStatement)->forAll(target : cda::ClinicalStatement | not target.oclIsUndefined() and "
			+ "  (target.oclIsKindOf(ccd::ProblemObservation) or target.oclIsKindOf(ccd::AlertObservation)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionSubjectOfTarget(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Subject Of Target</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionSubjectOfTarget(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_SUBJECT_OF_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getEntryRelationshipTargets(vocab::x_ActRelationshipEntryRelationship::SUBJ, cda::ClinicalStatement)->forAll(target : cda::ClinicalStatement | not target.oclIsUndefined() and 
	 *   (target.oclIsKindOf(ccd::ProblemObservation) or target.oclIsKindOf(ccd::AlertObservation)))
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConditionSubjectOfTarget(Condition condition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_CONDITION_SUBJECT_OF_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONDITION);
			try {
				VALIDATE_CONDITION_SUBJECT_OF_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_SUBJECT_OF_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_SUBJECT_OF_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(condition)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONDITION__CONDITION_SUBJECT_OF_TARGET,
					ConsolPlugin.INSTANCE.getString("ConditionSubjectOfTarget"), new Object[] { condition }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionContainsProblemObservation(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Contains Problem Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionContainsProblemObservation(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_CONTAINS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getSection().oclIsKindOf(ccd::ProblemSection) implies self.getObservations()"
			+ "   ->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::ProblemObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionContainsProblemObservation(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Contains Problem Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionContainsProblemObservation(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_CONTAINS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSection().oclIsKindOf(ccd::ProblemSection) implies self.getObservations()
	 *    ->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::ProblemObservation))
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConditionContainsProblemObservation(Condition condition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_CONDITION_CONTAINS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONDITION);
			try {
				VALIDATE_CONDITION_CONTAINS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_CONTAINS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_CONTAINS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			condition)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONDITION__CONDITION_CONTAINS_PROBLEM_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("ConditionContainsProblemObservation"), new Object[] { condition }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionContainsAlertObservation(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Contains Alert Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionContainsAlertObservation(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_CONTAINS_ALERT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getSection().oclIsKindOf(ccd::AlertsSection) implies self.getObservations()"
			+ "   ->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::AlertObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionContainsAlertObservation(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Contains Alert Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionContainsAlertObservation(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_CONTAINS_ALERT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSection().oclIsKindOf(ccd::AlertsSection) implies self.getObservations()
	 *    ->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::AlertObservation))
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConditionContainsAlertObservation(Condition condition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_CONDITION_CONTAINS_ALERT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONDITION);
			try {
				VALIDATE_CONDITION_CONTAINS_ALERT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_CONTAINS_ALERT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_CONTAINS_ALERT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			condition)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONDITION__CONDITION_CONTAINS_ALERT_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("ConditionContainsAlertObservation"), new Object[] { condition }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionContainsPatientAwareness(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Contains Patient Awareness</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionContainsPatientAwareness(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_CONTAINS_PATIENT_AWARENESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(partic : cda::Participant2 | partic.oclIsKindOf(ccd::PatientAwareness))";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionContainsPatientAwareness(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Contains Patient Awareness</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionContainsPatientAwareness(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_CONTAINS_PATIENT_AWARENESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->one(partic : cda::Participant2 | partic.oclIsKindOf(ccd::PatientAwareness))
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConditionContainsPatientAwareness(Condition condition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_CONDITION_CONTAINS_PATIENT_AWARENESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONDITION);
			try {
				VALIDATE_CONDITION_CONTAINS_PATIENT_AWARENESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_CONTAINS_PATIENT_AWARENESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_CONTAINS_PATIENT_AWARENESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			condition)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONDITION__CONDITION_CONTAINS_PATIENT_AWARENESS,
					ConsolPlugin.INSTANCE.getString("ConditionContainsPatientAwareness"), new Object[] { condition }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEffectiveTimeLowHigh(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Effective Time Low High</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEffectiveTimeLowHigh(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_EFFECTIVE_TIME_LOW_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.effectiveTime.low.oclIsUndefined()"
			+ "   and ((self.statusCode.code = 'completed' or self.statusCode.code = 'aborted') implies not self.effectiveTime.high.oclIsUndefined())"
			+ "   and ((self.statusCode.code <> 'completed' and self.statusCode.code <> 'aborted') implies self.effectiveTime.high.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionEffectiveTimeLowHigh(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Effective Time Low High</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEffectiveTimeLowHigh(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_EFFECTIVE_TIME_LOW_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.effectiveTime.low.oclIsUndefined()
	 *    and ((self.statusCode.code = 'completed' or self.statusCode.code = 'aborted') implies not self.effectiveTime.high.oclIsUndefined())
	 *    and ((self.statusCode.code <> 'completed' and self.statusCode.code <> 'aborted') implies self.effectiveTime.high.oclIsUndefined())
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConditionEffectiveTimeLowHigh(Condition condition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_CONDITION_EFFECTIVE_TIME_LOW_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONDITION);
			try {
				VALIDATE_CONDITION_EFFECTIVE_TIME_LOW_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_EFFECTIVE_TIME_LOW_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_EFFECTIVE_TIME_LOW_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			condition)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONDITION__CONDITION_EFFECTIVE_TIME_LOW_HIGH,
					ConsolPlugin.INSTANCE.getString("ConditionEffectiveTimeLowHigh"), new Object[] { condition }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionHasRelatedObservations(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Has Related Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionHasRelatedObservations(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_HAS_RELATED_OBSERVATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship.observation.templateId->exists(id : datatypes::II | id.root =  '1.3.6.1.4.1.19376.1.5.3.1.4.5') or self.entryRelationship.observation.templateId->exists(id : datatypes::II | id.root =  '1.3.6.1.4.1.19376.1.5.3.1.4.6')";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionHasRelatedObservations(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Has Related Observations</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionHasRelatedObservations(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_HAS_RELATED_OBSERVATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship.observation.templateId->exists(id : datatypes::II | id.root =  '1.3.6.1.4.1.19376.1.5.3.1.4.5') or self.entryRelationship.observation.templateId->exists(id : datatypes::II | id.root =  '1.3.6.1.4.1.19376.1.5.3.1.4.6')
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConditionHasRelatedObservations(Condition condition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_CONDITION_HAS_RELATED_OBSERVATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONDITION);
			try {
				VALIDATE_CONDITION_HAS_RELATED_OBSERVATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_HAS_RELATED_OBSERVATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_HAS_RELATED_OBSERVATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			condition)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONDITION__CONDITION_HAS_RELATED_OBSERVATIONS,
					ConsolPlugin.INSTANCE.getString("ConditionHasRelatedObservations"), new Object[] { condition }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionRelatedObservationsTypeCode(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Related Observations Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionRelatedObservationsTypeCode(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_RELATED_OBSERVATIONS_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->select(er|er.typeCode <> vocab::x_ActRelationshipEntryRelationship::SUBJ)->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionRelatedObservationsTypeCode(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Related Observations Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionRelatedObservationsTypeCode(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_RELATED_OBSERVATIONS_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->select(er|er.typeCode <> vocab::x_ActRelationshipEntryRelationship::SUBJ)->isEmpty()
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConditionRelatedObservationsTypeCode(Condition condition,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_RELATED_OBSERVATIONS_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONDITION);
			try {
				VALIDATE_CONDITION_RELATED_OBSERVATIONS_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_RELATED_OBSERVATIONS_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_RELATED_OBSERVATIONS_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			condition)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONDITION__CONDITION_RELATED_OBSERVATIONS_TYPE_CODE,
					ConsolPlugin.INSTANCE.getString("ConditionRelatedObservationsTypeCode"), new Object[] { condition }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionHasRelatedReferencesTypeCode(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Has Related References Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionHasRelatedReferencesTypeCode(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_HAS_RELATED_REFERENCES_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->forAll(r | r.typeCode = vocab::x_ActRelationshipExternalReference)";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionHasRelatedReferencesTypeCode(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Has Related References Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionHasRelatedReferencesTypeCode(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_HAS_RELATED_REFERENCES_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.reference->forAll(r | r.typeCode = vocab::x_ActRelationshipExternalReference)
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConditionHasRelatedReferencesTypeCode(Condition condition,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_HAS_RELATED_REFERENCES_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONDITION);
			try {
				VALIDATE_CONDITION_HAS_RELATED_REFERENCES_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_HAS_RELATED_REFERENCES_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_HAS_RELATED_REFERENCES_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			condition)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONDITION__CONDITION_HAS_RELATED_REFERENCES_TYPE_CODE,
					ConsolPlugin.INSTANCE.getString("ConditionHasRelatedReferencesTypeCode"),
					new Object[] { condition }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionHasTreatingProvider(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Has Treating Provider</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionHasTreatingProvider(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_HAS_TREATING_PROVIDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.performer->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionHasTreatingProvider(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Has Treating Provider</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionHasTreatingProvider(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_HAS_TREATING_PROVIDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.performer->isEmpty()
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConditionHasTreatingProvider(Condition condition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_CONDITION_HAS_TREATING_PROVIDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONDITION);
			try {
				VALIDATE_CONDITION_HAS_TREATING_PROVIDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_HAS_TREATING_PROVIDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_HAS_TREATING_PROVIDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			condition)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONDITION__CONDITION_HAS_TREATING_PROVIDER,
					ConsolPlugin.INSTANCE.getString("ConditionHasTreatingProvider"), new Object[] { condition }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionHasProviderId(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Has Provider Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionHasProviderId(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_HAS_PROVIDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->exists(p : cda::Performer2 | p.assignedEntity.id->size() > 0)";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionHasProviderId(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Has Provider Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionHasProviderId(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_HAS_PROVIDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->exists(p : cda::Performer2 | p.assignedEntity.id->size() > 0)
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConditionHasProviderId(Condition condition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_CONDITION_HAS_PROVIDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONDITION);
			try {
				VALIDATE_CONDITION_HAS_PROVIDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_HAS_PROVIDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_HAS_PROVIDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(condition)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONDITION__CONDITION_HAS_PROVIDER_ID,
					ConsolPlugin.INSTANCE.getString("ConditionHasProviderId"), new Object[] { condition }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionHasProviderTreatmentTime(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Has Provider Treatment Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionHasProviderTreatmentTime(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_HAS_PROVIDER_TREATMENT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->exists(p : cda::Performer2 | p.time.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionHasProviderTreatmentTime(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Has Provider Treatment Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionHasProviderTreatmentTime(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_HAS_PROVIDER_TREATMENT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->exists(p : cda::Performer2 | p.time.oclIsUndefined())
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConditionHasProviderTreatmentTime(Condition condition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_CONDITION_HAS_PROVIDER_TREATMENT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONDITION);
			try {
				VALIDATE_CONDITION_HAS_PROVIDER_TREATMENT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_HAS_PROVIDER_TREATMENT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_HAS_PROVIDER_TREATMENT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			condition)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONDITION__CONDITION_HAS_PROVIDER_TREATMENT_TIME,
					ConsolPlugin.INSTANCE.getString("ConditionHasProviderTreatmentTime"), new Object[] { condition }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionTemplateId(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionTemplateId(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.7')";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionTemplateId(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionTemplateId(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.7')
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConditionTemplateId(Condition condition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_CONDITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONDITION);
			try {
				VALIDATE_CONDITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(condition)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONDITION__CONDITION_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("ConditionTemplateId"), new Object[] { condition }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionClassCode(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionClassCode(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionClassCode(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionClassCode(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.classCode=vocab::x_ActClassDocumentEntryAct::ACT
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConditionClassCode(Condition condition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_CONDITION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONDITION);
			try {
				VALIDATE_CONDITION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(condition)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONDITION__CONDITION_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("ConditionClassCode"), new Object[] { condition }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionMoodCode(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionMoodCode(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionMoodCode(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionMoodCode(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_DocumentActMood::EVN
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConditionMoodCode(Condition condition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_CONDITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONDITION);
			try {
				VALIDATE_CONDITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(condition)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONDITION__CONDITION_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("ConditionMoodCode"), new Object[] { condition }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionId(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionId(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionId(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionId(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConditionId(Condition condition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_CONDITION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONDITION);
			try {
				VALIDATE_CONDITION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(condition)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE, ConsolValidator.CONDITION__CONDITION_ID,
					ConsolPlugin.INSTANCE.getString("ConditionId"), new Object[] { condition }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionCodeNullFlavor(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Code Null Flavor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionCodeNullFlavor(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_CODE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (self.code.nullFlavor = vocab::NullFlavor::NA)";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionCodeNullFlavor(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Code Null Flavor</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionCodeNullFlavor(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_CODE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (self.code.nullFlavor = vocab::NullFlavor::NA)
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConditionCodeNullFlavor(Condition condition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_CONDITION_CODE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONDITION);
			try {
				VALIDATE_CONDITION_CODE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_CODE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_CODE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(condition)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONDITION__CONDITION_CODE_NULL_FLAVOR,
					ConsolPlugin.INSTANCE.getString("ConditionCodeNullFlavor"), new Object[] { condition }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEffectiveTime(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEffectiveTime(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionEffectiveTime(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEffectiveTime(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConditionEffectiveTime(Condition condition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_CONDITION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONDITION);
			try {
				VALIDATE_CONDITION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(condition)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONDITION__CONDITION_EFFECTIVE_TIME,
					ConsolPlugin.INSTANCE.getString("ConditionEffectiveTime"), new Object[] { condition }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionConditionEntry(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Condition Entry</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionConditionEntry(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_CONDITION_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::ConditionEntry) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionConditionEntry(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Condition Entry</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionConditionEntry(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_CONDITION_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::ConditionEntry) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConditionConditionEntry(Condition condition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_CONDITION_CONDITION_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONDITION);
			try {
				VALIDATE_CONDITION_CONDITION_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_CONDITION_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_CONDITION_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(condition)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONDITION__CONDITION_CONDITION_ENTRY,
					ConsolPlugin.INSTANCE.getString("ConditionConditionEntry"), new Object[] { condition }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEpisodeObservation(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Episode Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEpisodeObservation(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_EPISODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::EpisodeObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionEpisodeObservation(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Episode Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEpisodeObservation(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_EPISODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::EpisodeObservation))
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConditionEpisodeObservation(Condition condition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_CONDITION_EPISODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONDITION);
			try {
				VALIDATE_CONDITION_EPISODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_EPISODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_EPISODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			condition)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONDITION__CONDITION_EPISODE_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("ConditionEpisodeObservation"), new Object[] { condition }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getConditionEntries(Condition) <em>Get Condition Entries</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionEntries(Condition)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONDITION_ENTRIES__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ConditionEntry)).oclAsType(consol::ConditionEntry)";

	/**
	 * The cached OCL query for the '{@link #getConditionEntries(Condition) <em>Get Condition Entries</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionEntries(Condition)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONDITION_ENTRIES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ConditionEntry)).oclAsType(consol::ConditionEntry)
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<ConditionEntry> getConditionEntries(Condition condition) {
		if (GET_CONDITION_ENTRIES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONDITION, ConsolPackage.Literals.CONDITION.getEAllOperations().get(69));
			try {
				GET_CONDITION_ENTRIES__EOCL_QRY = helper.createQuery(GET_CONDITION_ENTRIES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONDITION_ENTRIES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ConditionEntry> result = (Collection<ConditionEntry>) query.evaluate(condition);
		return new BasicEList.UnmodifiableEList<ConditionEntry>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getEpisodeObservation(Condition) <em>Get Episode Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpisodeObservation(Condition)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_EPISODE_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::EpisodeObservation))->asSequence()->first().oclAsType(consol::EpisodeObservation)";

	/**
	 * The cached OCL query for the '{@link #getEpisodeObservation(Condition) <em>Get Episode Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpisodeObservation(Condition)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_EPISODE_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::EpisodeObservation))->asSequence()->first().oclAsType(consol::EpisodeObservation)
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EpisodeObservation getEpisodeObservation(Condition condition) {
		if (GET_EPISODE_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONDITION, ConsolPackage.Literals.CONDITION.getEAllOperations().get(70));
			try {
				GET_EPISODE_OBSERVATION__EOCL_QRY = helper.createQuery(GET_EPISODE_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_EPISODE_OBSERVATION__EOCL_QRY);
		return (EpisodeObservation) query.evaluate(condition);
	}

} // ConditionOperations
