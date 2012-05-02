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
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation;
import org.openhealthtools.mdht.uml.cda.consol.operations.ImmunizationMedicationInformationOperations;
import org.openhealthtools.mdht.uml.cda.impl.ManufacturedProductImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Immunization Medication Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ImmunizationMedicationInformationImpl extends ManufacturedProductImpl implements
		ImmunizationMedicationInformation {
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
	public boolean validateImmunizationMedicationInformationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public ImmunizationMedicationInformation init() {
		CDAUtil.init(this);
		return this;
	}
} // ImmunizationMedicationInformationImpl
