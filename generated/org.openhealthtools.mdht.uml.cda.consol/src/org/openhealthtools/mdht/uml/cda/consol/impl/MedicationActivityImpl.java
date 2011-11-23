/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.Supply;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.DrugVehicle;
import org.openhealthtools.mdht.uml.cda.consol.Indication;
import org.openhealthtools.mdht.uml.cda.consol.Instructions;
import org.openhealthtools.mdht.uml.cda.consol.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity;
import org.openhealthtools.mdht.uml.cda.consol.ReactionObservation;

import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationActivityOperations;

import org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MedicationActivityImpl extends SubstanceAdministrationImpl implements MedicationActivity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.MEDICATION_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityHasDoseQuantityOrRateQuantity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityHasDoseQuantityOrRateQuantity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityHasConsents(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityHasConsents(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityInformationSource(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityInformationSource(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityHasPreconditionCriterion(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityHasPreconditionCriterion(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityHasReason(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityHasReason(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityHasReasonProblem(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityHasReasonProblem(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityHasProduct(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityHasProduct(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityHasDosing(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityHasDosing(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityDosingRelationship(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityDosingRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityHasDescriptionNoMedNotKnown(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityHasDescriptionNoMedNotKnown(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityReasonClassMood(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityReasonClassMood(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityHasProductEntry(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityHasProductEntry(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityHasIntructionsInversion(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityHasIntructionsInversion(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityProductStrength(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityProductStrength(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityProductName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityProductName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityPreconditionReference(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityPreconditionReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityHasSupplyEntryInversion(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityHasSupplyEntryInversion(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityHasFillNumber(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityHasFillNumber(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityFirstEffectiveTimeDatatype(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityFirstEffectiveTimeDatatype(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityDoseUnits(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityDoseUnits(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityDeliveryMethodDescription(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityDeliveryMethodDescription(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityHasMedicationInformation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityHasMedicationInformation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityHasStatusOfMedication(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityHasStatusOfMedication(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityHasIndication(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityHasIndication(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityHasIndicationNarrativeText(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityHasIndicationNarrativeText(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityHasIndicationVocab(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityHasIndicationVocab(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityHasPatientInstructions(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityHasPatientInstructions(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityHasMedicationVehicle(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityHasMedicationVehicle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityMedicationVehicleType(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityMedicationVehicleType(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityMedicationVehicleClass(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityMedicationVehicleClass(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityMedicationVehicleCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityMedicationVehicleCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityMedicationVehicleName(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityMedicationVehicleName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityMedicationVehicleCodedName(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityMedicationVehicleCodedName(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityMedicationVehicleCodedNameVocab(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityMedicationVehicleCodedNameVocab(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityRouteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityRouteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityApproachSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityApproachSiteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityDoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityDoseQuantity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityRateQuantity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityRateQuantity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityMaxDoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityMaxDoseQuantity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityAdministrationUnitCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityAdministrationUnitCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityMedicationSupplyOrder(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityMedicationSupplyOrder(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityInstructions(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityInstructions(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityIndication(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityIndication(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityMedicationDispense(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityMedicationDispense(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivityDrugVehicle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivityOperations.validateMedicationActivityDrugVehicle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NonMedicinalSupplyActivity> getMedicationSupplyOrders() {
		return MedicationActivityOperations.getMedicationSupplyOrders(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReactionObservation getReactionObservation() {
		return MedicationActivityOperations.getReactionObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Instructions> getInstructionss() {
		return MedicationActivityOperations.getInstructionss(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Indication getIndication() {
		return MedicationActivityOperations.getIndication(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Supply getMedicationDispense() {
		return MedicationActivityOperations.getMedicationDispense(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DrugVehicle getDrugVehicle() {
		return MedicationActivityOperations.getDrugVehicle(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationActivity init() {
		CDAUtil.init(this);
		return this;
	}
} // MedicationActivityImpl
