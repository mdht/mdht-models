/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.ActReference;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ExternalDocumentReference;
import org.openhealthtools.mdht.uml.cda.consol.GoalObservation;
import org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct;
import org.openhealthtools.mdht.uml.cda.consol.PatientPriorityPreference;

import org.openhealthtools.mdht.uml.cda.consol.PlannedAct2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedEncounter2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedObservation2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2;
import org.openhealthtools.mdht.uml.cda.consol.ProviderPriorityPreference;
import org.openhealthtools.mdht.uml.cda.consol.operations.GoalObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goal Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class GoalObservationImpl extends PlannedObservation2Impl implements GoalObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoalObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.GOAL_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGoalObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GoalObservationOperations.validateGoalObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGoalObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GoalObservationOperations.validateGoalObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGoalObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GoalObservationOperations.validateGoalObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGoalObservationPatientPriorityPreference(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GoalObservationOperations.validateGoalObservationPatientPriorityPreference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGoalObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GoalObservationOperations.validateGoalObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGoalObservationActReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GoalObservationOperations.validateGoalObservationActReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGoalObservationAuthorParticipation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GoalObservationOperations.validateGoalObservationAuthorParticipation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGoalObservationHealthConcernAct(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GoalObservationOperations.validateGoalObservationHealthConcernAct(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGoalObservationProviderPriorityPreference(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GoalObservationOperations.validateGoalObservationProviderPriorityPreference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGoalObservationExternalDocumentReference(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GoalObservationOperations.validateGoalObservationExternalDocumentReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalObservationPlannedEncounter2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GoalObservationOperations.validateGoalObservationPlannedEncounter2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalObservationPlannedObservation2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GoalObservationOperations.validateGoalObservationPlannedObservation2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalObservationPlannedProcedure2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GoalObservationOperations.validateGoalObservationPlannedProcedure2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalObservationPlannedMedicationActivity2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GoalObservationOperations.validateGoalObservationPlannedMedicationActivity2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalObservationPlannedSupply2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GoalObservationOperations.validateGoalObservationPlannedSupply2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalObservationPlannedAct2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GoalObservationOperations.validateGoalObservationPlannedAct2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientPriorityPreference getPatientPriorityPreference() {
		return GoalObservationOperations.getPatientPriorityPreference(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GoalObservation> getGoalObservations() {
		return GoalObservationOperations.getGoalObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ActReference> getActReferences() {
		return GoalObservationOperations.getActReferences(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HealthConcernAct> getHealthConcernActs() {
		return GoalObservationOperations.getHealthConcernActs(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProviderPriorityPreference> getProviderPriorityPreferences() {
		return GoalObservationOperations.getProviderPriorityPreferences(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExternalDocumentReference> getExternalDocumentReferences() {
		return GoalObservationOperations.getExternalDocumentReferences(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlannedEncounter2> getPlannedEncounter2s() {
		return GoalObservationOperations.getPlannedEncounter2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlannedObservation2> getPlannedObservation2s() {
		return GoalObservationOperations.getPlannedObservation2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlannedProcedure2> getPlannedProcedure2s() {
		return GoalObservationOperations.getPlannedProcedure2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlannedMedicationActivity2> getPlannedMedicationActivity2s() {
		return GoalObservationOperations.getPlannedMedicationActivity2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlannedSupply2> getPlannedSupply2s() {
		return GoalObservationOperations.getPlannedSupply2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlannedAct2> getPlannedAct2s() {
		return GoalObservationOperations.getPlannedAct2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlanOfCareActivityObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GoalObservationOperations.validatePlanOfCareActivityObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GoalObservation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GoalObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // GoalObservationImpl
