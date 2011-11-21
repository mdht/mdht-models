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

import org.openhealthtools.mdht.uml.cda.consol.AgeObservation;
import org.openhealthtools.mdht.uml.cda.consol.Comment;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.ProblemEntryReactionObservationContainer;
import org.openhealthtools.mdht.uml.cda.consol.ProblemStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.Severity;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Problem Entry Reaction Observation Container</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemEntryReactionObservationContainer#validateProblemEntryReactionObservationContainerHasReactionIntervention(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Reaction Observation Container Has Reaction Intervention</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemEntryReactionObservationContainer#validateProblemEntryReactionObservationContainerReactionInterventionTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Reaction Observation Container Reaction Intervention Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemEntryReactionObservationContainer#validateProblemEntryReactionObservationContainerReactionInterventionType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Reaction Observation Container Reaction Intervention Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemEntryReactionObservationContainer#validateProblemEntryReactionObservationContainerInformationSource(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Reaction Observation Container Information Source</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemEntryReactionObservationContainer#validateProblemEntryReactionObservationContainerContainsPatientAwareness(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Reaction Observation Container Contains Patient Awareness</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemEntryReactionObservationContainer#validateProblemEntryReactionObservationContainerHasTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Reaction Observation Container Has Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemEntryReactionObservationContainer#validateProblemEntryReactionObservationContainerCommentInversionInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Reaction Observation Container Comment Inversion Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemEntryReactionObservationContainer#validateProblemEntryReactionObservationContainerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Reaction Observation Container Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemEntryReactionObservationContainer#validateProblemEntryReactionObservationContainerMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Reaction Observation Container Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemEntryReactionObservationContainer#validateProblemEntryReactionObservationContainerId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Reaction Observation Container Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemEntryReactionObservationContainer#validateProblemEntryReactionObservationContainerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Reaction Observation Container Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemEntryReactionObservationContainer#validateProblemEntryReactionObservationContainerText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Reaction Observation Container Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemEntryReactionObservationContainer#validateProblemEntryReactionObservationContainerStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Reaction Observation Container Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemEntryReactionObservationContainer#validateProblemEntryReactionObservationContainerEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Reaction Observation Container Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemEntryReactionObservationContainer#validateProblemEntryReactionObservationContainerValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Reaction Observation Container Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemEntryReactionObservationContainer#validateProblemEntryReactionObservationContainerAgeObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Reaction Observation Container Age Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemEntryReactionObservationContainer#validateProblemEntryReactionObservationContainerSeverity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Reaction Observation Container Severity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemEntryReactionObservationContainer#validateProblemEntryReactionObservationContainerProblemStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Reaction Observation Container Problem Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemEntryReactionObservationContainer#validateProblemEntryReactionObservationContainerHealthStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Reaction Observation Container Health Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemEntryReactionObservationContainer#validateProblemEntryReactionObservationContainerComment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Reaction Observation Container Comment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemEntryReactionObservationContainer#getAgeObservation() <em>Get Age Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemEntryReactionObservationContainer#getSeverity() <em>Get Severity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemEntryReactionObservationContainer#getProblemStatusObservation() <em>Get Problem Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemEntryReactionObservationContainer#getHealthStatusObservation() <em>Get Health Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemEntryReactionObservationContainer#getComments() <em>Get Comments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProblemEntryReactionObservationContainerOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProblemEntryReactionObservationContainerOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemEntryReactionObservationContainerHasReactionIntervention(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Reaction Observation Container Has Reaction Intervention</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryReactionObservationContainerHasReactionIntervention(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_HAS_REACTION_INTERVENTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.getEntryRelationshipTargets(vocab::x_ActRelationshipEntryRelationship::RSON, cda::ClinicalStatement)->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemEntryReactionObservationContainerHasReactionIntervention(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Reaction Observation Container Has Reaction Intervention</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryReactionObservationContainerHasReactionIntervention(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_HAS_REACTION_INTERVENTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.getEntryRelationshipTargets(vocab::x_ActRelationshipEntryRelationship::RSON, cda::ClinicalStatement)->isEmpty()
	 * @param problemEntryReactionObservationContainer The receiving '<em><b>Problem Entry Reaction Observation Container</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProblemEntryReactionObservationContainerHasReactionIntervention(ProblemEntryReactionObservationContainer problemEntryReactionObservationContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_HAS_REACTION_INTERVENTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER);
			try {
				VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_HAS_REACTION_INTERVENTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_HAS_REACTION_INTERVENTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_HAS_REACTION_INTERVENTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemEntryReactionObservationContainer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_HAS_REACTION_INTERVENTION,
						 ConsolPlugin.INSTANCE.getString("ProblemEntryReactionObservationContainerHasReactionIntervention"),
						 new Object [] { problemEntryReactionObservationContainer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemEntryReactionObservationContainerReactionInterventionTypeCode(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Reaction Observation Container Reaction Intervention Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryReactionObservationContainerReactionInterventionTypeCode(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_REACTION_INTERVENTION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->forAll(entry | entry.typeCode <> vocab::x_ActRelationshipEntryRelationship::RSON  or ( entry.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON and (entry.act->isEmpty() and entry.procedure->isEmpty()  ) ) )";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemEntryReactionObservationContainerReactionInterventionTypeCode(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Reaction Observation Container Reaction Intervention Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryReactionObservationContainerReactionInterventionTypeCode(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_REACTION_INTERVENTION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->forAll(entry | entry.typeCode <> vocab::x_ActRelationshipEntryRelationship::RSON  or ( entry.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON and (entry.act->isEmpty() and entry.procedure->isEmpty()  ) ) )
	 * @param problemEntryReactionObservationContainer The receiving '<em><b>Problem Entry Reaction Observation Container</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProblemEntryReactionObservationContainerReactionInterventionTypeCode(ProblemEntryReactionObservationContainer problemEntryReactionObservationContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_REACTION_INTERVENTION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER);
			try {
				VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_REACTION_INTERVENTION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_REACTION_INTERVENTION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_REACTION_INTERVENTION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemEntryReactionObservationContainer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_REACTION_INTERVENTION_TYPE_CODE,
						 ConsolPlugin.INSTANCE.getString("ProblemEntryReactionObservationContainerReactionInterventionTypeCode"),
						 new Object [] { problemEntryReactionObservationContainer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemEntryReactionObservationContainerReactionInterventionType(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Reaction Observation Container Reaction Intervention Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryReactionObservationContainerReactionInterventionType(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_REACTION_INTERVENTION_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getEntryRelationshipTargets(vocab::x_ActRelationshipEntryRelationship::RSON, cda::ClinicalStatement)->exists(entry : cda::ClinicalStatement | entry.oclIsKindOf(ccd::ProcedureActivity) or entry.oclIsKindOf(ccd::MedicationActivity))";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemEntryReactionObservationContainerReactionInterventionType(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Reaction Observation Container Reaction Intervention Type</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryReactionObservationContainerReactionInterventionType(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_REACTION_INTERVENTION_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getEntryRelationshipTargets(vocab::x_ActRelationshipEntryRelationship::RSON, cda::ClinicalStatement)->exists(entry : cda::ClinicalStatement | entry.oclIsKindOf(ccd::ProcedureActivity) or entry.oclIsKindOf(ccd::MedicationActivity))
	 * @param problemEntryReactionObservationContainer The receiving '<em><b>Problem Entry Reaction Observation Container</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProblemEntryReactionObservationContainerReactionInterventionType(ProblemEntryReactionObservationContainer problemEntryReactionObservationContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_REACTION_INTERVENTION_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER);
			try {
				VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_REACTION_INTERVENTION_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_REACTION_INTERVENTION_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_REACTION_INTERVENTION_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemEntryReactionObservationContainer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_REACTION_INTERVENTION_TYPE,
						 ConsolPlugin.INSTANCE.getString("ProblemEntryReactionObservationContainerReactionInterventionType"),
						 new Object [] { problemEntryReactionObservationContainer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemEntryReactionObservationContainerInformationSource(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Reaction Observation Container Information Source</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryReactionObservationContainerInformationSource(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.informant->isEmpty() "+
"or not self.getSection().informant->isEmpty()"+
"or not self.getClinicalDocument().informant->isEmpty()"+
"or self.reference->exists(ref : cda::Reference | ref.typeCode = vocab::x_ActRelationshipExternalReference::XCRPT)"+
"or (self.entryRelationship->exists(rel : cda::EntryRelationship | "+
"   rel.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR"+
"   and rel.observation.code.code = '48766-0'))";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemEntryReactionObservationContainerInformationSource(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Reaction Observation Container Information Source</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryReactionObservationContainerInformationSource(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.informant->isEmpty() 
	 * or not self.getSection().informant->isEmpty()
	 * or not self.getClinicalDocument().informant->isEmpty()
	 * or self.reference->exists(ref : cda::Reference | ref.typeCode = vocab::x_ActRelationshipExternalReference::XCRPT)
	 * or (self.entryRelationship->exists(rel : cda::EntryRelationship | 
	 *    rel.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR
	 *    and rel.observation.code.code = '48766-0'))
	 * @param problemEntryReactionObservationContainer The receiving '<em><b>Problem Entry Reaction Observation Container</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProblemEntryReactionObservationContainerInformationSource(ProblemEntryReactionObservationContainer problemEntryReactionObservationContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER);
			try {
				VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemEntryReactionObservationContainer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_INFORMATION_SOURCE,
						 ConsolPlugin.INSTANCE.getString("ProblemEntryReactionObservationContainerInformationSource"),
						 new Object [] { problemEntryReactionObservationContainer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemEntryReactionObservationContainerContainsPatientAwareness(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Reaction Observation Container Contains Patient Awareness</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryReactionObservationContainerContainsPatientAwareness(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_CONTAINS_PATIENT_AWARENESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(partic : cda::Participant2 | partic.oclIsKindOf(ccd::PatientAwareness))";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemEntryReactionObservationContainerContainsPatientAwareness(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Reaction Observation Container Contains Patient Awareness</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryReactionObservationContainerContainsPatientAwareness(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_CONTAINS_PATIENT_AWARENESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->one(partic : cda::Participant2 | partic.oclIsKindOf(ccd::PatientAwareness))
	 * @param problemEntryReactionObservationContainer The receiving '<em><b>Problem Entry Reaction Observation Container</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProblemEntryReactionObservationContainerContainsPatientAwareness(ProblemEntryReactionObservationContainer problemEntryReactionObservationContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_CONTAINS_PATIENT_AWARENESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER);
			try {
				VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_CONTAINS_PATIENT_AWARENESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_CONTAINS_PATIENT_AWARENESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_CONTAINS_PATIENT_AWARENESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemEntryReactionObservationContainer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_CONTAINS_PATIENT_AWARENESS,
						 ConsolPlugin.INSTANCE.getString("ProblemEntryReactionObservationContainerContainsPatientAwareness"),
						 new Object [] { problemEntryReactionObservationContainer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemEntryReactionObservationContainerHasTextReference(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Reaction Observation Container Has Text Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryReactionObservationContainerHasTextReference(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.reference.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemEntryReactionObservationContainerHasTextReference(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Reaction Observation Container Has Text Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryReactionObservationContainerHasTextReference(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.text.reference.oclIsUndefined()
	 * @param problemEntryReactionObservationContainer The receiving '<em><b>Problem Entry Reaction Observation Container</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProblemEntryReactionObservationContainerHasTextReference(ProblemEntryReactionObservationContainer problemEntryReactionObservationContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER);
			try {
				VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemEntryReactionObservationContainer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_HAS_TEXT_REFERENCE,
						 ConsolPlugin.INSTANCE.getString("ProblemEntryReactionObservationContainerHasTextReference"),
						 new Object [] { problemEntryReactionObservationContainer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemEntryReactionObservationContainerCommentInversionInd(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Reaction Observation Container Comment Inversion Ind</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryReactionObservationContainerCommentInversionInd(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_COMMENT_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->forAll(rel : cda::EntryRelationship | (not rel.act.oclIsUndefined() and rel.act.oclIsKindOf(ihe::Comment)) implies rel.inversionInd=true)";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemEntryReactionObservationContainerCommentInversionInd(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Reaction Observation Container Comment Inversion Ind</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryReactionObservationContainerCommentInversionInd(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_COMMENT_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->forAll(rel : cda::EntryRelationship | (not rel.act.oclIsUndefined() and rel.act.oclIsKindOf(ihe::Comment)) implies rel.inversionInd=true)
	 * @param problemEntryReactionObservationContainer The receiving '<em><b>Problem Entry Reaction Observation Container</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProblemEntryReactionObservationContainerCommentInversionInd(ProblemEntryReactionObservationContainer problemEntryReactionObservationContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_COMMENT_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER);
			try {
				VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_COMMENT_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_COMMENT_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_COMMENT_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemEntryReactionObservationContainer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_COMMENT_INVERSION_IND,
						 ConsolPlugin.INSTANCE.getString("ProblemEntryReactionObservationContainerCommentInversionInd"),
						 new Object [] { problemEntryReactionObservationContainer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemEntryReactionObservationContainerTemplateId(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Reaction Observation Container Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryReactionObservationContainerTemplateId(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.5')";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemEntryReactionObservationContainerTemplateId(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Reaction Observation Container Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryReactionObservationContainerTemplateId(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.5')
	 * @param problemEntryReactionObservationContainer The receiving '<em><b>Problem Entry Reaction Observation Container</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProblemEntryReactionObservationContainerTemplateId(ProblemEntryReactionObservationContainer problemEntryReactionObservationContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER);
			try {
				VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemEntryReactionObservationContainer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("ProblemEntryReactionObservationContainerTemplateId"),
						 new Object [] { problemEntryReactionObservationContainer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemEntryReactionObservationContainerMoodCode(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Reaction Observation Container Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryReactionObservationContainerMoodCode(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemEntryReactionObservationContainerMoodCode(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Reaction Observation Container Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryReactionObservationContainerMoodCode(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
	 * @param problemEntryReactionObservationContainer The receiving '<em><b>Problem Entry Reaction Observation Container</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProblemEntryReactionObservationContainerMoodCode(ProblemEntryReactionObservationContainer problemEntryReactionObservationContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER);
			try {
				VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemEntryReactionObservationContainer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_MOOD_CODE,
						 ConsolPlugin.INSTANCE.getString("ProblemEntryReactionObservationContainerMoodCode"),
						 new Object [] { problemEntryReactionObservationContainer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemEntryReactionObservationContainerId(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Reaction Observation Container Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryReactionObservationContainerId(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemEntryReactionObservationContainerId(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Reaction Observation Container Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryReactionObservationContainerId(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
	 * @param problemEntryReactionObservationContainer The receiving '<em><b>Problem Entry Reaction Observation Container</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProblemEntryReactionObservationContainerId(ProblemEntryReactionObservationContainer problemEntryReactionObservationContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER);
			try {
				VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemEntryReactionObservationContainer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_ID,
						 ConsolPlugin.INSTANCE.getString("ProblemEntryReactionObservationContainerId"),
						 new Object [] { problemEntryReactionObservationContainer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemEntryReactionObservationContainerCode(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Reaction Observation Container Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryReactionObservationContainerCode(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in ("+
"value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '404684003' or value.code = '409586006' or value.code = '282291009' or value.code = '64572001' or value.code = '248536006' or value.code = '418799008' or value.code = '55607006')))";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemEntryReactionObservationContainerCode(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Reaction Observation Container Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryReactionObservationContainerCode(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in (
	 * value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '404684003' or value.code = '409586006' or value.code = '282291009' or value.code = '64572001' or value.code = '248536006' or value.code = '418799008' or value.code = '55607006')))
	 * @param problemEntryReactionObservationContainer The receiving '<em><b>Problem Entry Reaction Observation Container</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProblemEntryReactionObservationContainerCode(ProblemEntryReactionObservationContainer problemEntryReactionObservationContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER);
			try {
				VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemEntryReactionObservationContainer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_CODE,
						 ConsolPlugin.INSTANCE.getString("ProblemEntryReactionObservationContainerCode"),
						 new Object [] { problemEntryReactionObservationContainer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemEntryReactionObservationContainerText(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Reaction Observation Container Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryReactionObservationContainerText(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemEntryReactionObservationContainerText(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Reaction Observation Container Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryReactionObservationContainerText(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())
	 * @param problemEntryReactionObservationContainer The receiving '<em><b>Problem Entry Reaction Observation Container</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProblemEntryReactionObservationContainerText(ProblemEntryReactionObservationContainer problemEntryReactionObservationContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER);
			try {
				VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemEntryReactionObservationContainer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_TEXT,
						 ConsolPlugin.INSTANCE.getString("ProblemEntryReactionObservationContainerText"),
						 new Object [] { problemEntryReactionObservationContainer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemEntryReactionObservationContainerStatusCode(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Reaction Observation Container Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryReactionObservationContainerStatusCode(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in ("+
"value.code = 'completed'))";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemEntryReactionObservationContainerStatusCode(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Reaction Observation Container Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryReactionObservationContainerStatusCode(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in (
	 * value.code = 'completed'))
	 * @param problemEntryReactionObservationContainer The receiving '<em><b>Problem Entry Reaction Observation Container</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProblemEntryReactionObservationContainerStatusCode(ProblemEntryReactionObservationContainer problemEntryReactionObservationContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER);
			try {
				VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemEntryReactionObservationContainer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_STATUS_CODE,
						 ConsolPlugin.INSTANCE.getString("ProblemEntryReactionObservationContainerStatusCode"),
						 new Object [] { problemEntryReactionObservationContainer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemEntryReactionObservationContainerEffectiveTime(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Reaction Observation Container Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryReactionObservationContainerEffectiveTime(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemEntryReactionObservationContainerEffectiveTime(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Reaction Observation Container Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryReactionObservationContainerEffectiveTime(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
	 * @param problemEntryReactionObservationContainer The receiving '<em><b>Problem Entry Reaction Observation Container</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProblemEntryReactionObservationContainerEffectiveTime(ProblemEntryReactionObservationContainer problemEntryReactionObservationContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER);
			try {
				VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemEntryReactionObservationContainer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_EFFECTIVE_TIME,
						 ConsolPlugin.INSTANCE.getString("ProblemEntryReactionObservationContainerEffectiveTime"),
						 new Object [] { problemEntryReactionObservationContainer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemEntryReactionObservationContainerValue(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Reaction Observation Container Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryReactionObservationContainerValue(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemEntryReactionObservationContainerValue(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Reaction Observation Container Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryReactionObservationContainerValue(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))
	 * @param problemEntryReactionObservationContainer The receiving '<em><b>Problem Entry Reaction Observation Container</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProblemEntryReactionObservationContainerValue(ProblemEntryReactionObservationContainer problemEntryReactionObservationContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER);
			try {
				VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemEntryReactionObservationContainer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_VALUE,
						 ConsolPlugin.INSTANCE.getString("ProblemEntryReactionObservationContainerValue"),
						 new Object [] { problemEntryReactionObservationContainer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemEntryReactionObservationContainerAgeObservation(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Reaction Observation Container Age Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryReactionObservationContainerAgeObservation(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::AgeObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemEntryReactionObservationContainerAgeObservation(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Reaction Observation Container Age Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryReactionObservationContainerAgeObservation(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::AgeObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)
	 * @param problemEntryReactionObservationContainer The receiving '<em><b>Problem Entry Reaction Observation Container</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProblemEntryReactionObservationContainerAgeObservation(ProblemEntryReactionObservationContainer problemEntryReactionObservationContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER);
			try {
				VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemEntryReactionObservationContainer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_AGE_OBSERVATION,
						 ConsolPlugin.INSTANCE.getString("ProblemEntryReactionObservationContainerAgeObservation"),
						 new Object [] { problemEntryReactionObservationContainer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemEntryReactionObservationContainerSeverity(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Reaction Observation Container Severity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryReactionObservationContainerSeverity(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::Severity))";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemEntryReactionObservationContainerSeverity(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Reaction Observation Container Severity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryReactionObservationContainerSeverity(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::Severity))
	 * @param problemEntryReactionObservationContainer The receiving '<em><b>Problem Entry Reaction Observation Container</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProblemEntryReactionObservationContainerSeverity(ProblemEntryReactionObservationContainer problemEntryReactionObservationContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER);
			try {
				VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemEntryReactionObservationContainer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_SEVERITY,
						 ConsolPlugin.INSTANCE.getString("ProblemEntryReactionObservationContainerSeverity"),
						 new Object [] { problemEntryReactionObservationContainer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemEntryReactionObservationContainerProblemStatusObservation(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Reaction Observation Container Problem Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryReactionObservationContainerProblemStatusObservation(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::ProblemStatusObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemEntryReactionObservationContainerProblemStatusObservation(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Reaction Observation Container Problem Status Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryReactionObservationContainerProblemStatusObservation(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::ProblemStatusObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)
	 * @param problemEntryReactionObservationContainer The receiving '<em><b>Problem Entry Reaction Observation Container</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProblemEntryReactionObservationContainerProblemStatusObservation(ProblemEntryReactionObservationContainer problemEntryReactionObservationContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER);
			try {
				VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemEntryReactionObservationContainer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_PROBLEM_STATUS_OBSERVATION,
						 ConsolPlugin.INSTANCE.getString("ProblemEntryReactionObservationContainerProblemStatusObservation"),
						 new Object [] { problemEntryReactionObservationContainer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemEntryReactionObservationContainerHealthStatusObservation(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Reaction Observation Container Health Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryReactionObservationContainerHealthStatusObservation(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_HEALTH_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::HealthStatusObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemEntryReactionObservationContainerHealthStatusObservation(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Reaction Observation Container Health Status Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryReactionObservationContainerHealthStatusObservation(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_HEALTH_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::HealthStatusObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)
	 * @param problemEntryReactionObservationContainer The receiving '<em><b>Problem Entry Reaction Observation Container</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProblemEntryReactionObservationContainerHealthStatusObservation(ProblemEntryReactionObservationContainer problemEntryReactionObservationContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_HEALTH_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER);
			try {
				VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_HEALTH_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_HEALTH_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_HEALTH_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemEntryReactionObservationContainer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_HEALTH_STATUS_OBSERVATION,
						 ConsolPlugin.INSTANCE.getString("ProblemEntryReactionObservationContainerHealthStatusObservation"),
						 new Object [] { problemEntryReactionObservationContainer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemEntryReactionObservationContainerComment(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Reaction Observation Container Comment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryReactionObservationContainerComment(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::Comment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemEntryReactionObservationContainerComment(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Reaction Observation Container Comment</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryReactionObservationContainerComment(ProblemEntryReactionObservationContainer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::Comment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)
	 * @param problemEntryReactionObservationContainer The receiving '<em><b>Problem Entry Reaction Observation Container</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProblemEntryReactionObservationContainerComment(ProblemEntryReactionObservationContainer problemEntryReactionObservationContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER);
			try {
				VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemEntryReactionObservationContainer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER_COMMENT,
						 ConsolPlugin.INSTANCE.getString("ProblemEntryReactionObservationContainerComment"),
						 new Object [] { problemEntryReactionObservationContainer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getAgeObservation(ProblemEntryReactionObservationContainer) <em>Get Age Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgeObservation(ProblemEntryReactionObservationContainer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_AGE_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AgeObservation))->asSequence()->first().oclAsType(consol::AgeObservation)";

	/**
	 * The cached OCL query for the '{@link #getAgeObservation(ProblemEntryReactionObservationContainer) <em>Get Age Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgeObservation(ProblemEntryReactionObservationContainer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_AGE_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AgeObservation))->asSequence()->first().oclAsType(consol::AgeObservation)
	 * @param problemEntryReactionObservationContainer The receiving '<em><b>Problem Entry Reaction Observation Container</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  AgeObservation getAgeObservation(ProblemEntryReactionObservationContainer problemEntryReactionObservationContainer) {
		if (GET_AGE_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER, ConsolPackage.Literals.PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER.getEAllOperations().get(69));
			try {
				GET_AGE_OBSERVATION__EOCL_QRY = helper.createQuery(GET_AGE_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_AGE_OBSERVATION__EOCL_QRY);
		return (AgeObservation) query.evaluate(problemEntryReactionObservationContainer);
	}

	/**
	 * The cached OCL expression body for the '{@link #getSeverity(ProblemEntryReactionObservationContainer) <em>Get Severity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity(ProblemEntryReactionObservationContainer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SEVERITY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::Severity))->asSequence()->first().oclAsType(consol::Severity)";

	/**
	 * The cached OCL query for the '{@link #getSeverity(ProblemEntryReactionObservationContainer) <em>Get Severity</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity(ProblemEntryReactionObservationContainer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SEVERITY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::Severity))->asSequence()->first().oclAsType(consol::Severity)
	 * @param problemEntryReactionObservationContainer The receiving '<em><b>Problem Entry Reaction Observation Container</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  Severity getSeverity(ProblemEntryReactionObservationContainer problemEntryReactionObservationContainer) {
		if (GET_SEVERITY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER, ConsolPackage.Literals.PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER.getEAllOperations().get(70));
			try {
				GET_SEVERITY__EOCL_QRY = helper.createQuery(GET_SEVERITY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SEVERITY__EOCL_QRY);
		return (Severity) query.evaluate(problemEntryReactionObservationContainer);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemStatusObservation(ProblemEntryReactionObservationContainer) <em>Get Problem Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemStatusObservation(ProblemEntryReactionObservationContainer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_STATUS_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ProblemStatusObservation))->asSequence()->first().oclAsType(consol::ProblemStatusObservation)";

	/**
	 * The cached OCL query for the '{@link #getProblemStatusObservation(ProblemEntryReactionObservationContainer) <em>Get Problem Status Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemStatusObservation(ProblemEntryReactionObservationContainer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_STATUS_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ProblemStatusObservation))->asSequence()->first().oclAsType(consol::ProblemStatusObservation)
	 * @param problemEntryReactionObservationContainer The receiving '<em><b>Problem Entry Reaction Observation Container</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  ProblemStatusObservation getProblemStatusObservation(ProblemEntryReactionObservationContainer problemEntryReactionObservationContainer) {
		if (GET_PROBLEM_STATUS_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER, ConsolPackage.Literals.PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER.getEAllOperations().get(71));
			try {
				GET_PROBLEM_STATUS_OBSERVATION__EOCL_QRY = helper.createQuery(GET_PROBLEM_STATUS_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_STATUS_OBSERVATION__EOCL_QRY);
		return (ProblemStatusObservation) query.evaluate(problemEntryReactionObservationContainer);
	}

	/**
	 * The cached OCL expression body for the '{@link #getHealthStatusObservation(ProblemEntryReactionObservationContainer) <em>Get Health Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthStatusObservation(ProblemEntryReactionObservationContainer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HEALTH_STATUS_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::HealthStatusObservation))->asSequence()->first().oclAsType(consol::HealthStatusObservation)";

	/**
	 * The cached OCL query for the '{@link #getHealthStatusObservation(ProblemEntryReactionObservationContainer) <em>Get Health Status Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthStatusObservation(ProblemEntryReactionObservationContainer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HEALTH_STATUS_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::HealthStatusObservation))->asSequence()->first().oclAsType(consol::HealthStatusObservation)
	 * @param problemEntryReactionObservationContainer The receiving '<em><b>Problem Entry Reaction Observation Container</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  HealthStatusObservation getHealthStatusObservation(ProblemEntryReactionObservationContainer problemEntryReactionObservationContainer) {
		if (GET_HEALTH_STATUS_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER, ConsolPackage.Literals.PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER.getEAllOperations().get(72));
			try {
				GET_HEALTH_STATUS_OBSERVATION__EOCL_QRY = helper.createQuery(GET_HEALTH_STATUS_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HEALTH_STATUS_OBSERVATION__EOCL_QRY);
		return (HealthStatusObservation) query.evaluate(problemEntryReactionObservationContainer);
	}

	/**
	 * The cached OCL expression body for the '{@link #getComments(ProblemEntryReactionObservationContainer) <em>Get Comments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments(ProblemEntryReactionObservationContainer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_COMMENTS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::Comment)).oclAsType(consol::Comment)";

	/**
	 * The cached OCL query for the '{@link #getComments(ProblemEntryReactionObservationContainer) <em>Get Comments</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments(ProblemEntryReactionObservationContainer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_COMMENTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::Comment)).oclAsType(consol::Comment)
	 * @param problemEntryReactionObservationContainer The receiving '<em><b>Problem Entry Reaction Observation Container</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<Comment> getComments(ProblemEntryReactionObservationContainer problemEntryReactionObservationContainer) {
		if (GET_COMMENTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER, ConsolPackage.Literals.PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER.getEAllOperations().get(73));
			try {
				GET_COMMENTS__EOCL_QRY = helper.createQuery(GET_COMMENTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_COMMENTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Comment> result = (Collection<Comment>) query.evaluate(problemEntryReactionObservationContainer);
		return new BasicEList.UnmodifiableEList<Comment>(result.size(), result.toArray());
	}

} // ProblemEntryReactionObservationContainerOperations