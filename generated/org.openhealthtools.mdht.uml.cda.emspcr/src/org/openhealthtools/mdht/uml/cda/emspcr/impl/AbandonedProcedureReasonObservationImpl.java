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

import org.openhealthtools.mdht.uml.cda.emspcr.AbandonedProcedureReasonObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.AbandonedProcedureReasonObservationOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abandoned Procedure Reason Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AbandonedProcedureReasonObservationImpl extends ObservationImpl implements AbandonedProcedureReasonObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbandonedProcedureReasonObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.ABANDONED_PROCEDURE_REASON_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbandonedProcedureReasonObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AbandonedProcedureReasonObservationOperations.validateAbandonedProcedureReasonObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbandonedProcedureReasonObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AbandonedProcedureReasonObservationOperations.validateAbandonedProcedureReasonObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbandonedProcedureReasonObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AbandonedProcedureReasonObservationOperations.validateAbandonedProcedureReasonObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbandonedProcedureReasonObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AbandonedProcedureReasonObservationOperations.validateAbandonedProcedureReasonObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbandonedProcedureReasonObservationValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AbandonedProcedureReasonObservationOperations.validateAbandonedProcedureReasonObservationValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbandonedProcedureReasonObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AbandonedProcedureReasonObservationOperations.validateAbandonedProcedureReasonObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbandonedProcedureReasonObservation init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbandonedProcedureReasonObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //AbandonedProcedureReasonObservationImpl
