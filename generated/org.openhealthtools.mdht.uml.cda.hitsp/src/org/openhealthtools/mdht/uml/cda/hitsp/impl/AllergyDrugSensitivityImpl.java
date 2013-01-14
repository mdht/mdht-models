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

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.hitsp.AllergyDrugSensitivity;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.operations.AllergyDrugSensitivityOperations;
import org.openhealthtools.mdht.uml.cda.ihe.impl.AllergyIntoleranceConcernImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allergy Drug Sensitivity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AllergyDrugSensitivityImpl extends AllergyIntoleranceConcernImpl implements AllergyDrugSensitivity {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected AllergyDrugSensitivityImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return HITSPPackage.Literals.ALLERGY_DRUG_SENSITIVITY;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAllergyDrugSensitivityAdverseEventDate(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityAdverseEventDate(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAllergyDrugSensitivityAdverseEventType(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityAdverseEventType(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAllergyDrugSensitivityAdverseEventTypeVocab(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityAdverseEventTypeVocab(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAllergyDrugSensitivityAllergyProduct(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityAllergyProduct(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAllergyDrugSensitivityAllergyProductTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityAllergyProductTypeCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAllergyDrugSensitivityProductDetailParticipantRole(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityProductDetailParticipantRole(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAllergyDrugSensitivityProductDetailParticipantRoleClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityProductDetailParticipantRoleClassCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAllergyDrugSensitivityProductDetailPlayingEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityProductDetailPlayingEntity(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAllergyDrugSensitivityProductDetailPlayingEntityClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityProductDetailPlayingEntityClassCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAllergyDrugSensitivityProductDetailName(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityProductDetailName(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAllergyDrugSensitivityProductCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityProductCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAllergyDrugSensitivityAllergyProductFoodVocab(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityAllergyProductFoodVocab(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAllergyDrugSensitivityAllergyProductMedClassVocab(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityAllergyProductMedClassVocab(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAllergyDrugSensitivityAllergyProductSpecificMedVocab(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityAllergyProductSpecificMedVocab(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAllergyDrugSensitivityReactionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityReactionText(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAllergyDrugSensitivityReactionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityReactionCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAllergyDrugSensitivityReactionCodeVocab(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityReactionCodeVocab(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAllergyDrugSensitivitySeverityText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivitySeverityText(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAllergyDrugSensitivitySeverityCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivitySeverityCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAllergyDrugSensitivitySeverityCodeVocab(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivitySeverityCodeVocab(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateAllergyDrugSensitivityTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityTemplateId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	public AllergyDrugSensitivity init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllergyDrugSensitivity init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // AllergyDrugSensitivityImpl
