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
import org.openhealthtools.mdht.uml.cda.emspcr.MedicationPriorAdministrationObservation;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.MedicationPriorAdministrationObservationOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Prior Administration Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MedicationPriorAdministrationObservationImpl extends ObservationImpl implements
		MedicationPriorAdministrationObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationPriorAdministrationObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.MEDICATION_PRIOR_ADMINISTRATION_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationPriorAdministrationObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationPriorAdministrationObservationOperations.validateMedicationPriorAdministrationObservationTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationPriorAdministrationObservationMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationPriorAdministrationObservationOperations.validateMedicationPriorAdministrationObservationMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationPriorAdministrationObservationCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationPriorAdministrationObservationOperations.validateMedicationPriorAdministrationObservationCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationPriorAdministrationObservationCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationPriorAdministrationObservationOperations.validateMedicationPriorAdministrationObservationCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationPriorAdministrationObservationValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationPriorAdministrationObservationOperations.validateMedicationPriorAdministrationObservationValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationPriorAdministrationObservation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationPriorAdministrationObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // MedicationPriorAdministrationObservationImpl
