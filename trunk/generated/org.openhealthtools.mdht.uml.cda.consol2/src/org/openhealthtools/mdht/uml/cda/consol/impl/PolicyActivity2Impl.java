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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2;

import org.openhealthtools.mdht.uml.cda.consol.operations.PolicyActivity2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Policy Activity2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PolicyActivity2Impl extends PolicyActivityImpl implements PolicyActivity2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolicyActivity2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.POLICY_ACTIVITY2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivity2Payer(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivity2Operations.validatePolicyActivity2Payer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivity2Guarantor(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivity2Operations.validatePolicyActivity2Guarantor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivity2Coverage(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivity2Operations.validatePolicyActivity2Coverage(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivity2PayerPolicyActivityPayerPayerAssignedEntityTelecom(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivity2Operations.validatePolicyActivity2PayerPolicyActivityPayerPayerAssignedEntityTelecom(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivity2PolicyActivityPayerPayerAssignedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PolicyActivity2Operations.validatePolicyActivity2PolicyActivityPayerPayerAssignedEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivity2GuarantorPolicyActivityGuarantorGuarantorAssignedEntityTelecom(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivity2Operations.validatePolicyActivity2GuarantorPolicyActivityGuarantorGuarantorAssignedEntityTelecom(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivity2GuarantorPolicyActivityGuarantorGuarantorAssignedEntityCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivity2Operations.validatePolicyActivity2GuarantorPolicyActivityGuarantorGuarantorAssignedEntityCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivity2GuarantorPolicyActivityGuarantorGuarantorAssignedEntityCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivity2Operations.validatePolicyActivity2GuarantorPolicyActivityGuarantorGuarantorAssignedEntityCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivity2PolicyActivityGuarantorGuarantorAssignedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PolicyActivity2Operations.validatePolicyActivity2PolicyActivityGuarantorGuarantorAssignedEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivity2CoverageCoverageRoleCoveragePlayingEntityDateOfBirthInSDTCbirthTime(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivity2Operations.validatePolicyActivity2CoverageCoverageRoleCoveragePlayingEntityDateOfBirthInSDTCbirthTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivity2CoverageCoverageRoleCoveragePlayingEntitySDTCBirthTime(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivity2Operations.validatePolicyActivity2CoverageCoverageRoleCoveragePlayingEntitySDTCBirthTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivity2CoveragePolicyActivityCoverageCoverageRoleCoveragePlayingEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivity2Operations.validatePolicyActivity2CoveragePolicyActivityCoverageCoverageRoleCoveragePlayingEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivity2PolicyActivityCoverageCoverageRole(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PolicyActivity2Operations.validatePolicyActivity2PolicyActivityCoverageCoverageRole(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePolicyActivityTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivity2Operations.validatePolicyActivityTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PolicyActivity2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PolicyActivity2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // PolicyActivity2Impl
