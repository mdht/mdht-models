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
import org.openhealthtools.mdht.uml.cda.consol.PatientRole_Patient;

import org.openhealthtools.mdht.uml.cda.consol.operations.PatientRole_PatientOperations;

import org.openhealthtools.mdht.uml.cda.impl.PatientImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patient Role Patient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PatientRole_PatientImpl extends PatientImpl implements PatientRole_Patient {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientRole_PatientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PATIENT_ROLE_PATIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientBirthTimePreciseToYear(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientRole_PatientOperations.validatePatientBirthTimePreciseToYear(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientBirthTimePreciseToDay(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientRole_PatientOperations.validatePatientBirthTimePreciseToDay(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientBirthTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientRole_PatientOperations.validatePatientBirthTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientEthnicGroupCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientRole_PatientOperations.validatePatientEthnicGroupCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientMaritalStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientRole_PatientOperations.validatePatientMaritalStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientRole_PatientOperations.validatePatientName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientRaceCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientRole_PatientOperations.validatePatientRaceCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientReligiousAffiliationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientRole_PatientOperations.validatePatientReligiousAffiliationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientGuardian(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientRole_PatientOperations.validatePatientGuardian(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientBirthplace(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientRole_PatientOperations.validatePatientBirthplace(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientLanguageCommunication(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientRole_PatientOperations.validatePatientLanguageCommunication(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientRole_Patient init() {
		CDAUtil.init(this);
		return this;
	}
} // PatientRole_PatientImpl
