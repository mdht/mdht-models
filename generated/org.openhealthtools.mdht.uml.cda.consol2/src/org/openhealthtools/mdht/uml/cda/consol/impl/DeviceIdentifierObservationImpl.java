/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.ObservationImpl;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.DeviceIdentifierObservation;

import org.openhealthtools.mdht.uml.cda.consol.operations.DeviceIdentifierObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Identifier Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DeviceIdentifierObservationImpl extends ObservationImpl implements DeviceIdentifierObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceIdentifierObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.DEVICE_IDENTIFIER_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceIdentifierObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DeviceIdentifierObservationOperations.validateDeviceIdentifierObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceIdentifierObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DeviceIdentifierObservationOperations.validateDeviceIdentifierObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceIdentifierObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DeviceIdentifierObservationOperations.validateDeviceIdentifierObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceIdentifierObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DeviceIdentifierObservationOperations.validateDeviceIdentifierObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceIdentifierObservationIIUDIissuingagency(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DeviceIdentifierObservationOperations.validateDeviceIdentifierObservationIIUDIissuingagency(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceIdentifierObservationIIRoot(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DeviceIdentifierObservationOperations.validateDeviceIdentifierObservationIIRoot(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceIdentifierObservationIIExtension(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DeviceIdentifierObservationOperations.validateDeviceIdentifierObservationIIExtension(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceIdentifierObservationIIDisplayable(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DeviceIdentifierObservationOperations.validateDeviceIdentifierObservationIIDisplayable(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceIdentifierObservation init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DeviceIdentifierObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }

} // DeviceIdentifierObservationImpl
