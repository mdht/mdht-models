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

import org.openhealthtools.mdht.uml.cda.consol.impl.VitalSignObservationImpl;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.SystolicBloodPressure;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.SystolicBloodPressureOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Systolic Blood Pressure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SystolicBloodPressureImpl extends VitalSignObservationImpl implements SystolicBloodPressure {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystolicBloodPressureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.SYSTOLIC_BLOOD_PRESSURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystolicBloodPressureMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SystolicBloodPressureOperations.validateSystolicBloodPressureMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystolicBloodPressureCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SystolicBloodPressureOperations.validateSystolicBloodPressureCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystolicBloodPressureValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SystolicBloodPressureOperations.validateSystolicBloodPressureValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateVitalSignObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SystolicBloodPressureOperations.validateVitalSignObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateVitalSignObservationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SystolicBloodPressureOperations.validateVitalSignObservationEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystolicBloodPressure init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystolicBloodPressure init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // SystolicBloodPressureImpl
