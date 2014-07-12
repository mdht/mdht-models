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
import org.openhealthtools.mdht.uml.cda.consol.MedicationDispense2;

import org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder2;
import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationDispense2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Dispense2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MedicationDispense2Impl extends MedicationDispenseImpl implements MedicationDispense2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationDispense2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.MEDICATION_DISPENSE2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationDispense2ContainsMedicationInformation2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationDispense2Operations.validateMedicationDispense2ContainsMedicationInformation2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationDispense2ContainsImmunizationMedicationInformation2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationDispense2Operations.validateMedicationDispense2ContainsImmunizationMedicationInformation2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationDispense2ContainsMedicationOrImmunization(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationDispense2Operations.validateMedicationDispense2ContainsMedicationOrImmunization(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationDispenseMedicationSupplyOrder2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationDispense2Operations.validateMedicationDispenseMedicationSupplyOrder2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationSupplyOrder2 getConsolMedicationSupplyOrder2() {
		return MedicationDispense2Operations.getConsolMedicationSupplyOrder2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationDispenseTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationDispense2Operations.validateMedicationDispenseTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationDispense2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationDispense2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // MedicationDispense2Impl
