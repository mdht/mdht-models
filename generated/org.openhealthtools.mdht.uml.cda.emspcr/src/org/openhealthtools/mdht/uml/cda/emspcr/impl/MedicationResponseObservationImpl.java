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
import org.openhealthtools.mdht.uml.cda.emspcr.MedicationResponseObservation;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.MedicationResponseObservationOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Response Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MedicationResponseObservationImpl extends ObservationImpl implements MedicationResponseObservation {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected MedicationResponseObservationImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.MEDICATION_RESPONSE_OBSERVATION;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateMedicationResponseObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationResponseObservationOperations.validateMedicationResponseObservationTemplateId(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateMedicationResponseObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationResponseObservationOperations.validateMedicationResponseObservationCodeP(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateMedicationResponseObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationResponseObservationOperations.validateMedicationResponseObservationCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateMedicationResponseObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationResponseObservationOperations.validateMedicationResponseObservationValue(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateMedicationResponseObservationMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationResponseObservationOperations.validateMedicationResponseObservationMoodCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public MedicationResponseObservation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationResponseObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // MedicationResponseObservationImpl
