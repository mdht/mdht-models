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

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.Instructions;
import org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder;
import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationSupplyOrderOperations;
import org.openhealthtools.mdht.uml.cda.impl.SupplyImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Supply Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MedicationSupplyOrderImpl extends SupplyImpl implements MedicationSupplyOrder {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationSupplyOrderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.MEDICATION_SUPPLY_ORDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationSupplyOrderInstructionInversionInd(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationSupplyOrderOperations.validateMedicationSupplyOrderInstructionInversionInd(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationSupplyOrderEffectiveTimeHigh(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationSupplyOrderOperations.validateMedicationSupplyOrderEffectiveTimeHigh(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationSupplyOrderContainsMedicationOrImmunization(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationSupplyOrderOperations.validateMedicationSupplyOrderContainsMedicationOrImmunization(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationSupplyOrderTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationSupplyOrderOperations.validateMedicationSupplyOrderTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationSupplyOrderClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationSupplyOrderOperations.validateMedicationSupplyOrderClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationSupplyOrderEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationSupplyOrderOperations.validateMedicationSupplyOrderEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationSupplyOrderMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationSupplyOrderOperations.validateMedicationSupplyOrderMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationSupplyOrderQuantity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationSupplyOrderOperations.validateMedicationSupplyOrderQuantity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationSupplyOrderRepeatNumber(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationSupplyOrderOperations.validateMedicationSupplyOrderRepeatNumber(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationSupplyOrderStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationSupplyOrderOperations.validateMedicationSupplyOrderStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationSupplyOrderId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationSupplyOrderOperations.validateMedicationSupplyOrderId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationSupplyOrderAuthor(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationSupplyOrderOperations.validateMedicationSupplyOrderAuthor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationSupplyOrderInstructions(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationSupplyOrderOperations.validateMedicationSupplyOrderInstructions(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Instructions getInstructions() {
		return MedicationSupplyOrderOperations.getInstructions(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationSupplyOrder init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationSupplyOrder init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // MedicationSupplyOrderImpl
