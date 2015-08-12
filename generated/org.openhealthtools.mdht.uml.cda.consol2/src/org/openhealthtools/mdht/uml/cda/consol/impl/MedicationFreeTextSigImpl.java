/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.MedicationFreeTextSig;

import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationFreeTextSigOperations;

import org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Free Text Sig</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MedicationFreeTextSigImpl extends SubstanceAdministrationImpl implements MedicationFreeTextSig {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationFreeTextSigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.MEDICATION_FREE_TEXT_SIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationFreeTextSigTextReferenceValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationFreeTextSigOperations.validateMedicationFreeTextSigTextReferenceValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationFreeTextSigTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationFreeTextSigOperations.validateMedicationFreeTextSigTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationFreeTextSigClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationFreeTextSigOperations.validateMedicationFreeTextSigClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationFreeTextSigMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationFreeTextSigOperations.validateMedicationFreeTextSigMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationFreeTextSigCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationFreeTextSigOperations.validateMedicationFreeTextSigCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationFreeTextSigCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationFreeTextSigOperations.validateMedicationFreeTextSigCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationFreeTextSigText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationFreeTextSigOperations.validateMedicationFreeTextSigText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationFreeTextSigConsumable(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationFreeTextSigOperations.validateMedicationFreeTextSigConsumable(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationFreeTextSigEDTELValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationFreeTextSigOperations.validateMedicationFreeTextSigEDTELValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationFreeTextSigEDReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationFreeTextSigOperations.validateMedicationFreeTextSigEDReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationFreeTextSigConsumableManufacturedProductManufacturedLabeledDrugNullFlavor(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationFreeTextSigOperations.validateMedicationFreeTextSigConsumableManufacturedProductManufacturedLabeledDrugNullFlavor(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationFreeTextSigConsumableManufacturedProductManufacturedLabeledDrug(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationFreeTextSigOperations.validateMedicationFreeTextSigConsumableManufacturedProductManufacturedLabeledDrug(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationFreeTextSigConsumableManufacturedProduct(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationFreeTextSigOperations.validateMedicationFreeTextSigConsumableManufacturedProduct(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationFreeTextSig init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationFreeTextSig init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // MedicationFreeTextSigImpl
