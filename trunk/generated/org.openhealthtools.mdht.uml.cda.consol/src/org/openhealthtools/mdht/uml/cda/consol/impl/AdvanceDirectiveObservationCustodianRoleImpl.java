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

import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservationCustodianRole;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

import org.openhealthtools.mdht.uml.cda.consol.operations.AdvanceDirectiveObservationCustodianRoleOperations;

import org.openhealthtools.mdht.uml.cda.impl.ParticipantRoleImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Advance Directive Observation Custodian Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AdvanceDirectiveObservationCustodianRoleImpl extends ParticipantRoleImpl implements
		AdvanceDirectiveObservationCustodianRole {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdvanceDirectiveObservationCustodianRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservationCustodianRoleAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AdvanceDirectiveObservationCustodianRoleOperations.validateAdvanceDirectiveObservationCustodianRoleAddr(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservationCustodianRoleClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AdvanceDirectiveObservationCustodianRoleOperations.validateAdvanceDirectiveObservationCustodianRoleClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservationCustodianRoleTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AdvanceDirectiveObservationCustodianRoleOperations.validateAdvanceDirectiveObservationCustodianRoleTelecom(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservationCustodianRolePlayingEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AdvanceDirectiveObservationCustodianRoleOperations.validateAdvanceDirectiveObservationCustodianRolePlayingEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdvanceDirectiveObservationCustodianRole init() {
		CDAUtil.init(this);
		return this;
	}
} // AdvanceDirectiveObservationCustodianRoleImpl
