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
import org.openhealthtools.mdht.uml.cda.emspcr.ReasonProcedureNotAttemptedObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.ReasonProcedureNotAttemptedObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reason Procedure Not Attempted Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ReasonProcedureNotAttemptedObservationImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements
		ReasonProcedureNotAttemptedObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReasonProcedureNotAttemptedObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.REASON_PROCEDURE_NOT_ATTEMPTED_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReasonProcedureNotAttemptedObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReasonProcedureNotAttemptedObservationOperations.validateReasonProcedureNotAttemptedObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReasonProcedureNotAttemptedObservationMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReasonProcedureNotAttemptedObservationOperations.validateReasonProcedureNotAttemptedObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReasonProcedureNotAttemptedObservationCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReasonProcedureNotAttemptedObservationOperations.validateReasonProcedureNotAttemptedObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReasonProcedureNotAttemptedObservationValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReasonProcedureNotAttemptedObservationOperations.validateReasonProcedureNotAttemptedObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReasonProcedureNotAttemptedObservationValueP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReasonProcedureNotAttemptedObservationOperations.validateReasonProcedureNotAttemptedObservationValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReasonProcedureNotAttemptedObservation init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ReasonProcedureNotAttemptedObservation init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} // ReasonProcedureNotAttemptedObservationImpl
