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
package org.openhealthtools.mdht.uml.cda.hitsp.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationInformation;
import org.openhealthtools.mdht.uml.cda.hitsp.operations.MedicationInformationOperations;
import org.openhealthtools.mdht.uml.cda.ihe.impl.ProductEntryImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MedicationInformationImpl extends ProductEntryImpl implements MedicationInformation {
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
		return HITSPPackage.Literals.MEDICATION_INFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationInformationCodedProductName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationInformationOperations.validateMedicationInformationCodedProductName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationInformationCodedProductVocab(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationInformationOperations.validateMedicationInformationCodedProductVocab(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationInformationCodedDrugClassVocab(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationInformationOperations.validateMedicationInformationCodedDrugClassVocab(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationInformationCodedIngredientVocab(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationInformationOperations.validateMedicationInformationCodedIngredientVocab(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationInformationCodedBrandName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationInformationOperations.validateMedicationInformationCodedBrandName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationInformationCodedBrandNameVocab(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationInformationOperations.validateMedicationInformationCodedBrandNameVocab(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationInformationFreeTextProductName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationInformationOperations.validateMedicationInformationFreeTextProductName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationInformationFreeTextBrandName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationInformationOperations.validateMedicationInformationFreeTextBrandName(this, diagnostics, context);
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
	@Override
	public MedicationInformation init() {
    	CDAUtil.init(this);
    	return this;
	}
} // MedicationInformationImpl
