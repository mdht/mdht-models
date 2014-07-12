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
package org.openhealthtools.mdht.uml.cda.phcr.pertussis;

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
 * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisFactory
 * @model kind="package"
 *        annotation="http://www.openhealthtools.org/mdht/uml initializers='org.openhealthtools.mdht.uml.cda.phcr.pertussis'"
 * @generated
 */
public interface PertussisPackage extends EPackage
{
  /**
     * The package name.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  String eNAME = "pertussis";

  /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  String eNS_URI = "http://www.openhealthtools.org/mdht/uml/cda/phcr/pertussis";

  /**
     * The package namespace name.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  String eNS_PREFIX = "pertussis";

  /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  PertussisPackage eINSTANCE = org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisPackageImpl.init();

  /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisCaseReportImpl <em>Case Report</em>}' class.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisCaseReportImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisPackageImpl#getPertussisCaseReport()
     * @generated
     */
  int PERTUSSIS_CASE_REPORT = 0;

  /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int PERTUSSIS_CASE_REPORT__REALM_CODE = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__REALM_CODE;

  /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int PERTUSSIS_CASE_REPORT__TYPE_ID = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__TYPE_ID;

  /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int PERTUSSIS_CASE_REPORT__TEMPLATE_ID = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__TEMPLATE_ID;

  /**
     * The feature id for the '<em><b>Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int PERTUSSIS_CASE_REPORT__ID = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__ID;

  /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int PERTUSSIS_CASE_REPORT__CODE = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__CODE;

  /**
     * The feature id for the '<em><b>Title</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int PERTUSSIS_CASE_REPORT__TITLE = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__TITLE;

  /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int PERTUSSIS_CASE_REPORT__EFFECTIVE_TIME = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__EFFECTIVE_TIME;

  /**
     * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int PERTUSSIS_CASE_REPORT__CONFIDENTIALITY_CODE = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__CONFIDENTIALITY_CODE;

  /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int PERTUSSIS_CASE_REPORT__LANGUAGE_CODE = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__LANGUAGE_CODE;

  /**
     * The feature id for the '<em><b>Set Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int PERTUSSIS_CASE_REPORT__SET_ID = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__SET_ID;

  /**
     * The feature id for the '<em><b>Version Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int PERTUSSIS_CASE_REPORT__VERSION_NUMBER = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__VERSION_NUMBER;

  /**
     * The feature id for the '<em><b>Copy Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int PERTUSSIS_CASE_REPORT__COPY_TIME = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__COPY_TIME;

  /**
     * The feature id for the '<em><b>Record Target</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int PERTUSSIS_CASE_REPORT__RECORD_TARGET = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__RECORD_TARGET;

  /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int PERTUSSIS_CASE_REPORT__AUTHOR = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__AUTHOR;

  /**
     * The feature id for the '<em><b>Data Enterer</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int PERTUSSIS_CASE_REPORT__DATA_ENTERER = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__DATA_ENTERER;

  /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int PERTUSSIS_CASE_REPORT__INFORMANT = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__INFORMANT;

  /**
     * The feature id for the '<em><b>Custodian</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int PERTUSSIS_CASE_REPORT__CUSTODIAN = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__CUSTODIAN;

  /**
     * The feature id for the '<em><b>Information Recipient</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int PERTUSSIS_CASE_REPORT__INFORMATION_RECIPIENT = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__INFORMATION_RECIPIENT;

  /**
     * The feature id for the '<em><b>Legal Authenticator</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int PERTUSSIS_CASE_REPORT__LEGAL_AUTHENTICATOR = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__LEGAL_AUTHENTICATOR;

  /**
     * The feature id for the '<em><b>Authenticator</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int PERTUSSIS_CASE_REPORT__AUTHENTICATOR = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__AUTHENTICATOR;

  /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int PERTUSSIS_CASE_REPORT__PARTICIPANT = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__PARTICIPANT;

  /**
     * The feature id for the '<em><b>In Fulfillment Of</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int PERTUSSIS_CASE_REPORT__IN_FULFILLMENT_OF = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__IN_FULFILLMENT_OF;

  /**
     * The feature id for the '<em><b>Documentation Of</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int PERTUSSIS_CASE_REPORT__DOCUMENTATION_OF = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__DOCUMENTATION_OF;

  /**
     * The feature id for the '<em><b>Related Document</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int PERTUSSIS_CASE_REPORT__RELATED_DOCUMENT = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__RELATED_DOCUMENT;

  /**
     * The feature id for the '<em><b>Authorization</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int PERTUSSIS_CASE_REPORT__AUTHORIZATION = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__AUTHORIZATION;

  /**
     * The feature id for the '<em><b>Component Of</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int PERTUSSIS_CASE_REPORT__COMPONENT_OF = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__COMPONENT_OF;

  /**
     * The feature id for the '<em><b>Component</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int PERTUSSIS_CASE_REPORT__COMPONENT = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__COMPONENT;

  /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int PERTUSSIS_CASE_REPORT__NULL_FLAVOR = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__NULL_FLAVOR;

  /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int PERTUSSIS_CASE_REPORT__CLASS_CODE = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__CLASS_CODE;

  /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int PERTUSSIS_CASE_REPORT__MOOD_CODE = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__MOOD_CODE;

  /**
     * The number of structural features of the '<em>Case Report</em>' class.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int PERTUSSIS_CASE_REPORT_FEATURE_COUNT = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT_FEATURE_COUNT + 0;


  /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisSocialHistorySectionImpl <em>Social History Section</em>}' class.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisSocialHistorySectionImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisPackageImpl#getPertussisSocialHistorySection()
     * @generated
     */
  int PERTUSSIS_SOCIAL_HISTORY_SECTION = 1;

  /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int PERTUSSIS_SOCIAL_HISTORY_SECTION__REALM_CODE = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__REALM_CODE;

  /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int PERTUSSIS_SOCIAL_HISTORY_SECTION__TYPE_ID = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__TYPE_ID;

  /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int PERTUSSIS_SOCIAL_HISTORY_SECTION__TEMPLATE_ID = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__TEMPLATE_ID;

  /**
     * The feature id for the '<em><b>Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int PERTUSSIS_SOCIAL_HISTORY_SECTION__ID = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__ID;

  /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int PERTUSSIS_SOCIAL_HISTORY_SECTION__CODE = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__CODE;

  /**
     * The feature id for the '<em><b>Title</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int PERTUSSIS_SOCIAL_HISTORY_SECTION__TITLE = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__TITLE;

  /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int PERTUSSIS_SOCIAL_HISTORY_SECTION__TEXT = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__TEXT;

  /**
     * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int PERTUSSIS_SOCIAL_HISTORY_SECTION__CONFIDENTIALITY_CODE = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__CONFIDENTIALITY_CODE;

  /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int PERTUSSIS_SOCIAL_HISTORY_SECTION__LANGUAGE_CODE = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__LANGUAGE_CODE;

  /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int PERTUSSIS_SOCIAL_HISTORY_SECTION__SUBJECT = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__SUBJECT;

  /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int PERTUSSIS_SOCIAL_HISTORY_SECTION__AUTHOR = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__AUTHOR;

  /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int PERTUSSIS_SOCIAL_HISTORY_SECTION__INFORMANT = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__INFORMANT;

  /**
     * The feature id for the '<em><b>Entry</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int PERTUSSIS_SOCIAL_HISTORY_SECTION__ENTRY = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__ENTRY;

  /**
     * The feature id for the '<em><b>Component</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int PERTUSSIS_SOCIAL_HISTORY_SECTION__COMPONENT = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__COMPONENT;

  /**
     * The feature id for the '<em><b>Section Id</b></em>' attribute.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int PERTUSSIS_SOCIAL_HISTORY_SECTION__SECTION_ID = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__SECTION_ID;

  /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int PERTUSSIS_SOCIAL_HISTORY_SECTION__NULL_FLAVOR = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__NULL_FLAVOR;

  /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int PERTUSSIS_SOCIAL_HISTORY_SECTION__CLASS_CODE = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__CLASS_CODE;

  /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int PERTUSSIS_SOCIAL_HISTORY_SECTION__MOOD_CODE = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__MOOD_CODE;

  /**
     * The number of structural features of the '<em>Social History Section</em>' class.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int PERTUSSIS_SOCIAL_HISTORY_SECTION_FEATURE_COUNT = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION_FEATURE_COUNT + 0;

  /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisPossibleExposureLocationActImpl <em>Possible Exposure Location Act</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisPossibleExposureLocationActImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisPackageImpl#getPertussisPossibleExposureLocationAct()
     * @generated
     */
	int PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT = 2;

		/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT__REALM_CODE = CDAPackage.ACT__REALM_CODE;

		/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT__TYPE_ID = CDAPackage.ACT__TYPE_ID;

		/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT__TEMPLATE_ID = CDAPackage.ACT__TEMPLATE_ID;

		/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT__ID = CDAPackage.ACT__ID;

		/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT__CODE = CDAPackage.ACT__CODE;

		/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT__TEXT = CDAPackage.ACT__TEXT;

		/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT__STATUS_CODE = CDAPackage.ACT__STATUS_CODE;

		/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT__EFFECTIVE_TIME = CDAPackage.ACT__EFFECTIVE_TIME;

		/**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT__PRIORITY_CODE = CDAPackage.ACT__PRIORITY_CODE;

		/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT__LANGUAGE_CODE = CDAPackage.ACT__LANGUAGE_CODE;

		/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT__SUBJECT = CDAPackage.ACT__SUBJECT;

		/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT__SPECIMEN = CDAPackage.ACT__SPECIMEN;

		/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT__PERFORMER = CDAPackage.ACT__PERFORMER;

		/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT__AUTHOR = CDAPackage.ACT__AUTHOR;

		/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT__INFORMANT = CDAPackage.ACT__INFORMANT;

		/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT__PARTICIPANT = CDAPackage.ACT__PARTICIPANT;

		/**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT__ENTRY_RELATIONSHIP = CDAPackage.ACT__ENTRY_RELATIONSHIP;

		/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT__REFERENCE = CDAPackage.ACT__REFERENCE;

		/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT__PRECONDITION = CDAPackage.ACT__PRECONDITION;

		/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT__NULL_FLAVOR = CDAPackage.ACT__NULL_FLAVOR;

		/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT__CLASS_CODE = CDAPackage.ACT__CLASS_CODE;

		/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT__MOOD_CODE = CDAPackage.ACT__MOOD_CODE;

		/**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT__NEGATION_IND = CDAPackage.ACT__NEGATION_IND;

		/**
     * The number of structural features of the '<em>Possible Exposure Location Act</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_FEATURE_COUNT = CDAPackage.ACT_FEATURE_COUNT + 0;

		/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisPossibleCaseContactLocationActImpl <em>Possible Case Contact Location Act</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisPossibleCaseContactLocationActImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisPackageImpl#getPertussisPossibleCaseContactLocationAct()
     * @generated
     */
	int PERTUSSIS_POSSIBLE_CASE_CONTACT_LOCATION_ACT = 3;

		/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_POSSIBLE_CASE_CONTACT_LOCATION_ACT__REALM_CODE = CDAPackage.ACT__REALM_CODE;

		/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_POSSIBLE_CASE_CONTACT_LOCATION_ACT__TYPE_ID = CDAPackage.ACT__TYPE_ID;

		/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_POSSIBLE_CASE_CONTACT_LOCATION_ACT__TEMPLATE_ID = CDAPackage.ACT__TEMPLATE_ID;

		/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_POSSIBLE_CASE_CONTACT_LOCATION_ACT__ID = CDAPackage.ACT__ID;

		/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_POSSIBLE_CASE_CONTACT_LOCATION_ACT__CODE = CDAPackage.ACT__CODE;

		/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_POSSIBLE_CASE_CONTACT_LOCATION_ACT__TEXT = CDAPackage.ACT__TEXT;

		/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_POSSIBLE_CASE_CONTACT_LOCATION_ACT__STATUS_CODE = CDAPackage.ACT__STATUS_CODE;

		/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_POSSIBLE_CASE_CONTACT_LOCATION_ACT__EFFECTIVE_TIME = CDAPackage.ACT__EFFECTIVE_TIME;

		/**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_POSSIBLE_CASE_CONTACT_LOCATION_ACT__PRIORITY_CODE = CDAPackage.ACT__PRIORITY_CODE;

		/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_POSSIBLE_CASE_CONTACT_LOCATION_ACT__LANGUAGE_CODE = CDAPackage.ACT__LANGUAGE_CODE;

		/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_POSSIBLE_CASE_CONTACT_LOCATION_ACT__SUBJECT = CDAPackage.ACT__SUBJECT;

		/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_POSSIBLE_CASE_CONTACT_LOCATION_ACT__SPECIMEN = CDAPackage.ACT__SPECIMEN;

		/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_POSSIBLE_CASE_CONTACT_LOCATION_ACT__PERFORMER = CDAPackage.ACT__PERFORMER;

		/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_POSSIBLE_CASE_CONTACT_LOCATION_ACT__AUTHOR = CDAPackage.ACT__AUTHOR;

		/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_POSSIBLE_CASE_CONTACT_LOCATION_ACT__INFORMANT = CDAPackage.ACT__INFORMANT;

		/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_POSSIBLE_CASE_CONTACT_LOCATION_ACT__PARTICIPANT = CDAPackage.ACT__PARTICIPANT;

		/**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_POSSIBLE_CASE_CONTACT_LOCATION_ACT__ENTRY_RELATIONSHIP = CDAPackage.ACT__ENTRY_RELATIONSHIP;

		/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_POSSIBLE_CASE_CONTACT_LOCATION_ACT__REFERENCE = CDAPackage.ACT__REFERENCE;

		/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_POSSIBLE_CASE_CONTACT_LOCATION_ACT__PRECONDITION = CDAPackage.ACT__PRECONDITION;

		/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_POSSIBLE_CASE_CONTACT_LOCATION_ACT__NULL_FLAVOR = CDAPackage.ACT__NULL_FLAVOR;

		/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_POSSIBLE_CASE_CONTACT_LOCATION_ACT__CLASS_CODE = CDAPackage.ACT__CLASS_CODE;

		/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_POSSIBLE_CASE_CONTACT_LOCATION_ACT__MOOD_CODE = CDAPackage.ACT__MOOD_CODE;

		/**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_POSSIBLE_CASE_CONTACT_LOCATION_ACT__NEGATION_IND = CDAPackage.ACT__NEGATION_IND;

		/**
     * The number of structural features of the '<em>Possible Case Contact Location Act</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_POSSIBLE_CASE_CONTACT_LOCATION_ACT_FEATURE_COUNT = CDAPackage.ACT_FEATURE_COUNT + 0;

		/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisClinicalInformationSectionImpl <em>Clinical Information Section</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisClinicalInformationSectionImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisPackageImpl#getPertussisClinicalInformationSection()
     * @generated
     */
	int PERTUSSIS_CLINICAL_INFORMATION_SECTION = 4;

		/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_CLINICAL_INFORMATION_SECTION__REALM_CODE = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__REALM_CODE;

		/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_CLINICAL_INFORMATION_SECTION__TYPE_ID = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__TYPE_ID;

		/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_CLINICAL_INFORMATION_SECTION__TEMPLATE_ID = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__TEMPLATE_ID;

		/**
     * The feature id for the '<em><b>Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_CLINICAL_INFORMATION_SECTION__ID = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__ID;

		/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_CLINICAL_INFORMATION_SECTION__CODE = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__CODE;

		/**
     * The feature id for the '<em><b>Title</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_CLINICAL_INFORMATION_SECTION__TITLE = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__TITLE;

		/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_CLINICAL_INFORMATION_SECTION__TEXT = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__TEXT;

		/**
     * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_CLINICAL_INFORMATION_SECTION__CONFIDENTIALITY_CODE = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__CONFIDENTIALITY_CODE;

		/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_CLINICAL_INFORMATION_SECTION__LANGUAGE_CODE = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__LANGUAGE_CODE;

		/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_CLINICAL_INFORMATION_SECTION__SUBJECT = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__SUBJECT;

		/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_CLINICAL_INFORMATION_SECTION__AUTHOR = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__AUTHOR;

		/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_CLINICAL_INFORMATION_SECTION__INFORMANT = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__INFORMANT;

		/**
     * The feature id for the '<em><b>Entry</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_CLINICAL_INFORMATION_SECTION__ENTRY = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__ENTRY;

		/**
     * The feature id for the '<em><b>Component</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_CLINICAL_INFORMATION_SECTION__COMPONENT = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__COMPONENT;

		/**
     * The feature id for the '<em><b>Section Id</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_CLINICAL_INFORMATION_SECTION__SECTION_ID = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__SECTION_ID;

		/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_CLINICAL_INFORMATION_SECTION__NULL_FLAVOR = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__NULL_FLAVOR;

		/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_CLINICAL_INFORMATION_SECTION__CLASS_CODE = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__CLASS_CODE;

		/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_CLINICAL_INFORMATION_SECTION__MOOD_CODE = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__MOOD_CODE;

		/**
     * The number of structural features of the '<em>Clinical Information Section</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_CLINICAL_INFORMATION_SECTION_FEATURE_COUNT = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION_FEATURE_COUNT + 0;

		/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisTreatmentInformationSectionImpl <em>Treatment Information Section</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisTreatmentInformationSectionImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisPackageImpl#getPertussisTreatmentInformationSection()
     * @generated
     */
	int PERTUSSIS_TREATMENT_INFORMATION_SECTION = 7;

		/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisTherapeuticRegimenActImpl <em>Therapeutic Regimen Act</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisTherapeuticRegimenActImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisPackageImpl#getPertussisTherapeuticRegimenAct()
     * @generated
     */
	int PERTUSSIS_THERAPEUTIC_REGIMEN_ACT = 8;

		/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisTreatmentGivenSubstanceAdministrationImpl <em>Treatment Given Substance Administration</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisTreatmentGivenSubstanceAdministrationImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisPackageImpl#getPertussisTreatmentGivenSubstanceAdministration()
     * @generated
     */
	int PERTUSSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION = 9;

		/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisTreatmentNotGivenSubstanceAdministrationImpl <em>Treatment Not Given Substance Administration</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisTreatmentNotGivenSubstanceAdministrationImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisPackageImpl#getPertussisTreatmentNotGivenSubstanceAdministration()
     * @generated
     */
	int PERTUSSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION = 10;

		/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisImmunizationsSectionImpl <em>Immunizations Section</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisImmunizationsSectionImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisPackageImpl#getPertussisImmunizationsSection()
     * @generated
     */
	int PERTUSSIS_IMMUNIZATIONS_SECTION = 14;

		/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisImmunizationActivityImpl <em>Immunization Activity</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisImmunizationActivityImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisPackageImpl#getPertussisImmunizationActivity()
     * @generated
     */
	int PERTUSSIS_IMMUNIZATION_ACTIVITY = 15;

		/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisCaseObservationImpl <em>Case Observation</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisCaseObservationImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisPackageImpl#getPertussisCaseObservation()
     * @generated
     */
	int PERTUSSIS_CASE_OBSERVATION = 5;

		/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_CASE_OBSERVATION__REALM_CODE = PhcrPackage.CASE_OBSERVATION__REALM_CODE;

		/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_CASE_OBSERVATION__TYPE_ID = PhcrPackage.CASE_OBSERVATION__TYPE_ID;

		/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_CASE_OBSERVATION__TEMPLATE_ID = PhcrPackage.CASE_OBSERVATION__TEMPLATE_ID;

		/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_CASE_OBSERVATION__ID = PhcrPackage.CASE_OBSERVATION__ID;

		/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_CASE_OBSERVATION__CODE = PhcrPackage.CASE_OBSERVATION__CODE;

		/**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_CASE_OBSERVATION__DERIVATION_EXPR = PhcrPackage.CASE_OBSERVATION__DERIVATION_EXPR;

		/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_CASE_OBSERVATION__TEXT = PhcrPackage.CASE_OBSERVATION__TEXT;

		/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_CASE_OBSERVATION__STATUS_CODE = PhcrPackage.CASE_OBSERVATION__STATUS_CODE;

		/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_CASE_OBSERVATION__EFFECTIVE_TIME = PhcrPackage.CASE_OBSERVATION__EFFECTIVE_TIME;

		/**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_CASE_OBSERVATION__PRIORITY_CODE = PhcrPackage.CASE_OBSERVATION__PRIORITY_CODE;

		/**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_CASE_OBSERVATION__REPEAT_NUMBER = PhcrPackage.CASE_OBSERVATION__REPEAT_NUMBER;

		/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_CASE_OBSERVATION__LANGUAGE_CODE = PhcrPackage.CASE_OBSERVATION__LANGUAGE_CODE;

		/**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_CASE_OBSERVATION__VALUE = PhcrPackage.CASE_OBSERVATION__VALUE;

		/**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_CASE_OBSERVATION__INTERPRETATION_CODE = PhcrPackage.CASE_OBSERVATION__INTERPRETATION_CODE;

		/**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_CASE_OBSERVATION__METHOD_CODE = PhcrPackage.CASE_OBSERVATION__METHOD_CODE;

		/**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_CASE_OBSERVATION__TARGET_SITE_CODE = PhcrPackage.CASE_OBSERVATION__TARGET_SITE_CODE;

		/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_CASE_OBSERVATION__SUBJECT = PhcrPackage.CASE_OBSERVATION__SUBJECT;

		/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_CASE_OBSERVATION__SPECIMEN = PhcrPackage.CASE_OBSERVATION__SPECIMEN;

		/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_CASE_OBSERVATION__PERFORMER = PhcrPackage.CASE_OBSERVATION__PERFORMER;

		/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_CASE_OBSERVATION__AUTHOR = PhcrPackage.CASE_OBSERVATION__AUTHOR;

		/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_CASE_OBSERVATION__INFORMANT = PhcrPackage.CASE_OBSERVATION__INFORMANT;

		/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_CASE_OBSERVATION__PARTICIPANT = PhcrPackage.CASE_OBSERVATION__PARTICIPANT;

		/**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_CASE_OBSERVATION__ENTRY_RELATIONSHIP = PhcrPackage.CASE_OBSERVATION__ENTRY_RELATIONSHIP;

		/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_CASE_OBSERVATION__REFERENCE = PhcrPackage.CASE_OBSERVATION__REFERENCE;

		/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_CASE_OBSERVATION__PRECONDITION = PhcrPackage.CASE_OBSERVATION__PRECONDITION;

		/**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_CASE_OBSERVATION__REFERENCE_RANGE = PhcrPackage.CASE_OBSERVATION__REFERENCE_RANGE;

		/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_CASE_OBSERVATION__NULL_FLAVOR = PhcrPackage.CASE_OBSERVATION__NULL_FLAVOR;

		/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_CASE_OBSERVATION__CLASS_CODE = PhcrPackage.CASE_OBSERVATION__CLASS_CODE;

		/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_CASE_OBSERVATION__MOOD_CODE = PhcrPackage.CASE_OBSERVATION__MOOD_CODE;

		/**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_CASE_OBSERVATION__NEGATION_IND = PhcrPackage.CASE_OBSERVATION__NEGATION_IND;

		/**
     * The number of structural features of the '<em>Case Observation</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_CASE_OBSERVATION_FEATURE_COUNT = PhcrPackage.CASE_OBSERVATION_FEATURE_COUNT + 0;

		/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisSignsAndSymptomsObservationImpl <em>Signs And Symptoms Observation</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisSignsAndSymptomsObservationImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisPackageImpl#getPertussisSignsAndSymptomsObservation()
     * @generated
     */
	int PERTUSSIS_SIGNS_AND_SYMPTOMS_OBSERVATION = 6;

		/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_SIGNS_AND_SYMPTOMS_OBSERVATION__REALM_CODE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__REALM_CODE;

		/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_SIGNS_AND_SYMPTOMS_OBSERVATION__TYPE_ID = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__TYPE_ID;

		/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_SIGNS_AND_SYMPTOMS_OBSERVATION__TEMPLATE_ID = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__TEMPLATE_ID;

		/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_SIGNS_AND_SYMPTOMS_OBSERVATION__ID = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__ID;

		/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_SIGNS_AND_SYMPTOMS_OBSERVATION__CODE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__CODE;

		/**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_SIGNS_AND_SYMPTOMS_OBSERVATION__DERIVATION_EXPR = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__DERIVATION_EXPR;

		/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_SIGNS_AND_SYMPTOMS_OBSERVATION__TEXT = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__TEXT;

		/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_SIGNS_AND_SYMPTOMS_OBSERVATION__STATUS_CODE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__STATUS_CODE;

		/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_SIGNS_AND_SYMPTOMS_OBSERVATION__EFFECTIVE_TIME = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__EFFECTIVE_TIME;

		/**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_SIGNS_AND_SYMPTOMS_OBSERVATION__PRIORITY_CODE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__PRIORITY_CODE;

		/**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_SIGNS_AND_SYMPTOMS_OBSERVATION__REPEAT_NUMBER = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__REPEAT_NUMBER;

		/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_SIGNS_AND_SYMPTOMS_OBSERVATION__LANGUAGE_CODE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__LANGUAGE_CODE;

		/**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_SIGNS_AND_SYMPTOMS_OBSERVATION__VALUE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__VALUE;

		/**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_SIGNS_AND_SYMPTOMS_OBSERVATION__INTERPRETATION_CODE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__INTERPRETATION_CODE;

		/**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_SIGNS_AND_SYMPTOMS_OBSERVATION__METHOD_CODE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__METHOD_CODE;

		/**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_SIGNS_AND_SYMPTOMS_OBSERVATION__TARGET_SITE_CODE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__TARGET_SITE_CODE;

		/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_SIGNS_AND_SYMPTOMS_OBSERVATION__SUBJECT = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__SUBJECT;

		/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_SIGNS_AND_SYMPTOMS_OBSERVATION__SPECIMEN = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__SPECIMEN;

		/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_SIGNS_AND_SYMPTOMS_OBSERVATION__PERFORMER = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__PERFORMER;

		/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_SIGNS_AND_SYMPTOMS_OBSERVATION__AUTHOR = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__AUTHOR;

		/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_SIGNS_AND_SYMPTOMS_OBSERVATION__INFORMANT = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__INFORMANT;

		/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_SIGNS_AND_SYMPTOMS_OBSERVATION__PARTICIPANT = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__PARTICIPANT;

		/**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_SIGNS_AND_SYMPTOMS_OBSERVATION__ENTRY_RELATIONSHIP = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__ENTRY_RELATIONSHIP;

		/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_SIGNS_AND_SYMPTOMS_OBSERVATION__REFERENCE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__REFERENCE;

		/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_SIGNS_AND_SYMPTOMS_OBSERVATION__PRECONDITION = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__PRECONDITION;

		/**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_SIGNS_AND_SYMPTOMS_OBSERVATION__REFERENCE_RANGE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__REFERENCE_RANGE;

		/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_SIGNS_AND_SYMPTOMS_OBSERVATION__NULL_FLAVOR = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__NULL_FLAVOR;

		/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_SIGNS_AND_SYMPTOMS_OBSERVATION__CLASS_CODE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__CLASS_CODE;

		/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_SIGNS_AND_SYMPTOMS_OBSERVATION__MOOD_CODE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__MOOD_CODE;

		/**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_SIGNS_AND_SYMPTOMS_OBSERVATION__NEGATION_IND = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__NEGATION_IND;

		/**
     * The number of structural features of the '<em>Signs And Symptoms Observation</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_SIGNS_AND_SYMPTOMS_OBSERVATION_FEATURE_COUNT = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION_FEATURE_COUNT + 0;

		/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_INFORMATION_SECTION__REALM_CODE = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__REALM_CODE;

		/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_INFORMATION_SECTION__TYPE_ID = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__TYPE_ID;

		/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_INFORMATION_SECTION__TEMPLATE_ID = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__TEMPLATE_ID;

		/**
     * The feature id for the '<em><b>Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_INFORMATION_SECTION__ID = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__ID;

		/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_INFORMATION_SECTION__CODE = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__CODE;

		/**
     * The feature id for the '<em><b>Title</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_INFORMATION_SECTION__TITLE = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__TITLE;

		/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_INFORMATION_SECTION__TEXT = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__TEXT;

		/**
     * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_INFORMATION_SECTION__CONFIDENTIALITY_CODE = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__CONFIDENTIALITY_CODE;

		/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_INFORMATION_SECTION__LANGUAGE_CODE = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__LANGUAGE_CODE;

		/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_INFORMATION_SECTION__SUBJECT = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__SUBJECT;

		/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_INFORMATION_SECTION__AUTHOR = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__AUTHOR;

		/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_INFORMATION_SECTION__INFORMANT = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__INFORMANT;

		/**
     * The feature id for the '<em><b>Entry</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_INFORMATION_SECTION__ENTRY = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__ENTRY;

		/**
     * The feature id for the '<em><b>Component</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_INFORMATION_SECTION__COMPONENT = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__COMPONENT;

		/**
     * The feature id for the '<em><b>Section Id</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_INFORMATION_SECTION__SECTION_ID = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__SECTION_ID;

		/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_INFORMATION_SECTION__NULL_FLAVOR = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__NULL_FLAVOR;

		/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_INFORMATION_SECTION__CLASS_CODE = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__CLASS_CODE;

		/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_INFORMATION_SECTION__MOOD_CODE = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__MOOD_CODE;

		/**
     * The number of structural features of the '<em>Treatment Information Section</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_INFORMATION_SECTION_FEATURE_COUNT = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION_FEATURE_COUNT + 0;

		/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_THERAPEUTIC_REGIMEN_ACT__REALM_CODE = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__REALM_CODE;

		/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_THERAPEUTIC_REGIMEN_ACT__TYPE_ID = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__TYPE_ID;

		/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_THERAPEUTIC_REGIMEN_ACT__TEMPLATE_ID = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__TEMPLATE_ID;

		/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_THERAPEUTIC_REGIMEN_ACT__ID = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__ID;

		/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_THERAPEUTIC_REGIMEN_ACT__CODE = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__CODE;

		/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_THERAPEUTIC_REGIMEN_ACT__TEXT = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__TEXT;

		/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_THERAPEUTIC_REGIMEN_ACT__STATUS_CODE = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__STATUS_CODE;

		/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_THERAPEUTIC_REGIMEN_ACT__EFFECTIVE_TIME = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__EFFECTIVE_TIME;

		/**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_THERAPEUTIC_REGIMEN_ACT__PRIORITY_CODE = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__PRIORITY_CODE;

		/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_THERAPEUTIC_REGIMEN_ACT__LANGUAGE_CODE = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__LANGUAGE_CODE;

		/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_THERAPEUTIC_REGIMEN_ACT__SUBJECT = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__SUBJECT;

		/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_THERAPEUTIC_REGIMEN_ACT__SPECIMEN = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__SPECIMEN;

		/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_THERAPEUTIC_REGIMEN_ACT__PERFORMER = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__PERFORMER;

		/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_THERAPEUTIC_REGIMEN_ACT__AUTHOR = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__AUTHOR;

		/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_THERAPEUTIC_REGIMEN_ACT__INFORMANT = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__INFORMANT;

		/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_THERAPEUTIC_REGIMEN_ACT__PARTICIPANT = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__PARTICIPANT;

		/**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_THERAPEUTIC_REGIMEN_ACT__ENTRY_RELATIONSHIP = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__ENTRY_RELATIONSHIP;

		/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_THERAPEUTIC_REGIMEN_ACT__REFERENCE = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__REFERENCE;

		/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_THERAPEUTIC_REGIMEN_ACT__PRECONDITION = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__PRECONDITION;

		/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_THERAPEUTIC_REGIMEN_ACT__NULL_FLAVOR = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__NULL_FLAVOR;

		/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_THERAPEUTIC_REGIMEN_ACT__CLASS_CODE = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__CLASS_CODE;

		/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_THERAPEUTIC_REGIMEN_ACT__MOOD_CODE = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__MOOD_CODE;

		/**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_THERAPEUTIC_REGIMEN_ACT__NEGATION_IND = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__NEGATION_IND;

		/**
     * The number of structural features of the '<em>Therapeutic Regimen Act</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_THERAPEUTIC_REGIMEN_ACT_FEATURE_COUNT = PhcrPackage.THERAPEUTIC_REGIMEN_ACT_FEATURE_COUNT + 0;

		/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__REALM_CODE = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__REALM_CODE;

		/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__TYPE_ID = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__TYPE_ID;

		/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__TEMPLATE_ID = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__TEMPLATE_ID;

		/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__ID = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__ID;

		/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__CODE = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__CODE;

		/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__TEXT = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__TEXT;

		/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__STATUS_CODE = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__STATUS_CODE;

		/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__EFFECTIVE_TIME = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__EFFECTIVE_TIME;

		/**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__PRIORITY_CODE = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__PRIORITY_CODE;

		/**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__REPEAT_NUMBER = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__REPEAT_NUMBER;

		/**
     * The feature id for the '<em><b>Route Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__ROUTE_CODE = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__ROUTE_CODE;

		/**
     * The feature id for the '<em><b>Approach Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__APPROACH_SITE_CODE = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__APPROACH_SITE_CODE;

		/**
     * The feature id for the '<em><b>Dose Quantity</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DOSE_QUANTITY = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DOSE_QUANTITY;

		/**
     * The feature id for the '<em><b>Rate Quantity</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__RATE_QUANTITY = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__RATE_QUANTITY;

		/**
     * The feature id for the '<em><b>Max Dose Quantity</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__MAX_DOSE_QUANTITY = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__MAX_DOSE_QUANTITY;

		/**
     * The feature id for the '<em><b>Administration Unit Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__ADMINISTRATION_UNIT_CODE = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__ADMINISTRATION_UNIT_CODE;

		/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__SUBJECT = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__SUBJECT;

		/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__SPECIMEN = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__SPECIMEN;

		/**
     * The feature id for the '<em><b>Consumable</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__CONSUMABLE = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__CONSUMABLE;

		/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__PERFORMER = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__PERFORMER;

		/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__AUTHOR = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__AUTHOR;

		/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__INFORMANT = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__INFORMANT;

		/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__PARTICIPANT = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__PARTICIPANT;

		/**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__ENTRY_RELATIONSHIP = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__ENTRY_RELATIONSHIP;

		/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__REFERENCE = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__REFERENCE;

		/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__PRECONDITION = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__PRECONDITION;

		/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__NULL_FLAVOR = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__NULL_FLAVOR;

		/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__CLASS_CODE = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__CLASS_CODE;

		/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__MOOD_CODE = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__MOOD_CODE;

		/**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__NEGATION_IND = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__NEGATION_IND;

		/**
     * The number of structural features of the '<em>Treatment Given Substance Administration</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION_FEATURE_COUNT = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION_FEATURE_COUNT + 0;

		/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__REALM_CODE = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__REALM_CODE;

		/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__TYPE_ID = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__TYPE_ID;

		/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__TEMPLATE_ID = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__TEMPLATE_ID;

		/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__ID = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__ID;

		/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__CODE = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__CODE;

		/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__TEXT = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__TEXT;

		/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__STATUS_CODE = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__STATUS_CODE;

		/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__EFFECTIVE_TIME = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__EFFECTIVE_TIME;

		/**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__PRIORITY_CODE = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__PRIORITY_CODE;

		/**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__REPEAT_NUMBER = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__REPEAT_NUMBER;

		/**
     * The feature id for the '<em><b>Route Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__ROUTE_CODE = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__ROUTE_CODE;

		/**
     * The feature id for the '<em><b>Approach Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__APPROACH_SITE_CODE = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__APPROACH_SITE_CODE;

		/**
     * The feature id for the '<em><b>Dose Quantity</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DOSE_QUANTITY = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DOSE_QUANTITY;

		/**
     * The feature id for the '<em><b>Rate Quantity</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__RATE_QUANTITY = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__RATE_QUANTITY;

		/**
     * The feature id for the '<em><b>Max Dose Quantity</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__MAX_DOSE_QUANTITY = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__MAX_DOSE_QUANTITY;

		/**
     * The feature id for the '<em><b>Administration Unit Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__ADMINISTRATION_UNIT_CODE = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__ADMINISTRATION_UNIT_CODE;

		/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__SUBJECT = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__SUBJECT;

		/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__SPECIMEN = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__SPECIMEN;

		/**
     * The feature id for the '<em><b>Consumable</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__CONSUMABLE = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__CONSUMABLE;

		/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__PERFORMER = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__PERFORMER;

		/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__AUTHOR = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__AUTHOR;

		/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__INFORMANT = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__INFORMANT;

		/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__PARTICIPANT = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__PARTICIPANT;

		/**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__ENTRY_RELATIONSHIP = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__ENTRY_RELATIONSHIP;

		/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__REFERENCE = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__REFERENCE;

		/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__PRECONDITION = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__PRECONDITION;

		/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__NULL_FLAVOR = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__NULL_FLAVOR;

		/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__CLASS_CODE = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__CLASS_CODE;

		/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__MOOD_CODE = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__MOOD_CODE;

		/**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__NEGATION_IND = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__NEGATION_IND;

		/**
     * The number of structural features of the '<em>Treatment Not Given Substance Administration</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_FEATURE_COUNT = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_FEATURE_COUNT + 0;

		/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisResultObservationImpl <em>Result Observation</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisResultObservationImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisPackageImpl#getPertussisResultObservation()
     * @generated
     */
	int PERTUSSIS_RESULT_OBSERVATION = 12;

		/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisRelevantDxTestsSectionImpl <em>Relevant Dx Tests Section</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisRelevantDxTestsSectionImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisPackageImpl#getPertussisRelevantDxTestsSection()
     * @generated
     */
	int PERTUSSIS_RELEVANT_DX_TESTS_SECTION = 11;

		/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RELEVANT_DX_TESTS_SECTION__REALM_CODE = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__REALM_CODE;

		/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RELEVANT_DX_TESTS_SECTION__TYPE_ID = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__TYPE_ID;

		/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RELEVANT_DX_TESTS_SECTION__TEMPLATE_ID = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__TEMPLATE_ID;

		/**
     * The feature id for the '<em><b>Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RELEVANT_DX_TESTS_SECTION__ID = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__ID;

		/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RELEVANT_DX_TESTS_SECTION__CODE = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__CODE;

		/**
     * The feature id for the '<em><b>Title</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RELEVANT_DX_TESTS_SECTION__TITLE = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__TITLE;

		/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RELEVANT_DX_TESTS_SECTION__TEXT = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__TEXT;

		/**
     * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RELEVANT_DX_TESTS_SECTION__CONFIDENTIALITY_CODE = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__CONFIDENTIALITY_CODE;

		/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RELEVANT_DX_TESTS_SECTION__LANGUAGE_CODE = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__LANGUAGE_CODE;

		/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RELEVANT_DX_TESTS_SECTION__SUBJECT = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__SUBJECT;

		/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RELEVANT_DX_TESTS_SECTION__AUTHOR = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__AUTHOR;

		/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RELEVANT_DX_TESTS_SECTION__INFORMANT = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__INFORMANT;

		/**
     * The feature id for the '<em><b>Entry</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RELEVANT_DX_TESTS_SECTION__ENTRY = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__ENTRY;

		/**
     * The feature id for the '<em><b>Component</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RELEVANT_DX_TESTS_SECTION__COMPONENT = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__COMPONENT;

		/**
     * The feature id for the '<em><b>Section Id</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RELEVANT_DX_TESTS_SECTION__SECTION_ID = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__SECTION_ID;

		/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RELEVANT_DX_TESTS_SECTION__NULL_FLAVOR = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__NULL_FLAVOR;

		/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RELEVANT_DX_TESTS_SECTION__CLASS_CODE = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__CLASS_CODE;

		/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RELEVANT_DX_TESTS_SECTION__MOOD_CODE = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__MOOD_CODE;

		/**
     * The number of structural features of the '<em>Relevant Dx Tests Section</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RELEVANT_DX_TESTS_SECTION_FEATURE_COUNT = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION_FEATURE_COUNT + 0;

		/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RESULT_OBSERVATION__REALM_CODE = PhcrPackage.RESULT_OBSERVATION__REALM_CODE;

		/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RESULT_OBSERVATION__TYPE_ID = PhcrPackage.RESULT_OBSERVATION__TYPE_ID;

		/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RESULT_OBSERVATION__TEMPLATE_ID = PhcrPackage.RESULT_OBSERVATION__TEMPLATE_ID;

		/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RESULT_OBSERVATION__ID = PhcrPackage.RESULT_OBSERVATION__ID;

		/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RESULT_OBSERVATION__CODE = PhcrPackage.RESULT_OBSERVATION__CODE;

		/**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RESULT_OBSERVATION__DERIVATION_EXPR = PhcrPackage.RESULT_OBSERVATION__DERIVATION_EXPR;

		/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RESULT_OBSERVATION__TEXT = PhcrPackage.RESULT_OBSERVATION__TEXT;

		/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RESULT_OBSERVATION__STATUS_CODE = PhcrPackage.RESULT_OBSERVATION__STATUS_CODE;

		/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RESULT_OBSERVATION__EFFECTIVE_TIME = PhcrPackage.RESULT_OBSERVATION__EFFECTIVE_TIME;

		/**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RESULT_OBSERVATION__PRIORITY_CODE = PhcrPackage.RESULT_OBSERVATION__PRIORITY_CODE;

		/**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RESULT_OBSERVATION__REPEAT_NUMBER = PhcrPackage.RESULT_OBSERVATION__REPEAT_NUMBER;

		/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RESULT_OBSERVATION__LANGUAGE_CODE = PhcrPackage.RESULT_OBSERVATION__LANGUAGE_CODE;

		/**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RESULT_OBSERVATION__VALUE = PhcrPackage.RESULT_OBSERVATION__VALUE;

		/**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RESULT_OBSERVATION__INTERPRETATION_CODE = PhcrPackage.RESULT_OBSERVATION__INTERPRETATION_CODE;

		/**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RESULT_OBSERVATION__METHOD_CODE = PhcrPackage.RESULT_OBSERVATION__METHOD_CODE;

		/**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RESULT_OBSERVATION__TARGET_SITE_CODE = PhcrPackage.RESULT_OBSERVATION__TARGET_SITE_CODE;

		/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RESULT_OBSERVATION__SUBJECT = PhcrPackage.RESULT_OBSERVATION__SUBJECT;

		/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RESULT_OBSERVATION__SPECIMEN = PhcrPackage.RESULT_OBSERVATION__SPECIMEN;

		/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RESULT_OBSERVATION__PERFORMER = PhcrPackage.RESULT_OBSERVATION__PERFORMER;

		/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RESULT_OBSERVATION__AUTHOR = PhcrPackage.RESULT_OBSERVATION__AUTHOR;

		/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RESULT_OBSERVATION__INFORMANT = PhcrPackage.RESULT_OBSERVATION__INFORMANT;

		/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RESULT_OBSERVATION__PARTICIPANT = PhcrPackage.RESULT_OBSERVATION__PARTICIPANT;

		/**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RESULT_OBSERVATION__ENTRY_RELATIONSHIP = PhcrPackage.RESULT_OBSERVATION__ENTRY_RELATIONSHIP;

		/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RESULT_OBSERVATION__REFERENCE = PhcrPackage.RESULT_OBSERVATION__REFERENCE;

		/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RESULT_OBSERVATION__PRECONDITION = PhcrPackage.RESULT_OBSERVATION__PRECONDITION;

		/**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RESULT_OBSERVATION__REFERENCE_RANGE = PhcrPackage.RESULT_OBSERVATION__REFERENCE_RANGE;

		/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RESULT_OBSERVATION__NULL_FLAVOR = PhcrPackage.RESULT_OBSERVATION__NULL_FLAVOR;

		/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RESULT_OBSERVATION__CLASS_CODE = PhcrPackage.RESULT_OBSERVATION__CLASS_CODE;

		/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RESULT_OBSERVATION__MOOD_CODE = PhcrPackage.RESULT_OBSERVATION__MOOD_CODE;

		/**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RESULT_OBSERVATION__NEGATION_IND = PhcrPackage.RESULT_OBSERVATION__NEGATION_IND;

		/**
     * The number of structural features of the '<em>Result Observation</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RESULT_OBSERVATION_FEATURE_COUNT = PhcrPackage.RESULT_OBSERVATION_FEATURE_COUNT + 0;

		/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisResultOrganizerImpl <em>Result Organizer</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisResultOrganizerImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisPackageImpl#getPertussisResultOrganizer()
     * @generated
     */
	int PERTUSSIS_RESULT_ORGANIZER = 13;

		/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RESULT_ORGANIZER__REALM_CODE = PhcrPackage.RESULT_ORGANIZER__REALM_CODE;

		/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RESULT_ORGANIZER__TYPE_ID = PhcrPackage.RESULT_ORGANIZER__TYPE_ID;

		/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RESULT_ORGANIZER__TEMPLATE_ID = PhcrPackage.RESULT_ORGANIZER__TEMPLATE_ID;

		/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RESULT_ORGANIZER__ID = PhcrPackage.RESULT_ORGANIZER__ID;

		/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RESULT_ORGANIZER__CODE = PhcrPackage.RESULT_ORGANIZER__CODE;

		/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RESULT_ORGANIZER__STATUS_CODE = PhcrPackage.RESULT_ORGANIZER__STATUS_CODE;

		/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RESULT_ORGANIZER__EFFECTIVE_TIME = PhcrPackage.RESULT_ORGANIZER__EFFECTIVE_TIME;

		/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RESULT_ORGANIZER__SUBJECT = PhcrPackage.RESULT_ORGANIZER__SUBJECT;

		/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RESULT_ORGANIZER__SPECIMEN = PhcrPackage.RESULT_ORGANIZER__SPECIMEN;

		/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RESULT_ORGANIZER__PERFORMER = PhcrPackage.RESULT_ORGANIZER__PERFORMER;

		/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RESULT_ORGANIZER__AUTHOR = PhcrPackage.RESULT_ORGANIZER__AUTHOR;

		/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RESULT_ORGANIZER__INFORMANT = PhcrPackage.RESULT_ORGANIZER__INFORMANT;

		/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RESULT_ORGANIZER__PARTICIPANT = PhcrPackage.RESULT_ORGANIZER__PARTICIPANT;

		/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RESULT_ORGANIZER__REFERENCE = PhcrPackage.RESULT_ORGANIZER__REFERENCE;

		/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RESULT_ORGANIZER__PRECONDITION = PhcrPackage.RESULT_ORGANIZER__PRECONDITION;

		/**
     * The feature id for the '<em><b>Component</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RESULT_ORGANIZER__COMPONENT = PhcrPackage.RESULT_ORGANIZER__COMPONENT;

		/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RESULT_ORGANIZER__NULL_FLAVOR = PhcrPackage.RESULT_ORGANIZER__NULL_FLAVOR;

		/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RESULT_ORGANIZER__CLASS_CODE = PhcrPackage.RESULT_ORGANIZER__CLASS_CODE;

		/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RESULT_ORGANIZER__MOOD_CODE = PhcrPackage.RESULT_ORGANIZER__MOOD_CODE;

		/**
     * The number of structural features of the '<em>Result Organizer</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_RESULT_ORGANIZER_FEATURE_COUNT = PhcrPackage.RESULT_ORGANIZER_FEATURE_COUNT + 0;

		/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_IMMUNIZATIONS_SECTION__REALM_CODE = CCDPackage.IMMUNIZATIONS_SECTION__REALM_CODE;

		/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_IMMUNIZATIONS_SECTION__TYPE_ID = CCDPackage.IMMUNIZATIONS_SECTION__TYPE_ID;

		/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_IMMUNIZATIONS_SECTION__TEMPLATE_ID = CCDPackage.IMMUNIZATIONS_SECTION__TEMPLATE_ID;

		/**
     * The feature id for the '<em><b>Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_IMMUNIZATIONS_SECTION__ID = CCDPackage.IMMUNIZATIONS_SECTION__ID;

		/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_IMMUNIZATIONS_SECTION__CODE = CCDPackage.IMMUNIZATIONS_SECTION__CODE;

		/**
     * The feature id for the '<em><b>Title</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_IMMUNIZATIONS_SECTION__TITLE = CCDPackage.IMMUNIZATIONS_SECTION__TITLE;

		/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_IMMUNIZATIONS_SECTION__TEXT = CCDPackage.IMMUNIZATIONS_SECTION__TEXT;

		/**
     * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_IMMUNIZATIONS_SECTION__CONFIDENTIALITY_CODE = CCDPackage.IMMUNIZATIONS_SECTION__CONFIDENTIALITY_CODE;

		/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_IMMUNIZATIONS_SECTION__LANGUAGE_CODE = CCDPackage.IMMUNIZATIONS_SECTION__LANGUAGE_CODE;

		/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_IMMUNIZATIONS_SECTION__SUBJECT = CCDPackage.IMMUNIZATIONS_SECTION__SUBJECT;

		/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_IMMUNIZATIONS_SECTION__AUTHOR = CCDPackage.IMMUNIZATIONS_SECTION__AUTHOR;

		/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_IMMUNIZATIONS_SECTION__INFORMANT = CCDPackage.IMMUNIZATIONS_SECTION__INFORMANT;

		/**
     * The feature id for the '<em><b>Entry</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_IMMUNIZATIONS_SECTION__ENTRY = CCDPackage.IMMUNIZATIONS_SECTION__ENTRY;

		/**
     * The feature id for the '<em><b>Component</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_IMMUNIZATIONS_SECTION__COMPONENT = CCDPackage.IMMUNIZATIONS_SECTION__COMPONENT;

		/**
     * The feature id for the '<em><b>Section Id</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_IMMUNIZATIONS_SECTION__SECTION_ID = CCDPackage.IMMUNIZATIONS_SECTION__SECTION_ID;

		/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_IMMUNIZATIONS_SECTION__NULL_FLAVOR = CCDPackage.IMMUNIZATIONS_SECTION__NULL_FLAVOR;

		/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_IMMUNIZATIONS_SECTION__CLASS_CODE = CCDPackage.IMMUNIZATIONS_SECTION__CLASS_CODE;

		/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_IMMUNIZATIONS_SECTION__MOOD_CODE = CCDPackage.IMMUNIZATIONS_SECTION__MOOD_CODE;

		/**
     * The number of structural features of the '<em>Immunizations Section</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_IMMUNIZATIONS_SECTION_FEATURE_COUNT = CCDPackage.IMMUNIZATIONS_SECTION_FEATURE_COUNT + 0;

		/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_IMMUNIZATION_ACTIVITY__REALM_CODE = CCDPackage.MEDICATION_ACTIVITY__REALM_CODE;

		/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_IMMUNIZATION_ACTIVITY__TYPE_ID = CCDPackage.MEDICATION_ACTIVITY__TYPE_ID;

		/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_IMMUNIZATION_ACTIVITY__TEMPLATE_ID = CCDPackage.MEDICATION_ACTIVITY__TEMPLATE_ID;

		/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_IMMUNIZATION_ACTIVITY__ID = CCDPackage.MEDICATION_ACTIVITY__ID;

		/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_IMMUNIZATION_ACTIVITY__CODE = CCDPackage.MEDICATION_ACTIVITY__CODE;

		/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_IMMUNIZATION_ACTIVITY__TEXT = CCDPackage.MEDICATION_ACTIVITY__TEXT;

		/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_IMMUNIZATION_ACTIVITY__STATUS_CODE = CCDPackage.MEDICATION_ACTIVITY__STATUS_CODE;

		/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_IMMUNIZATION_ACTIVITY__EFFECTIVE_TIME = CCDPackage.MEDICATION_ACTIVITY__EFFECTIVE_TIME;

		/**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_IMMUNIZATION_ACTIVITY__PRIORITY_CODE = CCDPackage.MEDICATION_ACTIVITY__PRIORITY_CODE;

		/**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_IMMUNIZATION_ACTIVITY__REPEAT_NUMBER = CCDPackage.MEDICATION_ACTIVITY__REPEAT_NUMBER;

		/**
     * The feature id for the '<em><b>Route Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_IMMUNIZATION_ACTIVITY__ROUTE_CODE = CCDPackage.MEDICATION_ACTIVITY__ROUTE_CODE;

		/**
     * The feature id for the '<em><b>Approach Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_IMMUNIZATION_ACTIVITY__APPROACH_SITE_CODE = CCDPackage.MEDICATION_ACTIVITY__APPROACH_SITE_CODE;

		/**
     * The feature id for the '<em><b>Dose Quantity</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_IMMUNIZATION_ACTIVITY__DOSE_QUANTITY = CCDPackage.MEDICATION_ACTIVITY__DOSE_QUANTITY;

		/**
     * The feature id for the '<em><b>Rate Quantity</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_IMMUNIZATION_ACTIVITY__RATE_QUANTITY = CCDPackage.MEDICATION_ACTIVITY__RATE_QUANTITY;

		/**
     * The feature id for the '<em><b>Max Dose Quantity</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_IMMUNIZATION_ACTIVITY__MAX_DOSE_QUANTITY = CCDPackage.MEDICATION_ACTIVITY__MAX_DOSE_QUANTITY;

		/**
     * The feature id for the '<em><b>Administration Unit Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_IMMUNIZATION_ACTIVITY__ADMINISTRATION_UNIT_CODE = CCDPackage.MEDICATION_ACTIVITY__ADMINISTRATION_UNIT_CODE;

		/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_IMMUNIZATION_ACTIVITY__SUBJECT = CCDPackage.MEDICATION_ACTIVITY__SUBJECT;

		/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_IMMUNIZATION_ACTIVITY__SPECIMEN = CCDPackage.MEDICATION_ACTIVITY__SPECIMEN;

		/**
     * The feature id for the '<em><b>Consumable</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_IMMUNIZATION_ACTIVITY__CONSUMABLE = CCDPackage.MEDICATION_ACTIVITY__CONSUMABLE;

		/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_IMMUNIZATION_ACTIVITY__PERFORMER = CCDPackage.MEDICATION_ACTIVITY__PERFORMER;

		/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_IMMUNIZATION_ACTIVITY__AUTHOR = CCDPackage.MEDICATION_ACTIVITY__AUTHOR;

		/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_IMMUNIZATION_ACTIVITY__INFORMANT = CCDPackage.MEDICATION_ACTIVITY__INFORMANT;

		/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_IMMUNIZATION_ACTIVITY__PARTICIPANT = CCDPackage.MEDICATION_ACTIVITY__PARTICIPANT;

		/**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_IMMUNIZATION_ACTIVITY__ENTRY_RELATIONSHIP = CCDPackage.MEDICATION_ACTIVITY__ENTRY_RELATIONSHIP;

		/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_IMMUNIZATION_ACTIVITY__REFERENCE = CCDPackage.MEDICATION_ACTIVITY__REFERENCE;

		/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_IMMUNIZATION_ACTIVITY__PRECONDITION = CCDPackage.MEDICATION_ACTIVITY__PRECONDITION;

		/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_IMMUNIZATION_ACTIVITY__NULL_FLAVOR = CCDPackage.MEDICATION_ACTIVITY__NULL_FLAVOR;

		/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_IMMUNIZATION_ACTIVITY__CLASS_CODE = CCDPackage.MEDICATION_ACTIVITY__CLASS_CODE;

		/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_IMMUNIZATION_ACTIVITY__MOOD_CODE = CCDPackage.MEDICATION_ACTIVITY__MOOD_CODE;

		/**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_IMMUNIZATION_ACTIVITY__NEGATION_IND = CCDPackage.MEDICATION_ACTIVITY__NEGATION_IND;

		/**
     * The number of structural features of the '<em>Immunization Activity</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_IMMUNIZATION_ACTIVITY_FEATURE_COUNT = CCDPackage.MEDICATION_ACTIVITY_FEATURE_COUNT + 0;


		/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisImmunizationProductImpl <em>Immunization Product</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisImmunizationProductImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisPackageImpl#getPertussisImmunizationProduct()
     * @generated
     */
	int PERTUSSIS_IMMUNIZATION_PRODUCT = 16;

		/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_IMMUNIZATION_PRODUCT__REALM_CODE = CCDPackage.PRODUCT__REALM_CODE;

		/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_IMMUNIZATION_PRODUCT__TYPE_ID = CCDPackage.PRODUCT__TYPE_ID;

		/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_IMMUNIZATION_PRODUCT__TEMPLATE_ID = CCDPackage.PRODUCT__TEMPLATE_ID;

		/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_IMMUNIZATION_PRODUCT__ID = CCDPackage.PRODUCT__ID;

		/**
     * The feature id for the '<em><b>Manufactured Labeled Drug</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_IMMUNIZATION_PRODUCT__MANUFACTURED_LABELED_DRUG = CCDPackage.PRODUCT__MANUFACTURED_LABELED_DRUG;

		/**
     * The feature id for the '<em><b>Manufactured Material</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_IMMUNIZATION_PRODUCT__MANUFACTURED_MATERIAL = CCDPackage.PRODUCT__MANUFACTURED_MATERIAL;

		/**
     * The feature id for the '<em><b>Manufacturer Organization</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_IMMUNIZATION_PRODUCT__MANUFACTURER_ORGANIZATION = CCDPackage.PRODUCT__MANUFACTURER_ORGANIZATION;

		/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_IMMUNIZATION_PRODUCT__NULL_FLAVOR = CCDPackage.PRODUCT__NULL_FLAVOR;

		/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_IMMUNIZATION_PRODUCT__CLASS_CODE = CCDPackage.PRODUCT__CLASS_CODE;

		/**
     * The number of structural features of the '<em>Immunization Product</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERTUSSIS_IMMUNIZATION_PRODUCT_FEATURE_COUNT = CCDPackage.PRODUCT_FEATURE_COUNT + 0;


		/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisCaseReport <em>Case Report</em>}'.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @return the meta object for class '<em>Case Report</em>'.
     * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisCaseReport
     * @generated
     */
  EClass getPertussisCaseReport();

  /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisSocialHistorySection <em>Social History Section</em>}'.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @return the meta object for class '<em>Social History Section</em>'.
     * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisSocialHistorySection
     * @generated
     */
  EClass getPertussisSocialHistorySection();

  /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisPossibleExposureLocationAct <em>Possible Exposure Location Act</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Possible Exposure Location Act</em>'.
     * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisPossibleExposureLocationAct
     * @generated
     */
	EClass getPertussisPossibleExposureLocationAct();

		/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisPossibleCaseContactLocationAct <em>Possible Case Contact Location Act</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Possible Case Contact Location Act</em>'.
     * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisPossibleCaseContactLocationAct
     * @generated
     */
	EClass getPertussisPossibleCaseContactLocationAct();

		/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisClinicalInformationSection <em>Clinical Information Section</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Clinical Information Section</em>'.
     * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisClinicalInformationSection
     * @generated
     */
	EClass getPertussisClinicalInformationSection();

		/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisTreatmentInformationSection <em>Treatment Information Section</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Treatment Information Section</em>'.
     * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisTreatmentInformationSection
     * @generated
     */
	EClass getPertussisTreatmentInformationSection();

		/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisTherapeuticRegimenAct <em>Therapeutic Regimen Act</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Therapeutic Regimen Act</em>'.
     * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisTherapeuticRegimenAct
     * @generated
     */
	EClass getPertussisTherapeuticRegimenAct();

		/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisTreatmentGivenSubstanceAdministration <em>Treatment Given Substance Administration</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Treatment Given Substance Administration</em>'.
     * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisTreatmentGivenSubstanceAdministration
     * @generated
     */
	EClass getPertussisTreatmentGivenSubstanceAdministration();

		/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisTreatmentNotGivenSubstanceAdministration <em>Treatment Not Given Substance Administration</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Treatment Not Given Substance Administration</em>'.
     * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisTreatmentNotGivenSubstanceAdministration
     * @generated
     */
	EClass getPertussisTreatmentNotGivenSubstanceAdministration();

		/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisImmunizationsSection <em>Immunizations Section</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Immunizations Section</em>'.
     * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisImmunizationsSection
     * @generated
     */
	EClass getPertussisImmunizationsSection();

		/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisImmunizationActivity <em>Immunization Activity</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Immunization Activity</em>'.
     * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisImmunizationActivity
     * @generated
     */
	EClass getPertussisImmunizationActivity();

		/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisCaseObservation <em>Case Observation</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Case Observation</em>'.
     * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisCaseObservation
     * @generated
     */
	EClass getPertussisCaseObservation();

		/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisSignsAndSymptomsObservation <em>Signs And Symptoms Observation</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Signs And Symptoms Observation</em>'.
     * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisSignsAndSymptomsObservation
     * @generated
     */
	EClass getPertussisSignsAndSymptomsObservation();

		/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisResultObservation <em>Result Observation</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Result Observation</em>'.
     * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisResultObservation
     * @generated
     */
	EClass getPertussisResultObservation();

		/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisRelevantDxTestsSection <em>Relevant Dx Tests Section</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Relevant Dx Tests Section</em>'.
     * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisRelevantDxTestsSection
     * @generated
     */
	EClass getPertussisRelevantDxTestsSection();

		/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisResultOrganizer <em>Result Organizer</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Result Organizer</em>'.
     * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisResultOrganizer
     * @generated
     */
	EClass getPertussisResultOrganizer();

		/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisImmunizationProduct <em>Immunization Product</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Immunization Product</em>'.
     * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisImmunizationProduct
     * @generated
     */
	EClass getPertussisImmunizationProduct();

		/**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
  PertussisFactory getPertussisFactory();

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
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisCaseReportImpl <em>Case Report</em>}' class.
         * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisCaseReportImpl
         * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisPackageImpl#getPertussisCaseReport()
         * @generated
         */
    EClass PERTUSSIS_CASE_REPORT = eINSTANCE.getPertussisCaseReport();
    /**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisSocialHistorySectionImpl <em>Social History Section</em>}' class.
         * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisSocialHistorySectionImpl
         * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisPackageImpl#getPertussisSocialHistorySection()
         * @generated
         */
    EClass PERTUSSIS_SOCIAL_HISTORY_SECTION = eINSTANCE.getPertussisSocialHistorySection();
    /**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisPossibleExposureLocationActImpl <em>Possible Exposure Location Act</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisPossibleExposureLocationActImpl
         * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisPackageImpl#getPertussisPossibleExposureLocationAct()
         * @generated
         */
		EClass PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT = eINSTANCE.getPertussisPossibleExposureLocationAct();
				/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisPossibleCaseContactLocationActImpl <em>Possible Case Contact Location Act</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisPossibleCaseContactLocationActImpl
         * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisPackageImpl#getPertussisPossibleCaseContactLocationAct()
         * @generated
         */
		EClass PERTUSSIS_POSSIBLE_CASE_CONTACT_LOCATION_ACT = eINSTANCE.getPertussisPossibleCaseContactLocationAct();
				/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisClinicalInformationSectionImpl <em>Clinical Information Section</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisClinicalInformationSectionImpl
         * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisPackageImpl#getPertussisClinicalInformationSection()
         * @generated
         */
		EClass PERTUSSIS_CLINICAL_INFORMATION_SECTION = eINSTANCE.getPertussisClinicalInformationSection();
				/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisTreatmentInformationSectionImpl <em>Treatment Information Section</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisTreatmentInformationSectionImpl
         * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisPackageImpl#getPertussisTreatmentInformationSection()
         * @generated
         */
		EClass PERTUSSIS_TREATMENT_INFORMATION_SECTION = eINSTANCE.getPertussisTreatmentInformationSection();
				/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisTherapeuticRegimenActImpl <em>Therapeutic Regimen Act</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisTherapeuticRegimenActImpl
         * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisPackageImpl#getPertussisTherapeuticRegimenAct()
         * @generated
         */
		EClass PERTUSSIS_THERAPEUTIC_REGIMEN_ACT = eINSTANCE.getPertussisTherapeuticRegimenAct();
				/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisTreatmentGivenSubstanceAdministrationImpl <em>Treatment Given Substance Administration</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisTreatmentGivenSubstanceAdministrationImpl
         * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisPackageImpl#getPertussisTreatmentGivenSubstanceAdministration()
         * @generated
         */
		EClass PERTUSSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION = eINSTANCE.getPertussisTreatmentGivenSubstanceAdministration();
				/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisTreatmentNotGivenSubstanceAdministrationImpl <em>Treatment Not Given Substance Administration</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisTreatmentNotGivenSubstanceAdministrationImpl
         * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisPackageImpl#getPertussisTreatmentNotGivenSubstanceAdministration()
         * @generated
         */
		EClass PERTUSSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION = eINSTANCE.getPertussisTreatmentNotGivenSubstanceAdministration();
				/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisImmunizationsSectionImpl <em>Immunizations Section</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisImmunizationsSectionImpl
         * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisPackageImpl#getPertussisImmunizationsSection()
         * @generated
         */
		EClass PERTUSSIS_IMMUNIZATIONS_SECTION = eINSTANCE.getPertussisImmunizationsSection();
				/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisImmunizationActivityImpl <em>Immunization Activity</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisImmunizationActivityImpl
         * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisPackageImpl#getPertussisImmunizationActivity()
         * @generated
         */
		EClass PERTUSSIS_IMMUNIZATION_ACTIVITY = eINSTANCE.getPertussisImmunizationActivity();
				/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisCaseObservationImpl <em>Case Observation</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisCaseObservationImpl
         * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisPackageImpl#getPertussisCaseObservation()
         * @generated
         */
		EClass PERTUSSIS_CASE_OBSERVATION = eINSTANCE.getPertussisCaseObservation();
				/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisSignsAndSymptomsObservationImpl <em>Signs And Symptoms Observation</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisSignsAndSymptomsObservationImpl
         * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisPackageImpl#getPertussisSignsAndSymptomsObservation()
         * @generated
         */
		EClass PERTUSSIS_SIGNS_AND_SYMPTOMS_OBSERVATION = eINSTANCE.getPertussisSignsAndSymptomsObservation();
				/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisResultObservationImpl <em>Result Observation</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisResultObservationImpl
         * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisPackageImpl#getPertussisResultObservation()
         * @generated
         */
		EClass PERTUSSIS_RESULT_OBSERVATION = eINSTANCE.getPertussisResultObservation();
				/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisRelevantDxTestsSectionImpl <em>Relevant Dx Tests Section</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisRelevantDxTestsSectionImpl
         * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisPackageImpl#getPertussisRelevantDxTestsSection()
         * @generated
         */
		EClass PERTUSSIS_RELEVANT_DX_TESTS_SECTION = eINSTANCE.getPertussisRelevantDxTestsSection();
				/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisResultOrganizerImpl <em>Result Organizer</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisResultOrganizerImpl
         * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisPackageImpl#getPertussisResultOrganizer()
         * @generated
         */
		EClass PERTUSSIS_RESULT_ORGANIZER = eINSTANCE.getPertussisResultOrganizer();
				/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisImmunizationProductImpl <em>Immunization Product</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisImmunizationProductImpl
         * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.impl.PertussisPackageImpl#getPertussisImmunizationProduct()
         * @generated
         */
		EClass PERTUSSIS_IMMUNIZATION_PRODUCT = eINSTANCE.getPertussisImmunizationProduct();

  }

} //PertussisPackage
