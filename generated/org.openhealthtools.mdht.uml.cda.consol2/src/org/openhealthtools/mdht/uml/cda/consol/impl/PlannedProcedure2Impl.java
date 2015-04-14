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
import org.openhealthtools.mdht.uml.cda.consol.PlannedCoverage;
import org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2;
import org.openhealthtools.mdht.uml.cda.consol.ProviderPriorityPreference;

import org.openhealthtools.mdht.uml.cda.consol.operations.PlannedProcedure2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Planned Procedure2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PlannedProcedure2Impl extends PlanOfCareActivityProcedureImpl implements PlannedProcedure2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlannedProcedure2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PLANNED_PROCEDURE2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedProcedure2CodeFromLoincOrSnomed(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedProcedure2Operations.validatePlannedProcedure2CodeFromLoincOrSnomed(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedProcedure2CodeFromCptOrIcd(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedProcedure2Operations.validatePlannedProcedure2CodeFromCptOrIcd(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedProcedure2Instruction2InversionInd(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedProcedure2Operations.validatePlannedProcedure2Instruction2InversionInd(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedProcedure2Code(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedProcedure2Operations.validatePlannedProcedure2Code(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedProcedure2StatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedProcedure2Operations.validatePlannedProcedure2StatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedProcedure2StatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedProcedure2Operations.validatePlannedProcedure2StatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedProcedure2EffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedProcedure2Operations.validatePlannedProcedure2EffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedProcedure2MethodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedProcedure2Operations.validatePlannedProcedure2MethodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedProcedure2TargetSiteCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedProcedure2Operations.validatePlannedProcedure2TargetSiteCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedProcedure2TargetSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedProcedure2Operations.validatePlannedProcedure2TargetSiteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedProcedure2Performer(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedProcedure2Operations.validatePlannedProcedure2Performer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedProcedure2AuthorParticipation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedProcedure2Operations.validatePlannedProcedure2AuthorParticipation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedProcedure2PriorityPreference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedProcedure2Operations.validatePlannedProcedure2PriorityPreference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedProcedure2Indication2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedProcedure2Operations.validatePlannedProcedure2Indication2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedProcedure2Instruction2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedProcedure2Operations.validatePlannedProcedure2Instruction2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedProcedure2PlannedCoverage(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedProcedure2Operations.validatePlannedProcedure2PlannedCoverage(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProviderPriorityPreference> getPriorityPreferences() {
		return PlannedProcedure2Operations.getPriorityPreferences(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Indication2> getIndication2s() {
		return PlannedProcedure2Operations.getIndication2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Instruction2> getInstruction2s() {
		return PlannedProcedure2Operations.getInstruction2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PlannedCoverage> getPlannedCoverages() {
		return PlannedProcedure2Operations.getPlannedCoverages(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlanOfCareActivityProcedureTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedProcedure2Operations.validatePlanOfCareActivityProcedureTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlanOfCareActivityProcedureMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedProcedure2Operations.validatePlanOfCareActivityProcedureMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlannedProcedure2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlannedProcedure2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // PlannedProcedure2Impl
