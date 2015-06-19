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
import org.openhealthtools.mdht.uml.cda.consol.Indication2;
import org.openhealthtools.mdht.uml.cda.consol.Instruction2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2;
import org.openhealthtools.mdht.uml.cda.consol.PriorityPreference;
import org.openhealthtools.mdht.uml.cda.consol.operations.PlannedMedicationActivity2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Planned Medication Activity2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PlannedMedicationActivity2Impl extends PlanOfCareActivitySubstanceAdministrationImpl implements
		PlannedMedicationActivity2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlannedMedicationActivity2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PLANNED_MEDICATION_ACTIVITY2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedMedicationActivity2StatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedMedicationActivity2Operations.validatePlannedMedicationActivity2StatusCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedMedicationActivity2StatusCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedMedicationActivity2Operations.validatePlannedMedicationActivity2StatusCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedMedicationActivity2EffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedMedicationActivity2Operations.validatePlannedMedicationActivity2EffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedMedicationActivity2RepeatNumber(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedMedicationActivity2Operations.validatePlannedMedicationActivity2RepeatNumber(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedMedicationActivity2RouteCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedMedicationActivity2Operations.validatePlannedMedicationActivity2RouteCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedMedicationActivity2RouteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedMedicationActivity2Operations.validatePlannedMedicationActivity2RouteCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedMedicationActivity2ApproachSiteCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedMedicationActivity2Operations.validatePlannedMedicationActivity2ApproachSiteCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedMedicationActivity2ApproachSiteCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedMedicationActivity2Operations.validatePlannedMedicationActivity2ApproachSiteCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedMedicationActivity2DoseQuantity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedMedicationActivity2Operations.validatePlannedMedicationActivity2DoseQuantity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedMedicationActivity2RateQuantity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedMedicationActivity2Operations.validatePlannedMedicationActivity2RateQuantity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedMedicationActivity2MaxDoseQuantity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedMedicationActivity2Operations.validatePlannedMedicationActivity2MaxDoseQuantity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedMedicationActivity2AdministrationUnitCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedMedicationActivity2Operations.validatePlannedMedicationActivity2AdministrationUnitCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedMedicationActivity2AdministrationUnitCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedMedicationActivity2Operations.validatePlannedMedicationActivity2AdministrationUnitCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedMedicationActivity2Performer(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedMedicationActivity2Operations.validatePlannedMedicationActivity2Performer(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedMedicationActivity2AuthorParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedMedicationActivity2Operations.validatePlannedMedicationActivity2AuthorParticipation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedMedicationActivity2PriorityPreference(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedMedicationActivity2Operations.validatePlannedMedicationActivity2PriorityPreference(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedMedicationActivity2Indication2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedMedicationActivity2Operations.validatePlannedMedicationActivity2Indication2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedMedicationActivity2Instruction2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedMedicationActivity2Operations.validatePlannedMedicationActivity2Instruction2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedMedicationActivity2Consumable(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedMedicationActivity2Operations.validatePlannedMedicationActivity2Consumable(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedMedicationActivity2Precondition(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedMedicationActivity2Operations.validatePlannedMedicationActivity2Precondition(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedMedicationActivity2IVLPQdoseQuantityUnit(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedMedicationActivity2Operations.validatePlannedMedicationActivity2IVLPQdoseQuantityUnit(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedMedicationActivity2IVLPQrateQuantityUnit(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedMedicationActivity2Operations.validatePlannedMedicationActivity2IVLPQrateQuantityUnit(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedMedicationActivity2ConsumableMedicationInformation2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedMedicationActivity2Operations.validatePlannedMedicationActivity2ConsumableMedicationInformation2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedMedicationActivity2PreconditionTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedMedicationActivity2Operations.validatePlannedMedicationActivity2PreconditionTypeCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedMedicationActivity2PreconditionPreconditionForSubstanceAdministration2(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedMedicationActivity2Operations.validatePlannedMedicationActivity2PreconditionPreconditionForSubstanceAdministration2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PriorityPreference> getPriorityPreferences() {
		return PlannedMedicationActivity2Operations.getPriorityPreferences(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Indication2> getIndication2s() {
		return PlannedMedicationActivity2Operations.getIndication2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Instruction2> getInstruction2s() {
		return PlannedMedicationActivity2Operations.getInstruction2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlanOfCareActivitySubstanceAdministrationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedMedicationActivity2Operations.validatePlanOfCareActivitySubstanceAdministrationTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlanOfCareActivitySubstanceAdministrationMoodCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedMedicationActivity2Operations.validatePlanOfCareActivitySubstanceAdministrationMoodCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlanOfCareActivitySubstanceAdministrationMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedMedicationActivity2Operations.validatePlanOfCareActivitySubstanceAdministrationMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlannedMedicationActivity2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlannedMedicationActivity2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // PlannedMedicationActivity2Impl
