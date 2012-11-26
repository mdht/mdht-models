/*******************************************************************************
 * Copyright (c) 2012 Rama Ramakrishnan and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Rama Ramakrishnan (Agilex Corporation) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consoltoc;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.openhealthtools.mdht.uml.cda.consoltoc.ConsoltocFactory
 * @model kind="package"
 * @generated
 */
public interface ConsoltocPackage extends EPackage
{
  /**
     * The package name.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  String eNAME = "consoltoc";

  /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  String eNS_URI = "http://www.openhealthtools.org/mdht/uml/cda/consoltoc";

  /**
     * The package namespace name.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  String eNS_PREFIX = "consoltoc";

  /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  ConsoltocPackage eINSTANCE = org.openhealthtools.mdht.uml.cda.consoltoc.impl.ConsoltocPackageImpl.init();

  /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consoltoc.impl.DischargeSummaryImpl <em>Discharge Summary</em>}' class.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.consoltoc.impl.DischargeSummaryImpl
     * @see org.openhealthtools.mdht.uml.cda.consoltoc.impl.ConsoltocPackageImpl#getDischargeSummary()
     * @generated
     */
  int DISCHARGE_SUMMARY = 0;

  /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int DISCHARGE_SUMMARY__REALM_CODE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__REALM_CODE;

  /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int DISCHARGE_SUMMARY__TYPE_ID = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__TYPE_ID;

  /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int DISCHARGE_SUMMARY__TEMPLATE_ID = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__TEMPLATE_ID;

  /**
     * The feature id for the '<em><b>Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int DISCHARGE_SUMMARY__ID = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__ID;

  /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int DISCHARGE_SUMMARY__CODE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__CODE;

  /**
     * The feature id for the '<em><b>Title</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int DISCHARGE_SUMMARY__TITLE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__TITLE;

  /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int DISCHARGE_SUMMARY__EFFECTIVE_TIME = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__EFFECTIVE_TIME;

  /**
     * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int DISCHARGE_SUMMARY__CONFIDENTIALITY_CODE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__CONFIDENTIALITY_CODE;

  /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int DISCHARGE_SUMMARY__LANGUAGE_CODE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__LANGUAGE_CODE;

  /**
     * The feature id for the '<em><b>Set Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int DISCHARGE_SUMMARY__SET_ID = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__SET_ID;

  /**
     * The feature id for the '<em><b>Version Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int DISCHARGE_SUMMARY__VERSION_NUMBER = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__VERSION_NUMBER;

  /**
     * The feature id for the '<em><b>Copy Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int DISCHARGE_SUMMARY__COPY_TIME = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__COPY_TIME;

  /**
     * The feature id for the '<em><b>Record Target</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int DISCHARGE_SUMMARY__RECORD_TARGET = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__RECORD_TARGET;

  /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int DISCHARGE_SUMMARY__AUTHOR = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__AUTHOR;

  /**
     * The feature id for the '<em><b>Data Enterer</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int DISCHARGE_SUMMARY__DATA_ENTERER = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__DATA_ENTERER;

  /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int DISCHARGE_SUMMARY__INFORMANT = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__INFORMANT;

  /**
     * The feature id for the '<em><b>Custodian</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int DISCHARGE_SUMMARY__CUSTODIAN = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__CUSTODIAN;

  /**
     * The feature id for the '<em><b>Information Recipient</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int DISCHARGE_SUMMARY__INFORMATION_RECIPIENT = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__INFORMATION_RECIPIENT;

  /**
     * The feature id for the '<em><b>Legal Authenticator</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int DISCHARGE_SUMMARY__LEGAL_AUTHENTICATOR = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__LEGAL_AUTHENTICATOR;

  /**
     * The feature id for the '<em><b>Authenticator</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int DISCHARGE_SUMMARY__AUTHENTICATOR = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__AUTHENTICATOR;

  /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int DISCHARGE_SUMMARY__PARTICIPANT = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__PARTICIPANT;

  /**
     * The feature id for the '<em><b>In Fulfillment Of</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int DISCHARGE_SUMMARY__IN_FULFILLMENT_OF = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__IN_FULFILLMENT_OF;

  /**
     * The feature id for the '<em><b>Documentation Of</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int DISCHARGE_SUMMARY__DOCUMENTATION_OF = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__DOCUMENTATION_OF;

  /**
     * The feature id for the '<em><b>Related Document</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int DISCHARGE_SUMMARY__RELATED_DOCUMENT = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__RELATED_DOCUMENT;

  /**
     * The feature id for the '<em><b>Authorization</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int DISCHARGE_SUMMARY__AUTHORIZATION = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__AUTHORIZATION;

  /**
     * The feature id for the '<em><b>Component Of</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int DISCHARGE_SUMMARY__COMPONENT_OF = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__COMPONENT_OF;

  /**
     * The feature id for the '<em><b>Component</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int DISCHARGE_SUMMARY__COMPONENT = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__COMPONENT;

  /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int DISCHARGE_SUMMARY__NULL_FLAVOR = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__NULL_FLAVOR;

  /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int DISCHARGE_SUMMARY__CLASS_CODE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__CLASS_CODE;

  /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int DISCHARGE_SUMMARY__MOOD_CODE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__MOOD_CODE;

  /**
     * The number of structural features of the '<em>Discharge Summary</em>' class.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int DISCHARGE_SUMMARY_FEATURE_COUNT = ConsolPackage.GENERAL_HEADER_CONSTRAINTS_FEATURE_COUNT + 0;


  /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consoltoc.impl.ConsultationRequestImpl <em>Consultation Request</em>}' class.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.consoltoc.impl.ConsultationRequestImpl
     * @see org.openhealthtools.mdht.uml.cda.consoltoc.impl.ConsoltocPackageImpl#getConsultationRequest()
     * @generated
     */
  int CONSULTATION_REQUEST = 1;

  /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int CONSULTATION_REQUEST__REALM_CODE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__REALM_CODE;

  /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int CONSULTATION_REQUEST__TYPE_ID = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__TYPE_ID;

  /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int CONSULTATION_REQUEST__TEMPLATE_ID = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__TEMPLATE_ID;

  /**
     * The feature id for the '<em><b>Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int CONSULTATION_REQUEST__ID = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__ID;

  /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int CONSULTATION_REQUEST__CODE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__CODE;

  /**
     * The feature id for the '<em><b>Title</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int CONSULTATION_REQUEST__TITLE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__TITLE;

  /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int CONSULTATION_REQUEST__EFFECTIVE_TIME = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__EFFECTIVE_TIME;

  /**
     * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int CONSULTATION_REQUEST__CONFIDENTIALITY_CODE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__CONFIDENTIALITY_CODE;

  /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int CONSULTATION_REQUEST__LANGUAGE_CODE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__LANGUAGE_CODE;

  /**
     * The feature id for the '<em><b>Set Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int CONSULTATION_REQUEST__SET_ID = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__SET_ID;

  /**
     * The feature id for the '<em><b>Version Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int CONSULTATION_REQUEST__VERSION_NUMBER = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__VERSION_NUMBER;

  /**
     * The feature id for the '<em><b>Copy Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int CONSULTATION_REQUEST__COPY_TIME = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__COPY_TIME;

  /**
     * The feature id for the '<em><b>Record Target</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int CONSULTATION_REQUEST__RECORD_TARGET = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__RECORD_TARGET;

  /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int CONSULTATION_REQUEST__AUTHOR = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__AUTHOR;

  /**
     * The feature id for the '<em><b>Data Enterer</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int CONSULTATION_REQUEST__DATA_ENTERER = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__DATA_ENTERER;

  /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int CONSULTATION_REQUEST__INFORMANT = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__INFORMANT;

  /**
     * The feature id for the '<em><b>Custodian</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int CONSULTATION_REQUEST__CUSTODIAN = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__CUSTODIAN;

  /**
     * The feature id for the '<em><b>Information Recipient</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int CONSULTATION_REQUEST__INFORMATION_RECIPIENT = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__INFORMATION_RECIPIENT;

  /**
     * The feature id for the '<em><b>Legal Authenticator</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int CONSULTATION_REQUEST__LEGAL_AUTHENTICATOR = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__LEGAL_AUTHENTICATOR;

  /**
     * The feature id for the '<em><b>Authenticator</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int CONSULTATION_REQUEST__AUTHENTICATOR = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__AUTHENTICATOR;

  /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int CONSULTATION_REQUEST__PARTICIPANT = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__PARTICIPANT;

  /**
     * The feature id for the '<em><b>In Fulfillment Of</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int CONSULTATION_REQUEST__IN_FULFILLMENT_OF = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__IN_FULFILLMENT_OF;

  /**
     * The feature id for the '<em><b>Documentation Of</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int CONSULTATION_REQUEST__DOCUMENTATION_OF = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__DOCUMENTATION_OF;

  /**
     * The feature id for the '<em><b>Related Document</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int CONSULTATION_REQUEST__RELATED_DOCUMENT = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__RELATED_DOCUMENT;

  /**
     * The feature id for the '<em><b>Authorization</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int CONSULTATION_REQUEST__AUTHORIZATION = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__AUTHORIZATION;

  /**
     * The feature id for the '<em><b>Component Of</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int CONSULTATION_REQUEST__COMPONENT_OF = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__COMPONENT_OF;

  /**
     * The feature id for the '<em><b>Component</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int CONSULTATION_REQUEST__COMPONENT = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__COMPONENT;

  /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int CONSULTATION_REQUEST__NULL_FLAVOR = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__NULL_FLAVOR;

  /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int CONSULTATION_REQUEST__CLASS_CODE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__CLASS_CODE;

  /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int CONSULTATION_REQUEST__MOOD_CODE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__MOOD_CODE;

  /**
     * The number of structural features of the '<em>Consultation Request</em>' class.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int CONSULTATION_REQUEST_FEATURE_COUNT = ConsolPackage.GENERAL_HEADER_CONSTRAINTS_FEATURE_COUNT + 0;


  /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consoltoc.impl.ConsultationSummaryImpl <em>Consultation Summary</em>}' class.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.consoltoc.impl.ConsultationSummaryImpl
     * @see org.openhealthtools.mdht.uml.cda.consoltoc.impl.ConsoltocPackageImpl#getConsultationSummary()
     * @generated
     */
  int CONSULTATION_SUMMARY = 2;

  /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int CONSULTATION_SUMMARY__REALM_CODE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__REALM_CODE;

  /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int CONSULTATION_SUMMARY__TYPE_ID = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__TYPE_ID;

  /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int CONSULTATION_SUMMARY__TEMPLATE_ID = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__TEMPLATE_ID;

  /**
     * The feature id for the '<em><b>Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int CONSULTATION_SUMMARY__ID = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__ID;

  /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int CONSULTATION_SUMMARY__CODE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__CODE;

  /**
     * The feature id for the '<em><b>Title</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int CONSULTATION_SUMMARY__TITLE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__TITLE;

  /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int CONSULTATION_SUMMARY__EFFECTIVE_TIME = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__EFFECTIVE_TIME;

  /**
     * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int CONSULTATION_SUMMARY__CONFIDENTIALITY_CODE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__CONFIDENTIALITY_CODE;

  /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int CONSULTATION_SUMMARY__LANGUAGE_CODE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__LANGUAGE_CODE;

  /**
     * The feature id for the '<em><b>Set Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int CONSULTATION_SUMMARY__SET_ID = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__SET_ID;

  /**
     * The feature id for the '<em><b>Version Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int CONSULTATION_SUMMARY__VERSION_NUMBER = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__VERSION_NUMBER;

  /**
     * The feature id for the '<em><b>Copy Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int CONSULTATION_SUMMARY__COPY_TIME = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__COPY_TIME;

  /**
     * The feature id for the '<em><b>Record Target</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int CONSULTATION_SUMMARY__RECORD_TARGET = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__RECORD_TARGET;

  /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int CONSULTATION_SUMMARY__AUTHOR = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__AUTHOR;

  /**
     * The feature id for the '<em><b>Data Enterer</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int CONSULTATION_SUMMARY__DATA_ENTERER = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__DATA_ENTERER;

  /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int CONSULTATION_SUMMARY__INFORMANT = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__INFORMANT;

  /**
     * The feature id for the '<em><b>Custodian</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int CONSULTATION_SUMMARY__CUSTODIAN = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__CUSTODIAN;

  /**
     * The feature id for the '<em><b>Information Recipient</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int CONSULTATION_SUMMARY__INFORMATION_RECIPIENT = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__INFORMATION_RECIPIENT;

  /**
     * The feature id for the '<em><b>Legal Authenticator</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int CONSULTATION_SUMMARY__LEGAL_AUTHENTICATOR = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__LEGAL_AUTHENTICATOR;

  /**
     * The feature id for the '<em><b>Authenticator</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int CONSULTATION_SUMMARY__AUTHENTICATOR = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__AUTHENTICATOR;

  /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int CONSULTATION_SUMMARY__PARTICIPANT = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__PARTICIPANT;

  /**
     * The feature id for the '<em><b>In Fulfillment Of</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int CONSULTATION_SUMMARY__IN_FULFILLMENT_OF = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__IN_FULFILLMENT_OF;

  /**
     * The feature id for the '<em><b>Documentation Of</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int CONSULTATION_SUMMARY__DOCUMENTATION_OF = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__DOCUMENTATION_OF;

  /**
     * The feature id for the '<em><b>Related Document</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int CONSULTATION_SUMMARY__RELATED_DOCUMENT = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__RELATED_DOCUMENT;

  /**
     * The feature id for the '<em><b>Authorization</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int CONSULTATION_SUMMARY__AUTHORIZATION = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__AUTHORIZATION;

  /**
     * The feature id for the '<em><b>Component Of</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int CONSULTATION_SUMMARY__COMPONENT_OF = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__COMPONENT_OF;

  /**
     * The feature id for the '<em><b>Component</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int CONSULTATION_SUMMARY__COMPONENT = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__COMPONENT;

  /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int CONSULTATION_SUMMARY__NULL_FLAVOR = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__NULL_FLAVOR;

  /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int CONSULTATION_SUMMARY__CLASS_CODE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__CLASS_CODE;

  /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int CONSULTATION_SUMMARY__MOOD_CODE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__MOOD_CODE;

  /**
     * The number of structural features of the '<em>Consultation Summary</em>' class.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int CONSULTATION_SUMMARY_FEATURE_COUNT = ConsolPackage.GENERAL_HEADER_CONSTRAINTS_FEATURE_COUNT + 0;


  /**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consoltoc.impl.DischargeInstructionsImpl <em>Discharge Instructions</em>}' class.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.consoltoc.impl.DischargeInstructionsImpl
     * @see org.openhealthtools.mdht.uml.cda.consoltoc.impl.ConsoltocPackageImpl#getDischargeInstructions()
     * @generated
     */
  int DISCHARGE_INSTRUCTIONS = 3;

  /**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int DISCHARGE_INSTRUCTIONS__REALM_CODE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__REALM_CODE;

  /**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int DISCHARGE_INSTRUCTIONS__TYPE_ID = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__TYPE_ID;

  /**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int DISCHARGE_INSTRUCTIONS__TEMPLATE_ID = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__TEMPLATE_ID;

  /**
     * The feature id for the '<em><b>Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int DISCHARGE_INSTRUCTIONS__ID = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__ID;

  /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int DISCHARGE_INSTRUCTIONS__CODE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__CODE;

  /**
     * The feature id for the '<em><b>Title</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int DISCHARGE_INSTRUCTIONS__TITLE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__TITLE;

  /**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int DISCHARGE_INSTRUCTIONS__EFFECTIVE_TIME = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__EFFECTIVE_TIME;

  /**
     * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int DISCHARGE_INSTRUCTIONS__CONFIDENTIALITY_CODE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__CONFIDENTIALITY_CODE;

  /**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int DISCHARGE_INSTRUCTIONS__LANGUAGE_CODE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__LANGUAGE_CODE;

  /**
     * The feature id for the '<em><b>Set Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int DISCHARGE_INSTRUCTIONS__SET_ID = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__SET_ID;

  /**
     * The feature id for the '<em><b>Version Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int DISCHARGE_INSTRUCTIONS__VERSION_NUMBER = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__VERSION_NUMBER;

  /**
     * The feature id for the '<em><b>Copy Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int DISCHARGE_INSTRUCTIONS__COPY_TIME = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__COPY_TIME;

  /**
     * The feature id for the '<em><b>Record Target</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int DISCHARGE_INSTRUCTIONS__RECORD_TARGET = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__RECORD_TARGET;

  /**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int DISCHARGE_INSTRUCTIONS__AUTHOR = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__AUTHOR;

  /**
     * The feature id for the '<em><b>Data Enterer</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int DISCHARGE_INSTRUCTIONS__DATA_ENTERER = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__DATA_ENTERER;

  /**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int DISCHARGE_INSTRUCTIONS__INFORMANT = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__INFORMANT;

  /**
     * The feature id for the '<em><b>Custodian</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int DISCHARGE_INSTRUCTIONS__CUSTODIAN = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__CUSTODIAN;

  /**
     * The feature id for the '<em><b>Information Recipient</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int DISCHARGE_INSTRUCTIONS__INFORMATION_RECIPIENT = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__INFORMATION_RECIPIENT;

  /**
     * The feature id for the '<em><b>Legal Authenticator</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int DISCHARGE_INSTRUCTIONS__LEGAL_AUTHENTICATOR = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__LEGAL_AUTHENTICATOR;

  /**
     * The feature id for the '<em><b>Authenticator</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int DISCHARGE_INSTRUCTIONS__AUTHENTICATOR = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__AUTHENTICATOR;

  /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int DISCHARGE_INSTRUCTIONS__PARTICIPANT = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__PARTICIPANT;

  /**
     * The feature id for the '<em><b>In Fulfillment Of</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int DISCHARGE_INSTRUCTIONS__IN_FULFILLMENT_OF = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__IN_FULFILLMENT_OF;

  /**
     * The feature id for the '<em><b>Documentation Of</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int DISCHARGE_INSTRUCTIONS__DOCUMENTATION_OF = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__DOCUMENTATION_OF;

  /**
     * The feature id for the '<em><b>Related Document</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int DISCHARGE_INSTRUCTIONS__RELATED_DOCUMENT = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__RELATED_DOCUMENT;

  /**
     * The feature id for the '<em><b>Authorization</b></em>' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int DISCHARGE_INSTRUCTIONS__AUTHORIZATION = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__AUTHORIZATION;

  /**
     * The feature id for the '<em><b>Component Of</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int DISCHARGE_INSTRUCTIONS__COMPONENT_OF = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__COMPONENT_OF;

  /**
     * The feature id for the '<em><b>Component</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int DISCHARGE_INSTRUCTIONS__COMPONENT = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__COMPONENT;

  /**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int DISCHARGE_INSTRUCTIONS__NULL_FLAVOR = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__NULL_FLAVOR;

  /**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int DISCHARGE_INSTRUCTIONS__CLASS_CODE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__CLASS_CODE;

  /**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int DISCHARGE_INSTRUCTIONS__MOOD_CODE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__MOOD_CODE;

  /**
     * The number of structural features of the '<em>Discharge Instructions</em>' class.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
  int DISCHARGE_INSTRUCTIONS_FEATURE_COUNT = ConsolPackage.GENERAL_HEADER_CONSTRAINTS_FEATURE_COUNT + 0;


  /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary <em>Discharge Summary</em>}'.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @return the meta object for class '<em>Discharge Summary</em>'.
     * @see org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary
     * @generated
     */
  EClass getDischargeSummary();

  /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest <em>Consultation Request</em>}'.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @return the meta object for class '<em>Consultation Request</em>'.
     * @see org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest
     * @generated
     */
  EClass getConsultationRequest();

  /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary <em>Consultation Summary</em>}'.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @return the meta object for class '<em>Consultation Summary</em>'.
     * @see org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary
     * @generated
     */
  EClass getConsultationSummary();

  /**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeInstructions <em>Discharge Instructions</em>}'.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @return the meta object for class '<em>Discharge Instructions</em>'.
     * @see org.openhealthtools.mdht.uml.cda.consoltoc.DischargeInstructions
     * @generated
     */
  EClass getDischargeInstructions();

  /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
  ConsoltocFactory getConsoltocFactory();

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
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consoltoc.impl.DischargeSummaryImpl <em>Discharge Summary</em>}' class.
         * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.consoltoc.impl.DischargeSummaryImpl
         * @see org.openhealthtools.mdht.uml.cda.consoltoc.impl.ConsoltocPackageImpl#getDischargeSummary()
         * @generated
         */
    EClass DISCHARGE_SUMMARY = eINSTANCE.getDischargeSummary();
    /**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consoltoc.impl.ConsultationRequestImpl <em>Consultation Request</em>}' class.
         * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.consoltoc.impl.ConsultationRequestImpl
         * @see org.openhealthtools.mdht.uml.cda.consoltoc.impl.ConsoltocPackageImpl#getConsultationRequest()
         * @generated
         */
    EClass CONSULTATION_REQUEST = eINSTANCE.getConsultationRequest();
    /**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consoltoc.impl.ConsultationSummaryImpl <em>Consultation Summary</em>}' class.
         * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.consoltoc.impl.ConsultationSummaryImpl
         * @see org.openhealthtools.mdht.uml.cda.consoltoc.impl.ConsoltocPackageImpl#getConsultationSummary()
         * @generated
         */
    EClass CONSULTATION_SUMMARY = eINSTANCE.getConsultationSummary();
    /**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consoltoc.impl.DischargeInstructionsImpl <em>Discharge Instructions</em>}' class.
         * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.consoltoc.impl.DischargeInstructionsImpl
         * @see org.openhealthtools.mdht.uml.cda.consoltoc.impl.ConsoltocPackageImpl#getDischargeInstructions()
         * @generated
         */
    EClass DISCHARGE_INSTRUCTIONS = eINSTANCE.getDischargeInstructions();

  }

} //ConsoltocPackage
