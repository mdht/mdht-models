/*******************************************************************************
 * Copyright (c) 2009, 2011 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ihe.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.ccd.impl.MedicationActivityImpl;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.InternalReference;
import org.openhealthtools.mdht.uml.cda.ihe.Medication;
import org.openhealthtools.mdht.uml.cda.ihe.PatientMedicalInstructions;
import org.openhealthtools.mdht.uml.cda.ihe.SupplyEntry;
import org.openhealthtools.mdht.uml.cda.ihe.operations.MedicationOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class MedicationImpl extends MedicationActivityImpl implements Medication {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IHEPackage.Literals.MEDICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationHasDosing(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationHasDosing(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationDosingRelationship(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationDosingRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationHasDescriptionNoMedNotKnown(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationOperations.validateMedicationHasDescriptionNoMedNotKnown(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationReasonClassMood(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationReasonClassMood(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationHasProductEntry(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationHasProductEntry(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationHasIntructionsInversion(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationHasIntructionsInversion(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationProductStrength(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationProductStrength(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationProductName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationProductName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationPreconditionReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationPreconditionReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationHasSupplyEntryInversion(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationHasSupplyEntryInversion(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationHasFillNumber(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationHasFillNumber(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationApproachSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationApproachSiteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationDoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationDoseQuantity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationRateQuantity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationRateQuantity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationOperations.validateMedicationEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InternalReference> getInternalReferences() {
		return MedicationOperations.getInternalReferences(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PatientMedicalInstructions> getPatientMedicalInstructionss() {
		return MedicationOperations.getPatientMedicalInstructionss(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyEntry getSupplyEntry() {
		return MedicationOperations.getSupplyEntry(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Medication init() {
		CDAUtil.init(this);
		return this;
	}
} // MedicationImpl
