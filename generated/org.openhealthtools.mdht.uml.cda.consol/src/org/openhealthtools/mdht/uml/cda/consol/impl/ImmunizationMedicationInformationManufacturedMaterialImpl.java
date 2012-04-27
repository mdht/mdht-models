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
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformationManufacturedMaterial;
import org.openhealthtools.mdht.uml.cda.consol.operations.ImmunizationMedicationInformationManufacturedMaterialOperations;
import org.openhealthtools.mdht.uml.cda.impl.MaterialImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Immunization Medication Information Manufactured Material</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ImmunizationMedicationInformationManufacturedMaterialImpl extends MaterialImpl implements
		ImmunizationMedicationInformationManufacturedMaterial {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected ImmunizationMedicationInformationManufacturedMaterialImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateImmunizationMedicationInformationManufacturedMaterialCodeOriginalText(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationMedicationInformationManufacturedMaterialOperations.validateImmunizationMedicationInformationManufacturedMaterialCodeOriginalText(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateImmunizationMedicationInformationManufacturedMaterialOriginalTextReference(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationMedicationInformationManufacturedMaterialOperations.validateImmunizationMedicationInformationManufacturedMaterialOriginalTextReference(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateImmunizationMedicationInformationManufacturedMaterialCodeTranslation(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationMedicationInformationManufacturedMaterialOperations.validateImmunizationMedicationInformationManufacturedMaterialCodeTranslation(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateImmunizationMedicationInformationManufacturedMaterialCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImmunizationMedicationInformationManufacturedMaterialOperations.validateImmunizationMedicationInformationManufacturedMaterialCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateImmunizationMedicationInformationManufacturedMaterialLotNumberText(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationMedicationInformationManufacturedMaterialOperations.validateImmunizationMedicationInformationManufacturedMaterialLotNumberText(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public ImmunizationMedicationInformationManufacturedMaterial init() {
		CDAUtil.init(this);
		return this;
	}
} // ImmunizationMedicationInformationManufacturedMaterialImpl
