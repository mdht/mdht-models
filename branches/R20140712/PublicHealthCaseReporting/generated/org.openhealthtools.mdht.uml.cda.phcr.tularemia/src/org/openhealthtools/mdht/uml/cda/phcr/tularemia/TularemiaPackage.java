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
package org.openhealthtools.mdht.uml.cda.phcr.tularemia;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.openhealthtools.mdht.uml.cda.CDAPackage;

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
 * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaFactory
 * @model kind="package"
 *        annotation="http://www.openhealthtools.org/mdht/uml initializers='org.openhealthtools.mdht.uml.cda.phcr.tularemia'"
 * @generated
 */
public interface TularemiaPackage extends EPackage {
	/**
     * The package name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNAME = "tularemia";

	/**
     * The package namespace URI.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_URI = "http://www.openhealthtools.org/mdht/uml/cda/phcr/tularemia";

	/**
     * The package namespace name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_PREFIX = "tularemia";

	/**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	TularemiaPackage eINSTANCE = org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaPackageImpl.init();

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaCaseReportImpl <em>Case Report</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaCaseReportImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaPackageImpl#getTularemiaCaseReport()
     * @generated
     */
	int TULAREMIA_CASE_REPORT = 0;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_CASE_REPORT__REALM_CODE = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_CASE_REPORT__TYPE_ID = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_CASE_REPORT__TEMPLATE_ID = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_CASE_REPORT__ID = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__ID;

	/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_CASE_REPORT__CODE = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__CODE;

	/**
     * The feature id for the '<em><b>Title</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_CASE_REPORT__TITLE = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__TITLE;

	/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_CASE_REPORT__EFFECTIVE_TIME = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__EFFECTIVE_TIME;

	/**
     * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_CASE_REPORT__CONFIDENTIALITY_CODE = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__CONFIDENTIALITY_CODE;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_CASE_REPORT__LANGUAGE_CODE = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Set Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_CASE_REPORT__SET_ID = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__SET_ID;

	/**
     * The feature id for the '<em><b>Version Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_CASE_REPORT__VERSION_NUMBER = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__VERSION_NUMBER;

	/**
     * The feature id for the '<em><b>Copy Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_CASE_REPORT__COPY_TIME = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__COPY_TIME;

	/**
     * The feature id for the '<em><b>Record Target</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_CASE_REPORT__RECORD_TARGET = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__RECORD_TARGET;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_CASE_REPORT__AUTHOR = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__AUTHOR;

	/**
     * The feature id for the '<em><b>Data Enterer</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_CASE_REPORT__DATA_ENTERER = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__DATA_ENTERER;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_CASE_REPORT__INFORMANT = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__INFORMANT;

	/**
     * The feature id for the '<em><b>Custodian</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_CASE_REPORT__CUSTODIAN = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__CUSTODIAN;

	/**
     * The feature id for the '<em><b>Information Recipient</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_CASE_REPORT__INFORMATION_RECIPIENT = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__INFORMATION_RECIPIENT;

	/**
     * The feature id for the '<em><b>Legal Authenticator</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_CASE_REPORT__LEGAL_AUTHENTICATOR = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__LEGAL_AUTHENTICATOR;

	/**
     * The feature id for the '<em><b>Authenticator</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_CASE_REPORT__AUTHENTICATOR = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__AUTHENTICATOR;

	/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_CASE_REPORT__PARTICIPANT = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__PARTICIPANT;

	/**
     * The feature id for the '<em><b>In Fulfillment Of</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_CASE_REPORT__IN_FULFILLMENT_OF = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__IN_FULFILLMENT_OF;

	/**
     * The feature id for the '<em><b>Documentation Of</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_CASE_REPORT__DOCUMENTATION_OF = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__DOCUMENTATION_OF;

	/**
     * The feature id for the '<em><b>Related Document</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_CASE_REPORT__RELATED_DOCUMENT = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__RELATED_DOCUMENT;

	/**
     * The feature id for the '<em><b>Authorization</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_CASE_REPORT__AUTHORIZATION = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__AUTHORIZATION;

	/**
     * The feature id for the '<em><b>Component Of</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_CASE_REPORT__COMPONENT_OF = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__COMPONENT_OF;

	/**
     * The feature id for the '<em><b>Component</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_CASE_REPORT__COMPONENT = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__COMPONENT;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_CASE_REPORT__NULL_FLAVOR = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_CASE_REPORT__CLASS_CODE = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__CLASS_CODE;

	/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_CASE_REPORT__MOOD_CODE = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__MOOD_CODE;

	/**
     * The number of structural features of the '<em>Case Report</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_CASE_REPORT_FEATURE_COUNT = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaPHCRSocialHistorySectionImpl <em>PHCR Social History Section</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaPHCRSocialHistorySectionImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaPackageImpl#getTularemiaPHCRSocialHistorySection()
     * @generated
     */
	int TULAREMIA_PHCR_SOCIAL_HISTORY_SECTION = 1;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_SOCIAL_HISTORY_SECTION__REALM_CODE = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_SOCIAL_HISTORY_SECTION__TYPE_ID = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_SOCIAL_HISTORY_SECTION__TEMPLATE_ID = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_SOCIAL_HISTORY_SECTION__ID = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__ID;

	/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_SOCIAL_HISTORY_SECTION__CODE = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__CODE;

	/**
     * The feature id for the '<em><b>Title</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_SOCIAL_HISTORY_SECTION__TITLE = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__TITLE;

	/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_SOCIAL_HISTORY_SECTION__TEXT = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__TEXT;

	/**
     * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_SOCIAL_HISTORY_SECTION__CONFIDENTIALITY_CODE = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__CONFIDENTIALITY_CODE;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_SOCIAL_HISTORY_SECTION__LANGUAGE_CODE = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_SOCIAL_HISTORY_SECTION__SUBJECT = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__SUBJECT;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_SOCIAL_HISTORY_SECTION__AUTHOR = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__AUTHOR;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_SOCIAL_HISTORY_SECTION__INFORMANT = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__INFORMANT;

	/**
     * The feature id for the '<em><b>Entry</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_SOCIAL_HISTORY_SECTION__ENTRY = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__ENTRY;

	/**
     * The feature id for the '<em><b>Component</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_SOCIAL_HISTORY_SECTION__COMPONENT = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__COMPONENT;

	/**
     * The feature id for the '<em><b>Section Id</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_SOCIAL_HISTORY_SECTION__SECTION_ID = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__SECTION_ID;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_SOCIAL_HISTORY_SECTION__NULL_FLAVOR = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_SOCIAL_HISTORY_SECTION__CLASS_CODE = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__CLASS_CODE;

	/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_SOCIAL_HISTORY_SECTION__MOOD_CODE = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__MOOD_CODE;

	/**
     * The number of structural features of the '<em>PHCR Social History Section</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_SOCIAL_HISTORY_SECTION_FEATURE_COUNT = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaPossibleExposureLocationAndTypeActImpl <em>Possible Exposure Location And Type Act</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaPossibleExposureLocationAndTypeActImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaPackageImpl#getTularemiaPossibleExposureLocationAndTypeAct()
     * @generated
     */
	int TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT = 2;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__REALM_CODE = CDAPackage.ACT__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__TYPE_ID = CDAPackage.ACT__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__TEMPLATE_ID = CDAPackage.ACT__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__ID = CDAPackage.ACT__ID;

	/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__CODE = CDAPackage.ACT__CODE;

	/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__TEXT = CDAPackage.ACT__TEXT;

	/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__STATUS_CODE = CDAPackage.ACT__STATUS_CODE;

	/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__EFFECTIVE_TIME = CDAPackage.ACT__EFFECTIVE_TIME;

	/**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__PRIORITY_CODE = CDAPackage.ACT__PRIORITY_CODE;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__LANGUAGE_CODE = CDAPackage.ACT__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__SUBJECT = CDAPackage.ACT__SUBJECT;

	/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__SPECIMEN = CDAPackage.ACT__SPECIMEN;

	/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__PERFORMER = CDAPackage.ACT__PERFORMER;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__AUTHOR = CDAPackage.ACT__AUTHOR;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__INFORMANT = CDAPackage.ACT__INFORMANT;

	/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__PARTICIPANT = CDAPackage.ACT__PARTICIPANT;

	/**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__ENTRY_RELATIONSHIP = CDAPackage.ACT__ENTRY_RELATIONSHIP;

	/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__REFERENCE = CDAPackage.ACT__REFERENCE;

	/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__PRECONDITION = CDAPackage.ACT__PRECONDITION;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__NULL_FLAVOR = CDAPackage.ACT__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__CLASS_CODE = CDAPackage.ACT__CLASS_CODE;

	/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__MOOD_CODE = CDAPackage.ACT__MOOD_CODE;

	/**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__NEGATION_IND = CDAPackage.ACT__NEGATION_IND;

	/**
     * The number of structural features of the '<em>Possible Exposure Location And Type Act</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_FEATURE_COUNT = CDAPackage.ACT_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaPHCRClinicalInformationSectionImpl <em>PHCR Clinical Information Section</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaPHCRClinicalInformationSectionImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaPackageImpl#getTularemiaPHCRClinicalInformationSection()
     * @generated
     */
	int TULAREMIA_PHCR_CLINICAL_INFORMATION_SECTION = 3;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_CLINICAL_INFORMATION_SECTION__REALM_CODE = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_CLINICAL_INFORMATION_SECTION__TYPE_ID = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_CLINICAL_INFORMATION_SECTION__TEMPLATE_ID = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_CLINICAL_INFORMATION_SECTION__ID = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__ID;

	/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_CLINICAL_INFORMATION_SECTION__CODE = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__CODE;

	/**
     * The feature id for the '<em><b>Title</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_CLINICAL_INFORMATION_SECTION__TITLE = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__TITLE;

	/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_CLINICAL_INFORMATION_SECTION__TEXT = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__TEXT;

	/**
     * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_CLINICAL_INFORMATION_SECTION__CONFIDENTIALITY_CODE = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__CONFIDENTIALITY_CODE;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_CLINICAL_INFORMATION_SECTION__LANGUAGE_CODE = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_CLINICAL_INFORMATION_SECTION__SUBJECT = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__SUBJECT;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_CLINICAL_INFORMATION_SECTION__AUTHOR = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__AUTHOR;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_CLINICAL_INFORMATION_SECTION__INFORMANT = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__INFORMANT;

	/**
     * The feature id for the '<em><b>Entry</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_CLINICAL_INFORMATION_SECTION__ENTRY = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__ENTRY;

	/**
     * The feature id for the '<em><b>Component</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_CLINICAL_INFORMATION_SECTION__COMPONENT = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__COMPONENT;

	/**
     * The feature id for the '<em><b>Section Id</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_CLINICAL_INFORMATION_SECTION__SECTION_ID = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__SECTION_ID;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_CLINICAL_INFORMATION_SECTION__NULL_FLAVOR = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_CLINICAL_INFORMATION_SECTION__CLASS_CODE = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__CLASS_CODE;

	/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_CLINICAL_INFORMATION_SECTION__MOOD_CODE = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__MOOD_CODE;

	/**
     * The number of structural features of the '<em>PHCR Clinical Information Section</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_CLINICAL_INFORMATION_SECTION_FEATURE_COUNT = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaCaseObservationImpl <em>Case Observation</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaCaseObservationImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaPackageImpl#getTularemiaCaseObservation()
     * @generated
     */
	int TULAREMIA_CASE_OBSERVATION = 4;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_CASE_OBSERVATION__REALM_CODE = PhcrPackage.CASE_OBSERVATION__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_CASE_OBSERVATION__TYPE_ID = PhcrPackage.CASE_OBSERVATION__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_CASE_OBSERVATION__TEMPLATE_ID = PhcrPackage.CASE_OBSERVATION__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_CASE_OBSERVATION__ID = PhcrPackage.CASE_OBSERVATION__ID;

	/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_CASE_OBSERVATION__CODE = PhcrPackage.CASE_OBSERVATION__CODE;

	/**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_CASE_OBSERVATION__DERIVATION_EXPR = PhcrPackage.CASE_OBSERVATION__DERIVATION_EXPR;

	/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_CASE_OBSERVATION__TEXT = PhcrPackage.CASE_OBSERVATION__TEXT;

	/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_CASE_OBSERVATION__STATUS_CODE = PhcrPackage.CASE_OBSERVATION__STATUS_CODE;

	/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_CASE_OBSERVATION__EFFECTIVE_TIME = PhcrPackage.CASE_OBSERVATION__EFFECTIVE_TIME;

	/**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_CASE_OBSERVATION__PRIORITY_CODE = PhcrPackage.CASE_OBSERVATION__PRIORITY_CODE;

	/**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_CASE_OBSERVATION__REPEAT_NUMBER = PhcrPackage.CASE_OBSERVATION__REPEAT_NUMBER;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_CASE_OBSERVATION__LANGUAGE_CODE = PhcrPackage.CASE_OBSERVATION__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_CASE_OBSERVATION__VALUE = PhcrPackage.CASE_OBSERVATION__VALUE;

	/**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_CASE_OBSERVATION__INTERPRETATION_CODE = PhcrPackage.CASE_OBSERVATION__INTERPRETATION_CODE;

	/**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_CASE_OBSERVATION__METHOD_CODE = PhcrPackage.CASE_OBSERVATION__METHOD_CODE;

	/**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_CASE_OBSERVATION__TARGET_SITE_CODE = PhcrPackage.CASE_OBSERVATION__TARGET_SITE_CODE;

	/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_CASE_OBSERVATION__SUBJECT = PhcrPackage.CASE_OBSERVATION__SUBJECT;

	/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_CASE_OBSERVATION__SPECIMEN = PhcrPackage.CASE_OBSERVATION__SPECIMEN;

	/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_CASE_OBSERVATION__PERFORMER = PhcrPackage.CASE_OBSERVATION__PERFORMER;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_CASE_OBSERVATION__AUTHOR = PhcrPackage.CASE_OBSERVATION__AUTHOR;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_CASE_OBSERVATION__INFORMANT = PhcrPackage.CASE_OBSERVATION__INFORMANT;

	/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_CASE_OBSERVATION__PARTICIPANT = PhcrPackage.CASE_OBSERVATION__PARTICIPANT;

	/**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_CASE_OBSERVATION__ENTRY_RELATIONSHIP = PhcrPackage.CASE_OBSERVATION__ENTRY_RELATIONSHIP;

	/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_CASE_OBSERVATION__REFERENCE = PhcrPackage.CASE_OBSERVATION__REFERENCE;

	/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_CASE_OBSERVATION__PRECONDITION = PhcrPackage.CASE_OBSERVATION__PRECONDITION;

	/**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_CASE_OBSERVATION__REFERENCE_RANGE = PhcrPackage.CASE_OBSERVATION__REFERENCE_RANGE;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_CASE_OBSERVATION__NULL_FLAVOR = PhcrPackage.CASE_OBSERVATION__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_CASE_OBSERVATION__CLASS_CODE = PhcrPackage.CASE_OBSERVATION__CLASS_CODE;

	/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_CASE_OBSERVATION__MOOD_CODE = PhcrPackage.CASE_OBSERVATION__MOOD_CODE;

	/**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_CASE_OBSERVATION__NEGATION_IND = PhcrPackage.CASE_OBSERVATION__NEGATION_IND;

	/**
     * The number of structural features of the '<em>Case Observation</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_CASE_OBSERVATION_FEATURE_COUNT = PhcrPackage.CASE_OBSERVATION_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaSignsAndSymptomsObservationImpl <em>Signs And Symptoms Observation</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaSignsAndSymptomsObservationImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaPackageImpl#getTularemiaSignsAndSymptomsObservation()
     * @generated
     */
	int TULAREMIA_SIGNS_AND_SYMPTOMS_OBSERVATION = 5;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_SIGNS_AND_SYMPTOMS_OBSERVATION__REALM_CODE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_SIGNS_AND_SYMPTOMS_OBSERVATION__TYPE_ID = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_SIGNS_AND_SYMPTOMS_OBSERVATION__TEMPLATE_ID = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_SIGNS_AND_SYMPTOMS_OBSERVATION__ID = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__ID;

	/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_SIGNS_AND_SYMPTOMS_OBSERVATION__CODE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__CODE;

	/**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_SIGNS_AND_SYMPTOMS_OBSERVATION__DERIVATION_EXPR = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__DERIVATION_EXPR;

	/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_SIGNS_AND_SYMPTOMS_OBSERVATION__TEXT = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__TEXT;

	/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_SIGNS_AND_SYMPTOMS_OBSERVATION__STATUS_CODE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__STATUS_CODE;

	/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_SIGNS_AND_SYMPTOMS_OBSERVATION__EFFECTIVE_TIME = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__EFFECTIVE_TIME;

	/**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_SIGNS_AND_SYMPTOMS_OBSERVATION__PRIORITY_CODE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__PRIORITY_CODE;

	/**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_SIGNS_AND_SYMPTOMS_OBSERVATION__REPEAT_NUMBER = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__REPEAT_NUMBER;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_SIGNS_AND_SYMPTOMS_OBSERVATION__LANGUAGE_CODE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_SIGNS_AND_SYMPTOMS_OBSERVATION__VALUE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__VALUE;

	/**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_SIGNS_AND_SYMPTOMS_OBSERVATION__INTERPRETATION_CODE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__INTERPRETATION_CODE;

	/**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_SIGNS_AND_SYMPTOMS_OBSERVATION__METHOD_CODE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__METHOD_CODE;

	/**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_SIGNS_AND_SYMPTOMS_OBSERVATION__TARGET_SITE_CODE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__TARGET_SITE_CODE;

	/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_SIGNS_AND_SYMPTOMS_OBSERVATION__SUBJECT = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__SUBJECT;

	/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_SIGNS_AND_SYMPTOMS_OBSERVATION__SPECIMEN = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__SPECIMEN;

	/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_SIGNS_AND_SYMPTOMS_OBSERVATION__PERFORMER = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__PERFORMER;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_SIGNS_AND_SYMPTOMS_OBSERVATION__AUTHOR = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__AUTHOR;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_SIGNS_AND_SYMPTOMS_OBSERVATION__INFORMANT = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__INFORMANT;

	/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_SIGNS_AND_SYMPTOMS_OBSERVATION__PARTICIPANT = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__PARTICIPANT;

	/**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_SIGNS_AND_SYMPTOMS_OBSERVATION__ENTRY_RELATIONSHIP = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__ENTRY_RELATIONSHIP;

	/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_SIGNS_AND_SYMPTOMS_OBSERVATION__REFERENCE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__REFERENCE;

	/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_SIGNS_AND_SYMPTOMS_OBSERVATION__PRECONDITION = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__PRECONDITION;

	/**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_SIGNS_AND_SYMPTOMS_OBSERVATION__REFERENCE_RANGE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__REFERENCE_RANGE;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_SIGNS_AND_SYMPTOMS_OBSERVATION__NULL_FLAVOR = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_SIGNS_AND_SYMPTOMS_OBSERVATION__CLASS_CODE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__CLASS_CODE;

	/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_SIGNS_AND_SYMPTOMS_OBSERVATION__MOOD_CODE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__MOOD_CODE;

	/**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_SIGNS_AND_SYMPTOMS_OBSERVATION__NEGATION_IND = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__NEGATION_IND;

	/**
     * The number of structural features of the '<em>Signs And Symptoms Observation</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_SIGNS_AND_SYMPTOMS_OBSERVATION_FEATURE_COUNT = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.LocationOfLesionObservationImpl <em>Location Of Lesion Observation</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.LocationOfLesionObservationImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaPackageImpl#getLocationOfLesionObservation()
     * @generated
     */
	int LOCATION_OF_LESION_OBSERVATION = 6;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LOCATION_OF_LESION_OBSERVATION__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LOCATION_OF_LESION_OBSERVATION__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LOCATION_OF_LESION_OBSERVATION__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LOCATION_OF_LESION_OBSERVATION__ID = CDAPackage.OBSERVATION__ID;

	/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LOCATION_OF_LESION_OBSERVATION__CODE = CDAPackage.OBSERVATION__CODE;

	/**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LOCATION_OF_LESION_OBSERVATION__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

	/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LOCATION_OF_LESION_OBSERVATION__TEXT = CDAPackage.OBSERVATION__TEXT;

	/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LOCATION_OF_LESION_OBSERVATION__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

	/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LOCATION_OF_LESION_OBSERVATION__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

	/**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LOCATION_OF_LESION_OBSERVATION__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

	/**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LOCATION_OF_LESION_OBSERVATION__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LOCATION_OF_LESION_OBSERVATION__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LOCATION_OF_LESION_OBSERVATION__VALUE = CDAPackage.OBSERVATION__VALUE;

	/**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LOCATION_OF_LESION_OBSERVATION__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

	/**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LOCATION_OF_LESION_OBSERVATION__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

	/**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LOCATION_OF_LESION_OBSERVATION__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

	/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LOCATION_OF_LESION_OBSERVATION__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

	/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LOCATION_OF_LESION_OBSERVATION__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

	/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LOCATION_OF_LESION_OBSERVATION__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LOCATION_OF_LESION_OBSERVATION__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LOCATION_OF_LESION_OBSERVATION__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

	/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LOCATION_OF_LESION_OBSERVATION__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

	/**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LOCATION_OF_LESION_OBSERVATION__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

	/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LOCATION_OF_LESION_OBSERVATION__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

	/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LOCATION_OF_LESION_OBSERVATION__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

	/**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LOCATION_OF_LESION_OBSERVATION__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LOCATION_OF_LESION_OBSERVATION__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LOCATION_OF_LESION_OBSERVATION__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

	/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LOCATION_OF_LESION_OBSERVATION__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

	/**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LOCATION_OF_LESION_OBSERVATION__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

	/**
     * The number of structural features of the '<em>Location Of Lesion Observation</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LOCATION_OF_LESION_OBSERVATION_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaPHCRTreatmentInformationSectionImpl <em>PHCR Treatment Information Section</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaPHCRTreatmentInformationSectionImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaPackageImpl#getTularemiaPHCRTreatmentInformationSection()
     * @generated
     */
	int TULAREMIA_PHCR_TREATMENT_INFORMATION_SECTION = 7;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_TREATMENT_INFORMATION_SECTION__REALM_CODE = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_TREATMENT_INFORMATION_SECTION__TYPE_ID = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_TREATMENT_INFORMATION_SECTION__TEMPLATE_ID = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_TREATMENT_INFORMATION_SECTION__ID = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__ID;

	/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_TREATMENT_INFORMATION_SECTION__CODE = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__CODE;

	/**
     * The feature id for the '<em><b>Title</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_TREATMENT_INFORMATION_SECTION__TITLE = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__TITLE;

	/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_TREATMENT_INFORMATION_SECTION__TEXT = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__TEXT;

	/**
     * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_TREATMENT_INFORMATION_SECTION__CONFIDENTIALITY_CODE = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__CONFIDENTIALITY_CODE;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_TREATMENT_INFORMATION_SECTION__LANGUAGE_CODE = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_TREATMENT_INFORMATION_SECTION__SUBJECT = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__SUBJECT;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_TREATMENT_INFORMATION_SECTION__AUTHOR = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__AUTHOR;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_TREATMENT_INFORMATION_SECTION__INFORMANT = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__INFORMANT;

	/**
     * The feature id for the '<em><b>Entry</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_TREATMENT_INFORMATION_SECTION__ENTRY = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__ENTRY;

	/**
     * The feature id for the '<em><b>Component</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_TREATMENT_INFORMATION_SECTION__COMPONENT = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__COMPONENT;

	/**
     * The feature id for the '<em><b>Section Id</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_TREATMENT_INFORMATION_SECTION__SECTION_ID = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__SECTION_ID;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_TREATMENT_INFORMATION_SECTION__NULL_FLAVOR = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_TREATMENT_INFORMATION_SECTION__CLASS_CODE = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__CLASS_CODE;

	/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_TREATMENT_INFORMATION_SECTION__MOOD_CODE = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__MOOD_CODE;

	/**
     * The number of structural features of the '<em>PHCR Treatment Information Section</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_TREATMENT_INFORMATION_SECTION_FEATURE_COUNT = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaTherapeuticRegimenActImpl <em>Therapeutic Regimen Act</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaTherapeuticRegimenActImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaPackageImpl#getTularemiaTherapeuticRegimenAct()
     * @generated
     */
	int TULAREMIA_THERAPEUTIC_REGIMEN_ACT = 8;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_THERAPEUTIC_REGIMEN_ACT__REALM_CODE = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_THERAPEUTIC_REGIMEN_ACT__TYPE_ID = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_THERAPEUTIC_REGIMEN_ACT__TEMPLATE_ID = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_THERAPEUTIC_REGIMEN_ACT__ID = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__ID;

	/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_THERAPEUTIC_REGIMEN_ACT__CODE = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__CODE;

	/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_THERAPEUTIC_REGIMEN_ACT__TEXT = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__TEXT;

	/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_THERAPEUTIC_REGIMEN_ACT__STATUS_CODE = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__STATUS_CODE;

	/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_THERAPEUTIC_REGIMEN_ACT__EFFECTIVE_TIME = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__EFFECTIVE_TIME;

	/**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_THERAPEUTIC_REGIMEN_ACT__PRIORITY_CODE = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__PRIORITY_CODE;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_THERAPEUTIC_REGIMEN_ACT__LANGUAGE_CODE = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_THERAPEUTIC_REGIMEN_ACT__SUBJECT = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__SUBJECT;

	/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_THERAPEUTIC_REGIMEN_ACT__SPECIMEN = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__SPECIMEN;

	/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_THERAPEUTIC_REGIMEN_ACT__PERFORMER = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__PERFORMER;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_THERAPEUTIC_REGIMEN_ACT__AUTHOR = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__AUTHOR;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_THERAPEUTIC_REGIMEN_ACT__INFORMANT = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__INFORMANT;

	/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_THERAPEUTIC_REGIMEN_ACT__PARTICIPANT = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__PARTICIPANT;

	/**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_THERAPEUTIC_REGIMEN_ACT__ENTRY_RELATIONSHIP = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__ENTRY_RELATIONSHIP;

	/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_THERAPEUTIC_REGIMEN_ACT__REFERENCE = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__REFERENCE;

	/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_THERAPEUTIC_REGIMEN_ACT__PRECONDITION = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__PRECONDITION;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_THERAPEUTIC_REGIMEN_ACT__NULL_FLAVOR = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_THERAPEUTIC_REGIMEN_ACT__CLASS_CODE = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__CLASS_CODE;

	/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_THERAPEUTIC_REGIMEN_ACT__MOOD_CODE = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__MOOD_CODE;

	/**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_THERAPEUTIC_REGIMEN_ACT__NEGATION_IND = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__NEGATION_IND;

	/**
     * The number of structural features of the '<em>Therapeutic Regimen Act</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_THERAPEUTIC_REGIMEN_ACT_FEATURE_COUNT = PhcrPackage.THERAPEUTIC_REGIMEN_ACT_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaTreatmentGivenSubstanceAdministrationImpl <em>Treatment Given Substance Administration</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaTreatmentGivenSubstanceAdministrationImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaPackageImpl#getTularemiaTreatmentGivenSubstanceAdministration()
     * @generated
     */
	int TULAREMIA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION = 9;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__REALM_CODE = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__TYPE_ID = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__TEMPLATE_ID = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__ID = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__ID;

	/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__CODE = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__CODE;

	/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__TEXT = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__TEXT;

	/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__STATUS_CODE = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__STATUS_CODE;

	/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__EFFECTIVE_TIME = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__EFFECTIVE_TIME;

	/**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__PRIORITY_CODE = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__PRIORITY_CODE;

	/**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__REPEAT_NUMBER = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__REPEAT_NUMBER;

	/**
     * The feature id for the '<em><b>Route Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__ROUTE_CODE = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__ROUTE_CODE;

	/**
     * The feature id for the '<em><b>Approach Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__APPROACH_SITE_CODE = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__APPROACH_SITE_CODE;

	/**
     * The feature id for the '<em><b>Dose Quantity</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DOSE_QUANTITY = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DOSE_QUANTITY;

	/**
     * The feature id for the '<em><b>Rate Quantity</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__RATE_QUANTITY = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__RATE_QUANTITY;

	/**
     * The feature id for the '<em><b>Max Dose Quantity</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__MAX_DOSE_QUANTITY = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__MAX_DOSE_QUANTITY;

	/**
     * The feature id for the '<em><b>Administration Unit Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__ADMINISTRATION_UNIT_CODE = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__ADMINISTRATION_UNIT_CODE;

	/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__SUBJECT = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__SUBJECT;

	/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__SPECIMEN = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__SPECIMEN;

	/**
     * The feature id for the '<em><b>Consumable</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__CONSUMABLE = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__CONSUMABLE;

	/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__PERFORMER = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__PERFORMER;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__AUTHOR = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__AUTHOR;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__INFORMANT = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__INFORMANT;

	/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__PARTICIPANT = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__PARTICIPANT;

	/**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__ENTRY_RELATIONSHIP = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__ENTRY_RELATIONSHIP;

	/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__REFERENCE = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__REFERENCE;

	/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__PRECONDITION = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__PRECONDITION;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__NULL_FLAVOR = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__CLASS_CODE = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__CLASS_CODE;

	/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__MOOD_CODE = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__MOOD_CODE;

	/**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__NEGATION_IND = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__NEGATION_IND;

	/**
     * The number of structural features of the '<em>Treatment Given Substance Administration</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION_FEATURE_COUNT = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaTreatmentNotGivenSubstanceAdministrationImpl <em>Treatment Not Given Substance Administration</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaTreatmentNotGivenSubstanceAdministrationImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaPackageImpl#getTularemiaTreatmentNotGivenSubstanceAdministration()
     * @generated
     */
	int TULAREMIA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION = 10;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__REALM_CODE = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__TYPE_ID = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__TEMPLATE_ID = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__ID = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__ID;

	/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__CODE = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__CODE;

	/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__TEXT = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__TEXT;

	/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__STATUS_CODE = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__STATUS_CODE;

	/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__EFFECTIVE_TIME = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__EFFECTIVE_TIME;

	/**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__PRIORITY_CODE = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__PRIORITY_CODE;

	/**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__REPEAT_NUMBER = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__REPEAT_NUMBER;

	/**
     * The feature id for the '<em><b>Route Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__ROUTE_CODE = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__ROUTE_CODE;

	/**
     * The feature id for the '<em><b>Approach Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__APPROACH_SITE_CODE = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__APPROACH_SITE_CODE;

	/**
     * The feature id for the '<em><b>Dose Quantity</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DOSE_QUANTITY = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DOSE_QUANTITY;

	/**
     * The feature id for the '<em><b>Rate Quantity</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__RATE_QUANTITY = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__RATE_QUANTITY;

	/**
     * The feature id for the '<em><b>Max Dose Quantity</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__MAX_DOSE_QUANTITY = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__MAX_DOSE_QUANTITY;

	/**
     * The feature id for the '<em><b>Administration Unit Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__ADMINISTRATION_UNIT_CODE = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__ADMINISTRATION_UNIT_CODE;

	/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__SUBJECT = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__SUBJECT;

	/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__SPECIMEN = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__SPECIMEN;

	/**
     * The feature id for the '<em><b>Consumable</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__CONSUMABLE = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__CONSUMABLE;

	/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__PERFORMER = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__PERFORMER;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__AUTHOR = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__AUTHOR;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__INFORMANT = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__INFORMANT;

	/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__PARTICIPANT = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__PARTICIPANT;

	/**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__ENTRY_RELATIONSHIP = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__ENTRY_RELATIONSHIP;

	/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__REFERENCE = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__REFERENCE;

	/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__PRECONDITION = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__PRECONDITION;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__NULL_FLAVOR = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__CLASS_CODE = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__CLASS_CODE;

	/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__MOOD_CODE = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__MOOD_CODE;

	/**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__NEGATION_IND = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__NEGATION_IND;

	/**
     * The number of structural features of the '<em>Treatment Not Given Substance Administration</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_FEATURE_COUNT = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaPHCRRelevantDxTestsSectionImpl <em>PHCR Relevant Dx Tests Section</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaPHCRRelevantDxTestsSectionImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaPackageImpl#getTularemiaPHCRRelevantDxTestsSection()
     * @generated
     */
	int TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION = 11;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION__REALM_CODE = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION__TYPE_ID = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION__TEMPLATE_ID = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION__ID = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__ID;

	/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION__CODE = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__CODE;

	/**
     * The feature id for the '<em><b>Title</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION__TITLE = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__TITLE;

	/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION__TEXT = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__TEXT;

	/**
     * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION__CONFIDENTIALITY_CODE = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__CONFIDENTIALITY_CODE;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION__LANGUAGE_CODE = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION__SUBJECT = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__SUBJECT;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION__AUTHOR = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__AUTHOR;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION__INFORMANT = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__INFORMANT;

	/**
     * The feature id for the '<em><b>Entry</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION__ENTRY = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__ENTRY;

	/**
     * The feature id for the '<em><b>Component</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION__COMPONENT = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__COMPONENT;

	/**
     * The feature id for the '<em><b>Section Id</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION__SECTION_ID = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__SECTION_ID;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION__NULL_FLAVOR = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION__CLASS_CODE = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__CLASS_CODE;

	/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION__MOOD_CODE = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__MOOD_CODE;

	/**
     * The number of structural features of the '<em>PHCR Relevant Dx Tests Section</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION_FEATURE_COUNT = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaResultOrganizerImpl <em>Result Organizer</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaResultOrganizerImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaPackageImpl#getTularemiaResultOrganizer()
     * @generated
     */
	int TULAREMIA_RESULT_ORGANIZER = 12;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_RESULT_ORGANIZER__REALM_CODE = PhcrPackage.RESULT_ORGANIZER__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_RESULT_ORGANIZER__TYPE_ID = PhcrPackage.RESULT_ORGANIZER__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_RESULT_ORGANIZER__TEMPLATE_ID = PhcrPackage.RESULT_ORGANIZER__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_RESULT_ORGANIZER__ID = PhcrPackage.RESULT_ORGANIZER__ID;

	/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_RESULT_ORGANIZER__CODE = PhcrPackage.RESULT_ORGANIZER__CODE;

	/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_RESULT_ORGANIZER__STATUS_CODE = PhcrPackage.RESULT_ORGANIZER__STATUS_CODE;

	/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_RESULT_ORGANIZER__EFFECTIVE_TIME = PhcrPackage.RESULT_ORGANIZER__EFFECTIVE_TIME;

	/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_RESULT_ORGANIZER__SUBJECT = PhcrPackage.RESULT_ORGANIZER__SUBJECT;

	/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_RESULT_ORGANIZER__SPECIMEN = PhcrPackage.RESULT_ORGANIZER__SPECIMEN;

	/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_RESULT_ORGANIZER__PERFORMER = PhcrPackage.RESULT_ORGANIZER__PERFORMER;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_RESULT_ORGANIZER__AUTHOR = PhcrPackage.RESULT_ORGANIZER__AUTHOR;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_RESULT_ORGANIZER__INFORMANT = PhcrPackage.RESULT_ORGANIZER__INFORMANT;

	/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_RESULT_ORGANIZER__PARTICIPANT = PhcrPackage.RESULT_ORGANIZER__PARTICIPANT;

	/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_RESULT_ORGANIZER__REFERENCE = PhcrPackage.RESULT_ORGANIZER__REFERENCE;

	/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_RESULT_ORGANIZER__PRECONDITION = PhcrPackage.RESULT_ORGANIZER__PRECONDITION;

	/**
     * The feature id for the '<em><b>Component</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_RESULT_ORGANIZER__COMPONENT = PhcrPackage.RESULT_ORGANIZER__COMPONENT;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_RESULT_ORGANIZER__NULL_FLAVOR = PhcrPackage.RESULT_ORGANIZER__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_RESULT_ORGANIZER__CLASS_CODE = PhcrPackage.RESULT_ORGANIZER__CLASS_CODE;

	/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_RESULT_ORGANIZER__MOOD_CODE = PhcrPackage.RESULT_ORGANIZER__MOOD_CODE;

	/**
     * The number of structural features of the '<em>Result Organizer</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_RESULT_ORGANIZER_FEATURE_COUNT = PhcrPackage.RESULT_ORGANIZER_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaResultObservationImpl <em>Result Observation</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaResultObservationImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaPackageImpl#getTularemiaResultObservation()
     * @generated
     */
	int TULAREMIA_RESULT_OBSERVATION = 13;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_RESULT_OBSERVATION__REALM_CODE = PhcrPackage.RESULT_OBSERVATION__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_RESULT_OBSERVATION__TYPE_ID = PhcrPackage.RESULT_OBSERVATION__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_RESULT_OBSERVATION__TEMPLATE_ID = PhcrPackage.RESULT_OBSERVATION__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_RESULT_OBSERVATION__ID = PhcrPackage.RESULT_OBSERVATION__ID;

	/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_RESULT_OBSERVATION__CODE = PhcrPackage.RESULT_OBSERVATION__CODE;

	/**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_RESULT_OBSERVATION__DERIVATION_EXPR = PhcrPackage.RESULT_OBSERVATION__DERIVATION_EXPR;

	/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_RESULT_OBSERVATION__TEXT = PhcrPackage.RESULT_OBSERVATION__TEXT;

	/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_RESULT_OBSERVATION__STATUS_CODE = PhcrPackage.RESULT_OBSERVATION__STATUS_CODE;

	/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_RESULT_OBSERVATION__EFFECTIVE_TIME = PhcrPackage.RESULT_OBSERVATION__EFFECTIVE_TIME;

	/**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_RESULT_OBSERVATION__PRIORITY_CODE = PhcrPackage.RESULT_OBSERVATION__PRIORITY_CODE;

	/**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_RESULT_OBSERVATION__REPEAT_NUMBER = PhcrPackage.RESULT_OBSERVATION__REPEAT_NUMBER;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_RESULT_OBSERVATION__LANGUAGE_CODE = PhcrPackage.RESULT_OBSERVATION__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_RESULT_OBSERVATION__VALUE = PhcrPackage.RESULT_OBSERVATION__VALUE;

	/**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_RESULT_OBSERVATION__INTERPRETATION_CODE = PhcrPackage.RESULT_OBSERVATION__INTERPRETATION_CODE;

	/**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_RESULT_OBSERVATION__METHOD_CODE = PhcrPackage.RESULT_OBSERVATION__METHOD_CODE;

	/**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_RESULT_OBSERVATION__TARGET_SITE_CODE = PhcrPackage.RESULT_OBSERVATION__TARGET_SITE_CODE;

	/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_RESULT_OBSERVATION__SUBJECT = PhcrPackage.RESULT_OBSERVATION__SUBJECT;

	/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_RESULT_OBSERVATION__SPECIMEN = PhcrPackage.RESULT_OBSERVATION__SPECIMEN;

	/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_RESULT_OBSERVATION__PERFORMER = PhcrPackage.RESULT_OBSERVATION__PERFORMER;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_RESULT_OBSERVATION__AUTHOR = PhcrPackage.RESULT_OBSERVATION__AUTHOR;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_RESULT_OBSERVATION__INFORMANT = PhcrPackage.RESULT_OBSERVATION__INFORMANT;

	/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_RESULT_OBSERVATION__PARTICIPANT = PhcrPackage.RESULT_OBSERVATION__PARTICIPANT;

	/**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_RESULT_OBSERVATION__ENTRY_RELATIONSHIP = PhcrPackage.RESULT_OBSERVATION__ENTRY_RELATIONSHIP;

	/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_RESULT_OBSERVATION__REFERENCE = PhcrPackage.RESULT_OBSERVATION__REFERENCE;

	/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_RESULT_OBSERVATION__PRECONDITION = PhcrPackage.RESULT_OBSERVATION__PRECONDITION;

	/**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_RESULT_OBSERVATION__REFERENCE_RANGE = PhcrPackage.RESULT_OBSERVATION__REFERENCE_RANGE;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_RESULT_OBSERVATION__NULL_FLAVOR = PhcrPackage.RESULT_OBSERVATION__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_RESULT_OBSERVATION__CLASS_CODE = PhcrPackage.RESULT_OBSERVATION__CLASS_CODE;

	/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_RESULT_OBSERVATION__MOOD_CODE = PhcrPackage.RESULT_OBSERVATION__MOOD_CODE;

	/**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_RESULT_OBSERVATION__NEGATION_IND = PhcrPackage.RESULT_OBSERVATION__NEGATION_IND;

	/**
     * The number of structural features of the '<em>Result Observation</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TULAREMIA_RESULT_OBSERVATION_FEATURE_COUNT = PhcrPackage.RESULT_OBSERVATION_FEATURE_COUNT + 0;


	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaCaseReport <em>Case Report</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Case Report</em>'.
     * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaCaseReport
     * @generated
     */
	EClass getTularemiaCaseReport();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRSocialHistorySection <em>PHCR Social History Section</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>PHCR Social History Section</em>'.
     * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRSocialHistorySection
     * @generated
     */
	EClass getTularemiaPHCRSocialHistorySection();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPossibleExposureLocationAndTypeAct <em>Possible Exposure Location And Type Act</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Possible Exposure Location And Type Act</em>'.
     * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPossibleExposureLocationAndTypeAct
     * @generated
     */
	EClass getTularemiaPossibleExposureLocationAndTypeAct();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRClinicalInformationSection <em>PHCR Clinical Information Section</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>PHCR Clinical Information Section</em>'.
     * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRClinicalInformationSection
     * @generated
     */
	EClass getTularemiaPHCRClinicalInformationSection();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaCaseObservation <em>Case Observation</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Case Observation</em>'.
     * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaCaseObservation
     * @generated
     */
	EClass getTularemiaCaseObservation();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaSignsAndSymptomsObservation <em>Signs And Symptoms Observation</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Signs And Symptoms Observation</em>'.
     * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaSignsAndSymptomsObservation
     * @generated
     */
	EClass getTularemiaSignsAndSymptomsObservation();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.LocationOfLesionObservation <em>Location Of Lesion Observation</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Location Of Lesion Observation</em>'.
     * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.LocationOfLesionObservation
     * @generated
     */
	EClass getLocationOfLesionObservation();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRTreatmentInformationSection <em>PHCR Treatment Information Section</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>PHCR Treatment Information Section</em>'.
     * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRTreatmentInformationSection
     * @generated
     */
	EClass getTularemiaPHCRTreatmentInformationSection();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaTherapeuticRegimenAct <em>Therapeutic Regimen Act</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Therapeutic Regimen Act</em>'.
     * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaTherapeuticRegimenAct
     * @generated
     */
	EClass getTularemiaTherapeuticRegimenAct();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaTreatmentGivenSubstanceAdministration <em>Treatment Given Substance Administration</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Treatment Given Substance Administration</em>'.
     * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaTreatmentGivenSubstanceAdministration
     * @generated
     */
	EClass getTularemiaTreatmentGivenSubstanceAdministration();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaTreatmentNotGivenSubstanceAdministration <em>Treatment Not Given Substance Administration</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Treatment Not Given Substance Administration</em>'.
     * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaTreatmentNotGivenSubstanceAdministration
     * @generated
     */
	EClass getTularemiaTreatmentNotGivenSubstanceAdministration();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRRelevantDxTestsSection <em>PHCR Relevant Dx Tests Section</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>PHCR Relevant Dx Tests Section</em>'.
     * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRRelevantDxTestsSection
     * @generated
     */
	EClass getTularemiaPHCRRelevantDxTestsSection();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaResultOrganizer <em>Result Organizer</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Result Organizer</em>'.
     * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaResultOrganizer
     * @generated
     */
	EClass getTularemiaResultOrganizer();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaResultObservation <em>Result Observation</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Result Observation</em>'.
     * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaResultObservation
     * @generated
     */
	EClass getTularemiaResultObservation();

	/**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
	TularemiaFactory getTularemiaFactory();

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
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaCaseReportImpl <em>Case Report</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaCaseReportImpl
         * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaPackageImpl#getTularemiaCaseReport()
         * @generated
         */
		EClass TULAREMIA_CASE_REPORT = eINSTANCE.getTularemiaCaseReport();

		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaPHCRSocialHistorySectionImpl <em>PHCR Social History Section</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaPHCRSocialHistorySectionImpl
         * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaPackageImpl#getTularemiaPHCRSocialHistorySection()
         * @generated
         */
		EClass TULAREMIA_PHCR_SOCIAL_HISTORY_SECTION = eINSTANCE.getTularemiaPHCRSocialHistorySection();

		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaPossibleExposureLocationAndTypeActImpl <em>Possible Exposure Location And Type Act</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaPossibleExposureLocationAndTypeActImpl
         * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaPackageImpl#getTularemiaPossibleExposureLocationAndTypeAct()
         * @generated
         */
		EClass TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT = eINSTANCE.getTularemiaPossibleExposureLocationAndTypeAct();

		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaPHCRClinicalInformationSectionImpl <em>PHCR Clinical Information Section</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaPHCRClinicalInformationSectionImpl
         * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaPackageImpl#getTularemiaPHCRClinicalInformationSection()
         * @generated
         */
		EClass TULAREMIA_PHCR_CLINICAL_INFORMATION_SECTION = eINSTANCE.getTularemiaPHCRClinicalInformationSection();

		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaCaseObservationImpl <em>Case Observation</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaCaseObservationImpl
         * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaPackageImpl#getTularemiaCaseObservation()
         * @generated
         */
		EClass TULAREMIA_CASE_OBSERVATION = eINSTANCE.getTularemiaCaseObservation();

		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaSignsAndSymptomsObservationImpl <em>Signs And Symptoms Observation</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaSignsAndSymptomsObservationImpl
         * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaPackageImpl#getTularemiaSignsAndSymptomsObservation()
         * @generated
         */
		EClass TULAREMIA_SIGNS_AND_SYMPTOMS_OBSERVATION = eINSTANCE.getTularemiaSignsAndSymptomsObservation();

		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.LocationOfLesionObservationImpl <em>Location Of Lesion Observation</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.LocationOfLesionObservationImpl
         * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaPackageImpl#getLocationOfLesionObservation()
         * @generated
         */
		EClass LOCATION_OF_LESION_OBSERVATION = eINSTANCE.getLocationOfLesionObservation();

		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaPHCRTreatmentInformationSectionImpl <em>PHCR Treatment Information Section</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaPHCRTreatmentInformationSectionImpl
         * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaPackageImpl#getTularemiaPHCRTreatmentInformationSection()
         * @generated
         */
		EClass TULAREMIA_PHCR_TREATMENT_INFORMATION_SECTION = eINSTANCE.getTularemiaPHCRTreatmentInformationSection();

		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaTherapeuticRegimenActImpl <em>Therapeutic Regimen Act</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaTherapeuticRegimenActImpl
         * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaPackageImpl#getTularemiaTherapeuticRegimenAct()
         * @generated
         */
		EClass TULAREMIA_THERAPEUTIC_REGIMEN_ACT = eINSTANCE.getTularemiaTherapeuticRegimenAct();

		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaTreatmentGivenSubstanceAdministrationImpl <em>Treatment Given Substance Administration</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaTreatmentGivenSubstanceAdministrationImpl
         * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaPackageImpl#getTularemiaTreatmentGivenSubstanceAdministration()
         * @generated
         */
		EClass TULAREMIA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION = eINSTANCE.getTularemiaTreatmentGivenSubstanceAdministration();

		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaTreatmentNotGivenSubstanceAdministrationImpl <em>Treatment Not Given Substance Administration</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaTreatmentNotGivenSubstanceAdministrationImpl
         * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaPackageImpl#getTularemiaTreatmentNotGivenSubstanceAdministration()
         * @generated
         */
		EClass TULAREMIA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION = eINSTANCE.getTularemiaTreatmentNotGivenSubstanceAdministration();

		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaPHCRRelevantDxTestsSectionImpl <em>PHCR Relevant Dx Tests Section</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaPHCRRelevantDxTestsSectionImpl
         * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaPackageImpl#getTularemiaPHCRRelevantDxTestsSection()
         * @generated
         */
		EClass TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION = eINSTANCE.getTularemiaPHCRRelevantDxTestsSection();

		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaResultOrganizerImpl <em>Result Organizer</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaResultOrganizerImpl
         * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaPackageImpl#getTularemiaResultOrganizer()
         * @generated
         */
		EClass TULAREMIA_RESULT_ORGANIZER = eINSTANCE.getTularemiaResultOrganizer();

		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaResultObservationImpl <em>Result Observation</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaResultObservationImpl
         * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl.TularemiaPackageImpl#getTularemiaResultObservation()
         * @generated
         */
		EClass TULAREMIA_RESULT_OBSERVATION = eINSTANCE.getTularemiaResultObservation();

	}

} //TularemiaPackage
