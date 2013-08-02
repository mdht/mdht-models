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
	public boolean validateEMSPCRVitalSignsOrganizerSystolicBloodPressureComponent(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return VitalSignsOrganizerOperations.validateEMSPCRVitalSignsOrganizerSystolicBloodPressureComponent(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSPCRVitalSignsOrganizerDiastolicBloodPressureComponent(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return VitalSignsOrganizerOperations.validateEMSPCRVitalSignsOrganizerDiastolicBloodPressureComponent(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSPCRVitalSignsOrganizerHeartRateComponent(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return VitalSignsOrganizerOperations.validateEMSPCRVitalSignsOrganizerHeartRateComponent(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSPCRVitalSignsOrganizerRespiratoryRateComponent(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return VitalSignsOrganizerOperations.validateEMSPCRVitalSignsOrganizerRespiratoryRateComponent(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSPCRVitalSignsOrganizerBodyTemperatureComponent(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return VitalSignsOrganizerOperations.validateEMSPCRVitalSignsOrganizerBodyTemperatureComponent(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSPCRVitalSignsOrganizerOxygenSaturationComponent(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return VitalSignsOrganizerOperations.validateEMSPCRVitalSignsOrganizerOxygenSaturationComponent(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSPCRVitalSignsOrganizerEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return VitalSignsOrganizerOperations.validateEMSPCRVitalSignsOrganizerEffectiveTime(this, diagnostics, context);
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
