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
import org.openhealthtools.mdht.uml.cda.consol.HandoffCommunication;
import org.openhealthtools.mdht.uml.cda.consol.Instruction2;
import org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendations;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedAct2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedEncounter2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedObservation2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2;

import org.openhealthtools.mdht.uml.cda.consol.operations.PlanOfTreatmentSection2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plan Of Treatment Section2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PlanOfTreatmentSection2Impl extends PlanOfCareSectionImpl implements PlanOfTreatmentSection2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlanOfTreatmentSection2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PLAN_OF_TREATMENT_SECTION2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlanOfCareSectionPlannedObservation2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlanOfTreatmentSection2Operations.validatePlanOfCareSectionPlannedObservation2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlanOfCareSectionPlannedEncounter2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlanOfTreatmentSection2Operations.validatePlanOfCareSectionPlannedEncounter2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlanOfCareSectionPlannedAct2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlanOfTreatmentSection2Operations.validatePlanOfCareSectionPlannedAct2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlanOfCareSectionPlannedProcedure2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlanOfTreatmentSection2Operations.validatePlanOfCareSectionPlannedProcedure2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlanOfCareSectionPlannedMedicationActivity2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlanOfTreatmentSection2Operations.validatePlanOfCareSectionPlannedMedicationActivity2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlanOfCareSectionPlannedSupply2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlanOfTreatmentSection2Operations.validatePlanOfCareSectionPlannedSupply2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlanOfCareSectionInstruction2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlanOfTreatmentSection2Operations.validatePlanOfCareSectionInstruction2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlanOfTreatmentSection2HandoffCommunication(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlanOfTreatmentSection2Operations.validatePlanOfTreatmentSection2HandoffCommunication(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlanOfTreatmentSection2NutritionRecommendations(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlanOfTreatmentSection2Operations.validatePlanOfTreatmentSection2NutritionRecommendations(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PlannedObservation2> getConsolPlannedObservation2s() {
		return PlanOfTreatmentSection2Operations.getConsolPlannedObservation2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PlannedEncounter2> getConsolPlannedEncounter2s() {
		return PlanOfTreatmentSection2Operations.getConsolPlannedEncounter2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PlannedAct2> getConsolPlannedAct2s() {
		return PlanOfTreatmentSection2Operations.getConsolPlannedAct2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PlannedProcedure2> getConsolPlannedProcedure2s() {
		return PlanOfTreatmentSection2Operations.getConsolPlannedProcedure2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PlannedMedicationActivity2> getConsolPlannedMedicationActivity2s() {
		return PlanOfTreatmentSection2Operations.getConsolPlannedMedicationActivity2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PlannedSupply2> getConsolPlannedSupply2s() {
		return PlanOfTreatmentSection2Operations.getConsolPlannedSupply2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Instruction2> getConsolInstruction2s() {
		return PlanOfTreatmentSection2Operations.getConsolInstruction2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HandoffCommunication> getHandoffCommunications() {
		return PlanOfTreatmentSection2Operations.getHandoffCommunications(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NutritionRecommendations> getNutritionRecommendationss() {
		return PlanOfTreatmentSection2Operations.getNutritionRecommendationss(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlanOfCareSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlanOfTreatmentSection2Operations.validatePlanOfCareSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlanOfCareSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlanOfTreatmentSection2Operations.validatePlanOfCareSectionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlanOfCareSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlanOfTreatmentSection2Operations.validatePlanOfCareSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlanOfTreatmentSection2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlanOfTreatmentSection2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // PlanOfTreatmentSection2Impl
