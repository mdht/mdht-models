/*******************************************************************************
 * Copyright (c) 2009, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.phcr.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;
import org.openhealthtools.mdht.uml.cda.phcr.CaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.EstimatedDateOfDeliveryObservation;
import org.openhealthtools.mdht.uml.cda.phcr.GeotemporalHistoryObservation;
import org.openhealthtools.mdht.uml.cda.phcr.ImagingObservation;
import org.openhealthtools.mdht.uml.cda.phcr.MostRecentTimeArrivedInUSAObservation;
import org.openhealthtools.mdht.uml.cda.phcr.OccupationObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PatientConditionAliveObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PatientConditionDeceasedObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrEncountersSection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrPackage;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantMedicalConditionHistoryObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.PregnancyObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.RaceObservation;
import org.openhealthtools.mdht.uml.cda.phcr.ResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.ResultOrganizer;
import org.openhealthtools.mdht.uml.cda.phcr.SignsAndSymptomsObservation;
import org.openhealthtools.mdht.uml.cda.phcr.SpecimenCollectionProcedure;
import org.openhealthtools.mdht.uml.cda.phcr.SusceptibilityResult;
import org.openhealthtools.mdht.uml.cda.phcr.TherapeuticRegimenAct;
import org.openhealthtools.mdht.uml.cda.phcr.TreatmentGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.TreatmentNotGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.util.CDAValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.phcr.PhcrPackage
 * @generated
 */
public class PhcrValidator extends EObjectValidator
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final PhcrValidator INSTANCE = new PhcrValidator();

  /**
   * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.common.util.Diagnostic#getSource()
   * @see org.eclipse.emf.common.util.Diagnostic#getCode()
   * @generated
   */
  public static final String DIAGNOSTIC_SOURCE = "org.openhealthtools.mdht.uml.cda.phcr";

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Public Health Case Report PHCR Record Target' of 'Public Health Case Report'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PUBLIC_HEALTH_CASE_REPORT__PUBLIC_HEALTH_CASE_REPORT_PHCR_RECORD_TARGET = 1;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Public Health Case Report PHCR Record Target Patient Role' of 'Public Health Case Report'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PUBLIC_HEALTH_CASE_REPORT__PUBLIC_HEALTH_CASE_REPORT_PHCR_RECORD_TARGET_PATIENT_ROLE = 2;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Public Health Case Report PHCR Record Target Patient Role Id' of 'Public Health Case Report'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PUBLIC_HEALTH_CASE_REPORT__PUBLIC_HEALTH_CASE_REPORT_PHCR_RECORD_TARGET_PATIENT_ROLE_ID = 3;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Public Health Case Report PHCR Author' of 'Public Health Case Report'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PUBLIC_HEALTH_CASE_REPORT__PUBLIC_HEALTH_CASE_REPORT_PHCR_AUTHOR = 4;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Public Health Case Report PHCR Author Tiime' of 'Public Health Case Report'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PUBLIC_HEALTH_CASE_REPORT__PUBLIC_HEALTH_CASE_REPORT_PHCR_AUTHOR_TIIME = 5;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Public Health Case Report PHCR Author Assigned Author' of 'Public Health Case Report'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PUBLIC_HEALTH_CASE_REPORT__PUBLIC_HEALTH_CASE_REPORT_PHCR_AUTHOR_ASSIGNED_AUTHOR = 6;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Public Health Case Report PHCR Author Assigned Author Id' of 'Public Health Case Report'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PUBLIC_HEALTH_CASE_REPORT__PUBLIC_HEALTH_CASE_REPORT_PHCR_AUTHOR_ASSIGNED_AUTHOR_ID = 7;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Public Health Case Report PHCR Author Assigned Author Addr' of 'Public Health Case Report'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PUBLIC_HEALTH_CASE_REPORT__PUBLIC_HEALTH_CASE_REPORT_PHCR_AUTHOR_ASSIGNED_AUTHOR_ADDR = 8;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Public Health Case Report PHCR Author Assigned Author Telecom' of 'Public Health Case Report'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PUBLIC_HEALTH_CASE_REPORT__PUBLIC_HEALTH_CASE_REPORT_PHCR_AUTHOR_ASSIGNED_AUTHOR_TELECOM = 9;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Public Health Case Report PHCR Author Assigned Author Assigned Person Name' of 'Public Health Case Report'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PUBLIC_HEALTH_CASE_REPORT__PUBLIC_HEALTH_CASE_REPORT_PHCR_AUTHOR_ASSIGNED_AUTHOR_ASSIGNED_PERSON_NAME = 10;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Public Health Case Report PHCR Legal Authenticator' of 'Public Health Case Report'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PUBLIC_HEALTH_CASE_REPORT__PUBLIC_HEALTH_CASE_REPORT_PHCR_LEGAL_AUTHENTICATOR = 11;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Public Health Case Report PHCR Legal Authenticator Time' of 'Public Health Case Report'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PUBLIC_HEALTH_CASE_REPORT__PUBLIC_HEALTH_CASE_REPORT_PHCR_LEGAL_AUTHENTICATOR_TIME = 12;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Public Health Case Report PHCR Legal Authenticator Assigned Entity' of 'Public Health Case Report'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PUBLIC_HEALTH_CASE_REPORT__PUBLIC_HEALTH_CASE_REPORT_PHCR_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY = 13;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Public Health Case Report PHCR Legal Authenticator Assigned Entity Id' of 'Public Health Case Report'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PUBLIC_HEALTH_CASE_REPORT__PUBLIC_HEALTH_CASE_REPORT_PHCR_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ID = 14;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Public Health Case Report PHCR Legal Authenticator Assigned Entity Addr' of 'Public Health Case Report'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PUBLIC_HEALTH_CASE_REPORT__PUBLIC_HEALTH_CASE_REPORT_PHCR_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ADDR = 15;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Public Health Case Report PHCR Legal Authenticator Assigned Entity Assigned Person Name' of 'Public Health Case Report'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PUBLIC_HEALTH_CASE_REPORT__PUBLIC_HEALTH_CASE_REPORT_PHCR_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ASSIGNED_PERSON_NAME = 16;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Public Health Case Report Template Id' of 'Public Health Case Report'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PUBLIC_HEALTH_CASE_REPORT__PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID = 17;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Public Health Case Report Code P' of 'Public Health Case Report'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PUBLIC_HEALTH_CASE_REPORT__PUBLIC_HEALTH_CASE_REPORT_CODE_P = 18;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Public Health Case Report Code' of 'Public Health Case Report'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PUBLIC_HEALTH_CASE_REPORT__PUBLIC_HEALTH_CASE_REPORT_CODE = 19;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Public Health Case Report Phcr Social History Section' of 'Public Health Case Report'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PUBLIC_HEALTH_CASE_REPORT__PUBLIC_HEALTH_CASE_REPORT_PHCR_SOCIAL_HISTORY_SECTION = 20;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Public Health Case Report Phcr Clinical Information Section' of 'Public Health Case Report'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PUBLIC_HEALTH_CASE_REPORT__PUBLIC_HEALTH_CASE_REPORT_PHCR_CLINICAL_INFORMATION_SECTION = 21;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Public Health Case Report Phcr Treatment Information Section' of 'Public Health Case Report'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PUBLIC_HEALTH_CASE_REPORT__PUBLIC_HEALTH_CASE_REPORT_PHCR_TREATMENT_INFORMATION_SECTION = 22;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Public Health Case Report Phcr Encounters Section' of 'Public Health Case Report'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PUBLIC_HEALTH_CASE_REPORT__PUBLIC_HEALTH_CASE_REPORT_PHCR_ENCOUNTERS_SECTION = 23;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Public Health Case Report Phcr Relevant Dx Tests Section' of 'Public Health Case Report'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PUBLIC_HEALTH_CASE_REPORT__PUBLIC_HEALTH_CASE_REPORT_PHCR_RELEVANT_DX_TESTS_SECTION = 24;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Public Health Case Report Immunizations Section' of 'Public Health Case Report'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PUBLIC_HEALTH_CASE_REPORT__PUBLIC_HEALTH_CASE_REPORT_IMMUNIZATIONS_SECTION = 25;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Social History Section Code P' of 'Social History Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PHCR_SOCIAL_HISTORY_SECTION__PHCR_SOCIAL_HISTORY_SECTION_CODE_P = 26;

    /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Social History Section Code' of 'Social History Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PHCR_SOCIAL_HISTORY_SECTION__PHCR_SOCIAL_HISTORY_SECTION_CODE = 27;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Social History Section Title' of 'Social History Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PHCR_SOCIAL_HISTORY_SECTION__PHCR_SOCIAL_HISTORY_SECTION_TITLE = 28;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Social History Section Text' of 'Social History Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PHCR_SOCIAL_HISTORY_SECTION__PHCR_SOCIAL_HISTORY_SECTION_TEXT = 29;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Social History Section Geotemporal History Observation' of 'Social History Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PHCR_SOCIAL_HISTORY_SECTION__PHCR_SOCIAL_HISTORY_SECTION_GEOTEMPORAL_HISTORY_OBSERVATION = 30;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Social History Section Most Recent Time Arrived In USA Observation' of 'Social History Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PHCR_SOCIAL_HISTORY_SECTION__PHCR_SOCIAL_HISTORY_SECTION_MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION = 31;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Social History Section Race Observation' of 'Social History Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PHCR_SOCIAL_HISTORY_SECTION__PHCR_SOCIAL_HISTORY_SECTION_RACE_OBSERVATION = 32;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Social History Section Occupation Observation' of 'Social History Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PHCR_SOCIAL_HISTORY_SECTION__PHCR_SOCIAL_HISTORY_SECTION_OCCUPATION_OBSERVATION = 33;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Social History Section Pregnancy Observation' of 'Social History Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PHCR_SOCIAL_HISTORY_SECTION__PHCR_SOCIAL_HISTORY_SECTION_PREGNANCY_OBSERVATION = 34;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Social History Section Template Id' of 'Social History Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PHCR_SOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_TEMPLATE_ID = 35;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Geotemporal History Observation Effective Time' of 'Geotemporal History Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GEOTEMPORAL_HISTORY_OBSERVATION__GEOTEMPORAL_HISTORY_OBSERVATION_EFFECTIVE_TIME = 44;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Geotemporal History Observation Value' of 'Geotemporal History Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GEOTEMPORAL_HISTORY_OBSERVATION__GEOTEMPORAL_HISTORY_OBSERVATION_VALUE = 45;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Geotemporal History Observation Text' of 'Geotemporal History Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GEOTEMPORAL_HISTORY_OBSERVATION__GEOTEMPORAL_HISTORY_OBSERVATION_TEXT = 41;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Geotemporal History Observation Template Id' of 'Geotemporal History Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GEOTEMPORAL_HISTORY_OBSERVATION__GEOTEMPORAL_HISTORY_OBSERVATION_TEMPLATE_ID = 36;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Geotemporal History Observation Class Code' of 'Geotemporal History Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GEOTEMPORAL_HISTORY_OBSERVATION__GEOTEMPORAL_HISTORY_OBSERVATION_CLASS_CODE = 37;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Geotemporal History Observation Code' of 'Geotemporal History Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GEOTEMPORAL_HISTORY_OBSERVATION__GEOTEMPORAL_HISTORY_OBSERVATION_CODE = 40;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Geotemporal History Observation Mood Code' of 'Geotemporal History Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GEOTEMPORAL_HISTORY_OBSERVATION__GEOTEMPORAL_HISTORY_OBSERVATION_MOOD_CODE = 38;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Geotemporal History Observation Code P' of 'Geotemporal History Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GEOTEMPORAL_HISTORY_OBSERVATION__GEOTEMPORAL_HISTORY_OBSERVATION_CODE_P = 39;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Geotemporal History Observation Status Code' of 'Geotemporal History Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GEOTEMPORAL_HISTORY_OBSERVATION__GEOTEMPORAL_HISTORY_OBSERVATION_STATUS_CODE = 42;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Geotemporal History Observation Status Code P' of 'Geotemporal History Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int GEOTEMPORAL_HISTORY_OBSERVATION__GEOTEMPORAL_HISTORY_OBSERVATION_STATUS_CODE_P = 43;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Most Recent Time Arrived In USA Observation Template Id' of 'Most Recent Time Arrived In USA Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION__MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION_TEMPLATE_ID = 46;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Most Recent Time Arrived In USA Observation Class Code' of 'Most Recent Time Arrived In USA Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION__MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION_CLASS_CODE = 47;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Most Recent Time Arrived In USA Observation Mood Code' of 'Most Recent Time Arrived In USA Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION__MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION_MOOD_CODE = 48;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Most Recent Time Arrived In USA Observation Code P' of 'Most Recent Time Arrived In USA Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION__MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION_CODE_P = 49;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Most Recent Time Arrived In USA Observation Status Code' of 'Most Recent Time Arrived In USA Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION__MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION_STATUS_CODE = 51;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Most Recent Time Arrived In USA Observation Status Code P' of 'Most Recent Time Arrived In USA Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION__MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION_STATUS_CODE_P = 52;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Most Recent Time Arrived In USA Observation Value' of 'Most Recent Time Arrived In USA Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION__MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION_VALUE = 53;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Most Recent Time Arrived In USA Observation Code' of 'Most Recent Time Arrived In USA Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION__MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION_CODE = 50;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Race Observation Template Id' of 'Race Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int RACE_OBSERVATION__RACE_OBSERVATION_TEMPLATE_ID = 54;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Race Observation Class Code' of 'Race Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int RACE_OBSERVATION__RACE_OBSERVATION_CLASS_CODE = 55;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Race Observation Code' of 'Race Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int RACE_OBSERVATION__RACE_OBSERVATION_CODE = 58;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Race Observation Mood Code' of 'Race Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int RACE_OBSERVATION__RACE_OBSERVATION_MOOD_CODE = 56;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Race Observation Code P' of 'Race Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int RACE_OBSERVATION__RACE_OBSERVATION_CODE_P = 57;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Race Observation Status Code' of 'Race Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int RACE_OBSERVATION__RACE_OBSERVATION_STATUS_CODE = 59;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Race Observation Status Code P' of 'Race Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int RACE_OBSERVATION__RACE_OBSERVATION_STATUS_CODE_P = 60;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Race Observation Value' of 'Race Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int RACE_OBSERVATION__RACE_OBSERVATION_VALUE = 61;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Occupation Observation Template Id' of 'Occupation Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int OCCUPATION_OBSERVATION__OCCUPATION_OBSERVATION_TEMPLATE_ID = 62;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Occupation Observation Class Code' of 'Occupation Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int OCCUPATION_OBSERVATION__OCCUPATION_OBSERVATION_CLASS_CODE = 63;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Occupation Observation Code' of 'Occupation Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int OCCUPATION_OBSERVATION__OCCUPATION_OBSERVATION_CODE = 67;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Occupation Observation Text' of 'Occupation Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int OCCUPATION_OBSERVATION__OCCUPATION_OBSERVATION_TEXT = 68;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Occupation Observation Mood Code' of 'Occupation Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int OCCUPATION_OBSERVATION__OCCUPATION_OBSERVATION_MOOD_CODE = 64;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Occupation Observation Negation Ind' of 'Occupation Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int OCCUPATION_OBSERVATION__OCCUPATION_OBSERVATION_NEGATION_IND = 65;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Occupation Observation Code P' of 'Occupation Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int OCCUPATION_OBSERVATION__OCCUPATION_OBSERVATION_CODE_P = 66;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Occupation Observation Status Code' of 'Occupation Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int OCCUPATION_OBSERVATION__OCCUPATION_OBSERVATION_STATUS_CODE = 69;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Occupation Observation Status Code P' of 'Occupation Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int OCCUPATION_OBSERVATION__OCCUPATION_OBSERVATION_STATUS_CODE_P = 70;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Occupation Observation Effective Time' of 'Occupation Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int OCCUPATION_OBSERVATION__OCCUPATION_OBSERVATION_EFFECTIVE_TIME = 71;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Occupation Observation Value' of 'Occupation Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int OCCUPATION_OBSERVATION__OCCUPATION_OBSERVATION_VALUE = 72;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pregnancy Observation Effective Time' of 'Pregnancy Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PREGNANCY_OBSERVATION__PREGNANCY_OBSERVATION_EFFECTIVE_TIME = 80;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pregnancy Observation Template Id' of 'Pregnancy Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PREGNANCY_OBSERVATION__PREGNANCY_OBSERVATION_TEMPLATE_ID = 73;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pregnancy Observation Class Code' of 'Pregnancy Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PREGNANCY_OBSERVATION__PREGNANCY_OBSERVATION_CLASS_CODE = 74;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pregnancy Observation Code' of 'Pregnancy Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PREGNANCY_OBSERVATION__PREGNANCY_OBSERVATION_CODE = 77;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pregnancy Observation Mood Code' of 'Pregnancy Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PREGNANCY_OBSERVATION__PREGNANCY_OBSERVATION_MOOD_CODE = 75;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pregnancy Observation Code P' of 'Pregnancy Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PREGNANCY_OBSERVATION__PREGNANCY_OBSERVATION_CODE_P = 76;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pregnancy Observation Status Code' of 'Pregnancy Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PREGNANCY_OBSERVATION__PREGNANCY_OBSERVATION_STATUS_CODE = 78;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pregnancy Observation Status Code P' of 'Pregnancy Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PREGNANCY_OBSERVATION__PREGNANCY_OBSERVATION_STATUS_CODE_P = 79;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pregnancy Observation Value' of 'Pregnancy Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PREGNANCY_OBSERVATION__PREGNANCY_OBSERVATION_VALUE = 81;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pregnancy Observation Value P' of 'Pregnancy Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PREGNANCY_OBSERVATION__PREGNANCY_OBSERVATION_VALUE_P = 82;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pregnancy Observation Estimated Date Of Delivery Observation' of 'Pregnancy Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PREGNANCY_OBSERVATION__PREGNANCY_OBSERVATION_ESTIMATED_DATE_OF_DELIVERY_OBSERVATION = 83;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Estimated Date Of Delivery Observation Template Id' of 'Estimated Date Of Delivery Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int ESTIMATED_DATE_OF_DELIVERY_OBSERVATION__ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_TEMPLATE_ID = 84;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Estimated Date Of Delivery Observation Class Code' of 'Estimated Date Of Delivery Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int ESTIMATED_DATE_OF_DELIVERY_OBSERVATION__ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_CLASS_CODE = 85;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Estimated Date Of Delivery Observation Code' of 'Estimated Date Of Delivery Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int ESTIMATED_DATE_OF_DELIVERY_OBSERVATION__ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_CODE = 88;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Estimated Date Of Delivery Observation Mood Code' of 'Estimated Date Of Delivery Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int ESTIMATED_DATE_OF_DELIVERY_OBSERVATION__ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_MOOD_CODE = 86;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Estimated Date Of Delivery Observation Code P' of 'Estimated Date Of Delivery Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int ESTIMATED_DATE_OF_DELIVERY_OBSERVATION__ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_CODE_P = 87;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Estimated Date Of Delivery Observation Status Code' of 'Estimated Date Of Delivery Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int ESTIMATED_DATE_OF_DELIVERY_OBSERVATION__ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_STATUS_CODE = 89;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Estimated Date Of Delivery Observation Status Code P' of 'Estimated Date Of Delivery Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int ESTIMATED_DATE_OF_DELIVERY_OBSERVATION__ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_STATUS_CODE_P = 90;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Estimated Date Of Delivery Observation Value' of 'Estimated Date Of Delivery Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int ESTIMATED_DATE_OF_DELIVERY_OBSERVATION__ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_VALUE = 91;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Clinical Information Section Patient Condition Constraint' of 'Clinical Information Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PHCR_CLINICAL_INFORMATION_SECTION__PHCR_CLINICAL_INFORMATION_SECTION_PATIENT_CONDITION_CONSTRAINT = 92;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Clinical Information Section Template Id' of 'Clinical Information Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PHCR_CLINICAL_INFORMATION_SECTION__PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID = 93;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Clinical Information Section Code' of 'Clinical Information Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PHCR_CLINICAL_INFORMATION_SECTION__PHCR_CLINICAL_INFORMATION_SECTION_CODE = 94;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Clinical Information Section Code P' of 'Clinical Information Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PHCR_CLINICAL_INFORMATION_SECTION__PHCR_CLINICAL_INFORMATION_SECTION_CODE_P = 95;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Clinical Information Section Title' of 'Clinical Information Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PHCR_CLINICAL_INFORMATION_SECTION__PHCR_CLINICAL_INFORMATION_SECTION_TITLE = 96;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Clinical Information Section Text' of 'Clinical Information Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PHCR_CLINICAL_INFORMATION_SECTION__PHCR_CLINICAL_INFORMATION_SECTION_TEXT = 97;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Clinical Information Section Case Observation' of 'Clinical Information Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PHCR_CLINICAL_INFORMATION_SECTION__PHCR_CLINICAL_INFORMATION_SECTION_CASE_OBSERVATION = 98;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Clinical Information Section Patient Condition Alive Observation' of 'Clinical Information Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PHCR_CLINICAL_INFORMATION_SECTION__PHCR_CLINICAL_INFORMATION_SECTION_PATIENT_CONDITION_ALIVE_OBSERVATION = 99;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Clinical Information Section Patient Condition Deceased Observation' of 'Clinical Information Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PHCR_CLINICAL_INFORMATION_SECTION__PHCR_CLINICAL_INFORMATION_SECTION_PATIENT_CONDITION_DECEASED_OBSERVATION = 100;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Clinical Information Section Phcr Relevant Medical Condition History Observation' of 'Clinical Information Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PHCR_CLINICAL_INFORMATION_SECTION__PHCR_CLINICAL_INFORMATION_SECTION_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION = 101;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Case Observation Effective Time Low' of 'Case Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int CASE_OBSERVATION__CASE_OBSERVATION_EFFECTIVE_TIME_LOW = 102;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Case Observation Author' of 'Case Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int CASE_OBSERVATION__CASE_OBSERVATION_AUTHOR = 103;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Case Observation Author Assigned Author' of 'Case Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int CASE_OBSERVATION__CASE_OBSERVATION_AUTHOR_ASSIGNED_AUTHOR = 104;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Treatment Information Section Template Id' of 'Treatment Information Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PHCR_TREATMENT_INFORMATION_SECTION__PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID = 157;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Treatment Information Section Code' of 'Treatment Information Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PHCR_TREATMENT_INFORMATION_SECTION__PHCR_TREATMENT_INFORMATION_SECTION_CODE = 158;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Treatment Information Section Code P' of 'Treatment Information Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PHCR_TREATMENT_INFORMATION_SECTION__PHCR_TREATMENT_INFORMATION_SECTION_CODE_P = 159;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Treatment Information Section Title' of 'Treatment Information Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PHCR_TREATMENT_INFORMATION_SECTION__PHCR_TREATMENT_INFORMATION_SECTION_TITLE = 160;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Treatment Information Section Text' of 'Treatment Information Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PHCR_TREATMENT_INFORMATION_SECTION__PHCR_TREATMENT_INFORMATION_SECTION_TEXT = 161;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Treatment Information Section Therapeutic Regimen Act' of 'Treatment Information Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PHCR_TREATMENT_INFORMATION_SECTION__PHCR_TREATMENT_INFORMATION_SECTION_THERAPEUTIC_REGIMEN_ACT = 162;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Therapeutic Regimen Act Template Id' of 'Therapeutic Regimen Act'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int THERAPEUTIC_REGIMEN_ACT__THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID = 163;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Therapeutic Regimen Act Class Code' of 'Therapeutic Regimen Act'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int THERAPEUTIC_REGIMEN_ACT__THERAPEUTIC_REGIMEN_ACT_CLASS_CODE = 164;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Therapeutic Regimen Act Code' of 'Therapeutic Regimen Act'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int THERAPEUTIC_REGIMEN_ACT__THERAPEUTIC_REGIMEN_ACT_CODE = 168;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Therapeutic Regimen Act Mood Code' of 'Therapeutic Regimen Act'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int THERAPEUTIC_REGIMEN_ACT__THERAPEUTIC_REGIMEN_ACT_MOOD_CODE = 165;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Therapeutic Regimen Act Negation Ind' of 'Therapeutic Regimen Act'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int THERAPEUTIC_REGIMEN_ACT__THERAPEUTIC_REGIMEN_ACT_NEGATION_IND = 166;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Therapeutic Regimen Act Code P' of 'Therapeutic Regimen Act'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int THERAPEUTIC_REGIMEN_ACT__THERAPEUTIC_REGIMEN_ACT_CODE_P = 167;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Therapeutic Regimen Act Status Code' of 'Therapeutic Regimen Act'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int THERAPEUTIC_REGIMEN_ACT__THERAPEUTIC_REGIMEN_ACT_STATUS_CODE = 169;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Therapeutic Regimen Act Status Code P' of 'Therapeutic Regimen Act'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int THERAPEUTIC_REGIMEN_ACT__THERAPEUTIC_REGIMEN_ACT_STATUS_CODE_P = 170;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Therapeutic Regimen Act Treatment Given Substance Administration' of 'Therapeutic Regimen Act'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int THERAPEUTIC_REGIMEN_ACT__THERAPEUTIC_REGIMEN_ACT_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION = 171;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Therapeutic Regimen Act Treatment Not Given Substance Administration' of 'Therapeutic Regimen Act'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int THERAPEUTIC_REGIMEN_ACT__THERAPEUTIC_REGIMEN_ACT_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION = 172;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Treatment Given Substance Administration Treatment Given Negation Ind' of 'Treatment Given Substance Administration'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION_TREATMENT_GIVEN_NEGATION_IND = 173;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Encounters Section Title' of 'Encounters Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PHCR_ENCOUNTERS_SECTION__PHCR_ENCOUNTERS_SECTION_TITLE = 189;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Encounters Section Text' of 'Encounters Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PHCR_ENCOUNTERS_SECTION__PHCR_ENCOUNTERS_SECTION_TEXT = 190;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Encounters Section Encounters Activity' of 'Encounters Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PHCR_ENCOUNTERS_SECTION__PHCR_ENCOUNTERS_SECTION_ENCOUNTERS_ACTIVITY = 191;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Encounters Section Template Id' of 'Encounters Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PHCR_ENCOUNTERS_SECTION__ENCOUNTERS_SECTION_TEMPLATE_ID = 192;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Relevant Dx Tests Section Code P' of 'Relevant Dx Tests Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PHCR_RELEVANT_DX_TESTS_SECTION__PHCR_RELEVANT_DX_TESTS_SECTION_CODE_P = 193;

    /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Relevant Dx Tests Section Code' of 'Relevant Dx Tests Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PHCR_RELEVANT_DX_TESTS_SECTION__PHCR_RELEVANT_DX_TESTS_SECTION_CODE = 194;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Relevant Dx Tests Section Title' of 'Relevant Dx Tests Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PHCR_RELEVANT_DX_TESTS_SECTION__PHCR_RELEVANT_DX_TESTS_SECTION_TITLE = 195;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Relevant Dx Tests Section Text' of 'Relevant Dx Tests Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PHCR_RELEVANT_DX_TESTS_SECTION__PHCR_RELEVANT_DX_TESTS_SECTION_TEXT = 196;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Relevant Dx Tests Section Result Organizer' of 'Relevant Dx Tests Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PHCR_RELEVANT_DX_TESTS_SECTION__PHCR_RELEVANT_DX_TESTS_SECTION_RESULT_ORGANIZER = 197;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Relevant Dx Tests Section Result Observation' of 'Relevant Dx Tests Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PHCR_RELEVANT_DX_TESTS_SECTION__PHCR_RELEVANT_DX_TESTS_SECTION_RESULT_OBSERVATION = 198;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Relevant Dx Tests Section Imaging Observation' of 'Relevant Dx Tests Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PHCR_RELEVANT_DX_TESTS_SECTION__PHCR_RELEVANT_DX_TESTS_SECTION_IMAGING_OBSERVATION = 199;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Results Section Template Id' of 'Relevant Dx Tests Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PHCR_RELEVANT_DX_TESTS_SECTION__RESULTS_SECTION_TEMPLATE_ID = 200;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate PHCR Result Organizer Class Code' of 'Result Organizer'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int RESULT_ORGANIZER__PHCR_RESULT_ORGANIZER_CLASS_CODE = 201;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate PHCR Result Organizer Mood Code' of 'Result Organizer'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int RESULT_ORGANIZER__PHCR_RESULT_ORGANIZER_MOOD_CODE = 202;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate PHCR Result Organizer Id' of 'Result Organizer'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int RESULT_ORGANIZER__PHCR_RESULT_ORGANIZER_ID = 203;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate PHCR Result Organizer Code' of 'Result Organizer'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int RESULT_ORGANIZER__PHCR_RESULT_ORGANIZER_CODE = 204;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate PHCR Result Organizer Status Code P' of 'Result Organizer'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int RESULT_ORGANIZER__PHCR_RESULT_ORGANIZER_STATUS_CODE_P = 205;

    /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate PHCR Result Organizer Status Code' of 'Result Organizer'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int RESULT_ORGANIZER__PHCR_RESULT_ORGANIZER_STATUS_CODE = 206;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate PHCR Result Organizer Effective Time' of 'Result Organizer'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int RESULT_ORGANIZER__PHCR_RESULT_ORGANIZER_EFFECTIVE_TIME = 207;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate PHCR Result Organizer Result Observation' of 'Result Organizer'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int RESULT_ORGANIZER__PHCR_RESULT_ORGANIZER_RESULT_OBSERVATION = 208;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate PHCR Result Organizer Specimen Collection Procedure' of 'Result Organizer'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int RESULT_ORGANIZER__PHCR_RESULT_ORGANIZER_SPECIMEN_COLLECTION_PROCEDURE = 209;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Template Id' of 'Result Organizer'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int RESULT_ORGANIZER__RESULT_ORGANIZER_TEMPLATE_ID = 210;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate PHCR Result Observation Class Code' of 'Result Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int RESULT_OBSERVATION__PHCR_RESULT_OBSERVATION_CLASS_CODE = 211;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate PHCR Result Observation Status Code P' of 'Result Observation'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int RESULT_OBSERVATION__PHCR_RESULT_OBSERVATION_STATUS_CODE_P = 212;

    /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate PHCR Result Observation Status Code' of 'Result Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int RESULT_OBSERVATION__PHCR_RESULT_OBSERVATION_STATUS_CODE = 213;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate PHCR Result Observation Specimen Collection Procedure' of 'Result Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int RESULT_OBSERVATION__PHCR_RESULT_OBSERVATION_SPECIMEN_COLLECTION_PROCEDURE = 214;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate PHCR Result Observation Susceptibility Result' of 'Result Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int RESULT_OBSERVATION__PHCR_RESULT_OBSERVATION_SUSCEPTIBILITY_RESULT = 215;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Template Id' of 'Result Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int RESULT_OBSERVATION__RESULT_OBSERVATION_TEMPLATE_ID = 216;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Specimen Collection Procedure Template Id' of 'Specimen Collection Procedure'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int SPECIMEN_COLLECTION_PROCEDURE__SPECIMEN_COLLECTION_PROCEDURE_TEMPLATE_ID = 217;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Specimen Collection Procedure Class Code' of 'Specimen Collection Procedure'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int SPECIMEN_COLLECTION_PROCEDURE__SPECIMEN_COLLECTION_PROCEDURE_CLASS_CODE = 218;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Specimen Collection Procedure Mood Code' of 'Specimen Collection Procedure'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int SPECIMEN_COLLECTION_PROCEDURE__SPECIMEN_COLLECTION_PROCEDURE_MOOD_CODE = 219;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Specimen Collection Procedure Code' of 'Specimen Collection Procedure'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int SPECIMEN_COLLECTION_PROCEDURE__SPECIMEN_COLLECTION_PROCEDURE_CODE = 220;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Specimen Collection Procedure Effective Time' of 'Specimen Collection Procedure'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int SPECIMEN_COLLECTION_PROCEDURE__SPECIMEN_COLLECTION_PROCEDURE_EFFECTIVE_TIME = 221;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Specimen Collection Procedure Target Site Code' of 'Specimen Collection Procedure'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int SPECIMEN_COLLECTION_PROCEDURE__SPECIMEN_COLLECTION_PROCEDURE_TARGET_SITE_CODE = 222;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Imaging Observation Class Code' of 'Imaging Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int IMAGING_OBSERVATION__IMAGING_OBSERVATION_CLASS_CODE = 230;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Imaging Observation Mood Code' of 'Imaging Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int IMAGING_OBSERVATION__IMAGING_OBSERVATION_MOOD_CODE = 231;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Imaging Observation Id' of 'Imaging Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int IMAGING_OBSERVATION__IMAGING_OBSERVATION_ID = 232;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Imaging Observation Code' of 'Imaging Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int IMAGING_OBSERVATION__IMAGING_OBSERVATION_CODE = 233;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Imaging Observation Status Code P' of 'Imaging Observation'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int IMAGING_OBSERVATION__IMAGING_OBSERVATION_STATUS_CODE_P = 234;

    /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Imaging Observation Status Code' of 'Imaging Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int IMAGING_OBSERVATION__IMAGING_OBSERVATION_STATUS_CODE = 235;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Imaging Observation Effective Time' of 'Imaging Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int IMAGING_OBSERVATION__IMAGING_OBSERVATION_EFFECTIVE_TIME = 236;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Imaging Observation Value' of 'Imaging Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int IMAGING_OBSERVATION__IMAGING_OBSERVATION_VALUE = 237;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Imaging Observation Method Code' of 'Imaging Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int IMAGING_OBSERVATION__IMAGING_OBSERVATION_METHOD_CODE = 238;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Observation Template Id' of 'Imaging Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int IMAGING_OBSERVATION__PROBLEM_OBSERVATION_TEMPLATE_ID = 239;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Condition Alive Observation Template Id' of 'Patient Condition Alive Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PATIENT_CONDITION_ALIVE_OBSERVATION__PATIENT_CONDITION_ALIVE_OBSERVATION_TEMPLATE_ID = 127;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Condition Alive Observation Class Code' of 'Patient Condition Alive Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PATIENT_CONDITION_ALIVE_OBSERVATION__PATIENT_CONDITION_ALIVE_OBSERVATION_CLASS_CODE = 128;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Condition Alive Observation Code' of 'Patient Condition Alive Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PATIENT_CONDITION_ALIVE_OBSERVATION__PATIENT_CONDITION_ALIVE_OBSERVATION_CODE = 131;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Condition Alive Observation Mood Code' of 'Patient Condition Alive Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PATIENT_CONDITION_ALIVE_OBSERVATION__PATIENT_CONDITION_ALIVE_OBSERVATION_MOOD_CODE = 129;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Condition Alive Observation Code P' of 'Patient Condition Alive Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PATIENT_CONDITION_ALIVE_OBSERVATION__PATIENT_CONDITION_ALIVE_OBSERVATION_CODE_P = 130;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Condition Alive Observation Status Code' of 'Patient Condition Alive Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PATIENT_CONDITION_ALIVE_OBSERVATION__PATIENT_CONDITION_ALIVE_OBSERVATION_STATUS_CODE = 132;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Condition Alive Observation Status Code P' of 'Patient Condition Alive Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PATIENT_CONDITION_ALIVE_OBSERVATION__PATIENT_CONDITION_ALIVE_OBSERVATION_STATUS_CODE_P = 133;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Condition Alive Observation Value' of 'Patient Condition Alive Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PATIENT_CONDITION_ALIVE_OBSERVATION__PATIENT_CONDITION_ALIVE_OBSERVATION_VALUE = 135;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Condition Alive Observation Value P' of 'Patient Condition Alive Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PATIENT_CONDITION_ALIVE_OBSERVATION__PATIENT_CONDITION_ALIVE_OBSERVATION_VALUE_P = 136;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Condition Alive Observation Effective Time' of 'Patient Condition Alive Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PATIENT_CONDITION_ALIVE_OBSERVATION__PATIENT_CONDITION_ALIVE_OBSERVATION_EFFECTIVE_TIME = 134;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Condition Deceased Observation Template Id' of 'Patient Condition Deceased Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PATIENT_CONDITION_DECEASED_OBSERVATION__PATIENT_CONDITION_DECEASED_OBSERVATION_TEMPLATE_ID = 137;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Condition Deceased Observation Class Code' of 'Patient Condition Deceased Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PATIENT_CONDITION_DECEASED_OBSERVATION__PATIENT_CONDITION_DECEASED_OBSERVATION_CLASS_CODE = 138;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Condition Deceased Observation Code' of 'Patient Condition Deceased Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PATIENT_CONDITION_DECEASED_OBSERVATION__PATIENT_CONDITION_DECEASED_OBSERVATION_CODE = 141;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Condition Deceased Observation Mood Code' of 'Patient Condition Deceased Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PATIENT_CONDITION_DECEASED_OBSERVATION__PATIENT_CONDITION_DECEASED_OBSERVATION_MOOD_CODE = 139;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Condition Deceased Observation Code P' of 'Patient Condition Deceased Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PATIENT_CONDITION_DECEASED_OBSERVATION__PATIENT_CONDITION_DECEASED_OBSERVATION_CODE_P = 140;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Condition Deceased Observation Status Code' of 'Patient Condition Deceased Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PATIENT_CONDITION_DECEASED_OBSERVATION__PATIENT_CONDITION_DECEASED_OBSERVATION_STATUS_CODE = 142;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Condition Deceased Observation Status Code P' of 'Patient Condition Deceased Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PATIENT_CONDITION_DECEASED_OBSERVATION__PATIENT_CONDITION_DECEASED_OBSERVATION_STATUS_CODE_P = 143;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Condition Deceased Observation Value' of 'Patient Condition Deceased Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PATIENT_CONDITION_DECEASED_OBSERVATION__PATIENT_CONDITION_DECEASED_OBSERVATION_VALUE = 145;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Condition Deceased Observation Value P' of 'Patient Condition Deceased Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PATIENT_CONDITION_DECEASED_OBSERVATION__PATIENT_CONDITION_DECEASED_OBSERVATION_VALUE_P = 146;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Relevant Medical Condition History Observation Template Id' of 'Relevant Medical Condition History Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION__PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_TEMPLATE_ID = 147;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Relevant Medical Condition History Observation Class Code' of 'Relevant Medical Condition History Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION__PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_CLASS_CODE = 148;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Relevant Medical Condition History Observation Code P' of 'Relevant Medical Condition History Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION__PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_CODE_P = 149;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Relevant Medical Condition History Observation Code' of 'Relevant Medical Condition History Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION__PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_CODE = 150;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Relevant Medical Condition History Observation Effective Time' of 'Relevant Medical Condition History Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION__PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_EFFECTIVE_TIME = 151;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Relevant Medical Condition History Observation Mood Code' of 'Relevant Medical Condition History Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION__PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_MOOD_CODE = 152;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Relevant Medical Condition History Observation Negation Ind' of 'Relevant Medical Condition History Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION__PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_NEGATION_IND = 153;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Relevant Medical Condition History Observation Status Code' of 'Relevant Medical Condition History Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION__PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_STATUS_CODE = 154;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Relevant Medical Condition History Observation Status Code P' of 'Relevant Medical Condition History Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION__PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_STATUS_CODE_P = 155;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Relevant Medical Condition History Observation Problem Observation' of 'Relevant Medical Condition History Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION__PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_PROBLEM_OBSERVATION = 156;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Condition Deceased Observation Effective Time' of 'Patient Condition Deceased Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PATIENT_CONDITION_DECEASED_OBSERVATION__PATIENT_CONDITION_DECEASED_OBSERVATION_EFFECTIVE_TIME = 144;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Signs And Symptoms Observation Template Id' of 'Signs And Symptoms Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int SIGNS_AND_SYMPTOMS_OBSERVATION__SIGNS_AND_SYMPTOMS_OBSERVATION_TEMPLATE_ID = 117;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Signs And Symptoms Observation Class Code' of 'Signs And Symptoms Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int SIGNS_AND_SYMPTOMS_OBSERVATION__SIGNS_AND_SYMPTOMS_OBSERVATION_CLASS_CODE = 118;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Signs And Symptoms Observation Code' of 'Signs And Symptoms Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int SIGNS_AND_SYMPTOMS_OBSERVATION__SIGNS_AND_SYMPTOMS_OBSERVATION_CODE = 122;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Signs And Symptoms Observation Mood Code' of 'Signs And Symptoms Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int SIGNS_AND_SYMPTOMS_OBSERVATION__SIGNS_AND_SYMPTOMS_OBSERVATION_MOOD_CODE = 119;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Signs And Symptoms Observation Negation Ind' of 'Signs And Symptoms Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int SIGNS_AND_SYMPTOMS_OBSERVATION__SIGNS_AND_SYMPTOMS_OBSERVATION_NEGATION_IND = 120;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Signs And Symptoms Observation Code P' of 'Signs And Symptoms Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int SIGNS_AND_SYMPTOMS_OBSERVATION__SIGNS_AND_SYMPTOMS_OBSERVATION_CODE_P = 121;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Signs And Symptoms Observation Status Code' of 'Signs And Symptoms Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int SIGNS_AND_SYMPTOMS_OBSERVATION__SIGNS_AND_SYMPTOMS_OBSERVATION_STATUS_CODE = 123;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Signs And Symptoms Observation Status Code P' of 'Signs And Symptoms Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int SIGNS_AND_SYMPTOMS_OBSERVATION__SIGNS_AND_SYMPTOMS_OBSERVATION_STATUS_CODE_P = 124;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Signs And Symptoms Observation Value' of 'Signs And Symptoms Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int SIGNS_AND_SYMPTOMS_OBSERVATION__SIGNS_AND_SYMPTOMS_OBSERVATION_VALUE = 126;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Signs And Symptoms Observation Effective Time' of 'Signs And Symptoms Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int SIGNS_AND_SYMPTOMS_OBSERVATION__SIGNS_AND_SYMPTOMS_OBSERVATION_EFFECTIVE_TIME = 125;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Susceptibility Result Template Id' of 'Susceptibility Result'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int SUSCEPTIBILITY_RESULT__SUSCEPTIBILITY_RESULT_TEMPLATE_ID = 223;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Susceptibility Result Class Code' of 'Susceptibility Result'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int SUSCEPTIBILITY_RESULT__SUSCEPTIBILITY_RESULT_CLASS_CODE = 224;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Susceptibility Result Mood Code' of 'Susceptibility Result'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int SUSCEPTIBILITY_RESULT__SUSCEPTIBILITY_RESULT_MOOD_CODE = 225;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Susceptibility Result Code' of 'Susceptibility Result'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int SUSCEPTIBILITY_RESULT__SUSCEPTIBILITY_RESULT_CODE = 227;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Susceptibility Result Code P' of 'Susceptibility Result'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int SUSCEPTIBILITY_RESULT__SUSCEPTIBILITY_RESULT_CODE_P = 226;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Susceptibility Result Status Code' of 'Susceptibility Result'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int SUSCEPTIBILITY_RESULT__SUSCEPTIBILITY_RESULT_STATUS_CODE = 228;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Susceptibility Result Status Code P' of 'Susceptibility Result'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int SUSCEPTIBILITY_RESULT__SUSCEPTIBILITY_RESULT_STATUS_CODE_P = 229;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Treatment Given Substance Administration Template Id' of 'Treatment Given Substance Administration'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID = 174;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Treatment Given Substance Administration Class Code' of 'Treatment Given Substance Administration'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION_CLASS_CODE = 175;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Treatment Given Substance Administration Effective Time' of 'Treatment Given Substance Administration'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION_EFFECTIVE_TIME = 179;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Treatment Given Substance Administration Route Code P' of 'Treatment Given Substance Administration'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION_ROUTE_CODE_P = 180;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Treatment Given Substance Administration Mood Code' of 'Treatment Given Substance Administration'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION_MOOD_CODE = 176;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Treatment Given Substance Administration Negation Ind' of 'Treatment Given Substance Administration'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION_NEGATION_IND = 177;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Treatment Given Substance Administration Status Code' of 'Treatment Given Substance Administration'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION_STATUS_CODE = 178;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Treatment Given Substance Administration Route Code' of 'Treatment Given Substance Administration'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION_ROUTE_CODE = 181;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Treatment Not Given Substance Administration Treatment Not Given Negation Ind' of 'Treatment Not Given Substance Administration'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_TREATMENT_NOT_GIVEN_NEGATION_IND = 182;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Treatment Not Given Substance Administration Template Id' of 'Treatment Not Given Substance Administration'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID = 183;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Treatment Not Given Substance Administration Class Code' of 'Treatment Not Given Substance Administration'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_CLASS_CODE = 184;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Treatment Not Given Substance Administration Mood Code' of 'Treatment Not Given Substance Administration'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_MOOD_CODE = 185;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Treatment Not Given Substance Administration Negation Ind' of 'Treatment Not Given Substance Administration'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_NEGATION_IND = 186;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Treatment Not Given Substance Administration Status Code' of 'Treatment Not Given Substance Administration'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_STATUS_CODE = 187;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Treatment Not Given Substance Administration Status Code P' of 'Treatment Not Given Substance Administration'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_STATUS_CODE_P = 188;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Case Observation Class Code' of 'Case Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int CASE_OBSERVATION__CASE_OBSERVATION_CLASS_CODE = 105;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Case Observation Effective Time' of 'Case Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int CASE_OBSERVATION__CASE_OBSERVATION_EFFECTIVE_TIME = 112;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Case Observation Value' of 'Case Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int CASE_OBSERVATION__CASE_OBSERVATION_VALUE = 113;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Case Observation Problem Status Observation' of 'Case Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int CASE_OBSERVATION__CASE_OBSERVATION_PROBLEM_STATUS_OBSERVATION = 114;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Case Observation Signs And Symptoms Observation' of 'Case Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int CASE_OBSERVATION__CASE_OBSERVATION_SIGNS_AND_SYMPTOMS_OBSERVATION = 115;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Case Observation Mood Code' of 'Case Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int CASE_OBSERVATION__CASE_OBSERVATION_MOOD_CODE = 106;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Case Observation Id' of 'Case Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int CASE_OBSERVATION__CASE_OBSERVATION_ID = 107;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Case Observation Code P' of 'Case Observation'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CASE_OBSERVATION__CASE_OBSERVATION_CODE_P = 108;

    /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Case Observation Code' of 'Case Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int CASE_OBSERVATION__CASE_OBSERVATION_CODE = 109;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Case Observation Status Code P' of 'Case Observation'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CASE_OBSERVATION__CASE_OBSERVATION_STATUS_CODE_P = 110;

    /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Case Observation Status Code' of 'Case Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int CASE_OBSERVATION__CASE_OBSERVATION_STATUS_CODE = 111;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Observation Template Id' of 'Case Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int CASE_OBSERVATION__PROBLEM_OBSERVATION_TEMPLATE_ID = 116;

		/**
   * A constant with a fixed name that can be used as the base value for additional hand written constants.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 239;

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
  protected CCDValidator ccdValidator;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PhcrValidator()
  {
    super();
    cdaValidator = CDAValidator.INSTANCE;
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
    return PhcrPackage.eINSTANCE;
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
    switch (classifierID)
    {
      case PhcrPackage.PUBLIC_HEALTH_CASE_REPORT:
        return validatePublicHealthCaseReport((PublicHealthCaseReport)value, diagnostics, context);
      case PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION:
        return validatePhcrSocialHistorySection((PhcrSocialHistorySection)value, diagnostics, context);
      case PhcrPackage.GEOTEMPORAL_HISTORY_OBSERVATION:
        return validateGeotemporalHistoryObservation((GeotemporalHistoryObservation)value, diagnostics, context);
      case PhcrPackage.MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION:
        return validateMostRecentTimeArrivedInUSAObservation((MostRecentTimeArrivedInUSAObservation)value, diagnostics, context);
      case PhcrPackage.RACE_OBSERVATION:
        return validateRaceObservation((RaceObservation)value, diagnostics, context);
      case PhcrPackage.OCCUPATION_OBSERVATION:
        return validateOccupationObservation((OccupationObservation)value, diagnostics, context);
      case PhcrPackage.PREGNANCY_OBSERVATION:
        return validatePregnancyObservation((PregnancyObservation)value, diagnostics, context);
      case PhcrPackage.ESTIMATED_DATE_OF_DELIVERY_OBSERVATION:
        return validateEstimatedDateOfDeliveryObservation((EstimatedDateOfDeliveryObservation)value, diagnostics, context);
      case PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION:
        return validatePhcrClinicalInformationSection((PhcrClinicalInformationSection)value, diagnostics, context);
      case PhcrPackage.CASE_OBSERVATION:
        return validateCaseObservation((CaseObservation)value, diagnostics, context);
      case PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION:
        return validateSignsAndSymptomsObservation((SignsAndSymptomsObservation)value, diagnostics, context);
      case PhcrPackage.PATIENT_CONDITION_ALIVE_OBSERVATION:
        return validatePatientConditionAliveObservation((PatientConditionAliveObservation)value, diagnostics, context);
      case PhcrPackage.PATIENT_CONDITION_DECEASED_OBSERVATION:
        return validatePatientConditionDeceasedObservation((PatientConditionDeceasedObservation)value, diagnostics, context);
      case PhcrPackage.PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION:
        return validatePhcrRelevantMedicalConditionHistoryObservation((PhcrRelevantMedicalConditionHistoryObservation)value, diagnostics, context);
      case PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION:
        return validatePhcrTreatmentInformationSection((PhcrTreatmentInformationSection)value, diagnostics, context);
      case PhcrPackage.THERAPEUTIC_REGIMEN_ACT:
        return validateTherapeuticRegimenAct((TherapeuticRegimenAct)value, diagnostics, context);
      case PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION:
        return validateTreatmentGivenSubstanceAdministration((TreatmentGivenSubstanceAdministration)value, diagnostics, context);
      case PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION:
        return validateTreatmentNotGivenSubstanceAdministration((TreatmentNotGivenSubstanceAdministration)value, diagnostics, context);
      case PhcrPackage.PHCR_ENCOUNTERS_SECTION:
        return validatePhcrEncountersSection((PhcrEncountersSection)value, diagnostics, context);
      case PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION:
        return validatePhcrRelevantDxTestsSection((PhcrRelevantDxTestsSection)value, diagnostics, context);
      case PhcrPackage.RESULT_ORGANIZER:
        return validateResultOrganizer((ResultOrganizer)value, diagnostics, context);
      case PhcrPackage.RESULT_OBSERVATION:
        return validateResultObservation((ResultObservation)value, diagnostics, context);
      case PhcrPackage.SPECIMEN_COLLECTION_PROCEDURE:
        return validateSpecimenCollectionProcedure((SpecimenCollectionProcedure)value, diagnostics, context);
      case PhcrPackage.SUSCEPTIBILITY_RESULT:
        return validateSusceptibilityResult((SusceptibilityResult)value, diagnostics, context);
      case PhcrPackage.IMAGING_OBSERVATION:
        return validateImagingObservation((ImagingObservation)value, diagnostics, context);
      default:
        return true;
    }
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePublicHealthCaseReport(PublicHealthCaseReport publicHealthCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(publicHealthCaseReport, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(publicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(publicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(publicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(publicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(publicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(publicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(publicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateClassCode(publicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateMoodCode(publicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRRecordTarget(publicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRRecordTargetPatientRole(publicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRRecordTargetPatientRoleId(publicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthor(publicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorTiime(publicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthor(publicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorId(publicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorAddr(publicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorTelecom(publicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorAssignedPersonName(publicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticator(publicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorTime(publicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntity(publicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityId(publicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityAddr(publicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityAssignedPersonName(publicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validatePublicHealthCaseReport_validatePublicHealthCaseReportTemplateId(publicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validatePublicHealthCaseReport_validatePublicHealthCaseReportCodeP(publicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validatePublicHealthCaseReport_validatePublicHealthCaseReportCode(publicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrSocialHistorySection(publicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrClinicalInformationSection(publicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrTreatmentInformationSection(publicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrEncountersSection(publicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrRelevantDxTestsSection(publicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validatePublicHealthCaseReport_validatePublicHealthCaseReportImmunizationsSection(publicHealthCaseReport, diagnostics, context);
    return result;
  }

		/**
   * Validates the validatePublicHealthCaseReportPHCRRecordTarget constraint of '<em>Public Health Case Report</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRRecordTarget(PublicHealthCaseReport publicHealthCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return publicHealthCaseReport.validatePublicHealthCaseReportPHCRRecordTarget(diagnostics, context);
  }

		/**
   * Validates the validatePublicHealthCaseReportPHCRRecordTargetPatientRole constraint of '<em>Public Health Case Report</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRRecordTargetPatientRole(PublicHealthCaseReport publicHealthCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return publicHealthCaseReport.validatePublicHealthCaseReportPHCRRecordTargetPatientRole(diagnostics, context);
  }

		/**
   * Validates the validatePublicHealthCaseReportPHCRRecordTargetPatientRoleId constraint of '<em>Public Health Case Report</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRRecordTargetPatientRoleId(PublicHealthCaseReport publicHealthCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return publicHealthCaseReport.validatePublicHealthCaseReportPHCRRecordTargetPatientRoleId(diagnostics, context);
  }

		/**
   * Validates the validatePublicHealthCaseReportPHCRAuthor constraint of '<em>Public Health Case Report</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthor(PublicHealthCaseReport publicHealthCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return publicHealthCaseReport.validatePublicHealthCaseReportPHCRAuthor(diagnostics, context);
  }

		/**
   * Validates the validatePublicHealthCaseReportPHCRAuthorTiime constraint of '<em>Public Health Case Report</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorTiime(PublicHealthCaseReport publicHealthCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return publicHealthCaseReport.validatePublicHealthCaseReportPHCRAuthorTiime(diagnostics, context);
  }

		/**
   * Validates the validatePublicHealthCaseReportPHCRAuthorAssignedAuthor constraint of '<em>Public Health Case Report</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthor(PublicHealthCaseReport publicHealthCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return publicHealthCaseReport.validatePublicHealthCaseReportPHCRAuthorAssignedAuthor(diagnostics, context);
  }

		/**
   * Validates the validatePublicHealthCaseReportPHCRAuthorAssignedAuthorId constraint of '<em>Public Health Case Report</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorId(PublicHealthCaseReport publicHealthCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return publicHealthCaseReport.validatePublicHealthCaseReportPHCRAuthorAssignedAuthorId(diagnostics, context);
  }

		/**
   * Validates the validatePublicHealthCaseReportPHCRAuthorAssignedAuthorAddr constraint of '<em>Public Health Case Report</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorAddr(PublicHealthCaseReport publicHealthCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return publicHealthCaseReport.validatePublicHealthCaseReportPHCRAuthorAssignedAuthorAddr(diagnostics, context);
  }

		/**
   * Validates the validatePublicHealthCaseReportPHCRAuthorAssignedAuthorTelecom constraint of '<em>Public Health Case Report</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorTelecom(PublicHealthCaseReport publicHealthCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return publicHealthCaseReport.validatePublicHealthCaseReportPHCRAuthorAssignedAuthorTelecom(diagnostics, context);
  }

		/**
   * Validates the validatePublicHealthCaseReportPHCRAuthorAssignedAuthorAssignedPersonName constraint of '<em>Public Health Case Report</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorAssignedPersonName(PublicHealthCaseReport publicHealthCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return publicHealthCaseReport.validatePublicHealthCaseReportPHCRAuthorAssignedAuthorAssignedPersonName(diagnostics, context);
  }

		/**
   * Validates the validatePublicHealthCaseReportPHCRLegalAuthenticator constraint of '<em>Public Health Case Report</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticator(PublicHealthCaseReport publicHealthCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return publicHealthCaseReport.validatePublicHealthCaseReportPHCRLegalAuthenticator(diagnostics, context);
  }

		/**
   * Validates the validatePublicHealthCaseReportPHCRLegalAuthenticatorTime constraint of '<em>Public Health Case Report</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorTime(PublicHealthCaseReport publicHealthCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return publicHealthCaseReport.validatePublicHealthCaseReportPHCRLegalAuthenticatorTime(diagnostics, context);
  }

		/**
   * Validates the validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntity constraint of '<em>Public Health Case Report</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntity(PublicHealthCaseReport publicHealthCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return publicHealthCaseReport.validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntity(diagnostics, context);
  }

		/**
   * Validates the validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityId constraint of '<em>Public Health Case Report</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityId(PublicHealthCaseReport publicHealthCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return publicHealthCaseReport.validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityId(diagnostics, context);
  }

		/**
   * Validates the validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityAddr constraint of '<em>Public Health Case Report</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityAddr(PublicHealthCaseReport publicHealthCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return publicHealthCaseReport.validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityAddr(diagnostics, context);
  }

		/**
   * Validates the validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityAssignedPersonName constraint of '<em>Public Health Case Report</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityAssignedPersonName(PublicHealthCaseReport publicHealthCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return publicHealthCaseReport.validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityAssignedPersonName(diagnostics, context);
  }

		/**
   * Validates the validatePublicHealthCaseReportTemplateId constraint of '<em>Public Health Case Report</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePublicHealthCaseReport_validatePublicHealthCaseReportTemplateId(PublicHealthCaseReport publicHealthCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return publicHealthCaseReport.validatePublicHealthCaseReportTemplateId(diagnostics, context);
  }

		/**
   * Validates the validatePublicHealthCaseReportCodeP constraint of '<em>Public Health Case Report</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePublicHealthCaseReport_validatePublicHealthCaseReportCodeP(PublicHealthCaseReport publicHealthCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return publicHealthCaseReport.validatePublicHealthCaseReportCodeP(diagnostics, context);
  }

		/**
   * Validates the validatePublicHealthCaseReportCode constraint of '<em>Public Health Case Report</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePublicHealthCaseReport_validatePublicHealthCaseReportCode(PublicHealthCaseReport publicHealthCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return publicHealthCaseReport.validatePublicHealthCaseReportCode(diagnostics, context);
  }

		/**
   * Validates the validatePublicHealthCaseReportPhcrSocialHistorySection constraint of '<em>Public Health Case Report</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrSocialHistorySection(PublicHealthCaseReport publicHealthCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return publicHealthCaseReport.validatePublicHealthCaseReportPhcrSocialHistorySection(diagnostics, context);
  }

		/**
   * Validates the validatePublicHealthCaseReportPhcrClinicalInformationSection constraint of '<em>Public Health Case Report</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrClinicalInformationSection(PublicHealthCaseReport publicHealthCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return publicHealthCaseReport.validatePublicHealthCaseReportPhcrClinicalInformationSection(diagnostics, context);
  }

		/**
   * Validates the validatePublicHealthCaseReportPhcrTreatmentInformationSection constraint of '<em>Public Health Case Report</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrTreatmentInformationSection(PublicHealthCaseReport publicHealthCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return publicHealthCaseReport.validatePublicHealthCaseReportPhcrTreatmentInformationSection(diagnostics, context);
  }

		/**
   * Validates the validatePublicHealthCaseReportPhcrEncountersSection constraint of '<em>Public Health Case Report</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrEncountersSection(PublicHealthCaseReport publicHealthCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return publicHealthCaseReport.validatePublicHealthCaseReportPhcrEncountersSection(diagnostics, context);
  }

		/**
   * Validates the validatePublicHealthCaseReportPhcrRelevantDxTestsSection constraint of '<em>Public Health Case Report</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrRelevantDxTestsSection(PublicHealthCaseReport publicHealthCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return publicHealthCaseReport.validatePublicHealthCaseReportPhcrRelevantDxTestsSection(diagnostics, context);
  }

		/**
   * Validates the validatePublicHealthCaseReportImmunizationsSection constraint of '<em>Public Health Case Report</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePublicHealthCaseReport_validatePublicHealthCaseReportImmunizationsSection(PublicHealthCaseReport publicHealthCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return publicHealthCaseReport.validatePublicHealthCaseReportImmunizationsSection(diagnostics, context);
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePhcrSocialHistorySection(PhcrSocialHistorySection phcrSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(phcrSocialHistorySection, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(phcrSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(phcrSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(phcrSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(phcrSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(phcrSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(phcrSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(phcrSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(phcrSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(phcrSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= validatePhcrSocialHistorySection_validateSocialHistorySectionTemplateId(phcrSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionCode(phcrSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionTitle(phcrSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionText(phcrSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionSocialHistoryObservation(phcrSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionCodeP(phcrSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionCode(phcrSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionTitle(phcrSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionText(phcrSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionGeotemporalHistoryObservation(phcrSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionMostRecentTimeArrivedInUSAObservation(phcrSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionRaceObservation(phcrSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionOccupationObservation(phcrSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionPregnancyObservation(phcrSocialHistorySection, diagnostics, context);
    return result;
  }

		/**
   * Validates the validatePhcrSocialHistorySectionCodeP constraint of '<em>Social History Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionCodeP(PhcrSocialHistorySection phcrSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return phcrSocialHistorySection.validatePhcrSocialHistorySectionCodeP(diagnostics, context);
  }

    /**
   * Validates the validatePhcrSocialHistorySectionCode constraint of '<em>Social History Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionCode(PhcrSocialHistorySection phcrSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return phcrSocialHistorySection.validatePhcrSocialHistorySectionCode(diagnostics, context);
  }

		/**
   * Validates the validatePhcrSocialHistorySectionTitle constraint of '<em>Social History Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionTitle(PhcrSocialHistorySection phcrSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return phcrSocialHistorySection.validatePhcrSocialHistorySectionTitle(diagnostics, context);
  }

		/**
   * Validates the validatePhcrSocialHistorySectionText constraint of '<em>Social History Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionText(PhcrSocialHistorySection phcrSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return phcrSocialHistorySection.validatePhcrSocialHistorySectionText(diagnostics, context);
  }

		/**
   * Validates the validatePhcrSocialHistorySectionGeotemporalHistoryObservation constraint of '<em>Social History Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionGeotemporalHistoryObservation(PhcrSocialHistorySection phcrSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return phcrSocialHistorySection.validatePhcrSocialHistorySectionGeotemporalHistoryObservation(diagnostics, context);
  }

		/**
   * Validates the validatePhcrSocialHistorySectionMostRecentTimeArrivedInUSAObservation constraint of '<em>Social History Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionMostRecentTimeArrivedInUSAObservation(PhcrSocialHistorySection phcrSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return phcrSocialHistorySection.validatePhcrSocialHistorySectionMostRecentTimeArrivedInUSAObservation(diagnostics, context);
  }

		/**
   * Validates the validatePhcrSocialHistorySectionRaceObservation constraint of '<em>Social History Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionRaceObservation(PhcrSocialHistorySection phcrSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return phcrSocialHistorySection.validatePhcrSocialHistorySectionRaceObservation(diagnostics, context);
  }

		/**
   * Validates the validatePhcrSocialHistorySectionOccupationObservation constraint of '<em>Social History Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionOccupationObservation(PhcrSocialHistorySection phcrSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return phcrSocialHistorySection.validatePhcrSocialHistorySectionOccupationObservation(diagnostics, context);
  }

		/**
   * Validates the validatePhcrSocialHistorySectionPregnancyObservation constraint of '<em>Social History Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionPregnancyObservation(PhcrSocialHistorySection phcrSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return phcrSocialHistorySection.validatePhcrSocialHistorySectionPregnancyObservation(diagnostics, context);
  }

		/**
   * Validates the validateSocialHistorySectionTemplateId constraint of '<em>Social History Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePhcrSocialHistorySection_validateSocialHistorySectionTemplateId(PhcrSocialHistorySection phcrSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    // TODO override the constraint, if desired
    // -> uncomment the scaffolding
    // -> specify the condition that violates the constraint
    // -> verify the diagnostic details, including severity, code, and message
    // Ensure that you remove @generated or mark it @generated NOT
    if (false)
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (createDiagnostic
            (Diagnostic.ERROR,
             DIAGNOSTIC_SOURCE,
             0,
             "_UI_GenericConstraint_diagnostic",
             new Object[] { "validateSocialHistorySectionTemplateId", getObjectLabel(phcrSocialHistorySection, context) },
             new Object[] { phcrSocialHistorySection },
             context));
      }
      return false;
    }
    return ccdValidator.validateSocialHistorySection_validateSocialHistorySectionTemplateId(phcrSocialHistorySection, diagnostics, context);
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGeotemporalHistoryObservation(GeotemporalHistoryObservation geotemporalHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(geotemporalHistoryObservation, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(geotemporalHistoryObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(geotemporalHistoryObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(geotemporalHistoryObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(geotemporalHistoryObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(geotemporalHistoryObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(geotemporalHistoryObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(geotemporalHistoryObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeotemporalHistoryObservation_validateGeotemporalHistoryObservationTemplateId(geotemporalHistoryObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeotemporalHistoryObservation_validateGeotemporalHistoryObservationClassCode(geotemporalHistoryObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeotemporalHistoryObservation_validateGeotemporalHistoryObservationMoodCode(geotemporalHistoryObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeotemporalHistoryObservation_validateGeotemporalHistoryObservationCodeP(geotemporalHistoryObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeotemporalHistoryObservation_validateGeotemporalHistoryObservationCode(geotemporalHistoryObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeotemporalHistoryObservation_validateGeotemporalHistoryObservationText(geotemporalHistoryObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeotemporalHistoryObservation_validateGeotemporalHistoryObservationStatusCode(geotemporalHistoryObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeotemporalHistoryObservation_validateGeotemporalHistoryObservationStatusCodeP(geotemporalHistoryObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeotemporalHistoryObservation_validateGeotemporalHistoryObservationEffectiveTime(geotemporalHistoryObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateGeotemporalHistoryObservation_validateGeotemporalHistoryObservationValue(geotemporalHistoryObservation, diagnostics, context);
    return result;
  }

		/**
   * Validates the validateGeotemporalHistoryObservationEffectiveTime constraint of '<em>Geotemporal History Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGeotemporalHistoryObservation_validateGeotemporalHistoryObservationEffectiveTime(GeotemporalHistoryObservation geotemporalHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return geotemporalHistoryObservation.validateGeotemporalHistoryObservationEffectiveTime(diagnostics, context);
  }

		/**
   * Validates the validateGeotemporalHistoryObservationValue constraint of '<em>Geotemporal History Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGeotemporalHistoryObservation_validateGeotemporalHistoryObservationValue(GeotemporalHistoryObservation geotemporalHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return geotemporalHistoryObservation.validateGeotemporalHistoryObservationValue(diagnostics, context);
  }

		/**
   * Validates the validateGeotemporalHistoryObservationText constraint of '<em>Geotemporal History Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGeotemporalHistoryObservation_validateGeotemporalHistoryObservationText(GeotemporalHistoryObservation geotemporalHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return geotemporalHistoryObservation.validateGeotemporalHistoryObservationText(diagnostics, context);
  }

		/**
   * Validates the validateGeotemporalHistoryObservationTemplateId constraint of '<em>Geotemporal History Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGeotemporalHistoryObservation_validateGeotemporalHistoryObservationTemplateId(GeotemporalHistoryObservation geotemporalHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return geotemporalHistoryObservation.validateGeotemporalHistoryObservationTemplateId(diagnostics, context);
  }

		/**
   * Validates the validateGeotemporalHistoryObservationClassCode constraint of '<em>Geotemporal History Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGeotemporalHistoryObservation_validateGeotemporalHistoryObservationClassCode(GeotemporalHistoryObservation geotemporalHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return geotemporalHistoryObservation.validateGeotemporalHistoryObservationClassCode(diagnostics, context);
  }

		/**
   * Validates the validateGeotemporalHistoryObservationCode constraint of '<em>Geotemporal History Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGeotemporalHistoryObservation_validateGeotemporalHistoryObservationCode(GeotemporalHistoryObservation geotemporalHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return geotemporalHistoryObservation.validateGeotemporalHistoryObservationCode(diagnostics, context);
  }

		/**
   * Validates the validateGeotemporalHistoryObservationMoodCode constraint of '<em>Geotemporal History Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGeotemporalHistoryObservation_validateGeotemporalHistoryObservationMoodCode(GeotemporalHistoryObservation geotemporalHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return geotemporalHistoryObservation.validateGeotemporalHistoryObservationMoodCode(diagnostics, context);
  }

		/**
   * Validates the validateGeotemporalHistoryObservationCodeP constraint of '<em>Geotemporal History Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGeotemporalHistoryObservation_validateGeotemporalHistoryObservationCodeP(GeotemporalHistoryObservation geotemporalHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return geotemporalHistoryObservation.validateGeotemporalHistoryObservationCodeP(diagnostics, context);
  }

		/**
   * Validates the validateGeotemporalHistoryObservationStatusCode constraint of '<em>Geotemporal History Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGeotemporalHistoryObservation_validateGeotemporalHistoryObservationStatusCode(GeotemporalHistoryObservation geotemporalHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return geotemporalHistoryObservation.validateGeotemporalHistoryObservationStatusCode(diagnostics, context);
  }

		/**
   * Validates the validateGeotemporalHistoryObservationStatusCodeP constraint of '<em>Geotemporal History Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateGeotemporalHistoryObservation_validateGeotemporalHistoryObservationStatusCodeP(GeotemporalHistoryObservation geotemporalHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return geotemporalHistoryObservation.validateGeotemporalHistoryObservationStatusCodeP(diagnostics, context);
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMostRecentTimeArrivedInUSAObservation(MostRecentTimeArrivedInUSAObservation mostRecentTimeArrivedInUSAObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(mostRecentTimeArrivedInUSAObservation, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(mostRecentTimeArrivedInUSAObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mostRecentTimeArrivedInUSAObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mostRecentTimeArrivedInUSAObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(mostRecentTimeArrivedInUSAObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(mostRecentTimeArrivedInUSAObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(mostRecentTimeArrivedInUSAObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(mostRecentTimeArrivedInUSAObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateMostRecentTimeArrivedInUSAObservation_validateMostRecentTimeArrivedInUSAObservationTemplateId(mostRecentTimeArrivedInUSAObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateMostRecentTimeArrivedInUSAObservation_validateMostRecentTimeArrivedInUSAObservationClassCode(mostRecentTimeArrivedInUSAObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateMostRecentTimeArrivedInUSAObservation_validateMostRecentTimeArrivedInUSAObservationMoodCode(mostRecentTimeArrivedInUSAObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateMostRecentTimeArrivedInUSAObservation_validateMostRecentTimeArrivedInUSAObservationCodeP(mostRecentTimeArrivedInUSAObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateMostRecentTimeArrivedInUSAObservation_validateMostRecentTimeArrivedInUSAObservationCode(mostRecentTimeArrivedInUSAObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateMostRecentTimeArrivedInUSAObservation_validateMostRecentTimeArrivedInUSAObservationStatusCode(mostRecentTimeArrivedInUSAObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateMostRecentTimeArrivedInUSAObservation_validateMostRecentTimeArrivedInUSAObservationStatusCodeP(mostRecentTimeArrivedInUSAObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateMostRecentTimeArrivedInUSAObservation_validateMostRecentTimeArrivedInUSAObservationValue(mostRecentTimeArrivedInUSAObservation, diagnostics, context);
    return result;
  }

		/**
   * Validates the validateMostRecentTimeArrivedInUSAObservationTemplateId constraint of '<em>Most Recent Time Arrived In USA Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMostRecentTimeArrivedInUSAObservation_validateMostRecentTimeArrivedInUSAObservationTemplateId(MostRecentTimeArrivedInUSAObservation mostRecentTimeArrivedInUSAObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return mostRecentTimeArrivedInUSAObservation.validateMostRecentTimeArrivedInUSAObservationTemplateId(diagnostics, context);
  }

		/**
   * Validates the validateMostRecentTimeArrivedInUSAObservationClassCode constraint of '<em>Most Recent Time Arrived In USA Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMostRecentTimeArrivedInUSAObservation_validateMostRecentTimeArrivedInUSAObservationClassCode(MostRecentTimeArrivedInUSAObservation mostRecentTimeArrivedInUSAObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return mostRecentTimeArrivedInUSAObservation.validateMostRecentTimeArrivedInUSAObservationClassCode(diagnostics, context);
  }

		/**
   * Validates the validateMostRecentTimeArrivedInUSAObservationMoodCode constraint of '<em>Most Recent Time Arrived In USA Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMostRecentTimeArrivedInUSAObservation_validateMostRecentTimeArrivedInUSAObservationMoodCode(MostRecentTimeArrivedInUSAObservation mostRecentTimeArrivedInUSAObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return mostRecentTimeArrivedInUSAObservation.validateMostRecentTimeArrivedInUSAObservationMoodCode(diagnostics, context);
  }

		/**
   * Validates the validateMostRecentTimeArrivedInUSAObservationCodeP constraint of '<em>Most Recent Time Arrived In USA Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMostRecentTimeArrivedInUSAObservation_validateMostRecentTimeArrivedInUSAObservationCodeP(MostRecentTimeArrivedInUSAObservation mostRecentTimeArrivedInUSAObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return mostRecentTimeArrivedInUSAObservation.validateMostRecentTimeArrivedInUSAObservationCodeP(diagnostics, context);
  }

		/**
   * Validates the validateMostRecentTimeArrivedInUSAObservationStatusCode constraint of '<em>Most Recent Time Arrived In USA Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMostRecentTimeArrivedInUSAObservation_validateMostRecentTimeArrivedInUSAObservationStatusCode(MostRecentTimeArrivedInUSAObservation mostRecentTimeArrivedInUSAObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return mostRecentTimeArrivedInUSAObservation.validateMostRecentTimeArrivedInUSAObservationStatusCode(diagnostics, context);
  }

		/**
   * Validates the validateMostRecentTimeArrivedInUSAObservationStatusCodeP constraint of '<em>Most Recent Time Arrived In USA Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMostRecentTimeArrivedInUSAObservation_validateMostRecentTimeArrivedInUSAObservationStatusCodeP(MostRecentTimeArrivedInUSAObservation mostRecentTimeArrivedInUSAObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return mostRecentTimeArrivedInUSAObservation.validateMostRecentTimeArrivedInUSAObservationStatusCodeP(diagnostics, context);
  }

		/**
   * Validates the validateMostRecentTimeArrivedInUSAObservationValue constraint of '<em>Most Recent Time Arrived In USA Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMostRecentTimeArrivedInUSAObservation_validateMostRecentTimeArrivedInUSAObservationValue(MostRecentTimeArrivedInUSAObservation mostRecentTimeArrivedInUSAObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return mostRecentTimeArrivedInUSAObservation.validateMostRecentTimeArrivedInUSAObservationValue(diagnostics, context);
  }

		/**
   * Validates the validateMostRecentTimeArrivedInUSAObservationCode constraint of '<em>Most Recent Time Arrived In USA Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMostRecentTimeArrivedInUSAObservation_validateMostRecentTimeArrivedInUSAObservationCode(MostRecentTimeArrivedInUSAObservation mostRecentTimeArrivedInUSAObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return mostRecentTimeArrivedInUSAObservation.validateMostRecentTimeArrivedInUSAObservationCode(diagnostics, context);
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateRaceObservation(RaceObservation raceObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(raceObservation, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(raceObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(raceObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(raceObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(raceObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(raceObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(raceObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(raceObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateRaceObservation_validateRaceObservationTemplateId(raceObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateRaceObservation_validateRaceObservationClassCode(raceObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateRaceObservation_validateRaceObservationMoodCode(raceObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateRaceObservation_validateRaceObservationCodeP(raceObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateRaceObservation_validateRaceObservationCode(raceObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateRaceObservation_validateRaceObservationStatusCode(raceObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateRaceObservation_validateRaceObservationStatusCodeP(raceObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateRaceObservation_validateRaceObservationValue(raceObservation, diagnostics, context);
    return result;
  }

		/**
   * Validates the validateRaceObservationTemplateId constraint of '<em>Race Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateRaceObservation_validateRaceObservationTemplateId(RaceObservation raceObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return raceObservation.validateRaceObservationTemplateId(diagnostics, context);
  }

		/**
   * Validates the validateRaceObservationClassCode constraint of '<em>Race Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateRaceObservation_validateRaceObservationClassCode(RaceObservation raceObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return raceObservation.validateRaceObservationClassCode(diagnostics, context);
  }

		/**
   * Validates the validateRaceObservationCode constraint of '<em>Race Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateRaceObservation_validateRaceObservationCode(RaceObservation raceObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return raceObservation.validateRaceObservationCode(diagnostics, context);
  }

		/**
   * Validates the validateRaceObservationMoodCode constraint of '<em>Race Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateRaceObservation_validateRaceObservationMoodCode(RaceObservation raceObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return raceObservation.validateRaceObservationMoodCode(diagnostics, context);
  }

		/**
   * Validates the validateRaceObservationCodeP constraint of '<em>Race Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateRaceObservation_validateRaceObservationCodeP(RaceObservation raceObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return raceObservation.validateRaceObservationCodeP(diagnostics, context);
  }

		/**
   * Validates the validateRaceObservationStatusCode constraint of '<em>Race Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateRaceObservation_validateRaceObservationStatusCode(RaceObservation raceObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return raceObservation.validateRaceObservationStatusCode(diagnostics, context);
  }

		/**
   * Validates the validateRaceObservationStatusCodeP constraint of '<em>Race Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateRaceObservation_validateRaceObservationStatusCodeP(RaceObservation raceObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return raceObservation.validateRaceObservationStatusCodeP(diagnostics, context);
  }

		/**
   * Validates the validateRaceObservationValue constraint of '<em>Race Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateRaceObservation_validateRaceObservationValue(RaceObservation raceObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return raceObservation.validateRaceObservationValue(diagnostics, context);
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateOccupationObservation(OccupationObservation occupationObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(occupationObservation, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(occupationObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(occupationObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(occupationObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(occupationObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(occupationObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(occupationObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(occupationObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateOccupationObservation_validateOccupationObservationTemplateId(occupationObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateOccupationObservation_validateOccupationObservationClassCode(occupationObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateOccupationObservation_validateOccupationObservationMoodCode(occupationObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateOccupationObservation_validateOccupationObservationNegationInd(occupationObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateOccupationObservation_validateOccupationObservationCodeP(occupationObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateOccupationObservation_validateOccupationObservationCode(occupationObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateOccupationObservation_validateOccupationObservationText(occupationObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateOccupationObservation_validateOccupationObservationStatusCode(occupationObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateOccupationObservation_validateOccupationObservationStatusCodeP(occupationObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateOccupationObservation_validateOccupationObservationEffectiveTime(occupationObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateOccupationObservation_validateOccupationObservationValue(occupationObservation, diagnostics, context);
    return result;
  }

		/**
   * Validates the validateOccupationObservationTemplateId constraint of '<em>Occupation Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateOccupationObservation_validateOccupationObservationTemplateId(OccupationObservation occupationObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return occupationObservation.validateOccupationObservationTemplateId(diagnostics, context);
  }

		/**
   * Validates the validateOccupationObservationClassCode constraint of '<em>Occupation Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateOccupationObservation_validateOccupationObservationClassCode(OccupationObservation occupationObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return occupationObservation.validateOccupationObservationClassCode(diagnostics, context);
  }

		/**
   * Validates the validateOccupationObservationCode constraint of '<em>Occupation Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateOccupationObservation_validateOccupationObservationCode(OccupationObservation occupationObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return occupationObservation.validateOccupationObservationCode(diagnostics, context);
  }

		/**
   * Validates the validateOccupationObservationText constraint of '<em>Occupation Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateOccupationObservation_validateOccupationObservationText(OccupationObservation occupationObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return occupationObservation.validateOccupationObservationText(diagnostics, context);
  }

		/**
   * Validates the validateOccupationObservationMoodCode constraint of '<em>Occupation Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateOccupationObservation_validateOccupationObservationMoodCode(OccupationObservation occupationObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return occupationObservation.validateOccupationObservationMoodCode(diagnostics, context);
  }

		/**
   * Validates the validateOccupationObservationNegationInd constraint of '<em>Occupation Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateOccupationObservation_validateOccupationObservationNegationInd(OccupationObservation occupationObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return occupationObservation.validateOccupationObservationNegationInd(diagnostics, context);
  }

		/**
   * Validates the validateOccupationObservationCodeP constraint of '<em>Occupation Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateOccupationObservation_validateOccupationObservationCodeP(OccupationObservation occupationObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return occupationObservation.validateOccupationObservationCodeP(diagnostics, context);
  }

		/**
   * Validates the validateOccupationObservationStatusCode constraint of '<em>Occupation Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateOccupationObservation_validateOccupationObservationStatusCode(OccupationObservation occupationObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return occupationObservation.validateOccupationObservationStatusCode(diagnostics, context);
  }

		/**
   * Validates the validateOccupationObservationStatusCodeP constraint of '<em>Occupation Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateOccupationObservation_validateOccupationObservationStatusCodeP(OccupationObservation occupationObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return occupationObservation.validateOccupationObservationStatusCodeP(diagnostics, context);
  }

		/**
   * Validates the validateOccupationObservationEffectiveTime constraint of '<em>Occupation Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateOccupationObservation_validateOccupationObservationEffectiveTime(OccupationObservation occupationObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return occupationObservation.validateOccupationObservationEffectiveTime(diagnostics, context);
  }

		/**
   * Validates the validateOccupationObservationValue constraint of '<em>Occupation Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateOccupationObservation_validateOccupationObservationValue(OccupationObservation occupationObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return occupationObservation.validateOccupationObservationValue(diagnostics, context);
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePregnancyObservation(PregnancyObservation pregnancyObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(pregnancyObservation, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(pregnancyObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pregnancyObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pregnancyObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(pregnancyObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(pregnancyObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(pregnancyObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pregnancyObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validatePregnancyObservation_validatePregnancyObservationTemplateId(pregnancyObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validatePregnancyObservation_validatePregnancyObservationClassCode(pregnancyObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validatePregnancyObservation_validatePregnancyObservationMoodCode(pregnancyObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validatePregnancyObservation_validatePregnancyObservationCodeP(pregnancyObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validatePregnancyObservation_validatePregnancyObservationCode(pregnancyObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validatePregnancyObservation_validatePregnancyObservationStatusCode(pregnancyObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validatePregnancyObservation_validatePregnancyObservationStatusCodeP(pregnancyObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validatePregnancyObservation_validatePregnancyObservationEffectiveTime(pregnancyObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validatePregnancyObservation_validatePregnancyObservationValue(pregnancyObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validatePregnancyObservation_validatePregnancyObservationValueP(pregnancyObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validatePregnancyObservation_validatePregnancyObservationEstimatedDateOfDeliveryObservation(pregnancyObservation, diagnostics, context);
    return result;
  }

		/**
   * Validates the validatePregnancyObservationEffectiveTime constraint of '<em>Pregnancy Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePregnancyObservation_validatePregnancyObservationEffectiveTime(PregnancyObservation pregnancyObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return pregnancyObservation.validatePregnancyObservationEffectiveTime(diagnostics, context);
  }

		/**
   * Validates the validatePregnancyObservationTemplateId constraint of '<em>Pregnancy Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePregnancyObservation_validatePregnancyObservationTemplateId(PregnancyObservation pregnancyObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return pregnancyObservation.validatePregnancyObservationTemplateId(diagnostics, context);
  }

		/**
   * Validates the validatePregnancyObservationClassCode constraint of '<em>Pregnancy Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePregnancyObservation_validatePregnancyObservationClassCode(PregnancyObservation pregnancyObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return pregnancyObservation.validatePregnancyObservationClassCode(diagnostics, context);
  }

		/**
   * Validates the validatePregnancyObservationCode constraint of '<em>Pregnancy Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePregnancyObservation_validatePregnancyObservationCode(PregnancyObservation pregnancyObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return pregnancyObservation.validatePregnancyObservationCode(diagnostics, context);
  }

		/**
   * Validates the validatePregnancyObservationMoodCode constraint of '<em>Pregnancy Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePregnancyObservation_validatePregnancyObservationMoodCode(PregnancyObservation pregnancyObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return pregnancyObservation.validatePregnancyObservationMoodCode(diagnostics, context);
  }

		/**
   * Validates the validatePregnancyObservationCodeP constraint of '<em>Pregnancy Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePregnancyObservation_validatePregnancyObservationCodeP(PregnancyObservation pregnancyObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return pregnancyObservation.validatePregnancyObservationCodeP(diagnostics, context);
  }

		/**
   * Validates the validatePregnancyObservationStatusCode constraint of '<em>Pregnancy Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePregnancyObservation_validatePregnancyObservationStatusCode(PregnancyObservation pregnancyObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return pregnancyObservation.validatePregnancyObservationStatusCode(diagnostics, context);
  }

		/**
   * Validates the validatePregnancyObservationStatusCodeP constraint of '<em>Pregnancy Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePregnancyObservation_validatePregnancyObservationStatusCodeP(PregnancyObservation pregnancyObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return pregnancyObservation.validatePregnancyObservationStatusCodeP(diagnostics, context);
  }

		/**
   * Validates the validatePregnancyObservationValue constraint of '<em>Pregnancy Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePregnancyObservation_validatePregnancyObservationValue(PregnancyObservation pregnancyObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return pregnancyObservation.validatePregnancyObservationValue(diagnostics, context);
  }

		/**
   * Validates the validatePregnancyObservationValueP constraint of '<em>Pregnancy Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePregnancyObservation_validatePregnancyObservationValueP(PregnancyObservation pregnancyObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return pregnancyObservation.validatePregnancyObservationValueP(diagnostics, context);
  }

		/**
   * Validates the validatePregnancyObservationEstimatedDateOfDeliveryObservation constraint of '<em>Pregnancy Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePregnancyObservation_validatePregnancyObservationEstimatedDateOfDeliveryObservation(PregnancyObservation pregnancyObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return pregnancyObservation.validatePregnancyObservationEstimatedDateOfDeliveryObservation(diagnostics, context);
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateEstimatedDateOfDeliveryObservation(EstimatedDateOfDeliveryObservation estimatedDateOfDeliveryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(estimatedDateOfDeliveryObservation, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(estimatedDateOfDeliveryObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(estimatedDateOfDeliveryObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(estimatedDateOfDeliveryObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(estimatedDateOfDeliveryObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(estimatedDateOfDeliveryObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(estimatedDateOfDeliveryObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(estimatedDateOfDeliveryObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateEstimatedDateOfDeliveryObservation_validateEstimatedDateOfDeliveryObservationTemplateId(estimatedDateOfDeliveryObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateEstimatedDateOfDeliveryObservation_validateEstimatedDateOfDeliveryObservationClassCode(estimatedDateOfDeliveryObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateEstimatedDateOfDeliveryObservation_validateEstimatedDateOfDeliveryObservationMoodCode(estimatedDateOfDeliveryObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateEstimatedDateOfDeliveryObservation_validateEstimatedDateOfDeliveryObservationCodeP(estimatedDateOfDeliveryObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateEstimatedDateOfDeliveryObservation_validateEstimatedDateOfDeliveryObservationCode(estimatedDateOfDeliveryObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateEstimatedDateOfDeliveryObservation_validateEstimatedDateOfDeliveryObservationStatusCode(estimatedDateOfDeliveryObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateEstimatedDateOfDeliveryObservation_validateEstimatedDateOfDeliveryObservationStatusCodeP(estimatedDateOfDeliveryObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateEstimatedDateOfDeliveryObservation_validateEstimatedDateOfDeliveryObservationValue(estimatedDateOfDeliveryObservation, diagnostics, context);
    return result;
  }

		/**
   * Validates the validateEstimatedDateOfDeliveryObservationTemplateId constraint of '<em>Estimated Date Of Delivery Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateEstimatedDateOfDeliveryObservation_validateEstimatedDateOfDeliveryObservationTemplateId(EstimatedDateOfDeliveryObservation estimatedDateOfDeliveryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return estimatedDateOfDeliveryObservation.validateEstimatedDateOfDeliveryObservationTemplateId(diagnostics, context);
  }

		/**
   * Validates the validateEstimatedDateOfDeliveryObservationClassCode constraint of '<em>Estimated Date Of Delivery Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateEstimatedDateOfDeliveryObservation_validateEstimatedDateOfDeliveryObservationClassCode(EstimatedDateOfDeliveryObservation estimatedDateOfDeliveryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return estimatedDateOfDeliveryObservation.validateEstimatedDateOfDeliveryObservationClassCode(diagnostics, context);
  }

		/**
   * Validates the validateEstimatedDateOfDeliveryObservationCode constraint of '<em>Estimated Date Of Delivery Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateEstimatedDateOfDeliveryObservation_validateEstimatedDateOfDeliveryObservationCode(EstimatedDateOfDeliveryObservation estimatedDateOfDeliveryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return estimatedDateOfDeliveryObservation.validateEstimatedDateOfDeliveryObservationCode(diagnostics, context);
  }

		/**
   * Validates the validateEstimatedDateOfDeliveryObservationMoodCode constraint of '<em>Estimated Date Of Delivery Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateEstimatedDateOfDeliveryObservation_validateEstimatedDateOfDeliveryObservationMoodCode(EstimatedDateOfDeliveryObservation estimatedDateOfDeliveryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return estimatedDateOfDeliveryObservation.validateEstimatedDateOfDeliveryObservationMoodCode(diagnostics, context);
  }

		/**
   * Validates the validateEstimatedDateOfDeliveryObservationCodeP constraint of '<em>Estimated Date Of Delivery Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateEstimatedDateOfDeliveryObservation_validateEstimatedDateOfDeliveryObservationCodeP(EstimatedDateOfDeliveryObservation estimatedDateOfDeliveryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return estimatedDateOfDeliveryObservation.validateEstimatedDateOfDeliveryObservationCodeP(diagnostics, context);
  }

		/**
   * Validates the validateEstimatedDateOfDeliveryObservationStatusCode constraint of '<em>Estimated Date Of Delivery Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateEstimatedDateOfDeliveryObservation_validateEstimatedDateOfDeliveryObservationStatusCode(EstimatedDateOfDeliveryObservation estimatedDateOfDeliveryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return estimatedDateOfDeliveryObservation.validateEstimatedDateOfDeliveryObservationStatusCode(diagnostics, context);
  }

		/**
   * Validates the validateEstimatedDateOfDeliveryObservationStatusCodeP constraint of '<em>Estimated Date Of Delivery Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateEstimatedDateOfDeliveryObservation_validateEstimatedDateOfDeliveryObservationStatusCodeP(EstimatedDateOfDeliveryObservation estimatedDateOfDeliveryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return estimatedDateOfDeliveryObservation.validateEstimatedDateOfDeliveryObservationStatusCodeP(diagnostics, context);
  }

		/**
   * Validates the validateEstimatedDateOfDeliveryObservationValue constraint of '<em>Estimated Date Of Delivery Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateEstimatedDateOfDeliveryObservation_validateEstimatedDateOfDeliveryObservationValue(EstimatedDateOfDeliveryObservation estimatedDateOfDeliveryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return estimatedDateOfDeliveryObservation.validateEstimatedDateOfDeliveryObservationValue(diagnostics, context);
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePhcrClinicalInformationSection(PhcrClinicalInformationSection phcrClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(phcrClinicalInformationSection, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(phcrClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(phcrClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(phcrClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(phcrClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(phcrClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(phcrClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(phcrClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(phcrClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(phcrClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPatientConditionConstraint(phcrClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionTemplateId(phcrClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionCode(phcrClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionCodeP(phcrClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionTitle(phcrClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionText(phcrClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionCaseObservation(phcrClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPatientConditionAliveObservation(phcrClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPatientConditionDeceasedObservation(phcrClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPhcrRelevantMedicalConditionHistoryObservation(phcrClinicalInformationSection, diagnostics, context);
    return result;
  }

		/**
   * Validates the validatePhcrClinicalInformationSectionPatientConditionConstraint constraint of '<em>Clinical Information Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPatientConditionConstraint(PhcrClinicalInformationSection phcrClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return phcrClinicalInformationSection.validatePhcrClinicalInformationSectionPatientConditionConstraint(diagnostics, context);
  }

		/**
   * Validates the validatePhcrClinicalInformationSectionTemplateId constraint of '<em>Clinical Information Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionTemplateId(PhcrClinicalInformationSection phcrClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return phcrClinicalInformationSection.validatePhcrClinicalInformationSectionTemplateId(diagnostics, context);
  }

		/**
   * Validates the validatePhcrClinicalInformationSectionCode constraint of '<em>Clinical Information Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionCode(PhcrClinicalInformationSection phcrClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return phcrClinicalInformationSection.validatePhcrClinicalInformationSectionCode(diagnostics, context);
  }

		/**
   * Validates the validatePhcrClinicalInformationSectionCodeP constraint of '<em>Clinical Information Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionCodeP(PhcrClinicalInformationSection phcrClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return phcrClinicalInformationSection.validatePhcrClinicalInformationSectionCodeP(diagnostics, context);
  }

		/**
   * Validates the validatePhcrClinicalInformationSectionTitle constraint of '<em>Clinical Information Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionTitle(PhcrClinicalInformationSection phcrClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return phcrClinicalInformationSection.validatePhcrClinicalInformationSectionTitle(diagnostics, context);
  }

		/**
   * Validates the validatePhcrClinicalInformationSectionText constraint of '<em>Clinical Information Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionText(PhcrClinicalInformationSection phcrClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return phcrClinicalInformationSection.validatePhcrClinicalInformationSectionText(diagnostics, context);
  }

		/**
   * Validates the validatePhcrClinicalInformationSectionCaseObservation constraint of '<em>Clinical Information Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionCaseObservation(PhcrClinicalInformationSection phcrClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return phcrClinicalInformationSection.validatePhcrClinicalInformationSectionCaseObservation(diagnostics, context);
  }

		/**
   * Validates the validatePhcrClinicalInformationSectionPatientConditionAliveObservation constraint of '<em>Clinical Information Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPatientConditionAliveObservation(PhcrClinicalInformationSection phcrClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return phcrClinicalInformationSection.validatePhcrClinicalInformationSectionPatientConditionAliveObservation(diagnostics, context);
  }

		/**
   * Validates the validatePhcrClinicalInformationSectionPatientConditionDeceasedObservation constraint of '<em>Clinical Information Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPatientConditionDeceasedObservation(PhcrClinicalInformationSection phcrClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return phcrClinicalInformationSection.validatePhcrClinicalInformationSectionPatientConditionDeceasedObservation(diagnostics, context);
  }

		/**
   * Validates the validatePhcrClinicalInformationSectionPhcrRelevantMedicalConditionHistoryObservation constraint of '<em>Clinical Information Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPhcrRelevantMedicalConditionHistoryObservation(PhcrClinicalInformationSection phcrClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return phcrClinicalInformationSection.validatePhcrClinicalInformationSectionPhcrRelevantMedicalConditionHistoryObservation(diagnostics, context);
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePhcrTreatmentInformationSection(PhcrTreatmentInformationSection phcrTreatmentInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(phcrTreatmentInformationSection, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(phcrTreatmentInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(phcrTreatmentInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(phcrTreatmentInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(phcrTreatmentInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(phcrTreatmentInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(phcrTreatmentInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(phcrTreatmentInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(phcrTreatmentInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(phcrTreatmentInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validatePhcrTreatmentInformationSection_validatePhcrTreatmentInformationSectionTemplateId(phcrTreatmentInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validatePhcrTreatmentInformationSection_validatePhcrTreatmentInformationSectionCode(phcrTreatmentInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validatePhcrTreatmentInformationSection_validatePhcrTreatmentInformationSectionCodeP(phcrTreatmentInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validatePhcrTreatmentInformationSection_validatePhcrTreatmentInformationSectionTitle(phcrTreatmentInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validatePhcrTreatmentInformationSection_validatePhcrTreatmentInformationSectionText(phcrTreatmentInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validatePhcrTreatmentInformationSection_validatePhcrTreatmentInformationSectionTherapeuticRegimenAct(phcrTreatmentInformationSection, diagnostics, context);
    return result;
  }

		/**
   * Validates the validatePhcrTreatmentInformationSectionTemplateId constraint of '<em>Treatment Information Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePhcrTreatmentInformationSection_validatePhcrTreatmentInformationSectionTemplateId(PhcrTreatmentInformationSection phcrTreatmentInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return phcrTreatmentInformationSection.validatePhcrTreatmentInformationSectionTemplateId(diagnostics, context);
  }

		/**
   * Validates the validatePhcrTreatmentInformationSectionCode constraint of '<em>Treatment Information Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePhcrTreatmentInformationSection_validatePhcrTreatmentInformationSectionCode(PhcrTreatmentInformationSection phcrTreatmentInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return phcrTreatmentInformationSection.validatePhcrTreatmentInformationSectionCode(diagnostics, context);
  }

		/**
   * Validates the validatePhcrTreatmentInformationSectionCodeP constraint of '<em>Treatment Information Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePhcrTreatmentInformationSection_validatePhcrTreatmentInformationSectionCodeP(PhcrTreatmentInformationSection phcrTreatmentInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return phcrTreatmentInformationSection.validatePhcrTreatmentInformationSectionCodeP(diagnostics, context);
  }

		/**
   * Validates the validatePhcrTreatmentInformationSectionTitle constraint of '<em>Treatment Information Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePhcrTreatmentInformationSection_validatePhcrTreatmentInformationSectionTitle(PhcrTreatmentInformationSection phcrTreatmentInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return phcrTreatmentInformationSection.validatePhcrTreatmentInformationSectionTitle(diagnostics, context);
  }

		/**
   * Validates the validatePhcrTreatmentInformationSectionText constraint of '<em>Treatment Information Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePhcrTreatmentInformationSection_validatePhcrTreatmentInformationSectionText(PhcrTreatmentInformationSection phcrTreatmentInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return phcrTreatmentInformationSection.validatePhcrTreatmentInformationSectionText(diagnostics, context);
  }

		/**
   * Validates the validatePhcrTreatmentInformationSectionTherapeuticRegimenAct constraint of '<em>Treatment Information Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePhcrTreatmentInformationSection_validatePhcrTreatmentInformationSectionTherapeuticRegimenAct(PhcrTreatmentInformationSection phcrTreatmentInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return phcrTreatmentInformationSection.validatePhcrTreatmentInformationSectionTherapeuticRegimenAct(diagnostics, context);
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTherapeuticRegimenAct(TherapeuticRegimenAct therapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(therapeuticRegimenAct, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(therapeuticRegimenAct, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(therapeuticRegimenAct, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(therapeuticRegimenAct, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(therapeuticRegimenAct, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(therapeuticRegimenAct, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(therapeuticRegimenAct, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(therapeuticRegimenAct, diagnostics, context);
    if (result || diagnostics != null) result &= validateTherapeuticRegimenAct_validateTherapeuticRegimenActTemplateId(therapeuticRegimenAct, diagnostics, context);
    if (result || diagnostics != null) result &= validateTherapeuticRegimenAct_validateTherapeuticRegimenActClassCode(therapeuticRegimenAct, diagnostics, context);
    if (result || diagnostics != null) result &= validateTherapeuticRegimenAct_validateTherapeuticRegimenActMoodCode(therapeuticRegimenAct, diagnostics, context);
    if (result || diagnostics != null) result &= validateTherapeuticRegimenAct_validateTherapeuticRegimenActNegationInd(therapeuticRegimenAct, diagnostics, context);
    if (result || diagnostics != null) result &= validateTherapeuticRegimenAct_validateTherapeuticRegimenActCodeP(therapeuticRegimenAct, diagnostics, context);
    if (result || diagnostics != null) result &= validateTherapeuticRegimenAct_validateTherapeuticRegimenActCode(therapeuticRegimenAct, diagnostics, context);
    if (result || diagnostics != null) result &= validateTherapeuticRegimenAct_validateTherapeuticRegimenActStatusCode(therapeuticRegimenAct, diagnostics, context);
    if (result || diagnostics != null) result &= validateTherapeuticRegimenAct_validateTherapeuticRegimenActStatusCodeP(therapeuticRegimenAct, diagnostics, context);
    if (result || diagnostics != null) result &= validateTherapeuticRegimenAct_validateTherapeuticRegimenActTreatmentGivenSubstanceAdministration(therapeuticRegimenAct, diagnostics, context);
    if (result || diagnostics != null) result &= validateTherapeuticRegimenAct_validateTherapeuticRegimenActTreatmentNotGivenSubstanceAdministration(therapeuticRegimenAct, diagnostics, context);
    return result;
  }

		/**
   * Validates the validateTherapeuticRegimenActTemplateId constraint of '<em>Therapeutic Regimen Act</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTherapeuticRegimenAct_validateTherapeuticRegimenActTemplateId(TherapeuticRegimenAct therapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return therapeuticRegimenAct.validateTherapeuticRegimenActTemplateId(diagnostics, context);
  }

		/**
   * Validates the validateTherapeuticRegimenActClassCode constraint of '<em>Therapeutic Regimen Act</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTherapeuticRegimenAct_validateTherapeuticRegimenActClassCode(TherapeuticRegimenAct therapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return therapeuticRegimenAct.validateTherapeuticRegimenActClassCode(diagnostics, context);
  }

		/**
   * Validates the validateTherapeuticRegimenActCode constraint of '<em>Therapeutic Regimen Act</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTherapeuticRegimenAct_validateTherapeuticRegimenActCode(TherapeuticRegimenAct therapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return therapeuticRegimenAct.validateTherapeuticRegimenActCode(diagnostics, context);
  }

		/**
   * Validates the validateTherapeuticRegimenActMoodCode constraint of '<em>Therapeutic Regimen Act</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTherapeuticRegimenAct_validateTherapeuticRegimenActMoodCode(TherapeuticRegimenAct therapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return therapeuticRegimenAct.validateTherapeuticRegimenActMoodCode(diagnostics, context);
  }

		/**
   * Validates the validateTherapeuticRegimenActNegationInd constraint of '<em>Therapeutic Regimen Act</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTherapeuticRegimenAct_validateTherapeuticRegimenActNegationInd(TherapeuticRegimenAct therapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return therapeuticRegimenAct.validateTherapeuticRegimenActNegationInd(diagnostics, context);
  }

		/**
   * Validates the validateTherapeuticRegimenActCodeP constraint of '<em>Therapeutic Regimen Act</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTherapeuticRegimenAct_validateTherapeuticRegimenActCodeP(TherapeuticRegimenAct therapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return therapeuticRegimenAct.validateTherapeuticRegimenActCodeP(diagnostics, context);
  }

		/**
   * Validates the validateTherapeuticRegimenActStatusCode constraint of '<em>Therapeutic Regimen Act</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTherapeuticRegimenAct_validateTherapeuticRegimenActStatusCode(TherapeuticRegimenAct therapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return therapeuticRegimenAct.validateTherapeuticRegimenActStatusCode(diagnostics, context);
  }

		/**
   * Validates the validateTherapeuticRegimenActStatusCodeP constraint of '<em>Therapeutic Regimen Act</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTherapeuticRegimenAct_validateTherapeuticRegimenActStatusCodeP(TherapeuticRegimenAct therapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return therapeuticRegimenAct.validateTherapeuticRegimenActStatusCodeP(diagnostics, context);
  }

		/**
   * Validates the validateTherapeuticRegimenActTreatmentGivenSubstanceAdministration constraint of '<em>Therapeutic Regimen Act</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTherapeuticRegimenAct_validateTherapeuticRegimenActTreatmentGivenSubstanceAdministration(TherapeuticRegimenAct therapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return therapeuticRegimenAct.validateTherapeuticRegimenActTreatmentGivenSubstanceAdministration(diagnostics, context);
  }

		/**
   * Validates the validateTherapeuticRegimenActTreatmentNotGivenSubstanceAdministration constraint of '<em>Therapeutic Regimen Act</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTherapeuticRegimenAct_validateTherapeuticRegimenActTreatmentNotGivenSubstanceAdministration(TherapeuticRegimenAct therapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return therapeuticRegimenAct.validateTherapeuticRegimenActTreatmentNotGivenSubstanceAdministration(diagnostics, context);
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePhcrEncountersSection(PhcrEncountersSection phcrEncountersSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(phcrEncountersSection, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(phcrEncountersSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(phcrEncountersSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(phcrEncountersSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(phcrEncountersSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(phcrEncountersSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(phcrEncountersSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(phcrEncountersSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(phcrEncountersSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(phcrEncountersSection, diagnostics, context);
    if (result || diagnostics != null) result &= validatePhcrEncountersSection_validateEncountersSectionTemplateId(phcrEncountersSection, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateEncountersSection_validateEncountersSectionCode(phcrEncountersSection, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateEncountersSection_validateEncountersSectionTitle(phcrEncountersSection, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateEncountersSection_validateEncountersSectionText(phcrEncountersSection, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateEncountersSection_validateEncountersSectionEncountersActivity(phcrEncountersSection, diagnostics, context);
    if (result || diagnostics != null) result &= validatePhcrEncountersSection_validatePhcrEncountersSectionTitle(phcrEncountersSection, diagnostics, context);
    if (result || diagnostics != null) result &= validatePhcrEncountersSection_validatePhcrEncountersSectionText(phcrEncountersSection, diagnostics, context);
    if (result || diagnostics != null) result &= validatePhcrEncountersSection_validatePhcrEncountersSectionEncountersActivity(phcrEncountersSection, diagnostics, context);
    return result;
  }

		/**
   * Validates the validatePhcrEncountersSectionTitle constraint of '<em>Encounters Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePhcrEncountersSection_validatePhcrEncountersSectionTitle(PhcrEncountersSection phcrEncountersSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return phcrEncountersSection.validatePhcrEncountersSectionTitle(diagnostics, context);
  }

		/**
   * Validates the validatePhcrEncountersSectionText constraint of '<em>Encounters Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePhcrEncountersSection_validatePhcrEncountersSectionText(PhcrEncountersSection phcrEncountersSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return phcrEncountersSection.validatePhcrEncountersSectionText(diagnostics, context);
  }

		/**
   * Validates the validatePhcrEncountersSectionEncountersActivity constraint of '<em>Encounters Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePhcrEncountersSection_validatePhcrEncountersSectionEncountersActivity(PhcrEncountersSection phcrEncountersSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return phcrEncountersSection.validatePhcrEncountersSectionEncountersActivity(diagnostics, context);
  }

		/**
   * Validates the validateEncountersSectionTemplateId constraint of '<em>Encounters Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePhcrEncountersSection_validateEncountersSectionTemplateId(PhcrEncountersSection phcrEncountersSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    // TODO override the constraint, if desired
    // -> uncomment the scaffolding
    // -> specify the condition that violates the constraint
    // -> verify the diagnostic details, including severity, code, and message
    // Ensure that you remove @generated or mark it @generated NOT
    if (false)
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (createDiagnostic
            (Diagnostic.ERROR,
             DIAGNOSTIC_SOURCE,
             0,
             "_UI_GenericConstraint_diagnostic",
             new Object[] { "validateEncountersSectionTemplateId", getObjectLabel(phcrEncountersSection, context) },
             new Object[] { phcrEncountersSection },
             context));
      }
      return false;
    }
    return ccdValidator.validateEncountersSection_validateEncountersSectionTemplateId(phcrEncountersSection, diagnostics, context);
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePhcrRelevantDxTestsSection(PhcrRelevantDxTestsSection phcrRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(phcrRelevantDxTestsSection, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(phcrRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(phcrRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(phcrRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(phcrRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(phcrRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(phcrRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(phcrRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(phcrRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(phcrRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validatePhcrRelevantDxTestsSection_validateResultsSectionTemplateId(phcrRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionCode(phcrRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionTitle(phcrRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionText(phcrRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionResultOrganizer(phcrRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionCodeP(phcrRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionCode(phcrRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionTitle(phcrRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionText(phcrRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionResultOrganizer(phcrRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionResultObservation(phcrRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionImagingObservation(phcrRelevantDxTestsSection, diagnostics, context);
    return result;
  }

		/**
   * Validates the validatePhcrRelevantDxTestsSectionCodeP constraint of '<em>Relevant Dx Tests Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionCodeP(PhcrRelevantDxTestsSection phcrRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return phcrRelevantDxTestsSection.validatePhcrRelevantDxTestsSectionCodeP(diagnostics, context);
  }

    /**
   * Validates the validatePhcrRelevantDxTestsSectionCode constraint of '<em>Relevant Dx Tests Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionCode(PhcrRelevantDxTestsSection phcrRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return phcrRelevantDxTestsSection.validatePhcrRelevantDxTestsSectionCode(diagnostics, context);
  }

		/**
   * Validates the validatePhcrRelevantDxTestsSectionTitle constraint of '<em>Relevant Dx Tests Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionTitle(PhcrRelevantDxTestsSection phcrRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return phcrRelevantDxTestsSection.validatePhcrRelevantDxTestsSectionTitle(diagnostics, context);
  }

		/**
   * Validates the validatePhcrRelevantDxTestsSectionText constraint of '<em>Relevant Dx Tests Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionText(PhcrRelevantDxTestsSection phcrRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return phcrRelevantDxTestsSection.validatePhcrRelevantDxTestsSectionText(diagnostics, context);
  }

		/**
   * Validates the validatePhcrRelevantDxTestsSectionResultOrganizer constraint of '<em>Relevant Dx Tests Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionResultOrganizer(PhcrRelevantDxTestsSection phcrRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return phcrRelevantDxTestsSection.validatePhcrRelevantDxTestsSectionResultOrganizer(diagnostics, context);
  }

		/**
   * Validates the validatePhcrRelevantDxTestsSectionResultObservation constraint of '<em>Relevant Dx Tests Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionResultObservation(PhcrRelevantDxTestsSection phcrRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return phcrRelevantDxTestsSection.validatePhcrRelevantDxTestsSectionResultObservation(diagnostics, context);
  }

		/**
   * Validates the validatePhcrRelevantDxTestsSectionImagingObservation constraint of '<em>Relevant Dx Tests Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionImagingObservation(PhcrRelevantDxTestsSection phcrRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return phcrRelevantDxTestsSection.validatePhcrRelevantDxTestsSectionImagingObservation(diagnostics, context);
  }

		/**
   * Validates the validateResultsSectionTemplateId constraint of '<em>Relevant Dx Tests Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePhcrRelevantDxTestsSection_validateResultsSectionTemplateId(PhcrRelevantDxTestsSection phcrRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    // TODO override the constraint, if desired
    // -> uncomment the scaffolding
    // -> specify the condition that violates the constraint
    // -> verify the diagnostic details, including severity, code, and message
    // Ensure that you remove @generated or mark it @generated NOT
    if (false)
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (createDiagnostic
            (Diagnostic.ERROR,
             DIAGNOSTIC_SOURCE,
             0,
             "_UI_GenericConstraint_diagnostic",
             new Object[] { "validateResultsSectionTemplateId", getObjectLabel(phcrRelevantDxTestsSection, context) },
             new Object[] { phcrRelevantDxTestsSection },
             context));
      }
      return false;
    }
    return ccdValidator.validateResultsSection_validateResultsSectionTemplateId(phcrRelevantDxTestsSection, diagnostics, context);
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateResultOrganizer(ResultOrganizer resultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(resultOrganizer, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(resultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(resultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(resultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(resultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerCodeValue(resultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerComponentElement(resultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerInformationSource(resultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validateResultOrganizer_validateResultOrganizerTemplateId(resultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerMoodCode(resultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerId(resultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerCode(resultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerStatusCode(resultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerResultObservation(resultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validateResultOrganizer_validatePHCRResultOrganizerClassCode(resultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validateResultOrganizer_validatePHCRResultOrganizerMoodCode(resultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validateResultOrganizer_validatePHCRResultOrganizerId(resultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validateResultOrganizer_validatePHCRResultOrganizerCode(resultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validateResultOrganizer_validatePHCRResultOrganizerStatusCodeP(resultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validateResultOrganizer_validatePHCRResultOrganizerStatusCode(resultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validateResultOrganizer_validatePHCRResultOrganizerEffectiveTime(resultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validateResultOrganizer_validatePHCRResultOrganizerResultObservation(resultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validateResultOrganizer_validatePHCRResultOrganizerSpecimenCollectionProcedure(resultOrganizer, diagnostics, context);
    return result;
  }

		/**
   * Validates the validatePHCRResultOrganizerClassCode constraint of '<em>Result Organizer</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateResultOrganizer_validatePHCRResultOrganizerClassCode(ResultOrganizer resultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return resultOrganizer.validatePHCRResultOrganizerClassCode(diagnostics, context);
  }

		/**
   * Validates the validatePHCRResultOrganizerMoodCode constraint of '<em>Result Organizer</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateResultOrganizer_validatePHCRResultOrganizerMoodCode(ResultOrganizer resultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return resultOrganizer.validatePHCRResultOrganizerMoodCode(diagnostics, context);
  }

		/**
   * Validates the validatePHCRResultOrganizerId constraint of '<em>Result Organizer</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateResultOrganizer_validatePHCRResultOrganizerId(ResultOrganizer resultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return resultOrganizer.validatePHCRResultOrganizerId(diagnostics, context);
  }

		/**
   * Validates the validatePHCRResultOrganizerCode constraint of '<em>Result Organizer</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateResultOrganizer_validatePHCRResultOrganizerCode(ResultOrganizer resultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return resultOrganizer.validatePHCRResultOrganizerCode(diagnostics, context);
  }

		/**
   * Validates the validatePHCRResultOrganizerStatusCodeP constraint of '<em>Result Organizer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateResultOrganizer_validatePHCRResultOrganizerStatusCodeP(ResultOrganizer resultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return resultOrganizer.validatePHCRResultOrganizerStatusCodeP(diagnostics, context);
  }

    /**
   * Validates the validatePHCRResultOrganizerStatusCode constraint of '<em>Result Organizer</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateResultOrganizer_validatePHCRResultOrganizerStatusCode(ResultOrganizer resultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return resultOrganizer.validatePHCRResultOrganizerStatusCode(diagnostics, context);
  }

		/**
   * Validates the validatePHCRResultOrganizerEffectiveTime constraint of '<em>Result Organizer</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateResultOrganizer_validatePHCRResultOrganizerEffectiveTime(ResultOrganizer resultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return resultOrganizer.validatePHCRResultOrganizerEffectiveTime(diagnostics, context);
  }

		/**
   * Validates the validatePHCRResultOrganizerResultObservation constraint of '<em>Result Organizer</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateResultOrganizer_validatePHCRResultOrganizerResultObservation(ResultOrganizer resultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return resultOrganizer.validatePHCRResultOrganizerResultObservation(diagnostics, context);
  }

		/**
   * Validates the validatePHCRResultOrganizerSpecimenCollectionProcedure constraint of '<em>Result Organizer</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateResultOrganizer_validatePHCRResultOrganizerSpecimenCollectionProcedure(ResultOrganizer resultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return resultOrganizer.validatePHCRResultOrganizerSpecimenCollectionProcedure(diagnostics, context);
  }

		/**
   * Validates the validateResultOrganizerTemplateId constraint of '<em>Result Organizer</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateResultOrganizer_validateResultOrganizerTemplateId(ResultOrganizer resultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
    // TODO override the constraint, if desired
    // -> uncomment the scaffolding
    // -> specify the condition that violates the constraint
    // -> verify the diagnostic details, including severity, code, and message
    // Ensure that you remove @generated or mark it @generated NOT
    if (false)
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (createDiagnostic
            (Diagnostic.ERROR,
             DIAGNOSTIC_SOURCE,
             0,
             "_UI_GenericConstraint_diagnostic",
             new Object[] { "validateResultOrganizerTemplateId", getObjectLabel(resultOrganizer, context) },
             new Object[] { resultOrganizer },
             context));
      }
      return false;
    }
    return ccdValidator.validateResultOrganizer_validateResultOrganizerTemplateId(resultOrganizer, diagnostics, context);
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateResultObservation(ResultObservation resultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(resultObservation, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(resultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(resultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(resultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(resultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationCodeValue(resultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationReferenceRangeRequired(resultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationNoObservationRangeCode(resultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationInformationSource(resultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateResultObservation_validateResultObservationTemplateId(resultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationMoodCode(resultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationId(resultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationEffectiveTime(resultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationStatusCode(resultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationCode(resultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationMethodCode(resultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationInterpretationCode(resultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationValue(resultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateResultObservation_validatePHCRResultObservationClassCode(resultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateResultObservation_validatePHCRResultObservationStatusCodeP(resultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateResultObservation_validatePHCRResultObservationStatusCode(resultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateResultObservation_validatePHCRResultObservationSpecimenCollectionProcedure(resultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateResultObservation_validatePHCRResultObservationSusceptibilityResult(resultObservation, diagnostics, context);
    return result;
  }

		/**
   * Validates the validatePHCRResultObservationClassCode constraint of '<em>Result Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateResultObservation_validatePHCRResultObservationClassCode(ResultObservation resultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return resultObservation.validatePHCRResultObservationClassCode(diagnostics, context);
  }

		/**
   * Validates the validatePHCRResultObservationStatusCodeP constraint of '<em>Result Observation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateResultObservation_validatePHCRResultObservationStatusCodeP(ResultObservation resultObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return resultObservation.validatePHCRResultObservationStatusCodeP(diagnostics, context);
  }

    /**
   * Validates the validatePHCRResultObservationStatusCode constraint of '<em>Result Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateResultObservation_validatePHCRResultObservationStatusCode(ResultObservation resultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return resultObservation.validatePHCRResultObservationStatusCode(diagnostics, context);
  }

		/**
   * Validates the validatePHCRResultObservationSpecimenCollectionProcedure constraint of '<em>Result Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateResultObservation_validatePHCRResultObservationSpecimenCollectionProcedure(ResultObservation resultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return resultObservation.validatePHCRResultObservationSpecimenCollectionProcedure(diagnostics, context);
  }

		/**
   * Validates the validatePHCRResultObservationSusceptibilityResult constraint of '<em>Result Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateResultObservation_validatePHCRResultObservationSusceptibilityResult(ResultObservation resultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return resultObservation.validatePHCRResultObservationSusceptibilityResult(diagnostics, context);
  }

		/**
   * Validates the validateResultObservationTemplateId constraint of '<em>Result Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateResultObservation_validateResultObservationTemplateId(ResultObservation resultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    // TODO override the constraint, if desired
    // -> uncomment the scaffolding
    // -> specify the condition that violates the constraint
    // -> verify the diagnostic details, including severity, code, and message
    // Ensure that you remove @generated or mark it @generated NOT
    if (false)
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (createDiagnostic
            (Diagnostic.ERROR,
             DIAGNOSTIC_SOURCE,
             0,
             "_UI_GenericConstraint_diagnostic",
             new Object[] { "validateResultObservationTemplateId", getObjectLabel(resultObservation, context) },
             new Object[] { resultObservation },
             context));
      }
      return false;
    }
    return ccdValidator.validateResultObservation_validateResultObservationTemplateId(resultObservation, diagnostics, context);
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSpecimenCollectionProcedure(SpecimenCollectionProcedure specimenCollectionProcedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(specimenCollectionProcedure, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(specimenCollectionProcedure, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(specimenCollectionProcedure, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(specimenCollectionProcedure, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(specimenCollectionProcedure, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(specimenCollectionProcedure, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(specimenCollectionProcedure, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(specimenCollectionProcedure, diagnostics, context);
    if (result || diagnostics != null) result &= validateSpecimenCollectionProcedure_validateSpecimenCollectionProcedureTemplateId(specimenCollectionProcedure, diagnostics, context);
    if (result || diagnostics != null) result &= validateSpecimenCollectionProcedure_validateSpecimenCollectionProcedureClassCode(specimenCollectionProcedure, diagnostics, context);
    if (result || diagnostics != null) result &= validateSpecimenCollectionProcedure_validateSpecimenCollectionProcedureMoodCode(specimenCollectionProcedure, diagnostics, context);
    if (result || diagnostics != null) result &= validateSpecimenCollectionProcedure_validateSpecimenCollectionProcedureCode(specimenCollectionProcedure, diagnostics, context);
    if (result || diagnostics != null) result &= validateSpecimenCollectionProcedure_validateSpecimenCollectionProcedureEffectiveTime(specimenCollectionProcedure, diagnostics, context);
    if (result || diagnostics != null) result &= validateSpecimenCollectionProcedure_validateSpecimenCollectionProcedureTargetSiteCode(specimenCollectionProcedure, diagnostics, context);
    return result;
  }

		/**
   * Validates the validateSpecimenCollectionProcedureTemplateId constraint of '<em>Specimen Collection Procedure</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSpecimenCollectionProcedure_validateSpecimenCollectionProcedureTemplateId(SpecimenCollectionProcedure specimenCollectionProcedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return specimenCollectionProcedure.validateSpecimenCollectionProcedureTemplateId(diagnostics, context);
  }

		/**
   * Validates the validateSpecimenCollectionProcedureClassCode constraint of '<em>Specimen Collection Procedure</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSpecimenCollectionProcedure_validateSpecimenCollectionProcedureClassCode(SpecimenCollectionProcedure specimenCollectionProcedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return specimenCollectionProcedure.validateSpecimenCollectionProcedureClassCode(diagnostics, context);
  }

		/**
   * Validates the validateSpecimenCollectionProcedureMoodCode constraint of '<em>Specimen Collection Procedure</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSpecimenCollectionProcedure_validateSpecimenCollectionProcedureMoodCode(SpecimenCollectionProcedure specimenCollectionProcedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return specimenCollectionProcedure.validateSpecimenCollectionProcedureMoodCode(diagnostics, context);
  }

		/**
   * Validates the validateSpecimenCollectionProcedureCode constraint of '<em>Specimen Collection Procedure</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSpecimenCollectionProcedure_validateSpecimenCollectionProcedureCode(SpecimenCollectionProcedure specimenCollectionProcedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return specimenCollectionProcedure.validateSpecimenCollectionProcedureCode(diagnostics, context);
  }

		/**
   * Validates the validateSpecimenCollectionProcedureEffectiveTime constraint of '<em>Specimen Collection Procedure</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSpecimenCollectionProcedure_validateSpecimenCollectionProcedureEffectiveTime(SpecimenCollectionProcedure specimenCollectionProcedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return specimenCollectionProcedure.validateSpecimenCollectionProcedureEffectiveTime(diagnostics, context);
  }

		/**
   * Validates the validateSpecimenCollectionProcedureTargetSiteCode constraint of '<em>Specimen Collection Procedure</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSpecimenCollectionProcedure_validateSpecimenCollectionProcedureTargetSiteCode(SpecimenCollectionProcedure specimenCollectionProcedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return specimenCollectionProcedure.validateSpecimenCollectionProcedureTargetSiteCode(diagnostics, context);
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateImagingObservation(ImagingObservation imagingObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(imagingObservation, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(imagingObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(imagingObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(imagingObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(imagingObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(imagingObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(imagingObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(imagingObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationInformationSource(imagingObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationContainsPatientAwareness(imagingObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateImagingObservation_validateProblemObservationTemplateId(imagingObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationMoodCode(imagingObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationStatusCode(imagingObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationEffectiveTime(imagingObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationProblemStatus(imagingObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationProblemHealthStatus(imagingObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationAgeObservation(imagingObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateImagingObservation_validateImagingObservationClassCode(imagingObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateImagingObservation_validateImagingObservationMoodCode(imagingObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateImagingObservation_validateImagingObservationId(imagingObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateImagingObservation_validateImagingObservationCode(imagingObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateImagingObservation_validateImagingObservationStatusCodeP(imagingObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateImagingObservation_validateImagingObservationStatusCode(imagingObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateImagingObservation_validateImagingObservationEffectiveTime(imagingObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateImagingObservation_validateImagingObservationValue(imagingObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateImagingObservation_validateImagingObservationMethodCode(imagingObservation, diagnostics, context);
    return result;
  }

		/**
   * Validates the validateImagingObservationClassCode constraint of '<em>Imaging Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateImagingObservation_validateImagingObservationClassCode(ImagingObservation imagingObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return imagingObservation.validateImagingObservationClassCode(diagnostics, context);
  }

		/**
   * Validates the validateImagingObservationMoodCode constraint of '<em>Imaging Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateImagingObservation_validateImagingObservationMoodCode(ImagingObservation imagingObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return imagingObservation.validateImagingObservationMoodCode(diagnostics, context);
  }

		/**
   * Validates the validateImagingObservationId constraint of '<em>Imaging Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateImagingObservation_validateImagingObservationId(ImagingObservation imagingObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return imagingObservation.validateImagingObservationId(diagnostics, context);
  }

		/**
   * Validates the validateImagingObservationCode constraint of '<em>Imaging Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateImagingObservation_validateImagingObservationCode(ImagingObservation imagingObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return imagingObservation.validateImagingObservationCode(diagnostics, context);
  }

		/**
   * Validates the validateImagingObservationStatusCodeP constraint of '<em>Imaging Observation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateImagingObservation_validateImagingObservationStatusCodeP(ImagingObservation imagingObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return imagingObservation.validateImagingObservationStatusCodeP(diagnostics, context);
  }

    /**
   * Validates the validateImagingObservationStatusCode constraint of '<em>Imaging Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateImagingObservation_validateImagingObservationStatusCode(ImagingObservation imagingObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return imagingObservation.validateImagingObservationStatusCode(diagnostics, context);
  }

		/**
   * Validates the validateImagingObservationEffectiveTime constraint of '<em>Imaging Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateImagingObservation_validateImagingObservationEffectiveTime(ImagingObservation imagingObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return imagingObservation.validateImagingObservationEffectiveTime(diagnostics, context);
  }

		/**
   * Validates the validateImagingObservationValue constraint of '<em>Imaging Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateImagingObservation_validateImagingObservationValue(ImagingObservation imagingObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return imagingObservation.validateImagingObservationValue(diagnostics, context);
  }

		/**
   * Validates the validateImagingObservationMethodCode constraint of '<em>Imaging Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateImagingObservation_validateImagingObservationMethodCode(ImagingObservation imagingObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return imagingObservation.validateImagingObservationMethodCode(diagnostics, context);
  }

		/**
   * Validates the validateProblemObservationTemplateId constraint of '<em>Imaging Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateImagingObservation_validateProblemObservationTemplateId(ImagingObservation imagingObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    // TODO override the constraint, if desired
    // -> uncomment the scaffolding
    // -> specify the condition that violates the constraint
    // -> verify the diagnostic details, including severity, code, and message
    // Ensure that you remove @generated or mark it @generated NOT
    if (false)
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (createDiagnostic
            (Diagnostic.ERROR,
             DIAGNOSTIC_SOURCE,
             0,
             "_UI_GenericConstraint_diagnostic",
             new Object[] { "validateProblemObservationTemplateId", getObjectLabel(imagingObservation, context) },
             new Object[] { imagingObservation },
             context));
      }
      return false;
    }
    return ccdValidator.validateProblemObservation_validateProblemObservationTemplateId(imagingObservation, diagnostics, context);
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePatientConditionAliveObservation(PatientConditionAliveObservation patientConditionAliveObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(patientConditionAliveObservation, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(patientConditionAliveObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(patientConditionAliveObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(patientConditionAliveObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(patientConditionAliveObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(patientConditionAliveObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(patientConditionAliveObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(patientConditionAliveObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validatePatientConditionAliveObservation_validatePatientConditionAliveObservationTemplateId(patientConditionAliveObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validatePatientConditionAliveObservation_validatePatientConditionAliveObservationClassCode(patientConditionAliveObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validatePatientConditionAliveObservation_validatePatientConditionAliveObservationMoodCode(patientConditionAliveObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validatePatientConditionAliveObservation_validatePatientConditionAliveObservationCodeP(patientConditionAliveObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validatePatientConditionAliveObservation_validatePatientConditionAliveObservationCode(patientConditionAliveObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validatePatientConditionAliveObservation_validatePatientConditionAliveObservationStatusCode(patientConditionAliveObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validatePatientConditionAliveObservation_validatePatientConditionAliveObservationStatusCodeP(patientConditionAliveObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validatePatientConditionAliveObservation_validatePatientConditionAliveObservationEffectiveTime(patientConditionAliveObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validatePatientConditionAliveObservation_validatePatientConditionAliveObservationValue(patientConditionAliveObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validatePatientConditionAliveObservation_validatePatientConditionAliveObservationValueP(patientConditionAliveObservation, diagnostics, context);
    return result;
  }

		/**
   * Validates the validatePatientConditionAliveObservationTemplateId constraint of '<em>Patient Condition Alive Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePatientConditionAliveObservation_validatePatientConditionAliveObservationTemplateId(PatientConditionAliveObservation patientConditionAliveObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return patientConditionAliveObservation.validatePatientConditionAliveObservationTemplateId(diagnostics, context);
  }

		/**
   * Validates the validatePatientConditionAliveObservationClassCode constraint of '<em>Patient Condition Alive Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePatientConditionAliveObservation_validatePatientConditionAliveObservationClassCode(PatientConditionAliveObservation patientConditionAliveObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return patientConditionAliveObservation.validatePatientConditionAliveObservationClassCode(diagnostics, context);
  }

		/**
   * Validates the validatePatientConditionAliveObservationCode constraint of '<em>Patient Condition Alive Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePatientConditionAliveObservation_validatePatientConditionAliveObservationCode(PatientConditionAliveObservation patientConditionAliveObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return patientConditionAliveObservation.validatePatientConditionAliveObservationCode(diagnostics, context);
  }

		/**
   * Validates the validatePatientConditionAliveObservationMoodCode constraint of '<em>Patient Condition Alive Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePatientConditionAliveObservation_validatePatientConditionAliveObservationMoodCode(PatientConditionAliveObservation patientConditionAliveObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return patientConditionAliveObservation.validatePatientConditionAliveObservationMoodCode(diagnostics, context);
  }

		/**
   * Validates the validatePatientConditionAliveObservationCodeP constraint of '<em>Patient Condition Alive Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePatientConditionAliveObservation_validatePatientConditionAliveObservationCodeP(PatientConditionAliveObservation patientConditionAliveObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return patientConditionAliveObservation.validatePatientConditionAliveObservationCodeP(diagnostics, context);
  }

		/**
   * Validates the validatePatientConditionAliveObservationStatusCode constraint of '<em>Patient Condition Alive Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePatientConditionAliveObservation_validatePatientConditionAliveObservationStatusCode(PatientConditionAliveObservation patientConditionAliveObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return patientConditionAliveObservation.validatePatientConditionAliveObservationStatusCode(diagnostics, context);
  }

		/**
   * Validates the validatePatientConditionAliveObservationStatusCodeP constraint of '<em>Patient Condition Alive Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePatientConditionAliveObservation_validatePatientConditionAliveObservationStatusCodeP(PatientConditionAliveObservation patientConditionAliveObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return patientConditionAliveObservation.validatePatientConditionAliveObservationStatusCodeP(diagnostics, context);
  }

		/**
   * Validates the validatePatientConditionAliveObservationValue constraint of '<em>Patient Condition Alive Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePatientConditionAliveObservation_validatePatientConditionAliveObservationValue(PatientConditionAliveObservation patientConditionAliveObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return patientConditionAliveObservation.validatePatientConditionAliveObservationValue(diagnostics, context);
  }

		/**
   * Validates the validatePatientConditionAliveObservationValueP constraint of '<em>Patient Condition Alive Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePatientConditionAliveObservation_validatePatientConditionAliveObservationValueP(PatientConditionAliveObservation patientConditionAliveObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return patientConditionAliveObservation.validatePatientConditionAliveObservationValueP(diagnostics, context);
  }

		/**
   * Validates the validatePatientConditionAliveObservationEffectiveTime constraint of '<em>Patient Condition Alive Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePatientConditionAliveObservation_validatePatientConditionAliveObservationEffectiveTime(PatientConditionAliveObservation patientConditionAliveObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return patientConditionAliveObservation.validatePatientConditionAliveObservationEffectiveTime(diagnostics, context);
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePatientConditionDeceasedObservation(PatientConditionDeceasedObservation patientConditionDeceasedObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(patientConditionDeceasedObservation, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(patientConditionDeceasedObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(patientConditionDeceasedObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(patientConditionDeceasedObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(patientConditionDeceasedObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(patientConditionDeceasedObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(patientConditionDeceasedObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(patientConditionDeceasedObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validatePatientConditionDeceasedObservation_validatePatientConditionDeceasedObservationTemplateId(patientConditionDeceasedObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validatePatientConditionDeceasedObservation_validatePatientConditionDeceasedObservationClassCode(patientConditionDeceasedObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validatePatientConditionDeceasedObservation_validatePatientConditionDeceasedObservationMoodCode(patientConditionDeceasedObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validatePatientConditionDeceasedObservation_validatePatientConditionDeceasedObservationCodeP(patientConditionDeceasedObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validatePatientConditionDeceasedObservation_validatePatientConditionDeceasedObservationCode(patientConditionDeceasedObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validatePatientConditionDeceasedObservation_validatePatientConditionDeceasedObservationStatusCode(patientConditionDeceasedObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validatePatientConditionDeceasedObservation_validatePatientConditionDeceasedObservationStatusCodeP(patientConditionDeceasedObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validatePatientConditionDeceasedObservation_validatePatientConditionDeceasedObservationEffectiveTime(patientConditionDeceasedObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validatePatientConditionDeceasedObservation_validatePatientConditionDeceasedObservationValue(patientConditionDeceasedObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validatePatientConditionDeceasedObservation_validatePatientConditionDeceasedObservationValueP(patientConditionDeceasedObservation, diagnostics, context);
    return result;
  }

		/**
   * Validates the validatePatientConditionDeceasedObservationTemplateId constraint of '<em>Patient Condition Deceased Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePatientConditionDeceasedObservation_validatePatientConditionDeceasedObservationTemplateId(PatientConditionDeceasedObservation patientConditionDeceasedObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return patientConditionDeceasedObservation.validatePatientConditionDeceasedObservationTemplateId(diagnostics, context);
  }

		/**
   * Validates the validatePatientConditionDeceasedObservationClassCode constraint of '<em>Patient Condition Deceased Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePatientConditionDeceasedObservation_validatePatientConditionDeceasedObservationClassCode(PatientConditionDeceasedObservation patientConditionDeceasedObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return patientConditionDeceasedObservation.validatePatientConditionDeceasedObservationClassCode(diagnostics, context);
  }

		/**
   * Validates the validatePatientConditionDeceasedObservationCode constraint of '<em>Patient Condition Deceased Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePatientConditionDeceasedObservation_validatePatientConditionDeceasedObservationCode(PatientConditionDeceasedObservation patientConditionDeceasedObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return patientConditionDeceasedObservation.validatePatientConditionDeceasedObservationCode(diagnostics, context);
  }

		/**
   * Validates the validatePatientConditionDeceasedObservationMoodCode constraint of '<em>Patient Condition Deceased Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePatientConditionDeceasedObservation_validatePatientConditionDeceasedObservationMoodCode(PatientConditionDeceasedObservation patientConditionDeceasedObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return patientConditionDeceasedObservation.validatePatientConditionDeceasedObservationMoodCode(diagnostics, context);
  }

		/**
   * Validates the validatePatientConditionDeceasedObservationCodeP constraint of '<em>Patient Condition Deceased Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePatientConditionDeceasedObservation_validatePatientConditionDeceasedObservationCodeP(PatientConditionDeceasedObservation patientConditionDeceasedObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return patientConditionDeceasedObservation.validatePatientConditionDeceasedObservationCodeP(diagnostics, context);
  }

		/**
   * Validates the validatePatientConditionDeceasedObservationStatusCode constraint of '<em>Patient Condition Deceased Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePatientConditionDeceasedObservation_validatePatientConditionDeceasedObservationStatusCode(PatientConditionDeceasedObservation patientConditionDeceasedObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return patientConditionDeceasedObservation.validatePatientConditionDeceasedObservationStatusCode(diagnostics, context);
  }

		/**
   * Validates the validatePatientConditionDeceasedObservationStatusCodeP constraint of '<em>Patient Condition Deceased Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePatientConditionDeceasedObservation_validatePatientConditionDeceasedObservationStatusCodeP(PatientConditionDeceasedObservation patientConditionDeceasedObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return patientConditionDeceasedObservation.validatePatientConditionDeceasedObservationStatusCodeP(diagnostics, context);
  }

		/**
   * Validates the validatePatientConditionDeceasedObservationValue constraint of '<em>Patient Condition Deceased Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePatientConditionDeceasedObservation_validatePatientConditionDeceasedObservationValue(PatientConditionDeceasedObservation patientConditionDeceasedObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return patientConditionDeceasedObservation.validatePatientConditionDeceasedObservationValue(diagnostics, context);
  }

		/**
   * Validates the validatePatientConditionDeceasedObservationValueP constraint of '<em>Patient Condition Deceased Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePatientConditionDeceasedObservation_validatePatientConditionDeceasedObservationValueP(PatientConditionDeceasedObservation patientConditionDeceasedObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return patientConditionDeceasedObservation.validatePatientConditionDeceasedObservationValueP(diagnostics, context);
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePhcrRelevantMedicalConditionHistoryObservation(PhcrRelevantMedicalConditionHistoryObservation phcrRelevantMedicalConditionHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(phcrRelevantMedicalConditionHistoryObservation, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(phcrRelevantMedicalConditionHistoryObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(phcrRelevantMedicalConditionHistoryObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(phcrRelevantMedicalConditionHistoryObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(phcrRelevantMedicalConditionHistoryObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(phcrRelevantMedicalConditionHistoryObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(phcrRelevantMedicalConditionHistoryObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(phcrRelevantMedicalConditionHistoryObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validatePhcrRelevantMedicalConditionHistoryObservation_validatePhcrRelevantMedicalConditionHistoryObservationTemplateId(phcrRelevantMedicalConditionHistoryObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validatePhcrRelevantMedicalConditionHistoryObservation_validatePhcrRelevantMedicalConditionHistoryObservationClassCode(phcrRelevantMedicalConditionHistoryObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validatePhcrRelevantMedicalConditionHistoryObservation_validatePhcrRelevantMedicalConditionHistoryObservationCodeP(phcrRelevantMedicalConditionHistoryObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validatePhcrRelevantMedicalConditionHistoryObservation_validatePhcrRelevantMedicalConditionHistoryObservationCode(phcrRelevantMedicalConditionHistoryObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validatePhcrRelevantMedicalConditionHistoryObservation_validatePhcrRelevantMedicalConditionHistoryObservationEffectiveTime(phcrRelevantMedicalConditionHistoryObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validatePhcrRelevantMedicalConditionHistoryObservation_validatePhcrRelevantMedicalConditionHistoryObservationMoodCode(phcrRelevantMedicalConditionHistoryObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validatePhcrRelevantMedicalConditionHistoryObservation_validatePhcrRelevantMedicalConditionHistoryObservationNegationInd(phcrRelevantMedicalConditionHistoryObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validatePhcrRelevantMedicalConditionHistoryObservation_validatePhcrRelevantMedicalConditionHistoryObservationStatusCode(phcrRelevantMedicalConditionHistoryObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validatePhcrRelevantMedicalConditionHistoryObservation_validatePhcrRelevantMedicalConditionHistoryObservationStatusCodeP(phcrRelevantMedicalConditionHistoryObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validatePhcrRelevantMedicalConditionHistoryObservation_validatePhcrRelevantMedicalConditionHistoryObservationProblemObservation(phcrRelevantMedicalConditionHistoryObservation, diagnostics, context);
    return result;
  }

		/**
   * Validates the validatePhcrRelevantMedicalConditionHistoryObservationTemplateId constraint of '<em>Relevant Medical Condition History Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePhcrRelevantMedicalConditionHistoryObservation_validatePhcrRelevantMedicalConditionHistoryObservationTemplateId(PhcrRelevantMedicalConditionHistoryObservation phcrRelevantMedicalConditionHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return phcrRelevantMedicalConditionHistoryObservation.validatePhcrRelevantMedicalConditionHistoryObservationTemplateId(diagnostics, context);
  }

		/**
   * Validates the validatePhcrRelevantMedicalConditionHistoryObservationClassCode constraint of '<em>Relevant Medical Condition History Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePhcrRelevantMedicalConditionHistoryObservation_validatePhcrRelevantMedicalConditionHistoryObservationClassCode(PhcrRelevantMedicalConditionHistoryObservation phcrRelevantMedicalConditionHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return phcrRelevantMedicalConditionHistoryObservation.validatePhcrRelevantMedicalConditionHistoryObservationClassCode(diagnostics, context);
  }

		/**
   * Validates the validatePhcrRelevantMedicalConditionHistoryObservationCodeP constraint of '<em>Relevant Medical Condition History Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePhcrRelevantMedicalConditionHistoryObservation_validatePhcrRelevantMedicalConditionHistoryObservationCodeP(PhcrRelevantMedicalConditionHistoryObservation phcrRelevantMedicalConditionHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return phcrRelevantMedicalConditionHistoryObservation.validatePhcrRelevantMedicalConditionHistoryObservationCodeP(diagnostics, context);
  }

		/**
   * Validates the validatePhcrRelevantMedicalConditionHistoryObservationCode constraint of '<em>Relevant Medical Condition History Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePhcrRelevantMedicalConditionHistoryObservation_validatePhcrRelevantMedicalConditionHistoryObservationCode(PhcrRelevantMedicalConditionHistoryObservation phcrRelevantMedicalConditionHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return phcrRelevantMedicalConditionHistoryObservation.validatePhcrRelevantMedicalConditionHistoryObservationCode(diagnostics, context);
  }

		/**
   * Validates the validatePhcrRelevantMedicalConditionHistoryObservationEffectiveTime constraint of '<em>Relevant Medical Condition History Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePhcrRelevantMedicalConditionHistoryObservation_validatePhcrRelevantMedicalConditionHistoryObservationEffectiveTime(PhcrRelevantMedicalConditionHistoryObservation phcrRelevantMedicalConditionHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return phcrRelevantMedicalConditionHistoryObservation.validatePhcrRelevantMedicalConditionHistoryObservationEffectiveTime(diagnostics, context);
  }

		/**
   * Validates the validatePhcrRelevantMedicalConditionHistoryObservationMoodCode constraint of '<em>Relevant Medical Condition History Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePhcrRelevantMedicalConditionHistoryObservation_validatePhcrRelevantMedicalConditionHistoryObservationMoodCode(PhcrRelevantMedicalConditionHistoryObservation phcrRelevantMedicalConditionHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return phcrRelevantMedicalConditionHistoryObservation.validatePhcrRelevantMedicalConditionHistoryObservationMoodCode(diagnostics, context);
  }

		/**
   * Validates the validatePhcrRelevantMedicalConditionHistoryObservationNegationInd constraint of '<em>Relevant Medical Condition History Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePhcrRelevantMedicalConditionHistoryObservation_validatePhcrRelevantMedicalConditionHistoryObservationNegationInd(PhcrRelevantMedicalConditionHistoryObservation phcrRelevantMedicalConditionHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return phcrRelevantMedicalConditionHistoryObservation.validatePhcrRelevantMedicalConditionHistoryObservationNegationInd(diagnostics, context);
  }

		/**
   * Validates the validatePhcrRelevantMedicalConditionHistoryObservationStatusCode constraint of '<em>Relevant Medical Condition History Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePhcrRelevantMedicalConditionHistoryObservation_validatePhcrRelevantMedicalConditionHistoryObservationStatusCode(PhcrRelevantMedicalConditionHistoryObservation phcrRelevantMedicalConditionHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return phcrRelevantMedicalConditionHistoryObservation.validatePhcrRelevantMedicalConditionHistoryObservationStatusCode(diagnostics, context);
  }

		/**
   * Validates the validatePhcrRelevantMedicalConditionHistoryObservationStatusCodeP constraint of '<em>Relevant Medical Condition History Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePhcrRelevantMedicalConditionHistoryObservation_validatePhcrRelevantMedicalConditionHistoryObservationStatusCodeP(PhcrRelevantMedicalConditionHistoryObservation phcrRelevantMedicalConditionHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return phcrRelevantMedicalConditionHistoryObservation.validatePhcrRelevantMedicalConditionHistoryObservationStatusCodeP(diagnostics, context);
  }

		/**
   * Validates the validatePhcrRelevantMedicalConditionHistoryObservationProblemObservation constraint of '<em>Relevant Medical Condition History Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePhcrRelevantMedicalConditionHistoryObservation_validatePhcrRelevantMedicalConditionHistoryObservationProblemObservation(PhcrRelevantMedicalConditionHistoryObservation phcrRelevantMedicalConditionHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return phcrRelevantMedicalConditionHistoryObservation.validatePhcrRelevantMedicalConditionHistoryObservationProblemObservation(diagnostics, context);
  }

		/**
   * Validates the validatePatientConditionDeceasedObservationEffectiveTime constraint of '<em>Patient Condition Deceased Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePatientConditionDeceasedObservation_validatePatientConditionDeceasedObservationEffectiveTime(PatientConditionDeceasedObservation patientConditionDeceasedObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return patientConditionDeceasedObservation.validatePatientConditionDeceasedObservationEffectiveTime(diagnostics, context);
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSignsAndSymptomsObservation(SignsAndSymptomsObservation signsAndSymptomsObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(signsAndSymptomsObservation, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(signsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(signsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(signsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(signsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(signsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(signsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(signsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationTemplateId(signsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationClassCode(signsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationMoodCode(signsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationNegationInd(signsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationCodeP(signsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationCode(signsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationStatusCode(signsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationStatusCodeP(signsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationEffectiveTime(signsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationValue(signsAndSymptomsObservation, diagnostics, context);
    return result;
  }

		/**
   * Validates the validateSignsAndSymptomsObservationTemplateId constraint of '<em>Signs And Symptoms Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationTemplateId(SignsAndSymptomsObservation signsAndSymptomsObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return signsAndSymptomsObservation.validateSignsAndSymptomsObservationTemplateId(diagnostics, context);
  }

		/**
   * Validates the validateSignsAndSymptomsObservationClassCode constraint of '<em>Signs And Symptoms Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationClassCode(SignsAndSymptomsObservation signsAndSymptomsObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return signsAndSymptomsObservation.validateSignsAndSymptomsObservationClassCode(diagnostics, context);
  }

		/**
   * Validates the validateSignsAndSymptomsObservationCode constraint of '<em>Signs And Symptoms Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationCode(SignsAndSymptomsObservation signsAndSymptomsObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return signsAndSymptomsObservation.validateSignsAndSymptomsObservationCode(diagnostics, context);
  }

		/**
   * Validates the validateSignsAndSymptomsObservationMoodCode constraint of '<em>Signs And Symptoms Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationMoodCode(SignsAndSymptomsObservation signsAndSymptomsObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return signsAndSymptomsObservation.validateSignsAndSymptomsObservationMoodCode(diagnostics, context);
  }

		/**
   * Validates the validateSignsAndSymptomsObservationNegationInd constraint of '<em>Signs And Symptoms Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationNegationInd(SignsAndSymptomsObservation signsAndSymptomsObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return signsAndSymptomsObservation.validateSignsAndSymptomsObservationNegationInd(diagnostics, context);
  }

		/**
   * Validates the validateSignsAndSymptomsObservationCodeP constraint of '<em>Signs And Symptoms Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationCodeP(SignsAndSymptomsObservation signsAndSymptomsObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return signsAndSymptomsObservation.validateSignsAndSymptomsObservationCodeP(diagnostics, context);
  }

		/**
   * Validates the validateSignsAndSymptomsObservationStatusCode constraint of '<em>Signs And Symptoms Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationStatusCode(SignsAndSymptomsObservation signsAndSymptomsObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return signsAndSymptomsObservation.validateSignsAndSymptomsObservationStatusCode(diagnostics, context);
  }

		/**
   * Validates the validateSignsAndSymptomsObservationStatusCodeP constraint of '<em>Signs And Symptoms Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationStatusCodeP(SignsAndSymptomsObservation signsAndSymptomsObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return signsAndSymptomsObservation.validateSignsAndSymptomsObservationStatusCodeP(diagnostics, context);
  }

		/**
   * Validates the validateSignsAndSymptomsObservationValue constraint of '<em>Signs And Symptoms Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationValue(SignsAndSymptomsObservation signsAndSymptomsObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return signsAndSymptomsObservation.validateSignsAndSymptomsObservationValue(diagnostics, context);
  }

		/**
   * Validates the validateSignsAndSymptomsObservationEffectiveTime constraint of '<em>Signs And Symptoms Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationEffectiveTime(SignsAndSymptomsObservation signsAndSymptomsObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return signsAndSymptomsObservation.validateSignsAndSymptomsObservationEffectiveTime(diagnostics, context);
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSusceptibilityResult(SusceptibilityResult susceptibilityResult, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(susceptibilityResult, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(susceptibilityResult, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(susceptibilityResult, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(susceptibilityResult, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(susceptibilityResult, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(susceptibilityResult, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(susceptibilityResult, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(susceptibilityResult, diagnostics, context);
    if (result || diagnostics != null) result &= validateSusceptibilityResult_validateSusceptibilityResultTemplateId(susceptibilityResult, diagnostics, context);
    if (result || diagnostics != null) result &= validateSusceptibilityResult_validateSusceptibilityResultClassCode(susceptibilityResult, diagnostics, context);
    if (result || diagnostics != null) result &= validateSusceptibilityResult_validateSusceptibilityResultMoodCode(susceptibilityResult, diagnostics, context);
    if (result || diagnostics != null) result &= validateSusceptibilityResult_validateSusceptibilityResultCodeP(susceptibilityResult, diagnostics, context);
    if (result || diagnostics != null) result &= validateSusceptibilityResult_validateSusceptibilityResultCode(susceptibilityResult, diagnostics, context);
    if (result || diagnostics != null) result &= validateSusceptibilityResult_validateSusceptibilityResultStatusCode(susceptibilityResult, diagnostics, context);
    if (result || diagnostics != null) result &= validateSusceptibilityResult_validateSusceptibilityResultStatusCodeP(susceptibilityResult, diagnostics, context);
    return result;
  }

		/**
   * Validates the validateSusceptibilityResultTemplateId constraint of '<em>Susceptibility Result</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSusceptibilityResult_validateSusceptibilityResultTemplateId(SusceptibilityResult susceptibilityResult, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return susceptibilityResult.validateSusceptibilityResultTemplateId(diagnostics, context);
  }

		/**
   * Validates the validateSusceptibilityResultClassCode constraint of '<em>Susceptibility Result</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSusceptibilityResult_validateSusceptibilityResultClassCode(SusceptibilityResult susceptibilityResult, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return susceptibilityResult.validateSusceptibilityResultClassCode(diagnostics, context);
  }

		/**
   * Validates the validateSusceptibilityResultMoodCode constraint of '<em>Susceptibility Result</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSusceptibilityResult_validateSusceptibilityResultMoodCode(SusceptibilityResult susceptibilityResult, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return susceptibilityResult.validateSusceptibilityResultMoodCode(diagnostics, context);
  }

		/**
   * Validates the validateSusceptibilityResultCode constraint of '<em>Susceptibility Result</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSusceptibilityResult_validateSusceptibilityResultCode(SusceptibilityResult susceptibilityResult, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return susceptibilityResult.validateSusceptibilityResultCode(diagnostics, context);
  }

		/**
   * Validates the validateSusceptibilityResultCodeP constraint of '<em>Susceptibility Result</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSusceptibilityResult_validateSusceptibilityResultCodeP(SusceptibilityResult susceptibilityResult, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return susceptibilityResult.validateSusceptibilityResultCodeP(diagnostics, context);
  }

		/**
   * Validates the validateSusceptibilityResultStatusCode constraint of '<em>Susceptibility Result</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSusceptibilityResult_validateSusceptibilityResultStatusCode(SusceptibilityResult susceptibilityResult, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return susceptibilityResult.validateSusceptibilityResultStatusCode(diagnostics, context);
  }

		/**
   * Validates the validateSusceptibilityResultStatusCodeP constraint of '<em>Susceptibility Result</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSusceptibilityResult_validateSusceptibilityResultStatusCodeP(SusceptibilityResult susceptibilityResult, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return susceptibilityResult.validateSusceptibilityResultStatusCodeP(diagnostics, context);
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTreatmentGivenSubstanceAdministration(TreatmentGivenSubstanceAdministration treatmentGivenSubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(treatmentGivenSubstanceAdministration, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(treatmentGivenSubstanceAdministration, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(treatmentGivenSubstanceAdministration, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(treatmentGivenSubstanceAdministration, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(treatmentGivenSubstanceAdministration, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(treatmentGivenSubstanceAdministration, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(treatmentGivenSubstanceAdministration, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(treatmentGivenSubstanceAdministration, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSubstanceAdministration_validateClassCode(treatmentGivenSubstanceAdministration, diagnostics, context);
    if (result || diagnostics != null) result &= validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationTreatmentGivenNegationInd(treatmentGivenSubstanceAdministration, diagnostics, context);
    if (result || diagnostics != null) result &= validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationTemplateId(treatmentGivenSubstanceAdministration, diagnostics, context);
    if (result || diagnostics != null) result &= validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationClassCode(treatmentGivenSubstanceAdministration, diagnostics, context);
    if (result || diagnostics != null) result &= validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationMoodCode(treatmentGivenSubstanceAdministration, diagnostics, context);
    if (result || diagnostics != null) result &= validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationNegationInd(treatmentGivenSubstanceAdministration, diagnostics, context);
    if (result || diagnostics != null) result &= validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationStatusCode(treatmentGivenSubstanceAdministration, diagnostics, context);
    if (result || diagnostics != null) result &= validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationEffectiveTime(treatmentGivenSubstanceAdministration, diagnostics, context);
    if (result || diagnostics != null) result &= validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationRouteCodeP(treatmentGivenSubstanceAdministration, diagnostics, context);
    if (result || diagnostics != null) result &= validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationRouteCode(treatmentGivenSubstanceAdministration, diagnostics, context);
    return result;
  }

		/**
   * Validates the validateTreatmentGivenSubstanceAdministrationTreatmentGivenNegationInd constraint of '<em>Treatment Given Substance Administration</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationTreatmentGivenNegationInd(TreatmentGivenSubstanceAdministration treatmentGivenSubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return treatmentGivenSubstanceAdministration.validateTreatmentGivenSubstanceAdministrationTreatmentGivenNegationInd(diagnostics, context);
  }

		/**
   * Validates the validateTreatmentGivenSubstanceAdministrationTemplateId constraint of '<em>Treatment Given Substance Administration</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationTemplateId(TreatmentGivenSubstanceAdministration treatmentGivenSubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return treatmentGivenSubstanceAdministration.validateTreatmentGivenSubstanceAdministrationTemplateId(diagnostics, context);
  }

		/**
   * Validates the validateTreatmentGivenSubstanceAdministrationClassCode constraint of '<em>Treatment Given Substance Administration</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationClassCode(TreatmentGivenSubstanceAdministration treatmentGivenSubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return treatmentGivenSubstanceAdministration.validateTreatmentGivenSubstanceAdministrationClassCode(diagnostics, context);
  }

		/**
   * Validates the validateTreatmentGivenSubstanceAdministrationEffectiveTime constraint of '<em>Treatment Given Substance Administration</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationEffectiveTime(TreatmentGivenSubstanceAdministration treatmentGivenSubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return treatmentGivenSubstanceAdministration.validateTreatmentGivenSubstanceAdministrationEffectiveTime(diagnostics, context);
  }

		/**
   * Validates the validateTreatmentGivenSubstanceAdministrationRouteCodeP constraint of '<em>Treatment Given Substance Administration</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationRouteCodeP(TreatmentGivenSubstanceAdministration treatmentGivenSubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return treatmentGivenSubstanceAdministration.validateTreatmentGivenSubstanceAdministrationRouteCodeP(diagnostics, context);
  }

		/**
   * Validates the validateTreatmentGivenSubstanceAdministrationMoodCode constraint of '<em>Treatment Given Substance Administration</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationMoodCode(TreatmentGivenSubstanceAdministration treatmentGivenSubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return treatmentGivenSubstanceAdministration.validateTreatmentGivenSubstanceAdministrationMoodCode(diagnostics, context);
  }

		/**
   * Validates the validateTreatmentGivenSubstanceAdministrationNegationInd constraint of '<em>Treatment Given Substance Administration</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationNegationInd(TreatmentGivenSubstanceAdministration treatmentGivenSubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return treatmentGivenSubstanceAdministration.validateTreatmentGivenSubstanceAdministrationNegationInd(diagnostics, context);
  }

		/**
   * Validates the validateTreatmentGivenSubstanceAdministrationStatusCode constraint of '<em>Treatment Given Substance Administration</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationStatusCode(TreatmentGivenSubstanceAdministration treatmentGivenSubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return treatmentGivenSubstanceAdministration.validateTreatmentGivenSubstanceAdministrationStatusCode(diagnostics, context);
  }

		/**
   * Validates the validateTreatmentGivenSubstanceAdministrationRouteCode constraint of '<em>Treatment Given Substance Administration</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationRouteCode(TreatmentGivenSubstanceAdministration treatmentGivenSubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return treatmentGivenSubstanceAdministration.validateTreatmentGivenSubstanceAdministrationRouteCode(diagnostics, context);
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTreatmentNotGivenSubstanceAdministration(TreatmentNotGivenSubstanceAdministration treatmentNotGivenSubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(treatmentNotGivenSubstanceAdministration, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(treatmentNotGivenSubstanceAdministration, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(treatmentNotGivenSubstanceAdministration, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(treatmentNotGivenSubstanceAdministration, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(treatmentNotGivenSubstanceAdministration, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(treatmentNotGivenSubstanceAdministration, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(treatmentNotGivenSubstanceAdministration, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(treatmentNotGivenSubstanceAdministration, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSubstanceAdministration_validateClassCode(treatmentNotGivenSubstanceAdministration, diagnostics, context);
    if (result || diagnostics != null) result &= validateTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationTreatmentNotGivenNegationInd(treatmentNotGivenSubstanceAdministration, diagnostics, context);
    if (result || diagnostics != null) result &= validateTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationTemplateId(treatmentNotGivenSubstanceAdministration, diagnostics, context);
    if (result || diagnostics != null) result &= validateTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationClassCode(treatmentNotGivenSubstanceAdministration, diagnostics, context);
    if (result || diagnostics != null) result &= validateTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationMoodCode(treatmentNotGivenSubstanceAdministration, diagnostics, context);
    if (result || diagnostics != null) result &= validateTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationNegationInd(treatmentNotGivenSubstanceAdministration, diagnostics, context);
    if (result || diagnostics != null) result &= validateTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationStatusCode(treatmentNotGivenSubstanceAdministration, diagnostics, context);
    if (result || diagnostics != null) result &= validateTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationStatusCodeP(treatmentNotGivenSubstanceAdministration, diagnostics, context);
    return result;
  }

		/**
   * Validates the validateTreatmentNotGivenSubstanceAdministrationTreatmentNotGivenNegationInd constraint of '<em>Treatment Not Given Substance Administration</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationTreatmentNotGivenNegationInd(TreatmentNotGivenSubstanceAdministration treatmentNotGivenSubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return treatmentNotGivenSubstanceAdministration.validateTreatmentNotGivenSubstanceAdministrationTreatmentNotGivenNegationInd(diagnostics, context);
  }

		/**
   * Validates the validateTreatmentNotGivenSubstanceAdministrationTemplateId constraint of '<em>Treatment Not Given Substance Administration</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationTemplateId(TreatmentNotGivenSubstanceAdministration treatmentNotGivenSubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return treatmentNotGivenSubstanceAdministration.validateTreatmentNotGivenSubstanceAdministrationTemplateId(diagnostics, context);
  }

		/**
   * Validates the validateTreatmentNotGivenSubstanceAdministrationClassCode constraint of '<em>Treatment Not Given Substance Administration</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationClassCode(TreatmentNotGivenSubstanceAdministration treatmentNotGivenSubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return treatmentNotGivenSubstanceAdministration.validateTreatmentNotGivenSubstanceAdministrationClassCode(diagnostics, context);
  }

		/**
   * Validates the validateTreatmentNotGivenSubstanceAdministrationMoodCode constraint of '<em>Treatment Not Given Substance Administration</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationMoodCode(TreatmentNotGivenSubstanceAdministration treatmentNotGivenSubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return treatmentNotGivenSubstanceAdministration.validateTreatmentNotGivenSubstanceAdministrationMoodCode(diagnostics, context);
  }

		/**
   * Validates the validateTreatmentNotGivenSubstanceAdministrationNegationInd constraint of '<em>Treatment Not Given Substance Administration</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationNegationInd(TreatmentNotGivenSubstanceAdministration treatmentNotGivenSubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return treatmentNotGivenSubstanceAdministration.validateTreatmentNotGivenSubstanceAdministrationNegationInd(diagnostics, context);
  }

		/**
   * Validates the validateTreatmentNotGivenSubstanceAdministrationStatusCode constraint of '<em>Treatment Not Given Substance Administration</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationStatusCode(TreatmentNotGivenSubstanceAdministration treatmentNotGivenSubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return treatmentNotGivenSubstanceAdministration.validateTreatmentNotGivenSubstanceAdministrationStatusCode(diagnostics, context);
  }

		/**
   * Validates the validateTreatmentNotGivenSubstanceAdministrationStatusCodeP constraint of '<em>Treatment Not Given Substance Administration</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationStatusCodeP(TreatmentNotGivenSubstanceAdministration treatmentNotGivenSubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return treatmentNotGivenSubstanceAdministration.validateTreatmentNotGivenSubstanceAdministrationStatusCodeP(diagnostics, context);
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCaseObservation(CaseObservation caseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(caseObservation, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(caseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(caseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(caseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(caseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(caseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(caseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(caseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationInformationSource(caseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationContainsPatientAwareness(caseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateCaseObservation_validateProblemObservationTemplateId(caseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationMoodCode(caseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationStatusCode(caseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationEffectiveTime(caseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationProblemStatus(caseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationProblemHealthStatus(caseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationAgeObservation(caseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateCaseObservation_validateCaseObservationEffectiveTimeLow(caseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateCaseObservation_validateCaseObservationAuthor(caseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateCaseObservation_validateCaseObservationAuthorAssignedAuthor(caseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateCaseObservation_validateCaseObservationClassCode(caseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateCaseObservation_validateCaseObservationMoodCode(caseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateCaseObservation_validateCaseObservationId(caseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateCaseObservation_validateCaseObservationCodeP(caseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateCaseObservation_validateCaseObservationCode(caseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateCaseObservation_validateCaseObservationStatusCodeP(caseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateCaseObservation_validateCaseObservationStatusCode(caseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateCaseObservation_validateCaseObservationEffectiveTime(caseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateCaseObservation_validateCaseObservationValue(caseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateCaseObservation_validateCaseObservationProblemStatusObservation(caseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateCaseObservation_validateCaseObservationSignsAndSymptomsObservation(caseObservation, diagnostics, context);
    return result;
  }

		/**
   * Validates the validateCaseObservationEffectiveTimeLow constraint of '<em>Case Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCaseObservation_validateCaseObservationEffectiveTimeLow(CaseObservation caseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return caseObservation.validateCaseObservationEffectiveTimeLow(diagnostics, context);
  }

		/**
   * Validates the validateCaseObservationAuthor constraint of '<em>Case Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCaseObservation_validateCaseObservationAuthor(CaseObservation caseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return caseObservation.validateCaseObservationAuthor(diagnostics, context);
  }

		/**
   * Validates the validateCaseObservationAuthorAssignedAuthor constraint of '<em>Case Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCaseObservation_validateCaseObservationAuthorAssignedAuthor(CaseObservation caseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return caseObservation.validateCaseObservationAuthorAssignedAuthor(diagnostics, context);
  }

		/**
   * Validates the validateCaseObservationClassCode constraint of '<em>Case Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCaseObservation_validateCaseObservationClassCode(CaseObservation caseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return caseObservation.validateCaseObservationClassCode(diagnostics, context);
  }

		/**
   * Validates the validateCaseObservationEffectiveTime constraint of '<em>Case Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCaseObservation_validateCaseObservationEffectiveTime(CaseObservation caseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return caseObservation.validateCaseObservationEffectiveTime(diagnostics, context);
  }

		/**
   * Validates the validateCaseObservationValue constraint of '<em>Case Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCaseObservation_validateCaseObservationValue(CaseObservation caseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return caseObservation.validateCaseObservationValue(diagnostics, context);
  }

		/**
   * Validates the validateCaseObservationProblemStatusObservation constraint of '<em>Case Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCaseObservation_validateCaseObservationProblemStatusObservation(CaseObservation caseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return caseObservation.validateCaseObservationProblemStatusObservation(diagnostics, context);
  }

		/**
   * Validates the validateCaseObservationSignsAndSymptomsObservation constraint of '<em>Case Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCaseObservation_validateCaseObservationSignsAndSymptomsObservation(CaseObservation caseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return caseObservation.validateCaseObservationSignsAndSymptomsObservation(diagnostics, context);
  }

		/**
   * Validates the validateCaseObservationMoodCode constraint of '<em>Case Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCaseObservation_validateCaseObservationMoodCode(CaseObservation caseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return caseObservation.validateCaseObservationMoodCode(diagnostics, context);
  }

		/**
   * Validates the validateCaseObservationId constraint of '<em>Case Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCaseObservation_validateCaseObservationId(CaseObservation caseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return caseObservation.validateCaseObservationId(diagnostics, context);
  }

		/**
   * Validates the validateCaseObservationCodeP constraint of '<em>Case Observation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCaseObservation_validateCaseObservationCodeP(CaseObservation caseObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return caseObservation.validateCaseObservationCodeP(diagnostics, context);
  }

    /**
   * Validates the validateCaseObservationCode constraint of '<em>Case Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCaseObservation_validateCaseObservationCode(CaseObservation caseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return caseObservation.validateCaseObservationCode(diagnostics, context);
  }

		/**
   * Validates the validateCaseObservationStatusCodeP constraint of '<em>Case Observation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCaseObservation_validateCaseObservationStatusCodeP(CaseObservation caseObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return caseObservation.validateCaseObservationStatusCodeP(diagnostics, context);
  }

    /**
   * Validates the validateCaseObservationStatusCode constraint of '<em>Case Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCaseObservation_validateCaseObservationStatusCode(CaseObservation caseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return caseObservation.validateCaseObservationStatusCode(diagnostics, context);
  }

		/**
   * Validates the validateProblemObservationTemplateId constraint of '<em>Case Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCaseObservation_validateProblemObservationTemplateId(CaseObservation caseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    // TODO override the constraint, if desired
    // -> uncomment the scaffolding
    // -> specify the condition that violates the constraint
    // -> verify the diagnostic details, including severity, code, and message
    // Ensure that you remove @generated or mark it @generated NOT
    if (false)
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (createDiagnostic
            (Diagnostic.ERROR,
             DIAGNOSTIC_SOURCE,
             0,
             "_UI_GenericConstraint_diagnostic",
             new Object[] { "validateProblemObservationTemplateId", getObjectLabel(caseObservation, context) },
             new Object[] { caseObservation },
             context));
      }
      return false;
    }
    return ccdValidator.validateProblemObservation_validateProblemObservationTemplateId(caseObservation, diagnostics, context);
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
    return PhcrPlugin.INSTANCE;
  }

} //PhcrValidator
