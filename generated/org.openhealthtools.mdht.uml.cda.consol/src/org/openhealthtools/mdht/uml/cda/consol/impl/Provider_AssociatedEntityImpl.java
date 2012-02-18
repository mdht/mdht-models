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
import org.openhealthtools.mdht.uml.cda.consol.Provider_AssociatedEntity;

import org.openhealthtools.mdht.uml.cda.consol.operations.Provider_AssociatedEntityOperations;

import org.openhealthtools.mdht.uml.cda.impl.AssociatedEntityImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provider Associated Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class Provider_AssociatedEntityImpl extends AssociatedEntityImpl implements Provider_AssociatedEntity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Provider_AssociatedEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PROVIDER_ASSOCIATED_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociatedEntityAssociatedPerson(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return Provider_AssociatedEntityOperations.validateAssociatedEntityAssociatedPerson(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Provider_AssociatedEntity init() {
    	CDAUtil.init(this);
    	return this;
	}
} // Provider_AssociatedEntityImpl
