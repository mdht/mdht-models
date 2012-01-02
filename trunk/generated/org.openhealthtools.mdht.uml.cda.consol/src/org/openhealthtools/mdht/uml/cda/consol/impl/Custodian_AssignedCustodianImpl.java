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
import org.openhealthtools.mdht.uml.cda.consol.Custodian_AssignedCustodian;

import org.openhealthtools.mdht.uml.cda.consol.operations.Custodian_AssignedCustodianOperations;

import org.openhealthtools.mdht.uml.cda.impl.AssignedCustodianImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custodian Assigned Custodian</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class Custodian_AssignedCustodianImpl extends AssignedCustodianImpl implements Custodian_AssignedCustodian {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Custodian_AssignedCustodianImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.CUSTODIAN_ASSIGNED_CUSTODIAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssignedCustodianRepresentedCustodianOrganization(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return Custodian_AssignedCustodianOperations.validateAssignedCustodianRepresentedCustodianOrganization(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Custodian_AssignedCustodian init() {
		CDAUtil.init(this);
		return this;
	}
} // Custodian_AssignedCustodianImpl
