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
import org.openhealthtools.mdht.uml.cda.consol.PolicyActivity_Coverage;

import org.openhealthtools.mdht.uml.cda.consol.operations.PolicyActivity_CoverageOperations;

import org.openhealthtools.mdht.uml.cda.impl.Participant2Impl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Policy Activity Coverage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PolicyActivity_CoverageImpl extends Participant2Impl implements PolicyActivity_Coverage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolicyActivity_CoverageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.POLICY_ACTIVITY_COVERAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivity_CoverageOperations.validateCoverageTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivity_CoverageOperations.validateCoverageTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageCoverageRole(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivity_CoverageOperations.validateCoverageCoverageRole(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageCoverageRoleCoveragePlayingEntityName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivity_CoverageOperations.validateCoverageCoverageRoleCoveragePlayingEntityName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageCoverageRoleId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivity_CoverageOperations.validateCoverageCoverageRoleId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageCoverageRoleCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivity_CoverageOperations.validateCoverageCoverageRoleCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageCoverageRoleAddr(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivity_CoverageOperations.validateCoverageCoverageRoleAddr(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageCoverageRoleCoveragePlayingEntity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivity_CoverageOperations.validateCoverageCoverageRoleCoveragePlayingEntity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyActivity_Coverage init() {
    	CDAUtil.init(this);
    	return this;
	}
} //PolicyActivity_CoverageImpl
