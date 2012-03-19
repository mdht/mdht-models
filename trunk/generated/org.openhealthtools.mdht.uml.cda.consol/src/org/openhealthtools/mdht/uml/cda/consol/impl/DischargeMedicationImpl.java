/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.DischargeMedication;
import org.openhealthtools.mdht.uml.cda.consol.MedicationActivity;

import org.openhealthtools.mdht.uml.cda.consol.operations.DischargeMedicationOperations;

import org.openhealthtools.mdht.uml.cda.impl.ActImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discharge Medication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DischargeMedicationImpl extends ActImpl implements DischargeMedication {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DischargeMedicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.DISCHARGE_MEDICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeMedicationMedicationActivity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeMedicationOperations.validateDischargeMedicationMedicationActivity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeMedicationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeMedicationOperations.validateDischargeMedicationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeMedicationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeMedicationOperations.validateDischargeMedicationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeMedicationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeMedicationOperations.validateDischargeMedicationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeMedicationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeMedicationOperations.validateDischargeMedicationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationActivity getMedicationActivity() {
		return DischargeMedicationOperations.getMedicationActivity(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DischargeMedication init() {
    	CDAUtil.init(this);
    	return this;
	}
} // DischargeMedicationImpl
