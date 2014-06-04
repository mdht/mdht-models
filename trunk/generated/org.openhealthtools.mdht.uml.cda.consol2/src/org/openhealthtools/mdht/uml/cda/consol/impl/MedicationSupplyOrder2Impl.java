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
import org.openhealthtools.mdht.uml.cda.consol.Instruction2;
import org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder2;

import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationSupplyOrder2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Supply Order2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MedicationSupplyOrder2Impl extends MedicationSupplyOrderImpl implements MedicationSupplyOrder2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationSupplyOrder2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.MEDICATION_SUPPLY_ORDER2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSupplyOrder2ContainsMedicationInformation2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationSupplyOrder2Operations.validateMedicationSupplyOrder2ContainsMedicationInformation2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSupplyOrder2ContainsImmunizationMedicationInformation2(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationSupplyOrder2Operations.validateMedicationSupplyOrder2ContainsImmunizationMedicationInformation2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSupplyOrder2ContainsMedicationOrImmunization(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationSupplyOrder2Operations.validateMedicationSupplyOrder2ContainsMedicationOrImmunization(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSupplyOrder2InstructionInversionInd(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationSupplyOrder2Operations.validateMedicationSupplyOrder2InstructionInversionInd(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSupplyOrderInstruction2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationSupplyOrder2Operations.validateMedicationSupplyOrderInstruction2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instruction2 getConsolInstruction2() {
		return MedicationSupplyOrder2Operations.getConsolInstruction2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationSupplyOrderTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationSupplyOrder2Operations.validateMedicationSupplyOrderTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationSupplyOrder2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationSupplyOrder2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // MedicationSupplyOrder2Impl
