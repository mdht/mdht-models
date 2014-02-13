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
import org.openhealthtools.mdht.uml.cda.consol.MedicationInformation;
import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationInformationOperations;
import org.openhealthtools.mdht.uml.cda.impl.ManufacturedProductImpl;

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
	public boolean validateMedicationInformationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationInformationOperations.validateMedicationInformationClassCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateMedicationInformationManufacturedMaterial(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationInformationOperations.validateMedicationInformationManufacturedMaterial(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateMedicationInformationMedicationInformationManufacturedMaterialCodeOriginalText(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationInformationOperations.validateMedicationInformationMedicationInformationManufacturedMaterialCodeOriginalText(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateMedicationInformationMedicationInformationManufacturedMaterialReference(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationInformationOperations.validateMedicationInformationMedicationInformationManufacturedMaterialReference(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateMedicationInformationMedicationInformationManufacturedMaterialOriginalTextReferenceValue(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationInformationOperations.validateMedicationInformationMedicationInformationManufacturedMaterialOriginalTextReferenceValue(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateMedicationInformationMedicationInformationManufacturedMaterialCodeTranslation(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationInformationOperations.validateMedicationInformationMedicationInformationManufacturedMaterialCodeTranslation(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateMedicationInformationMedicationInformationManufacturedMaterialCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationInformationOperations.validateMedicationInformationMedicationInformationManufacturedMaterialCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateMedicationInformationManufacturerOrganization(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationInformationOperations.validateMedicationInformationManufacturerOrganization(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public MedicationInformation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationInformation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // MedicationInformationImpl
