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
import org.openhealthtools.mdht.uml.cda.consol.PayerAssignedEntity_PayerOrganization;

import org.openhealthtools.mdht.uml.cda.consol.operations.PayerAssignedEntity_PayerOrganizationOperations;

import org.openhealthtools.mdht.uml.cda.impl.OrganizationImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payer Assigned Entity Payer Organization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PayerAssignedEntity_PayerOrganizationImpl extends OrganizationImpl implements
		PayerAssignedEntity_PayerOrganization {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PayerAssignedEntity_PayerOrganizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PAYER_ASSIGNED_ENTITY_PAYER_ORGANIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayerOrganizationName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PayerAssignedEntity_PayerOrganizationOperations.validatePayerOrganizationName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PayerAssignedEntity_PayerOrganization init() {
    	CDAUtil.init(this);
    	return this;
	}
} // PayerAssignedEntity_PayerOrganizationImpl
