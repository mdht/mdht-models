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
import org.openhealthtools.mdht.uml.cda.emspcr.RespiratoryRate;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.RespiratoryRateOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Respiratory Rate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class RespiratoryRateImpl extends VitalSignObservationImpl implements RespiratoryRate {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RespiratoryRateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.RESPIRATORY_RATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRespiratoryRateMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RespiratoryRateOperations.validateRespiratoryRateMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRespiratoryRateCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RespiratoryRateOperations.validateRespiratoryRateCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRespiratoryRateEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RespiratoryRateOperations.validateRespiratoryRateEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRespiratoryRateValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RespiratoryRateOperations.validateRespiratoryRateValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateVitalSignObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RespiratoryRateOperations.validateVitalSignObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RespiratoryRate init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RespiratoryRate init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // RespiratoryRateImpl
