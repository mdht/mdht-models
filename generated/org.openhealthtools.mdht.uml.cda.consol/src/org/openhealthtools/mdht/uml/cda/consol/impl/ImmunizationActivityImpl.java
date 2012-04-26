/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.DrugVehicle;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationRefusalReason;
import org.openhealthtools.mdht.uml.cda.consol.Indication;
import org.openhealthtools.mdht.uml.cda.consol.Instructions;
import org.openhealthtools.mdht.uml.cda.consol.MedicationDispense;
import org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder;
import org.openhealthtools.mdht.uml.cda.consol.ReactionObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.ImmunizationActivityOperations;
import org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Immunization Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ImmunizationActivityImpl extends SubstanceAdministrationImpl implements ImmunizationActivity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImmunizationActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.IMMUNIZATION_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationActivityTextReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityTextReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationActivityDoseQuantityUnit(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityDoseQuantityUnit(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationActivityInstructionInversion(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityInstructionInversion(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationActivityDrugVehicleTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityDrugVehicleTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationActivityPreconditionTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityPreconditionTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationActivityTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationActivityClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationActivityMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationActivityId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationActivityCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationActivityStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationActivityEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationActivityRouteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityRouteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationActivityRouteCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityRouteCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationActivityApproachSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityApproachSiteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationActivityApproachSiteCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityApproachSiteCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationActivityDoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityDoseQuantity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationActivityNegationInd(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityNegationInd(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationActivityText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationActivityRepeatNumber(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityRepeatNumber(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationActivityAdministrationUnitCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityAdministrationUnitCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationActivityAdministrationUnitCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityAdministrationUnitCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationActivityDrugVehicle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityDrugVehicle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationActivityIndication(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityIndication(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationActivityInstructions(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityInstructions(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationActivityMedicationDispense(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityMedicationDispense(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationActivityReactionObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityReactionObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationActivityPrecondition(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityPrecondition(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationActivityImmunizationRefusalReason(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityImmunizationRefusalReason(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationActivityConsumable(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityConsumable(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationActivityPerformer(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityPerformer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationActivityMedicationSupplyOrder(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImmunizationActivityOperations.validateImmunizationActivityMedicationSupplyOrder(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DrugVehicle getDrugVehicle() {
		return ImmunizationActivityOperations.getDrugVehicle(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Indication getIndication() {
		return ImmunizationActivityOperations.getIndication(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instructions getInstructions() {
		return ImmunizationActivityOperations.getInstructions(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationDispense getMedicationDispense() {
		return ImmunizationActivityOperations.getMedicationDispense(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReactionObservation getReactionObservation() {
		return ImmunizationActivityOperations.getReactionObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationRefusalReason getImmunizationRefusalReason() {
		return ImmunizationActivityOperations.getImmunizationRefusalReason(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationSupplyOrder getMedicationSupplyOrder() {
		return ImmunizationActivityOperations.getMedicationSupplyOrder(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationActivity init() {
    	CDAUtil.init(this);
    	return this;
	}
} // ImmunizationActivityImpl
