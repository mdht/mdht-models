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
package org.openhealthtools.mdht.uml.cda.phcr.hib;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.openhealthtools.mdht.uml.cda.phcr.hib.HibFactory
 * @model kind="package"
 *        annotation="http://www.openhealthtools.org/mdht/uml initializers='org.openhealthtools.mdht.uml.cda.hib'"
 * @generated
 */
public interface HibPackage extends EPackage
{
  /**
     * The package name.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  String eNAME = "hib";

  /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  String eNS_URI = "http://www.openhealthtools.org/mdht/uml/cda/phcr/hib";

  /**
     * The package namespace name.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  String eNS_PREFIX = "hib";

  /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  HibPackage eINSTANCE = org.openhealthtools.mdht.uml.cda.phcr.hib.impl.HibPackageImpl.init();

  /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.hib.impl.HIBCaseReportImpl <em>HIB Case Report</em>}' class.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.hib.impl.HIBCaseReportImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.hib.impl.HibPackageImpl#getHIBCaseReport()
     * @generated
     */
  int HIB_CASE_REPORT = 0;

  /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int HIB_CASE_REPORT__REALM_CODE = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__REALM_CODE;

  /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int HIB_CASE_REPORT__TYPE_ID = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__TYPE_ID;

  /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int HIB_CASE_REPORT__TEMPLATE_ID = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__TEMPLATE_ID;

  /**
     * The feature id for the '<em><b>Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int HIB_CASE_REPORT__ID = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__ID;

  /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int HIB_CASE_REPORT__CODE = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__CODE;

  /**
     * The feature id for the '<em><b>Title</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int HIB_CASE_REPORT__TITLE = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__TITLE;

  /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int HIB_CASE_REPORT__EFFECTIVE_TIME = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__EFFECTIVE_TIME;

  /**
     * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int HIB_CASE_REPORT__CONFIDENTIALITY_CODE = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__CONFIDENTIALITY_CODE;

  /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int HIB_CASE_REPORT__LANGUAGE_CODE = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__LANGUAGE_CODE;

  /**
     * The feature id for the '<em><b>Set Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int HIB_CASE_REPORT__SET_ID = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__SET_ID;

  /**
     * The feature id for the '<em><b>Version Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int HIB_CASE_REPORT__VERSION_NUMBER = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__VERSION_NUMBER;

  /**
     * The feature id for the '<em><b>Copy Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int HIB_CASE_REPORT__COPY_TIME = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__COPY_TIME;

  /**
     * The feature id for the '<em><b>Record Target</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int HIB_CASE_REPORT__RECORD_TARGET = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__RECORD_TARGET;

  /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int HIB_CASE_REPORT__AUTHOR = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__AUTHOR;

  /**
     * The feature id for the '<em><b>Data Enterer</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int HIB_CASE_REPORT__DATA_ENTERER = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__DATA_ENTERER;

  /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int HIB_CASE_REPORT__INFORMANT = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__INFORMANT;

  /**
     * The feature id for the '<em><b>Custodian</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int HIB_CASE_REPORT__CUSTODIAN = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__CUSTODIAN;

  /**
     * The feature id for the '<em><b>Information Recipient</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int HIB_CASE_REPORT__INFORMATION_RECIPIENT = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__INFORMATION_RECIPIENT;

  /**
     * The feature id for the '<em><b>Legal Authenticator</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int HIB_CASE_REPORT__LEGAL_AUTHENTICATOR = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__LEGAL_AUTHENTICATOR;

  /**
     * The feature id for the '<em><b>Authenticator</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int HIB_CASE_REPORT__AUTHENTICATOR = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__AUTHENTICATOR;

  /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int HIB_CASE_REPORT__PARTICIPANT = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__PARTICIPANT;

  /**
     * The feature id for the '<em><b>In Fulfillment Of</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int HIB_CASE_REPORT__IN_FULFILLMENT_OF = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__IN_FULFILLMENT_OF;

  /**
     * The feature id for the '<em><b>Documentation Of</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int HIB_CASE_REPORT__DOCUMENTATION_OF = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__DOCUMENTATION_OF;

  /**
     * The feature id for the '<em><b>Related Document</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int HIB_CASE_REPORT__RELATED_DOCUMENT = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__RELATED_DOCUMENT;

  /**
     * The feature id for the '<em><b>Authorization</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int HIB_CASE_REPORT__AUTHORIZATION = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__AUTHORIZATION;

  /**
     * The feature id for the '<em><b>Component Of</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int HIB_CASE_REPORT__COMPONENT_OF = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__COMPONENT_OF;

  /**
     * The feature id for the '<em><b>Component</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int HIB_CASE_REPORT__COMPONENT = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__COMPONENT;

  /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int HIB_CASE_REPORT__NULL_FLAVOR = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__NULL_FLAVOR;

  /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int HIB_CASE_REPORT__CLASS_CODE = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__CLASS_CODE;

  /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int HIB_CASE_REPORT__MOOD_CODE = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__MOOD_CODE;

  /**
     * The number of structural features of the '<em>HIB Case Report</em>' class.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int HIB_CASE_REPORT_FEATURE_COUNT = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT_FEATURE_COUNT + 0;


  /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.hib.impl.HibPhcrClinicalInformationSectionImpl <em>Phcr Clinical Information Section</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.hib.impl.HibPhcrClinicalInformationSectionImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.hib.impl.HibPackageImpl#getHibPhcrClinicalInformationSection()
     * @generated
     */
	int HIB_PHCR_CLINICAL_INFORMATION_SECTION = 1;

		/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_PHCR_CLINICAL_INFORMATION_SECTION__REALM_CODE = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__REALM_CODE;

		/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_PHCR_CLINICAL_INFORMATION_SECTION__TYPE_ID = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__TYPE_ID;

		/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_PHCR_CLINICAL_INFORMATION_SECTION__TEMPLATE_ID = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__TEMPLATE_ID;

		/**
     * The feature id for the '<em><b>Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_PHCR_CLINICAL_INFORMATION_SECTION__ID = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__ID;

		/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_PHCR_CLINICAL_INFORMATION_SECTION__CODE = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__CODE;

		/**
     * The feature id for the '<em><b>Title</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_PHCR_CLINICAL_INFORMATION_SECTION__TITLE = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__TITLE;

		/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_PHCR_CLINICAL_INFORMATION_SECTION__TEXT = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__TEXT;

		/**
     * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_PHCR_CLINICAL_INFORMATION_SECTION__CONFIDENTIALITY_CODE = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__CONFIDENTIALITY_CODE;

		/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_PHCR_CLINICAL_INFORMATION_SECTION__LANGUAGE_CODE = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__LANGUAGE_CODE;

		/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_PHCR_CLINICAL_INFORMATION_SECTION__SUBJECT = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__SUBJECT;

		/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_PHCR_CLINICAL_INFORMATION_SECTION__AUTHOR = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__AUTHOR;

		/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_PHCR_CLINICAL_INFORMATION_SECTION__INFORMANT = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__INFORMANT;

		/**
     * The feature id for the '<em><b>Entry</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_PHCR_CLINICAL_INFORMATION_SECTION__ENTRY = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__ENTRY;

		/**
     * The feature id for the '<em><b>Component</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_PHCR_CLINICAL_INFORMATION_SECTION__COMPONENT = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__COMPONENT;

		/**
     * The feature id for the '<em><b>Section Id</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_PHCR_CLINICAL_INFORMATION_SECTION__SECTION_ID = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__SECTION_ID;

		/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_PHCR_CLINICAL_INFORMATION_SECTION__NULL_FLAVOR = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__NULL_FLAVOR;

		/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_PHCR_CLINICAL_INFORMATION_SECTION__CLASS_CODE = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__CLASS_CODE;

		/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_PHCR_CLINICAL_INFORMATION_SECTION__MOOD_CODE = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__MOOD_CODE;

		/**
     * The number of structural features of the '<em>Phcr Clinical Information Section</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_PHCR_CLINICAL_INFORMATION_SECTION_FEATURE_COUNT = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION_FEATURE_COUNT + 0;

		/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.hib.impl.HibCaseObservationImpl <em>Case Observation</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.hib.impl.HibCaseObservationImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.hib.impl.HibPackageImpl#getHibCaseObservation()
     * @generated
     */
	int HIB_CASE_OBSERVATION = 2;

		/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_CASE_OBSERVATION__REALM_CODE = PhcrPackage.CASE_OBSERVATION__REALM_CODE;

		/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_CASE_OBSERVATION__TYPE_ID = PhcrPackage.CASE_OBSERVATION__TYPE_ID;

		/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_CASE_OBSERVATION__TEMPLATE_ID = PhcrPackage.CASE_OBSERVATION__TEMPLATE_ID;

		/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_CASE_OBSERVATION__ID = PhcrPackage.CASE_OBSERVATION__ID;

		/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_CASE_OBSERVATION__CODE = PhcrPackage.CASE_OBSERVATION__CODE;

		/**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_CASE_OBSERVATION__DERIVATION_EXPR = PhcrPackage.CASE_OBSERVATION__DERIVATION_EXPR;

		/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_CASE_OBSERVATION__TEXT = PhcrPackage.CASE_OBSERVATION__TEXT;

		/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_CASE_OBSERVATION__STATUS_CODE = PhcrPackage.CASE_OBSERVATION__STATUS_CODE;

		/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_CASE_OBSERVATION__EFFECTIVE_TIME = PhcrPackage.CASE_OBSERVATION__EFFECTIVE_TIME;

		/**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_CASE_OBSERVATION__PRIORITY_CODE = PhcrPackage.CASE_OBSERVATION__PRIORITY_CODE;

		/**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_CASE_OBSERVATION__REPEAT_NUMBER = PhcrPackage.CASE_OBSERVATION__REPEAT_NUMBER;

		/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_CASE_OBSERVATION__LANGUAGE_CODE = PhcrPackage.CASE_OBSERVATION__LANGUAGE_CODE;

		/**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_CASE_OBSERVATION__VALUE = PhcrPackage.CASE_OBSERVATION__VALUE;

		/**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_CASE_OBSERVATION__INTERPRETATION_CODE = PhcrPackage.CASE_OBSERVATION__INTERPRETATION_CODE;

		/**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_CASE_OBSERVATION__METHOD_CODE = PhcrPackage.CASE_OBSERVATION__METHOD_CODE;

		/**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_CASE_OBSERVATION__TARGET_SITE_CODE = PhcrPackage.CASE_OBSERVATION__TARGET_SITE_CODE;

		/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_CASE_OBSERVATION__SUBJECT = PhcrPackage.CASE_OBSERVATION__SUBJECT;

		/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_CASE_OBSERVATION__SPECIMEN = PhcrPackage.CASE_OBSERVATION__SPECIMEN;

		/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_CASE_OBSERVATION__PERFORMER = PhcrPackage.CASE_OBSERVATION__PERFORMER;

		/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_CASE_OBSERVATION__AUTHOR = PhcrPackage.CASE_OBSERVATION__AUTHOR;

		/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_CASE_OBSERVATION__INFORMANT = PhcrPackage.CASE_OBSERVATION__INFORMANT;

		/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_CASE_OBSERVATION__PARTICIPANT = PhcrPackage.CASE_OBSERVATION__PARTICIPANT;

		/**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_CASE_OBSERVATION__ENTRY_RELATIONSHIP = PhcrPackage.CASE_OBSERVATION__ENTRY_RELATIONSHIP;

		/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_CASE_OBSERVATION__REFERENCE = PhcrPackage.CASE_OBSERVATION__REFERENCE;

		/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_CASE_OBSERVATION__PRECONDITION = PhcrPackage.CASE_OBSERVATION__PRECONDITION;

		/**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_CASE_OBSERVATION__REFERENCE_RANGE = PhcrPackage.CASE_OBSERVATION__REFERENCE_RANGE;

		/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_CASE_OBSERVATION__NULL_FLAVOR = PhcrPackage.CASE_OBSERVATION__NULL_FLAVOR;

		/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_CASE_OBSERVATION__CLASS_CODE = PhcrPackage.CASE_OBSERVATION__CLASS_CODE;

		/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_CASE_OBSERVATION__MOOD_CODE = PhcrPackage.CASE_OBSERVATION__MOOD_CODE;

		/**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_CASE_OBSERVATION__NEGATION_IND = PhcrPackage.CASE_OBSERVATION__NEGATION_IND;

		/**
     * The number of structural features of the '<em>Case Observation</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_CASE_OBSERVATION_FEATURE_COUNT = PhcrPackage.CASE_OBSERVATION_FEATURE_COUNT + 0;

		/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.hib.impl.HibSignsAndSymptomsImpl <em>Signs And Symptoms</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.hib.impl.HibSignsAndSymptomsImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.hib.impl.HibPackageImpl#getHibSignsAndSymptoms()
     * @generated
     */
	int HIB_SIGNS_AND_SYMPTOMS = 3;

		/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_SIGNS_AND_SYMPTOMS__REALM_CODE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__REALM_CODE;

		/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_SIGNS_AND_SYMPTOMS__TYPE_ID = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__TYPE_ID;

		/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_SIGNS_AND_SYMPTOMS__TEMPLATE_ID = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__TEMPLATE_ID;

		/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_SIGNS_AND_SYMPTOMS__ID = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__ID;

		/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_SIGNS_AND_SYMPTOMS__CODE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__CODE;

		/**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_SIGNS_AND_SYMPTOMS__DERIVATION_EXPR = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__DERIVATION_EXPR;

		/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_SIGNS_AND_SYMPTOMS__TEXT = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__TEXT;

		/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_SIGNS_AND_SYMPTOMS__STATUS_CODE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__STATUS_CODE;

		/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_SIGNS_AND_SYMPTOMS__EFFECTIVE_TIME = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__EFFECTIVE_TIME;

		/**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_SIGNS_AND_SYMPTOMS__PRIORITY_CODE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__PRIORITY_CODE;

		/**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_SIGNS_AND_SYMPTOMS__REPEAT_NUMBER = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__REPEAT_NUMBER;

		/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_SIGNS_AND_SYMPTOMS__LANGUAGE_CODE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__LANGUAGE_CODE;

		/**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_SIGNS_AND_SYMPTOMS__VALUE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__VALUE;

		/**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_SIGNS_AND_SYMPTOMS__INTERPRETATION_CODE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__INTERPRETATION_CODE;

		/**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_SIGNS_AND_SYMPTOMS__METHOD_CODE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__METHOD_CODE;

		/**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_SIGNS_AND_SYMPTOMS__TARGET_SITE_CODE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__TARGET_SITE_CODE;

		/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_SIGNS_AND_SYMPTOMS__SUBJECT = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__SUBJECT;

		/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_SIGNS_AND_SYMPTOMS__SPECIMEN = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__SPECIMEN;

		/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_SIGNS_AND_SYMPTOMS__PERFORMER = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__PERFORMER;

		/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_SIGNS_AND_SYMPTOMS__AUTHOR = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__AUTHOR;

		/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_SIGNS_AND_SYMPTOMS__INFORMANT = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__INFORMANT;

		/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_SIGNS_AND_SYMPTOMS__PARTICIPANT = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__PARTICIPANT;

		/**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_SIGNS_AND_SYMPTOMS__ENTRY_RELATIONSHIP = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__ENTRY_RELATIONSHIP;

		/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_SIGNS_AND_SYMPTOMS__REFERENCE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__REFERENCE;

		/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_SIGNS_AND_SYMPTOMS__PRECONDITION = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__PRECONDITION;

		/**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_SIGNS_AND_SYMPTOMS__REFERENCE_RANGE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__REFERENCE_RANGE;

		/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_SIGNS_AND_SYMPTOMS__NULL_FLAVOR = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__NULL_FLAVOR;

		/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_SIGNS_AND_SYMPTOMS__CLASS_CODE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__CLASS_CODE;

		/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_SIGNS_AND_SYMPTOMS__MOOD_CODE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__MOOD_CODE;

		/**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_SIGNS_AND_SYMPTOMS__NEGATION_IND = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__NEGATION_IND;

		/**
     * The number of structural features of the '<em>Signs And Symptoms</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_SIGNS_AND_SYMPTOMS_FEATURE_COUNT = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION_FEATURE_COUNT + 0;

		/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.hib.impl.HibPhcrRelevantDxTestsSectionImpl <em>Phcr Relevant Dx Tests Section</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.hib.impl.HibPhcrRelevantDxTestsSectionImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.hib.impl.HibPackageImpl#getHibPhcrRelevantDxTestsSection()
     * @generated
     */
	int HIB_PHCR_RELEVANT_DX_TESTS_SECTION = 4;

		/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_PHCR_RELEVANT_DX_TESTS_SECTION__REALM_CODE = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__REALM_CODE;

		/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_PHCR_RELEVANT_DX_TESTS_SECTION__TYPE_ID = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__TYPE_ID;

		/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_PHCR_RELEVANT_DX_TESTS_SECTION__TEMPLATE_ID = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__TEMPLATE_ID;

		/**
     * The feature id for the '<em><b>Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_PHCR_RELEVANT_DX_TESTS_SECTION__ID = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__ID;

		/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_PHCR_RELEVANT_DX_TESTS_SECTION__CODE = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__CODE;

		/**
     * The feature id for the '<em><b>Title</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_PHCR_RELEVANT_DX_TESTS_SECTION__TITLE = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__TITLE;

		/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_PHCR_RELEVANT_DX_TESTS_SECTION__TEXT = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__TEXT;

		/**
     * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_PHCR_RELEVANT_DX_TESTS_SECTION__CONFIDENTIALITY_CODE = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__CONFIDENTIALITY_CODE;

		/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_PHCR_RELEVANT_DX_TESTS_SECTION__LANGUAGE_CODE = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__LANGUAGE_CODE;

		/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_PHCR_RELEVANT_DX_TESTS_SECTION__SUBJECT = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__SUBJECT;

		/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_PHCR_RELEVANT_DX_TESTS_SECTION__AUTHOR = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__AUTHOR;

		/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_PHCR_RELEVANT_DX_TESTS_SECTION__INFORMANT = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__INFORMANT;

		/**
     * The feature id for the '<em><b>Entry</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_PHCR_RELEVANT_DX_TESTS_SECTION__ENTRY = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__ENTRY;

		/**
     * The feature id for the '<em><b>Component</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_PHCR_RELEVANT_DX_TESTS_SECTION__COMPONENT = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__COMPONENT;

		/**
     * The feature id for the '<em><b>Section Id</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_PHCR_RELEVANT_DX_TESTS_SECTION__SECTION_ID = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__SECTION_ID;

		/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_PHCR_RELEVANT_DX_TESTS_SECTION__NULL_FLAVOR = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__NULL_FLAVOR;

		/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_PHCR_RELEVANT_DX_TESTS_SECTION__CLASS_CODE = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__CLASS_CODE;

		/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_PHCR_RELEVANT_DX_TESTS_SECTION__MOOD_CODE = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__MOOD_CODE;

		/**
     * The number of structural features of the '<em>Phcr Relevant Dx Tests Section</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_PHCR_RELEVANT_DX_TESTS_SECTION_FEATURE_COUNT = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION_FEATURE_COUNT + 0;

		/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.hib.impl.HibResultObservationImpl <em>Result Observation</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.hib.impl.HibResultObservationImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.hib.impl.HibPackageImpl#getHibResultObservation()
     * @generated
     */
	int HIB_RESULT_OBSERVATION = 5;

		/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_RESULT_OBSERVATION__REALM_CODE = PhcrPackage.RESULT_OBSERVATION__REALM_CODE;

		/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_RESULT_OBSERVATION__TYPE_ID = PhcrPackage.RESULT_OBSERVATION__TYPE_ID;

		/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_RESULT_OBSERVATION__TEMPLATE_ID = PhcrPackage.RESULT_OBSERVATION__TEMPLATE_ID;

		/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_RESULT_OBSERVATION__ID = PhcrPackage.RESULT_OBSERVATION__ID;

		/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_RESULT_OBSERVATION__CODE = PhcrPackage.RESULT_OBSERVATION__CODE;

		/**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_RESULT_OBSERVATION__DERIVATION_EXPR = PhcrPackage.RESULT_OBSERVATION__DERIVATION_EXPR;

		/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_RESULT_OBSERVATION__TEXT = PhcrPackage.RESULT_OBSERVATION__TEXT;

		/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_RESULT_OBSERVATION__STATUS_CODE = PhcrPackage.RESULT_OBSERVATION__STATUS_CODE;

		/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_RESULT_OBSERVATION__EFFECTIVE_TIME = PhcrPackage.RESULT_OBSERVATION__EFFECTIVE_TIME;

		/**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_RESULT_OBSERVATION__PRIORITY_CODE = PhcrPackage.RESULT_OBSERVATION__PRIORITY_CODE;

		/**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_RESULT_OBSERVATION__REPEAT_NUMBER = PhcrPackage.RESULT_OBSERVATION__REPEAT_NUMBER;

		/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_RESULT_OBSERVATION__LANGUAGE_CODE = PhcrPackage.RESULT_OBSERVATION__LANGUAGE_CODE;

		/**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_RESULT_OBSERVATION__VALUE = PhcrPackage.RESULT_OBSERVATION__VALUE;

		/**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_RESULT_OBSERVATION__INTERPRETATION_CODE = PhcrPackage.RESULT_OBSERVATION__INTERPRETATION_CODE;

		/**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_RESULT_OBSERVATION__METHOD_CODE = PhcrPackage.RESULT_OBSERVATION__METHOD_CODE;

		/**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_RESULT_OBSERVATION__TARGET_SITE_CODE = PhcrPackage.RESULT_OBSERVATION__TARGET_SITE_CODE;

		/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_RESULT_OBSERVATION__SUBJECT = PhcrPackage.RESULT_OBSERVATION__SUBJECT;

		/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_RESULT_OBSERVATION__SPECIMEN = PhcrPackage.RESULT_OBSERVATION__SPECIMEN;

		/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_RESULT_OBSERVATION__PERFORMER = PhcrPackage.RESULT_OBSERVATION__PERFORMER;

		/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_RESULT_OBSERVATION__AUTHOR = PhcrPackage.RESULT_OBSERVATION__AUTHOR;

		/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_RESULT_OBSERVATION__INFORMANT = PhcrPackage.RESULT_OBSERVATION__INFORMANT;

		/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_RESULT_OBSERVATION__PARTICIPANT = PhcrPackage.RESULT_OBSERVATION__PARTICIPANT;

		/**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_RESULT_OBSERVATION__ENTRY_RELATIONSHIP = PhcrPackage.RESULT_OBSERVATION__ENTRY_RELATIONSHIP;

		/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_RESULT_OBSERVATION__REFERENCE = PhcrPackage.RESULT_OBSERVATION__REFERENCE;

		/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_RESULT_OBSERVATION__PRECONDITION = PhcrPackage.RESULT_OBSERVATION__PRECONDITION;

		/**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_RESULT_OBSERVATION__REFERENCE_RANGE = PhcrPackage.RESULT_OBSERVATION__REFERENCE_RANGE;

		/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_RESULT_OBSERVATION__NULL_FLAVOR = PhcrPackage.RESULT_OBSERVATION__NULL_FLAVOR;

		/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_RESULT_OBSERVATION__CLASS_CODE = PhcrPackage.RESULT_OBSERVATION__CLASS_CODE;

		/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_RESULT_OBSERVATION__MOOD_CODE = PhcrPackage.RESULT_OBSERVATION__MOOD_CODE;

		/**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_RESULT_OBSERVATION__NEGATION_IND = PhcrPackage.RESULT_OBSERVATION__NEGATION_IND;

		/**
     * The number of structural features of the '<em>Result Observation</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_RESULT_OBSERVATION_FEATURE_COUNT = PhcrPackage.RESULT_OBSERVATION_FEATURE_COUNT + 0;

		/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.hib.impl.HibResultOrganizerImpl <em>Result Organizer</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.phcr.hib.impl.HibResultOrganizerImpl
     * @see org.openhealthtools.mdht.uml.cda.phcr.hib.impl.HibPackageImpl#getHibResultOrganizer()
     * @generated
     */
	int HIB_RESULT_ORGANIZER = 6;

		/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_RESULT_ORGANIZER__REALM_CODE = PhcrPackage.RESULT_ORGANIZER__REALM_CODE;

		/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_RESULT_ORGANIZER__TYPE_ID = PhcrPackage.RESULT_ORGANIZER__TYPE_ID;

		/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_RESULT_ORGANIZER__TEMPLATE_ID = PhcrPackage.RESULT_ORGANIZER__TEMPLATE_ID;

		/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_RESULT_ORGANIZER__ID = PhcrPackage.RESULT_ORGANIZER__ID;

		/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_RESULT_ORGANIZER__CODE = PhcrPackage.RESULT_ORGANIZER__CODE;

		/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_RESULT_ORGANIZER__STATUS_CODE = PhcrPackage.RESULT_ORGANIZER__STATUS_CODE;

		/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_RESULT_ORGANIZER__EFFECTIVE_TIME = PhcrPackage.RESULT_ORGANIZER__EFFECTIVE_TIME;

		/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_RESULT_ORGANIZER__SUBJECT = PhcrPackage.RESULT_ORGANIZER__SUBJECT;

		/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_RESULT_ORGANIZER__SPECIMEN = PhcrPackage.RESULT_ORGANIZER__SPECIMEN;

		/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_RESULT_ORGANIZER__PERFORMER = PhcrPackage.RESULT_ORGANIZER__PERFORMER;

		/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_RESULT_ORGANIZER__AUTHOR = PhcrPackage.RESULT_ORGANIZER__AUTHOR;

		/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_RESULT_ORGANIZER__INFORMANT = PhcrPackage.RESULT_ORGANIZER__INFORMANT;

		/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_RESULT_ORGANIZER__PARTICIPANT = PhcrPackage.RESULT_ORGANIZER__PARTICIPANT;

		/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_RESULT_ORGANIZER__REFERENCE = PhcrPackage.RESULT_ORGANIZER__REFERENCE;

		/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_RESULT_ORGANIZER__PRECONDITION = PhcrPackage.RESULT_ORGANIZER__PRECONDITION;

		/**
     * The feature id for the '<em><b>Component</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_RESULT_ORGANIZER__COMPONENT = PhcrPackage.RESULT_ORGANIZER__COMPONENT;

		/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_RESULT_ORGANIZER__NULL_FLAVOR = PhcrPackage.RESULT_ORGANIZER__NULL_FLAVOR;

		/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_RESULT_ORGANIZER__CLASS_CODE = PhcrPackage.RESULT_ORGANIZER__CLASS_CODE;

		/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_RESULT_ORGANIZER__MOOD_CODE = PhcrPackage.RESULT_ORGANIZER__MOOD_CODE;

		/**
     * The number of structural features of the '<em>Result Organizer</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HIB_RESULT_ORGANIZER_FEATURE_COUNT = PhcrPackage.RESULT_ORGANIZER_FEATURE_COUNT + 0;

		/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.hib.HIBCaseReport <em>HIB Case Report</em>}'.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @return the meta object for class '<em>HIB Case Report</em>'.
     * @see org.openhealthtools.mdht.uml.cda.phcr.hib.HIBCaseReport
     * @generated
     */
  EClass getHIBCaseReport();

  /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.hib.HibPhcrClinicalInformationSection <em>Phcr Clinical Information Section</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Phcr Clinical Information Section</em>'.
     * @see org.openhealthtools.mdht.uml.cda.phcr.hib.HibPhcrClinicalInformationSection
     * @generated
     */
	EClass getHibPhcrClinicalInformationSection();

		/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.hib.HibCaseObservation <em>Case Observation</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Case Observation</em>'.
     * @see org.openhealthtools.mdht.uml.cda.phcr.hib.HibCaseObservation
     * @generated
     */
	EClass getHibCaseObservation();

		/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.hib.HibSignsAndSymptoms <em>Signs And Symptoms</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Signs And Symptoms</em>'.
     * @see org.openhealthtools.mdht.uml.cda.phcr.hib.HibSignsAndSymptoms
     * @generated
     */
	EClass getHibSignsAndSymptoms();

		/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.hib.HibPhcrRelevantDxTestsSection <em>Phcr Relevant Dx Tests Section</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Phcr Relevant Dx Tests Section</em>'.
     * @see org.openhealthtools.mdht.uml.cda.phcr.hib.HibPhcrRelevantDxTestsSection
     * @generated
     */
	EClass getHibPhcrRelevantDxTestsSection();

		/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.hib.HibResultObservation <em>Result Observation</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Result Observation</em>'.
     * @see org.openhealthtools.mdht.uml.cda.phcr.hib.HibResultObservation
     * @generated
     */
	EClass getHibResultObservation();

		/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.hib.HibResultOrganizer <em>Result Organizer</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Result Organizer</em>'.
     * @see org.openhealthtools.mdht.uml.cda.phcr.hib.HibResultOrganizer
     * @generated
     */
	EClass getHibResultOrganizer();

		/**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
  HibFactory getHibFactory();

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
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.hib.impl.HIBCaseReportImpl <em>HIB Case Report</em>}' class.
         * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.phcr.hib.impl.HIBCaseReportImpl
         * @see org.openhealthtools.mdht.uml.cda.phcr.hib.impl.HibPackageImpl#getHIBCaseReport()
         * @generated
         */
    EClass HIB_CASE_REPORT = eINSTANCE.getHIBCaseReport();
				/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.hib.impl.HibPhcrClinicalInformationSectionImpl <em>Phcr Clinical Information Section</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.phcr.hib.impl.HibPhcrClinicalInformationSectionImpl
         * @see org.openhealthtools.mdht.uml.cda.phcr.hib.impl.HibPackageImpl#getHibPhcrClinicalInformationSection()
         * @generated
         */
		EClass HIB_PHCR_CLINICAL_INFORMATION_SECTION = eINSTANCE.getHibPhcrClinicalInformationSection();
				/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.hib.impl.HibCaseObservationImpl <em>Case Observation</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.phcr.hib.impl.HibCaseObservationImpl
         * @see org.openhealthtools.mdht.uml.cda.phcr.hib.impl.HibPackageImpl#getHibCaseObservation()
         * @generated
         */
		EClass HIB_CASE_OBSERVATION = eINSTANCE.getHibCaseObservation();
				/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.hib.impl.HibSignsAndSymptomsImpl <em>Signs And Symptoms</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.phcr.hib.impl.HibSignsAndSymptomsImpl
         * @see org.openhealthtools.mdht.uml.cda.phcr.hib.impl.HibPackageImpl#getHibSignsAndSymptoms()
         * @generated
         */
		EClass HIB_SIGNS_AND_SYMPTOMS = eINSTANCE.getHibSignsAndSymptoms();
				/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.hib.impl.HibPhcrRelevantDxTestsSectionImpl <em>Phcr Relevant Dx Tests Section</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.phcr.hib.impl.HibPhcrRelevantDxTestsSectionImpl
         * @see org.openhealthtools.mdht.uml.cda.phcr.hib.impl.HibPackageImpl#getHibPhcrRelevantDxTestsSection()
         * @generated
         */
		EClass HIB_PHCR_RELEVANT_DX_TESTS_SECTION = eINSTANCE.getHibPhcrRelevantDxTestsSection();
				/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.hib.impl.HibResultObservationImpl <em>Result Observation</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.phcr.hib.impl.HibResultObservationImpl
         * @see org.openhealthtools.mdht.uml.cda.phcr.hib.impl.HibPackageImpl#getHibResultObservation()
         * @generated
         */
		EClass HIB_RESULT_OBSERVATION = eINSTANCE.getHibResultObservation();
				/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.hib.impl.HibResultOrganizerImpl <em>Result Organizer</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.phcr.hib.impl.HibResultOrganizerImpl
         * @see org.openhealthtools.mdht.uml.cda.phcr.hib.impl.HibPackageImpl#getHibResultOrganizer()
         * @generated
         */
		EClass HIB_RESULT_ORGANIZER = eINSTANCE.getHibResultOrganizer();

  }

} //HibPackage
