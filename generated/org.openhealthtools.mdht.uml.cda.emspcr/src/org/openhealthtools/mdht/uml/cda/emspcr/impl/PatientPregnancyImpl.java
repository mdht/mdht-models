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
import org.openhealthtools.mdht.uml.cda.emspcr.PatientPregnancy;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.PatientPregnancyOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patient Pregnancy</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PatientPregnancyImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements PatientPregnancy {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientPregnancyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.PATIENT_PREGNANCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientPregnancyTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientPregnancyOperations.validatePatientPregnancyTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientPregnancyMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientPregnancyOperations.validatePatientPregnancyMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientPregnancyCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientPregnancyOperations.validatePatientPregnancyCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientPregnancyCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientPregnancyOperations.validatePatientPregnancyCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientPregnancyValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientPregnancyOperations.validatePatientPregnancyValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientPregnancyValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientPregnancyOperations.validatePatientPregnancyValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientPregnancy init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PatientPregnancy init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} // PatientPregnancyImpl
