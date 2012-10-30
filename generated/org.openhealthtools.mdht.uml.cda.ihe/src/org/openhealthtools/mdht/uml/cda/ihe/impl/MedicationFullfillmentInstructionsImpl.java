/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ihe.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.ccd.impl.FulfillmentInstructionImpl;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.MedicationFullfillmentInstructions;
import org.openhealthtools.mdht.uml.cda.ihe.operations.MedicationFullfillmentInstructionsOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Fullfillment Instructions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MedicationFullfillmentInstructionsImpl extends FulfillmentInstructionImpl implements
		MedicationFullfillmentInstructions {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected MedicationFullfillmentInstructionsImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return IHEPackage.Literals.MEDICATION_FULLFILLMENT_INSTRUCTIONS;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateMedicationFullfillmentInstructionsTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationFullfillmentInstructionsOperations.validateMedicationFullfillmentInstructionsTemplateId(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateMedicationFullfillmentInstructionsCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationFullfillmentInstructionsOperations.validateMedicationFullfillmentInstructionsCodeP(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateMedicationFullfillmentInstructionsCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationFullfillmentInstructionsOperations.validateMedicationFullfillmentInstructionsCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateMedicationFullfillmentInstructionsStatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationFullfillmentInstructionsOperations.validateMedicationFullfillmentInstructionsStatusCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateMedicationFullfillmentInstructionsText(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationFullfillmentInstructionsOperations.validateMedicationFullfillmentInstructionsText(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	public MedicationFullfillmentInstructions init() {
		return Initializer.Util.init(this);
	}

	/**
	   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	   * @generated
	   */
	@Override
	public MedicationFullfillmentInstructions init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // MedicationFullfillmentInstructionsImpl
