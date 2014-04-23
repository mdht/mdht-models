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

import org.openhealthtools.mdht.uml.cda.emspcr.EmergencyMedicalDispatchObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.EmergencyMedicalDispatchObservationOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Emergency Medical Dispatch Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EmergencyMedicalDispatchObservationImpl extends ObservationImpl implements
		EmergencyMedicalDispatchObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmergencyMedicalDispatchObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.EMERGENCY_MEDICAL_DISPATCH_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmergencyMedicalDispatchObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EmergencyMedicalDispatchObservationOperations.validateEmergencyMedicalDispatchObservationTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmergencyMedicalDispatchObservationMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EmergencyMedicalDispatchObservationOperations.validateEmergencyMedicalDispatchObservationMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmergencyMedicalDispatchObservationCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EmergencyMedicalDispatchObservationOperations.validateEmergencyMedicalDispatchObservationCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmergencyMedicalDispatchObservationCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EmergencyMedicalDispatchObservationOperations.validateEmergencyMedicalDispatchObservationCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmergencyMedicalDispatchObservationValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EmergencyMedicalDispatchObservationOperations.validateEmergencyMedicalDispatchObservationValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmergencyMedicalDispatchObservationValueP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EmergencyMedicalDispatchObservationOperations.validateEmergencyMedicalDispatchObservationValueP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmergencyMedicalDispatchObservation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmergencyMedicalDispatchObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // EmergencyMedicalDispatchObservationImpl
