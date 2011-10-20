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
package org.openhealthtools.mdht.uml.cda.hitsp.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.hitsp.AllergyDrugSensitivity;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPlugin;
import org.openhealthtools.mdht.uml.cda.hitsp.util.HITSPValidator;
import org.openhealthtools.mdht.uml.cda.ihe.operations.AllergyIntoleranceConcernOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Allergy Drug Sensitivity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AllergyDrugSensitivity#validateAllergyDrugSensitivityAdvereEventDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Advere Event Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AllergyDrugSensitivity#validateAllergyDrugSensitivityAdvereEventType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Advere Event Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AllergyDrugSensitivity#validateAllergyDrugSensitivityAdvereEventTypeVocab(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Advere Event Type Vocab</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AllergyDrugSensitivity#validateAllergyDrugSensitivityAllergyProduct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Allergy Product</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AllergyDrugSensitivity#validateAllergyDrugSensitivityAllergyProductTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Allergy Product Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AllergyDrugSensitivity#validateAllergyDrugSensitivityProductDetailParticipantRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Product Detail Participant Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AllergyDrugSensitivity#validateAllergyDrugSensitivityProductDetailParticipantRoleClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Product Detail Participant Role Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AllergyDrugSensitivity#validateAllergyDrugSensitivityProductDetailPlayingEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Product Detail Playing Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AllergyDrugSensitivity#validateAllergyDrugSensitivityProductDetailPlayingEntityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Product Detail Playing Entity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AllergyDrugSensitivity#validateAllergyDrugSensitivityProductDetailName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Product Detail Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AllergyDrugSensitivity#validateAllergyDrugSensitivityProductCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Product Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AllergyDrugSensitivity#validateAllergyDrugSensitivityAllergyProductFoodVocab(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Allergy Product Food Vocab</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AllergyDrugSensitivity#validateAllergyDrugSensitivityAllergyProductMedClassVocab(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Allergy Product Med Class Vocab</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AllergyDrugSensitivity#validateAllergyDrugSensitivityAllergyProductSpecificMedVocab(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Allergy Product Specific Med Vocab</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AllergyDrugSensitivity#validateAllergyDrugSensitivityReactionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Reaction Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AllergyDrugSensitivity#validateAllergyDrugSensitivityReactionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Reaction Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AllergyDrugSensitivity#validateAllergyDrugSensitivityReactionCodeVocab(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Reaction Code Vocab</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AllergyDrugSensitivity#validateAllergyDrugSensitivitySeverityText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Severity Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AllergyDrugSensitivity#validateAllergyDrugSensitivitySeverityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Severity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AllergyDrugSensitivity#validateAllergyDrugSensitivitySeverityCodeVocab(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Severity Code Vocab</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AllergyDrugSensitivity#validateAllergyDrugSensitivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AllergyDrugSensitivityOperations extends AllergyIntoleranceConcernOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllergyDrugSensitivityOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyDrugSensitivityAdvereEventDate(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Advere Event Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityAdvereEventDate(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_DRUG_SENSITIVITY_ADVERE_EVENT_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getObservations()->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::AlertObservation) and not obs.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyDrugSensitivityAdvereEventDate(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Advere Event Date</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityAdvereEventDate(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_DRUG_SENSITIVITY_ADVERE_EVENT_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::AlertObservation) and not obs.effectiveTime.oclIsUndefined())
	 * @param allergyDrugSensitivity The receiving '<em><b>Allergy Drug Sensitivity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyDrugSensitivityAdvereEventDate(AllergyDrugSensitivity allergyDrugSensitivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_DRUG_SENSITIVITY_ADVERE_EVENT_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.ALLERGY_DRUG_SENSITIVITY);
			try {
				VALIDATE_ALLERGY_DRUG_SENSITIVITY_ADVERE_EVENT_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_DRUG_SENSITIVITY_ADVERE_EVENT_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_DRUG_SENSITIVITY_ADVERE_EVENT_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyDrugSensitivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_ADVERE_EVENT_DATE,
					HITSPPlugin.INSTANCE.getString("AllergyDrugSensitivityAdvereEventDate"),
					new Object[] { allergyDrugSensitivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyDrugSensitivityAdvereEventType(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Advere Event Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityAdvereEventType(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_DRUG_SENSITIVITY_ADVERE_EVENT_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getObservations()->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::AlertObservation) and not obs.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyDrugSensitivityAdvereEventType(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Advere Event Type</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityAdvereEventType(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_DRUG_SENSITIVITY_ADVERE_EVENT_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::AlertObservation) and not obs.code.oclIsUndefined())
	 * @param allergyDrugSensitivity The receiving '<em><b>Allergy Drug Sensitivity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyDrugSensitivityAdvereEventType(AllergyDrugSensitivity allergyDrugSensitivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_DRUG_SENSITIVITY_ADVERE_EVENT_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.ALLERGY_DRUG_SENSITIVITY);
			try {
				VALIDATE_ALLERGY_DRUG_SENSITIVITY_ADVERE_EVENT_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_DRUG_SENSITIVITY_ADVERE_EVENT_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_DRUG_SENSITIVITY_ADVERE_EVENT_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyDrugSensitivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_ADVERE_EVENT_TYPE,
					HITSPPlugin.INSTANCE.getString("AllergyDrugSensitivityAdvereEventType"),
					new Object[] { allergyDrugSensitivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyDrugSensitivityAdvereEventTypeVocab(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Advere Event Type Vocab</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityAdvereEventTypeVocab(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_DRUG_SENSITIVITY_ADVERE_EVENT_TYPE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getObservations()->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::AlertObservation) and not obs.code.oclIsUndefined() and obs.code.codeSystem = '2.16.840.1.113883.6.96' and (obs.code.code = '420134006' or obs.code.code ='418038007' or obs.code.code='419511003' or obs.code.code='418471000' or obs.code.code='419199007' or obs.code.code='416098002' or obs.code.code='414285001' or obs.code.code='59037007' or obs.code.code='235719002'))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyDrugSensitivityAdvereEventTypeVocab(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Advere Event Type Vocab</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityAdvereEventTypeVocab(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_DRUG_SENSITIVITY_ADVERE_EVENT_TYPE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::AlertObservation) and not obs.code.oclIsUndefined() and obs.code.codeSystem = '2.16.840.1.113883.6.96' and (obs.code.code = '420134006' or obs.code.code ='418038007' or obs.code.code='419511003' or obs.code.code='418471000' or obs.code.code='419199007' or obs.code.code='416098002' or obs.code.code='414285001' or obs.code.code='59037007' or obs.code.code='235719002'))
	 * @param allergyDrugSensitivity The receiving '<em><b>Allergy Drug Sensitivity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyDrugSensitivityAdvereEventTypeVocab(
			AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_DRUG_SENSITIVITY_ADVERE_EVENT_TYPE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.ALLERGY_DRUG_SENSITIVITY);
			try {
				VALIDATE_ALLERGY_DRUG_SENSITIVITY_ADVERE_EVENT_TYPE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_DRUG_SENSITIVITY_ADVERE_EVENT_TYPE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ALLERGY_DRUG_SENSITIVITY_ADVERE_EVENT_TYPE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyDrugSensitivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_ADVERE_EVENT_TYPE_VOCAB,
					HITSPPlugin.INSTANCE.getString("AllergyDrugSensitivityAdvereEventTypeVocab"),
					new Object[] { allergyDrugSensitivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyDrugSensitivityAllergyProduct(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Allergy Product</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityAllergyProduct(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getObservations()->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::AlertObservation) and "
			+ "obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyDrugSensitivityAllergyProduct(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Allergy Product</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityAllergyProduct(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::AlertObservation) and 
	 * obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined()))
	 * @param allergyDrugSensitivity The receiving '<em><b>Allergy Drug Sensitivity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyDrugSensitivityAllergyProduct(AllergyDrugSensitivity allergyDrugSensitivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.ALLERGY_DRUG_SENSITIVITY);
			try {
				VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyDrugSensitivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT,
					HITSPPlugin.INSTANCE.getString("AllergyDrugSensitivityAllergyProduct"),
					new Object[] { allergyDrugSensitivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyDrugSensitivityAllergyProductTypeCode(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Allergy Product Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityAllergyProductTypeCode(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getObservations()->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::AlertObservation) and "
			+ "obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies par.typeCode = vocab::ParticipationType::CSM))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyDrugSensitivityAllergyProductTypeCode(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Allergy Product Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityAllergyProductTypeCode(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::AlertObservation) and 
	 * obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies par.typeCode = vocab::ParticipationType::CSM))
	 * @param allergyDrugSensitivity The receiving '<em><b>Allergy Drug Sensitivity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyDrugSensitivityAllergyProductTypeCode(
			AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.ALLERGY_DRUG_SENSITIVITY);
			try {
				VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyDrugSensitivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT_TYPE_CODE,
					HITSPPlugin.INSTANCE.getString("AllergyDrugSensitivityAllergyProductTypeCode"),
					new Object[] { allergyDrugSensitivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyDrugSensitivityProductDetailParticipantRole(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Product Detail Participant Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityProductDetailParticipantRole(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getObservations()->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::AlertObservation) and "
			+ "obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode = vocab::ParticipationType::CSM and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined()))))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyDrugSensitivityProductDetailParticipantRole(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Product Detail Participant Role</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityProductDetailParticipantRole(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::AlertObservation) and 
	 * obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode = vocab::ParticipationType::CSM and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined()))))
	 * @param allergyDrugSensitivity The receiving '<em><b>Allergy Drug Sensitivity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyDrugSensitivityProductDetailParticipantRole(
			AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.ALLERGY_DRUG_SENSITIVITY);
			try {
				VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyDrugSensitivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_PARTICIPANT_ROLE,
					HITSPPlugin.INSTANCE.getString("AllergyDrugSensitivityProductDetailParticipantRole"),
					new Object[] { allergyDrugSensitivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyDrugSensitivityProductDetailParticipantRoleClassCode(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Product Detail Participant Role Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityProductDetailParticipantRoleClassCode(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getObservations()->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::AlertObservation) and "
			+ "obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode = vocab::ParticipationType::CSM and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and "
			+ "prole.classCode=vocab::RoleClassRoot::MANU))))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyDrugSensitivityProductDetailParticipantRoleClassCode(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Product Detail Participant Role Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityProductDetailParticipantRoleClassCode(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::AlertObservation) and 
	 * obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode = vocab::ParticipationType::CSM and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and 
	 * prole.classCode=vocab::RoleClassRoot::MANU))))
	 * @param allergyDrugSensitivity The receiving '<em><b>Allergy Drug Sensitivity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyDrugSensitivityProductDetailParticipantRoleClassCode(
			AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.ALLERGY_DRUG_SENSITIVITY);
			try {
				VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyDrugSensitivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_PARTICIPANT_ROLE_CLASS_CODE,
					HITSPPlugin.INSTANCE.getString("AllergyDrugSensitivityProductDetailParticipantRoleClassCode"),
					new Object[] { allergyDrugSensitivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyDrugSensitivityProductDetailPlayingEntity(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Product Detail Playing Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityProductDetailPlayingEntity(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getObservations()->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::AlertObservation) and "
			+ "obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode =vocab::ParticipationType::CSM and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and "
			+ "prole.classCode=vocab::RoleClassRoot::MANU and prole.playingEntity->exists( playe : cda::PlayingEntity | not playe.oclIsUndefined())))))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyDrugSensitivityProductDetailPlayingEntity(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Product Detail Playing Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityProductDetailPlayingEntity(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::AlertObservation) and 
	 * obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode =vocab::ParticipationType::CSM and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and 
	 * prole.classCode=vocab::RoleClassRoot::MANU and prole.playingEntity->exists( playe : cda::PlayingEntity | not playe.oclIsUndefined())))))
	 * @param allergyDrugSensitivity The receiving '<em><b>Allergy Drug Sensitivity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyDrugSensitivityProductDetailPlayingEntity(
			AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.ALLERGY_DRUG_SENSITIVITY);
			try {
				VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyDrugSensitivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_PLAYING_ENTITY,
					HITSPPlugin.INSTANCE.getString("AllergyDrugSensitivityProductDetailPlayingEntity"),
					new Object[] { allergyDrugSensitivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyDrugSensitivityProductDetailPlayingEntityClassCode(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Product Detail Playing Entity Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityProductDetailPlayingEntityClassCode(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getObservations()->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::AlertObservation) and "
			+ "obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode =vocab::ParticipationType::CSM and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and "
			+ "prole.classCode=vocab::RoleClassRoot::MANU and prole.playingEntity->exists( playe : cda::PlayingEntity | not playe.oclIsUndefined() and playe.classCode =vocab::EntityClassRoot::MMAT )))))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyDrugSensitivityProductDetailPlayingEntityClassCode(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Product Detail Playing Entity Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityProductDetailPlayingEntityClassCode(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::AlertObservation) and 
	 * obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode =vocab::ParticipationType::CSM and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and 
	 * prole.classCode=vocab::RoleClassRoot::MANU and prole.playingEntity->exists( playe : cda::PlayingEntity | not playe.oclIsUndefined() and playe.classCode =vocab::EntityClassRoot::MMAT )))))
	 * @param allergyDrugSensitivity The receiving '<em><b>Allergy Drug Sensitivity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyDrugSensitivityProductDetailPlayingEntityClassCode(
			AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.ALLERGY_DRUG_SENSITIVITY);
			try {
				VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyDrugSensitivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_PLAYING_ENTITY_CLASS_CODE,
					HITSPPlugin.INSTANCE.getString("AllergyDrugSensitivityProductDetailPlayingEntityClassCode"),
					new Object[] { allergyDrugSensitivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyDrugSensitivityProductDetailName(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Product Detail Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityProductDetailName(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getObservations()->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::AlertObservation) and "
			+ "obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode = vocab::ParticipationType::CSM and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and "
			+ "prole.classCode=vocab::RoleClassRoot::MANU and prole.playingEntity->exists( playe : cda::PlayingEntity | not playe.oclIsUndefined() and playe.classCode = vocab::EntityClassRoot::MMAT and playe.name->size() = 1)))))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyDrugSensitivityProductDetailName(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Product Detail Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityProductDetailName(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::AlertObservation) and 
	 * obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode = vocab::ParticipationType::CSM and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and 
	 * prole.classCode=vocab::RoleClassRoot::MANU and prole.playingEntity->exists( playe : cda::PlayingEntity | not playe.oclIsUndefined() and playe.classCode = vocab::EntityClassRoot::MMAT and playe.name->size() = 1)))))
	 * @param allergyDrugSensitivity The receiving '<em><b>Allergy Drug Sensitivity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyDrugSensitivityProductDetailName(
			AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.ALLERGY_DRUG_SENSITIVITY);
			try {
				VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyDrugSensitivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_NAME,
					HITSPPlugin.INSTANCE.getString("AllergyDrugSensitivityProductDetailName"),
					new Object[] { allergyDrugSensitivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyDrugSensitivityProductCode(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Product Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityProductCode(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getObservations()->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::AlertObservation) and "
			+ "obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode = vocab::ParticipationType::CSM and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and "
			+ "prole.classCode=vocab::RoleClassRoot::MANU and prole.playingEntity->exists( playe : cda::PlayingEntity | not playe.oclIsUndefined() and playe.classCode = vocab::EntityClassRoot::MMAT and playe.code->size() = 1)))))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyDrugSensitivityProductCode(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Product Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityProductCode(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::AlertObservation) and 
	 * obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode = vocab::ParticipationType::CSM and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and 
	 * prole.classCode=vocab::RoleClassRoot::MANU and prole.playingEntity->exists( playe : cda::PlayingEntity | not playe.oclIsUndefined() and playe.classCode = vocab::EntityClassRoot::MMAT and playe.code->size() = 1)))))
	 * @param allergyDrugSensitivity The receiving '<em><b>Allergy Drug Sensitivity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyDrugSensitivityProductCode(AllergyDrugSensitivity allergyDrugSensitivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.ALLERGY_DRUG_SENSITIVITY);
			try {
				VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyDrugSensitivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_PRODUCT_CODE,
					HITSPPlugin.INSTANCE.getString("AllergyDrugSensitivityProductCode"),
					new Object[] { allergyDrugSensitivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyDrugSensitivityAllergyProductFoodVocab(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Allergy Product Food Vocab</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityAllergyProductFoodVocab(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT_FOOD_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getObservations()->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::AlertObservation) and "
			+ "obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode = vocab::ParticipationType::CSM and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and "
			+ "prole.classCode= vocab::RoleClassRoot::MANU and prole.playingEntity->exists( playe : cda::PlayingEntity | not playe.oclIsUndefined() and playe.classCode = vocab::EntityClassRoot::MMAT and playe.code->size() = 1 and (playe.code.codeSystem ="
			+ "'2.16.840.1.113883.4.9' or playe.code.codeSystem = '2.16.840.1.113883.3.26.1.5' or playe.code.codeSystem = '2.16.840.1.113883.6.88'))))))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyDrugSensitivityAllergyProductFoodVocab(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Allergy Product Food Vocab</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityAllergyProductFoodVocab(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT_FOOD_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::AlertObservation) and 
	 * obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode = vocab::ParticipationType::CSM and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and 
	 * prole.classCode= vocab::RoleClassRoot::MANU and prole.playingEntity->exists( playe : cda::PlayingEntity | not playe.oclIsUndefined() and playe.classCode = vocab::EntityClassRoot::MMAT and playe.code->size() = 1 and (playe.code.codeSystem =
	 * '2.16.840.1.113883.4.9' or playe.code.codeSystem = '2.16.840.1.113883.3.26.1.5' or playe.code.codeSystem = '2.16.840.1.113883.6.88'))))))
	 * @param allergyDrugSensitivity The receiving '<em><b>Allergy Drug Sensitivity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyDrugSensitivityAllergyProductFoodVocab(
			AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT_FOOD_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.ALLERGY_DRUG_SENSITIVITY);
			try {
				VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT_FOOD_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT_FOOD_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT_FOOD_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyDrugSensitivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT_FOOD_VOCAB,
					HITSPPlugin.INSTANCE.getString("AllergyDrugSensitivityAllergyProductFoodVocab"),
					new Object[] { allergyDrugSensitivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyDrugSensitivityAllergyProductMedClassVocab(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Allergy Product Med Class Vocab</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityAllergyProductMedClassVocab(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT_MED_CLASS_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getObservations()->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::AlertObservation) and "
			+ "obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode = vocab::ParticipationType::CSM and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and "
			+ "prole.classCode= vocab::RoleClassRoot::MANU and prole.playingEntity->exists( playe : cda::PlayingEntity | not playe.oclIsUndefined() and playe.classCode = vocab::EntityClassRoot::MMAT and playe.code->size() = 1 and (playe.code.codeSystem ="
			+ "'2.16.840.1.113883.4.9' or playe.code.codeSystem = '2.16.840.1.113883.3.26.1.5' or playe.code.codeSystem = '2.16.840.1.113883.6.88'))))))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyDrugSensitivityAllergyProductMedClassVocab(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Allergy Product Med Class Vocab</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityAllergyProductMedClassVocab(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT_MED_CLASS_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::AlertObservation) and 
	 * obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode = vocab::ParticipationType::CSM and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and 
	 * prole.classCode= vocab::RoleClassRoot::MANU and prole.playingEntity->exists( playe : cda::PlayingEntity | not playe.oclIsUndefined() and playe.classCode = vocab::EntityClassRoot::MMAT and playe.code->size() = 1 and (playe.code.codeSystem =
	 * '2.16.840.1.113883.4.9' or playe.code.codeSystem = '2.16.840.1.113883.3.26.1.5' or playe.code.codeSystem = '2.16.840.1.113883.6.88'))))))
	 * @param allergyDrugSensitivity The receiving '<em><b>Allergy Drug Sensitivity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyDrugSensitivityAllergyProductMedClassVocab(
			AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT_MED_CLASS_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.ALLERGY_DRUG_SENSITIVITY);
			try {
				VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT_MED_CLASS_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT_MED_CLASS_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT_MED_CLASS_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyDrugSensitivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT_MED_CLASS_VOCAB,
					HITSPPlugin.INSTANCE.getString("AllergyDrugSensitivityAllergyProductMedClassVocab"),
					new Object[] { allergyDrugSensitivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyDrugSensitivityAllergyProductSpecificMedVocab(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Allergy Product Specific Med Vocab</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityAllergyProductSpecificMedVocab(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT_SPECIFIC_MED_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getObservations()->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::AlertObservation) and "
			+ "obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode = vocab::ParticipationType::CSM and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and "
			+ "prole.classCode= vocab::RoleClassRoot::MANU and prole.playingEntity->exists( playe : cda::PlayingEntity | not playe.oclIsUndefined() and playe.classCode = vocab::EntityClassRoot::MMAT and playe.code->size() = 1 and (playe.code.codeSystem ="
			+ "'2.16.840.1.113883.4.9' or playe.code.codeSystem = '2.16.840.1.113883.3.26.1.5' or playe.code.codeSystem = '2.16.840.1.113883.6.88'))))))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyDrugSensitivityAllergyProductSpecificMedVocab(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Allergy Product Specific Med Vocab</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityAllergyProductSpecificMedVocab(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT_SPECIFIC_MED_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::AlertObservation) and 
	 * obs.participant->exists( par : cda::Participant2 | not par.oclIsUndefined() implies (par.typeCode = vocab::ParticipationType::CSM and par.participantRole->exists(prole : cda::ParticipantRole | not prole.oclIsUndefined() and 
	 * prole.classCode= vocab::RoleClassRoot::MANU and prole.playingEntity->exists( playe : cda::PlayingEntity | not playe.oclIsUndefined() and playe.classCode = vocab::EntityClassRoot::MMAT and playe.code->size() = 1 and (playe.code.codeSystem =
	 * '2.16.840.1.113883.4.9' or playe.code.codeSystem = '2.16.840.1.113883.3.26.1.5' or playe.code.codeSystem = '2.16.840.1.113883.6.88'))))))
	 * @param allergyDrugSensitivity The receiving '<em><b>Allergy Drug Sensitivity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyDrugSensitivityAllergyProductSpecificMedVocab(
			AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT_SPECIFIC_MED_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.ALLERGY_DRUG_SENSITIVITY);
			try {
				VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT_SPECIFIC_MED_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT_SPECIFIC_MED_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT_SPECIFIC_MED_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyDrugSensitivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT_SPECIFIC_MED_VOCAB,
					HITSPPlugin.INSTANCE.getString("AllergyDrugSensitivityAllergyProductSpecificMedVocab"),
					new Object[] { allergyDrugSensitivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyDrugSensitivityReactionText(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Reaction Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityReactionText(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_DRUG_SENSITIVITY_REACTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getObservations()->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::AlertObservation) and obs.getObservations()->exists(o : cda::Observation | o.oclIsKindOf(ccd::ReactionObservation) and not o.text.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyDrugSensitivityReactionText(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Reaction Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityReactionText(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_DRUG_SENSITIVITY_REACTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::AlertObservation) and obs.getObservations()->exists(o : cda::Observation | o.oclIsKindOf(ccd::ReactionObservation) and not o.text.oclIsUndefined()))
	 * @param allergyDrugSensitivity The receiving '<em><b>Allergy Drug Sensitivity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyDrugSensitivityReactionText(AllergyDrugSensitivity allergyDrugSensitivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_DRUG_SENSITIVITY_REACTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.ALLERGY_DRUG_SENSITIVITY);
			try {
				VALIDATE_ALLERGY_DRUG_SENSITIVITY_REACTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_DRUG_SENSITIVITY_REACTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_DRUG_SENSITIVITY_REACTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyDrugSensitivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_REACTION_TEXT,
					HITSPPlugin.INSTANCE.getString("AllergyDrugSensitivityReactionText"),
					new Object[] { allergyDrugSensitivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyDrugSensitivityReactionCode(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Reaction Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityReactionCode(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_DRUG_SENSITIVITY_REACTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getObservations()->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::AlertObservation) and obs.getObservations()->exists(o : cda::Observation | o.oclIsKindOf(ccd::ReactionObservation) and not o.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyDrugSensitivityReactionCode(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Reaction Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityReactionCode(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_DRUG_SENSITIVITY_REACTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::AlertObservation) and obs.getObservations()->exists(o : cda::Observation | o.oclIsKindOf(ccd::ReactionObservation) and not o.code.oclIsUndefined()))
	 * @param allergyDrugSensitivity The receiving '<em><b>Allergy Drug Sensitivity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyDrugSensitivityReactionCode(AllergyDrugSensitivity allergyDrugSensitivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_DRUG_SENSITIVITY_REACTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.ALLERGY_DRUG_SENSITIVITY);
			try {
				VALIDATE_ALLERGY_DRUG_SENSITIVITY_REACTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_DRUG_SENSITIVITY_REACTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_DRUG_SENSITIVITY_REACTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyDrugSensitivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_REACTION_CODE,
					HITSPPlugin.INSTANCE.getString("AllergyDrugSensitivityReactionCode"),
					new Object[] { allergyDrugSensitivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyDrugSensitivityReactionCodeVocab(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Reaction Code Vocab</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityReactionCodeVocab(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_DRUG_SENSITIVITY_REACTION_CODE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getObservations()->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::AlertObservation) and obs.getObservations()->exists(o : cda::Observation | o.oclIsKindOf(ccd::ReactionObservation) and not o.code.oclIsUndefined() and o.code.codeSystem = '2.16.840.1.113883.6.96' and (o.code.code = '404684003' or o.code.code = '243796009')))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyDrugSensitivityReactionCodeVocab(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Reaction Code Vocab</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityReactionCodeVocab(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_DRUG_SENSITIVITY_REACTION_CODE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::AlertObservation) and obs.getObservations()->exists(o : cda::Observation | o.oclIsKindOf(ccd::ReactionObservation) and not o.code.oclIsUndefined() and o.code.codeSystem = '2.16.840.1.113883.6.96' and (o.code.code = '404684003' or o.code.code = '243796009')))
	 * @param allergyDrugSensitivity The receiving '<em><b>Allergy Drug Sensitivity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyDrugSensitivityReactionCodeVocab(
			AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_DRUG_SENSITIVITY_REACTION_CODE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.ALLERGY_DRUG_SENSITIVITY);
			try {
				VALIDATE_ALLERGY_DRUG_SENSITIVITY_REACTION_CODE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_DRUG_SENSITIVITY_REACTION_CODE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_DRUG_SENSITIVITY_REACTION_CODE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyDrugSensitivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_REACTION_CODE_VOCAB,
					HITSPPlugin.INSTANCE.getString("AllergyDrugSensitivityReactionCodeVocab"),
					new Object[] { allergyDrugSensitivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyDrugSensitivitySeverityText(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Severity Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivitySeverityText(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_DRUG_SENSITIVITY_SEVERITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getObservations()->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::AlertObservation) and obs.getObservations()->exists(o : cda::Observation | o.oclIsKindOf(ccd::SeverityObservation) and not o.text.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyDrugSensitivitySeverityText(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Severity Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivitySeverityText(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_DRUG_SENSITIVITY_SEVERITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::AlertObservation) and obs.getObservations()->exists(o : cda::Observation | o.oclIsKindOf(ccd::SeverityObservation) and not o.text.oclIsUndefined()))
	 * @param allergyDrugSensitivity The receiving '<em><b>Allergy Drug Sensitivity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyDrugSensitivitySeverityText(AllergyDrugSensitivity allergyDrugSensitivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_DRUG_SENSITIVITY_SEVERITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.ALLERGY_DRUG_SENSITIVITY);
			try {
				VALIDATE_ALLERGY_DRUG_SENSITIVITY_SEVERITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_DRUG_SENSITIVITY_SEVERITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_DRUG_SENSITIVITY_SEVERITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyDrugSensitivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_SEVERITY_TEXT,
					HITSPPlugin.INSTANCE.getString("AllergyDrugSensitivitySeverityText"),
					new Object[] { allergyDrugSensitivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyDrugSensitivitySeverityCode(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Severity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivitySeverityCode(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_DRUG_SENSITIVITY_SEVERITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getObservations()->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::AlertObservation) and obs.getObservations()->exists(o : cda::Observation | o.oclIsKindOf(ccd::SeverityObservation) and not o.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyDrugSensitivitySeverityCode(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Severity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivitySeverityCode(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_DRUG_SENSITIVITY_SEVERITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::AlertObservation) and obs.getObservations()->exists(o : cda::Observation | o.oclIsKindOf(ccd::SeverityObservation) and not o.code.oclIsUndefined()))
	 * @param allergyDrugSensitivity The receiving '<em><b>Allergy Drug Sensitivity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyDrugSensitivitySeverityCode(AllergyDrugSensitivity allergyDrugSensitivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_DRUG_SENSITIVITY_SEVERITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.ALLERGY_DRUG_SENSITIVITY);
			try {
				VALIDATE_ALLERGY_DRUG_SENSITIVITY_SEVERITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_DRUG_SENSITIVITY_SEVERITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_DRUG_SENSITIVITY_SEVERITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyDrugSensitivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_SEVERITY_CODE,
					HITSPPlugin.INSTANCE.getString("AllergyDrugSensitivitySeverityCode"),
					new Object[] { allergyDrugSensitivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyDrugSensitivitySeverityCodeVocab(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Severity Code Vocab</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivitySeverityCodeVocab(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_DRUG_SENSITIVITY_SEVERITY_CODE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getObservations()->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::AlertObservation) and obs.getObservations()->exists(o : cda::Observation | o.oclIsKindOf(ccd::SeverityObservation) and not o.code.oclIsUndefined() and o.code.codeSystem = '2.16.840.1.113883.6.96' and (o.code.code = '255604002' or o.code.code = '371923003' or o.code.code = '6736007' or o.code.code = '371924009' or o.code.code = '24484000' or o.code.code = '399166001')))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyDrugSensitivitySeverityCodeVocab(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Severity Code Vocab</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivitySeverityCodeVocab(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_DRUG_SENSITIVITY_SEVERITY_CODE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::AlertObservation) and obs.getObservations()->exists(o : cda::Observation | o.oclIsKindOf(ccd::SeverityObservation) and not o.code.oclIsUndefined() and o.code.codeSystem = '2.16.840.1.113883.6.96' and (o.code.code = '255604002' or o.code.code = '371923003' or o.code.code = '6736007' or o.code.code = '371924009' or o.code.code = '24484000' or o.code.code = '399166001')))
	 * @param allergyDrugSensitivity The receiving '<em><b>Allergy Drug Sensitivity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyDrugSensitivitySeverityCodeVocab(
			AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_DRUG_SENSITIVITY_SEVERITY_CODE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.ALLERGY_DRUG_SENSITIVITY);
			try {
				VALIDATE_ALLERGY_DRUG_SENSITIVITY_SEVERITY_CODE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_DRUG_SENSITIVITY_SEVERITY_CODE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_DRUG_SENSITIVITY_SEVERITY_CODE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyDrugSensitivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_SEVERITY_CODE_VOCAB,
					HITSPPlugin.INSTANCE.getString("AllergyDrugSensitivitySeverityCodeVocab"),
					new Object[] { allergyDrugSensitivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyDrugSensitivityTemplateId(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityTemplateId(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_DRUG_SENSITIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.6')";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyDrugSensitivityTemplateId(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyDrugSensitivityTemplateId(AllergyDrugSensitivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_DRUG_SENSITIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.6')
	 * @param allergyDrugSensitivity The receiving '<em><b>Allergy Drug Sensitivity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyDrugSensitivityTemplateId(AllergyDrugSensitivity allergyDrugSensitivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_DRUG_SENSITIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.ALLERGY_DRUG_SENSITIVITY);
			try {
				VALIDATE_ALLERGY_DRUG_SENSITIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_DRUG_SENSITIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_DRUG_SENSITIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyDrugSensitivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_TEMPLATE_ID,
					HITSPPlugin.INSTANCE.getString("AllergyDrugSensitivityTemplateId"),
					new Object[] { allergyDrugSensitivity }));
			}
			return false;
		}
		return true;
	}

} // AllergyDrugSensitivityOperations
