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
import org.openhealthtools.mdht.uml.cda.consol.DeviceIdentifierObservationV2;

import org.openhealthtools.mdht.uml.cda.consol.operations.DeviceIdentifierObservationV2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Identifier Observation V2</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DeviceIdentifierObservationV2Impl extends ObservationImpl implements DeviceIdentifierObservationV2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceIdentifierObservationV2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.DEVICE_IDENTIFIER_OBSERVATION_V2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceIdentifierObservationV2TemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DeviceIdentifierObservationV2Operations.validateDeviceIdentifierObservationV2TemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceIdentifierObservationV2CodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DeviceIdentifierObservationV2Operations.validateDeviceIdentifierObservationV2CodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceIdentifierObservationV2Code(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DeviceIdentifierObservationV2Operations.validateDeviceIdentifierObservationV2Code(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceIdentifierObservationV2Value(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DeviceIdentifierObservationV2Operations.validateDeviceIdentifierObservationV2Value(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceIdentifierObservationV2IIUDIissuingagency(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DeviceIdentifierObservationV2Operations.validateDeviceIdentifierObservationV2IIUDIissuingagency(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceIdentifierObservationV2IIRoot(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DeviceIdentifierObservationV2Operations.validateDeviceIdentifierObservationV2IIRoot(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceIdentifierObservationV2IIExtension(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DeviceIdentifierObservationV2Operations.validateDeviceIdentifierObservationV2IIExtension(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceIdentifierObservationV2IIDisplayable(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DeviceIdentifierObservationV2Operations.validateDeviceIdentifierObservationV2IIDisplayable(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceIdentifierObservationV2 init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DeviceIdentifierObservationV2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // DeviceIdentifierObservationV2Impl
