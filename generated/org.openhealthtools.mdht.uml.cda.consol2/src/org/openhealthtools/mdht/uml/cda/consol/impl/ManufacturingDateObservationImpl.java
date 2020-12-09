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
import org.openhealthtools.mdht.uml.cda.consol.ManufacturingDateObservation;

import org.openhealthtools.mdht.uml.cda.consol.operations.ManufacturingDateObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manufacturing Date Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ManufacturingDateObservationImpl extends ObservationImpl implements ManufacturingDateObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManufacturingDateObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.MANUFACTURING_DATE_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManufacturingDateObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ManufacturingDateObservationOperations.validateManufacturingDateObservationTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManufacturingDateObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ManufacturingDateObservationOperations.validateManufacturingDateObservationCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManufacturingDateObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ManufacturingDateObservationOperations.validateManufacturingDateObservationCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManufacturingDateObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ManufacturingDateObservationOperations.validateManufacturingDateObservationValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManufacturingDateObservationTSValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ManufacturingDateObservationOperations.validateManufacturingDateObservationTSValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManufacturingDateObservation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManufacturingDateObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}

} // ManufacturingDateObservationImpl
