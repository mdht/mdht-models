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

import org.openhealthtools.mdht.uml.cda.consol.AssignedCustodian3_CustodianOrganization;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

import org.openhealthtools.mdht.uml.cda.consol.operations.AssignedCustodian3_CustodianOrganizationOperations;

import org.openhealthtools.mdht.uml.cda.impl.CustodianOrganizationImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assigned Custodian3 Custodian Organization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AssignedCustodian3_CustodianOrganizationImpl extends CustodianOrganizationImpl implements
		AssignedCustodian3_CustodianOrganization {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignedCustodian3_CustodianOrganizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.ASSIGNED_CUSTODIAN3_CUSTODIAN_ORGANIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustodianOrganizationAddr(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AssignedCustodian3_CustodianOrganizationOperations.validateCustodianOrganizationAddr(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustodianOrganizationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AssignedCustodian3_CustodianOrganizationOperations.validateCustodianOrganizationId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustodianOrganizationName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AssignedCustodian3_CustodianOrganizationOperations.validateCustodianOrganizationName(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustodianOrganizationTelecom(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AssignedCustodian3_CustodianOrganizationOperations.validateCustodianOrganizationTelecom(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignedCustodian3_CustodianOrganization init() {
		CDAUtil.init(this);
		return this;
	}
} // AssignedCustodian3_CustodianOrganizationImpl
