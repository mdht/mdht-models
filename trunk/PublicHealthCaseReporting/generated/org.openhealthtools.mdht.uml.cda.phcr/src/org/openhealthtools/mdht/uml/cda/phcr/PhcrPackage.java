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
package org.openhealthtools.mdht.uml.cda.phcr;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;

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
 * @see org.openhealthtools.mdht.uml.cda.phcr.PhcrFactory
 * @model kind="package"
 *        annotation="http://www.openhealthtools.org/mdht/uml initializers='org.openhealthtools.mdht.uml.cda.phcr'"
 * @generated
 */
public interface PhcrPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "phcr";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.openhealthtools.org/mdht/uml/cda/phcr";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "phcr";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PhcrPackage eINSTANCE = org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrPackageImpl.init();

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.impl.PublicHealthCaseReportImpl <em>Public Health Case Report</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PublicHealthCaseReportImpl
   * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrPackageImpl#getPublicHealthCaseReport()
   * @generated
   */
	int PUBLIC_HEALTH_CASE_REPORT = 0;

		/**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PUBLIC_HEALTH_CASE_REPORT__REALM_CODE = CDAPackage.CLINICAL_DOCUMENT__REALM_CODE;

		/**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PUBLIC_HEALTH_CASE_REPORT__TYPE_ID = CDAPackage.CLINICAL_DOCUMENT__TYPE_ID;

		/**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PUBLIC_HEALTH_CASE_REPORT__TEMPLATE_ID = CDAPackage.CLINICAL_DOCUMENT__TEMPLATE_ID;

		/**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PUBLIC_HEALTH_CASE_REPORT__ID = CDAPackage.CLINICAL_DOCUMENT__ID;

		/**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PUBLIC_HEALTH_CASE_REPORT__CODE = CDAPackage.CLINICAL_DOCUMENT__CODE;

		/**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PUBLIC_HEALTH_CASE_REPORT__TITLE = CDAPackage.CLINICAL_DOCUMENT__TITLE;

		/**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PUBLIC_HEALTH_CASE_REPORT__EFFECTIVE_TIME = CDAPackage.CLINICAL_DOCUMENT__EFFECTIVE_TIME;

		/**
   * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PUBLIC_HEALTH_CASE_REPORT__CONFIDENTIALITY_CODE = CDAPackage.CLINICAL_DOCUMENT__CONFIDENTIALITY_CODE;

		/**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PUBLIC_HEALTH_CASE_REPORT__LANGUAGE_CODE = CDAPackage.CLINICAL_DOCUMENT__LANGUAGE_CODE;

		/**
   * The feature id for the '<em><b>Set Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PUBLIC_HEALTH_CASE_REPORT__SET_ID = CDAPackage.CLINICAL_DOCUMENT__SET_ID;

		/**
   * The feature id for the '<em><b>Version Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PUBLIC_HEALTH_CASE_REPORT__VERSION_NUMBER = CDAPackage.CLINICAL_DOCUMENT__VERSION_NUMBER;

		/**
   * The feature id for the '<em><b>Copy Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PUBLIC_HEALTH_CASE_REPORT__COPY_TIME = CDAPackage.CLINICAL_DOCUMENT__COPY_TIME;

		/**
   * The feature id for the '<em><b>Record Target</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PUBLIC_HEALTH_CASE_REPORT__RECORD_TARGET = CDAPackage.CLINICAL_DOCUMENT__RECORD_TARGET;

		/**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PUBLIC_HEALTH_CASE_REPORT__AUTHOR = CDAPackage.CLINICAL_DOCUMENT__AUTHOR;

		/**
   * The feature id for the '<em><b>Data Enterer</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PUBLIC_HEALTH_CASE_REPORT__DATA_ENTERER = CDAPackage.CLINICAL_DOCUMENT__DATA_ENTERER;

		/**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PUBLIC_HEALTH_CASE_REPORT__INFORMANT = CDAPackage.CLINICAL_DOCUMENT__INFORMANT;

		/**
   * The feature id for the '<em><b>Custodian</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PUBLIC_HEALTH_CASE_REPORT__CUSTODIAN = CDAPackage.CLINICAL_DOCUMENT__CUSTODIAN;

		/**
   * The feature id for the '<em><b>Information Recipient</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PUBLIC_HEALTH_CASE_REPORT__INFORMATION_RECIPIENT = CDAPackage.CLINICAL_DOCUMENT__INFORMATION_RECIPIENT;

		/**
   * The feature id for the '<em><b>Legal Authenticator</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PUBLIC_HEALTH_CASE_REPORT__LEGAL_AUTHENTICATOR = CDAPackage.CLINICAL_DOCUMENT__LEGAL_AUTHENTICATOR;

		/**
   * The feature id for the '<em><b>Authenticator</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PUBLIC_HEALTH_CASE_REPORT__AUTHENTICATOR = CDAPackage.CLINICAL_DOCUMENT__AUTHENTICATOR;

		/**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PUBLIC_HEALTH_CASE_REPORT__PARTICIPANT = CDAPackage.CLINICAL_DOCUMENT__PARTICIPANT;

		/**
   * The feature id for the '<em><b>In Fulfillment Of</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PUBLIC_HEALTH_CASE_REPORT__IN_FULFILLMENT_OF = CDAPackage.CLINICAL_DOCUMENT__IN_FULFILLMENT_OF;

		/**
   * The feature id for the '<em><b>Documentation Of</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PUBLIC_HEALTH_CASE_REPORT__DOCUMENTATION_OF = CDAPackage.CLINICAL_DOCUMENT__DOCUMENTATION_OF;

		/**
   * The feature id for the '<em><b>Related Document</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PUBLIC_HEALTH_CASE_REPORT__RELATED_DOCUMENT = CDAPackage.CLINICAL_DOCUMENT__RELATED_DOCUMENT;

		/**
   * The feature id for the '<em><b>Authorization</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PUBLIC_HEALTH_CASE_REPORT__AUTHORIZATION = CDAPackage.CLINICAL_DOCUMENT__AUTHORIZATION;

		/**
   * The feature id for the '<em><b>Component Of</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PUBLIC_HEALTH_CASE_REPORT__COMPONENT_OF = CDAPackage.CLINICAL_DOCUMENT__COMPONENT_OF;

		/**
   * The feature id for the '<em><b>Component</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PUBLIC_HEALTH_CASE_REPORT__COMPONENT = CDAPackage.CLINICAL_DOCUMENT__COMPONENT;

		/**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PUBLIC_HEALTH_CASE_REPORT__NULL_FLAVOR = CDAPackage.CLINICAL_DOCUMENT__NULL_FLAVOR;

		/**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PUBLIC_HEALTH_CASE_REPORT__CLASS_CODE = CDAPackage.CLINICAL_DOCUMENT__CLASS_CODE;

		/**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PUBLIC_HEALTH_CASE_REPORT__MOOD_CODE = CDAPackage.CLINICAL_DOCUMENT__MOOD_CODE;

		/**
   * The number of structural features of the '<em>Public Health Case Report</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PUBLIC_HEALTH_CASE_REPORT_FEATURE_COUNT = CDAPackage.CLINICAL_DOCUMENT_FEATURE_COUNT + 0;

		/**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrSocialHistorySectionImpl <em>Social History Section</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrSocialHistorySectionImpl
   * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrPackageImpl#getPhcrSocialHistorySection()
   * @generated
   */
	int PHCR_SOCIAL_HISTORY_SECTION = 1;

		/**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_SOCIAL_HISTORY_SECTION__REALM_CODE = CCDPackage.SOCIAL_HISTORY_SECTION__REALM_CODE;

		/**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_SOCIAL_HISTORY_SECTION__TYPE_ID = CCDPackage.SOCIAL_HISTORY_SECTION__TYPE_ID;

		/**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_SOCIAL_HISTORY_SECTION__TEMPLATE_ID = CCDPackage.SOCIAL_HISTORY_SECTION__TEMPLATE_ID;

		/**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_SOCIAL_HISTORY_SECTION__ID = CCDPackage.SOCIAL_HISTORY_SECTION__ID;

		/**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_SOCIAL_HISTORY_SECTION__CODE = CCDPackage.SOCIAL_HISTORY_SECTION__CODE;

		/**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_SOCIAL_HISTORY_SECTION__TITLE = CCDPackage.SOCIAL_HISTORY_SECTION__TITLE;

		/**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_SOCIAL_HISTORY_SECTION__TEXT = CCDPackage.SOCIAL_HISTORY_SECTION__TEXT;

		/**
   * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_SOCIAL_HISTORY_SECTION__CONFIDENTIALITY_CODE = CCDPackage.SOCIAL_HISTORY_SECTION__CONFIDENTIALITY_CODE;

		/**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_SOCIAL_HISTORY_SECTION__LANGUAGE_CODE = CCDPackage.SOCIAL_HISTORY_SECTION__LANGUAGE_CODE;

		/**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_SOCIAL_HISTORY_SECTION__SUBJECT = CCDPackage.SOCIAL_HISTORY_SECTION__SUBJECT;

		/**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_SOCIAL_HISTORY_SECTION__AUTHOR = CCDPackage.SOCIAL_HISTORY_SECTION__AUTHOR;

		/**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_SOCIAL_HISTORY_SECTION__INFORMANT = CCDPackage.SOCIAL_HISTORY_SECTION__INFORMANT;

		/**
   * The feature id for the '<em><b>Entry</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_SOCIAL_HISTORY_SECTION__ENTRY = CCDPackage.SOCIAL_HISTORY_SECTION__ENTRY;

		/**
   * The feature id for the '<em><b>Component</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_SOCIAL_HISTORY_SECTION__COMPONENT = CCDPackage.SOCIAL_HISTORY_SECTION__COMPONENT;

		/**
   * The feature id for the '<em><b>Section Id</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_SOCIAL_HISTORY_SECTION__SECTION_ID = CCDPackage.SOCIAL_HISTORY_SECTION__SECTION_ID;

		/**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_SOCIAL_HISTORY_SECTION__NULL_FLAVOR = CCDPackage.SOCIAL_HISTORY_SECTION__NULL_FLAVOR;

		/**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_SOCIAL_HISTORY_SECTION__CLASS_CODE = CCDPackage.SOCIAL_HISTORY_SECTION__CLASS_CODE;

		/**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_SOCIAL_HISTORY_SECTION__MOOD_CODE = CCDPackage.SOCIAL_HISTORY_SECTION__MOOD_CODE;

		/**
   * The number of structural features of the '<em>Social History Section</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_SOCIAL_HISTORY_SECTION_FEATURE_COUNT = CCDPackage.SOCIAL_HISTORY_SECTION_FEATURE_COUNT + 0;

		/**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.impl.GeotemporalHistoryObservationImpl <em>Geotemporal History Observation</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.phcr.impl.GeotemporalHistoryObservationImpl
   * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrPackageImpl#getGeotemporalHistoryObservation()
   * @generated
   */
	int GEOTEMPORAL_HISTORY_OBSERVATION = 2;

		/**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int GEOTEMPORAL_HISTORY_OBSERVATION__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

		/**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int GEOTEMPORAL_HISTORY_OBSERVATION__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

		/**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int GEOTEMPORAL_HISTORY_OBSERVATION__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

		/**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int GEOTEMPORAL_HISTORY_OBSERVATION__ID = CDAPackage.OBSERVATION__ID;

		/**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int GEOTEMPORAL_HISTORY_OBSERVATION__CODE = CDAPackage.OBSERVATION__CODE;

		/**
   * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int GEOTEMPORAL_HISTORY_OBSERVATION__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

		/**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int GEOTEMPORAL_HISTORY_OBSERVATION__TEXT = CDAPackage.OBSERVATION__TEXT;

		/**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int GEOTEMPORAL_HISTORY_OBSERVATION__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

		/**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int GEOTEMPORAL_HISTORY_OBSERVATION__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

		/**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int GEOTEMPORAL_HISTORY_OBSERVATION__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

		/**
   * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int GEOTEMPORAL_HISTORY_OBSERVATION__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

		/**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int GEOTEMPORAL_HISTORY_OBSERVATION__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

		/**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int GEOTEMPORAL_HISTORY_OBSERVATION__VALUE = CDAPackage.OBSERVATION__VALUE;

		/**
   * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int GEOTEMPORAL_HISTORY_OBSERVATION__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

		/**
   * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int GEOTEMPORAL_HISTORY_OBSERVATION__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

		/**
   * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int GEOTEMPORAL_HISTORY_OBSERVATION__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

		/**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int GEOTEMPORAL_HISTORY_OBSERVATION__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

		/**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int GEOTEMPORAL_HISTORY_OBSERVATION__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

		/**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int GEOTEMPORAL_HISTORY_OBSERVATION__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

		/**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int GEOTEMPORAL_HISTORY_OBSERVATION__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

		/**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int GEOTEMPORAL_HISTORY_OBSERVATION__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

		/**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int GEOTEMPORAL_HISTORY_OBSERVATION__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

		/**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int GEOTEMPORAL_HISTORY_OBSERVATION__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

		/**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int GEOTEMPORAL_HISTORY_OBSERVATION__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

		/**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int GEOTEMPORAL_HISTORY_OBSERVATION__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

		/**
   * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int GEOTEMPORAL_HISTORY_OBSERVATION__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

		/**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int GEOTEMPORAL_HISTORY_OBSERVATION__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

		/**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int GEOTEMPORAL_HISTORY_OBSERVATION__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

		/**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int GEOTEMPORAL_HISTORY_OBSERVATION__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

		/**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int GEOTEMPORAL_HISTORY_OBSERVATION__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

		/**
   * The number of structural features of the '<em>Geotemporal History Observation</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int GEOTEMPORAL_HISTORY_OBSERVATION_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

		/**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.impl.MostRecentTimeArrivedInUSAObservationImpl <em>Most Recent Time Arrived In USA Observation</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.phcr.impl.MostRecentTimeArrivedInUSAObservationImpl
   * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrPackageImpl#getMostRecentTimeArrivedInUSAObservation()
   * @generated
   */
	int MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION = 3;

		/**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

		/**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

		/**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

		/**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION__ID = CDAPackage.OBSERVATION__ID;

		/**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION__CODE = CDAPackage.OBSERVATION__CODE;

		/**
   * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

		/**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION__TEXT = CDAPackage.OBSERVATION__TEXT;

		/**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

		/**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

		/**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

		/**
   * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

		/**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

		/**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION__VALUE = CDAPackage.OBSERVATION__VALUE;

		/**
   * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

		/**
   * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

		/**
   * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

		/**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

		/**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

		/**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

		/**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

		/**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

		/**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

		/**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

		/**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

		/**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

		/**
   * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

		/**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

		/**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

		/**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

		/**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

		/**
   * The number of structural features of the '<em>Most Recent Time Arrived In USA Observation</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

		/**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.impl.RaceObservationImpl <em>Race Observation</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.phcr.impl.RaceObservationImpl
   * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrPackageImpl#getRaceObservation()
   * @generated
   */
	int RACE_OBSERVATION = 4;

		/**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RACE_OBSERVATION__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

		/**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RACE_OBSERVATION__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

		/**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RACE_OBSERVATION__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

		/**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RACE_OBSERVATION__ID = CDAPackage.OBSERVATION__ID;

		/**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RACE_OBSERVATION__CODE = CDAPackage.OBSERVATION__CODE;

		/**
   * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RACE_OBSERVATION__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

		/**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RACE_OBSERVATION__TEXT = CDAPackage.OBSERVATION__TEXT;

		/**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RACE_OBSERVATION__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

		/**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RACE_OBSERVATION__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

		/**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RACE_OBSERVATION__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

		/**
   * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RACE_OBSERVATION__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

		/**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RACE_OBSERVATION__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

		/**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RACE_OBSERVATION__VALUE = CDAPackage.OBSERVATION__VALUE;

		/**
   * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RACE_OBSERVATION__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

		/**
   * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RACE_OBSERVATION__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

		/**
   * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RACE_OBSERVATION__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

		/**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RACE_OBSERVATION__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

		/**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RACE_OBSERVATION__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

		/**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RACE_OBSERVATION__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

		/**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RACE_OBSERVATION__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

		/**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RACE_OBSERVATION__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

		/**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RACE_OBSERVATION__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

		/**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RACE_OBSERVATION__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

		/**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RACE_OBSERVATION__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

		/**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RACE_OBSERVATION__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

		/**
   * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RACE_OBSERVATION__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

		/**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RACE_OBSERVATION__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

		/**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RACE_OBSERVATION__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

		/**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RACE_OBSERVATION__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

		/**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RACE_OBSERVATION__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

		/**
   * The number of structural features of the '<em>Race Observation</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RACE_OBSERVATION_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

		/**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.impl.OccupationObservationImpl <em>Occupation Observation</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.phcr.impl.OccupationObservationImpl
   * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrPackageImpl#getOccupationObservation()
   * @generated
   */
	int OCCUPATION_OBSERVATION = 5;

		/**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OCCUPATION_OBSERVATION__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

		/**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OCCUPATION_OBSERVATION__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

		/**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OCCUPATION_OBSERVATION__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

		/**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OCCUPATION_OBSERVATION__ID = CDAPackage.OBSERVATION__ID;

		/**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OCCUPATION_OBSERVATION__CODE = CDAPackage.OBSERVATION__CODE;

		/**
   * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OCCUPATION_OBSERVATION__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

		/**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OCCUPATION_OBSERVATION__TEXT = CDAPackage.OBSERVATION__TEXT;

		/**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OCCUPATION_OBSERVATION__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

		/**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OCCUPATION_OBSERVATION__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

		/**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OCCUPATION_OBSERVATION__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

		/**
   * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OCCUPATION_OBSERVATION__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

		/**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OCCUPATION_OBSERVATION__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

		/**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OCCUPATION_OBSERVATION__VALUE = CDAPackage.OBSERVATION__VALUE;

		/**
   * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OCCUPATION_OBSERVATION__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

		/**
   * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OCCUPATION_OBSERVATION__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

		/**
   * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OCCUPATION_OBSERVATION__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

		/**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OCCUPATION_OBSERVATION__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

		/**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OCCUPATION_OBSERVATION__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

		/**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OCCUPATION_OBSERVATION__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

		/**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OCCUPATION_OBSERVATION__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

		/**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OCCUPATION_OBSERVATION__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

		/**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OCCUPATION_OBSERVATION__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

		/**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OCCUPATION_OBSERVATION__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

		/**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OCCUPATION_OBSERVATION__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

		/**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OCCUPATION_OBSERVATION__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

		/**
   * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OCCUPATION_OBSERVATION__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

		/**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OCCUPATION_OBSERVATION__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

		/**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OCCUPATION_OBSERVATION__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

		/**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OCCUPATION_OBSERVATION__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

		/**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OCCUPATION_OBSERVATION__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

		/**
   * The number of structural features of the '<em>Occupation Observation</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OCCUPATION_OBSERVATION_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

		/**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.impl.PregnancyObservationImpl <em>Pregnancy Observation</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PregnancyObservationImpl
   * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrPackageImpl#getPregnancyObservation()
   * @generated
   */
	int PREGNANCY_OBSERVATION = 6;

		/**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PREGNANCY_OBSERVATION__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

		/**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PREGNANCY_OBSERVATION__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

		/**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PREGNANCY_OBSERVATION__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

		/**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PREGNANCY_OBSERVATION__ID = CDAPackage.OBSERVATION__ID;

		/**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PREGNANCY_OBSERVATION__CODE = CDAPackage.OBSERVATION__CODE;

		/**
   * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PREGNANCY_OBSERVATION__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

		/**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PREGNANCY_OBSERVATION__TEXT = CDAPackage.OBSERVATION__TEXT;

		/**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PREGNANCY_OBSERVATION__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

		/**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PREGNANCY_OBSERVATION__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

		/**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PREGNANCY_OBSERVATION__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

		/**
   * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PREGNANCY_OBSERVATION__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

		/**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PREGNANCY_OBSERVATION__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

		/**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PREGNANCY_OBSERVATION__VALUE = CDAPackage.OBSERVATION__VALUE;

		/**
   * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PREGNANCY_OBSERVATION__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

		/**
   * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PREGNANCY_OBSERVATION__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

		/**
   * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PREGNANCY_OBSERVATION__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

		/**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PREGNANCY_OBSERVATION__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

		/**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PREGNANCY_OBSERVATION__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

		/**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PREGNANCY_OBSERVATION__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

		/**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PREGNANCY_OBSERVATION__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

		/**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PREGNANCY_OBSERVATION__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

		/**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PREGNANCY_OBSERVATION__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

		/**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PREGNANCY_OBSERVATION__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

		/**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PREGNANCY_OBSERVATION__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

		/**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PREGNANCY_OBSERVATION__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

		/**
   * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PREGNANCY_OBSERVATION__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

		/**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PREGNANCY_OBSERVATION__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

		/**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PREGNANCY_OBSERVATION__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

		/**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PREGNANCY_OBSERVATION__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

		/**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PREGNANCY_OBSERVATION__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

		/**
   * The number of structural features of the '<em>Pregnancy Observation</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PREGNANCY_OBSERVATION_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

		/**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.impl.EstimatedDateOfDeliveryObservationImpl <em>Estimated Date Of Delivery Observation</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.phcr.impl.EstimatedDateOfDeliveryObservationImpl
   * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrPackageImpl#getEstimatedDateOfDeliveryObservation()
   * @generated
   */
	int ESTIMATED_DATE_OF_DELIVERY_OBSERVATION = 7;

		/**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ESTIMATED_DATE_OF_DELIVERY_OBSERVATION__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

		/**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ESTIMATED_DATE_OF_DELIVERY_OBSERVATION__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

		/**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ESTIMATED_DATE_OF_DELIVERY_OBSERVATION__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

		/**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ESTIMATED_DATE_OF_DELIVERY_OBSERVATION__ID = CDAPackage.OBSERVATION__ID;

		/**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ESTIMATED_DATE_OF_DELIVERY_OBSERVATION__CODE = CDAPackage.OBSERVATION__CODE;

		/**
   * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ESTIMATED_DATE_OF_DELIVERY_OBSERVATION__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

		/**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ESTIMATED_DATE_OF_DELIVERY_OBSERVATION__TEXT = CDAPackage.OBSERVATION__TEXT;

		/**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ESTIMATED_DATE_OF_DELIVERY_OBSERVATION__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

		/**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ESTIMATED_DATE_OF_DELIVERY_OBSERVATION__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

		/**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ESTIMATED_DATE_OF_DELIVERY_OBSERVATION__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

		/**
   * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ESTIMATED_DATE_OF_DELIVERY_OBSERVATION__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

		/**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ESTIMATED_DATE_OF_DELIVERY_OBSERVATION__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

		/**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ESTIMATED_DATE_OF_DELIVERY_OBSERVATION__VALUE = CDAPackage.OBSERVATION__VALUE;

		/**
   * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ESTIMATED_DATE_OF_DELIVERY_OBSERVATION__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

		/**
   * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ESTIMATED_DATE_OF_DELIVERY_OBSERVATION__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

		/**
   * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ESTIMATED_DATE_OF_DELIVERY_OBSERVATION__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

		/**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ESTIMATED_DATE_OF_DELIVERY_OBSERVATION__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

		/**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ESTIMATED_DATE_OF_DELIVERY_OBSERVATION__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

		/**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ESTIMATED_DATE_OF_DELIVERY_OBSERVATION__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

		/**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ESTIMATED_DATE_OF_DELIVERY_OBSERVATION__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

		/**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ESTIMATED_DATE_OF_DELIVERY_OBSERVATION__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

		/**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ESTIMATED_DATE_OF_DELIVERY_OBSERVATION__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

		/**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ESTIMATED_DATE_OF_DELIVERY_OBSERVATION__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

		/**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ESTIMATED_DATE_OF_DELIVERY_OBSERVATION__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

		/**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ESTIMATED_DATE_OF_DELIVERY_OBSERVATION__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

		/**
   * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ESTIMATED_DATE_OF_DELIVERY_OBSERVATION__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

		/**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ESTIMATED_DATE_OF_DELIVERY_OBSERVATION__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

		/**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ESTIMATED_DATE_OF_DELIVERY_OBSERVATION__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

		/**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ESTIMATED_DATE_OF_DELIVERY_OBSERVATION__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

		/**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ESTIMATED_DATE_OF_DELIVERY_OBSERVATION__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

		/**
   * The number of structural features of the '<em>Estimated Date Of Delivery Observation</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

		/**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrClinicalInformationSectionImpl <em>Clinical Information Section</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrClinicalInformationSectionImpl
   * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrPackageImpl#getPhcrClinicalInformationSection()
   * @generated
   */
	int PHCR_CLINICAL_INFORMATION_SECTION = 8;

		/**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_CLINICAL_INFORMATION_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

		/**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_CLINICAL_INFORMATION_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

		/**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_CLINICAL_INFORMATION_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

		/**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_CLINICAL_INFORMATION_SECTION__ID = CDAPackage.SECTION__ID;

		/**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_CLINICAL_INFORMATION_SECTION__CODE = CDAPackage.SECTION__CODE;

		/**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_CLINICAL_INFORMATION_SECTION__TITLE = CDAPackage.SECTION__TITLE;

		/**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_CLINICAL_INFORMATION_SECTION__TEXT = CDAPackage.SECTION__TEXT;

		/**
   * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_CLINICAL_INFORMATION_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

		/**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_CLINICAL_INFORMATION_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

		/**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_CLINICAL_INFORMATION_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

		/**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_CLINICAL_INFORMATION_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

		/**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_CLINICAL_INFORMATION_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

		/**
   * The feature id for the '<em><b>Entry</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_CLINICAL_INFORMATION_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

		/**
   * The feature id for the '<em><b>Component</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_CLINICAL_INFORMATION_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

		/**
   * The feature id for the '<em><b>Section Id</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_CLINICAL_INFORMATION_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

		/**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_CLINICAL_INFORMATION_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

		/**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_CLINICAL_INFORMATION_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

		/**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_CLINICAL_INFORMATION_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

		/**
   * The number of structural features of the '<em>Clinical Information Section</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_CLINICAL_INFORMATION_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

		/**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrTreatmentInformationSectionImpl <em>Treatment Information Section</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrTreatmentInformationSectionImpl
   * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrPackageImpl#getPhcrTreatmentInformationSection()
   * @generated
   */
	int PHCR_TREATMENT_INFORMATION_SECTION = 14;

		/**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.impl.TherapeuticRegimenActImpl <em>Therapeutic Regimen Act</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.phcr.impl.TherapeuticRegimenActImpl
   * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrPackageImpl#getTherapeuticRegimenAct()
   * @generated
   */
	int THERAPEUTIC_REGIMEN_ACT = 15;

		/**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrEncountersSectionImpl <em>Encounters Section</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrEncountersSectionImpl
   * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrPackageImpl#getPhcrEncountersSection()
   * @generated
   */
	int PHCR_ENCOUNTERS_SECTION = 18;

		/**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrRelevantDxTestsSectionImpl <em>Relevant Dx Tests Section</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrRelevantDxTestsSectionImpl
   * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrPackageImpl#getPhcrRelevantDxTestsSection()
   * @generated
   */
	int PHCR_RELEVANT_DX_TESTS_SECTION = 19;

		/**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.impl.PatientConditionAliveObservationImpl <em>Patient Condition Alive Observation</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PatientConditionAliveObservationImpl
   * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrPackageImpl#getPatientConditionAliveObservation()
   * @generated
   */
	int PATIENT_CONDITION_ALIVE_OBSERVATION = 11;

		/**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.impl.PatientConditionDeceasedObservationImpl <em>Patient Condition Deceased Observation</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PatientConditionDeceasedObservationImpl
   * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrPackageImpl#getPatientConditionDeceasedObservation()
   * @generated
   */
	int PATIENT_CONDITION_DECEASED_OBSERVATION = 12;

		/**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.impl.SignsAndSymptomsObservationImpl <em>Signs And Symptoms Observation</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.phcr.impl.SignsAndSymptomsObservationImpl
   * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrPackageImpl#getSignsAndSymptomsObservation()
   * @generated
   */
	int SIGNS_AND_SYMPTOMS_OBSERVATION = 10;

		/**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.impl.TreatmentGivenSubstanceAdministrationImpl <em>Treatment Given Substance Administration</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.phcr.impl.TreatmentGivenSubstanceAdministrationImpl
   * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrPackageImpl#getTreatmentGivenSubstanceAdministration()
   * @generated
   */
	int TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION = 16;

		/**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.impl.TreatmentNotGivenSubstanceAdministrationImpl <em>Treatment Not Given Substance Administration</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.phcr.impl.TreatmentNotGivenSubstanceAdministrationImpl
   * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrPackageImpl#getTreatmentNotGivenSubstanceAdministration()
   * @generated
   */
	int TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION = 17;

		/**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.impl.CaseObservationImpl <em>Case Observation</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.phcr.impl.CaseObservationImpl
   * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrPackageImpl#getCaseObservation()
   * @generated
   */
	int CASE_OBSERVATION = 9;

		/**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CASE_OBSERVATION__REALM_CODE = CCDPackage.PROBLEM_OBSERVATION__REALM_CODE;

		/**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CASE_OBSERVATION__TYPE_ID = CCDPackage.PROBLEM_OBSERVATION__TYPE_ID;

		/**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CASE_OBSERVATION__TEMPLATE_ID = CCDPackage.PROBLEM_OBSERVATION__TEMPLATE_ID;

		/**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CASE_OBSERVATION__ID = CCDPackage.PROBLEM_OBSERVATION__ID;

		/**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CASE_OBSERVATION__CODE = CCDPackage.PROBLEM_OBSERVATION__CODE;

		/**
   * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CASE_OBSERVATION__DERIVATION_EXPR = CCDPackage.PROBLEM_OBSERVATION__DERIVATION_EXPR;

		/**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CASE_OBSERVATION__TEXT = CCDPackage.PROBLEM_OBSERVATION__TEXT;

		/**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CASE_OBSERVATION__STATUS_CODE = CCDPackage.PROBLEM_OBSERVATION__STATUS_CODE;

		/**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CASE_OBSERVATION__EFFECTIVE_TIME = CCDPackage.PROBLEM_OBSERVATION__EFFECTIVE_TIME;

		/**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CASE_OBSERVATION__PRIORITY_CODE = CCDPackage.PROBLEM_OBSERVATION__PRIORITY_CODE;

		/**
   * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CASE_OBSERVATION__REPEAT_NUMBER = CCDPackage.PROBLEM_OBSERVATION__REPEAT_NUMBER;

		/**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CASE_OBSERVATION__LANGUAGE_CODE = CCDPackage.PROBLEM_OBSERVATION__LANGUAGE_CODE;

		/**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CASE_OBSERVATION__VALUE = CCDPackage.PROBLEM_OBSERVATION__VALUE;

		/**
   * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CASE_OBSERVATION__INTERPRETATION_CODE = CCDPackage.PROBLEM_OBSERVATION__INTERPRETATION_CODE;

		/**
   * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CASE_OBSERVATION__METHOD_CODE = CCDPackage.PROBLEM_OBSERVATION__METHOD_CODE;

		/**
   * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CASE_OBSERVATION__TARGET_SITE_CODE = CCDPackage.PROBLEM_OBSERVATION__TARGET_SITE_CODE;

		/**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CASE_OBSERVATION__SUBJECT = CCDPackage.PROBLEM_OBSERVATION__SUBJECT;

		/**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CASE_OBSERVATION__SPECIMEN = CCDPackage.PROBLEM_OBSERVATION__SPECIMEN;

		/**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CASE_OBSERVATION__PERFORMER = CCDPackage.PROBLEM_OBSERVATION__PERFORMER;

		/**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CASE_OBSERVATION__AUTHOR = CCDPackage.PROBLEM_OBSERVATION__AUTHOR;

		/**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CASE_OBSERVATION__INFORMANT = CCDPackage.PROBLEM_OBSERVATION__INFORMANT;

		/**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CASE_OBSERVATION__PARTICIPANT = CCDPackage.PROBLEM_OBSERVATION__PARTICIPANT;

		/**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CASE_OBSERVATION__ENTRY_RELATIONSHIP = CCDPackage.PROBLEM_OBSERVATION__ENTRY_RELATIONSHIP;

		/**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CASE_OBSERVATION__REFERENCE = CCDPackage.PROBLEM_OBSERVATION__REFERENCE;

		/**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CASE_OBSERVATION__PRECONDITION = CCDPackage.PROBLEM_OBSERVATION__PRECONDITION;

		/**
   * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CASE_OBSERVATION__REFERENCE_RANGE = CCDPackage.PROBLEM_OBSERVATION__REFERENCE_RANGE;

		/**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CASE_OBSERVATION__NULL_FLAVOR = CCDPackage.PROBLEM_OBSERVATION__NULL_FLAVOR;

		/**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CASE_OBSERVATION__CLASS_CODE = CCDPackage.PROBLEM_OBSERVATION__CLASS_CODE;

		/**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CASE_OBSERVATION__MOOD_CODE = CCDPackage.PROBLEM_OBSERVATION__MOOD_CODE;

		/**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CASE_OBSERVATION__NEGATION_IND = CCDPackage.PROBLEM_OBSERVATION__NEGATION_IND;

		/**
   * The number of structural features of the '<em>Case Observation</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CASE_OBSERVATION_FEATURE_COUNT = CCDPackage.PROBLEM_OBSERVATION_FEATURE_COUNT + 0;

		/**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SIGNS_AND_SYMPTOMS_OBSERVATION__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

		/**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SIGNS_AND_SYMPTOMS_OBSERVATION__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

		/**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SIGNS_AND_SYMPTOMS_OBSERVATION__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

		/**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SIGNS_AND_SYMPTOMS_OBSERVATION__ID = CDAPackage.OBSERVATION__ID;

		/**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SIGNS_AND_SYMPTOMS_OBSERVATION__CODE = CDAPackage.OBSERVATION__CODE;

		/**
   * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SIGNS_AND_SYMPTOMS_OBSERVATION__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

		/**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SIGNS_AND_SYMPTOMS_OBSERVATION__TEXT = CDAPackage.OBSERVATION__TEXT;

		/**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SIGNS_AND_SYMPTOMS_OBSERVATION__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

		/**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SIGNS_AND_SYMPTOMS_OBSERVATION__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

		/**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SIGNS_AND_SYMPTOMS_OBSERVATION__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

		/**
   * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SIGNS_AND_SYMPTOMS_OBSERVATION__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

		/**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SIGNS_AND_SYMPTOMS_OBSERVATION__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

		/**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SIGNS_AND_SYMPTOMS_OBSERVATION__VALUE = CDAPackage.OBSERVATION__VALUE;

		/**
   * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SIGNS_AND_SYMPTOMS_OBSERVATION__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

		/**
   * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SIGNS_AND_SYMPTOMS_OBSERVATION__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

		/**
   * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SIGNS_AND_SYMPTOMS_OBSERVATION__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

		/**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SIGNS_AND_SYMPTOMS_OBSERVATION__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

		/**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SIGNS_AND_SYMPTOMS_OBSERVATION__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

		/**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SIGNS_AND_SYMPTOMS_OBSERVATION__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

		/**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SIGNS_AND_SYMPTOMS_OBSERVATION__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

		/**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SIGNS_AND_SYMPTOMS_OBSERVATION__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

		/**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SIGNS_AND_SYMPTOMS_OBSERVATION__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

		/**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SIGNS_AND_SYMPTOMS_OBSERVATION__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

		/**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SIGNS_AND_SYMPTOMS_OBSERVATION__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

		/**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SIGNS_AND_SYMPTOMS_OBSERVATION__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

		/**
   * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SIGNS_AND_SYMPTOMS_OBSERVATION__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

		/**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SIGNS_AND_SYMPTOMS_OBSERVATION__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

		/**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SIGNS_AND_SYMPTOMS_OBSERVATION__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

		/**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SIGNS_AND_SYMPTOMS_OBSERVATION__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

		/**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SIGNS_AND_SYMPTOMS_OBSERVATION__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

		/**
   * The number of structural features of the '<em>Signs And Symptoms Observation</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SIGNS_AND_SYMPTOMS_OBSERVATION_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

		/**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PATIENT_CONDITION_ALIVE_OBSERVATION__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

		/**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PATIENT_CONDITION_ALIVE_OBSERVATION__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

		/**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PATIENT_CONDITION_ALIVE_OBSERVATION__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

		/**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PATIENT_CONDITION_ALIVE_OBSERVATION__ID = CDAPackage.OBSERVATION__ID;

		/**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PATIENT_CONDITION_ALIVE_OBSERVATION__CODE = CDAPackage.OBSERVATION__CODE;

		/**
   * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PATIENT_CONDITION_ALIVE_OBSERVATION__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

		/**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PATIENT_CONDITION_ALIVE_OBSERVATION__TEXT = CDAPackage.OBSERVATION__TEXT;

		/**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PATIENT_CONDITION_ALIVE_OBSERVATION__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

		/**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PATIENT_CONDITION_ALIVE_OBSERVATION__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

		/**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PATIENT_CONDITION_ALIVE_OBSERVATION__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

		/**
   * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PATIENT_CONDITION_ALIVE_OBSERVATION__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

		/**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PATIENT_CONDITION_ALIVE_OBSERVATION__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

		/**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PATIENT_CONDITION_ALIVE_OBSERVATION__VALUE = CDAPackage.OBSERVATION__VALUE;

		/**
   * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PATIENT_CONDITION_ALIVE_OBSERVATION__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

		/**
   * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PATIENT_CONDITION_ALIVE_OBSERVATION__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

		/**
   * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PATIENT_CONDITION_ALIVE_OBSERVATION__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

		/**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PATIENT_CONDITION_ALIVE_OBSERVATION__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

		/**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PATIENT_CONDITION_ALIVE_OBSERVATION__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

		/**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PATIENT_CONDITION_ALIVE_OBSERVATION__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

		/**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PATIENT_CONDITION_ALIVE_OBSERVATION__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

		/**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PATIENT_CONDITION_ALIVE_OBSERVATION__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

		/**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PATIENT_CONDITION_ALIVE_OBSERVATION__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

		/**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PATIENT_CONDITION_ALIVE_OBSERVATION__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

		/**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PATIENT_CONDITION_ALIVE_OBSERVATION__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

		/**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PATIENT_CONDITION_ALIVE_OBSERVATION__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

		/**
   * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PATIENT_CONDITION_ALIVE_OBSERVATION__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

		/**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PATIENT_CONDITION_ALIVE_OBSERVATION__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

		/**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PATIENT_CONDITION_ALIVE_OBSERVATION__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

		/**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PATIENT_CONDITION_ALIVE_OBSERVATION__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

		/**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PATIENT_CONDITION_ALIVE_OBSERVATION__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

		/**
   * The number of structural features of the '<em>Patient Condition Alive Observation</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PATIENT_CONDITION_ALIVE_OBSERVATION_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

		/**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PATIENT_CONDITION_DECEASED_OBSERVATION__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

		/**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PATIENT_CONDITION_DECEASED_OBSERVATION__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

		/**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PATIENT_CONDITION_DECEASED_OBSERVATION__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

		/**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PATIENT_CONDITION_DECEASED_OBSERVATION__ID = CDAPackage.OBSERVATION__ID;

		/**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PATIENT_CONDITION_DECEASED_OBSERVATION__CODE = CDAPackage.OBSERVATION__CODE;

		/**
   * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PATIENT_CONDITION_DECEASED_OBSERVATION__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

		/**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PATIENT_CONDITION_DECEASED_OBSERVATION__TEXT = CDAPackage.OBSERVATION__TEXT;

		/**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PATIENT_CONDITION_DECEASED_OBSERVATION__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

		/**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PATIENT_CONDITION_DECEASED_OBSERVATION__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

		/**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PATIENT_CONDITION_DECEASED_OBSERVATION__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

		/**
   * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PATIENT_CONDITION_DECEASED_OBSERVATION__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

		/**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PATIENT_CONDITION_DECEASED_OBSERVATION__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

		/**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PATIENT_CONDITION_DECEASED_OBSERVATION__VALUE = CDAPackage.OBSERVATION__VALUE;

		/**
   * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PATIENT_CONDITION_DECEASED_OBSERVATION__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

		/**
   * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PATIENT_CONDITION_DECEASED_OBSERVATION__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

		/**
   * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PATIENT_CONDITION_DECEASED_OBSERVATION__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

		/**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PATIENT_CONDITION_DECEASED_OBSERVATION__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

		/**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PATIENT_CONDITION_DECEASED_OBSERVATION__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

		/**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PATIENT_CONDITION_DECEASED_OBSERVATION__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

		/**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PATIENT_CONDITION_DECEASED_OBSERVATION__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

		/**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PATIENT_CONDITION_DECEASED_OBSERVATION__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

		/**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PATIENT_CONDITION_DECEASED_OBSERVATION__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

		/**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PATIENT_CONDITION_DECEASED_OBSERVATION__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

		/**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PATIENT_CONDITION_DECEASED_OBSERVATION__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

		/**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PATIENT_CONDITION_DECEASED_OBSERVATION__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

		/**
   * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PATIENT_CONDITION_DECEASED_OBSERVATION__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

		/**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PATIENT_CONDITION_DECEASED_OBSERVATION__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

		/**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PATIENT_CONDITION_DECEASED_OBSERVATION__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

		/**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PATIENT_CONDITION_DECEASED_OBSERVATION__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

		/**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PATIENT_CONDITION_DECEASED_OBSERVATION__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

		/**
   * The number of structural features of the '<em>Patient Condition Deceased Observation</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PATIENT_CONDITION_DECEASED_OBSERVATION_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

		/**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrRelevantMedicalConditionHistoryObservationImpl <em>Relevant Medical Condition History Observation</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrRelevantMedicalConditionHistoryObservationImpl
   * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrPackageImpl#getPhcrRelevantMedicalConditionHistoryObservation()
   * @generated
   */
	int PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION = 13;

		/**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

		/**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

		/**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

		/**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION__ID = CDAPackage.OBSERVATION__ID;

		/**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION__CODE = CDAPackage.OBSERVATION__CODE;

		/**
   * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

		/**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION__TEXT = CDAPackage.OBSERVATION__TEXT;

		/**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

		/**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

		/**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

		/**
   * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

		/**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

		/**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION__VALUE = CDAPackage.OBSERVATION__VALUE;

		/**
   * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

		/**
   * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

		/**
   * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

		/**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

		/**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

		/**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

		/**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

		/**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

		/**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

		/**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

		/**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

		/**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

		/**
   * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

		/**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

		/**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

		/**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

		/**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

		/**
   * The number of structural features of the '<em>Relevant Medical Condition History Observation</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

		/**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_TREATMENT_INFORMATION_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

		/**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_TREATMENT_INFORMATION_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

		/**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_TREATMENT_INFORMATION_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

		/**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_TREATMENT_INFORMATION_SECTION__ID = CDAPackage.SECTION__ID;

		/**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_TREATMENT_INFORMATION_SECTION__CODE = CDAPackage.SECTION__CODE;

		/**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_TREATMENT_INFORMATION_SECTION__TITLE = CDAPackage.SECTION__TITLE;

		/**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_TREATMENT_INFORMATION_SECTION__TEXT = CDAPackage.SECTION__TEXT;

		/**
   * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_TREATMENT_INFORMATION_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

		/**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_TREATMENT_INFORMATION_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

		/**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_TREATMENT_INFORMATION_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

		/**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_TREATMENT_INFORMATION_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

		/**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_TREATMENT_INFORMATION_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

		/**
   * The feature id for the '<em><b>Entry</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_TREATMENT_INFORMATION_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

		/**
   * The feature id for the '<em><b>Component</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_TREATMENT_INFORMATION_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

		/**
   * The feature id for the '<em><b>Section Id</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_TREATMENT_INFORMATION_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

		/**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_TREATMENT_INFORMATION_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

		/**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_TREATMENT_INFORMATION_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

		/**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_TREATMENT_INFORMATION_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

		/**
   * The number of structural features of the '<em>Treatment Information Section</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_TREATMENT_INFORMATION_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

		/**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int THERAPEUTIC_REGIMEN_ACT__REALM_CODE = CDAPackage.ACT__REALM_CODE;

		/**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int THERAPEUTIC_REGIMEN_ACT__TYPE_ID = CDAPackage.ACT__TYPE_ID;

		/**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int THERAPEUTIC_REGIMEN_ACT__TEMPLATE_ID = CDAPackage.ACT__TEMPLATE_ID;

		/**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int THERAPEUTIC_REGIMEN_ACT__ID = CDAPackage.ACT__ID;

		/**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int THERAPEUTIC_REGIMEN_ACT__CODE = CDAPackage.ACT__CODE;

		/**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int THERAPEUTIC_REGIMEN_ACT__TEXT = CDAPackage.ACT__TEXT;

		/**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int THERAPEUTIC_REGIMEN_ACT__STATUS_CODE = CDAPackage.ACT__STATUS_CODE;

		/**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int THERAPEUTIC_REGIMEN_ACT__EFFECTIVE_TIME = CDAPackage.ACT__EFFECTIVE_TIME;

		/**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int THERAPEUTIC_REGIMEN_ACT__PRIORITY_CODE = CDAPackage.ACT__PRIORITY_CODE;

		/**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int THERAPEUTIC_REGIMEN_ACT__LANGUAGE_CODE = CDAPackage.ACT__LANGUAGE_CODE;

		/**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int THERAPEUTIC_REGIMEN_ACT__SUBJECT = CDAPackage.ACT__SUBJECT;

		/**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int THERAPEUTIC_REGIMEN_ACT__SPECIMEN = CDAPackage.ACT__SPECIMEN;

		/**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int THERAPEUTIC_REGIMEN_ACT__PERFORMER = CDAPackage.ACT__PERFORMER;

		/**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int THERAPEUTIC_REGIMEN_ACT__AUTHOR = CDAPackage.ACT__AUTHOR;

		/**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int THERAPEUTIC_REGIMEN_ACT__INFORMANT = CDAPackage.ACT__INFORMANT;

		/**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int THERAPEUTIC_REGIMEN_ACT__PARTICIPANT = CDAPackage.ACT__PARTICIPANT;

		/**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int THERAPEUTIC_REGIMEN_ACT__ENTRY_RELATIONSHIP = CDAPackage.ACT__ENTRY_RELATIONSHIP;

		/**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int THERAPEUTIC_REGIMEN_ACT__REFERENCE = CDAPackage.ACT__REFERENCE;

		/**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int THERAPEUTIC_REGIMEN_ACT__PRECONDITION = CDAPackage.ACT__PRECONDITION;

		/**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int THERAPEUTIC_REGIMEN_ACT__NULL_FLAVOR = CDAPackage.ACT__NULL_FLAVOR;

		/**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int THERAPEUTIC_REGIMEN_ACT__CLASS_CODE = CDAPackage.ACT__CLASS_CODE;

		/**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int THERAPEUTIC_REGIMEN_ACT__MOOD_CODE = CDAPackage.ACT__MOOD_CODE;

		/**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int THERAPEUTIC_REGIMEN_ACT__NEGATION_IND = CDAPackage.ACT__NEGATION_IND;

		/**
   * The number of structural features of the '<em>Therapeutic Regimen Act</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int THERAPEUTIC_REGIMEN_ACT_FEATURE_COUNT = CDAPackage.ACT_FEATURE_COUNT + 0;

		/**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.impl.ResultOrganizerImpl <em>Result Organizer</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.phcr.impl.ResultOrganizerImpl
   * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrPackageImpl#getResultOrganizer()
   * @generated
   */
	int RESULT_ORGANIZER = 20;

		/**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.impl.ResultObservationImpl <em>Result Observation</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.phcr.impl.ResultObservationImpl
   * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrPackageImpl#getResultObservation()
   * @generated
   */
	int RESULT_OBSERVATION = 21;

		/**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.impl.ImagingObservationImpl <em>Imaging Observation</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.phcr.impl.ImagingObservationImpl
   * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrPackageImpl#getImagingObservation()
   * @generated
   */
	int IMAGING_OBSERVATION = 24;

		/**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__REALM_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__REALM_CODE;

		/**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__TYPE_ID = CDAPackage.SUBSTANCE_ADMINISTRATION__TYPE_ID;

		/**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__TEMPLATE_ID = CDAPackage.SUBSTANCE_ADMINISTRATION__TEMPLATE_ID;

		/**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__ID = CDAPackage.SUBSTANCE_ADMINISTRATION__ID;

		/**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__CODE;

		/**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__TEXT = CDAPackage.SUBSTANCE_ADMINISTRATION__TEXT;

		/**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__STATUS_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__STATUS_CODE;

		/**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__EFFECTIVE_TIME = CDAPackage.SUBSTANCE_ADMINISTRATION__EFFECTIVE_TIME;

		/**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__PRIORITY_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__PRIORITY_CODE;

		/**
   * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__REPEAT_NUMBER = CDAPackage.SUBSTANCE_ADMINISTRATION__REPEAT_NUMBER;

		/**
   * The feature id for the '<em><b>Route Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__ROUTE_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__ROUTE_CODE;

		/**
   * The feature id for the '<em><b>Approach Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__APPROACH_SITE_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__APPROACH_SITE_CODE;

		/**
   * The feature id for the '<em><b>Dose Quantity</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DOSE_QUANTITY = CDAPackage.SUBSTANCE_ADMINISTRATION__DOSE_QUANTITY;

		/**
   * The feature id for the '<em><b>Rate Quantity</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__RATE_QUANTITY = CDAPackage.SUBSTANCE_ADMINISTRATION__RATE_QUANTITY;

		/**
   * The feature id for the '<em><b>Max Dose Quantity</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__MAX_DOSE_QUANTITY = CDAPackage.SUBSTANCE_ADMINISTRATION__MAX_DOSE_QUANTITY;

		/**
   * The feature id for the '<em><b>Administration Unit Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__ADMINISTRATION_UNIT_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__ADMINISTRATION_UNIT_CODE;

		/**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__SUBJECT = CDAPackage.SUBSTANCE_ADMINISTRATION__SUBJECT;

		/**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__SPECIMEN = CDAPackage.SUBSTANCE_ADMINISTRATION__SPECIMEN;

		/**
   * The feature id for the '<em><b>Consumable</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__CONSUMABLE = CDAPackage.SUBSTANCE_ADMINISTRATION__CONSUMABLE;

		/**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__PERFORMER = CDAPackage.SUBSTANCE_ADMINISTRATION__PERFORMER;

		/**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__AUTHOR = CDAPackage.SUBSTANCE_ADMINISTRATION__AUTHOR;

		/**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__INFORMANT = CDAPackage.SUBSTANCE_ADMINISTRATION__INFORMANT;

		/**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__PARTICIPANT = CDAPackage.SUBSTANCE_ADMINISTRATION__PARTICIPANT;

		/**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__ENTRY_RELATIONSHIP = CDAPackage.SUBSTANCE_ADMINISTRATION__ENTRY_RELATIONSHIP;

		/**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__REFERENCE = CDAPackage.SUBSTANCE_ADMINISTRATION__REFERENCE;

		/**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__PRECONDITION = CDAPackage.SUBSTANCE_ADMINISTRATION__PRECONDITION;

		/**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__NULL_FLAVOR = CDAPackage.SUBSTANCE_ADMINISTRATION__NULL_FLAVOR;

		/**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__CLASS_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__CLASS_CODE;

		/**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__MOOD_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__MOOD_CODE;

		/**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__NEGATION_IND = CDAPackage.SUBSTANCE_ADMINISTRATION__NEGATION_IND;

		/**
   * The number of structural features of the '<em>Treatment Given Substance Administration</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION_FEATURE_COUNT = CDAPackage.SUBSTANCE_ADMINISTRATION_FEATURE_COUNT + 0;

		/**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__REALM_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__REALM_CODE;

		/**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__TYPE_ID = CDAPackage.SUBSTANCE_ADMINISTRATION__TYPE_ID;

		/**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__TEMPLATE_ID = CDAPackage.SUBSTANCE_ADMINISTRATION__TEMPLATE_ID;

		/**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__ID = CDAPackage.SUBSTANCE_ADMINISTRATION__ID;

		/**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__CODE;

		/**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__TEXT = CDAPackage.SUBSTANCE_ADMINISTRATION__TEXT;

		/**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__STATUS_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__STATUS_CODE;

		/**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__EFFECTIVE_TIME = CDAPackage.SUBSTANCE_ADMINISTRATION__EFFECTIVE_TIME;

		/**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__PRIORITY_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__PRIORITY_CODE;

		/**
   * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__REPEAT_NUMBER = CDAPackage.SUBSTANCE_ADMINISTRATION__REPEAT_NUMBER;

		/**
   * The feature id for the '<em><b>Route Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__ROUTE_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__ROUTE_CODE;

		/**
   * The feature id for the '<em><b>Approach Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__APPROACH_SITE_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__APPROACH_SITE_CODE;

		/**
   * The feature id for the '<em><b>Dose Quantity</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DOSE_QUANTITY = CDAPackage.SUBSTANCE_ADMINISTRATION__DOSE_QUANTITY;

		/**
   * The feature id for the '<em><b>Rate Quantity</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__RATE_QUANTITY = CDAPackage.SUBSTANCE_ADMINISTRATION__RATE_QUANTITY;

		/**
   * The feature id for the '<em><b>Max Dose Quantity</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__MAX_DOSE_QUANTITY = CDAPackage.SUBSTANCE_ADMINISTRATION__MAX_DOSE_QUANTITY;

		/**
   * The feature id for the '<em><b>Administration Unit Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__ADMINISTRATION_UNIT_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__ADMINISTRATION_UNIT_CODE;

		/**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__SUBJECT = CDAPackage.SUBSTANCE_ADMINISTRATION__SUBJECT;

		/**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__SPECIMEN = CDAPackage.SUBSTANCE_ADMINISTRATION__SPECIMEN;

		/**
   * The feature id for the '<em><b>Consumable</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__CONSUMABLE = CDAPackage.SUBSTANCE_ADMINISTRATION__CONSUMABLE;

		/**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__PERFORMER = CDAPackage.SUBSTANCE_ADMINISTRATION__PERFORMER;

		/**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__AUTHOR = CDAPackage.SUBSTANCE_ADMINISTRATION__AUTHOR;

		/**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__INFORMANT = CDAPackage.SUBSTANCE_ADMINISTRATION__INFORMANT;

		/**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__PARTICIPANT = CDAPackage.SUBSTANCE_ADMINISTRATION__PARTICIPANT;

		/**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__ENTRY_RELATIONSHIP = CDAPackage.SUBSTANCE_ADMINISTRATION__ENTRY_RELATIONSHIP;

		/**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__REFERENCE = CDAPackage.SUBSTANCE_ADMINISTRATION__REFERENCE;

		/**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__PRECONDITION = CDAPackage.SUBSTANCE_ADMINISTRATION__PRECONDITION;

		/**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__NULL_FLAVOR = CDAPackage.SUBSTANCE_ADMINISTRATION__NULL_FLAVOR;

		/**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__CLASS_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__CLASS_CODE;

		/**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__MOOD_CODE = CDAPackage.SUBSTANCE_ADMINISTRATION__MOOD_CODE;

		/**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__NEGATION_IND = CDAPackage.SUBSTANCE_ADMINISTRATION__NEGATION_IND;

		/**
   * The number of structural features of the '<em>Treatment Not Given Substance Administration</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_FEATURE_COUNT = CDAPackage.SUBSTANCE_ADMINISTRATION_FEATURE_COUNT + 0;

		/**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_ENCOUNTERS_SECTION__REALM_CODE = CCDPackage.ENCOUNTERS_SECTION__REALM_CODE;

		/**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_ENCOUNTERS_SECTION__TYPE_ID = CCDPackage.ENCOUNTERS_SECTION__TYPE_ID;

		/**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_ENCOUNTERS_SECTION__TEMPLATE_ID = CCDPackage.ENCOUNTERS_SECTION__TEMPLATE_ID;

		/**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_ENCOUNTERS_SECTION__ID = CCDPackage.ENCOUNTERS_SECTION__ID;

		/**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_ENCOUNTERS_SECTION__CODE = CCDPackage.ENCOUNTERS_SECTION__CODE;

		/**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_ENCOUNTERS_SECTION__TITLE = CCDPackage.ENCOUNTERS_SECTION__TITLE;

		/**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_ENCOUNTERS_SECTION__TEXT = CCDPackage.ENCOUNTERS_SECTION__TEXT;

		/**
   * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_ENCOUNTERS_SECTION__CONFIDENTIALITY_CODE = CCDPackage.ENCOUNTERS_SECTION__CONFIDENTIALITY_CODE;

		/**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_ENCOUNTERS_SECTION__LANGUAGE_CODE = CCDPackage.ENCOUNTERS_SECTION__LANGUAGE_CODE;

		/**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_ENCOUNTERS_SECTION__SUBJECT = CCDPackage.ENCOUNTERS_SECTION__SUBJECT;

		/**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_ENCOUNTERS_SECTION__AUTHOR = CCDPackage.ENCOUNTERS_SECTION__AUTHOR;

		/**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_ENCOUNTERS_SECTION__INFORMANT = CCDPackage.ENCOUNTERS_SECTION__INFORMANT;

		/**
   * The feature id for the '<em><b>Entry</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_ENCOUNTERS_SECTION__ENTRY = CCDPackage.ENCOUNTERS_SECTION__ENTRY;

		/**
   * The feature id for the '<em><b>Component</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_ENCOUNTERS_SECTION__COMPONENT = CCDPackage.ENCOUNTERS_SECTION__COMPONENT;

		/**
   * The feature id for the '<em><b>Section Id</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_ENCOUNTERS_SECTION__SECTION_ID = CCDPackage.ENCOUNTERS_SECTION__SECTION_ID;

		/**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_ENCOUNTERS_SECTION__NULL_FLAVOR = CCDPackage.ENCOUNTERS_SECTION__NULL_FLAVOR;

		/**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_ENCOUNTERS_SECTION__CLASS_CODE = CCDPackage.ENCOUNTERS_SECTION__CLASS_CODE;

		/**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_ENCOUNTERS_SECTION__MOOD_CODE = CCDPackage.ENCOUNTERS_SECTION__MOOD_CODE;

		/**
   * The number of structural features of the '<em>Encounters Section</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_ENCOUNTERS_SECTION_FEATURE_COUNT = CCDPackage.ENCOUNTERS_SECTION_FEATURE_COUNT + 0;

		/**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_RELEVANT_DX_TESTS_SECTION__REALM_CODE = CCDPackage.RESULTS_SECTION__REALM_CODE;

		/**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_RELEVANT_DX_TESTS_SECTION__TYPE_ID = CCDPackage.RESULTS_SECTION__TYPE_ID;

		/**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_RELEVANT_DX_TESTS_SECTION__TEMPLATE_ID = CCDPackage.RESULTS_SECTION__TEMPLATE_ID;

		/**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_RELEVANT_DX_TESTS_SECTION__ID = CCDPackage.RESULTS_SECTION__ID;

		/**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_RELEVANT_DX_TESTS_SECTION__CODE = CCDPackage.RESULTS_SECTION__CODE;

		/**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_RELEVANT_DX_TESTS_SECTION__TITLE = CCDPackage.RESULTS_SECTION__TITLE;

		/**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_RELEVANT_DX_TESTS_SECTION__TEXT = CCDPackage.RESULTS_SECTION__TEXT;

		/**
   * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_RELEVANT_DX_TESTS_SECTION__CONFIDENTIALITY_CODE = CCDPackage.RESULTS_SECTION__CONFIDENTIALITY_CODE;

		/**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_RELEVANT_DX_TESTS_SECTION__LANGUAGE_CODE = CCDPackage.RESULTS_SECTION__LANGUAGE_CODE;

		/**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_RELEVANT_DX_TESTS_SECTION__SUBJECT = CCDPackage.RESULTS_SECTION__SUBJECT;

		/**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_RELEVANT_DX_TESTS_SECTION__AUTHOR = CCDPackage.RESULTS_SECTION__AUTHOR;

		/**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_RELEVANT_DX_TESTS_SECTION__INFORMANT = CCDPackage.RESULTS_SECTION__INFORMANT;

		/**
   * The feature id for the '<em><b>Entry</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_RELEVANT_DX_TESTS_SECTION__ENTRY = CCDPackage.RESULTS_SECTION__ENTRY;

		/**
   * The feature id for the '<em><b>Component</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_RELEVANT_DX_TESTS_SECTION__COMPONENT = CCDPackage.RESULTS_SECTION__COMPONENT;

		/**
   * The feature id for the '<em><b>Section Id</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_RELEVANT_DX_TESTS_SECTION__SECTION_ID = CCDPackage.RESULTS_SECTION__SECTION_ID;

		/**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_RELEVANT_DX_TESTS_SECTION__NULL_FLAVOR = CCDPackage.RESULTS_SECTION__NULL_FLAVOR;

		/**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_RELEVANT_DX_TESTS_SECTION__CLASS_CODE = CCDPackage.RESULTS_SECTION__CLASS_CODE;

		/**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_RELEVANT_DX_TESTS_SECTION__MOOD_CODE = CCDPackage.RESULTS_SECTION__MOOD_CODE;

		/**
   * The number of structural features of the '<em>Relevant Dx Tests Section</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PHCR_RELEVANT_DX_TESTS_SECTION_FEATURE_COUNT = CCDPackage.RESULTS_SECTION_FEATURE_COUNT + 0;

		/**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESULT_ORGANIZER__REALM_CODE = CCDPackage.RESULT_ORGANIZER__REALM_CODE;

		/**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESULT_ORGANIZER__TYPE_ID = CCDPackage.RESULT_ORGANIZER__TYPE_ID;

		/**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESULT_ORGANIZER__TEMPLATE_ID = CCDPackage.RESULT_ORGANIZER__TEMPLATE_ID;

		/**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESULT_ORGANIZER__ID = CCDPackage.RESULT_ORGANIZER__ID;

		/**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESULT_ORGANIZER__CODE = CCDPackage.RESULT_ORGANIZER__CODE;

		/**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESULT_ORGANIZER__STATUS_CODE = CCDPackage.RESULT_ORGANIZER__STATUS_CODE;

		/**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESULT_ORGANIZER__EFFECTIVE_TIME = CCDPackage.RESULT_ORGANIZER__EFFECTIVE_TIME;

		/**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESULT_ORGANIZER__SUBJECT = CCDPackage.RESULT_ORGANIZER__SUBJECT;

		/**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESULT_ORGANIZER__SPECIMEN = CCDPackage.RESULT_ORGANIZER__SPECIMEN;

		/**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESULT_ORGANIZER__PERFORMER = CCDPackage.RESULT_ORGANIZER__PERFORMER;

		/**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESULT_ORGANIZER__AUTHOR = CCDPackage.RESULT_ORGANIZER__AUTHOR;

		/**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESULT_ORGANIZER__INFORMANT = CCDPackage.RESULT_ORGANIZER__INFORMANT;

		/**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESULT_ORGANIZER__PARTICIPANT = CCDPackage.RESULT_ORGANIZER__PARTICIPANT;

		/**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESULT_ORGANIZER__REFERENCE = CCDPackage.RESULT_ORGANIZER__REFERENCE;

		/**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESULT_ORGANIZER__PRECONDITION = CCDPackage.RESULT_ORGANIZER__PRECONDITION;

		/**
   * The feature id for the '<em><b>Component</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESULT_ORGANIZER__COMPONENT = CCDPackage.RESULT_ORGANIZER__COMPONENT;

		/**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESULT_ORGANIZER__NULL_FLAVOR = CCDPackage.RESULT_ORGANIZER__NULL_FLAVOR;

		/**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESULT_ORGANIZER__CLASS_CODE = CCDPackage.RESULT_ORGANIZER__CLASS_CODE;

		/**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESULT_ORGANIZER__MOOD_CODE = CCDPackage.RESULT_ORGANIZER__MOOD_CODE;

		/**
   * The number of structural features of the '<em>Result Organizer</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESULT_ORGANIZER_FEATURE_COUNT = CCDPackage.RESULT_ORGANIZER_FEATURE_COUNT + 0;

		/**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESULT_OBSERVATION__REALM_CODE = CCDPackage.RESULT_OBSERVATION__REALM_CODE;

		/**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESULT_OBSERVATION__TYPE_ID = CCDPackage.RESULT_OBSERVATION__TYPE_ID;

		/**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESULT_OBSERVATION__TEMPLATE_ID = CCDPackage.RESULT_OBSERVATION__TEMPLATE_ID;

		/**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESULT_OBSERVATION__ID = CCDPackage.RESULT_OBSERVATION__ID;

		/**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESULT_OBSERVATION__CODE = CCDPackage.RESULT_OBSERVATION__CODE;

		/**
   * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESULT_OBSERVATION__DERIVATION_EXPR = CCDPackage.RESULT_OBSERVATION__DERIVATION_EXPR;

		/**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESULT_OBSERVATION__TEXT = CCDPackage.RESULT_OBSERVATION__TEXT;

		/**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESULT_OBSERVATION__STATUS_CODE = CCDPackage.RESULT_OBSERVATION__STATUS_CODE;

		/**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESULT_OBSERVATION__EFFECTIVE_TIME = CCDPackage.RESULT_OBSERVATION__EFFECTIVE_TIME;

		/**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESULT_OBSERVATION__PRIORITY_CODE = CCDPackage.RESULT_OBSERVATION__PRIORITY_CODE;

		/**
   * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESULT_OBSERVATION__REPEAT_NUMBER = CCDPackage.RESULT_OBSERVATION__REPEAT_NUMBER;

		/**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESULT_OBSERVATION__LANGUAGE_CODE = CCDPackage.RESULT_OBSERVATION__LANGUAGE_CODE;

		/**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESULT_OBSERVATION__VALUE = CCDPackage.RESULT_OBSERVATION__VALUE;

		/**
   * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESULT_OBSERVATION__INTERPRETATION_CODE = CCDPackage.RESULT_OBSERVATION__INTERPRETATION_CODE;

		/**
   * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESULT_OBSERVATION__METHOD_CODE = CCDPackage.RESULT_OBSERVATION__METHOD_CODE;

		/**
   * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESULT_OBSERVATION__TARGET_SITE_CODE = CCDPackage.RESULT_OBSERVATION__TARGET_SITE_CODE;

		/**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESULT_OBSERVATION__SUBJECT = CCDPackage.RESULT_OBSERVATION__SUBJECT;

		/**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESULT_OBSERVATION__SPECIMEN = CCDPackage.RESULT_OBSERVATION__SPECIMEN;

		/**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESULT_OBSERVATION__PERFORMER = CCDPackage.RESULT_OBSERVATION__PERFORMER;

		/**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESULT_OBSERVATION__AUTHOR = CCDPackage.RESULT_OBSERVATION__AUTHOR;

		/**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESULT_OBSERVATION__INFORMANT = CCDPackage.RESULT_OBSERVATION__INFORMANT;

		/**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESULT_OBSERVATION__PARTICIPANT = CCDPackage.RESULT_OBSERVATION__PARTICIPANT;

		/**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESULT_OBSERVATION__ENTRY_RELATIONSHIP = CCDPackage.RESULT_OBSERVATION__ENTRY_RELATIONSHIP;

		/**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESULT_OBSERVATION__REFERENCE = CCDPackage.RESULT_OBSERVATION__REFERENCE;

		/**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESULT_OBSERVATION__PRECONDITION = CCDPackage.RESULT_OBSERVATION__PRECONDITION;

		/**
   * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESULT_OBSERVATION__REFERENCE_RANGE = CCDPackage.RESULT_OBSERVATION__REFERENCE_RANGE;

		/**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESULT_OBSERVATION__NULL_FLAVOR = CCDPackage.RESULT_OBSERVATION__NULL_FLAVOR;

		/**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESULT_OBSERVATION__CLASS_CODE = CCDPackage.RESULT_OBSERVATION__CLASS_CODE;

		/**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESULT_OBSERVATION__MOOD_CODE = CCDPackage.RESULT_OBSERVATION__MOOD_CODE;

		/**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESULT_OBSERVATION__NEGATION_IND = CCDPackage.RESULT_OBSERVATION__NEGATION_IND;

		/**
   * The number of structural features of the '<em>Result Observation</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESULT_OBSERVATION_FEATURE_COUNT = CCDPackage.RESULT_OBSERVATION_FEATURE_COUNT + 0;

		/**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.impl.SpecimenCollectionProcedureImpl <em>Specimen Collection Procedure</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.phcr.impl.SpecimenCollectionProcedureImpl
   * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrPackageImpl#getSpecimenCollectionProcedure()
   * @generated
   */
	int SPECIMEN_COLLECTION_PROCEDURE = 22;

		/**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SPECIMEN_COLLECTION_PROCEDURE__REALM_CODE = CDAPackage.PROCEDURE__REALM_CODE;

		/**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SPECIMEN_COLLECTION_PROCEDURE__TYPE_ID = CDAPackage.PROCEDURE__TYPE_ID;

		/**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SPECIMEN_COLLECTION_PROCEDURE__TEMPLATE_ID = CDAPackage.PROCEDURE__TEMPLATE_ID;

		/**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SPECIMEN_COLLECTION_PROCEDURE__ID = CDAPackage.PROCEDURE__ID;

		/**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SPECIMEN_COLLECTION_PROCEDURE__CODE = CDAPackage.PROCEDURE__CODE;

		/**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SPECIMEN_COLLECTION_PROCEDURE__TEXT = CDAPackage.PROCEDURE__TEXT;

		/**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SPECIMEN_COLLECTION_PROCEDURE__STATUS_CODE = CDAPackage.PROCEDURE__STATUS_CODE;

		/**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SPECIMEN_COLLECTION_PROCEDURE__EFFECTIVE_TIME = CDAPackage.PROCEDURE__EFFECTIVE_TIME;

		/**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SPECIMEN_COLLECTION_PROCEDURE__PRIORITY_CODE = CDAPackage.PROCEDURE__PRIORITY_CODE;

		/**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SPECIMEN_COLLECTION_PROCEDURE__LANGUAGE_CODE = CDAPackage.PROCEDURE__LANGUAGE_CODE;

		/**
   * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SPECIMEN_COLLECTION_PROCEDURE__METHOD_CODE = CDAPackage.PROCEDURE__METHOD_CODE;

		/**
   * The feature id for the '<em><b>Approach Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SPECIMEN_COLLECTION_PROCEDURE__APPROACH_SITE_CODE = CDAPackage.PROCEDURE__APPROACH_SITE_CODE;

		/**
   * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SPECIMEN_COLLECTION_PROCEDURE__TARGET_SITE_CODE = CDAPackage.PROCEDURE__TARGET_SITE_CODE;

		/**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SPECIMEN_COLLECTION_PROCEDURE__SUBJECT = CDAPackage.PROCEDURE__SUBJECT;

		/**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SPECIMEN_COLLECTION_PROCEDURE__SPECIMEN = CDAPackage.PROCEDURE__SPECIMEN;

		/**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SPECIMEN_COLLECTION_PROCEDURE__PERFORMER = CDAPackage.PROCEDURE__PERFORMER;

		/**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SPECIMEN_COLLECTION_PROCEDURE__AUTHOR = CDAPackage.PROCEDURE__AUTHOR;

		/**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SPECIMEN_COLLECTION_PROCEDURE__INFORMANT = CDAPackage.PROCEDURE__INFORMANT;

		/**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SPECIMEN_COLLECTION_PROCEDURE__PARTICIPANT = CDAPackage.PROCEDURE__PARTICIPANT;

		/**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SPECIMEN_COLLECTION_PROCEDURE__ENTRY_RELATIONSHIP = CDAPackage.PROCEDURE__ENTRY_RELATIONSHIP;

		/**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SPECIMEN_COLLECTION_PROCEDURE__REFERENCE = CDAPackage.PROCEDURE__REFERENCE;

		/**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SPECIMEN_COLLECTION_PROCEDURE__PRECONDITION = CDAPackage.PROCEDURE__PRECONDITION;

		/**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SPECIMEN_COLLECTION_PROCEDURE__NULL_FLAVOR = CDAPackage.PROCEDURE__NULL_FLAVOR;

		/**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SPECIMEN_COLLECTION_PROCEDURE__CLASS_CODE = CDAPackage.PROCEDURE__CLASS_CODE;

		/**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SPECIMEN_COLLECTION_PROCEDURE__MOOD_CODE = CDAPackage.PROCEDURE__MOOD_CODE;

		/**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SPECIMEN_COLLECTION_PROCEDURE__NEGATION_IND = CDAPackage.PROCEDURE__NEGATION_IND;

		/**
   * The number of structural features of the '<em>Specimen Collection Procedure</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SPECIMEN_COLLECTION_PROCEDURE_FEATURE_COUNT = CDAPackage.PROCEDURE_FEATURE_COUNT + 0;

		/**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.impl.SusceptibilityResultImpl <em>Susceptibility Result</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.phcr.impl.SusceptibilityResultImpl
   * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrPackageImpl#getSusceptibilityResult()
   * @generated
   */
	int SUSCEPTIBILITY_RESULT = 23;

		/**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SUSCEPTIBILITY_RESULT__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

		/**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SUSCEPTIBILITY_RESULT__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

		/**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SUSCEPTIBILITY_RESULT__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

		/**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SUSCEPTIBILITY_RESULT__ID = CDAPackage.OBSERVATION__ID;

		/**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SUSCEPTIBILITY_RESULT__CODE = CDAPackage.OBSERVATION__CODE;

		/**
   * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SUSCEPTIBILITY_RESULT__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

		/**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SUSCEPTIBILITY_RESULT__TEXT = CDAPackage.OBSERVATION__TEXT;

		/**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SUSCEPTIBILITY_RESULT__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

		/**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SUSCEPTIBILITY_RESULT__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

		/**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SUSCEPTIBILITY_RESULT__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

		/**
   * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SUSCEPTIBILITY_RESULT__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

		/**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SUSCEPTIBILITY_RESULT__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

		/**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SUSCEPTIBILITY_RESULT__VALUE = CDAPackage.OBSERVATION__VALUE;

		/**
   * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SUSCEPTIBILITY_RESULT__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

		/**
   * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SUSCEPTIBILITY_RESULT__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

		/**
   * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SUSCEPTIBILITY_RESULT__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

		/**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SUSCEPTIBILITY_RESULT__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

		/**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SUSCEPTIBILITY_RESULT__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

		/**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SUSCEPTIBILITY_RESULT__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

		/**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SUSCEPTIBILITY_RESULT__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

		/**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SUSCEPTIBILITY_RESULT__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

		/**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SUSCEPTIBILITY_RESULT__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

		/**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SUSCEPTIBILITY_RESULT__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

		/**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SUSCEPTIBILITY_RESULT__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

		/**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SUSCEPTIBILITY_RESULT__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

		/**
   * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SUSCEPTIBILITY_RESULT__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

		/**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SUSCEPTIBILITY_RESULT__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

		/**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SUSCEPTIBILITY_RESULT__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

		/**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SUSCEPTIBILITY_RESULT__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

		/**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SUSCEPTIBILITY_RESULT__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

		/**
   * The number of structural features of the '<em>Susceptibility Result</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SUSCEPTIBILITY_RESULT_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

		/**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int IMAGING_OBSERVATION__REALM_CODE = CCDPackage.PROBLEM_OBSERVATION__REALM_CODE;

		/**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int IMAGING_OBSERVATION__TYPE_ID = CCDPackage.PROBLEM_OBSERVATION__TYPE_ID;

		/**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int IMAGING_OBSERVATION__TEMPLATE_ID = CCDPackage.PROBLEM_OBSERVATION__TEMPLATE_ID;

		/**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int IMAGING_OBSERVATION__ID = CCDPackage.PROBLEM_OBSERVATION__ID;

		/**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int IMAGING_OBSERVATION__CODE = CCDPackage.PROBLEM_OBSERVATION__CODE;

		/**
   * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int IMAGING_OBSERVATION__DERIVATION_EXPR = CCDPackage.PROBLEM_OBSERVATION__DERIVATION_EXPR;

		/**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int IMAGING_OBSERVATION__TEXT = CCDPackage.PROBLEM_OBSERVATION__TEXT;

		/**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int IMAGING_OBSERVATION__STATUS_CODE = CCDPackage.PROBLEM_OBSERVATION__STATUS_CODE;

		/**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int IMAGING_OBSERVATION__EFFECTIVE_TIME = CCDPackage.PROBLEM_OBSERVATION__EFFECTIVE_TIME;

		/**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int IMAGING_OBSERVATION__PRIORITY_CODE = CCDPackage.PROBLEM_OBSERVATION__PRIORITY_CODE;

		/**
   * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int IMAGING_OBSERVATION__REPEAT_NUMBER = CCDPackage.PROBLEM_OBSERVATION__REPEAT_NUMBER;

		/**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int IMAGING_OBSERVATION__LANGUAGE_CODE = CCDPackage.PROBLEM_OBSERVATION__LANGUAGE_CODE;

		/**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int IMAGING_OBSERVATION__VALUE = CCDPackage.PROBLEM_OBSERVATION__VALUE;

		/**
   * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int IMAGING_OBSERVATION__INTERPRETATION_CODE = CCDPackage.PROBLEM_OBSERVATION__INTERPRETATION_CODE;

		/**
   * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int IMAGING_OBSERVATION__METHOD_CODE = CCDPackage.PROBLEM_OBSERVATION__METHOD_CODE;

		/**
   * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int IMAGING_OBSERVATION__TARGET_SITE_CODE = CCDPackage.PROBLEM_OBSERVATION__TARGET_SITE_CODE;

		/**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int IMAGING_OBSERVATION__SUBJECT = CCDPackage.PROBLEM_OBSERVATION__SUBJECT;

		/**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int IMAGING_OBSERVATION__SPECIMEN = CCDPackage.PROBLEM_OBSERVATION__SPECIMEN;

		/**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int IMAGING_OBSERVATION__PERFORMER = CCDPackage.PROBLEM_OBSERVATION__PERFORMER;

		/**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int IMAGING_OBSERVATION__AUTHOR = CCDPackage.PROBLEM_OBSERVATION__AUTHOR;

		/**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int IMAGING_OBSERVATION__INFORMANT = CCDPackage.PROBLEM_OBSERVATION__INFORMANT;

		/**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int IMAGING_OBSERVATION__PARTICIPANT = CCDPackage.PROBLEM_OBSERVATION__PARTICIPANT;

		/**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int IMAGING_OBSERVATION__ENTRY_RELATIONSHIP = CCDPackage.PROBLEM_OBSERVATION__ENTRY_RELATIONSHIP;

		/**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int IMAGING_OBSERVATION__REFERENCE = CCDPackage.PROBLEM_OBSERVATION__REFERENCE;

		/**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int IMAGING_OBSERVATION__PRECONDITION = CCDPackage.PROBLEM_OBSERVATION__PRECONDITION;

		/**
   * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int IMAGING_OBSERVATION__REFERENCE_RANGE = CCDPackage.PROBLEM_OBSERVATION__REFERENCE_RANGE;

		/**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int IMAGING_OBSERVATION__NULL_FLAVOR = CCDPackage.PROBLEM_OBSERVATION__NULL_FLAVOR;

		/**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int IMAGING_OBSERVATION__CLASS_CODE = CCDPackage.PROBLEM_OBSERVATION__CLASS_CODE;

		/**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int IMAGING_OBSERVATION__MOOD_CODE = CCDPackage.PROBLEM_OBSERVATION__MOOD_CODE;

		/**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int IMAGING_OBSERVATION__NEGATION_IND = CCDPackage.PROBLEM_OBSERVATION__NEGATION_IND;

		/**
   * The number of structural features of the '<em>Imaging Observation</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int IMAGING_OBSERVATION_FEATURE_COUNT = CCDPackage.PROBLEM_OBSERVATION_FEATURE_COUNT + 0;


		/**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport <em>Public Health Case Report</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Public Health Case Report</em>'.
   * @see org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport
   * @generated
   */
	EClass getPublicHealthCaseReport();

		/**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrSocialHistorySection <em>Social History Section</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Social History Section</em>'.
   * @see org.openhealthtools.mdht.uml.cda.phcr.PhcrSocialHistorySection
   * @generated
   */
	EClass getPhcrSocialHistorySection();

		/**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.GeotemporalHistoryObservation <em>Geotemporal History Observation</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Geotemporal History Observation</em>'.
   * @see org.openhealthtools.mdht.uml.cda.phcr.GeotemporalHistoryObservation
   * @generated
   */
	EClass getGeotemporalHistoryObservation();

		/**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.MostRecentTimeArrivedInUSAObservation <em>Most Recent Time Arrived In USA Observation</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Most Recent Time Arrived In USA Observation</em>'.
   * @see org.openhealthtools.mdht.uml.cda.phcr.MostRecentTimeArrivedInUSAObservation
   * @generated
   */
	EClass getMostRecentTimeArrivedInUSAObservation();

		/**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.RaceObservation <em>Race Observation</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Race Observation</em>'.
   * @see org.openhealthtools.mdht.uml.cda.phcr.RaceObservation
   * @generated
   */
	EClass getRaceObservation();

		/**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.OccupationObservation <em>Occupation Observation</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Occupation Observation</em>'.
   * @see org.openhealthtools.mdht.uml.cda.phcr.OccupationObservation
   * @generated
   */
	EClass getOccupationObservation();

		/**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.PregnancyObservation <em>Pregnancy Observation</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pregnancy Observation</em>'.
   * @see org.openhealthtools.mdht.uml.cda.phcr.PregnancyObservation
   * @generated
   */
	EClass getPregnancyObservation();

		/**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.EstimatedDateOfDeliveryObservation <em>Estimated Date Of Delivery Observation</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Estimated Date Of Delivery Observation</em>'.
   * @see org.openhealthtools.mdht.uml.cda.phcr.EstimatedDateOfDeliveryObservation
   * @generated
   */
	EClass getEstimatedDateOfDeliveryObservation();

		/**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrClinicalInformationSection <em>Clinical Information Section</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Clinical Information Section</em>'.
   * @see org.openhealthtools.mdht.uml.cda.phcr.PhcrClinicalInformationSection
   * @generated
   */
	EClass getPhcrClinicalInformationSection();

		/**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrTreatmentInformationSection <em>Treatment Information Section</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Treatment Information Section</em>'.
   * @see org.openhealthtools.mdht.uml.cda.phcr.PhcrTreatmentInformationSection
   * @generated
   */
	EClass getPhcrTreatmentInformationSection();

		/**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.TherapeuticRegimenAct <em>Therapeutic Regimen Act</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Therapeutic Regimen Act</em>'.
   * @see org.openhealthtools.mdht.uml.cda.phcr.TherapeuticRegimenAct
   * @generated
   */
	EClass getTherapeuticRegimenAct();

		/**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrEncountersSection <em>Encounters Section</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Encounters Section</em>'.
   * @see org.openhealthtools.mdht.uml.cda.phcr.PhcrEncountersSection
   * @generated
   */
	EClass getPhcrEncountersSection();

		/**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantDxTestsSection <em>Relevant Dx Tests Section</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relevant Dx Tests Section</em>'.
   * @see org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantDxTestsSection
   * @generated
   */
	EClass getPhcrRelevantDxTestsSection();

		/**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.ResultOrganizer <em>Result Organizer</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Result Organizer</em>'.
   * @see org.openhealthtools.mdht.uml.cda.phcr.ResultOrganizer
   * @generated
   */
	EClass getResultOrganizer();

		/**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.ResultObservation <em>Result Observation</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Result Observation</em>'.
   * @see org.openhealthtools.mdht.uml.cda.phcr.ResultObservation
   * @generated
   */
	EClass getResultObservation();

		/**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.SpecimenCollectionProcedure <em>Specimen Collection Procedure</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Specimen Collection Procedure</em>'.
   * @see org.openhealthtools.mdht.uml.cda.phcr.SpecimenCollectionProcedure
   * @generated
   */
	EClass getSpecimenCollectionProcedure();

		/**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.ImagingObservation <em>Imaging Observation</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Imaging Observation</em>'.
   * @see org.openhealthtools.mdht.uml.cda.phcr.ImagingObservation
   * @generated
   */
	EClass getImagingObservation();

		/**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.PatientConditionAliveObservation <em>Patient Condition Alive Observation</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Patient Condition Alive Observation</em>'.
   * @see org.openhealthtools.mdht.uml.cda.phcr.PatientConditionAliveObservation
   * @generated
   */
	EClass getPatientConditionAliveObservation();

		/**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.PatientConditionDeceasedObservation <em>Patient Condition Deceased Observation</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Patient Condition Deceased Observation</em>'.
   * @see org.openhealthtools.mdht.uml.cda.phcr.PatientConditionDeceasedObservation
   * @generated
   */
	EClass getPatientConditionDeceasedObservation();

		/**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantMedicalConditionHistoryObservation <em>Relevant Medical Condition History Observation</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relevant Medical Condition History Observation</em>'.
   * @see org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantMedicalConditionHistoryObservation
   * @generated
   */
	EClass getPhcrRelevantMedicalConditionHistoryObservation();

		/**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.SignsAndSymptomsObservation <em>Signs And Symptoms Observation</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Signs And Symptoms Observation</em>'.
   * @see org.openhealthtools.mdht.uml.cda.phcr.SignsAndSymptomsObservation
   * @generated
   */
	EClass getSignsAndSymptomsObservation();

		/**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.SusceptibilityResult <em>Susceptibility Result</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Susceptibility Result</em>'.
   * @see org.openhealthtools.mdht.uml.cda.phcr.SusceptibilityResult
   * @generated
   */
	EClass getSusceptibilityResult();

		/**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.TreatmentGivenSubstanceAdministration <em>Treatment Given Substance Administration</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Treatment Given Substance Administration</em>'.
   * @see org.openhealthtools.mdht.uml.cda.phcr.TreatmentGivenSubstanceAdministration
   * @generated
   */
	EClass getTreatmentGivenSubstanceAdministration();

		/**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.TreatmentNotGivenSubstanceAdministration <em>Treatment Not Given Substance Administration</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Treatment Not Given Substance Administration</em>'.
   * @see org.openhealthtools.mdht.uml.cda.phcr.TreatmentNotGivenSubstanceAdministration
   * @generated
   */
	EClass getTreatmentNotGivenSubstanceAdministration();

		/**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.CaseObservation <em>Case Observation</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Case Observation</em>'.
   * @see org.openhealthtools.mdht.uml.cda.phcr.CaseObservation
   * @generated
   */
	EClass getCaseObservation();

		/**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PhcrFactory getPhcrFactory();

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
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.impl.PublicHealthCaseReportImpl <em>Public Health Case Report</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PublicHealthCaseReportImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrPackageImpl#getPublicHealthCaseReport()
     * @generated
     */
		EClass PUBLIC_HEALTH_CASE_REPORT = eINSTANCE.getPublicHealthCaseReport();
			/**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrSocialHistorySectionImpl <em>Social History Section</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrSocialHistorySectionImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrPackageImpl#getPhcrSocialHistorySection()
     * @generated
     */
		EClass PHCR_SOCIAL_HISTORY_SECTION = eINSTANCE.getPhcrSocialHistorySection();
			/**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.impl.GeotemporalHistoryObservationImpl <em>Geotemporal History Observation</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.impl.GeotemporalHistoryObservationImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrPackageImpl#getGeotemporalHistoryObservation()
     * @generated
     */
		EClass GEOTEMPORAL_HISTORY_OBSERVATION = eINSTANCE.getGeotemporalHistoryObservation();
			/**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.impl.MostRecentTimeArrivedInUSAObservationImpl <em>Most Recent Time Arrived In USA Observation</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.impl.MostRecentTimeArrivedInUSAObservationImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrPackageImpl#getMostRecentTimeArrivedInUSAObservation()
     * @generated
     */
		EClass MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION = eINSTANCE.getMostRecentTimeArrivedInUSAObservation();
			/**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.impl.RaceObservationImpl <em>Race Observation</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.impl.RaceObservationImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrPackageImpl#getRaceObservation()
     * @generated
     */
		EClass RACE_OBSERVATION = eINSTANCE.getRaceObservation();
			/**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.impl.OccupationObservationImpl <em>Occupation Observation</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.impl.OccupationObservationImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrPackageImpl#getOccupationObservation()
     * @generated
     */
		EClass OCCUPATION_OBSERVATION = eINSTANCE.getOccupationObservation();
			/**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.impl.PregnancyObservationImpl <em>Pregnancy Observation</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PregnancyObservationImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrPackageImpl#getPregnancyObservation()
     * @generated
     */
		EClass PREGNANCY_OBSERVATION = eINSTANCE.getPregnancyObservation();
			/**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.impl.EstimatedDateOfDeliveryObservationImpl <em>Estimated Date Of Delivery Observation</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.impl.EstimatedDateOfDeliveryObservationImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrPackageImpl#getEstimatedDateOfDeliveryObservation()
     * @generated
     */
		EClass ESTIMATED_DATE_OF_DELIVERY_OBSERVATION = eINSTANCE.getEstimatedDateOfDeliveryObservation();
			/**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrClinicalInformationSectionImpl <em>Clinical Information Section</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrClinicalInformationSectionImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrPackageImpl#getPhcrClinicalInformationSection()
     * @generated
     */
		EClass PHCR_CLINICAL_INFORMATION_SECTION = eINSTANCE.getPhcrClinicalInformationSection();
			/**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrTreatmentInformationSectionImpl <em>Treatment Information Section</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrTreatmentInformationSectionImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrPackageImpl#getPhcrTreatmentInformationSection()
     * @generated
     */
		EClass PHCR_TREATMENT_INFORMATION_SECTION = eINSTANCE.getPhcrTreatmentInformationSection();
			/**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.impl.TherapeuticRegimenActImpl <em>Therapeutic Regimen Act</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.impl.TherapeuticRegimenActImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrPackageImpl#getTherapeuticRegimenAct()
     * @generated
     */
		EClass THERAPEUTIC_REGIMEN_ACT = eINSTANCE.getTherapeuticRegimenAct();
			/**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrEncountersSectionImpl <em>Encounters Section</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrEncountersSectionImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrPackageImpl#getPhcrEncountersSection()
     * @generated
     */
		EClass PHCR_ENCOUNTERS_SECTION = eINSTANCE.getPhcrEncountersSection();
			/**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrRelevantDxTestsSectionImpl <em>Relevant Dx Tests Section</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrRelevantDxTestsSectionImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrPackageImpl#getPhcrRelevantDxTestsSection()
     * @generated
     */
		EClass PHCR_RELEVANT_DX_TESTS_SECTION = eINSTANCE.getPhcrRelevantDxTestsSection();
			/**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.impl.ResultOrganizerImpl <em>Result Organizer</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.impl.ResultOrganizerImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrPackageImpl#getResultOrganizer()
     * @generated
     */
		EClass RESULT_ORGANIZER = eINSTANCE.getResultOrganizer();
			/**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.impl.ResultObservationImpl <em>Result Observation</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.impl.ResultObservationImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrPackageImpl#getResultObservation()
     * @generated
     */
		EClass RESULT_OBSERVATION = eINSTANCE.getResultObservation();
			/**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.impl.SpecimenCollectionProcedureImpl <em>Specimen Collection Procedure</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.impl.SpecimenCollectionProcedureImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrPackageImpl#getSpecimenCollectionProcedure()
     * @generated
     */
		EClass SPECIMEN_COLLECTION_PROCEDURE = eINSTANCE.getSpecimenCollectionProcedure();
			/**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.impl.ImagingObservationImpl <em>Imaging Observation</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.impl.ImagingObservationImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrPackageImpl#getImagingObservation()
     * @generated
     */
		EClass IMAGING_OBSERVATION = eINSTANCE.getImagingObservation();
			/**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.impl.PatientConditionAliveObservationImpl <em>Patient Condition Alive Observation</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PatientConditionAliveObservationImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrPackageImpl#getPatientConditionAliveObservation()
     * @generated
     */
		EClass PATIENT_CONDITION_ALIVE_OBSERVATION = eINSTANCE.getPatientConditionAliveObservation();
			/**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.impl.PatientConditionDeceasedObservationImpl <em>Patient Condition Deceased Observation</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PatientConditionDeceasedObservationImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrPackageImpl#getPatientConditionDeceasedObservation()
     * @generated
     */
		EClass PATIENT_CONDITION_DECEASED_OBSERVATION = eINSTANCE.getPatientConditionDeceasedObservation();
			/**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrRelevantMedicalConditionHistoryObservationImpl <em>Relevant Medical Condition History Observation</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrRelevantMedicalConditionHistoryObservationImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrPackageImpl#getPhcrRelevantMedicalConditionHistoryObservation()
     * @generated
     */
		EClass PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION = eINSTANCE.getPhcrRelevantMedicalConditionHistoryObservation();
			/**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.impl.SignsAndSymptomsObservationImpl <em>Signs And Symptoms Observation</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.impl.SignsAndSymptomsObservationImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrPackageImpl#getSignsAndSymptomsObservation()
     * @generated
     */
		EClass SIGNS_AND_SYMPTOMS_OBSERVATION = eINSTANCE.getSignsAndSymptomsObservation();
			/**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.impl.SusceptibilityResultImpl <em>Susceptibility Result</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.impl.SusceptibilityResultImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrPackageImpl#getSusceptibilityResult()
     * @generated
     */
		EClass SUSCEPTIBILITY_RESULT = eINSTANCE.getSusceptibilityResult();
			/**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.impl.TreatmentGivenSubstanceAdministrationImpl <em>Treatment Given Substance Administration</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.impl.TreatmentGivenSubstanceAdministrationImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrPackageImpl#getTreatmentGivenSubstanceAdministration()
     * @generated
     */
		EClass TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION = eINSTANCE.getTreatmentGivenSubstanceAdministration();
			/**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.impl.TreatmentNotGivenSubstanceAdministrationImpl <em>Treatment Not Given Substance Administration</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.impl.TreatmentNotGivenSubstanceAdministrationImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrPackageImpl#getTreatmentNotGivenSubstanceAdministration()
     * @generated
     */
		EClass TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION = eINSTANCE.getTreatmentNotGivenSubstanceAdministration();
			/**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.impl.CaseObservationImpl <em>Case Observation</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.impl.CaseObservationImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrPackageImpl#getCaseObservation()
     * @generated
     */
		EClass CASE_OBSERVATION = eINSTANCE.getCaseObservation();

  }

} //PhcrPackage
