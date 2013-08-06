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

import org.openhealthtools.mdht.uml.cda.emspcr.AirwayConfirmationObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.AirwayConfirmationObservationOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Airway Confirmation Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AirwayConfirmationObservationImpl extends ObservationImpl implements AirwayConfirmationObservation {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected AirwayConfirmationObservationImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.AIRWAY_CONFIRMATION_OBSERVATION;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAirwayConfirmationObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AirwayConfirmationObservationOperations.validateAirwayConfirmationObservationTemplateId(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAirwayConfirmationObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AirwayConfirmationObservationOperations.validateAirwayConfirmationObservationCodeP(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAirwayConfirmationObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AirwayConfirmationObservationOperations.validateAirwayConfirmationObservationCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAirwayConfirmationObservationMethodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AirwayConfirmationObservationOperations.validateAirwayConfirmationObservationMethodCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAirwayConfirmationObservationMethodCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AirwayConfirmationObservationOperations.validateAirwayConfirmationObservationMethodCodeP(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAirwayConfirmationObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AirwayConfirmationObservationOperations.validateAirwayConfirmationObservationValue(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAirwayConfirmationObservationEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AirwayConfirmationObservationOperations.validateAirwayConfirmationObservationEffectiveTime(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAirwayConfirmationObservationMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AirwayConfirmationObservationOperations.validateAirwayConfirmationObservationMoodCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public AirwayConfirmationObservation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AirwayConfirmationObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // AirwayConfirmationObservationImpl
