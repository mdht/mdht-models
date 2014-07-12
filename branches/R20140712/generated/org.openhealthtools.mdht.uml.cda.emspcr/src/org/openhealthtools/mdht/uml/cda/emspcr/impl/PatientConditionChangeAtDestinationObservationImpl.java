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
import org.openhealthtools.mdht.uml.cda.emspcr.PatientConditionChangeAtDestinationObservation;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.PatientConditionChangeAtDestinationObservationOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patient Condition Change At Destination Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PatientConditionChangeAtDestinationObservationImpl extends ObservationImpl implements
		PatientConditionChangeAtDestinationObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientConditionChangeAtDestinationObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientConditionChangeAtDestinationObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientConditionChangeAtDestinationObservationOperations.validatePatientConditionChangeAtDestinationObservationTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientConditionChangeAtDestinationObservationMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientConditionChangeAtDestinationObservationOperations.validatePatientConditionChangeAtDestinationObservationMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientConditionChangeAtDestinationObservationCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientConditionChangeAtDestinationObservationOperations.validatePatientConditionChangeAtDestinationObservationCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientConditionChangeAtDestinationObservationCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientConditionChangeAtDestinationObservationOperations.validatePatientConditionChangeAtDestinationObservationCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientConditionChangeAtDestinationObservationValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientConditionChangeAtDestinationObservationOperations.validatePatientConditionChangeAtDestinationObservationValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientConditionChangeAtDestinationObservationValueP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PatientConditionChangeAtDestinationObservationOperations.validatePatientConditionChangeAtDestinationObservationValueP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientConditionChangeAtDestinationObservation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientConditionChangeAtDestinationObservation init(
			Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // PatientConditionChangeAtDestinationObservationImpl
