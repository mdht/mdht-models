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
import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2;
import org.openhealthtools.mdht.uml.cda.consol.ExternalDocumentReference;
import org.openhealthtools.mdht.uml.cda.consol.GoalObservation;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2;
import org.openhealthtools.mdht.uml.cda.consol.Instruction2;
import org.openhealthtools.mdht.uml.cda.consol.InterventionAct;
import org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2;
import org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity2;
import org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendations;

import org.openhealthtools.mdht.uml.cda.consol.PlannedAct2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedEncounter2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedObservation2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct2;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2;
import org.openhealthtools.mdht.uml.cda.consol.operations.InterventionActOperations;

import org.openhealthtools.mdht.uml.cda.impl.ActImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intervention Act</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class InterventionActImpl extends ActImpl implements InterventionAct {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterventionActImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.INTERVENTION_ACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateInterventionActTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateInterventionActClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateInterventionActMoodCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActMoodCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateInterventionActMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateInterventionActId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateInterventionActCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateInterventionActCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateInterventionActStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateInterventionActEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateInterventionActGoalObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActGoalObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateInterventionAct(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionAct(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateInterventionActNutritionRecommendations(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActNutritionRecommendations(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateInterventionActActReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActActReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActActReferenceGoal(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActActReferenceGoal(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateInterventionActAuthorParticipation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActAuthorParticipation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateInterventionActExternalDocumentReference(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActExternalDocumentReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActAdvanceDirectiveObservation2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActAdvanceDirectiveObservation2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActImmunizationActivity2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActImmunizationActivity2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActMedicationActivity2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActMedicationActivity2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActProcedureActivityAct2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActProcedureActivityAct2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActProcedureActivityObservation2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActProcedureActivityObservation2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActProcedureActivityProcedure2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActProcedureActivityProcedure2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActEncounterActivity2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActEncounterActivity2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActNonMedicinalSupplyActivity2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActNonMedicinalSupplyActivity2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActInstruction2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActInstruction2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActPlannedAct2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActPlannedAct2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActPlannedEncounter2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActPlannedEncounter2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActPlannedObservation2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActPlannedObservation2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActPlannedProcedure2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActPlannedProcedure2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActPlannedMedicationActivity2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActPlannedMedicationActivity2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActPlannedSupply2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActPlannedSupply2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GoalObservation> getGoalObservations() {
		return InterventionActOperations.getGoalObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InterventionAct> getInterventionActs() {
		return InterventionActOperations.getInterventionActs(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NutritionRecommendations> getNutritionRecommendationss() {
		return InterventionActOperations.getNutritionRecommendationss(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ActReference> getActReferences() {
		return InterventionActOperations.getActReferences(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActReference> getActReferenceGoals() {
		return InterventionActOperations.getActReferenceGoals(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExternalDocumentReference> getExternalDocumentReferences() {
		return InterventionActOperations.getExternalDocumentReferences(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdvanceDirectiveObservation2> getAdvanceDirectiveObservation2s() {
		return InterventionActOperations.getAdvanceDirectiveObservation2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImmunizationActivity2> getImmunizationActivity2s() {
		return InterventionActOperations.getImmunizationActivity2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicationActivity2> getMedicationActivity2s() {
		return InterventionActOperations.getMedicationActivity2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcedureActivityAct2> getProcedureActivityAct2s() {
		return InterventionActOperations.getProcedureActivityAct2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcedureActivityObservation2> getProcedureActivityObservation2s() {
		return InterventionActOperations.getProcedureActivityObservation2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcedureActivityProcedure2> getProcedureActivityProcedure2s() {
		return InterventionActOperations.getProcedureActivityProcedure2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EncounterActivity2> getEncounterActivity2s() {
		return InterventionActOperations.getEncounterActivity2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NonMedicinalSupplyActivity2> getNonMedicinalSupplyActivity2s() {
		return InterventionActOperations.getNonMedicinalSupplyActivity2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Instruction2> getInstruction2s() {
		return InterventionActOperations.getInstruction2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlannedAct2> getPlannedAct2s() {
		return InterventionActOperations.getPlannedAct2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlannedEncounter2> getPlannedEncounter2s() {
		return InterventionActOperations.getPlannedEncounter2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlannedObservation2> getPlannedObservation2s() {
		return InterventionActOperations.getPlannedObservation2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlannedProcedure2> getPlannedProcedure2s() {
		return InterventionActOperations.getPlannedProcedure2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlannedMedicationActivity2> getPlannedMedicationActivity2s() {
		return InterventionActOperations.getPlannedMedicationActivity2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlannedSupply2> getPlannedSupply2s() {
		return InterventionActOperations.getPlannedSupply2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterventionAct init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterventionAct init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // InterventionActImpl
