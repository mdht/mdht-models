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
package org.openhealthtools.mdht.uml.cda.phcr.hepb;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.HepbFactory
 * @model kind="package"
 *        annotation="http://www.openhealthtools.org/mdht/uml initializers='org.openhealthtools.mdht.uml.cda.phcr.hepb'"
 * @generated
 */
public interface HepbPackage extends EPackage {
	/**
     * The package name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNAME = "hepb";

	/**
     * The package namespace URI.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_URI = "http://www.openhealthtools.org/mdht/uml/cda/phcr/hepb";

	/**
     * The package namespace name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_PREFIX = "hepb";

	/**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	HepbPackage eINSTANCE = org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.HepbPackageImpl.init();

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.AcuteHepatitisBCaseReportImpl <em>Acute Hepatitis BCase Report</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.AcuteHepatitisBCaseReportImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.HepbPackageImpl#getAcuteHepatitisBCaseReport()
     * @generated
     */
	int ACUTE_HEPATITIS_BCASE_REPORT = 0;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BCASE_REPORT__REALM_CODE = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BCASE_REPORT__TYPE_ID = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BCASE_REPORT__TEMPLATE_ID = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BCASE_REPORT__ID = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__ID;

	/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BCASE_REPORT__CODE = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__CODE;

	/**
     * The feature id for the '<em><b>Title</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BCASE_REPORT__TITLE = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__TITLE;

	/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BCASE_REPORT__EFFECTIVE_TIME = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__EFFECTIVE_TIME;

	/**
     * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BCASE_REPORT__CONFIDENTIALITY_CODE = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__CONFIDENTIALITY_CODE;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BCASE_REPORT__LANGUAGE_CODE = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Set Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BCASE_REPORT__SET_ID = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__SET_ID;

	/**
     * The feature id for the '<em><b>Version Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BCASE_REPORT__VERSION_NUMBER = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__VERSION_NUMBER;

	/**
     * The feature id for the '<em><b>Copy Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BCASE_REPORT__COPY_TIME = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__COPY_TIME;

	/**
     * The feature id for the '<em><b>Record Target</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BCASE_REPORT__RECORD_TARGET = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__RECORD_TARGET;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BCASE_REPORT__AUTHOR = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__AUTHOR;

	/**
     * The feature id for the '<em><b>Data Enterer</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BCASE_REPORT__DATA_ENTERER = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__DATA_ENTERER;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BCASE_REPORT__INFORMANT = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__INFORMANT;

	/**
     * The feature id for the '<em><b>Custodian</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BCASE_REPORT__CUSTODIAN = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__CUSTODIAN;

	/**
     * The feature id for the '<em><b>Information Recipient</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BCASE_REPORT__INFORMATION_RECIPIENT = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__INFORMATION_RECIPIENT;

	/**
     * The feature id for the '<em><b>Legal Authenticator</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BCASE_REPORT__LEGAL_AUTHENTICATOR = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__LEGAL_AUTHENTICATOR;

	/**
     * The feature id for the '<em><b>Authenticator</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BCASE_REPORT__AUTHENTICATOR = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__AUTHENTICATOR;

	/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BCASE_REPORT__PARTICIPANT = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__PARTICIPANT;

	/**
     * The feature id for the '<em><b>In Fulfillment Of</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BCASE_REPORT__IN_FULFILLMENT_OF = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__IN_FULFILLMENT_OF;

	/**
     * The feature id for the '<em><b>Documentation Of</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BCASE_REPORT__DOCUMENTATION_OF = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__DOCUMENTATION_OF;

	/**
     * The feature id for the '<em><b>Related Document</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BCASE_REPORT__RELATED_DOCUMENT = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__RELATED_DOCUMENT;

	/**
     * The feature id for the '<em><b>Authorization</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BCASE_REPORT__AUTHORIZATION = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__AUTHORIZATION;

	/**
     * The feature id for the '<em><b>Component Of</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BCASE_REPORT__COMPONENT_OF = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__COMPONENT_OF;

	/**
     * The feature id for the '<em><b>Component</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BCASE_REPORT__COMPONENT = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__COMPONENT;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BCASE_REPORT__NULL_FLAVOR = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BCASE_REPORT__CLASS_CODE = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__CLASS_CODE;

	/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BCASE_REPORT__MOOD_CODE = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__MOOD_CODE;

	/**
     * The number of structural features of the '<em>Acute Hepatitis BCase Report</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BCASE_REPORT_FEATURE_COUNT = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT_FEATURE_COUNT + 0;


	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.AcuteHepatitisBSocialHistorySectionImpl <em>Acute Hepatitis BSocial History Section</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.AcuteHepatitisBSocialHistorySectionImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.HepbPackageImpl#getAcuteHepatitisBSocialHistorySection()
     * @generated
     */
	int ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION = 1;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION__REALM_CODE = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION__TYPE_ID = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION__TEMPLATE_ID = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION__ID = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__ID;

	/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION__CODE = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__CODE;

	/**
     * The feature id for the '<em><b>Title</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION__TITLE = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__TITLE;

	/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION__TEXT = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__TEXT;

	/**
     * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION__CONFIDENTIALITY_CODE = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__CONFIDENTIALITY_CODE;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION__LANGUAGE_CODE = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION__SUBJECT = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__SUBJECT;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION__AUTHOR = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__AUTHOR;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION__INFORMANT = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__INFORMANT;

	/**
     * The feature id for the '<em><b>Entry</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION__ENTRY = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__ENTRY;

	/**
     * The feature id for the '<em><b>Component</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION__COMPONENT = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__COMPONENT;

	/**
     * The feature id for the '<em><b>Section Id</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION__SECTION_ID = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__SECTION_ID;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION__NULL_FLAVOR = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION__CLASS_CODE = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__CLASS_CODE;

	/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION__MOOD_CODE = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__MOOD_CODE;

	/**
     * The number of structural features of the '<em>Acute Hepatitis BSocial History Section</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION_FEATURE_COUNT = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.JobRelatedBodyFluidExposureRiskFrequencyObservationImpl <em>Job Related Body Fluid Exposure Risk Frequency Observation</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.JobRelatedBodyFluidExposureRiskFrequencyObservationImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.HepbPackageImpl#getJobRelatedBodyFluidExposureRiskFrequencyObservation()
     * @generated
     */
	int JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION = 2;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION__ID = CDAPackage.OBSERVATION__ID;

	/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION__CODE = CDAPackage.OBSERVATION__CODE;

	/**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

	/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION__TEXT = CDAPackage.OBSERVATION__TEXT;

	/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

	/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

	/**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

	/**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION__VALUE = CDAPackage.OBSERVATION__VALUE;

	/**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

	/**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

	/**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

	/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

	/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

	/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

	/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

	/**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

	/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

	/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

	/**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

	/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

	/**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

	/**
     * The number of structural features of the '<em>Job Related Body Fluid Exposure Risk Frequency Observation</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationImpl <em>Acute Hepatitis BSocio Behavioral Boolean Risk Factor Observation</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.HepbPackageImpl#getAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation()
     * @generated
     */
	int ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION = 4;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.AcuteHepatitisBPossibleExposureLocationAndTypeActImpl <em>Acute Hepatitis BPossible Exposure Location And Type Act</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.AcuteHepatitisBPossibleExposureLocationAndTypeActImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.HepbPackageImpl#getAcuteHepatitisBPossibleExposureLocationAndTypeAct()
     * @generated
     */
	int ACUTE_HEPATITIS_BPOSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT = 3;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPOSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__REALM_CODE = CDAPackage.ACT__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPOSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__TYPE_ID = CDAPackage.ACT__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPOSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__TEMPLATE_ID = CDAPackage.ACT__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPOSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__ID = CDAPackage.ACT__ID;

	/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPOSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__CODE = CDAPackage.ACT__CODE;

	/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPOSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__TEXT = CDAPackage.ACT__TEXT;

	/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPOSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__STATUS_CODE = CDAPackage.ACT__STATUS_CODE;

	/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPOSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__EFFECTIVE_TIME = CDAPackage.ACT__EFFECTIVE_TIME;

	/**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPOSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__PRIORITY_CODE = CDAPackage.ACT__PRIORITY_CODE;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPOSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__LANGUAGE_CODE = CDAPackage.ACT__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPOSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__SUBJECT = CDAPackage.ACT__SUBJECT;

	/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPOSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__SPECIMEN = CDAPackage.ACT__SPECIMEN;

	/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPOSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__PERFORMER = CDAPackage.ACT__PERFORMER;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPOSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__AUTHOR = CDAPackage.ACT__AUTHOR;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPOSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__INFORMANT = CDAPackage.ACT__INFORMANT;

	/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPOSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__PARTICIPANT = CDAPackage.ACT__PARTICIPANT;

	/**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPOSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__ENTRY_RELATIONSHIP = CDAPackage.ACT__ENTRY_RELATIONSHIP;

	/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPOSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__REFERENCE = CDAPackage.ACT__REFERENCE;

	/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPOSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__PRECONDITION = CDAPackage.ACT__PRECONDITION;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPOSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__NULL_FLAVOR = CDAPackage.ACT__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPOSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__CLASS_CODE = CDAPackage.ACT__CLASS_CODE;

	/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPOSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__MOOD_CODE = CDAPackage.ACT__MOOD_CODE;

	/**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPOSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__NEGATION_IND = CDAPackage.ACT__NEGATION_IND;

	/**
     * The number of structural features of the '<em>Acute Hepatitis BPossible Exposure Location And Type Act</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPOSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_FEATURE_COUNT = CDAPackage.ACT_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__REALM_CODE = CCDPackage.SOCIAL_HISTORY_OBSERVATION__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__TYPE_ID = CCDPackage.SOCIAL_HISTORY_OBSERVATION__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__TEMPLATE_ID = CCDPackage.SOCIAL_HISTORY_OBSERVATION__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__ID = CCDPackage.SOCIAL_HISTORY_OBSERVATION__ID;

	/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__CODE = CCDPackage.SOCIAL_HISTORY_OBSERVATION__CODE;

	/**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__DERIVATION_EXPR = CCDPackage.SOCIAL_HISTORY_OBSERVATION__DERIVATION_EXPR;

	/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__TEXT = CCDPackage.SOCIAL_HISTORY_OBSERVATION__TEXT;

	/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__STATUS_CODE = CCDPackage.SOCIAL_HISTORY_OBSERVATION__STATUS_CODE;

	/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__EFFECTIVE_TIME = CCDPackage.SOCIAL_HISTORY_OBSERVATION__EFFECTIVE_TIME;

	/**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__PRIORITY_CODE = CCDPackage.SOCIAL_HISTORY_OBSERVATION__PRIORITY_CODE;

	/**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__REPEAT_NUMBER = CCDPackage.SOCIAL_HISTORY_OBSERVATION__REPEAT_NUMBER;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__LANGUAGE_CODE = CCDPackage.SOCIAL_HISTORY_OBSERVATION__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__VALUE = CCDPackage.SOCIAL_HISTORY_OBSERVATION__VALUE;

	/**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__INTERPRETATION_CODE = CCDPackage.SOCIAL_HISTORY_OBSERVATION__INTERPRETATION_CODE;

	/**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__METHOD_CODE = CCDPackage.SOCIAL_HISTORY_OBSERVATION__METHOD_CODE;

	/**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__TARGET_SITE_CODE = CCDPackage.SOCIAL_HISTORY_OBSERVATION__TARGET_SITE_CODE;

	/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__SUBJECT = CCDPackage.SOCIAL_HISTORY_OBSERVATION__SUBJECT;

	/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__SPECIMEN = CCDPackage.SOCIAL_HISTORY_OBSERVATION__SPECIMEN;

	/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__PERFORMER = CCDPackage.SOCIAL_HISTORY_OBSERVATION__PERFORMER;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__AUTHOR = CCDPackage.SOCIAL_HISTORY_OBSERVATION__AUTHOR;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__INFORMANT = CCDPackage.SOCIAL_HISTORY_OBSERVATION__INFORMANT;

	/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__PARTICIPANT = CCDPackage.SOCIAL_HISTORY_OBSERVATION__PARTICIPANT;

	/**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__ENTRY_RELATIONSHIP = CCDPackage.SOCIAL_HISTORY_OBSERVATION__ENTRY_RELATIONSHIP;

	/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__REFERENCE = CCDPackage.SOCIAL_HISTORY_OBSERVATION__REFERENCE;

	/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__PRECONDITION = CCDPackage.SOCIAL_HISTORY_OBSERVATION__PRECONDITION;

	/**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__REFERENCE_RANGE = CCDPackage.SOCIAL_HISTORY_OBSERVATION__REFERENCE_RANGE;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__NULL_FLAVOR = CCDPackage.SOCIAL_HISTORY_OBSERVATION__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__CLASS_CODE = CCDPackage.SOCIAL_HISTORY_OBSERVATION__CLASS_CODE;

	/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__MOOD_CODE = CCDPackage.SOCIAL_HISTORY_OBSERVATION__MOOD_CODE;

	/**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__NEGATION_IND = CCDPackage.SOCIAL_HISTORY_OBSERVATION__NEGATION_IND;

	/**
     * The number of structural features of the '<em>Acute Hepatitis BSocio Behavioral Boolean Risk Factor Observation</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION_FEATURE_COUNT = CCDPackage.SOCIAL_HISTORY_OBSERVATION_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationImpl <em>Acute Hepatitis BActual Blood And Or Body Fluid Exposure Observation</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.HepbPackageImpl#getAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation()
     * @generated
     */
	int ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION = 5;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION__ID = CDAPackage.OBSERVATION__ID;

	/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION__CODE = CDAPackage.OBSERVATION__CODE;

	/**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

	/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION__TEXT = CDAPackage.OBSERVATION__TEXT;

	/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

	/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

	/**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

	/**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION__VALUE = CDAPackage.OBSERVATION__VALUE;

	/**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

	/**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

	/**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

	/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

	/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

	/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

	/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

	/**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

	/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

	/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

	/**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

	/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

	/**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

	/**
     * The number of structural features of the '<em>Acute Hepatitis BActual Blood And Or Body Fluid Exposure Observation</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.AcuteHepatitisBImmunizationSectionImpl <em>Acute Hepatitis BImmunization Section</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.AcuteHepatitisBImmunizationSectionImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.HepbPackageImpl#getAcuteHepatitisBImmunizationSection()
     * @generated
     */
	int ACUTE_HEPATITIS_BIMMUNIZATION_SECTION = 12;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.AcuteHepatitisBImmunizationActivityImpl <em>Acute Hepatitis BImmunization Activity</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.AcuteHepatitisBImmunizationActivityImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.HepbPackageImpl#getAcuteHepatitisBImmunizationActivity()
     * @generated
     */
	int ACUTE_HEPATITIS_BIMMUNIZATION_ACTIVITY = 13;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.AcuteHepatitisBPHCRClinicalInformationSectionImpl <em>Acute Hepatitis BPHCR Clinical Information Section</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.AcuteHepatitisBPHCRClinicalInformationSectionImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.HepbPackageImpl#getAcuteHepatitisBPHCRClinicalInformationSection()
     * @generated
     */
	int ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION = 6;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION__REALM_CODE = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION__TYPE_ID = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION__TEMPLATE_ID = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION__ID = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__ID;

	/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION__CODE = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__CODE;

	/**
     * The feature id for the '<em><b>Title</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION__TITLE = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__TITLE;

	/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION__TEXT = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__TEXT;

	/**
     * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION__CONFIDENTIALITY_CODE = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__CONFIDENTIALITY_CODE;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION__LANGUAGE_CODE = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION__SUBJECT = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__SUBJECT;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION__AUTHOR = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__AUTHOR;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION__INFORMANT = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__INFORMANT;

	/**
     * The feature id for the '<em><b>Entry</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION__ENTRY = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__ENTRY;

	/**
     * The feature id for the '<em><b>Component</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION__COMPONENT = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__COMPONENT;

	/**
     * The feature id for the '<em><b>Section Id</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION__SECTION_ID = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__SECTION_ID;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION__NULL_FLAVOR = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION__CLASS_CODE = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__CLASS_CODE;

	/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION__MOOD_CODE = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__MOOD_CODE;

	/**
     * The number of structural features of the '<em>Acute Hepatitis BPHCR Clinical Information Section</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION_FEATURE_COUNT = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.AcuteHepatitisBCaseObservationImpl <em>Acute Hepatitis BCase Observation</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.AcuteHepatitisBCaseObservationImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.HepbPackageImpl#getAcuteHepatitisBCaseObservation()
     * @generated
     */
	int ACUTE_HEPATITIS_BCASE_OBSERVATION = 7;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BCASE_OBSERVATION__REALM_CODE = PhcrPackage.CASE_OBSERVATION__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BCASE_OBSERVATION__TYPE_ID = PhcrPackage.CASE_OBSERVATION__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BCASE_OBSERVATION__TEMPLATE_ID = PhcrPackage.CASE_OBSERVATION__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BCASE_OBSERVATION__ID = PhcrPackage.CASE_OBSERVATION__ID;

	/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BCASE_OBSERVATION__CODE = PhcrPackage.CASE_OBSERVATION__CODE;

	/**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BCASE_OBSERVATION__DERIVATION_EXPR = PhcrPackage.CASE_OBSERVATION__DERIVATION_EXPR;

	/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BCASE_OBSERVATION__TEXT = PhcrPackage.CASE_OBSERVATION__TEXT;

	/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BCASE_OBSERVATION__STATUS_CODE = PhcrPackage.CASE_OBSERVATION__STATUS_CODE;

	/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BCASE_OBSERVATION__EFFECTIVE_TIME = PhcrPackage.CASE_OBSERVATION__EFFECTIVE_TIME;

	/**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BCASE_OBSERVATION__PRIORITY_CODE = PhcrPackage.CASE_OBSERVATION__PRIORITY_CODE;

	/**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BCASE_OBSERVATION__REPEAT_NUMBER = PhcrPackage.CASE_OBSERVATION__REPEAT_NUMBER;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BCASE_OBSERVATION__LANGUAGE_CODE = PhcrPackage.CASE_OBSERVATION__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BCASE_OBSERVATION__VALUE = PhcrPackage.CASE_OBSERVATION__VALUE;

	/**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BCASE_OBSERVATION__INTERPRETATION_CODE = PhcrPackage.CASE_OBSERVATION__INTERPRETATION_CODE;

	/**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BCASE_OBSERVATION__METHOD_CODE = PhcrPackage.CASE_OBSERVATION__METHOD_CODE;

	/**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BCASE_OBSERVATION__TARGET_SITE_CODE = PhcrPackage.CASE_OBSERVATION__TARGET_SITE_CODE;

	/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BCASE_OBSERVATION__SUBJECT = PhcrPackage.CASE_OBSERVATION__SUBJECT;

	/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BCASE_OBSERVATION__SPECIMEN = PhcrPackage.CASE_OBSERVATION__SPECIMEN;

	/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BCASE_OBSERVATION__PERFORMER = PhcrPackage.CASE_OBSERVATION__PERFORMER;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BCASE_OBSERVATION__AUTHOR = PhcrPackage.CASE_OBSERVATION__AUTHOR;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BCASE_OBSERVATION__INFORMANT = PhcrPackage.CASE_OBSERVATION__INFORMANT;

	/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BCASE_OBSERVATION__PARTICIPANT = PhcrPackage.CASE_OBSERVATION__PARTICIPANT;

	/**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BCASE_OBSERVATION__ENTRY_RELATIONSHIP = PhcrPackage.CASE_OBSERVATION__ENTRY_RELATIONSHIP;

	/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BCASE_OBSERVATION__REFERENCE = PhcrPackage.CASE_OBSERVATION__REFERENCE;

	/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BCASE_OBSERVATION__PRECONDITION = PhcrPackage.CASE_OBSERVATION__PRECONDITION;

	/**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BCASE_OBSERVATION__REFERENCE_RANGE = PhcrPackage.CASE_OBSERVATION__REFERENCE_RANGE;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BCASE_OBSERVATION__NULL_FLAVOR = PhcrPackage.CASE_OBSERVATION__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BCASE_OBSERVATION__CLASS_CODE = PhcrPackage.CASE_OBSERVATION__CLASS_CODE;

	/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BCASE_OBSERVATION__MOOD_CODE = PhcrPackage.CASE_OBSERVATION__MOOD_CODE;

	/**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BCASE_OBSERVATION__NEGATION_IND = PhcrPackage.CASE_OBSERVATION__NEGATION_IND;

	/**
     * The number of structural features of the '<em>Acute Hepatitis BCase Observation</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BCASE_OBSERVATION_FEATURE_COUNT = PhcrPackage.CASE_OBSERVATION_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.AcuteHepatitisBSignsAndSymptomsObservationImpl <em>Acute Hepatitis BSigns And Symptoms Observation</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.AcuteHepatitisBSignsAndSymptomsObservationImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.HepbPackageImpl#getAcuteHepatitisBSignsAndSymptomsObservation()
     * @generated
     */
	int ACUTE_HEPATITIS_BSIGNS_AND_SYMPTOMS_OBSERVATION = 8;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSIGNS_AND_SYMPTOMS_OBSERVATION__REALM_CODE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSIGNS_AND_SYMPTOMS_OBSERVATION__TYPE_ID = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSIGNS_AND_SYMPTOMS_OBSERVATION__TEMPLATE_ID = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSIGNS_AND_SYMPTOMS_OBSERVATION__ID = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__ID;

	/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSIGNS_AND_SYMPTOMS_OBSERVATION__CODE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__CODE;

	/**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSIGNS_AND_SYMPTOMS_OBSERVATION__DERIVATION_EXPR = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__DERIVATION_EXPR;

	/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSIGNS_AND_SYMPTOMS_OBSERVATION__TEXT = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__TEXT;

	/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSIGNS_AND_SYMPTOMS_OBSERVATION__STATUS_CODE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__STATUS_CODE;

	/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSIGNS_AND_SYMPTOMS_OBSERVATION__EFFECTIVE_TIME = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__EFFECTIVE_TIME;

	/**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSIGNS_AND_SYMPTOMS_OBSERVATION__PRIORITY_CODE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__PRIORITY_CODE;

	/**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSIGNS_AND_SYMPTOMS_OBSERVATION__REPEAT_NUMBER = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__REPEAT_NUMBER;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSIGNS_AND_SYMPTOMS_OBSERVATION__LANGUAGE_CODE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSIGNS_AND_SYMPTOMS_OBSERVATION__VALUE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__VALUE;

	/**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSIGNS_AND_SYMPTOMS_OBSERVATION__INTERPRETATION_CODE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__INTERPRETATION_CODE;

	/**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSIGNS_AND_SYMPTOMS_OBSERVATION__METHOD_CODE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__METHOD_CODE;

	/**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSIGNS_AND_SYMPTOMS_OBSERVATION__TARGET_SITE_CODE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__TARGET_SITE_CODE;

	/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSIGNS_AND_SYMPTOMS_OBSERVATION__SUBJECT = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__SUBJECT;

	/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSIGNS_AND_SYMPTOMS_OBSERVATION__SPECIMEN = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__SPECIMEN;

	/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSIGNS_AND_SYMPTOMS_OBSERVATION__PERFORMER = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__PERFORMER;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSIGNS_AND_SYMPTOMS_OBSERVATION__AUTHOR = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__AUTHOR;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSIGNS_AND_SYMPTOMS_OBSERVATION__INFORMANT = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__INFORMANT;

	/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSIGNS_AND_SYMPTOMS_OBSERVATION__PARTICIPANT = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__PARTICIPANT;

	/**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSIGNS_AND_SYMPTOMS_OBSERVATION__ENTRY_RELATIONSHIP = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__ENTRY_RELATIONSHIP;

	/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSIGNS_AND_SYMPTOMS_OBSERVATION__REFERENCE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__REFERENCE;

	/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSIGNS_AND_SYMPTOMS_OBSERVATION__PRECONDITION = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__PRECONDITION;

	/**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSIGNS_AND_SYMPTOMS_OBSERVATION__REFERENCE_RANGE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__REFERENCE_RANGE;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSIGNS_AND_SYMPTOMS_OBSERVATION__NULL_FLAVOR = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSIGNS_AND_SYMPTOMS_OBSERVATION__CLASS_CODE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__CLASS_CODE;

	/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSIGNS_AND_SYMPTOMS_OBSERVATION__MOOD_CODE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__MOOD_CODE;

	/**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSIGNS_AND_SYMPTOMS_OBSERVATION__NEGATION_IND = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__NEGATION_IND;

	/**
     * The number of structural features of the '<em>Acute Hepatitis BSigns And Symptoms Observation</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BSIGNS_AND_SYMPTOMS_OBSERVATION_FEATURE_COUNT = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.AcuteHepatitisBRiskAssociatedProcedureImpl <em>Acute Hepatitis BRisk Associated Procedure</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.AcuteHepatitisBRiskAssociatedProcedureImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.HepbPackageImpl#getAcuteHepatitisBRiskAssociatedProcedure()
     * @generated
     */
	int ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURE = 9;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURE__REALM_CODE = CDAPackage.PROCEDURE__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURE__TYPE_ID = CDAPackage.PROCEDURE__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURE__TEMPLATE_ID = CDAPackage.PROCEDURE__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURE__ID = CDAPackage.PROCEDURE__ID;

	/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURE__CODE = CDAPackage.PROCEDURE__CODE;

	/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURE__TEXT = CDAPackage.PROCEDURE__TEXT;

	/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURE__STATUS_CODE = CDAPackage.PROCEDURE__STATUS_CODE;

	/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURE__EFFECTIVE_TIME = CDAPackage.PROCEDURE__EFFECTIVE_TIME;

	/**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURE__PRIORITY_CODE = CDAPackage.PROCEDURE__PRIORITY_CODE;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURE__LANGUAGE_CODE = CDAPackage.PROCEDURE__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURE__METHOD_CODE = CDAPackage.PROCEDURE__METHOD_CODE;

	/**
     * The feature id for the '<em><b>Approach Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURE__APPROACH_SITE_CODE = CDAPackage.PROCEDURE__APPROACH_SITE_CODE;

	/**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURE__TARGET_SITE_CODE = CDAPackage.PROCEDURE__TARGET_SITE_CODE;

	/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURE__SUBJECT = CDAPackage.PROCEDURE__SUBJECT;

	/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURE__SPECIMEN = CDAPackage.PROCEDURE__SPECIMEN;

	/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURE__PERFORMER = CDAPackage.PROCEDURE__PERFORMER;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURE__AUTHOR = CDAPackage.PROCEDURE__AUTHOR;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURE__INFORMANT = CDAPackage.PROCEDURE__INFORMANT;

	/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURE__PARTICIPANT = CDAPackage.PROCEDURE__PARTICIPANT;

	/**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURE__ENTRY_RELATIONSHIP = CDAPackage.PROCEDURE__ENTRY_RELATIONSHIP;

	/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURE__REFERENCE = CDAPackage.PROCEDURE__REFERENCE;

	/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURE__PRECONDITION = CDAPackage.PROCEDURE__PRECONDITION;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURE__NULL_FLAVOR = CDAPackage.PROCEDURE__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURE__CLASS_CODE = CDAPackage.PROCEDURE__CLASS_CODE;

	/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURE__MOOD_CODE = CDAPackage.PROCEDURE__MOOD_CODE;

	/**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURE__NEGATION_IND = CDAPackage.PROCEDURE__NEGATION_IND;

	/**
     * The number of structural features of the '<em>Acute Hepatitis BRisk Associated Procedure</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURE_FEATURE_COUNT = CDAPackage.PROCEDURE_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.ViralHepatitisHistoryObservationImpl <em>Viral Hepatitis History Observation</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.ViralHepatitisHistoryObservationImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.HepbPackageImpl#getViralHepatitisHistoryObservation()
     * @generated
     */
	int VIRAL_HEPATITIS_HISTORY_OBSERVATION = 10;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VIRAL_HEPATITIS_HISTORY_OBSERVATION__REALM_CODE = CCDPackage.PROBLEM_OBSERVATION__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VIRAL_HEPATITIS_HISTORY_OBSERVATION__TYPE_ID = CCDPackage.PROBLEM_OBSERVATION__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VIRAL_HEPATITIS_HISTORY_OBSERVATION__TEMPLATE_ID = CCDPackage.PROBLEM_OBSERVATION__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VIRAL_HEPATITIS_HISTORY_OBSERVATION__ID = CCDPackage.PROBLEM_OBSERVATION__ID;

	/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VIRAL_HEPATITIS_HISTORY_OBSERVATION__CODE = CCDPackage.PROBLEM_OBSERVATION__CODE;

	/**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VIRAL_HEPATITIS_HISTORY_OBSERVATION__DERIVATION_EXPR = CCDPackage.PROBLEM_OBSERVATION__DERIVATION_EXPR;

	/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VIRAL_HEPATITIS_HISTORY_OBSERVATION__TEXT = CCDPackage.PROBLEM_OBSERVATION__TEXT;

	/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VIRAL_HEPATITIS_HISTORY_OBSERVATION__STATUS_CODE = CCDPackage.PROBLEM_OBSERVATION__STATUS_CODE;

	/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VIRAL_HEPATITIS_HISTORY_OBSERVATION__EFFECTIVE_TIME = CCDPackage.PROBLEM_OBSERVATION__EFFECTIVE_TIME;

	/**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VIRAL_HEPATITIS_HISTORY_OBSERVATION__PRIORITY_CODE = CCDPackage.PROBLEM_OBSERVATION__PRIORITY_CODE;

	/**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VIRAL_HEPATITIS_HISTORY_OBSERVATION__REPEAT_NUMBER = CCDPackage.PROBLEM_OBSERVATION__REPEAT_NUMBER;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VIRAL_HEPATITIS_HISTORY_OBSERVATION__LANGUAGE_CODE = CCDPackage.PROBLEM_OBSERVATION__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VIRAL_HEPATITIS_HISTORY_OBSERVATION__VALUE = CCDPackage.PROBLEM_OBSERVATION__VALUE;

	/**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VIRAL_HEPATITIS_HISTORY_OBSERVATION__INTERPRETATION_CODE = CCDPackage.PROBLEM_OBSERVATION__INTERPRETATION_CODE;

	/**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VIRAL_HEPATITIS_HISTORY_OBSERVATION__METHOD_CODE = CCDPackage.PROBLEM_OBSERVATION__METHOD_CODE;

	/**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VIRAL_HEPATITIS_HISTORY_OBSERVATION__TARGET_SITE_CODE = CCDPackage.PROBLEM_OBSERVATION__TARGET_SITE_CODE;

	/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VIRAL_HEPATITIS_HISTORY_OBSERVATION__SUBJECT = CCDPackage.PROBLEM_OBSERVATION__SUBJECT;

	/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VIRAL_HEPATITIS_HISTORY_OBSERVATION__SPECIMEN = CCDPackage.PROBLEM_OBSERVATION__SPECIMEN;

	/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VIRAL_HEPATITIS_HISTORY_OBSERVATION__PERFORMER = CCDPackage.PROBLEM_OBSERVATION__PERFORMER;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VIRAL_HEPATITIS_HISTORY_OBSERVATION__AUTHOR = CCDPackage.PROBLEM_OBSERVATION__AUTHOR;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VIRAL_HEPATITIS_HISTORY_OBSERVATION__INFORMANT = CCDPackage.PROBLEM_OBSERVATION__INFORMANT;

	/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VIRAL_HEPATITIS_HISTORY_OBSERVATION__PARTICIPANT = CCDPackage.PROBLEM_OBSERVATION__PARTICIPANT;

	/**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VIRAL_HEPATITIS_HISTORY_OBSERVATION__ENTRY_RELATIONSHIP = CCDPackage.PROBLEM_OBSERVATION__ENTRY_RELATIONSHIP;

	/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VIRAL_HEPATITIS_HISTORY_OBSERVATION__REFERENCE = CCDPackage.PROBLEM_OBSERVATION__REFERENCE;

	/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VIRAL_HEPATITIS_HISTORY_OBSERVATION__PRECONDITION = CCDPackage.PROBLEM_OBSERVATION__PRECONDITION;

	/**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VIRAL_HEPATITIS_HISTORY_OBSERVATION__REFERENCE_RANGE = CCDPackage.PROBLEM_OBSERVATION__REFERENCE_RANGE;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VIRAL_HEPATITIS_HISTORY_OBSERVATION__NULL_FLAVOR = CCDPackage.PROBLEM_OBSERVATION__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VIRAL_HEPATITIS_HISTORY_OBSERVATION__CLASS_CODE = CCDPackage.PROBLEM_OBSERVATION__CLASS_CODE;

	/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VIRAL_HEPATITIS_HISTORY_OBSERVATION__MOOD_CODE = CCDPackage.PROBLEM_OBSERVATION__MOOD_CODE;

	/**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VIRAL_HEPATITIS_HISTORY_OBSERVATION__NEGATION_IND = CCDPackage.PROBLEM_OBSERVATION__NEGATION_IND;

	/**
     * The number of structural features of the '<em>Viral Hepatitis History Observation</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VIRAL_HEPATITIS_HISTORY_OBSERVATION_FEATURE_COUNT = CCDPackage.PROBLEM_OBSERVATION_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.STDHistoryObservationImpl <em>STD History Observation</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.STDHistoryObservationImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.HepbPackageImpl#getSTDHistoryObservation()
     * @generated
     */
	int STD_HISTORY_OBSERVATION = 11;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int STD_HISTORY_OBSERVATION__REALM_CODE = CCDPackage.PROBLEM_OBSERVATION__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int STD_HISTORY_OBSERVATION__TYPE_ID = CCDPackage.PROBLEM_OBSERVATION__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int STD_HISTORY_OBSERVATION__TEMPLATE_ID = CCDPackage.PROBLEM_OBSERVATION__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int STD_HISTORY_OBSERVATION__ID = CCDPackage.PROBLEM_OBSERVATION__ID;

	/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int STD_HISTORY_OBSERVATION__CODE = CCDPackage.PROBLEM_OBSERVATION__CODE;

	/**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int STD_HISTORY_OBSERVATION__DERIVATION_EXPR = CCDPackage.PROBLEM_OBSERVATION__DERIVATION_EXPR;

	/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int STD_HISTORY_OBSERVATION__TEXT = CCDPackage.PROBLEM_OBSERVATION__TEXT;

	/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int STD_HISTORY_OBSERVATION__STATUS_CODE = CCDPackage.PROBLEM_OBSERVATION__STATUS_CODE;

	/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int STD_HISTORY_OBSERVATION__EFFECTIVE_TIME = CCDPackage.PROBLEM_OBSERVATION__EFFECTIVE_TIME;

	/**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int STD_HISTORY_OBSERVATION__PRIORITY_CODE = CCDPackage.PROBLEM_OBSERVATION__PRIORITY_CODE;

	/**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int STD_HISTORY_OBSERVATION__REPEAT_NUMBER = CCDPackage.PROBLEM_OBSERVATION__REPEAT_NUMBER;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int STD_HISTORY_OBSERVATION__LANGUAGE_CODE = CCDPackage.PROBLEM_OBSERVATION__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int STD_HISTORY_OBSERVATION__VALUE = CCDPackage.PROBLEM_OBSERVATION__VALUE;

	/**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int STD_HISTORY_OBSERVATION__INTERPRETATION_CODE = CCDPackage.PROBLEM_OBSERVATION__INTERPRETATION_CODE;

	/**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int STD_HISTORY_OBSERVATION__METHOD_CODE = CCDPackage.PROBLEM_OBSERVATION__METHOD_CODE;

	/**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int STD_HISTORY_OBSERVATION__TARGET_SITE_CODE = CCDPackage.PROBLEM_OBSERVATION__TARGET_SITE_CODE;

	/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int STD_HISTORY_OBSERVATION__SUBJECT = CCDPackage.PROBLEM_OBSERVATION__SUBJECT;

	/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int STD_HISTORY_OBSERVATION__SPECIMEN = CCDPackage.PROBLEM_OBSERVATION__SPECIMEN;

	/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int STD_HISTORY_OBSERVATION__PERFORMER = CCDPackage.PROBLEM_OBSERVATION__PERFORMER;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int STD_HISTORY_OBSERVATION__AUTHOR = CCDPackage.PROBLEM_OBSERVATION__AUTHOR;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int STD_HISTORY_OBSERVATION__INFORMANT = CCDPackage.PROBLEM_OBSERVATION__INFORMANT;

	/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int STD_HISTORY_OBSERVATION__PARTICIPANT = CCDPackage.PROBLEM_OBSERVATION__PARTICIPANT;

	/**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int STD_HISTORY_OBSERVATION__ENTRY_RELATIONSHIP = CCDPackage.PROBLEM_OBSERVATION__ENTRY_RELATIONSHIP;

	/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int STD_HISTORY_OBSERVATION__REFERENCE = CCDPackage.PROBLEM_OBSERVATION__REFERENCE;

	/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int STD_HISTORY_OBSERVATION__PRECONDITION = CCDPackage.PROBLEM_OBSERVATION__PRECONDITION;

	/**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int STD_HISTORY_OBSERVATION__REFERENCE_RANGE = CCDPackage.PROBLEM_OBSERVATION__REFERENCE_RANGE;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int STD_HISTORY_OBSERVATION__NULL_FLAVOR = CCDPackage.PROBLEM_OBSERVATION__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int STD_HISTORY_OBSERVATION__CLASS_CODE = CCDPackage.PROBLEM_OBSERVATION__CLASS_CODE;

	/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int STD_HISTORY_OBSERVATION__MOOD_CODE = CCDPackage.PROBLEM_OBSERVATION__MOOD_CODE;

	/**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int STD_HISTORY_OBSERVATION__NEGATION_IND = CCDPackage.PROBLEM_OBSERVATION__NEGATION_IND;

	/**
     * The number of structural features of the '<em>STD History Observation</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int STD_HISTORY_OBSERVATION_FEATURE_COUNT = CCDPackage.PROBLEM_OBSERVATION_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BIMMUNIZATION_SECTION__REALM_CODE = CCDPackage.IMMUNIZATIONS_SECTION__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BIMMUNIZATION_SECTION__TYPE_ID = CCDPackage.IMMUNIZATIONS_SECTION__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BIMMUNIZATION_SECTION__TEMPLATE_ID = CCDPackage.IMMUNIZATIONS_SECTION__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BIMMUNIZATION_SECTION__ID = CCDPackage.IMMUNIZATIONS_SECTION__ID;

	/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BIMMUNIZATION_SECTION__CODE = CCDPackage.IMMUNIZATIONS_SECTION__CODE;

	/**
     * The feature id for the '<em><b>Title</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BIMMUNIZATION_SECTION__TITLE = CCDPackage.IMMUNIZATIONS_SECTION__TITLE;

	/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BIMMUNIZATION_SECTION__TEXT = CCDPackage.IMMUNIZATIONS_SECTION__TEXT;

	/**
     * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BIMMUNIZATION_SECTION__CONFIDENTIALITY_CODE = CCDPackage.IMMUNIZATIONS_SECTION__CONFIDENTIALITY_CODE;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BIMMUNIZATION_SECTION__LANGUAGE_CODE = CCDPackage.IMMUNIZATIONS_SECTION__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BIMMUNIZATION_SECTION__SUBJECT = CCDPackage.IMMUNIZATIONS_SECTION__SUBJECT;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BIMMUNIZATION_SECTION__AUTHOR = CCDPackage.IMMUNIZATIONS_SECTION__AUTHOR;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BIMMUNIZATION_SECTION__INFORMANT = CCDPackage.IMMUNIZATIONS_SECTION__INFORMANT;

	/**
     * The feature id for the '<em><b>Entry</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BIMMUNIZATION_SECTION__ENTRY = CCDPackage.IMMUNIZATIONS_SECTION__ENTRY;

	/**
     * The feature id for the '<em><b>Component</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BIMMUNIZATION_SECTION__COMPONENT = CCDPackage.IMMUNIZATIONS_SECTION__COMPONENT;

	/**
     * The feature id for the '<em><b>Section Id</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BIMMUNIZATION_SECTION__SECTION_ID = CCDPackage.IMMUNIZATIONS_SECTION__SECTION_ID;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BIMMUNIZATION_SECTION__NULL_FLAVOR = CCDPackage.IMMUNIZATIONS_SECTION__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BIMMUNIZATION_SECTION__CLASS_CODE = CCDPackage.IMMUNIZATIONS_SECTION__CLASS_CODE;

	/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BIMMUNIZATION_SECTION__MOOD_CODE = CCDPackage.IMMUNIZATIONS_SECTION__MOOD_CODE;

	/**
     * The number of structural features of the '<em>Acute Hepatitis BImmunization Section</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BIMMUNIZATION_SECTION_FEATURE_COUNT = CCDPackage.IMMUNIZATIONS_SECTION_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BIMMUNIZATION_ACTIVITY__REALM_CODE = CCDPackage.MEDICATION_ACTIVITY__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BIMMUNIZATION_ACTIVITY__TYPE_ID = CCDPackage.MEDICATION_ACTIVITY__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BIMMUNIZATION_ACTIVITY__TEMPLATE_ID = CCDPackage.MEDICATION_ACTIVITY__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BIMMUNIZATION_ACTIVITY__ID = CCDPackage.MEDICATION_ACTIVITY__ID;

	/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BIMMUNIZATION_ACTIVITY__CODE = CCDPackage.MEDICATION_ACTIVITY__CODE;

	/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BIMMUNIZATION_ACTIVITY__TEXT = CCDPackage.MEDICATION_ACTIVITY__TEXT;

	/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BIMMUNIZATION_ACTIVITY__STATUS_CODE = CCDPackage.MEDICATION_ACTIVITY__STATUS_CODE;

	/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BIMMUNIZATION_ACTIVITY__EFFECTIVE_TIME = CCDPackage.MEDICATION_ACTIVITY__EFFECTIVE_TIME;

	/**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BIMMUNIZATION_ACTIVITY__PRIORITY_CODE = CCDPackage.MEDICATION_ACTIVITY__PRIORITY_CODE;

	/**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BIMMUNIZATION_ACTIVITY__REPEAT_NUMBER = CCDPackage.MEDICATION_ACTIVITY__REPEAT_NUMBER;

	/**
     * The feature id for the '<em><b>Route Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BIMMUNIZATION_ACTIVITY__ROUTE_CODE = CCDPackage.MEDICATION_ACTIVITY__ROUTE_CODE;

	/**
     * The feature id for the '<em><b>Approach Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BIMMUNIZATION_ACTIVITY__APPROACH_SITE_CODE = CCDPackage.MEDICATION_ACTIVITY__APPROACH_SITE_CODE;

	/**
     * The feature id for the '<em><b>Dose Quantity</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BIMMUNIZATION_ACTIVITY__DOSE_QUANTITY = CCDPackage.MEDICATION_ACTIVITY__DOSE_QUANTITY;

	/**
     * The feature id for the '<em><b>Rate Quantity</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BIMMUNIZATION_ACTIVITY__RATE_QUANTITY = CCDPackage.MEDICATION_ACTIVITY__RATE_QUANTITY;

	/**
     * The feature id for the '<em><b>Max Dose Quantity</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BIMMUNIZATION_ACTIVITY__MAX_DOSE_QUANTITY = CCDPackage.MEDICATION_ACTIVITY__MAX_DOSE_QUANTITY;

	/**
     * The feature id for the '<em><b>Administration Unit Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BIMMUNIZATION_ACTIVITY__ADMINISTRATION_UNIT_CODE = CCDPackage.MEDICATION_ACTIVITY__ADMINISTRATION_UNIT_CODE;

	/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BIMMUNIZATION_ACTIVITY__SUBJECT = CCDPackage.MEDICATION_ACTIVITY__SUBJECT;

	/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BIMMUNIZATION_ACTIVITY__SPECIMEN = CCDPackage.MEDICATION_ACTIVITY__SPECIMEN;

	/**
     * The feature id for the '<em><b>Consumable</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BIMMUNIZATION_ACTIVITY__CONSUMABLE = CCDPackage.MEDICATION_ACTIVITY__CONSUMABLE;

	/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BIMMUNIZATION_ACTIVITY__PERFORMER = CCDPackage.MEDICATION_ACTIVITY__PERFORMER;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BIMMUNIZATION_ACTIVITY__AUTHOR = CCDPackage.MEDICATION_ACTIVITY__AUTHOR;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BIMMUNIZATION_ACTIVITY__INFORMANT = CCDPackage.MEDICATION_ACTIVITY__INFORMANT;

	/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BIMMUNIZATION_ACTIVITY__PARTICIPANT = CCDPackage.MEDICATION_ACTIVITY__PARTICIPANT;

	/**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BIMMUNIZATION_ACTIVITY__ENTRY_RELATIONSHIP = CCDPackage.MEDICATION_ACTIVITY__ENTRY_RELATIONSHIP;

	/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BIMMUNIZATION_ACTIVITY__REFERENCE = CCDPackage.MEDICATION_ACTIVITY__REFERENCE;

	/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BIMMUNIZATION_ACTIVITY__PRECONDITION = CCDPackage.MEDICATION_ACTIVITY__PRECONDITION;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BIMMUNIZATION_ACTIVITY__NULL_FLAVOR = CCDPackage.MEDICATION_ACTIVITY__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BIMMUNIZATION_ACTIVITY__CLASS_CODE = CCDPackage.MEDICATION_ACTIVITY__CLASS_CODE;

	/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BIMMUNIZATION_ACTIVITY__MOOD_CODE = CCDPackage.MEDICATION_ACTIVITY__MOOD_CODE;

	/**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BIMMUNIZATION_ACTIVITY__NEGATION_IND = CCDPackage.MEDICATION_ACTIVITY__NEGATION_IND;

	/**
     * The number of structural features of the '<em>Acute Hepatitis BImmunization Activity</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BIMMUNIZATION_ACTIVITY_FEATURE_COUNT = CCDPackage.MEDICATION_ACTIVITY_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.AcuteHepatitisBPHCRTreatmentInformationSectionImpl <em>Acute Hepatitis BPHCR Treatment Information Section</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.AcuteHepatitisBPHCRTreatmentInformationSectionImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.HepbPackageImpl#getAcuteHepatitisBPHCRTreatmentInformationSection()
     * @generated
     */
	int ACUTE_HEPATITIS_BPHCR_TREATMENT_INFORMATION_SECTION = 14;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPHCR_TREATMENT_INFORMATION_SECTION__REALM_CODE = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPHCR_TREATMENT_INFORMATION_SECTION__TYPE_ID = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPHCR_TREATMENT_INFORMATION_SECTION__TEMPLATE_ID = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPHCR_TREATMENT_INFORMATION_SECTION__ID = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__ID;

	/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPHCR_TREATMENT_INFORMATION_SECTION__CODE = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__CODE;

	/**
     * The feature id for the '<em><b>Title</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPHCR_TREATMENT_INFORMATION_SECTION__TITLE = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__TITLE;

	/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPHCR_TREATMENT_INFORMATION_SECTION__TEXT = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__TEXT;

	/**
     * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPHCR_TREATMENT_INFORMATION_SECTION__CONFIDENTIALITY_CODE = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__CONFIDENTIALITY_CODE;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPHCR_TREATMENT_INFORMATION_SECTION__LANGUAGE_CODE = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPHCR_TREATMENT_INFORMATION_SECTION__SUBJECT = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__SUBJECT;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPHCR_TREATMENT_INFORMATION_SECTION__AUTHOR = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__AUTHOR;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPHCR_TREATMENT_INFORMATION_SECTION__INFORMANT = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__INFORMANT;

	/**
     * The feature id for the '<em><b>Entry</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPHCR_TREATMENT_INFORMATION_SECTION__ENTRY = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__ENTRY;

	/**
     * The feature id for the '<em><b>Component</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPHCR_TREATMENT_INFORMATION_SECTION__COMPONENT = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__COMPONENT;

	/**
     * The feature id for the '<em><b>Section Id</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPHCR_TREATMENT_INFORMATION_SECTION__SECTION_ID = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__SECTION_ID;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPHCR_TREATMENT_INFORMATION_SECTION__NULL_FLAVOR = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPHCR_TREATMENT_INFORMATION_SECTION__CLASS_CODE = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__CLASS_CODE;

	/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPHCR_TREATMENT_INFORMATION_SECTION__MOOD_CODE = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__MOOD_CODE;

	/**
     * The number of structural features of the '<em>Acute Hepatitis BPHCR Treatment Information Section</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPHCR_TREATMENT_INFORMATION_SECTION_FEATURE_COUNT = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.AcuteHepatitisBTherapeuticRegimenActImpl <em>Acute Hepatitis BTherapeutic Regimen Act</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.AcuteHepatitisBTherapeuticRegimenActImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.HepbPackageImpl#getAcuteHepatitisBTherapeuticRegimenAct()
     * @generated
     */
	int ACUTE_HEPATITIS_BTHERAPEUTIC_REGIMEN_ACT = 15;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BTHERAPEUTIC_REGIMEN_ACT__REALM_CODE = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BTHERAPEUTIC_REGIMEN_ACT__TYPE_ID = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BTHERAPEUTIC_REGIMEN_ACT__TEMPLATE_ID = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BTHERAPEUTIC_REGIMEN_ACT__ID = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__ID;

	/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BTHERAPEUTIC_REGIMEN_ACT__CODE = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__CODE;

	/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BTHERAPEUTIC_REGIMEN_ACT__TEXT = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__TEXT;

	/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BTHERAPEUTIC_REGIMEN_ACT__STATUS_CODE = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__STATUS_CODE;

	/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BTHERAPEUTIC_REGIMEN_ACT__EFFECTIVE_TIME = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__EFFECTIVE_TIME;

	/**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BTHERAPEUTIC_REGIMEN_ACT__PRIORITY_CODE = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__PRIORITY_CODE;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BTHERAPEUTIC_REGIMEN_ACT__LANGUAGE_CODE = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BTHERAPEUTIC_REGIMEN_ACT__SUBJECT = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__SUBJECT;

	/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BTHERAPEUTIC_REGIMEN_ACT__SPECIMEN = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__SPECIMEN;

	/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BTHERAPEUTIC_REGIMEN_ACT__PERFORMER = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__PERFORMER;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BTHERAPEUTIC_REGIMEN_ACT__AUTHOR = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__AUTHOR;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BTHERAPEUTIC_REGIMEN_ACT__INFORMANT = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__INFORMANT;

	/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BTHERAPEUTIC_REGIMEN_ACT__PARTICIPANT = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__PARTICIPANT;

	/**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BTHERAPEUTIC_REGIMEN_ACT__ENTRY_RELATIONSHIP = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__ENTRY_RELATIONSHIP;

	/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BTHERAPEUTIC_REGIMEN_ACT__REFERENCE = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__REFERENCE;

	/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BTHERAPEUTIC_REGIMEN_ACT__PRECONDITION = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__PRECONDITION;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BTHERAPEUTIC_REGIMEN_ACT__NULL_FLAVOR = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BTHERAPEUTIC_REGIMEN_ACT__CLASS_CODE = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__CLASS_CODE;

	/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BTHERAPEUTIC_REGIMEN_ACT__MOOD_CODE = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__MOOD_CODE;

	/**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BTHERAPEUTIC_REGIMEN_ACT__NEGATION_IND = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__NEGATION_IND;

	/**
     * The number of structural features of the '<em>Acute Hepatitis BTherapeutic Regimen Act</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BTHERAPEUTIC_REGIMEN_ACT_FEATURE_COUNT = PhcrPackage.THERAPEUTIC_REGIMEN_ACT_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionImpl <em>Acute Hepatitis BPHCR Relevant Diagnostic Tests And Or Laboratory Data Section</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.HepbPackageImpl#getAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection()
     * @generated
     */
	int ACUTE_HEPATITIS_BPHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION = 16;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__REALM_CODE = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__TYPE_ID = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__TEMPLATE_ID = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__ID = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__ID;

	/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__CODE = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__CODE;

	/**
     * The feature id for the '<em><b>Title</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__TITLE = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__TITLE;

	/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__TEXT = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__TEXT;

	/**
     * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__CONFIDENTIALITY_CODE = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__CONFIDENTIALITY_CODE;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__LANGUAGE_CODE = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__SUBJECT = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__SUBJECT;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__AUTHOR = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__AUTHOR;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__INFORMANT = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__INFORMANT;

	/**
     * The feature id for the '<em><b>Entry</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__ENTRY = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__ENTRY;

	/**
     * The feature id for the '<em><b>Component</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__COMPONENT = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__COMPONENT;

	/**
     * The feature id for the '<em><b>Section Id</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__SECTION_ID = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__SECTION_ID;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__NULL_FLAVOR = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__CLASS_CODE = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__CLASS_CODE;

	/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__MOOD_CODE = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__MOOD_CODE;

	/**
     * The number of structural features of the '<em>Acute Hepatitis BPHCR Relevant Diagnostic Tests And Or Laboratory Data Section</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BPHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION_FEATURE_COUNT = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.AcuteHepatitisBResultObservationImpl <em>Acute Hepatitis BResult Observation</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.AcuteHepatitisBResultObservationImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.HepbPackageImpl#getAcuteHepatitisBResultObservation()
     * @generated
     */
	int ACUTE_HEPATITIS_BRESULT_OBSERVATION = 17;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BRESULT_OBSERVATION__REALM_CODE = PhcrPackage.RESULT_OBSERVATION__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BRESULT_OBSERVATION__TYPE_ID = PhcrPackage.RESULT_OBSERVATION__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BRESULT_OBSERVATION__TEMPLATE_ID = PhcrPackage.RESULT_OBSERVATION__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BRESULT_OBSERVATION__ID = PhcrPackage.RESULT_OBSERVATION__ID;

	/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BRESULT_OBSERVATION__CODE = PhcrPackage.RESULT_OBSERVATION__CODE;

	/**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BRESULT_OBSERVATION__DERIVATION_EXPR = PhcrPackage.RESULT_OBSERVATION__DERIVATION_EXPR;

	/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BRESULT_OBSERVATION__TEXT = PhcrPackage.RESULT_OBSERVATION__TEXT;

	/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BRESULT_OBSERVATION__STATUS_CODE = PhcrPackage.RESULT_OBSERVATION__STATUS_CODE;

	/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BRESULT_OBSERVATION__EFFECTIVE_TIME = PhcrPackage.RESULT_OBSERVATION__EFFECTIVE_TIME;

	/**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BRESULT_OBSERVATION__PRIORITY_CODE = PhcrPackage.RESULT_OBSERVATION__PRIORITY_CODE;

	/**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BRESULT_OBSERVATION__REPEAT_NUMBER = PhcrPackage.RESULT_OBSERVATION__REPEAT_NUMBER;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BRESULT_OBSERVATION__LANGUAGE_CODE = PhcrPackage.RESULT_OBSERVATION__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BRESULT_OBSERVATION__VALUE = PhcrPackage.RESULT_OBSERVATION__VALUE;

	/**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BRESULT_OBSERVATION__INTERPRETATION_CODE = PhcrPackage.RESULT_OBSERVATION__INTERPRETATION_CODE;

	/**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BRESULT_OBSERVATION__METHOD_CODE = PhcrPackage.RESULT_OBSERVATION__METHOD_CODE;

	/**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BRESULT_OBSERVATION__TARGET_SITE_CODE = PhcrPackage.RESULT_OBSERVATION__TARGET_SITE_CODE;

	/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BRESULT_OBSERVATION__SUBJECT = PhcrPackage.RESULT_OBSERVATION__SUBJECT;

	/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BRESULT_OBSERVATION__SPECIMEN = PhcrPackage.RESULT_OBSERVATION__SPECIMEN;

	/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BRESULT_OBSERVATION__PERFORMER = PhcrPackage.RESULT_OBSERVATION__PERFORMER;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BRESULT_OBSERVATION__AUTHOR = PhcrPackage.RESULT_OBSERVATION__AUTHOR;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BRESULT_OBSERVATION__INFORMANT = PhcrPackage.RESULT_OBSERVATION__INFORMANT;

	/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BRESULT_OBSERVATION__PARTICIPANT = PhcrPackage.RESULT_OBSERVATION__PARTICIPANT;

	/**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BRESULT_OBSERVATION__ENTRY_RELATIONSHIP = PhcrPackage.RESULT_OBSERVATION__ENTRY_RELATIONSHIP;

	/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BRESULT_OBSERVATION__REFERENCE = PhcrPackage.RESULT_OBSERVATION__REFERENCE;

	/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BRESULT_OBSERVATION__PRECONDITION = PhcrPackage.RESULT_OBSERVATION__PRECONDITION;

	/**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BRESULT_OBSERVATION__REFERENCE_RANGE = PhcrPackage.RESULT_OBSERVATION__REFERENCE_RANGE;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BRESULT_OBSERVATION__NULL_FLAVOR = PhcrPackage.RESULT_OBSERVATION__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BRESULT_OBSERVATION__CLASS_CODE = PhcrPackage.RESULT_OBSERVATION__CLASS_CODE;

	/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BRESULT_OBSERVATION__MOOD_CODE = PhcrPackage.RESULT_OBSERVATION__MOOD_CODE;

	/**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BRESULT_OBSERVATION__NEGATION_IND = PhcrPackage.RESULT_OBSERVATION__NEGATION_IND;

	/**
     * The number of structural features of the '<em>Acute Hepatitis BResult Observation</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BRESULT_OBSERVATION_FEATURE_COUNT = PhcrPackage.RESULT_OBSERVATION_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.AcuteHepatitisBImmunizationProductImpl <em>Acute Hepatitis BImmunization Product</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.AcuteHepatitisBImmunizationProductImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.HepbPackageImpl#getAcuteHepatitisBImmunizationProduct()
     * @generated
     */
	int ACUTE_HEPATITIS_BIMMUNIZATION_PRODUCT = 18;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BIMMUNIZATION_PRODUCT__REALM_CODE = CCDPackage.PRODUCT__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BIMMUNIZATION_PRODUCT__TYPE_ID = CCDPackage.PRODUCT__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BIMMUNIZATION_PRODUCT__TEMPLATE_ID = CCDPackage.PRODUCT__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BIMMUNIZATION_PRODUCT__ID = CCDPackage.PRODUCT__ID;

	/**
     * The feature id for the '<em><b>Manufactured Labeled Drug</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BIMMUNIZATION_PRODUCT__MANUFACTURED_LABELED_DRUG = CCDPackage.PRODUCT__MANUFACTURED_LABELED_DRUG;

	/**
     * The feature id for the '<em><b>Manufactured Material</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BIMMUNIZATION_PRODUCT__MANUFACTURED_MATERIAL = CCDPackage.PRODUCT__MANUFACTURED_MATERIAL;

	/**
     * The feature id for the '<em><b>Manufacturer Organization</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BIMMUNIZATION_PRODUCT__MANUFACTURER_ORGANIZATION = CCDPackage.PRODUCT__MANUFACTURER_ORGANIZATION;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BIMMUNIZATION_PRODUCT__NULL_FLAVOR = CCDPackage.PRODUCT__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BIMMUNIZATION_PRODUCT__CLASS_CODE = CCDPackage.PRODUCT__CLASS_CODE;

	/**
     * The number of structural features of the '<em>Acute Hepatitis BImmunization Product</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ACUTE_HEPATITIS_BIMMUNIZATION_PRODUCT_FEATURE_COUNT = CCDPackage.PRODUCT_FEATURE_COUNT + 0;


	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBCaseReport <em>Acute Hepatitis BCase Report</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Acute Hepatitis BCase Report</em>'.
     * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBCaseReport
     * @generated
     */
	EClass getAcuteHepatitisBCaseReport();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBSocialHistorySection <em>Acute Hepatitis BSocial History Section</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Acute Hepatitis BSocial History Section</em>'.
     * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBSocialHistorySection
     * @generated
     */
	EClass getAcuteHepatitisBSocialHistorySection();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.JobRelatedBodyFluidExposureRiskFrequencyObservation <em>Job Related Body Fluid Exposure Risk Frequency Observation</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Job Related Body Fluid Exposure Risk Frequency Observation</em>'.
     * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.JobRelatedBodyFluidExposureRiskFrequencyObservation
     * @generated
     */
	EClass getJobRelatedBodyFluidExposureRiskFrequencyObservation();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation <em>Acute Hepatitis BSocio Behavioral Boolean Risk Factor Observation</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Acute Hepatitis BSocio Behavioral Boolean Risk Factor Observation</em>'.
     * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation
     * @generated
     */
	EClass getAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation <em>Acute Hepatitis BActual Blood And Or Body Fluid Exposure Observation</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Acute Hepatitis BActual Blood And Or Body Fluid Exposure Observation</em>'.
     * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation
     * @generated
     */
	EClass getAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPossibleExposureLocationAndTypeAct <em>Acute Hepatitis BPossible Exposure Location And Type Act</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Acute Hepatitis BPossible Exposure Location And Type Act</em>'.
     * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPossibleExposureLocationAndTypeAct
     * @generated
     */
	EClass getAcuteHepatitisBPossibleExposureLocationAndTypeAct();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBImmunizationSection <em>Acute Hepatitis BImmunization Section</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Acute Hepatitis BImmunization Section</em>'.
     * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBImmunizationSection
     * @generated
     */
	EClass getAcuteHepatitisBImmunizationSection();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBImmunizationActivity <em>Acute Hepatitis BImmunization Activity</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Acute Hepatitis BImmunization Activity</em>'.
     * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBImmunizationActivity
     * @generated
     */
	EClass getAcuteHepatitisBImmunizationActivity();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRClinicalInformationSection <em>Acute Hepatitis BPHCR Clinical Information Section</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Acute Hepatitis BPHCR Clinical Information Section</em>'.
     * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRClinicalInformationSection
     * @generated
     */
	EClass getAcuteHepatitisBPHCRClinicalInformationSection();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBCaseObservation <em>Acute Hepatitis BCase Observation</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Acute Hepatitis BCase Observation</em>'.
     * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBCaseObservation
     * @generated
     */
	EClass getAcuteHepatitisBCaseObservation();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBSignsAndSymptomsObservation <em>Acute Hepatitis BSigns And Symptoms Observation</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Acute Hepatitis BSigns And Symptoms Observation</em>'.
     * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBSignsAndSymptomsObservation
     * @generated
     */
	EClass getAcuteHepatitisBSignsAndSymptomsObservation();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBRiskAssociatedProcedure <em>Acute Hepatitis BRisk Associated Procedure</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Acute Hepatitis BRisk Associated Procedure</em>'.
     * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBRiskAssociatedProcedure
     * @generated
     */
	EClass getAcuteHepatitisBRiskAssociatedProcedure();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.ViralHepatitisHistoryObservation <em>Viral Hepatitis History Observation</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Viral Hepatitis History Observation</em>'.
     * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.ViralHepatitisHistoryObservation
     * @generated
     */
	EClass getViralHepatitisHistoryObservation();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.STDHistoryObservation <em>STD History Observation</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>STD History Observation</em>'.
     * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.STDHistoryObservation
     * @generated
     */
	EClass getSTDHistoryObservation();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRTreatmentInformationSection <em>Acute Hepatitis BPHCR Treatment Information Section</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Acute Hepatitis BPHCR Treatment Information Section</em>'.
     * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRTreatmentInformationSection
     * @generated
     */
	EClass getAcuteHepatitisBPHCRTreatmentInformationSection();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBTherapeuticRegimenAct <em>Acute Hepatitis BTherapeutic Regimen Act</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Acute Hepatitis BTherapeutic Regimen Act</em>'.
     * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBTherapeuticRegimenAct
     * @generated
     */
	EClass getAcuteHepatitisBTherapeuticRegimenAct();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection <em>Acute Hepatitis BPHCR Relevant Diagnostic Tests And Or Laboratory Data Section</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Acute Hepatitis BPHCR Relevant Diagnostic Tests And Or Laboratory Data Section</em>'.
     * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection
     * @generated
     */
	EClass getAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBResultObservation <em>Acute Hepatitis BResult Observation</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Acute Hepatitis BResult Observation</em>'.
     * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBResultObservation
     * @generated
     */
	EClass getAcuteHepatitisBResultObservation();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBImmunizationProduct <em>Acute Hepatitis BImmunization Product</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Acute Hepatitis BImmunization Product</em>'.
     * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBImmunizationProduct
     * @generated
     */
	EClass getAcuteHepatitisBImmunizationProduct();

	/**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
	HepbFactory getHepbFactory();

	/**
     * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
     * @generated
     */
	interface Literals {
		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.AcuteHepatitisBCaseReportImpl <em>Acute Hepatitis BCase Report</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.AcuteHepatitisBCaseReportImpl
         * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.HepbPackageImpl#getAcuteHepatitisBCaseReport()
         * @generated
         */
		EClass ACUTE_HEPATITIS_BCASE_REPORT = eINSTANCE.getAcuteHepatitisBCaseReport();
		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.AcuteHepatitisBSocialHistorySectionImpl <em>Acute Hepatitis BSocial History Section</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.AcuteHepatitisBSocialHistorySectionImpl
         * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.HepbPackageImpl#getAcuteHepatitisBSocialHistorySection()
         * @generated
         */
		EClass ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION = eINSTANCE.getAcuteHepatitisBSocialHistorySection();
		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.JobRelatedBodyFluidExposureRiskFrequencyObservationImpl <em>Job Related Body Fluid Exposure Risk Frequency Observation</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.JobRelatedBodyFluidExposureRiskFrequencyObservationImpl
         * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.HepbPackageImpl#getJobRelatedBodyFluidExposureRiskFrequencyObservation()
         * @generated
         */
		EClass JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION = eINSTANCE.getJobRelatedBodyFluidExposureRiskFrequencyObservation();
		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationImpl <em>Acute Hepatitis BSocio Behavioral Boolean Risk Factor Observation</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationImpl
         * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.HepbPackageImpl#getAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation()
         * @generated
         */
		EClass ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION = eINSTANCE.getAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation();
		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationImpl <em>Acute Hepatitis BActual Blood And Or Body Fluid Exposure Observation</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationImpl
         * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.HepbPackageImpl#getAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation()
         * @generated
         */
		EClass ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION = eINSTANCE.getAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation();
		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.AcuteHepatitisBPossibleExposureLocationAndTypeActImpl <em>Acute Hepatitis BPossible Exposure Location And Type Act</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.AcuteHepatitisBPossibleExposureLocationAndTypeActImpl
         * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.HepbPackageImpl#getAcuteHepatitisBPossibleExposureLocationAndTypeAct()
         * @generated
         */
		EClass ACUTE_HEPATITIS_BPOSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT = eINSTANCE.getAcuteHepatitisBPossibleExposureLocationAndTypeAct();
		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.AcuteHepatitisBImmunizationSectionImpl <em>Acute Hepatitis BImmunization Section</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.AcuteHepatitisBImmunizationSectionImpl
         * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.HepbPackageImpl#getAcuteHepatitisBImmunizationSection()
         * @generated
         */
		EClass ACUTE_HEPATITIS_BIMMUNIZATION_SECTION = eINSTANCE.getAcuteHepatitisBImmunizationSection();
		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.AcuteHepatitisBImmunizationActivityImpl <em>Acute Hepatitis BImmunization Activity</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.AcuteHepatitisBImmunizationActivityImpl
         * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.HepbPackageImpl#getAcuteHepatitisBImmunizationActivity()
         * @generated
         */
		EClass ACUTE_HEPATITIS_BIMMUNIZATION_ACTIVITY = eINSTANCE.getAcuteHepatitisBImmunizationActivity();
		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.AcuteHepatitisBPHCRClinicalInformationSectionImpl <em>Acute Hepatitis BPHCR Clinical Information Section</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.AcuteHepatitisBPHCRClinicalInformationSectionImpl
         * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.HepbPackageImpl#getAcuteHepatitisBPHCRClinicalInformationSection()
         * @generated
         */
		EClass ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION = eINSTANCE.getAcuteHepatitisBPHCRClinicalInformationSection();
		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.AcuteHepatitisBCaseObservationImpl <em>Acute Hepatitis BCase Observation</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.AcuteHepatitisBCaseObservationImpl
         * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.HepbPackageImpl#getAcuteHepatitisBCaseObservation()
         * @generated
         */
		EClass ACUTE_HEPATITIS_BCASE_OBSERVATION = eINSTANCE.getAcuteHepatitisBCaseObservation();
		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.AcuteHepatitisBSignsAndSymptomsObservationImpl <em>Acute Hepatitis BSigns And Symptoms Observation</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.AcuteHepatitisBSignsAndSymptomsObservationImpl
         * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.HepbPackageImpl#getAcuteHepatitisBSignsAndSymptomsObservation()
         * @generated
         */
		EClass ACUTE_HEPATITIS_BSIGNS_AND_SYMPTOMS_OBSERVATION = eINSTANCE.getAcuteHepatitisBSignsAndSymptomsObservation();
		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.AcuteHepatitisBRiskAssociatedProcedureImpl <em>Acute Hepatitis BRisk Associated Procedure</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.AcuteHepatitisBRiskAssociatedProcedureImpl
         * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.HepbPackageImpl#getAcuteHepatitisBRiskAssociatedProcedure()
         * @generated
         */
		EClass ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURE = eINSTANCE.getAcuteHepatitisBRiskAssociatedProcedure();
		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.ViralHepatitisHistoryObservationImpl <em>Viral Hepatitis History Observation</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.ViralHepatitisHistoryObservationImpl
         * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.HepbPackageImpl#getViralHepatitisHistoryObservation()
         * @generated
         */
		EClass VIRAL_HEPATITIS_HISTORY_OBSERVATION = eINSTANCE.getViralHepatitisHistoryObservation();
		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.STDHistoryObservationImpl <em>STD History Observation</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.STDHistoryObservationImpl
         * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.HepbPackageImpl#getSTDHistoryObservation()
         * @generated
         */
		EClass STD_HISTORY_OBSERVATION = eINSTANCE.getSTDHistoryObservation();
		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.AcuteHepatitisBPHCRTreatmentInformationSectionImpl <em>Acute Hepatitis BPHCR Treatment Information Section</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.AcuteHepatitisBPHCRTreatmentInformationSectionImpl
         * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.HepbPackageImpl#getAcuteHepatitisBPHCRTreatmentInformationSection()
         * @generated
         */
		EClass ACUTE_HEPATITIS_BPHCR_TREATMENT_INFORMATION_SECTION = eINSTANCE.getAcuteHepatitisBPHCRTreatmentInformationSection();
		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.AcuteHepatitisBTherapeuticRegimenActImpl <em>Acute Hepatitis BTherapeutic Regimen Act</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.AcuteHepatitisBTherapeuticRegimenActImpl
         * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.HepbPackageImpl#getAcuteHepatitisBTherapeuticRegimenAct()
         * @generated
         */
		EClass ACUTE_HEPATITIS_BTHERAPEUTIC_REGIMEN_ACT = eINSTANCE.getAcuteHepatitisBTherapeuticRegimenAct();
		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionImpl <em>Acute Hepatitis BPHCR Relevant Diagnostic Tests And Or Laboratory Data Section</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionImpl
         * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.HepbPackageImpl#getAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection()
         * @generated
         */
		EClass ACUTE_HEPATITIS_BPHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION = eINSTANCE.getAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection();
		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.AcuteHepatitisBResultObservationImpl <em>Acute Hepatitis BResult Observation</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.AcuteHepatitisBResultObservationImpl
         * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.HepbPackageImpl#getAcuteHepatitisBResultObservation()
         * @generated
         */
		EClass ACUTE_HEPATITIS_BRESULT_OBSERVATION = eINSTANCE.getAcuteHepatitisBResultObservation();
		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.AcuteHepatitisBImmunizationProductImpl <em>Acute Hepatitis BImmunization Product</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.AcuteHepatitisBImmunizationProductImpl
         * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.impl.HepbPackageImpl#getAcuteHepatitisBImmunizationProduct()
         * @generated
         */
		EClass ACUTE_HEPATITIS_BIMMUNIZATION_PRODUCT = eINSTANCE.getAcuteHepatitisBImmunizationProduct();

	}

} //HepbPackage
