/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.MedicationInformation2;

import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationInformation2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Information2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MedicationInformation2Impl extends MedicationInformationImpl implements MedicationInformation2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationInformation2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.MEDICATION_INFORMATION2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationInformation2MedicationInformationManufacturedMaterialCETranslation(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationInformation2Operations.validateMedicationInformation2MedicationInformationManufacturedMaterialCETranslation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationInformation2MedicationInformationManufacturedMaterialCodeOriginalText(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationInformation2Operations.validateMedicationInformation2MedicationInformationManufacturedMaterialCodeOriginalText(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationInformation2MedicationInformationManufacturedMaterialCodeTranslation(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationInformation2Operations.validateMedicationInformation2MedicationInformationManufacturedMaterialCodeTranslation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationInformation2MedicationInformationManufacturedMaterialReference(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationInformation2Operations.validateMedicationInformation2MedicationInformationManufacturedMaterialReference(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationInformation2MedicationInformationManufacturedMaterialOriginalTextReferenceValue(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationInformation2Operations.validateMedicationInformation2MedicationInformationManufacturedMaterialOriginalTextReferenceValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationInformation2MedicationInformationManufacturedMaterialReferenceValue(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationInformation2Operations.validateMedicationInformation2MedicationInformationManufacturedMaterialReferenceValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationInformation2MedicationInformationMedicationInformationManufacturedMaterialCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationInformation2Operations.validateMedicationInformation2MedicationInformationMedicationInformationManufacturedMaterialCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationInformation2MedicationInformationMedicationInformationManufacturedMaterialCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationInformation2Operations.validateMedicationInformation2MedicationInformationMedicationInformationManufacturedMaterialCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationInformationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationInformation2Operations.validateMedicationInformationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationInformationManufacturedMaterial(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationInformation2Operations.validateMedicationInformationManufacturedMaterial(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationInformation2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationInformation2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // MedicationInformation2Impl
