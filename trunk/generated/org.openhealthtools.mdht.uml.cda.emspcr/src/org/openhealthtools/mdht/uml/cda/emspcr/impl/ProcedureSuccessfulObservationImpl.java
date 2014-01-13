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
import org.openhealthtools.mdht.uml.cda.emspcr.ProcedureSuccessfulObservation;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.ProcedureSuccessfulObservationOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure Successful Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ProcedureSuccessfulObservationImpl extends ObservationImpl implements ProcedureSuccessfulObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureSuccessfulObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.PROCEDURE_SUCCESSFUL_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureSuccessfulObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureSuccessfulObservationOperations.validateProcedureSuccessfulObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureSuccessfulObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureSuccessfulObservationOperations.validateProcedureSuccessfulObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureSuccessfulObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureSuccessfulObservationOperations.validateProcedureSuccessfulObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureSuccessfulObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureSuccessfulObservationOperations.validateProcedureSuccessfulObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureSuccessfulObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureSuccessfulObservationOperations.validateProcedureSuccessfulObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureSuccessfulObservation init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProcedureSuccessfulObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //ProcedureSuccessfulObservationImpl
