/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.ccd.impl.PatientInstructionImpl;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.PatientMedicalInstructions;
import org.openhealthtools.mdht.uml.cda.ihe.operations.PatientMedicalInstructionsOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patient Medical Instructions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PatientMedicalInstructionsImpl extends PatientInstructionImpl implements PatientMedicalInstructions {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientMedicalInstructionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IHEPackage.Literals.PATIENT_MEDICAL_INSTRUCTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientMedicalInstructionsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientMedicalInstructionsOperations.validatePatientMedicalInstructionsTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientMedicalInstructionsClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientMedicalInstructionsOperations.validatePatientMedicalInstructionsClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientMedicalInstructionsCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientMedicalInstructionsOperations.validatePatientMedicalInstructionsCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientMedicalInstructionsStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientMedicalInstructionsOperations.validatePatientMedicalInstructionsStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientMedicalInstructionsText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientMedicalInstructionsOperations.validatePatientMedicalInstructionsText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientMedicalInstructions init() {
    		CDAUtil.init(this);
    		return this;
	}
} //PatientMedicalInstructionsImpl
