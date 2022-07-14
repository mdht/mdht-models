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
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.ManufacturedProductImpl;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation;
import org.openhealthtools.mdht.uml.cda.consol.operations.ImmunizationMedicationInformationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Immunization Medication Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ImmunizationMedicationInformationImpl extends ManufacturedProductImpl
		implements ImmunizationMedicationInformation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImmunizationMedicationInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.IMMUNIZATION_MEDICATION_INFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationMedicationInformationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImmunizationMedicationInformationOperations.validateImmunizationMedicationInformationTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationMedicationInformationClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImmunizationMedicationInformationOperations.validateImmunizationMedicationInformationClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationMedicationInformationId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImmunizationMedicationInformationOperations.validateImmunizationMedicationInformationId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationMedicationInformationManufacturerOrganization(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImmunizationMedicationInformationOperations.validateImmunizationMedicationInformationManufacturerOrganization(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationMedicationInformationManufacturedMaterial(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ImmunizationMedicationInformationOperations.validateImmunizationMedicationInformationManufacturedMaterial(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeOriginalText(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationMedicationInformationOperations.validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeOriginalText(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialOriginalTextReference(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationMedicationInformationOperations.validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialOriginalTextReference(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialTextReferenceValue(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationMedicationInformationOperations.validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialTextReferenceValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeTranslation(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationMedicationInformationOperations.validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeTranslation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationMedicationInformationOperations.validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialLotNumberText(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ImmunizationMedicationInformationOperations.validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialLotNumberText(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationMedicationInformation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationMedicationInformation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ImmunizationMedicationInformationImpl
