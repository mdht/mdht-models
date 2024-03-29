/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.ProcedurePatientResponseObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.ProcedurePatientResponseObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure Patient Response Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ProcedurePatientResponseObservationImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements
		ProcedurePatientResponseObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedurePatientResponseObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.PROCEDURE_PATIENT_RESPONSE_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedurePatientResponseObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedurePatientResponseObservationOperations.validateProcedurePatientResponseObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedurePatientResponseObservationMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedurePatientResponseObservationOperations.validateProcedurePatientResponseObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedurePatientResponseObservationCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedurePatientResponseObservationOperations.validateProcedurePatientResponseObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedurePatientResponseObservationCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedurePatientResponseObservationOperations.validateProcedurePatientResponseObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedurePatientResponseObservationValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedurePatientResponseObservationOperations.validateProcedurePatientResponseObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedurePatientResponseObservationValueP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedurePatientResponseObservationOperations.validateProcedurePatientResponseObservationValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedurePatientResponseObservation init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ProcedurePatientResponseObservation init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} // ProcedurePatientResponseObservationImpl
