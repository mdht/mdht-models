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
import org.openhealthtools.mdht.uml.cda.emspcr.PatientBodyWeight;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.PatientBodyWeightOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patient Body Weight</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PatientBodyWeightImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements PatientBodyWeight {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientBodyWeightImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.PATIENT_BODY_WEIGHT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientBodyWeightTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientBodyWeightOperations.validatePatientBodyWeightTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientBodyWeightMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientBodyWeightOperations.validatePatientBodyWeightMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientBodyWeightCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientBodyWeightOperations.validatePatientBodyWeightCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientBodyWeightValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientBodyWeightOperations.validatePatientBodyWeightValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientBodyWeight init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PatientBodyWeight init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} // PatientBodyWeightImpl
