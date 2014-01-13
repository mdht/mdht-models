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
import org.openhealthtools.mdht.uml.cda.emspcr.MedicationNotAdministeredReasonObservation;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.MedicationNotAdministeredReasonObservationOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Not Administered Reason Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MedicationNotAdministeredReasonObservationImpl extends ObservationImpl implements MedicationNotAdministeredReasonObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationNotAdministeredReasonObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.MEDICATION_NOT_ADMINISTERED_REASON_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationNotAdministeredReasonObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationNotAdministeredReasonObservationOperations.validateMedicationNotAdministeredReasonObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationNotAdministeredReasonObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationNotAdministeredReasonObservationOperations.validateMedicationNotAdministeredReasonObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationNotAdministeredReasonObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationNotAdministeredReasonObservationOperations.validateMedicationNotAdministeredReasonObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationNotAdministeredReasonObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationNotAdministeredReasonObservationOperations.validateMedicationNotAdministeredReasonObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationNotAdministeredReasonObservationValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationNotAdministeredReasonObservationOperations.validateMedicationNotAdministeredReasonObservationValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationNotAdministeredReasonObservation init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MedicationNotAdministeredReasonObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //MedicationNotAdministeredReasonObservationImpl
