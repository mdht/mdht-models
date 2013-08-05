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
import org.openhealthtools.mdht.uml.cda.emspcr.ResponseDestinationOdometerReading;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.ResponseDestinationOdometerReadingOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Response Destination Odometer Reading</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ResponseDestinationOdometerReadingImpl extends ObservationImpl implements
		ResponseDestinationOdometerReading {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponseDestinationOdometerReadingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.RESPONSE_DESTINATION_ODOMETER_READING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseDestinationOdometerReadingTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ResponseDestinationOdometerReadingOperations.validateResponseDestinationOdometerReadingTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseDestinationOdometerReadingCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ResponseDestinationOdometerReadingOperations.validateResponseDestinationOdometerReadingCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseDestinationOdometerReadingCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ResponseDestinationOdometerReadingOperations.validateResponseDestinationOdometerReadingCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseDestinationOdometerReadingValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ResponseDestinationOdometerReadingOperations.validateResponseDestinationOdometerReadingValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseDestinationOdometerReadingMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ResponseDestinationOdometerReadingOperations.validateResponseDestinationOdometerReadingMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseDestinationOdometerReading init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseDestinationOdometerReading init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ResponseDestinationOdometerReadingImpl
