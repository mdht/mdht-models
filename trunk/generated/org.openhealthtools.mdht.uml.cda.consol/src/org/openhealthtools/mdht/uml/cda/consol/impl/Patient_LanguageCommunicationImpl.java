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
import org.openhealthtools.mdht.uml.cda.consol.Patient_LanguageCommunication;

import org.openhealthtools.mdht.uml.cda.consol.operations.Patient_LanguageCommunicationOperations;

import org.openhealthtools.mdht.uml.cda.impl.LanguageCommunicationImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patient Language Communication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class Patient_LanguageCommunicationImpl extends LanguageCommunicationImpl implements
		Patient_LanguageCommunication {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Patient_LanguageCommunicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PATIENT_LANGUAGE_COMMUNICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguageCommunicationPreferenceInd(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return Patient_LanguageCommunicationOperations.validateLanguageCommunicationPreferenceInd(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguageCommunicationModeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return Patient_LanguageCommunicationOperations.validateLanguageCommunicationModeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Patient_LanguageCommunication init() {
		CDAUtil.init(this);
		return this;
	}
} // Patient_LanguageCommunicationImpl
