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
import org.openhealthtools.mdht.uml.cda.emspcr.PatientOnAnticoagulants;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.PatientOnAnticoagulantsOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patient On Anticoagulants</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PatientOnAnticoagulantsImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements PatientOnAnticoagulants {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientOnAnticoagulantsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.PATIENT_ON_ANTICOAGULANTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientOnAnticoagulantsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientOnAnticoagulantsOperations.validatePatientOnAnticoagulantsTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientOnAnticoagulantsMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientOnAnticoagulantsOperations.validatePatientOnAnticoagulantsMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientOnAnticoagulantsCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientOnAnticoagulantsOperations.validatePatientOnAnticoagulantsCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientOnAnticoagulantsValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientOnAnticoagulantsOperations.validatePatientOnAnticoagulantsValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientOnAnticoagulants init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PatientOnAnticoagulants init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} // PatientOnAnticoagulantsImpl
