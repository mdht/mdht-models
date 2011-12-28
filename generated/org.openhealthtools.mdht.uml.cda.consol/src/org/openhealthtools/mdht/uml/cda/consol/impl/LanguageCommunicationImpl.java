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
import org.openhealthtools.mdht.uml.cda.consol.LanguageCommunication;

import org.openhealthtools.mdht.uml.cda.consol.operations.LanguageCommunicationOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Language Communication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class LanguageCommunicationImpl extends org.openhealthtools.mdht.uml.cda.impl.LanguageCommunicationImpl
		implements LanguageCommunication {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LanguageCommunicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.LANGUAGE_COMMUNICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsolLanguageCommunicationPreferenceInd(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LanguageCommunicationOperations.validateConsolLanguageCommunicationPreferenceInd(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsolLanguageCommunicationModeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LanguageCommunicationOperations.validateConsolLanguageCommunicationModeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageCommunication init() {
		CDAUtil.init(this);
		return this;
	}
} // LanguageCommunicationImpl
