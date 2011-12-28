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
import org.openhealthtools.mdht.uml.cda.consol.IntendedRecipient;

import org.openhealthtools.mdht.uml.cda.consol.operations.IntendedRecipientOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intended Recipient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class IntendedRecipientImpl extends org.openhealthtools.mdht.uml.cda.impl.IntendedRecipientImpl implements
		IntendedRecipient {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntendedRecipientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.INTENDED_RECIPIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsolIntendedRecipientInformationRecipient(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return IntendedRecipientOperations.validateConsolIntendedRecipientInformationRecipient(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsolIntendedRecipientRecievedOrganization(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return IntendedRecipientOperations.validateConsolIntendedRecipientRecievedOrganization(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntendedRecipient init() {
		CDAUtil.init(this);
		return this;
	}
} // IntendedRecipientImpl
