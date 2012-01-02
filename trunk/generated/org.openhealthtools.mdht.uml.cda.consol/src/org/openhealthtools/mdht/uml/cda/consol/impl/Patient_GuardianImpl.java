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
import org.openhealthtools.mdht.uml.cda.consol.Patient_Guardian;

import org.openhealthtools.mdht.uml.cda.consol.operations.Patient_GuardianOperations;

import org.openhealthtools.mdht.uml.cda.impl.GuardianImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patient Guardian</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class Patient_GuardianImpl extends GuardianImpl implements Patient_Guardian {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Patient_GuardianImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PATIENT_GUARDIAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuardianAddr(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return Patient_GuardianOperations.validateGuardianAddr(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuardianCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return Patient_GuardianOperations.validateGuardianCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuardianTelecom(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return Patient_GuardianOperations.validateGuardianTelecom(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuardianGuardianPerson(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return Patient_GuardianOperations.validateGuardianGuardianPerson(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Patient_Guardian init() {
		CDAUtil.init(this);
		return this;
	}
} // Patient_GuardianImpl
