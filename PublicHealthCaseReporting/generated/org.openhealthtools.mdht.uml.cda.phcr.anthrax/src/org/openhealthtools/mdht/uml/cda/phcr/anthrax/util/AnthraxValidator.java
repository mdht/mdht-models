/*******************************************************************************
 * Copyright (c) 2012, Public Health Data Standards Consortium (PHDSC)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     PHDSC - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.phcr.anthrax.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.*;

import org.openhealthtools.mdht.uml.cda.phcr.util.PhcrValidator;

import org.openhealthtools.mdht.uml.cda.util.CDAValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPackage
 * @generated
 */
public class AnthraxValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final AnthraxValidator INSTANCE = new AnthraxValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.openhealthtools.mdht.uml.cda.phcr.anthrax";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Anthrax Case Report Title' of 'Case Report'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ANTHRAX_CASE_REPORT__ANTHRAX_CASE_REPORT_TITLE = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Anthrax Case Report Anthrax Phcr Clinical Information Section' of 'Case Report'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ANTHRAX_CASE_REPORT__ANTHRAX_CASE_REPORT_ANTHRAX_PHCR_CLINICAL_INFORMATION_SECTION = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Anthrax Case Report Anthrax Phcr Relevant Dx Tests Section' of 'Case Report'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ANTHRAX_CASE_REPORT__ANTHRAX_CASE_REPORT_ANTHRAX_PHCR_RELEVANT_DX_TESTS_SECTION = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Anthrax Case Report Anthrax Phcr Social History Section' of 'Case Report'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ANTHRAX_CASE_REPORT__ANTHRAX_CASE_REPORT_ANTHRAX_PHCR_SOCIAL_HISTORY_SECTION = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Anthrax Case Report Anthrax Phcr Treatment Information Section' of 'Case Report'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ANTHRAX_CASE_REPORT__ANTHRAX_CASE_REPORT_ANTHRAX_PHCR_TREATMENT_INFORMATION_SECTION = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Public Health Case Report Template Id' of 'Case Report'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ANTHRAX_CASE_REPORT__PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Anthrax Phcr Social History Section Anthrax Possible Expossure Location And Type Act' of 'Phcr Social History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ANTHRAX_PHCR_SOCIAL_HISTORY_SECTION__ANTHRAX_PHCR_SOCIAL_HISTORY_SECTION_ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Anthrax Phcr Clinical Information Section Anthrax Case Observation' of 'Phcr Clinical Information Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ANTHRAX_PHCR_CLINICAL_INFORMATION_SECTION__ANTHRAX_PHCR_CLINICAL_INFORMATION_SECTION_ANTHRAX_CASE_OBSERVATION = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Clinical Information Section Template Id' of 'Phcr Clinical Information Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ANTHRAX_PHCR_CLINICAL_INFORMATION_SECTION__PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Anthrax Case Observation Anthrax Signs And Symptoms Observation' of 'Case Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ANTHRAX_CASE_OBSERVATION__ANTHRAX_CASE_OBSERVATION_ANTHRAX_SIGNS_AND_SYMPTOMS_OBSERVATION = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Observation Template Id' of 'Case Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ANTHRAX_CASE_OBSERVATION__PROBLEM_OBSERVATION_TEMPLATE_ID = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Case Observation Value' of 'Case Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ANTHRAX_CASE_OBSERVATION__CASE_OBSERVATION_VALUE = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Signs And Symptoms Observation Template Id' of 'Signs And Symptoms Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ANTHRAX_SIGNS_AND_SYMPTOMS_OBSERVATION__SIGNS_AND_SYMPTOMS_OBSERVATION_TEMPLATE_ID = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Anthrax Phcr Treatment Information Section Anthrax Therapeutic Regimen Act' of 'Phcr Treatment Information Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ANTHRAX_PHCR_TREATMENT_INFORMATION_SECTION__ANTHRAX_PHCR_TREATMENT_INFORMATION_SECTION_ANTHRAX_THERAPEUTIC_REGIMEN_ACT = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Anthrax Phcr Relevant Dx Tests Section Anthrax Result Observation' of 'Phcr Relevant Dx Tests Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ANTHRAX_PHCR_RELEVANT_DX_TESTS_SECTION__ANTHRAX_PHCR_RELEVANT_DX_TESTS_SECTION_ANTHRAX_RESULT_OBSERVATION = 28;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Anthrax Phcr Relevant Dx Tests Section Anthrax Result Organizer' of 'Phcr Relevant Dx Tests Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ANTHRAX_PHCR_RELEVANT_DX_TESTS_SECTION__ANTHRAX_PHCR_RELEVANT_DX_TESTS_SECTION_ANTHRAX_RESULT_ORGANIZER = 27;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Results Section Template Id' of 'Phcr Relevant Dx Tests Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ANTHRAX_PHCR_RELEVANT_DX_TESTS_SECTION__RESULTS_SECTION_TEMPLATE_ID = 29;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Anthrax Result Organizer Anthrax Result Observation' of 'Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ANTHRAX_RESULT_ORGANIZER__ANTHRAX_RESULT_ORGANIZER_ANTHRAX_RESULT_OBSERVATION = 30;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Template Id' of 'Result Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ANTHRAX_RESULT_OBSERVATION__RESULT_OBSERVATION_TEMPLATE_ID = 33;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Code' of 'Result Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ANTHRAX_RESULT_OBSERVATION__RESULT_OBSERVATION_CODE = 34;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Template Id' of 'Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ANTHRAX_RESULT_ORGANIZER__RESULT_ORGANIZER_TEMPLATE_ID = 31;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Code' of 'Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ANTHRAX_RESULT_ORGANIZER__RESULT_ORGANIZER_CODE = 32;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Social History Section Template Id' of 'Phcr Social History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ANTHRAX_PHCR_SOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_TEMPLATE_ID = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Anthrax Possible Expossure Location And Type Act Template Id' of 'Possible Expossure Location And Type Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT__ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT_TEMPLATE_ID = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Anthrax Possible Expossure Location And Type Act Class Code' of 'Possible Expossure Location And Type Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT__ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT_CLASS_CODE = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Anthrax Possible Expossure Location And Type Act Mood Code' of 'Possible Expossure Location And Type Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT__ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT_MOOD_CODE = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Anthrax Possible Expossure Location And Type Act Code' of 'Possible Expossure Location And Type Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT__ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT_CODE = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Anthrax Possible Expossure Location And Type Act Status Code' of 'Possible Expossure Location And Type Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT__ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT_STATUS_CODE = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Treatment Information Section Template Id' of 'Phcr Treatment Information Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ANTHRAX_PHCR_TREATMENT_INFORMATION_SECTION__PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Anthrax Therapeutic Regimen Act Anthrax Treatment Given Substance Administration' of 'Therapeutic Regimen Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ANTHRAX_THERAPEUTIC_REGIMEN_ACT__ANTHRAX_THERAPEUTIC_REGIMEN_ACT_ANTHRAX_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Anthrax Therapeutic Regimen Act Anthrax Treatment Not Given Substance Administration' of 'Therapeutic Regimen Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ANTHRAX_THERAPEUTIC_REGIMEN_ACT__ANTHRAX_THERAPEUTIC_REGIMEN_ACT_ANTHRAX_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION = 23;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Therapeutic Regimen Act Template Id' of 'Therapeutic Regimen Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ANTHRAX_THERAPEUTIC_REGIMEN_ACT__THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID = 24;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Treatment Given Substance Administration Template Id' of 'Treatment Given Substance Administration'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ANTHRAX_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID = 25;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Treatment Not Given Substance Administration Template Id' of 'Treatment Not Given Substance Administration'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ANTHRAX_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID = 26;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 34;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CDAValidator cdaValidator;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhcrValidator phcrValidator;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CCDValidator ccdValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnthraxValidator() {
		super();
		cdaValidator = CDAValidator.INSTANCE;
		phcrValidator = PhcrValidator.INSTANCE;
		ccdValidator = CCDValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return AnthraxPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case AnthraxPackage.ANTHRAX_CASE_REPORT:
				return validateAnthraxCaseReport((AnthraxCaseReport)value, diagnostics, context);
			case AnthraxPackage.ANTHRAX_PHCR_SOCIAL_HISTORY_SECTION:
				return validateAnthraxPhcrSocialHistorySection((AnthraxPhcrSocialHistorySection)value, diagnostics, context);
			case AnthraxPackage.ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT:
				return validateAnthraxPossibleExpossureLocationAndTypeAct((AnthraxPossibleExpossureLocationAndTypeAct)value, diagnostics, context);
			case AnthraxPackage.ANTHRAX_PHCR_CLINICAL_INFORMATION_SECTION:
				return validateAnthraxPhcrClinicalInformationSection((AnthraxPhcrClinicalInformationSection)value, diagnostics, context);
			case AnthraxPackage.ANTHRAX_CASE_OBSERVATION:
				return validateAnthraxCaseObservation((AnthraxCaseObservation)value, diagnostics, context);
			case AnthraxPackage.ANTHRAX_SIGNS_AND_SYMPTOMS_OBSERVATION:
				return validateAnthraxSignsAndSymptomsObservation((AnthraxSignsAndSymptomsObservation)value, diagnostics, context);
			case AnthraxPackage.ANTHRAX_PHCR_TREATMENT_INFORMATION_SECTION:
				return validateAnthraxPhcrTreatmentInformationSection((AnthraxPhcrTreatmentInformationSection)value, diagnostics, context);
			case AnthraxPackage.ANTHRAX_THERAPEUTIC_REGIMEN_ACT:
				return validateAnthraxTherapeuticRegimenAct((AnthraxTherapeuticRegimenAct)value, diagnostics, context);
			case AnthraxPackage.ANTHRAX_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION:
				return validateAnthraxTreatmentGivenSubstanceAdministration((AnthraxTreatmentGivenSubstanceAdministration)value, diagnostics, context);
			case AnthraxPackage.ANTHRAX_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION:
				return validateAnthraxTreatmentNotGivenSubstanceAdministration((AnthraxTreatmentNotGivenSubstanceAdministration)value, diagnostics, context);
			case AnthraxPackage.ANTHRAX_PHCR_RELEVANT_DX_TESTS_SECTION:
				return validateAnthraxPhcrRelevantDxTestsSection((AnthraxPhcrRelevantDxTestsSection)value, diagnostics, context);
			case AnthraxPackage.ANTHRAX_RESULT_ORGANIZER:
				return validateAnthraxResultOrganizer((AnthraxResultOrganizer)value, diagnostics, context);
			case AnthraxPackage.ANTHRAX_RESULT_OBSERVATION:
				return validateAnthraxResultObservation((AnthraxResultObservation)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthraxCaseReport(AnthraxCaseReport anthraxCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(anthraxCaseReport, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(anthraxCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(anthraxCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(anthraxCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(anthraxCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(anthraxCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(anthraxCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(anthraxCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateClassCode(anthraxCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateMoodCode(anthraxCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRRecordTarget(anthraxCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRRecordTargetPatientRole(anthraxCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRRecordTargetPatientRoleId(anthraxCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthor(anthraxCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorTiime(anthraxCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthor(anthraxCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorId(anthraxCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorAddr(anthraxCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorTelecom(anthraxCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorAssignedPersonName(anthraxCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticator(anthraxCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorTime(anthraxCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntity(anthraxCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityId(anthraxCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityAddr(anthraxCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityAssignedPersonName(anthraxCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnthraxCaseReport_validatePublicHealthCaseReportTemplateId(anthraxCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportCodeP(anthraxCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportCode(anthraxCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrSocialHistorySection(anthraxCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrClinicalInformationSection(anthraxCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrTreatmentInformationSection(anthraxCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrEncountersSection(anthraxCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrRelevantDxTestsSection(anthraxCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportImmunizationsSection(anthraxCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnthraxCaseReport_validateAnthraxCaseReportTitle(anthraxCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnthraxCaseReport_validateAnthraxCaseReportAnthraxPhcrSocialHistorySection(anthraxCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnthraxCaseReport_validateAnthraxCaseReportAnthraxPhcrClinicalInformationSection(anthraxCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnthraxCaseReport_validateAnthraxCaseReportAnthraxPhcrTreatmentInformationSection(anthraxCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnthraxCaseReport_validateAnthraxCaseReportAnthraxPhcrRelevantDxTestsSection(anthraxCaseReport, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateAnthraxCaseReportTitle constraint of '<em>Case Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthraxCaseReport_validateAnthraxCaseReportTitle(AnthraxCaseReport anthraxCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return anthraxCaseReport.validateAnthraxCaseReportTitle(diagnostics, context);
	}

	/**
	 * Validates the validateAnthraxCaseReportAnthraxPhcrClinicalInformationSection constraint of '<em>Case Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthraxCaseReport_validateAnthraxCaseReportAnthraxPhcrClinicalInformationSection(AnthraxCaseReport anthraxCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return anthraxCaseReport.validateAnthraxCaseReportAnthraxPhcrClinicalInformationSection(diagnostics, context);
	}

	/**
	 * Validates the validateAnthraxCaseReportAnthraxPhcrRelevantDxTestsSection constraint of '<em>Case Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthraxCaseReport_validateAnthraxCaseReportAnthraxPhcrRelevantDxTestsSection(AnthraxCaseReport anthraxCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return anthraxCaseReport.validateAnthraxCaseReportAnthraxPhcrRelevantDxTestsSection(diagnostics, context);
	}

	/**
	 * Validates the validateAnthraxCaseReportAnthraxPhcrSocialHistorySection constraint of '<em>Case Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthraxCaseReport_validateAnthraxCaseReportAnthraxPhcrSocialHistorySection(AnthraxCaseReport anthraxCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return anthraxCaseReport.validateAnthraxCaseReportAnthraxPhcrSocialHistorySection(diagnostics, context);
	}

	/**
	 * Validates the validateAnthraxCaseReportAnthraxPhcrTreatmentInformationSection constraint of '<em>Case Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthraxCaseReport_validateAnthraxCaseReportAnthraxPhcrTreatmentInformationSection(AnthraxCaseReport anthraxCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return anthraxCaseReport.validateAnthraxCaseReportAnthraxPhcrTreatmentInformationSection(diagnostics, context);
	}

	/**
	 * Validates the validatePublicHealthCaseReportTemplateId constraint of '<em>Case Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthraxCaseReport_validatePublicHealthCaseReportTemplateId(AnthraxCaseReport anthraxCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return anthraxCaseReport.validatePublicHealthCaseReportTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthraxPhcrClinicalInformationSection(AnthraxPhcrClinicalInformationSection anthraxPhcrClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(anthraxPhcrClinicalInformationSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(anthraxPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(anthraxPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(anthraxPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(anthraxPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(anthraxPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(anthraxPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(anthraxPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(anthraxPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(anthraxPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPatientConditionConstraint(anthraxPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnthraxPhcrClinicalInformationSection_validatePhcrClinicalInformationSectionTemplateId(anthraxPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionCode(anthraxPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionCodeP(anthraxPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionTitle(anthraxPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionText(anthraxPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionCaseObservation(anthraxPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPatientConditionAliveObservation(anthraxPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPatientConditionDeceasedObservation(anthraxPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPhcrRelevantMedicalConditionHistoryObservation(anthraxPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnthraxPhcrClinicalInformationSection_validateAnthraxPhcrClinicalInformationSectionAnthraxCaseObservation(anthraxPhcrClinicalInformationSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateAnthraxPhcrClinicalInformationSectionAnthraxCaseObservation constraint of '<em>Phcr Clinical Information Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthraxPhcrClinicalInformationSection_validateAnthraxPhcrClinicalInformationSectionAnthraxCaseObservation(AnthraxPhcrClinicalInformationSection anthraxPhcrClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return anthraxPhcrClinicalInformationSection.validateAnthraxPhcrClinicalInformationSectionAnthraxCaseObservation(diagnostics, context);
	}

	/**
	 * Validates the validatePhcrClinicalInformationSectionTemplateId constraint of '<em>Phcr Clinical Information Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthraxPhcrClinicalInformationSection_validatePhcrClinicalInformationSectionTemplateId(AnthraxPhcrClinicalInformationSection anthraxPhcrClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return anthraxPhcrClinicalInformationSection.validatePhcrClinicalInformationSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthraxCaseObservation(AnthraxCaseObservation anthraxCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(anthraxCaseObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(anthraxCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(anthraxCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(anthraxCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(anthraxCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(anthraxCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(anthraxCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(anthraxCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationInformationSource(anthraxCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationContainsPatientAwareness(anthraxCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnthraxCaseObservation_validateProblemObservationTemplateId(anthraxCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationMoodCode(anthraxCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateProblemObservationStatusCode(anthraxCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationEffectiveTime(anthraxCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationProblemStatus(anthraxCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationProblemHealthStatus(anthraxCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationAgeObservation(anthraxCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationEffectiveTimeLow(anthraxCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationAuthor(anthraxCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationAuthorAssignedAuthor(anthraxCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationClassCode(anthraxCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationMoodCode(anthraxCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationId(anthraxCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationCode(anthraxCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateProblemObservationCode(anthraxCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationStatusCode(anthraxCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationEffectiveTime(anthraxCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnthraxCaseObservation_validateCaseObservationValue(anthraxCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationProblemStatusObservation(anthraxCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationSignsAndSymptomsObservation(anthraxCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnthraxCaseObservation_validateAnthraxCaseObservationAnthraxSignsAndSymptomsObservation(anthraxCaseObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateAnthraxCaseObservationAnthraxSignsAndSymptomsObservation constraint of '<em>Case Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthraxCaseObservation_validateAnthraxCaseObservationAnthraxSignsAndSymptomsObservation(AnthraxCaseObservation anthraxCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return anthraxCaseObservation.validateAnthraxCaseObservationAnthraxSignsAndSymptomsObservation(diagnostics, context);
	}

	/**
	 * Validates the validateProblemObservationTemplateId constraint of '<em>Case Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthraxCaseObservation_validateProblemObservationTemplateId(AnthraxCaseObservation anthraxCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return anthraxCaseObservation.validateProblemObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateCaseObservationValue constraint of '<em>Case Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthraxCaseObservation_validateCaseObservationValue(AnthraxCaseObservation anthraxCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return anthraxCaseObservation.validateCaseObservationValue(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthraxSignsAndSymptomsObservation(AnthraxSignsAndSymptomsObservation anthraxSignsAndSymptomsObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(anthraxSignsAndSymptomsObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(anthraxSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(anthraxSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(anthraxSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(anthraxSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(anthraxSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(anthraxSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(anthraxSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnthraxSignsAndSymptomsObservation_validateSignsAndSymptomsObservationTemplateId(anthraxSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationClassCode(anthraxSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationMoodCode(anthraxSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationNegationInd(anthraxSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationCodeP(anthraxSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationCode(anthraxSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationStatusCode(anthraxSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationStatusCodeP(anthraxSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationEffectiveTime(anthraxSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationValue(anthraxSignsAndSymptomsObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateSignsAndSymptomsObservationTemplateId constraint of '<em>Signs And Symptoms Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthraxSignsAndSymptomsObservation_validateSignsAndSymptomsObservationTemplateId(AnthraxSignsAndSymptomsObservation anthraxSignsAndSymptomsObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return anthraxSignsAndSymptomsObservation.validateSignsAndSymptomsObservationTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthraxPhcrRelevantDxTestsSection(AnthraxPhcrRelevantDxTestsSection anthraxPhcrRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(anthraxPhcrRelevantDxTestsSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(anthraxPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(anthraxPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(anthraxPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(anthraxPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(anthraxPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(anthraxPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(anthraxPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(anthraxPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(anthraxPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnthraxPhcrRelevantDxTestsSection_validateResultsSectionTemplateId(anthraxPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validateResultsSectionCode(anthraxPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionTitle(anthraxPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionText(anthraxPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionResultOrganizer(anthraxPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionCode(anthraxPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionTitle(anthraxPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionText(anthraxPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionResultOrganizer(anthraxPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionResultObservation(anthraxPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionImagingObservation(anthraxPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnthraxPhcrRelevantDxTestsSection_validateAnthraxPhcrRelevantDxTestsSectionAnthraxResultOrganizer(anthraxPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnthraxPhcrRelevantDxTestsSection_validateAnthraxPhcrRelevantDxTestsSectionAnthraxResultObservation(anthraxPhcrRelevantDxTestsSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateAnthraxPhcrRelevantDxTestsSectionAnthraxResultObservation constraint of '<em>Phcr Relevant Dx Tests Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthraxPhcrRelevantDxTestsSection_validateAnthraxPhcrRelevantDxTestsSectionAnthraxResultObservation(AnthraxPhcrRelevantDxTestsSection anthraxPhcrRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return anthraxPhcrRelevantDxTestsSection.validateAnthraxPhcrRelevantDxTestsSectionAnthraxResultObservation(diagnostics, context);
	}

	/**
	 * Validates the validateAnthraxPhcrRelevantDxTestsSectionAnthraxResultOrganizer constraint of '<em>Phcr Relevant Dx Tests Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthraxPhcrRelevantDxTestsSection_validateAnthraxPhcrRelevantDxTestsSectionAnthraxResultOrganizer(AnthraxPhcrRelevantDxTestsSection anthraxPhcrRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return anthraxPhcrRelevantDxTestsSection.validateAnthraxPhcrRelevantDxTestsSectionAnthraxResultOrganizer(diagnostics, context);
	}

	/**
	 * Validates the validateResultsSectionTemplateId constraint of '<em>Phcr Relevant Dx Tests Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthraxPhcrRelevantDxTestsSection_validateResultsSectionTemplateId(AnthraxPhcrRelevantDxTestsSection anthraxPhcrRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return anthraxPhcrRelevantDxTestsSection.validateResultsSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthraxResultObservation(AnthraxResultObservation anthraxResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(anthraxResultObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(anthraxResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(anthraxResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(anthraxResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(anthraxResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(anthraxResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(anthraxResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(anthraxResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationCodeValue(anthraxResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationReferenceRangeRequired(anthraxResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationNoObservationRangeCode(anthraxResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationInformationSource(anthraxResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnthraxResultObservation_validateResultObservationTemplateId(anthraxResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationMoodCode(anthraxResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationId(anthraxResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationEffectiveTime(anthraxResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultObservation_validateResultObservationStatusCode(anthraxResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnthraxResultObservation_validateResultObservationCode(anthraxResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationMethodCode(anthraxResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationInterpretationCode(anthraxResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationValue(anthraxResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultObservation_validatePHCRResultObservationClassCode(anthraxResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultObservation_validatePHCRResultObservationStatusCode(anthraxResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultObservation_validatePHCRResultObservationSpecimenCollectionProcedure(anthraxResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultObservation_validatePHCRResultObservationSusceptibilityResult(anthraxResultObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateResultObservationTemplateId constraint of '<em>Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthraxResultObservation_validateResultObservationTemplateId(AnthraxResultObservation anthraxResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return anthraxResultObservation.validateResultObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateResultObservationCode constraint of '<em>Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthraxResultObservation_validateResultObservationCode(AnthraxResultObservation anthraxResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return anthraxResultObservation.validateResultObservationCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthraxResultOrganizer(AnthraxResultOrganizer anthraxResultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(anthraxResultOrganizer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(anthraxResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(anthraxResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(anthraxResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(anthraxResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(anthraxResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(anthraxResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(anthraxResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerCodeValue(anthraxResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerComponentElement(anthraxResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerInformationSource(anthraxResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnthraxResultOrganizer_validateResultOrganizerTemplateId(anthraxResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerMoodCode(anthraxResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerId(anthraxResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnthraxResultOrganizer_validateResultOrganizerCode(anthraxResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validateResultOrganizerStatusCode(anthraxResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerResultObservation(anthraxResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerSpecimen(anthraxResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerClassCode(anthraxResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerMoodCode(anthraxResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerId(anthraxResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerCode(anthraxResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerStatusCode(anthraxResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerEffectiveTime(anthraxResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerResultObservation(anthraxResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerSpecimenCollectionProcedure(anthraxResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnthraxResultOrganizer_validateAnthraxResultOrganizerAnthraxResultObservation(anthraxResultOrganizer, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateAnthraxResultOrganizerAnthraxResultObservation constraint of '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthraxResultOrganizer_validateAnthraxResultOrganizerAnthraxResultObservation(AnthraxResultOrganizer anthraxResultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return anthraxResultOrganizer.validateAnthraxResultOrganizerAnthraxResultObservation(diagnostics, context);
	}

	/**
	 * Validates the validateResultOrganizerTemplateId constraint of '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthraxResultOrganizer_validateResultOrganizerTemplateId(AnthraxResultOrganizer anthraxResultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return anthraxResultOrganizer.validateResultOrganizerTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateResultOrganizerCode constraint of '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthraxResultOrganizer_validateResultOrganizerCode(AnthraxResultOrganizer anthraxResultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return anthraxResultOrganizer.validateResultOrganizerCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthraxPhcrSocialHistorySection(AnthraxPhcrSocialHistorySection anthraxPhcrSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(anthraxPhcrSocialHistorySection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(anthraxPhcrSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(anthraxPhcrSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(anthraxPhcrSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(anthraxPhcrSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(anthraxPhcrSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(anthraxPhcrSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(anthraxPhcrSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(anthraxPhcrSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(anthraxPhcrSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionMaritalStatus(anthraxPhcrSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionReligiousAffiliation(anthraxPhcrSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionPatientRace(anthraxPhcrSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionPatientRaceCodeSystem(anthraxPhcrSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionPatientEthnicity(anthraxPhcrSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionPatientEthnicityCodeSystem(anthraxPhcrSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnthraxPhcrSocialHistorySection_validateSocialHistorySectionTemplateId(anthraxPhcrSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validateSocialHistorySectionCode(anthraxPhcrSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionTitle(anthraxPhcrSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionText(anthraxPhcrSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionSocialHistoryObservation(anthraxPhcrSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionCode(anthraxPhcrSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionTitle(anthraxPhcrSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionText(anthraxPhcrSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionGeotemporalHistoryObservation(anthraxPhcrSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionMostRecentTimeArrivedInUSAObservation(anthraxPhcrSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionRaceObservation(anthraxPhcrSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionOccupationObservation(anthraxPhcrSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionPregnancyObservation(anthraxPhcrSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnthraxPhcrSocialHistorySection_validateAnthraxPhcrSocialHistorySectionAnthraxPossibleExpossureLocationAndTypeAct(anthraxPhcrSocialHistorySection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateAnthraxPhcrSocialHistorySectionAnthraxPossibleExpossureLocationAndTypeAct constraint of '<em>Phcr Social History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthraxPhcrSocialHistorySection_validateAnthraxPhcrSocialHistorySectionAnthraxPossibleExpossureLocationAndTypeAct(AnthraxPhcrSocialHistorySection anthraxPhcrSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return anthraxPhcrSocialHistorySection.validateAnthraxPhcrSocialHistorySectionAnthraxPossibleExpossureLocationAndTypeAct(diagnostics, context);
	}

	/**
	 * Validates the validateSocialHistorySectionTemplateId constraint of '<em>Phcr Social History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthraxPhcrSocialHistorySection_validateSocialHistorySectionTemplateId(AnthraxPhcrSocialHistorySection anthraxPhcrSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return anthraxPhcrSocialHistorySection.validateSocialHistorySectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthraxPossibleExpossureLocationAndTypeAct(AnthraxPossibleExpossureLocationAndTypeAct anthraxPossibleExpossureLocationAndTypeAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(anthraxPossibleExpossureLocationAndTypeAct, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(anthraxPossibleExpossureLocationAndTypeAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(anthraxPossibleExpossureLocationAndTypeAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(anthraxPossibleExpossureLocationAndTypeAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(anthraxPossibleExpossureLocationAndTypeAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(anthraxPossibleExpossureLocationAndTypeAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(anthraxPossibleExpossureLocationAndTypeAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(anthraxPossibleExpossureLocationAndTypeAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnthraxPossibleExpossureLocationAndTypeAct_validateAnthraxPossibleExpossureLocationAndTypeActTemplateId(anthraxPossibleExpossureLocationAndTypeAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnthraxPossibleExpossureLocationAndTypeAct_validateAnthraxPossibleExpossureLocationAndTypeActClassCode(anthraxPossibleExpossureLocationAndTypeAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnthraxPossibleExpossureLocationAndTypeAct_validateAnthraxPossibleExpossureLocationAndTypeActMoodCode(anthraxPossibleExpossureLocationAndTypeAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnthraxPossibleExpossureLocationAndTypeAct_validateAnthraxPossibleExpossureLocationAndTypeActCode(anthraxPossibleExpossureLocationAndTypeAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnthraxPossibleExpossureLocationAndTypeAct_validateAnthraxPossibleExpossureLocationAndTypeActStatusCode(anthraxPossibleExpossureLocationAndTypeAct, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateAnthraxPossibleExpossureLocationAndTypeActTemplateId constraint of '<em>Possible Expossure Location And Type Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthraxPossibleExpossureLocationAndTypeAct_validateAnthraxPossibleExpossureLocationAndTypeActTemplateId(AnthraxPossibleExpossureLocationAndTypeAct anthraxPossibleExpossureLocationAndTypeAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return anthraxPossibleExpossureLocationAndTypeAct.validateAnthraxPossibleExpossureLocationAndTypeActTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateAnthraxPossibleExpossureLocationAndTypeActClassCode constraint of '<em>Possible Expossure Location And Type Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthraxPossibleExpossureLocationAndTypeAct_validateAnthraxPossibleExpossureLocationAndTypeActClassCode(AnthraxPossibleExpossureLocationAndTypeAct anthraxPossibleExpossureLocationAndTypeAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return anthraxPossibleExpossureLocationAndTypeAct.validateAnthraxPossibleExpossureLocationAndTypeActClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateAnthraxPossibleExpossureLocationAndTypeActMoodCode constraint of '<em>Possible Expossure Location And Type Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthraxPossibleExpossureLocationAndTypeAct_validateAnthraxPossibleExpossureLocationAndTypeActMoodCode(AnthraxPossibleExpossureLocationAndTypeAct anthraxPossibleExpossureLocationAndTypeAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return anthraxPossibleExpossureLocationAndTypeAct.validateAnthraxPossibleExpossureLocationAndTypeActMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateAnthraxPossibleExpossureLocationAndTypeActCode constraint of '<em>Possible Expossure Location And Type Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthraxPossibleExpossureLocationAndTypeAct_validateAnthraxPossibleExpossureLocationAndTypeActCode(AnthraxPossibleExpossureLocationAndTypeAct anthraxPossibleExpossureLocationAndTypeAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return anthraxPossibleExpossureLocationAndTypeAct.validateAnthraxPossibleExpossureLocationAndTypeActCode(diagnostics, context);
	}

	/**
	 * Validates the validateAnthraxPossibleExpossureLocationAndTypeActStatusCode constraint of '<em>Possible Expossure Location And Type Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthraxPossibleExpossureLocationAndTypeAct_validateAnthraxPossibleExpossureLocationAndTypeActStatusCode(AnthraxPossibleExpossureLocationAndTypeAct anthraxPossibleExpossureLocationAndTypeAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return anthraxPossibleExpossureLocationAndTypeAct.validateAnthraxPossibleExpossureLocationAndTypeActStatusCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthraxPhcrTreatmentInformationSection(AnthraxPhcrTreatmentInformationSection anthraxPhcrTreatmentInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(anthraxPhcrTreatmentInformationSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(anthraxPhcrTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(anthraxPhcrTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(anthraxPhcrTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(anthraxPhcrTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(anthraxPhcrTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(anthraxPhcrTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(anthraxPhcrTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(anthraxPhcrTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(anthraxPhcrTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnthraxPhcrTreatmentInformationSection_validatePhcrTreatmentInformationSectionTemplateId(anthraxPhcrTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrTreatmentInformationSection_validatePhcrTreatmentInformationSectionCode(anthraxPhcrTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrTreatmentInformationSection_validatePhcrTreatmentInformationSectionCodeP(anthraxPhcrTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrTreatmentInformationSection_validatePhcrTreatmentInformationSectionTitle(anthraxPhcrTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrTreatmentInformationSection_validatePhcrTreatmentInformationSectionText(anthraxPhcrTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrTreatmentInformationSection_validatePhcrTreatmentInformationSectionTherapeuticRegimenAct(anthraxPhcrTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnthraxPhcrTreatmentInformationSection_validateAnthraxPhcrTreatmentInformationSectionAnthraxTherapeuticRegimenAct(anthraxPhcrTreatmentInformationSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateAnthraxPhcrTreatmentInformationSectionAnthraxTherapeuticRegimenAct constraint of '<em>Phcr Treatment Information Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthraxPhcrTreatmentInformationSection_validateAnthraxPhcrTreatmentInformationSectionAnthraxTherapeuticRegimenAct(AnthraxPhcrTreatmentInformationSection anthraxPhcrTreatmentInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return anthraxPhcrTreatmentInformationSection.validateAnthraxPhcrTreatmentInformationSectionAnthraxTherapeuticRegimenAct(diagnostics, context);
	}

	/**
	 * Validates the validatePhcrTreatmentInformationSectionTemplateId constraint of '<em>Phcr Treatment Information Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthraxPhcrTreatmentInformationSection_validatePhcrTreatmentInformationSectionTemplateId(AnthraxPhcrTreatmentInformationSection anthraxPhcrTreatmentInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return anthraxPhcrTreatmentInformationSection.validatePhcrTreatmentInformationSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthraxTherapeuticRegimenAct(AnthraxTherapeuticRegimenAct anthraxTherapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(anthraxTherapeuticRegimenAct, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(anthraxTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(anthraxTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(anthraxTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(anthraxTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(anthraxTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(anthraxTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(anthraxTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnthraxTherapeuticRegimenAct_validateTherapeuticRegimenActTemplateId(anthraxTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActClassCode(anthraxTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActMoodCode(anthraxTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActNegationInd(anthraxTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActCodeP(anthraxTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActCode(anthraxTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActStatusCode(anthraxTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActStatusCodeP(anthraxTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActTreatmentGivenSubstanceAdministration(anthraxTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActTreatmentNotGivenSubstanceAdministration(anthraxTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnthraxTherapeuticRegimenAct_validateAnthraxTherapeuticRegimenActAnthraxTreatmentGivenSubstanceAdministration(anthraxTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnthraxTherapeuticRegimenAct_validateAnthraxTherapeuticRegimenActAnthraxTreatmentNotGivenSubstanceAdministration(anthraxTherapeuticRegimenAct, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateAnthraxTherapeuticRegimenActAnthraxTreatmentGivenSubstanceAdministration constraint of '<em>Therapeutic Regimen Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthraxTherapeuticRegimenAct_validateAnthraxTherapeuticRegimenActAnthraxTreatmentGivenSubstanceAdministration(AnthraxTherapeuticRegimenAct anthraxTherapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return anthraxTherapeuticRegimenAct.validateAnthraxTherapeuticRegimenActAnthraxTreatmentGivenSubstanceAdministration(diagnostics, context);
	}

	/**
	 * Validates the validateAnthraxTherapeuticRegimenActAnthraxTreatmentNotGivenSubstanceAdministration constraint of '<em>Therapeutic Regimen Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthraxTherapeuticRegimenAct_validateAnthraxTherapeuticRegimenActAnthraxTreatmentNotGivenSubstanceAdministration(AnthraxTherapeuticRegimenAct anthraxTherapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return anthraxTherapeuticRegimenAct.validateAnthraxTherapeuticRegimenActAnthraxTreatmentNotGivenSubstanceAdministration(diagnostics, context);
	}

	/**
	 * Validates the validateTherapeuticRegimenActTemplateId constraint of '<em>Therapeutic Regimen Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthraxTherapeuticRegimenAct_validateTherapeuticRegimenActTemplateId(AnthraxTherapeuticRegimenAct anthraxTherapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return anthraxTherapeuticRegimenAct.validateTherapeuticRegimenActTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthraxTreatmentGivenSubstanceAdministration(AnthraxTreatmentGivenSubstanceAdministration anthraxTreatmentGivenSubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(anthraxTreatmentGivenSubstanceAdministration, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(anthraxTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(anthraxTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(anthraxTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(anthraxTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(anthraxTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(anthraxTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(anthraxTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSubstanceAdministration_validateClassCode(anthraxTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationTreatmentGivenNegationInd(anthraxTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnthraxTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationTemplateId(anthraxTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationClassCode(anthraxTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationMoodCode(anthraxTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationNegationInd(anthraxTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationStatusCode(anthraxTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationEffectiveTime(anthraxTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationRouteCodeP(anthraxTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationRouteCode(anthraxTreatmentGivenSubstanceAdministration, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateTreatmentGivenSubstanceAdministrationTemplateId constraint of '<em>Treatment Given Substance Administration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthraxTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationTemplateId(AnthraxTreatmentGivenSubstanceAdministration anthraxTreatmentGivenSubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return anthraxTreatmentGivenSubstanceAdministration.validateTreatmentGivenSubstanceAdministrationTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthraxTreatmentNotGivenSubstanceAdministration(AnthraxTreatmentNotGivenSubstanceAdministration anthraxTreatmentNotGivenSubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(anthraxTreatmentNotGivenSubstanceAdministration, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(anthraxTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(anthraxTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(anthraxTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(anthraxTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(anthraxTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(anthraxTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(anthraxTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSubstanceAdministration_validateClassCode(anthraxTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationTreatmentNotGivenNegationInd(anthraxTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnthraxTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationTemplateId(anthraxTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationClassCode(anthraxTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationMoodCode(anthraxTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationNegationInd(anthraxTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationStatusCode(anthraxTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationStatusCodeP(anthraxTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateTreatmentNotGivenSubstanceAdministrationTemplateId constraint of '<em>Treatment Not Given Substance Administration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthraxTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationTemplateId(AnthraxTreatmentNotGivenSubstanceAdministration anthraxTreatmentNotGivenSubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return anthraxTreatmentNotGivenSubstanceAdministration.validateTreatmentNotGivenSubstanceAdministrationTemplateId(diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return AnthraxPlugin.INSTANCE;
	}

} //AnthraxValidator
