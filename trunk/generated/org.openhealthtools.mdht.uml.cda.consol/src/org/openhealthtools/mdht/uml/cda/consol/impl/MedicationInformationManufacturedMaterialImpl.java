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
import org.openhealthtools.mdht.uml.cda.consol.MedicationInformationManufacturedMaterial;
import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationInformationManufacturedMaterialOperations;
import org.openhealthtools.mdht.uml.cda.impl.MaterialImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Information Manufactured Material</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MedicationInformationManufacturedMaterialImpl extends MaterialImpl implements
		MedicationInformationManufacturedMaterial {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationInformationManufacturedMaterialImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.MEDICATION_INFORMATION_MANUFACTURED_MATERIAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationInformationManufacturedMaterialCodeOriginalText(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationInformationManufacturedMaterialOperations.validateMedicationInformationManufacturedMaterialCodeOriginalText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationInformationManufacturedMaterialReference(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationInformationManufacturedMaterialOperations.validateMedicationInformationManufacturedMaterialReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationInformationManufacturedMaterialCodeTranslation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationInformationManufacturedMaterialOperations.validateMedicationInformationManufacturedMaterialCodeTranslation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationInformationManufacturedMaterialCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationInformationManufacturedMaterialOperations.validateMedicationInformationManufacturedMaterialCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationInformationManufacturedMaterial init() {
    	CDAUtil.init(this);
    	return this;
	}
} // MedicationInformationManufacturedMaterialImpl
