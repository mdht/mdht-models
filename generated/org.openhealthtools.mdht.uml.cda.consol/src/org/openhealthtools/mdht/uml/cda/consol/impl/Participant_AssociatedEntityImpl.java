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
import org.openhealthtools.mdht.uml.cda.consol.Participant_AssociatedEntity;

import org.openhealthtools.mdht.uml.cda.consol.operations.Participant_AssociatedEntityOperations;

import org.openhealthtools.mdht.uml.cda.impl.AssociatedEntityImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Participant Associated Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class Participant_AssociatedEntityImpl extends AssociatedEntityImpl implements Participant_AssociatedEntity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Participant_AssociatedEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PARTICIPANT_ASSOCIATED_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociatedEntityAssociatedPerson(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return Participant_AssociatedEntityOperations.validateAssociatedEntityAssociatedPerson(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant_AssociatedEntity init() {
    	CDAUtil.init(this);
    	return this;
	}
} // Participant_AssociatedEntityImpl
