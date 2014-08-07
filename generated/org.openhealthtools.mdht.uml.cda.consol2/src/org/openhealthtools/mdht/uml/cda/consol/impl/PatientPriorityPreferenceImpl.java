/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.PatientPriorityPreference;

import org.openhealthtools.mdht.uml.cda.consol.operations.PatientPriorityPreferenceOperations;
import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patient Priority Preference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PatientPriorityPreferenceImpl extends ObservationImpl implements PatientPriorityPreference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientPriorityPreferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PATIENT_PRIORITY_PREFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePatientPriorityPreferenceTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientPriorityPreferenceOperations.validatePatientPriorityPreferenceTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePatientPriorityPreferenceClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientPriorityPreferenceOperations.validatePatientPriorityPreferenceClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePatientPriorityPreferenceMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientPriorityPreferenceOperations.validatePatientPriorityPreferenceMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePatientPriorityPreferenceId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientPriorityPreferenceOperations.validatePatientPriorityPreferenceId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePatientPriorityPreferenceCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientPriorityPreferenceOperations.validatePatientPriorityPreferenceCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePatientPriorityPreferenceCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientPriorityPreferenceOperations.validatePatientPriorityPreferenceCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePatientPriorityPreferencePriorityCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientPriorityPreferenceOperations.validatePatientPriorityPreferencePriorityCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePatientPriorityPreferencePriorityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientPriorityPreferenceOperations.validatePatientPriorityPreferencePriorityCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePatientPriorityPreferenceValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientPriorityPreferenceOperations.validatePatientPriorityPreferenceValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePatientPriorityPreferenceValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientPriorityPreferenceOperations.validatePatientPriorityPreferenceValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePatientPriorityPreferenceCDCodeSystem(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientPriorityPreferenceOperations.validatePatientPriorityPreferenceCDCodeSystem(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PatientPriorityPreference init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PatientPriorityPreference init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // PatientPriorityPreferenceImpl
