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
import org.openhealthtools.mdht.uml.cda.consol.Coverage_CoverageRole;

import org.openhealthtools.mdht.uml.cda.consol.operations.Coverage_CoverageRoleOperations;

import org.openhealthtools.mdht.uml.cda.impl.ParticipantRoleImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coverage Coverage Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class Coverage_CoverageRoleImpl extends ParticipantRoleImpl implements Coverage_CoverageRole {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Coverage_CoverageRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.COVERAGE_COVERAGE_ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageRoleId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return Coverage_CoverageRoleOperations.validateCoverageRoleId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageRoleCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return Coverage_CoverageRoleOperations.validateCoverageRoleCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageRoleAddr(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return Coverage_CoverageRoleOperations.validateCoverageRoleAddr(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageRoleCoveragePlayingEntity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return Coverage_CoverageRoleOperations.validateCoverageRoleCoveragePlayingEntity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageRoleCoveragePlayingEntityName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return Coverage_CoverageRoleOperations.validateCoverageRoleCoveragePlayingEntityName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coverage_CoverageRole init() {
    	CDAUtil.init(this);
    	return this;
	}
} //Coverage_CoverageRoleImpl
