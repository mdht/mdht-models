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
import org.openhealthtools.mdht.uml.cda.emspcr.NumberOfPatientsObservation;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.NumberOfPatientsObservationOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Number Of Patients Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NumberOfPatientsObservationImpl extends ObservationImpl implements NumberOfPatientsObservation {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected NumberOfPatientsObservationImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.NUMBER_OF_PATIENTS_OBSERVATION;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateNumberOfPatientsObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NumberOfPatientsObservationOperations.validateNumberOfPatientsObservationTemplateId(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateNumberOfPatientsObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NumberOfPatientsObservationOperations.validateNumberOfPatientsObservationCodeP(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateNumberOfPatientsObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NumberOfPatientsObservationOperations.validateNumberOfPatientsObservationCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateNumberOfPatientsObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NumberOfPatientsObservationOperations.validateNumberOfPatientsObservationValue(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateNumberOfPatientsObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NumberOfPatientsObservationOperations.validateNumberOfPatientsObservationMoodCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public NumberOfPatientsObservation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberOfPatientsObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // NumberOfPatientsObservationImpl
