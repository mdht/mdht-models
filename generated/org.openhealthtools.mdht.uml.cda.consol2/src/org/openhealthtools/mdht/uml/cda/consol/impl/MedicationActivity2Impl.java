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

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.DrugMonitoringAct;
import org.openhealthtools.mdht.uml.cda.consol.Indication2;
import org.openhealthtools.mdht.uml.cda.consol.Instruction2;
import org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2;
import org.openhealthtools.mdht.uml.cda.consol.MedicationDispense2;
import org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder2;
import org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2;
import org.openhealthtools.mdht.uml.cda.consol.SubstanceAdministeredAct;

import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationActivity2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Activity2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MedicationActivity2Impl extends MedicationActivityImpl implements MedicationActivity2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationActivity2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.MEDICATION_ACTIVITY2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivity2SubstanceAdministeredActInversionInd(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivity2SubstanceAdministeredActInversionInd(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity2SubstanceAdministeredActSequenceNumber(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivity2SubstanceAdministeredActSequenceNumber(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity2EffectiveTimeIVLTSLowXorValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivity2EffectiveTimeIVLTSLowXorValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivityStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivityStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivityAdministrationUnitCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivityAdministrationUnitCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivity2DrugMonitoringAct(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivity2DrugMonitoringAct(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivity2AuthorParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivity2AuthorParticipation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivity2SubstanceAdministeredAct(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivity2SubstanceAdministeredAct(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DrugMonitoringAct getDrugMonitoringAct() {
		return MedicationActivity2Operations.getDrugMonitoringAct(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Instruction2 getConsolInstruction2() {
		return MedicationActivity2Operations.getConsolInstruction2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubstanceAdministeredAct> getSubstanceAdministeredActs() {
		return MedicationActivity2Operations.getSubstanceAdministeredActs(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Indication2> getConsolIndication2s() {
		return MedicationActivity2Operations.getConsolIndication2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationSupplyOrder2 getConsolMedicationSupplyOrder2() {
		return MedicationActivity2Operations.getConsolMedicationSupplyOrder2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MedicationDispense2> getConsolMedicationDispense2s() {
		return MedicationActivity2Operations.getConsolMedicationDispense2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReactionObservation2 getConsolReactionObservation2() {
		return MedicationActivity2Operations.getConsolReactionObservation2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivityTextReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivityTextReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivityReferenceValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivityReferenceValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivityTextReferenceValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivityTextReferenceValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivityInstructionsInversionInd(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivityInstructionsInversionInd(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivityDoseQuantityorrateQuantity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivityDoseQuantityorrateQuantity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivityEffectiveTimeIVLTSorTS(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivityEffectiveTimeIVLTSorTS(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivityEffectiveTimeIVLTSLow(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivityEffectiveTimeIVLTSLow(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivityEffectiveTimeIVLTSHigh(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivityEffectiveTimeIVLTSHigh(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivityEffectiveTimePIVLTS(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivityEffectiveTimePIVLTS(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivityTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivityTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivityRepeatNumber(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivityRepeatNumber(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivityRouteCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivityRouteCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivityRouteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivityRouteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivityCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivityStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivityStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivityAdministrationUnitCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivityAdministrationUnitCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivityInstructions(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivityInstructions(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivityIndication(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivityIndication(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivityDoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivityDoseQuantity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivityConsumable(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivityConsumable(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivityMedicationSupplyOrder(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivityMedicationSupplyOrder(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivityMedicationDispense(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivityMedicationDispense(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivityReactionObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivityReactionObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivityPrecondition(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivityPrecondition(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivityPreconditionTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivityPreconditionTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivityPreconditionPreconditionForSubstanceAdministration(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivityPreconditionPreconditionForSubstanceAdministration(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivityConsumableMedicationInformation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivityConsumableMedicationInformation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationActivity2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationActivity2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // MedicationActivity2Impl
