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
import org.openhealthtools.mdht.uml.cda.emspcr.NumberOfPatientsTransportedObservation;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.NumberOfPatientsTransportedObservationOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Number Of Patients Transported Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NumberOfPatientsTransportedObservationImpl extends ObservationImpl implements NumberOfPatientsTransportedObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumberOfPatientsTransportedObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.NUMBER_OF_PATIENTS_TRANSPORTED_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberOfPatientsTransportedObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NumberOfPatientsTransportedObservationOperations.validateNumberOfPatientsTransportedObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberOfPatientsTransportedObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NumberOfPatientsTransportedObservationOperations.validateNumberOfPatientsTransportedObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberOfPatientsTransportedObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NumberOfPatientsTransportedObservationOperations.validateNumberOfPatientsTransportedObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberOfPatientsTransportedObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NumberOfPatientsTransportedObservationOperations.validateNumberOfPatientsTransportedObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberOfPatientsTransportedObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NumberOfPatientsTransportedObservationOperations.validateNumberOfPatientsTransportedObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberOfPatientsTransportedObservation init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NumberOfPatientsTransportedObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //NumberOfPatientsTransportedObservationImpl
