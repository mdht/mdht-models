/*******************************************************************************
 * Copyright (c) 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.emspcr;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.openhealthtools.mdht.uml.cda.CDAPackage;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

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
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory
 * @model kind="package"
 * @generated
 */
public interface EmspcrPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "emspcr";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.openhealthtools.org/mdht/uml/cda/emspcr";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "emspcr";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EmspcrPackage eINSTANCE = org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl.init();

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.emspcr.impl.PatientCareReportImpl <em>Patient Care Report</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.PatientCareReportImpl
   * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl#getPatientCareReport()
   * @generated
   */
  int PATIENT_CARE_REPORT = 0;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT_CARE_REPORT__REALM_CODE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT_CARE_REPORT__TYPE_ID = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT_CARE_REPORT__TEMPLATE_ID = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT_CARE_REPORT__ID = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT_CARE_REPORT__CODE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__CODE;

  /**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT_CARE_REPORT__TITLE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__TITLE;

  /**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT_CARE_REPORT__EFFECTIVE_TIME = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__EFFECTIVE_TIME;

  /**
   * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT_CARE_REPORT__CONFIDENTIALITY_CODE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__CONFIDENTIALITY_CODE;

  /**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT_CARE_REPORT__LANGUAGE_CODE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__LANGUAGE_CODE;

  /**
   * The feature id for the '<em><b>Set Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT_CARE_REPORT__SET_ID = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__SET_ID;

  /**
   * The feature id for the '<em><b>Version Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT_CARE_REPORT__VERSION_NUMBER = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__VERSION_NUMBER;

  /**
   * The feature id for the '<em><b>Copy Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT_CARE_REPORT__COPY_TIME = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__COPY_TIME;

  /**
   * The feature id for the '<em><b>Record Target</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT_CARE_REPORT__RECORD_TARGET = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__RECORD_TARGET;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT_CARE_REPORT__AUTHOR = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__AUTHOR;

  /**
   * The feature id for the '<em><b>Data Enterer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT_CARE_REPORT__DATA_ENTERER = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__DATA_ENTERER;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT_CARE_REPORT__INFORMANT = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__INFORMANT;

  /**
   * The feature id for the '<em><b>Custodian</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT_CARE_REPORT__CUSTODIAN = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__CUSTODIAN;

  /**
   * The feature id for the '<em><b>Information Recipient</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT_CARE_REPORT__INFORMATION_RECIPIENT = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__INFORMATION_RECIPIENT;

  /**
   * The feature id for the '<em><b>Legal Authenticator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT_CARE_REPORT__LEGAL_AUTHENTICATOR = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__LEGAL_AUTHENTICATOR;

  /**
   * The feature id for the '<em><b>Authenticator</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT_CARE_REPORT__AUTHENTICATOR = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__AUTHENTICATOR;

  /**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT_CARE_REPORT__PARTICIPANT = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__PARTICIPANT;

  /**
   * The feature id for the '<em><b>In Fulfillment Of</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT_CARE_REPORT__IN_FULFILLMENT_OF = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__IN_FULFILLMENT_OF;

  /**
   * The feature id for the '<em><b>Documentation Of</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT_CARE_REPORT__DOCUMENTATION_OF = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__DOCUMENTATION_OF;

  /**
   * The feature id for the '<em><b>Related Document</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT_CARE_REPORT__RELATED_DOCUMENT = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__RELATED_DOCUMENT;

  /**
   * The feature id for the '<em><b>Authorization</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT_CARE_REPORT__AUTHORIZATION = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__AUTHORIZATION;

  /**
   * The feature id for the '<em><b>Component Of</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT_CARE_REPORT__COMPONENT_OF = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__COMPONENT_OF;

  /**
   * The feature id for the '<em><b>Component</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT_CARE_REPORT__COMPONENT = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__COMPONENT;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT_CARE_REPORT__NULL_FLAVOR = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT_CARE_REPORT__CLASS_CODE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT_CARE_REPORT__MOOD_CODE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__MOOD_CODE;

  /**
   * The number of structural features of the '<em>Patient Care Report</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATIENT_CARE_REPORT_FEATURE_COUNT = ConsolPackage.GENERAL_HEADER_CONSTRAINTS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSBillingImpl <em>EMS Billing</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSBillingImpl
   * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl#getEMSBilling()
   * @generated
   */
  int EMS_BILLING = 1;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_BILLING__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_BILLING__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_BILLING__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_BILLING__ID = CDAPackage.SECTION__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_BILLING__CODE = CDAPackage.SECTION__CODE;

  /**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_BILLING__TITLE = CDAPackage.SECTION__TITLE;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_BILLING__TEXT = CDAPackage.SECTION__TEXT;

  /**
   * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_BILLING__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

  /**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_BILLING__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_BILLING__SUBJECT = CDAPackage.SECTION__SUBJECT;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_BILLING__AUTHOR = CDAPackage.SECTION__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_BILLING__INFORMANT = CDAPackage.SECTION__INFORMANT;

  /**
   * The feature id for the '<em><b>Entry</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_BILLING__ENTRY = CDAPackage.SECTION__ENTRY;

  /**
   * The feature id for the '<em><b>Component</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_BILLING__COMPONENT = CDAPackage.SECTION__COMPONENT;

  /**
   * The feature id for the '<em><b>Section Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_BILLING__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_BILLING__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_BILLING__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_BILLING__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

  /**
   * The number of structural features of the '<em>EMS Billing</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_BILLING_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSInjuryIncidentDescriptionImpl <em>EMS Injury Incident Description</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSInjuryIncidentDescriptionImpl
   * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl#getEMSInjuryIncidentDescription()
   * @generated
   */
  int EMS_INJURY_INCIDENT_DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_INJURY_INCIDENT_DESCRIPTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_INJURY_INCIDENT_DESCRIPTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_INJURY_INCIDENT_DESCRIPTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_INJURY_INCIDENT_DESCRIPTION__ID = CDAPackage.SECTION__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_INJURY_INCIDENT_DESCRIPTION__CODE = CDAPackage.SECTION__CODE;

  /**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_INJURY_INCIDENT_DESCRIPTION__TITLE = CDAPackage.SECTION__TITLE;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_INJURY_INCIDENT_DESCRIPTION__TEXT = CDAPackage.SECTION__TEXT;

  /**
   * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_INJURY_INCIDENT_DESCRIPTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

  /**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_INJURY_INCIDENT_DESCRIPTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_INJURY_INCIDENT_DESCRIPTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_INJURY_INCIDENT_DESCRIPTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_INJURY_INCIDENT_DESCRIPTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

  /**
   * The feature id for the '<em><b>Entry</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_INJURY_INCIDENT_DESCRIPTION__ENTRY = CDAPackage.SECTION__ENTRY;

  /**
   * The feature id for the '<em><b>Component</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_INJURY_INCIDENT_DESCRIPTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

  /**
   * The feature id for the '<em><b>Section Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_INJURY_INCIDENT_DESCRIPTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_INJURY_INCIDENT_DESCRIPTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_INJURY_INCIDENT_DESCRIPTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_INJURY_INCIDENT_DESCRIPTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

  /**
   * The number of structural features of the '<em>EMS Injury Incident Description</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_INJURY_INCIDENT_DESCRIPTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSCardiacArrestEventImpl <em>EMS Cardiac Arrest Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSCardiacArrestEventImpl
   * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl#getEMSCardiacArrestEvent()
   * @generated
   */
  int EMS_CARDIAC_ARREST_EVENT = 3;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_CARDIAC_ARREST_EVENT__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_CARDIAC_ARREST_EVENT__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_CARDIAC_ARREST_EVENT__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_CARDIAC_ARREST_EVENT__ID = CDAPackage.SECTION__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_CARDIAC_ARREST_EVENT__CODE = CDAPackage.SECTION__CODE;

  /**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_CARDIAC_ARREST_EVENT__TITLE = CDAPackage.SECTION__TITLE;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_CARDIAC_ARREST_EVENT__TEXT = CDAPackage.SECTION__TEXT;

  /**
   * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_CARDIAC_ARREST_EVENT__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

  /**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_CARDIAC_ARREST_EVENT__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_CARDIAC_ARREST_EVENT__SUBJECT = CDAPackage.SECTION__SUBJECT;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_CARDIAC_ARREST_EVENT__AUTHOR = CDAPackage.SECTION__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_CARDIAC_ARREST_EVENT__INFORMANT = CDAPackage.SECTION__INFORMANT;

  /**
   * The feature id for the '<em><b>Entry</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_CARDIAC_ARREST_EVENT__ENTRY = CDAPackage.SECTION__ENTRY;

  /**
   * The feature id for the '<em><b>Component</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_CARDIAC_ARREST_EVENT__COMPONENT = CDAPackage.SECTION__COMPONENT;

  /**
   * The feature id for the '<em><b>Section Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_CARDIAC_ARREST_EVENT__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_CARDIAC_ARREST_EVENT__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_CARDIAC_ARREST_EVENT__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_CARDIAC_ARREST_EVENT__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

  /**
   * The number of structural features of the '<em>EMS Cardiac Arrest Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_CARDIAC_ARREST_EVENT_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSAdvanceDirectivesImpl <em>EMS Advance Directives</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSAdvanceDirectivesImpl
   * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl#getEMSAdvanceDirectives()
   * @generated
   */
  int EMS_ADVANCE_DIRECTIVES = 4;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_ADVANCE_DIRECTIVES__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_ADVANCE_DIRECTIVES__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_ADVANCE_DIRECTIVES__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_ADVANCE_DIRECTIVES__ID = CDAPackage.SECTION__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_ADVANCE_DIRECTIVES__CODE = CDAPackage.SECTION__CODE;

  /**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_ADVANCE_DIRECTIVES__TITLE = CDAPackage.SECTION__TITLE;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_ADVANCE_DIRECTIVES__TEXT = CDAPackage.SECTION__TEXT;

  /**
   * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_ADVANCE_DIRECTIVES__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

  /**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_ADVANCE_DIRECTIVES__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_ADVANCE_DIRECTIVES__SUBJECT = CDAPackage.SECTION__SUBJECT;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_ADVANCE_DIRECTIVES__AUTHOR = CDAPackage.SECTION__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_ADVANCE_DIRECTIVES__INFORMANT = CDAPackage.SECTION__INFORMANT;

  /**
   * The feature id for the '<em><b>Entry</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_ADVANCE_DIRECTIVES__ENTRY = CDAPackage.SECTION__ENTRY;

  /**
   * The feature id for the '<em><b>Component</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_ADVANCE_DIRECTIVES__COMPONENT = CDAPackage.SECTION__COMPONENT;

  /**
   * The feature id for the '<em><b>Section Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_ADVANCE_DIRECTIVES__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_ADVANCE_DIRECTIVES__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_ADVANCE_DIRECTIVES__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_ADVANCE_DIRECTIVES__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

  /**
   * The number of structural features of the '<em>EMS Advance Directives</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_ADVANCE_DIRECTIVES_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSAllergiesAndAdverseReactionsImpl <em>EMS Allergies And Adverse Reactions</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSAllergiesAndAdverseReactionsImpl
   * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl#getEMSAllergiesAndAdverseReactions()
   * @generated
   */
  int EMS_ALLERGIES_AND_ADVERSE_REACTIONS = 5;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_ALLERGIES_AND_ADVERSE_REACTIONS__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_ALLERGIES_AND_ADVERSE_REACTIONS__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_ALLERGIES_AND_ADVERSE_REACTIONS__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_ALLERGIES_AND_ADVERSE_REACTIONS__ID = CDAPackage.SECTION__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_ALLERGIES_AND_ADVERSE_REACTIONS__CODE = CDAPackage.SECTION__CODE;

  /**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_ALLERGIES_AND_ADVERSE_REACTIONS__TITLE = CDAPackage.SECTION__TITLE;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_ALLERGIES_AND_ADVERSE_REACTIONS__TEXT = CDAPackage.SECTION__TEXT;

  /**
   * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_ALLERGIES_AND_ADVERSE_REACTIONS__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

  /**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_ALLERGIES_AND_ADVERSE_REACTIONS__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_ALLERGIES_AND_ADVERSE_REACTIONS__SUBJECT = CDAPackage.SECTION__SUBJECT;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_ALLERGIES_AND_ADVERSE_REACTIONS__AUTHOR = CDAPackage.SECTION__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_ALLERGIES_AND_ADVERSE_REACTIONS__INFORMANT = CDAPackage.SECTION__INFORMANT;

  /**
   * The feature id for the '<em><b>Entry</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_ALLERGIES_AND_ADVERSE_REACTIONS__ENTRY = CDAPackage.SECTION__ENTRY;

  /**
   * The feature id for the '<em><b>Component</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_ALLERGIES_AND_ADVERSE_REACTIONS__COMPONENT = CDAPackage.SECTION__COMPONENT;

  /**
   * The feature id for the '<em><b>Section Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_ALLERGIES_AND_ADVERSE_REACTIONS__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_ALLERGIES_AND_ADVERSE_REACTIONS__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_ALLERGIES_AND_ADVERSE_REACTIONS__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_ALLERGIES_AND_ADVERSE_REACTIONS__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

  /**
   * The number of structural features of the '<em>EMS Allergies And Adverse Reactions</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_ALLERGIES_AND_ADVERSE_REACTIONS_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSCurrentMedicationSectionImpl <em>EMS Current Medication Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSCurrentMedicationSectionImpl
   * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl#getEMSCurrentMedicationSection()
   * @generated
   */
  int EMS_CURRENT_MEDICATION_SECTION = 6;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_CURRENT_MEDICATION_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_CURRENT_MEDICATION_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_CURRENT_MEDICATION_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_CURRENT_MEDICATION_SECTION__ID = CDAPackage.SECTION__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_CURRENT_MEDICATION_SECTION__CODE = CDAPackage.SECTION__CODE;

  /**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_CURRENT_MEDICATION_SECTION__TITLE = CDAPackage.SECTION__TITLE;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_CURRENT_MEDICATION_SECTION__TEXT = CDAPackage.SECTION__TEXT;

  /**
   * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_CURRENT_MEDICATION_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

  /**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_CURRENT_MEDICATION_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_CURRENT_MEDICATION_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_CURRENT_MEDICATION_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_CURRENT_MEDICATION_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

  /**
   * The feature id for the '<em><b>Entry</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_CURRENT_MEDICATION_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

  /**
   * The feature id for the '<em><b>Component</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_CURRENT_MEDICATION_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

  /**
   * The feature id for the '<em><b>Section Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_CURRENT_MEDICATION_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_CURRENT_MEDICATION_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_CURRENT_MEDICATION_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_CURRENT_MEDICATION_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

  /**
   * The number of structural features of the '<em>EMS Current Medication Section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMS_CURRENT_MEDICATION_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport <em>Patient Care Report</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Patient Care Report</em>'.
   * @see org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport
   * @generated
   */
  EClass getPatientCareReport();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSBilling <em>EMS Billing</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EMS Billing</em>'.
   * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSBilling
   * @generated
   */
  EClass getEMSBilling();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescription <em>EMS Injury Incident Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EMS Injury Incident Description</em>'.
   * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescription
   * @generated
   */
  EClass getEMSInjuryIncidentDescription();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSCardiacArrestEvent <em>EMS Cardiac Arrest Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EMS Cardiac Arrest Event</em>'.
   * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSCardiacArrestEvent
   * @generated
   */
  EClass getEMSCardiacArrestEvent();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSAdvanceDirectives <em>EMS Advance Directives</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EMS Advance Directives</em>'.
   * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSAdvanceDirectives
   * @generated
   */
  EClass getEMSAdvanceDirectives();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSAllergiesAndAdverseReactions <em>EMS Allergies And Adverse Reactions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EMS Allergies And Adverse Reactions</em>'.
   * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSAllergiesAndAdverseReactions
   * @generated
   */
  EClass getEMSAllergiesAndAdverseReactions();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSCurrentMedicationSection <em>EMS Current Medication Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EMS Current Medication Section</em>'.
   * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSCurrentMedicationSection
   * @generated
   */
  EClass getEMSCurrentMedicationSection();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  EmspcrFactory getEmspcrFactory();

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
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.emspcr.impl.PatientCareReportImpl <em>Patient Care Report</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.PatientCareReportImpl
     * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl#getPatientCareReport()
     * @generated
     */
    EClass PATIENT_CARE_REPORT = eINSTANCE.getPatientCareReport();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSBillingImpl <em>EMS Billing</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSBillingImpl
     * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl#getEMSBilling()
     * @generated
     */
    EClass EMS_BILLING = eINSTANCE.getEMSBilling();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSInjuryIncidentDescriptionImpl <em>EMS Injury Incident Description</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSInjuryIncidentDescriptionImpl
     * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl#getEMSInjuryIncidentDescription()
     * @generated
     */
    EClass EMS_INJURY_INCIDENT_DESCRIPTION = eINSTANCE.getEMSInjuryIncidentDescription();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSCardiacArrestEventImpl <em>EMS Cardiac Arrest Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSCardiacArrestEventImpl
     * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl#getEMSCardiacArrestEvent()
     * @generated
     */
    EClass EMS_CARDIAC_ARREST_EVENT = eINSTANCE.getEMSCardiacArrestEvent();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSAdvanceDirectivesImpl <em>EMS Advance Directives</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSAdvanceDirectivesImpl
     * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl#getEMSAdvanceDirectives()
     * @generated
     */
    EClass EMS_ADVANCE_DIRECTIVES = eINSTANCE.getEMSAdvanceDirectives();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSAllergiesAndAdverseReactionsImpl <em>EMS Allergies And Adverse Reactions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSAllergiesAndAdverseReactionsImpl
     * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl#getEMSAllergiesAndAdverseReactions()
     * @generated
     */
    EClass EMS_ALLERGIES_AND_ADVERSE_REACTIONS = eINSTANCE.getEMSAllergiesAndAdverseReactions();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSCurrentMedicationSectionImpl <em>EMS Current Medication Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EMSCurrentMedicationSectionImpl
     * @see org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrPackageImpl#getEMSCurrentMedicationSection()
     * @generated
     */
    EClass EMS_CURRENT_MEDICATION_SECTION = eINSTANCE.getEMSCurrentMedicationSection();

  }

} //EmspcrPackage
