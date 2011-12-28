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
import org.openhealthtools.mdht.uml.cda.consol.Patient;

import org.openhealthtools.mdht.uml.cda.consol.operations.PatientOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PatientImpl extends org.openhealthtools.mdht.uml.cda.impl.PatientImpl implements Patient {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PATIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsolPatientGuardian(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientOperations.validateConsolPatientGuardian(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsolPatientBirthplace(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientOperations.validateConsolPatientBirthplace(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsolPatientLanguageCommunication(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientOperations.validateConsolPatientLanguageCommunication(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsolPatientBirthTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientOperations.validateConsolPatientBirthTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsolPatientEthnicGroupCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientOperations.validateConsolPatientEthnicGroupCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsolPatientName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientOperations.validateConsolPatientName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsolPatientReligiousAffiliationCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientOperations.validateConsolPatientReligiousAffiliationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Patient init() {
		CDAUtil.init(this);
		return this;
	}
} // PatientImpl
