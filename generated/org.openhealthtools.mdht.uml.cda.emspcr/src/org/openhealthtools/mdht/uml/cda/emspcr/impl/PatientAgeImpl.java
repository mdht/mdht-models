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
import org.openhealthtools.mdht.uml.cda.emspcr.PatientAge;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.PatientAgeOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patient Age</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PatientAgeImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements PatientAge {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientAgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.PATIENT_AGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientAgeTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientAgeOperations.validatePatientAgeTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientAgeMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientAgeOperations.validatePatientAgeMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientAgeCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientAgeOperations.validatePatientAgeCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientAgeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientAgeOperations.validatePatientAgeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientAgeValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientAgeOperations.validatePatientAgeValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientAge init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PatientAge init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} // PatientAgeImpl
