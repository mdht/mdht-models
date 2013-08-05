/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.PatientArrivedAtDestinationTime;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.PatientArrivedAtDestinationTimeOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patient Arrived At Destination Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PatientArrivedAtDestinationTimeImpl extends ObservationImpl implements PatientArrivedAtDestinationTime {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientArrivedAtDestinationTimeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.PATIENT_ARRIVED_AT_DESTINATION_TIME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientArrivedAtDestinationTimeTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientArrivedAtDestinationTimeOperations.validatePatientArrivedAtDestinationTimeTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientArrivedAtDestinationTimeCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientArrivedAtDestinationTimeOperations.validatePatientArrivedAtDestinationTimeCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientArrivedAtDestinationTimeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientArrivedAtDestinationTimeOperations.validatePatientArrivedAtDestinationTimeCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientArrivedAtDestinationTimeValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientArrivedAtDestinationTimeOperations.validatePatientArrivedAtDestinationTimeValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientArrivedAtDestinationTimeMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientArrivedAtDestinationTimeOperations.validatePatientArrivedAtDestinationTimeMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientArrivedAtDestinationTime init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientArrivedAtDestinationTime init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // PatientArrivedAtDestinationTimeImpl
