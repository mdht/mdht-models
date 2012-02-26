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
import org.openhealthtools.mdht.uml.cda.consol.Holder_HolderRole;

import org.openhealthtools.mdht.uml.cda.consol.operations.Holder_HolderRoleOperations;

import org.openhealthtools.mdht.uml.cda.impl.ParticipantRoleImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Holder Holder Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class Holder_HolderRoleImpl extends ParticipantRoleImpl implements Holder_HolderRole {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Holder_HolderRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.HOLDER_HOLDER_ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHolderRoleId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return Holder_HolderRoleOperations.validateHolderRoleId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHolderRoleAddr(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return Holder_HolderRoleOperations.validateHolderRoleAddr(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Holder_HolderRole init() {
    	CDAUtil.init(this);
    	return this;
	}
} //Holder_HolderRoleImpl
