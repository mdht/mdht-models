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
import org.openhealthtools.mdht.uml.cda.emspcr.ReasonForChoosingDestinationObservation;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.ReasonForChoosingDestinationObservationOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reason For Choosing Destination Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ReasonForChoosingDestinationObservationImpl extends ObservationImpl implements ReasonForChoosingDestinationObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReasonForChoosingDestinationObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.REASON_FOR_CHOOSING_DESTINATION_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReasonForChoosingDestinationObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReasonForChoosingDestinationObservationOperations.validateReasonForChoosingDestinationObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReasonForChoosingDestinationObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReasonForChoosingDestinationObservationOperations.validateReasonForChoosingDestinationObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReasonForChoosingDestinationObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReasonForChoosingDestinationObservationOperations.validateReasonForChoosingDestinationObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReasonForChoosingDestinationObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReasonForChoosingDestinationObservationOperations.validateReasonForChoosingDestinationObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReasonForChoosingDestinationObservationValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReasonForChoosingDestinationObservationOperations.validateReasonForChoosingDestinationObservationValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReasonForChoosingDestinationObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReasonForChoosingDestinationObservationOperations.validateReasonForChoosingDestinationObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReasonForChoosingDestinationObservation init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReasonForChoosingDestinationObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //ReasonForChoosingDestinationObservationImpl
