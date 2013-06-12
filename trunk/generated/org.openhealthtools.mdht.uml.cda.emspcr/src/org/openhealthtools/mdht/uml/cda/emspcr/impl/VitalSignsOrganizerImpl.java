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
import org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsOrganizer;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.VitalSignsOrganizerOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vital Signs Organizer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class VitalSignsOrganizerImpl extends org.openhealthtools.mdht.uml.cda.consol.impl.VitalSignsOrganizerImpl
		implements VitalSignsOrganizer {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected VitalSignsOrganizerImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.VITAL_SIGNS_ORGANIZER;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateEmspcrVitalSignsOrganizerEmspcrVitalSignsOrganizerSystolicBloodPressureComponent(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignsOrganizerOperations.validateEmspcrVitalSignsOrganizerEmspcrVitalSignsOrganizerSystolicBloodPressureComponent(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateEmspcrVitalSignsOrganizerEmspcrVitalSignsOrganizerDiastolicBloodPressureComponent(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignsOrganizerOperations.validateEmspcrVitalSignsOrganizerEmspcrVitalSignsOrganizerDiastolicBloodPressureComponent(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateEmspcrVitalSignsOrganizerEmspcrVitalSignsOrganizerHeartRateComponent(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignsOrganizerOperations.validateEmspcrVitalSignsOrganizerEmspcrVitalSignsOrganizerHeartRateComponent(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateEmspcrVitalSignsOrganizerEmspcrVitalSignsOrganizerRespiratoryRateComponent(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignsOrganizerOperations.validateEmspcrVitalSignsOrganizerEmspcrVitalSignsOrganizerRespiratoryRateComponent(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateEmspcrVitalSignsOrganizerEmspcrVitalSignsOrganizerBodyTemperatureComponent(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignsOrganizerOperations.validateEmspcrVitalSignsOrganizerEmspcrVitalSignsOrganizerBodyTemperatureComponent(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateEmspcrVitalSignsOrganizerEmspcrVitalSignsOrganizerOxygenSaturationComponent(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignsOrganizerOperations.validateEmspcrVitalSignsOrganizerEmspcrVitalSignsOrganizerOxygenSaturationComponent(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateEmspcrVitalSignsOrganizerEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return VitalSignsOrganizerOperations.validateEmspcrVitalSignsOrganizerEffectiveTime(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	public boolean validateVitalSignsOrganizerTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignsOrganizerOperations.validateVitalSignsOrganizerTemplateId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	public VitalSignsOrganizer init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VitalSignsOrganizer init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // VitalSignsOrganizerImpl
