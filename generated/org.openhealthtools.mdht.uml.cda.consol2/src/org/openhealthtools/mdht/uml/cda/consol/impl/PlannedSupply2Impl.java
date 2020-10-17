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
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.Indication2;
import org.openhealthtools.mdht.uml.cda.consol.Instruction2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedCoverage;
import org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2;
import org.openhealthtools.mdht.uml.cda.consol.PriorityPreference;
import org.openhealthtools.mdht.uml.cda.consol.ProductInstance;
import org.openhealthtools.mdht.uml.cda.consol.operations.PlannedSupply2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Planned Supply2</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PlannedSupply2Impl extends PlanOfCareActivitySupplyImpl implements PlannedSupply2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlannedSupply2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PLANNED_SUPPLY2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedSupply2MedInfoXorImmunXorProductInstance(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedSupply2Operations.validatePlannedSupply2MedInfoXorImmunXorProductInstance(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedSupply2TemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedSupply2Operations.validatePlannedSupply2TemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedSupply2StatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedSupply2Operations.validatePlannedSupply2StatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedSupply2StatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedSupply2Operations.validatePlannedSupply2StatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedSupply2EffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedSupply2Operations.validatePlannedSupply2EffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedSupply2RepeatNumber(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedSupply2Operations.validatePlannedSupply2RepeatNumber(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedSupply2Quantity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedSupply2Operations.validatePlannedSupply2Quantity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedSupply2Product(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedSupply2Operations.validatePlannedSupply2Product(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedSupply2Performer(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedSupply2Operations.validatePlannedSupply2Performer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedSupply2AuthorParticipation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedSupply2Operations.validatePlannedSupply2AuthorParticipation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedSupply2ProductInstance(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedSupply2Operations.validatePlannedSupply2ProductInstance(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedSupply2PriorityPreference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedSupply2Operations.validatePlannedSupply2PriorityPreference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedSupply2Indication2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedSupply2Operations.validatePlannedSupply2Indication2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedSupply2Instruction2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedSupply2Operations.validatePlannedSupply2Instruction2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlannedSupply2PlannedCoverage(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedSupply2Operations.validatePlannedSupply2PlannedCoverage(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedSupply2ProductRecommended(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedSupply2Operations.validatePlannedSupply2ProductRecommended(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedSupply2ProductManufacturedProductMedInfo2XorImmunMedInfo2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedSupply2Operations.validatePlannedSupply2ProductManufacturedProductMedInfo2XorImmunMedInfo2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlannedSupply2ProductManufacturedProduct(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlannedSupply2Operations.validatePlannedSupply2ProductManufacturedProduct(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductInstance getProductInstance() {
		return PlannedSupply2Operations.getProductInstance(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PriorityPreference> getPriorityPreferences() {
		return PlannedSupply2Operations.getPriorityPreferences(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Indication2> getIndication2s() {
		return PlannedSupply2Operations.getIndication2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Instruction2> getInstruction2s() {
		return PlannedSupply2Operations.getInstruction2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PlannedCoverage> getPlannedCoverages() {
		return PlannedSupply2Operations.getPlannedCoverages(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlanOfCareActivitySupplyMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlannedSupply2Operations.validatePlanOfCareActivitySupplyMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlannedSupply2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlannedSupply2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // PlannedSupply2Impl
