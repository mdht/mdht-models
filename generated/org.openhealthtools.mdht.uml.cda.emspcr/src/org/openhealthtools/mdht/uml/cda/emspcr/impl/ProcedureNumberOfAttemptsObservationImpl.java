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
import org.openhealthtools.mdht.uml.cda.emspcr.ProcedureNumberOfAttemptsObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.ProcedureNumberOfAttemptsObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure Number Of Attempts Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ProcedureNumberOfAttemptsObservationImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements
		ProcedureNumberOfAttemptsObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureNumberOfAttemptsObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.PROCEDURE_NUMBER_OF_ATTEMPTS_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNumberOfAttemptsObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNumberOfAttemptsObservationOperations.validateProcedureNumberOfAttemptsObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNumberOfAttemptsObservationMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNumberOfAttemptsObservationOperations.validateProcedureNumberOfAttemptsObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNumberOfAttemptsObservationCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNumberOfAttemptsObservationOperations.validateProcedureNumberOfAttemptsObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNumberOfAttemptsObservationCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNumberOfAttemptsObservationOperations.validateProcedureNumberOfAttemptsObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureNumberOfAttemptsObservationValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNumberOfAttemptsObservationOperations.validateProcedureNumberOfAttemptsObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureNumberOfAttemptsObservation init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ProcedureNumberOfAttemptsObservation init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} // ProcedureNumberOfAttemptsObservationImpl
