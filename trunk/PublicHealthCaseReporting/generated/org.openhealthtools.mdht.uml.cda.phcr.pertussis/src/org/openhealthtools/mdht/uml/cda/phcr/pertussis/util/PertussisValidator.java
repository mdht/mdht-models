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
package org.openhealthtools.mdht.uml.cda.phcr.pertussis.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.*;

import org.openhealthtools.mdht.uml.cda.phcr.util.PhcrValidator;

import org.openhealthtools.mdht.uml.cda.util.CDAValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisPackage
 * @generated
 */
public class PertussisValidator extends EObjectValidator
{
  /**
	 * The cached model package
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final PertussisValidator INSTANCE = new PertussisValidator();

  /**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
  public static final String DIAGNOSTIC_SOURCE = "org.openhealthtools.mdht.uml.cda.phcr.pertussis";

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pertussis Case Report Title' of 'Case Report'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PERTUSSIS_CASE_REPORT__PERTUSSIS_CASE_REPORT_TITLE = 1;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pertussis Case Report Pertussis Social History Section' of 'Case Report'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PERTUSSIS_CASE_REPORT__PERTUSSIS_CASE_REPORT_PERTUSSIS_SOCIAL_HISTORY_SECTION = 2;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pertussis Case Report Pertussis Clinical Information Section' of 'Case Report'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PERTUSSIS_CASE_REPORT__PERTUSSIS_CASE_REPORT_PERTUSSIS_CLINICAL_INFORMATION_SECTION = 3;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pertussis Case Report Pertussis Treatment Information Section' of 'Case Report'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PERTUSSIS_CASE_REPORT__PERTUSSIS_CASE_REPORT_PERTUSSIS_TREATMENT_INFORMATION_SECTION = 4;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pertussis Case Report Pertussis Relevant Dx Tests Section' of 'Case Report'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PERTUSSIS_CASE_REPORT__PERTUSSIS_CASE_REPORT_PERTUSSIS_RELEVANT_DX_TESTS_SECTION = 5;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pertussis Case Report Pertussis Immunizations Section' of 'Case Report'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PERTUSSIS_CASE_REPORT__PERTUSSIS_CASE_REPORT_PERTUSSIS_IMMUNIZATIONS_SECTION = 6;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Public Health Case Report Template Id' of 'Case Report'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int PERTUSSIS_CASE_REPORT__PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID = 7;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pertussis Social History Section Pertussis Possible Exposure Location Act' of 'Social History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PERTUSSIS_SOCIAL_HISTORY_SECTION__PERTUSSIS_SOCIAL_HISTORY_SECTION_PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT = 8;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pertussis Social History Section Pertussis Possible Case Contact Location Act' of 'Social History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PERTUSSIS_SOCIAL_HISTORY_SECTION__PERTUSSIS_SOCIAL_HISTORY_SECTION_PERTUSSIS_POSSIBLE_CASE_CONTACT_LOCATION_ACT = 9;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Social History Section Template Id' of 'Social History Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int PERTUSSIS_SOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_TEMPLATE_ID = 10;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pertussis Possible Exposure Location Act Template Id' of 'Possible Exposure Location Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT__PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_TEMPLATE_ID = 11;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pertussis Possible Exposure Location Act Class Code' of 'Possible Exposure Location Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT__PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_CLASS_CODE = 12;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pertussis Possible Exposure Location Act Code' of 'Possible Exposure Location Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT__PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_CODE = 13;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pertussis Possible Exposure Location Act Mood Code' of 'Possible Exposure Location Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT__PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_MOOD_CODE = 14;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pertussis Possible Exposure Location Act Status Code' of 'Possible Exposure Location Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT__PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_STATUS_CODE = 15;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pertussis Possible Case Contact Location Act Template Id' of 'Possible Case Contact Location Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PERTUSSIS_POSSIBLE_CASE_CONTACT_LOCATION_ACT__PERTUSSIS_POSSIBLE_CASE_CONTACT_LOCATION_ACT_TEMPLATE_ID = 16;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pertussis Possible Case Contact Location Act Class Code' of 'Possible Case Contact Location Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PERTUSSIS_POSSIBLE_CASE_CONTACT_LOCATION_ACT__PERTUSSIS_POSSIBLE_CASE_CONTACT_LOCATION_ACT_CLASS_CODE = 17;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pertussis Possible Case Contact Location Act Code' of 'Possible Case Contact Location Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PERTUSSIS_POSSIBLE_CASE_CONTACT_LOCATION_ACT__PERTUSSIS_POSSIBLE_CASE_CONTACT_LOCATION_ACT_CODE = 18;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pertussis Possible Case Contact Location Act Mood Code' of 'Possible Case Contact Location Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PERTUSSIS_POSSIBLE_CASE_CONTACT_LOCATION_ACT__PERTUSSIS_POSSIBLE_CASE_CONTACT_LOCATION_ACT_MOOD_CODE = 19;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pertussis Possible Case Contact Location Act Status Code' of 'Possible Case Contact Location Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PERTUSSIS_POSSIBLE_CASE_CONTACT_LOCATION_ACT__PERTUSSIS_POSSIBLE_CASE_CONTACT_LOCATION_ACT_STATUS_CODE = 20;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pertussis Clinical Information Section Pertussis Case Observation' of 'Clinical Information Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PERTUSSIS_CLINICAL_INFORMATION_SECTION__PERTUSSIS_CLINICAL_INFORMATION_SECTION_PERTUSSIS_CASE_OBSERVATION = 21;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Clinical Information Section Template Id' of 'Clinical Information Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PERTUSSIS_CLINICAL_INFORMATION_SECTION__PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID = 22;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pertussis Treatment Information Section Pertussis Therapeutic Regimen' of 'Treatment Information Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PERTUSSIS_TREATMENT_INFORMATION_SECTION__PERTUSSIS_TREATMENT_INFORMATION_SECTION_PERTUSSIS_THERAPEUTIC_REGIMEN = 28;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Treatment Information Section Template Id' of 'Treatment Information Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PERTUSSIS_TREATMENT_INFORMATION_SECTION__PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID = 29;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pertussis Therapeutic Regimen Act Pertussis Treatment Given Substance Administration' of 'Therapeutic Regimen Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PERTUSSIS_THERAPEUTIC_REGIMEN_ACT__PERTUSSIS_THERAPEUTIC_REGIMEN_ACT_PERTUSSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION = 30;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pertussis Therapeutic Regimen Act Pertussis Treatment Not Given Substance Administration' of 'Therapeutic Regimen Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PERTUSSIS_THERAPEUTIC_REGIMEN_ACT__PERTUSSIS_THERAPEUTIC_REGIMEN_ACT_PERTUSSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION = 31;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Therapeutic Regimen Act Template Id' of 'Therapeutic Regimen Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PERTUSSIS_THERAPEUTIC_REGIMEN_ACT__THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID = 32;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Treatment Given Substance Administration Template Id' of 'Treatment Given Substance Administration'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PERTUSSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID = 33;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Treatment Not Given Substance Administration Template Id' of 'Treatment Not Given Substance Administration'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PERTUSSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID = 34;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Immunizations Section Template Id' of 'Immunizations Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PERTUSSIS_IMMUNIZATIONS_SECTION__IMMUNIZATIONS_SECTION_TEMPLATE_ID = 44;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pertussis Immunization Activity Mood Code' of 'Immunization Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PERTUSSIS_IMMUNIZATION_ACTIVITY__PERTUSSIS_IMMUNIZATION_ACTIVITY_MOOD_CODE = 45;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Activity Template Id' of 'Immunization Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PERTUSSIS_IMMUNIZATION_ACTIVITY__MEDICATION_ACTIVITY_TEMPLATE_ID = 46;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pertussis Case Observation Pertussis Signs And Symptoms Observation' of 'Case Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PERTUSSIS_CASE_OBSERVATION__PERTUSSIS_CASE_OBSERVATION_PERTUSSIS_SIGNS_AND_SYMPTOMS_OBSERVATION = 23;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Observation Template Id' of 'Case Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PERTUSSIS_CASE_OBSERVATION__PROBLEM_OBSERVATION_TEMPLATE_ID = 24;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Case Observation Value' of 'Case Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PERTUSSIS_CASE_OBSERVATION__CASE_OBSERVATION_VALUE = 25;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Signs And Symptoms Observation Template Id' of 'Signs And Symptoms Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PERTUSSIS_SIGNS_AND_SYMPTOMS_OBSERVATION__SIGNS_AND_SYMPTOMS_OBSERVATION_TEMPLATE_ID = 26;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Signs And Symptoms Observation Value' of 'Signs And Symptoms Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PERTUSSIS_SIGNS_AND_SYMPTOMS_OBSERVATION__SIGNS_AND_SYMPTOMS_OBSERVATION_VALUE = 27;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Template Id' of 'Result Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PERTUSSIS_RESULT_OBSERVATION__RESULT_OBSERVATION_TEMPLATE_ID = 38;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Code' of 'Result Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PERTUSSIS_RESULT_OBSERVATION__RESULT_OBSERVATION_CODE = 39;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pertussis Relevant Dx Tests Section Pertussis Result Observation' of 'Relevant Dx Tests Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PERTUSSIS_RELEVANT_DX_TESTS_SECTION__PERTUSSIS_RELEVANT_DX_TESTS_SECTION_PERTUSSIS_RESULT_OBSERVATION = 35;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pertussis Relevant Dx Tests Section Pertussis Result Organizer' of 'Relevant Dx Tests Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PERTUSSIS_RELEVANT_DX_TESTS_SECTION__PERTUSSIS_RELEVANT_DX_TESTS_SECTION_PERTUSSIS_RESULT_ORGANIZER = 36;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Results Section Template Id' of 'Relevant Dx Tests Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PERTUSSIS_RELEVANT_DX_TESTS_SECTION__RESULTS_SECTION_TEMPLATE_ID = 37;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pertussis Result Organizer Code' of 'Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PERTUSSIS_RESULT_ORGANIZER__PERTUSSIS_RESULT_ORGANIZER_CODE = 40;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pertussis Result Organizer Pertussis Result Observation' of 'Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PERTUSSIS_RESULT_ORGANIZER__PERTUSSIS_RESULT_ORGANIZER_PERTUSSIS_RESULT_OBSERVATION = 41;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Template Id' of 'Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PERTUSSIS_RESULT_ORGANIZER__RESULT_ORGANIZER_TEMPLATE_ID = 42;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pertussis Immunizations Section Pertussis Immunization Activity' of 'Immunizations Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PERTUSSIS_IMMUNIZATIONS_SECTION__PERTUSSIS_IMMUNIZATIONS_SECTION_PERTUSSIS_IMMUNIZATION_ACTIVITY = 43;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Product Template Id' of 'Immunization Product'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PERTUSSIS_IMMUNIZATION_PRODUCT__PRODUCT_TEMPLATE_ID = 47;

		/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 47;

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
  public PertussisValidator()
  {
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
  protected EPackage getEPackage()
  {
	  return PertussisPackage.eINSTANCE;
	}

  /**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		switch (classifierID) {
			case PertussisPackage.PERTUSSIS_CASE_REPORT:
				return validatePertussisCaseReport((PertussisCaseReport)value, diagnostics, context);
			case PertussisPackage.PERTUSSIS_SOCIAL_HISTORY_SECTION:
				return validatePertussisSocialHistorySection((PertussisSocialHistorySection)value, diagnostics, context);
			case PertussisPackage.PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT:
				return validatePertussisPossibleExposureLocationAct((PertussisPossibleExposureLocationAct)value, diagnostics, context);
			case PertussisPackage.PERTUSSIS_POSSIBLE_CASE_CONTACT_LOCATION_ACT:
				return validatePertussisPossibleCaseContactLocationAct((PertussisPossibleCaseContactLocationAct)value, diagnostics, context);
			case PertussisPackage.PERTUSSIS_CLINICAL_INFORMATION_SECTION:
				return validatePertussisClinicalInformationSection((PertussisClinicalInformationSection)value, diagnostics, context);
			case PertussisPackage.PERTUSSIS_CASE_OBSERVATION:
				return validatePertussisCaseObservation((PertussisCaseObservation)value, diagnostics, context);
			case PertussisPackage.PERTUSSIS_SIGNS_AND_SYMPTOMS_OBSERVATION:
				return validatePertussisSignsAndSymptomsObservation((PertussisSignsAndSymptomsObservation)value, diagnostics, context);
			case PertussisPackage.PERTUSSIS_TREATMENT_INFORMATION_SECTION:
				return validatePertussisTreatmentInformationSection((PertussisTreatmentInformationSection)value, diagnostics, context);
			case PertussisPackage.PERTUSSIS_THERAPEUTIC_REGIMEN_ACT:
				return validatePertussisTherapeuticRegimenAct((PertussisTherapeuticRegimenAct)value, diagnostics, context);
			case PertussisPackage.PERTUSSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION:
				return validatePertussisTreatmentGivenSubstanceAdministration((PertussisTreatmentGivenSubstanceAdministration)value, diagnostics, context);
			case PertussisPackage.PERTUSSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION:
				return validatePertussisTreatmentNotGivenSubstanceAdministration((PertussisTreatmentNotGivenSubstanceAdministration)value, diagnostics, context);
			case PertussisPackage.PERTUSSIS_RELEVANT_DX_TESTS_SECTION:
				return validatePertussisRelevantDxTestsSection((PertussisRelevantDxTestsSection)value, diagnostics, context);
			case PertussisPackage.PERTUSSIS_RESULT_OBSERVATION:
				return validatePertussisResultObservation((PertussisResultObservation)value, diagnostics, context);
			case PertussisPackage.PERTUSSIS_RESULT_ORGANIZER:
				return validatePertussisResultOrganizer((PertussisResultOrganizer)value, diagnostics, context);
			case PertussisPackage.PERTUSSIS_IMMUNIZATIONS_SECTION:
				return validatePertussisImmunizationsSection((PertussisImmunizationsSection)value, diagnostics, context);
			case PertussisPackage.PERTUSSIS_IMMUNIZATION_ACTIVITY:
				return validatePertussisImmunizationActivity((PertussisImmunizationActivity)value, diagnostics, context);
			case PertussisPackage.PERTUSSIS_IMMUNIZATION_PRODUCT:
				return validatePertussisImmunizationProduct((PertussisImmunizationProduct)value, diagnostics, context);
			default:
				return true;
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validatePertussisCaseReport(PertussisCaseReport pertussisCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(pertussisCaseReport, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(pertussisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pertussisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pertussisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pertussisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(pertussisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(pertussisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pertussisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateClassCode(pertussisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateMoodCode(pertussisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRRecordTarget(pertussisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRRecordTargetPatientRole(pertussisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRRecordTargetPatientRoleId(pertussisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthor(pertussisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorTiime(pertussisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthor(pertussisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorId(pertussisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorAddr(pertussisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorTelecom(pertussisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorAssignedPersonName(pertussisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticator(pertussisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorTime(pertussisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntity(pertussisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityId(pertussisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityAddr(pertussisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityAssignedPersonName(pertussisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validatePertussisCaseReport_validatePublicHealthCaseReportTemplateId(pertussisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportCode(pertussisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrSocialHistorySection(pertussisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrClinicalInformationSection(pertussisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrTreatmentInformationSection(pertussisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrEncountersSection(pertussisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrRelevantDxTestsSection(pertussisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportImmunizationsSection(pertussisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validatePertussisCaseReport_validatePertussisCaseReportTitle(pertussisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validatePertussisCaseReport_validatePertussisCaseReportPertussisSocialHistorySection(pertussisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validatePertussisCaseReport_validatePertussisCaseReportPertussisClinicalInformationSection(pertussisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validatePertussisCaseReport_validatePertussisCaseReportPertussisTreatmentInformationSection(pertussisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validatePertussisCaseReport_validatePertussisCaseReportPertussisRelevantDxTestsSection(pertussisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validatePertussisCaseReport_validatePertussisCaseReportPertussisImmunizationsSection(pertussisCaseReport, diagnostics, context);
		return result;
	}

  /**
	 * Validates the validatePertussisCaseReportTitle constraint of '<em>Case Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisCaseReport_validatePertussisCaseReportTitle(PertussisCaseReport pertussisCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pertussisCaseReport.validatePertussisCaseReportTitle(diagnostics, context);
	}

		/**
	 * Validates the validatePertussisCaseReportPertussisSocialHistorySection constraint of '<em>Case Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisCaseReport_validatePertussisCaseReportPertussisSocialHistorySection(PertussisCaseReport pertussisCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pertussisCaseReport.validatePertussisCaseReportPertussisSocialHistorySection(diagnostics, context);
	}

		/**
	 * Validates the validatePertussisCaseReportPertussisClinicalInformationSection constraint of '<em>Case Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisCaseReport_validatePertussisCaseReportPertussisClinicalInformationSection(PertussisCaseReport pertussisCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pertussisCaseReport.validatePertussisCaseReportPertussisClinicalInformationSection(diagnostics, context);
	}

		/**
	 * Validates the validatePertussisCaseReportPertussisTreatmentInformationSection constraint of '<em>Case Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisCaseReport_validatePertussisCaseReportPertussisTreatmentInformationSection(PertussisCaseReport pertussisCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pertussisCaseReport.validatePertussisCaseReportPertussisTreatmentInformationSection(diagnostics, context);
	}

		/**
	 * Validates the validatePertussisCaseReportPertussisRelevantDxTestsSection constraint of '<em>Case Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisCaseReport_validatePertussisCaseReportPertussisRelevantDxTestsSection(PertussisCaseReport pertussisCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pertussisCaseReport.validatePertussisCaseReportPertussisRelevantDxTestsSection(diagnostics, context);
	}

		/**
	 * Validates the validatePertussisCaseReportPertussisImmunizationsSection constraint of '<em>Case Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisCaseReport_validatePertussisCaseReportPertussisImmunizationsSection(PertussisCaseReport pertussisCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pertussisCaseReport.validatePertussisCaseReportPertussisImmunizationsSection(diagnostics, context);
	}

		/**
	 * Validates the validatePublicHealthCaseReportTemplateId constraint of '<em>Case Report</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validatePertussisCaseReport_validatePublicHealthCaseReportTemplateId(PertussisCaseReport pertussisCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return pertussisCaseReport.validatePublicHealthCaseReportTemplateId(diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validatePertussisSocialHistorySection(PertussisSocialHistorySection pertussisSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(pertussisSocialHistorySection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(pertussisSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pertussisSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pertussisSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pertussisSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(pertussisSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(pertussisSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pertussisSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(pertussisSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(pertussisSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionMaritalStatus(pertussisSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionReligiousAffiliation(pertussisSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionPatientRace(pertussisSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionPatientRaceCodeSystem(pertussisSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionPatientEthnicity(pertussisSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionPatientEthnicityCodeSystem(pertussisSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePertussisSocialHistorySection_validateSocialHistorySectionTemplateId(pertussisSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validateSocialHistorySectionCode(pertussisSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionTitle(pertussisSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionText(pertussisSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionSocialHistoryObservation(pertussisSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionTitle(pertussisSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionText(pertussisSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionGeotemporalHistoryObservation(pertussisSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionMostRecentTimeArrivedInUSAObservation(pertussisSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionRaceObservation(pertussisSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionOccupationObservation(pertussisSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionPregnancyObservation(pertussisSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePertussisSocialHistorySection_validatePertussisSocialHistorySectionPertussisPossibleExposureLocationAct(pertussisSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePertussisSocialHistorySection_validatePertussisSocialHistorySectionPertussisPossibleCaseContactLocationAct(pertussisSocialHistorySection, diagnostics, context);
		return result;
	}

  /**
	 * Validates the validatePertussisSocialHistorySectionPertussisPossibleExposureLocationAct constraint of '<em>Social History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisSocialHistorySection_validatePertussisSocialHistorySectionPertussisPossibleExposureLocationAct(PertussisSocialHistorySection pertussisSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pertussisSocialHistorySection.validatePertussisSocialHistorySectionPertussisPossibleExposureLocationAct(diagnostics, context);
	}

		/**
	 * Validates the validatePertussisSocialHistorySectionPertussisPossibleCaseContactLocationAct constraint of '<em>Social History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisSocialHistorySection_validatePertussisSocialHistorySectionPertussisPossibleCaseContactLocationAct(PertussisSocialHistorySection pertussisSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pertussisSocialHistorySection.validatePertussisSocialHistorySectionPertussisPossibleCaseContactLocationAct(diagnostics, context);
	}

		/**
	 * Validates the validateSocialHistorySectionTemplateId constraint of '<em>Social History Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validatePertussisSocialHistorySection_validateSocialHistorySectionTemplateId(PertussisSocialHistorySection pertussisSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return pertussisSocialHistorySection.validateSocialHistorySectionTemplateId(diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisPossibleExposureLocationAct(PertussisPossibleExposureLocationAct pertussisPossibleExposureLocationAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pertussisPossibleExposureLocationAct, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(pertussisPossibleExposureLocationAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pertussisPossibleExposureLocationAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pertussisPossibleExposureLocationAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pertussisPossibleExposureLocationAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(pertussisPossibleExposureLocationAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(pertussisPossibleExposureLocationAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pertussisPossibleExposureLocationAct, diagnostics, context);
		if (result || diagnostics != null) result &= validatePertussisPossibleExposureLocationAct_validatePertussisPossibleExposureLocationActTemplateId(pertussisPossibleExposureLocationAct, diagnostics, context);
		if (result || diagnostics != null) result &= validatePertussisPossibleExposureLocationAct_validatePertussisPossibleExposureLocationActClassCode(pertussisPossibleExposureLocationAct, diagnostics, context);
		if (result || diagnostics != null) result &= validatePertussisPossibleExposureLocationAct_validatePertussisPossibleExposureLocationActCode(pertussisPossibleExposureLocationAct, diagnostics, context);
		if (result || diagnostics != null) result &= validatePertussisPossibleExposureLocationAct_validatePertussisPossibleExposureLocationActMoodCode(pertussisPossibleExposureLocationAct, diagnostics, context);
		if (result || diagnostics != null) result &= validatePertussisPossibleExposureLocationAct_validatePertussisPossibleExposureLocationActStatusCode(pertussisPossibleExposureLocationAct, diagnostics, context);
		return result;
	}

		/**
	 * Validates the validatePertussisPossibleExposureLocationActTemplateId constraint of '<em>Possible Exposure Location Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisPossibleExposureLocationAct_validatePertussisPossibleExposureLocationActTemplateId(PertussisPossibleExposureLocationAct pertussisPossibleExposureLocationAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pertussisPossibleExposureLocationAct.validatePertussisPossibleExposureLocationActTemplateId(diagnostics, context);
	}

		/**
	 * Validates the validatePertussisPossibleExposureLocationActClassCode constraint of '<em>Possible Exposure Location Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisPossibleExposureLocationAct_validatePertussisPossibleExposureLocationActClassCode(PertussisPossibleExposureLocationAct pertussisPossibleExposureLocationAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pertussisPossibleExposureLocationAct.validatePertussisPossibleExposureLocationActClassCode(diagnostics, context);
	}

		/**
	 * Validates the validatePertussisPossibleExposureLocationActCode constraint of '<em>Possible Exposure Location Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisPossibleExposureLocationAct_validatePertussisPossibleExposureLocationActCode(PertussisPossibleExposureLocationAct pertussisPossibleExposureLocationAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pertussisPossibleExposureLocationAct.validatePertussisPossibleExposureLocationActCode(diagnostics, context);
	}

		/**
	 * Validates the validatePertussisPossibleExposureLocationActMoodCode constraint of '<em>Possible Exposure Location Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisPossibleExposureLocationAct_validatePertussisPossibleExposureLocationActMoodCode(PertussisPossibleExposureLocationAct pertussisPossibleExposureLocationAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pertussisPossibleExposureLocationAct.validatePertussisPossibleExposureLocationActMoodCode(diagnostics, context);
	}

		/**
	 * Validates the validatePertussisPossibleExposureLocationActStatusCode constraint of '<em>Possible Exposure Location Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisPossibleExposureLocationAct_validatePertussisPossibleExposureLocationActStatusCode(PertussisPossibleExposureLocationAct pertussisPossibleExposureLocationAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pertussisPossibleExposureLocationAct.validatePertussisPossibleExposureLocationActStatusCode(diagnostics, context);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisPossibleCaseContactLocationAct(PertussisPossibleCaseContactLocationAct pertussisPossibleCaseContactLocationAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pertussisPossibleCaseContactLocationAct, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(pertussisPossibleCaseContactLocationAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pertussisPossibleCaseContactLocationAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pertussisPossibleCaseContactLocationAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pertussisPossibleCaseContactLocationAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(pertussisPossibleCaseContactLocationAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(pertussisPossibleCaseContactLocationAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pertussisPossibleCaseContactLocationAct, diagnostics, context);
		if (result || diagnostics != null) result &= validatePertussisPossibleCaseContactLocationAct_validatePertussisPossibleCaseContactLocationActTemplateId(pertussisPossibleCaseContactLocationAct, diagnostics, context);
		if (result || diagnostics != null) result &= validatePertussisPossibleCaseContactLocationAct_validatePertussisPossibleCaseContactLocationActClassCode(pertussisPossibleCaseContactLocationAct, diagnostics, context);
		if (result || diagnostics != null) result &= validatePertussisPossibleCaseContactLocationAct_validatePertussisPossibleCaseContactLocationActCode(pertussisPossibleCaseContactLocationAct, diagnostics, context);
		if (result || diagnostics != null) result &= validatePertussisPossibleCaseContactLocationAct_validatePertussisPossibleCaseContactLocationActMoodCode(pertussisPossibleCaseContactLocationAct, diagnostics, context);
		if (result || diagnostics != null) result &= validatePertussisPossibleCaseContactLocationAct_validatePertussisPossibleCaseContactLocationActStatusCode(pertussisPossibleCaseContactLocationAct, diagnostics, context);
		return result;
	}

		/**
	 * Validates the validatePertussisPossibleCaseContactLocationActTemplateId constraint of '<em>Possible Case Contact Location Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisPossibleCaseContactLocationAct_validatePertussisPossibleCaseContactLocationActTemplateId(PertussisPossibleCaseContactLocationAct pertussisPossibleCaseContactLocationAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pertussisPossibleCaseContactLocationAct.validatePertussisPossibleCaseContactLocationActTemplateId(diagnostics, context);
	}

		/**
	 * Validates the validatePertussisPossibleCaseContactLocationActClassCode constraint of '<em>Possible Case Contact Location Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisPossibleCaseContactLocationAct_validatePertussisPossibleCaseContactLocationActClassCode(PertussisPossibleCaseContactLocationAct pertussisPossibleCaseContactLocationAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pertussisPossibleCaseContactLocationAct.validatePertussisPossibleCaseContactLocationActClassCode(diagnostics, context);
	}

		/**
	 * Validates the validatePertussisPossibleCaseContactLocationActCode constraint of '<em>Possible Case Contact Location Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisPossibleCaseContactLocationAct_validatePertussisPossibleCaseContactLocationActCode(PertussisPossibleCaseContactLocationAct pertussisPossibleCaseContactLocationAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pertussisPossibleCaseContactLocationAct.validatePertussisPossibleCaseContactLocationActCode(diagnostics, context);
	}

		/**
	 * Validates the validatePertussisPossibleCaseContactLocationActMoodCode constraint of '<em>Possible Case Contact Location Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisPossibleCaseContactLocationAct_validatePertussisPossibleCaseContactLocationActMoodCode(PertussisPossibleCaseContactLocationAct pertussisPossibleCaseContactLocationAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pertussisPossibleCaseContactLocationAct.validatePertussisPossibleCaseContactLocationActMoodCode(diagnostics, context);
	}

		/**
	 * Validates the validatePertussisPossibleCaseContactLocationActStatusCode constraint of '<em>Possible Case Contact Location Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisPossibleCaseContactLocationAct_validatePertussisPossibleCaseContactLocationActStatusCode(PertussisPossibleCaseContactLocationAct pertussisPossibleCaseContactLocationAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pertussisPossibleCaseContactLocationAct.validatePertussisPossibleCaseContactLocationActStatusCode(diagnostics, context);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisClinicalInformationSection(PertussisClinicalInformationSection pertussisClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pertussisClinicalInformationSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(pertussisClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pertussisClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pertussisClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pertussisClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(pertussisClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(pertussisClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pertussisClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(pertussisClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(pertussisClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPatientConditionConstraint(pertussisClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePertussisClinicalInformationSection_validatePhcrClinicalInformationSectionTemplateId(pertussisClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionCode(pertussisClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionTitle(pertussisClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionText(pertussisClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionCaseObservation(pertussisClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPatientConditionAliveObservation(pertussisClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPatientConditionDeceasedObservation(pertussisClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPhcrRelevantMedicalConditionHistoryObservation(pertussisClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePertussisClinicalInformationSection_validatePertussisClinicalInformationSectionPertussisCaseObservation(pertussisClinicalInformationSection, diagnostics, context);
		return result;
	}

		/**
	 * Validates the validatePertussisClinicalInformationSectionPertussisCaseObservation constraint of '<em>Clinical Information Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisClinicalInformationSection_validatePertussisClinicalInformationSectionPertussisCaseObservation(PertussisClinicalInformationSection pertussisClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pertussisClinicalInformationSection.validatePertussisClinicalInformationSectionPertussisCaseObservation(diagnostics, context);
	}

		/**
	 * Validates the validatePhcrClinicalInformationSectionTemplateId constraint of '<em>Clinical Information Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisClinicalInformationSection_validatePhcrClinicalInformationSectionTemplateId(PertussisClinicalInformationSection pertussisClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pertussisClinicalInformationSection.validatePhcrClinicalInformationSectionTemplateId(diagnostics, context);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisTreatmentInformationSection(PertussisTreatmentInformationSection pertussisTreatmentInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pertussisTreatmentInformationSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(pertussisTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pertussisTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pertussisTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pertussisTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(pertussisTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(pertussisTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pertussisTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(pertussisTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(pertussisTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePertussisTreatmentInformationSection_validatePhcrTreatmentInformationSectionTemplateId(pertussisTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrTreatmentInformationSection_validatePhcrTreatmentInformationSectionCode(pertussisTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrTreatmentInformationSection_validatePhcrTreatmentInformationSectionTitle(pertussisTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrTreatmentInformationSection_validatePhcrTreatmentInformationSectionText(pertussisTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrTreatmentInformationSection_validatePhcrTreatmentInformationSectionTherapeuticRegimenAct(pertussisTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePertussisTreatmentInformationSection_validatePertussisTreatmentInformationSectionPertussisTherapeuticRegimen(pertussisTreatmentInformationSection, diagnostics, context);
		return result;
	}

		/**
	 * Validates the validatePertussisTreatmentInformationSectionPertussisTherapeuticRegimen constraint of '<em>Treatment Information Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisTreatmentInformationSection_validatePertussisTreatmentInformationSectionPertussisTherapeuticRegimen(PertussisTreatmentInformationSection pertussisTreatmentInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pertussisTreatmentInformationSection.validatePertussisTreatmentInformationSectionPertussisTherapeuticRegimen(diagnostics, context);
	}

		/**
	 * Validates the validatePhcrTreatmentInformationSectionTemplateId constraint of '<em>Treatment Information Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisTreatmentInformationSection_validatePhcrTreatmentInformationSectionTemplateId(PertussisTreatmentInformationSection pertussisTreatmentInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pertussisTreatmentInformationSection.validatePhcrTreatmentInformationSectionTemplateId(diagnostics, context);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisTherapeuticRegimenAct(PertussisTherapeuticRegimenAct pertussisTherapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pertussisTherapeuticRegimenAct, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(pertussisTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pertussisTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pertussisTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pertussisTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(pertussisTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(pertussisTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pertussisTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validatePertussisTherapeuticRegimenAct_validateTherapeuticRegimenActTemplateId(pertussisTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActClassCode(pertussisTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActMoodCode(pertussisTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActNegationInd(pertussisTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActCode(pertussisTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActStatusCode(pertussisTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActTreatmentGivenSubstanceAdministration(pertussisTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActTreatmentNotGivenSubstanceAdministration(pertussisTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validatePertussisTherapeuticRegimenAct_validatePertussisTherapeuticRegimenActPertussisTreatmentGivenSubstanceAdministration(pertussisTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validatePertussisTherapeuticRegimenAct_validatePertussisTherapeuticRegimenActPertussisTreatmentNotGivenSubstanceAdministration(pertussisTherapeuticRegimenAct, diagnostics, context);
		return result;
	}

		/**
	 * Validates the validatePertussisTherapeuticRegimenActPertussisTreatmentGivenSubstanceAdministration constraint of '<em>Therapeutic Regimen Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisTherapeuticRegimenAct_validatePertussisTherapeuticRegimenActPertussisTreatmentGivenSubstanceAdministration(PertussisTherapeuticRegimenAct pertussisTherapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pertussisTherapeuticRegimenAct.validatePertussisTherapeuticRegimenActPertussisTreatmentGivenSubstanceAdministration(diagnostics, context);
	}

		/**
	 * Validates the validatePertussisTherapeuticRegimenActPertussisTreatmentNotGivenSubstanceAdministration constraint of '<em>Therapeutic Regimen Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisTherapeuticRegimenAct_validatePertussisTherapeuticRegimenActPertussisTreatmentNotGivenSubstanceAdministration(PertussisTherapeuticRegimenAct pertussisTherapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pertussisTherapeuticRegimenAct.validatePertussisTherapeuticRegimenActPertussisTreatmentNotGivenSubstanceAdministration(diagnostics, context);
	}

		/**
	 * Validates the validateTherapeuticRegimenActTemplateId constraint of '<em>Therapeutic Regimen Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisTherapeuticRegimenAct_validateTherapeuticRegimenActTemplateId(PertussisTherapeuticRegimenAct pertussisTherapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pertussisTherapeuticRegimenAct.validateTherapeuticRegimenActTemplateId(diagnostics, context);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisTreatmentGivenSubstanceAdministration(PertussisTreatmentGivenSubstanceAdministration pertussisTreatmentGivenSubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pertussisTreatmentGivenSubstanceAdministration, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(pertussisTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pertussisTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pertussisTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pertussisTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(pertussisTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(pertussisTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pertussisTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSubstanceAdministration_validateClassCode(pertussisTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationTreatmentGivenNegationInd(pertussisTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validatePertussisTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationTemplateId(pertussisTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationClassCode(pertussisTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationMoodCode(pertussisTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationNegationInd(pertussisTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationEffectiveTime(pertussisTreatmentGivenSubstanceAdministration, diagnostics, context);
		return result;
	}

		/**
	 * Validates the validateTreatmentGivenSubstanceAdministrationTemplateId constraint of '<em>Treatment Given Substance Administration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationTemplateId(PertussisTreatmentGivenSubstanceAdministration pertussisTreatmentGivenSubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pertussisTreatmentGivenSubstanceAdministration.validateTreatmentGivenSubstanceAdministrationTemplateId(diagnostics, context);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisTreatmentNotGivenSubstanceAdministration(PertussisTreatmentNotGivenSubstanceAdministration pertussisTreatmentNotGivenSubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pertussisTreatmentNotGivenSubstanceAdministration, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(pertussisTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pertussisTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pertussisTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pertussisTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(pertussisTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(pertussisTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pertussisTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSubstanceAdministration_validateClassCode(pertussisTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationTreatmentNotGivenNegationInd(pertussisTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validatePertussisTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationTemplateId(pertussisTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationClassCode(pertussisTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationMoodCode(pertussisTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationNegationInd(pertussisTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationStatusCode(pertussisTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		return result;
	}

		/**
	 * Validates the validateTreatmentNotGivenSubstanceAdministrationTemplateId constraint of '<em>Treatment Not Given Substance Administration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationTemplateId(PertussisTreatmentNotGivenSubstanceAdministration pertussisTreatmentNotGivenSubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pertussisTreatmentNotGivenSubstanceAdministration.validateTreatmentNotGivenSubstanceAdministrationTemplateId(diagnostics, context);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisImmunizationsSection(PertussisImmunizationsSection pertussisImmunizationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pertussisImmunizationsSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(pertussisImmunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pertussisImmunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pertussisImmunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pertussisImmunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(pertussisImmunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(pertussisImmunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pertussisImmunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(pertussisImmunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(pertussisImmunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateImmunizationsSection_validateImmunizationsSectionHasMedicationOrSupplyActivity(pertussisImmunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePertussisImmunizationsSection_validateImmunizationsSectionTemplateId(pertussisImmunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateImmunizationsSection_validateImmunizationsSectionCode(pertussisImmunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateImmunizationsSection_validateImmunizationsSectionTitle(pertussisImmunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateImmunizationsSection_validateImmunizationsSectionText(pertussisImmunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateImmunizationsSection_validateImmunizationsSectionMedicationActivity(pertussisImmunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateImmunizationsSection_validateImmunizationsSectionSupplyActivity(pertussisImmunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePertussisImmunizationsSection_validatePertussisImmunizationsSectionPertussisImmunizationActivity(pertussisImmunizationsSection, diagnostics, context);
		return result;
	}

		/**
	 * Validates the validatePertussisImmunizationsSectionPertussisImmunizationActivity constraint of '<em>Immunizations Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisImmunizationsSection_validatePertussisImmunizationsSectionPertussisImmunizationActivity(PertussisImmunizationsSection pertussisImmunizationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pertussisImmunizationsSection.validatePertussisImmunizationsSectionPertussisImmunizationActivity(diagnostics, context);
	}

		/**
	 * Validates the validateImmunizationsSectionTemplateId constraint of '<em>Immunizations Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisImmunizationsSection_validateImmunizationsSectionTemplateId(PertussisImmunizationsSection pertussisImmunizationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pertussisImmunizationsSection.validateImmunizationsSectionTemplateId(diagnostics, context);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisImmunizationActivity(PertussisImmunizationActivity pertussisImmunizationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pertussisImmunizationActivity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(pertussisImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pertussisImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pertussisImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pertussisImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(pertussisImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(pertussisImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pertussisImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSubstanceAdministration_validateClassCode(pertussisImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMoodCode(pertussisImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasDoseQuantityOrRateQuantity(pertussisImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasConsents(pertussisImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityInformationSource(pertussisImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasPreconditionCriterion(pertussisImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasReason(pertussisImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasReasonProblem(pertussisImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasProduct(pertussisImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validatePertussisImmunizationActivity_validateMedicationActivityTemplateId(pertussisImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityId(pertussisImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityStatusCode(pertussisImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityEffectiveTime(pertussisImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMaxDoseQuantity(pertussisImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityRouteCode(pertussisImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityDoseQuantity(pertussisImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityRateQuantity(pertussisImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMedicationSeriesNumberObservation(pertussisImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMedicationStatusObservation(pertussisImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityPatientInstruction(pertussisImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityPerformer(pertussisImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityReactionObservation(pertussisImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityProductInstance(pertussisImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validatePertussisImmunizationActivity_validatePertussisImmunizationActivityMoodCode(pertussisImmunizationActivity, diagnostics, context);
		return result;
	}

		/**
	 * Validates the validatePertussisImmunizationActivityMoodCode constraint of '<em>Immunization Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisImmunizationActivity_validatePertussisImmunizationActivityMoodCode(PertussisImmunizationActivity pertussisImmunizationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pertussisImmunizationActivity.validatePertussisImmunizationActivityMoodCode(diagnostics, context);
	}

		/**
	 * Validates the validateMedicationActivityTemplateId constraint of '<em>Immunization Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisImmunizationActivity_validateMedicationActivityTemplateId(PertussisImmunizationActivity pertussisImmunizationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pertussisImmunizationActivity.validateMedicationActivityTemplateId(diagnostics, context);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisCaseObservation(PertussisCaseObservation pertussisCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pertussisCaseObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(pertussisCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pertussisCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pertussisCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pertussisCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(pertussisCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(pertussisCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pertussisCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationInformationSource(pertussisCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationContainsPatientAwareness(pertussisCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validatePertussisCaseObservation_validateProblemObservationTemplateId(pertussisCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationMoodCode(pertussisCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateProblemObservationStatusCode(pertussisCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationEffectiveTime(pertussisCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationProblemStatus(pertussisCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationProblemHealthStatus(pertussisCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationAgeObservation(pertussisCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationEffectiveTimeLow(pertussisCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationAuthor(pertussisCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationAuthorAssignedAuthor(pertussisCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationClassCode(pertussisCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationMoodCode(pertussisCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationId(pertussisCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateProblemObservationCode(pertussisCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationEffectiveTime(pertussisCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validatePertussisCaseObservation_validateCaseObservationValue(pertussisCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationProblemStatusObservation(pertussisCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationSignsAndSymptomsObservation(pertussisCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validatePertussisCaseObservation_validatePertussisCaseObservationPertussisSignsAndSymptomsObservation(pertussisCaseObservation, diagnostics, context);
		return result;
	}

		/**
	 * Validates the validatePertussisCaseObservationPertussisSignsAndSymptomsObservation constraint of '<em>Case Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisCaseObservation_validatePertussisCaseObservationPertussisSignsAndSymptomsObservation(PertussisCaseObservation pertussisCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pertussisCaseObservation.validatePertussisCaseObservationPertussisSignsAndSymptomsObservation(diagnostics, context);
	}

		/**
	 * Validates the validateProblemObservationTemplateId constraint of '<em>Case Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisCaseObservation_validateProblemObservationTemplateId(PertussisCaseObservation pertussisCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pertussisCaseObservation.validateProblemObservationTemplateId(diagnostics, context);
	}

		/**
	 * Validates the validateCaseObservationValue constraint of '<em>Case Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisCaseObservation_validateCaseObservationValue(PertussisCaseObservation pertussisCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pertussisCaseObservation.validateCaseObservationValue(diagnostics, context);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisSignsAndSymptomsObservation(PertussisSignsAndSymptomsObservation pertussisSignsAndSymptomsObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pertussisSignsAndSymptomsObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(pertussisSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pertussisSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pertussisSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pertussisSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(pertussisSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(pertussisSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pertussisSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validatePertussisSignsAndSymptomsObservation_validateSignsAndSymptomsObservationTemplateId(pertussisSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationClassCode(pertussisSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationMoodCode(pertussisSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationNegationInd(pertussisSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationCode(pertussisSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationStatusCode(pertussisSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationEffectiveTime(pertussisSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validatePertussisSignsAndSymptomsObservation_validateSignsAndSymptomsObservationValue(pertussisSignsAndSymptomsObservation, diagnostics, context);
		return result;
	}

		/**
	 * Validates the validateSignsAndSymptomsObservationTemplateId constraint of '<em>Signs And Symptoms Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisSignsAndSymptomsObservation_validateSignsAndSymptomsObservationTemplateId(PertussisSignsAndSymptomsObservation pertussisSignsAndSymptomsObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pertussisSignsAndSymptomsObservation.validateSignsAndSymptomsObservationTemplateId(diagnostics, context);
	}

		/**
	 * Validates the validateSignsAndSymptomsObservationValue constraint of '<em>Signs And Symptoms Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisSignsAndSymptomsObservation_validateSignsAndSymptomsObservationValue(PertussisSignsAndSymptomsObservation pertussisSignsAndSymptomsObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pertussisSignsAndSymptomsObservation.validateSignsAndSymptomsObservationValue(diagnostics, context);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisResultObservation(PertussisResultObservation pertussisResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pertussisResultObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(pertussisResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pertussisResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pertussisResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pertussisResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(pertussisResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(pertussisResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pertussisResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationCodeValue(pertussisResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationReferenceRangeRequired(pertussisResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationNoObservationRangeCode(pertussisResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationInformationSource(pertussisResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validatePertussisResultObservation_validateResultObservationTemplateId(pertussisResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationMoodCode(pertussisResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationId(pertussisResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationEffectiveTime(pertussisResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultObservation_validateResultObservationStatusCode(pertussisResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validatePertussisResultObservation_validateResultObservationCode(pertussisResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationMethodCode(pertussisResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationInterpretationCode(pertussisResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationValue(pertussisResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultObservation_validatePHCRResultObservationClassCode(pertussisResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultObservation_validatePHCRResultObservationSpecimenCollectionProcedure(pertussisResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultObservation_validatePHCRResultObservationSusceptibilityResult(pertussisResultObservation, diagnostics, context);
		return result;
	}

		/**
	 * Validates the validateResultObservationTemplateId constraint of '<em>Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisResultObservation_validateResultObservationTemplateId(PertussisResultObservation pertussisResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pertussisResultObservation.validateResultObservationTemplateId(diagnostics, context);
	}

		/**
	 * Validates the validateResultObservationCode constraint of '<em>Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisResultObservation_validateResultObservationCode(PertussisResultObservation pertussisResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pertussisResultObservation.validateResultObservationCode(diagnostics, context);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisRelevantDxTestsSection(PertussisRelevantDxTestsSection pertussisRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pertussisRelevantDxTestsSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(pertussisRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pertussisRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pertussisRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pertussisRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(pertussisRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(pertussisRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pertussisRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(pertussisRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(pertussisRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePertussisRelevantDxTestsSection_validateResultsSectionTemplateId(pertussisRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validateResultsSectionCode(pertussisRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionTitle(pertussisRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionText(pertussisRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionResultOrganizer(pertussisRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionTitle(pertussisRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionText(pertussisRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionResultOrganizer(pertussisRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionResultObservation(pertussisRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionImagingObservation(pertussisRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePertussisRelevantDxTestsSection_validatePertussisRelevantDxTestsSectionPertussisResultObservation(pertussisRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePertussisRelevantDxTestsSection_validatePertussisRelevantDxTestsSectionPertussisResultOrganizer(pertussisRelevantDxTestsSection, diagnostics, context);
		return result;
	}

		/**
	 * Validates the validatePertussisRelevantDxTestsSectionPertussisResultObservation constraint of '<em>Relevant Dx Tests Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisRelevantDxTestsSection_validatePertussisRelevantDxTestsSectionPertussisResultObservation(PertussisRelevantDxTestsSection pertussisRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pertussisRelevantDxTestsSection.validatePertussisRelevantDxTestsSectionPertussisResultObservation(diagnostics, context);
	}

		/**
	 * Validates the validatePertussisRelevantDxTestsSectionPertussisResultOrganizer constraint of '<em>Relevant Dx Tests Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisRelevantDxTestsSection_validatePertussisRelevantDxTestsSectionPertussisResultOrganizer(PertussisRelevantDxTestsSection pertussisRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pertussisRelevantDxTestsSection.validatePertussisRelevantDxTestsSectionPertussisResultOrganizer(diagnostics, context);
	}

		/**
	 * Validates the validateResultsSectionTemplateId constraint of '<em>Relevant Dx Tests Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisRelevantDxTestsSection_validateResultsSectionTemplateId(PertussisRelevantDxTestsSection pertussisRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pertussisRelevantDxTestsSection.validateResultsSectionTemplateId(diagnostics, context);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisResultOrganizer(PertussisResultOrganizer pertussisResultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pertussisResultOrganizer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(pertussisResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pertussisResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pertussisResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pertussisResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(pertussisResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(pertussisResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pertussisResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerCodeValue(pertussisResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerComponentElement(pertussisResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerInformationSource(pertussisResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validatePertussisResultOrganizer_validateResultOrganizerTemplateId(pertussisResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerMoodCode(pertussisResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerId(pertussisResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerCode(pertussisResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validateResultOrganizerStatusCode(pertussisResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerResultObservation(pertussisResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerSpecimen(pertussisResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerClassCode(pertussisResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerMoodCode(pertussisResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerId(pertussisResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerCode(pertussisResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerEffectiveTime(pertussisResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerResultObservation(pertussisResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerSpecimenCollectionProcedure(pertussisResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validatePertussisResultOrganizer_validatePertussisResultOrganizerCode(pertussisResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validatePertussisResultOrganizer_validatePertussisResultOrganizerPertussisResultObservation(pertussisResultOrganizer, diagnostics, context);
		return result;
	}

		/**
	 * Validates the validatePertussisResultOrganizerCode constraint of '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisResultOrganizer_validatePertussisResultOrganizerCode(PertussisResultOrganizer pertussisResultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pertussisResultOrganizer.validatePertussisResultOrganizerCode(diagnostics, context);
	}

		/**
	 * Validates the validatePertussisResultOrganizerPertussisResultObservation constraint of '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisResultOrganizer_validatePertussisResultOrganizerPertussisResultObservation(PertussisResultOrganizer pertussisResultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pertussisResultOrganizer.validatePertussisResultOrganizerPertussisResultObservation(diagnostics, context);
	}

		/**
	 * Validates the validateResultOrganizerTemplateId constraint of '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisResultOrganizer_validateResultOrganizerTemplateId(PertussisResultOrganizer pertussisResultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pertussisResultOrganizer.validateResultOrganizerTemplateId(diagnostics, context);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisImmunizationProduct(PertussisImmunizationProduct pertussisImmunizationProduct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pertussisImmunizationProduct, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(pertussisImmunizationProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pertussisImmunizationProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pertussisImmunizationProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pertussisImmunizationProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(pertussisImmunizationProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(pertussisImmunizationProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pertussisImmunizationProduct, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateManufacturedProduct_validateManufacturedDrugOrOtherMaterial(pertussisImmunizationProduct, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateManufacturedProduct_validateClassCode(pertussisImmunizationProduct, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProduct_validateProductHasMaterial(pertussisImmunizationProduct, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProduct_validateProductHasMaterialCode(pertussisImmunizationProduct, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProduct_validateProductHasMaterialCodeVocab(pertussisImmunizationProduct, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProduct_validateProductHasMaterialCodeOriginalText(pertussisImmunizationProduct, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProduct_validateProductHasMaterialName(pertussisImmunizationProduct, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProduct_validateProductMayHaveMaterialManufacturer(pertussisImmunizationProduct, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProduct_validateProductShouldHaveMaterialManufacturer(pertussisImmunizationProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validatePertussisImmunizationProduct_validateProductTemplateId(pertussisImmunizationProduct, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProduct_validateProductId(pertussisImmunizationProduct, diagnostics, context);
		return result;
	}

		/**
	 * Validates the validateProductTemplateId constraint of '<em>Immunization Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePertussisImmunizationProduct_validateProductTemplateId(PertussisImmunizationProduct pertussisImmunizationProduct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pertussisImmunizationProduct.validateProductTemplateId(diagnostics, context);
	}

		/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public ResourceLocator getResourceLocator()
  {
		return PertussisPlugin.INSTANCE;
	}

} //PertussisValidator
