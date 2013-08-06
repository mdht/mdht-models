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
import org.openhealthtools.mdht.uml.cda.emspcr.MedicationComplicationObservation;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.MedicationComplicationObservationOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Complication Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MedicationComplicationObservationImpl extends ObservationImpl implements MedicationComplicationObservation {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected MedicationComplicationObservationImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.MEDICATION_COMPLICATION_OBSERVATION;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateMedicationComplicationObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationComplicationObservationOperations.validateMedicationComplicationObservationTemplateId(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateMedicationComplicationObservationCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationComplicationObservationOperations.validateMedicationComplicationObservationCodeP(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateMedicationComplicationObservationCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationComplicationObservationOperations.validateMedicationComplicationObservationCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateMedicationComplicationObservationValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationComplicationObservationOperations.validateMedicationComplicationObservationValue(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateMedicationComplicationObservationValueP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationComplicationObservationOperations.validateMedicationComplicationObservationValueP(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateMedicationComplicationObservationMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationComplicationObservationOperations.validateMedicationComplicationObservationMoodCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public MedicationComplicationObservation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationComplicationObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // MedicationComplicationObservationImpl
