/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.ActImpl;
import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2;
import org.openhealthtools.mdht.uml.cda.consol.EntryReference;
import org.openhealthtools.mdht.uml.cda.consol.HandoffCommunicationParticipants;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2;
import org.openhealthtools.mdht.uml.cda.consol.Instruction2;
import org.openhealthtools.mdht.uml.cda.consol.InterventionAct;
import org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2;
import org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity2;
import org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation;
import org.openhealthtools.mdht.uml.cda.consol.PlannedAct2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedEncounter2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivity;
import org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct;
import org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedObservation2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct2;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2;
import org.openhealthtools.mdht.uml.cda.consol.operations.PlannedInterventionActOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Planned Intervention Act</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PlannedInterventionActImpl extends ActImpl implements PlannedInterventionAct {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlannedInterventionActImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PLANNED_INTERVENTION_ACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActMoodCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActMoodCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActAuthorParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActAuthorParticipation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActAdvanceDirectiveObservation2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActAdvanceDirectiveObservation2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActImmunizationActivity2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActImmunizationActivity2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActMedicationActivity2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActMedicationActivity2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActProcedureActivityAct2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActProcedureActivityAct2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActInterventionAct(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActInterventionAct(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActProcedureActivityObservation2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActProcedureActivityObservation2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActProcedureActivityProcedure2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActProcedureActivityProcedure2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActEncounterActivity2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActEncounterActivity2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActInstruction2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActInstruction2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActNonMedicinalSupplyActivity2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActNonMedicinalSupplyActivity2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActPlannedAct2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActPlannedAct2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActPlannedEncounter2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActPlannedEncounter2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActPlannedObservation2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActPlannedObservation2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActPlannedProcedure2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActPlannedProcedure2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActPlannedMedicationActivity2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActPlannedMedicationActivity2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActPlannedSupply2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActPlannedSupply2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActNutritionRecommendation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActNutritionRecommendation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActEntryReferenceDocInstance(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActEntryReferenceDocInstance(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActEntryReferenceGoalObs(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActEntryReferenceGoalObs(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActHandoffCommunicationParticipants(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActHandoffCommunicationParticipants(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActPlannedImmunizationActivity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActPlannedImmunizationActivity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActReferenceTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActReferenceTypeCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedInterventionActReferenceExternalDocumentReference(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedInterventionActOperations.validatePlannedInterventionActReferenceExternalDocumentReference(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdvanceDirectiveObservation2> getAdvanceDirectiveObservation2s() {
		return PlannedInterventionActOperations.getAdvanceDirectiveObservation2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImmunizationActivity2> getImmunizationActivity2s() {
		return PlannedInterventionActOperations.getImmunizationActivity2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicationActivity2> getMedicationActivity2s() {
		return PlannedInterventionActOperations.getMedicationActivity2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcedureActivityAct2> getProcedureActivityAct2s() {
		return PlannedInterventionActOperations.getProcedureActivityAct2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterventionAct> getInterventionActs() {
		return PlannedInterventionActOperations.getInterventionActs(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcedureActivityObservation2> getProcedureActivityObservation2s() {
		return PlannedInterventionActOperations.getProcedureActivityObservation2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcedureActivityProcedure2> getProcedureActivityProcedure2s() {
		return PlannedInterventionActOperations.getProcedureActivityProcedure2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EncounterActivity2> getEncounterActivity2s() {
		return PlannedInterventionActOperations.getEncounterActivity2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Instruction2> getInstruction2s() {
		return PlannedInterventionActOperations.getInstruction2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NonMedicinalSupplyActivity2> getNonMedicinalSupplyActivity2s() {
		return PlannedInterventionActOperations.getNonMedicinalSupplyActivity2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlannedAct2> getPlannedAct2s() {
		return PlannedInterventionActOperations.getPlannedAct2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlannedEncounter2> getPlannedEncounter2s() {
		return PlannedInterventionActOperations.getPlannedEncounter2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlannedObservation2> getPlannedObservation2s() {
		return PlannedInterventionActOperations.getPlannedObservation2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlannedProcedure2> getPlannedProcedure2s() {
		return PlannedInterventionActOperations.getPlannedProcedure2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlannedMedicationActivity2> getPlannedMedicationActivity2s() {
		return PlannedInterventionActOperations.getPlannedMedicationActivity2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlannedSupply2> getPlannedSupply2s() {
		return PlannedInterventionActOperations.getPlannedSupply2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NutritionRecommendation> getNutritionRecommendations() {
		return PlannedInterventionActOperations.getNutritionRecommendations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntryReference> getEntryReferenceDocInstances() {
		return PlannedInterventionActOperations.getEntryReferenceDocInstances(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntryReference> getEntryReferenceGoalObss() {
		return PlannedInterventionActOperations.getEntryReferenceGoalObss(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HandoffCommunicationParticipants> getHandoffCommunicationParticipantss() {
		return PlannedInterventionActOperations.getHandoffCommunicationParticipantss(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlannedImmunizationActivity> getPlannedImmunizationActivities() {
		return PlannedInterventionActOperations.getPlannedImmunizationActivities(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlannedInterventionAct init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlannedInterventionAct init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // PlannedInterventionActImpl
