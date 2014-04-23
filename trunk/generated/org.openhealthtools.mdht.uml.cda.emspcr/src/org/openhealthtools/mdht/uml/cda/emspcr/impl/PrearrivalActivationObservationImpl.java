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
import org.openhealthtools.mdht.uml.cda.emspcr.PrearrivalActivationObservation;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.PrearrivalActivationObservationOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prearrival Activation Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PrearrivalActivationObservationImpl extends ObservationImpl implements PrearrivalActivationObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrearrivalActivationObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.PREARRIVAL_ACTIVATION_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrearrivalActivationObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PrearrivalActivationObservationOperations.validatePrearrivalActivationObservationTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrearrivalActivationObservationMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PrearrivalActivationObservationOperations.validatePrearrivalActivationObservationMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrearrivalActivationObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrearrivalActivationObservationOperations.validatePrearrivalActivationObservationCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrearrivalActivationObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrearrivalActivationObservationOperations.validatePrearrivalActivationObservationCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrearrivalActivationObservationEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PrearrivalActivationObservationOperations.validatePrearrivalActivationObservationEffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrearrivalActivationObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrearrivalActivationObservationOperations.validatePrearrivalActivationObservationValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrearrivalActivationObservation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrearrivalActivationObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // PrearrivalActivationObservationImpl
