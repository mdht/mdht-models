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
import org.openhealthtools.mdht.uml.cda.consol.MedicationInformation;

import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationInformationOperations;

import org.openhealthtools.mdht.uml.cda.impl.ManufacturedProductImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MedicationInformationImpl extends ManufacturedProductImpl implements MedicationInformation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.MEDICATION_INFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationInformationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationInformationOperations.validateMedicationInformationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationInformationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationInformationOperations.validateMedicationInformationId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationInformationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationInformationOperations.validateMedicationInformationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationInformationManufacturedMaterial(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationInformationOperations.validateMedicationInformationManufacturedMaterial(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationInformationManufacturerOrganization(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationInformationOperations.validateMedicationInformationManufacturerOrganization(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationInformation init() {
    	CDAUtil.init(this);
    	return this;
	}
} // MedicationInformationImpl
