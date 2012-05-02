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
package org.openhealthtools.mdht.uml.cda.hitsp.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationOrderInformation;
import org.openhealthtools.mdht.uml.cda.hitsp.operations.MedicationOrderInformationOperations;
import org.openhealthtools.mdht.uml.cda.ihe.impl.SupplyEntryImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Order Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MedicationOrderInformationImpl extends SupplyEntryImpl implements MedicationOrderInformation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationOrderInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HITSPPackage.Literals.MEDICATION_ORDER_INFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformationOrderNumber(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationOrderInformationOperations.validateMedicationOrderInformationOrderNumber(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformationOrderExpiration(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationOrderInformationOperations.validateMedicationOrderInformationOrderExpiration(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformationQuantityOrdered(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationOrderInformationOperations.validateMedicationOrderInformationQuantityOrdered(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformationQuantityUnit(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationOrderInformationOperations.validateMedicationOrderInformationQuantityUnit(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformationPrescriptionNumber(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationOrderInformationOperations.validateMedicationOrderInformationPrescriptionNumber(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformationAssigningAuthority(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationOrderInformationOperations.validateMedicationOrderInformationAssigningAuthority(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformationDispenseDate(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationOrderInformationOperations.validateMedicationOrderInformationDispenseDate(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformationDispensingPharmacyLocation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationOrderInformationOperations.validateMedicationOrderInformationDispensingPharmacyLocation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformationQuantityDispensed(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationOrderInformationOperations.validateMedicationOrderInformationQuantityDispensed(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformationHasFillNumber(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationOrderInformationOperations.validateMedicationOrderInformationHasFillNumber(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOrderInformationOperations.validateMedicationOrderInformationTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformationRepeatNumber(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationOrderInformationOperations.validateMedicationOrderInformationRepeatNumber(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationOrderInformationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOrderInformationOperations.validateMedicationOrderInformationStatusCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSupplyActivityStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOrderInformationOperations.validateSupplyActivityStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationOrderInformation init() {
		CDAUtil.init(this);
		return this;
	}
} // MedicationOrderInformationImpl
