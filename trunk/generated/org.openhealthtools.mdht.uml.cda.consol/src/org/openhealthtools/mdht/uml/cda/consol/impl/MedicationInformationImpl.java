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
	public boolean validateMedicationInformationHasMaterial(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationInformationOperations.validateMedicationInformationHasMaterial(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationInformationHasMaterialCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationInformationOperations.validateMedicationInformationHasMaterialCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationInformationHasMaterialCodeVocab(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationInformationOperations.validateMedicationInformationHasMaterialCodeVocab(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationInformationHasMaterialCodeOriginalText(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationInformationOperations.validateMedicationInformationHasMaterialCodeOriginalText(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationInformationHasMaterialName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationInformationOperations.validateMedicationInformationHasMaterialName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationInformationMayHaveMaterialManufacturer(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationInformationOperations.validateMedicationInformationMayHaveMaterialManufacturer(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationInformationShouldHaveMaterialManufacturer(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationInformationOperations.validateMedicationInformationShouldHaveMaterialManufacturer(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationInformationCodedProductName(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationInformationOperations.validateMedicationInformationCodedProductName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationInformationCodedProductVocab(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationInformationOperations.validateMedicationInformationCodedProductVocab(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationInformationCodedDrugClassVocab(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationInformationOperations.validateMedicationInformationCodedDrugClassVocab(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationInformationCodedIngredientVocab(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationInformationOperations.validateMedicationInformationCodedIngredientVocab(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationInformationCodedBrandName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationInformationOperations.validateMedicationInformationCodedBrandName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationInformationCodedBrandNameVocab(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationInformationOperations.validateMedicationInformationCodedBrandNameVocab(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationInformationFreeTextProductName(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationInformationOperations.validateMedicationInformationFreeTextProductName(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationInformationFreeTextBrandName(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationInformationOperations.validateMedicationInformationFreeTextBrandName(
			this, diagnostics, context);
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
	public MedicationInformation init() {
		CDAUtil.init(this);
		return this;
	}
} // MedicationInformationImpl
