/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.MedicationDispense;
import org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder;
import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationDispenseOperations;
import org.openhealthtools.mdht.uml.cda.impl.SupplyImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Dispense</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MedicationDispenseImpl extends SupplyImpl implements MedicationDispense {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationDispenseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.MEDICATION_DISPENSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationDispenseContainsMedicationOrImmunization(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationDispenseOperations.validateMedicationDispenseContainsMedicationOrImmunization(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationDispenseTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationDispenseOperations.validateMedicationDispenseTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationDispenseClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationDispenseOperations.validateMedicationDispenseClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationDispenseEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationDispenseOperations.validateMedicationDispenseEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationDispenseId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationDispenseOperations.validateMedicationDispenseId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationDispenseMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationDispenseOperations.validateMedicationDispenseMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationDispenseRepeatNumber(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationDispenseOperations.validateMedicationDispenseRepeatNumber(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationDispenseStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationDispenseOperations.validateMedicationDispenseStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationDispenseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationDispenseOperations.validateMedicationDispenseQuantity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationDispensePerformer(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationDispenseOperations.validateMedicationDispensePerformer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationDispensePerformerMedicationDispenseAssignedEntityUSRealmAddressStreet(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationDispenseOperations.validateMedicationDispensePerformerMedicationDispenseAssignedEntityUSRealmAddressStreet(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationDispensePerformerMedicationDispenseAssignedEntityUSRealmAddressCity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationDispenseOperations.validateMedicationDispensePerformerMedicationDispenseAssignedEntityUSRealmAddressCity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationDispensePerformerMedicationDispenseAssignedEntityUSRealmAddressCountry(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationDispenseOperations.validateMedicationDispensePerformerMedicationDispenseAssignedEntityUSRealmAddressCountry(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationDispensePerformerMedicationDispenseAssignedEntityUSRealmAddressPostalCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationDispenseOperations.validateMedicationDispensePerformerMedicationDispenseAssignedEntityUSRealmAddressPostalCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationDispensePerformerMedicationDispenseAssignedEntityUSRealmAddressState(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationDispenseOperations.validateMedicationDispensePerformerMedicationDispenseAssignedEntityUSRealmAddressState(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationDispensePerformerMedicationDispenseAssignedEntityUSRealmAddressStreetAddressLine(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationDispenseOperations.validateMedicationDispensePerformerMedicationDispenseAssignedEntityUSRealmAddressStreetAddressLine(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationDispensePerformerMedicationDispenseAssignedEntityUSRealmAddressUseP(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationDispenseOperations.validateMedicationDispensePerformerMedicationDispenseAssignedEntityUSRealmAddressUseP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationDispensePerformerMedicationDispenseAssignedEntityUSRealmAddressUse(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationDispenseOperations.validateMedicationDispensePerformerMedicationDispenseAssignedEntityUSRealmAddressUse(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationDispensePerformerMedicationDispenseAssignedEntityAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationDispenseOperations.validateMedicationDispensePerformerMedicationDispenseAssignedEntityAddr(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationDispensePerformerMedicationDispenseAssignedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationDispenseOperations.validateMedicationDispensePerformerMedicationDispenseAssignedEntity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationDispenseMedicationSupplyOrder(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationDispenseOperations.validateMedicationDispenseMedicationSupplyOrder(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationSupplyOrder getMedicationSupplyOrder() {
		return MedicationDispenseOperations.getMedicationSupplyOrder(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationDispense init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
     * @generated
     */
	public MedicationDispense init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // MedicationDispenseImpl
