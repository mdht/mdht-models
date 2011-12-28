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
import org.openhealthtools.mdht.uml.cda.consol.CustodianOrganization;

import org.openhealthtools.mdht.uml.cda.consol.operations.CustodianOrganizationOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custodian Organization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CustodianOrganizationImpl extends org.openhealthtools.mdht.uml.cda.impl.CustodianOrganizationImpl
		implements CustodianOrganization {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustodianOrganizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.CUSTODIAN_ORGANIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsolCustodianOrganizationAddr(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CustodianOrganizationOperations.validateConsolCustodianOrganizationAddr(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsolCustodianOrganizationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CustodianOrganizationOperations.validateConsolCustodianOrganizationId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsolCustodianOrganizationName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CustodianOrganizationOperations.validateConsolCustodianOrganizationName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsolCustodianOrganizationTelecom(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CustodianOrganizationOperations.validateConsolCustodianOrganizationTelecom(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustodianOrganization init() {
		CDAUtil.init(this);
		return this;
	}
} // CustodianOrganizationImpl
