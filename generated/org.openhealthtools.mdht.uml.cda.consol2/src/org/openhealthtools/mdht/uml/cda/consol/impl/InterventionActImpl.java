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
import org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct2;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2;
import org.openhealthtools.mdht.uml.cda.consol.operations.InterventionActOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intervention Act</b></em>'.
 * <!-- end-user-doc -->
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
	public boolean validateInterventionActTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActInterventionAct(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActInterventionAct(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActNutritionRecommendation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActNutritionRecommendation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActInterventionEntryReference(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActInterventionEntryReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActGoalObsEntryReference(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActGoalObsEntryReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActAuthorParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActAuthorParticipation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActAdvanceDirectiveObservation2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActAdvanceDirectiveObservation2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActImmunizationActivity2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActImmunizationActivity2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActMedicationActivity2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActMedicationActivity2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActProcedureActivityAct2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
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
	public boolean validateInterventionActHandoffCommunicationParticipants(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActHandoffCommunicationParticipants(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActPlannedInterventionAct(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActPlannedInterventionAct(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActReferenceTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActReferenceTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionActReferenceExternalDocumentReference(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return InterventionActOperations.validateInterventionActReferenceExternalDocumentReference(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterventionAct> getInterventionActs() {
		return InterventionActOperations.getInterventionActs(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NutritionRecommendation> getNutritionRecommendations() {
		return InterventionActOperations.getNutritionRecommendations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntryReference> getInterventionEntryReferences() {
		return InterventionActOperations.getInterventionEntryReferences(this);
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
	public EList<HandoffCommunicationParticipants> getHandoffCommunicationParticipantss() {
		return InterventionActOperations.getHandoffCommunicationParticipantss(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlannedInterventionAct> getPlannedInterventionActs() {
		return InterventionActOperations.getPlannedInterventionActs(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterventionAct init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterventionAct init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // InterventionActImpl
