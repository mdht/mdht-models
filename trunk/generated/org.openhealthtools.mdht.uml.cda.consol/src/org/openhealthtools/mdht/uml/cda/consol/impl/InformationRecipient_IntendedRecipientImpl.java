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
import org.openhealthtools.mdht.uml.cda.consol.InformationRecipient_IntendedRecipient;

import org.openhealthtools.mdht.uml.cda.consol.operations.InformationRecipient_IntendedRecipientOperations;

import org.openhealthtools.mdht.uml.cda.impl.IntendedRecipientImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Information Recipient Intended Recipient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class InformationRecipient_IntendedRecipientImpl extends IntendedRecipientImpl implements
		InformationRecipient_IntendedRecipient {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InformationRecipient_IntendedRecipientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.INFORMATION_RECIPIENT_INTENDED_RECIPIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntendedRecipientInformationRecipient(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return InformationRecipient_IntendedRecipientOperations.validateIntendedRecipientInformationRecipient(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntendedRecipientRecievedOrganization(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return InformationRecipient_IntendedRecipientOperations.validateIntendedRecipientRecievedOrganization(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationRecipient_IntendedRecipient init() {
		CDAUtil.init(this);
		return this;
	}
} // InformationRecipient_IntendedRecipientImpl
