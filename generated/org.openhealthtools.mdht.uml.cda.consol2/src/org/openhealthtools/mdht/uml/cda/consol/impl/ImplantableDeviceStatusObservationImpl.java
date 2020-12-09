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
import org.openhealthtools.mdht.uml.cda.consol.ImplantableDeviceStatusObservation;

import org.openhealthtools.mdht.uml.cda.consol.operations.ImplantableDeviceStatusObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implantable Device Status Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ImplantableDeviceStatusObservationImpl extends ObservationImpl
		implements ImplantableDeviceStatusObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplantableDeviceStatusObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.IMPLANTABLE_DEVICE_STATUS_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplantableDeviceStatusObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImplantableDeviceStatusObservationOperations.validateImplantableDeviceStatusObservationTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplantableDeviceStatusObservationCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImplantableDeviceStatusObservationOperations.validateImplantableDeviceStatusObservationCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplantableDeviceStatusObservationCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImplantableDeviceStatusObservationOperations.validateImplantableDeviceStatusObservationCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplantableDeviceStatusObservationValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImplantableDeviceStatusObservationOperations.validateImplantableDeviceStatusObservationValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplantableDeviceStatusObservationValueP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImplantableDeviceStatusObservationOperations.validateImplantableDeviceStatusObservationValueP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplantableDeviceStatusObservation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplantableDeviceStatusObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}

} // ImplantableDeviceStatusObservationImpl
