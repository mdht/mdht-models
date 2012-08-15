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
package org.openhealthtools.mdht.uml.cda.phcr.flu;

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
 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.fluFactory
 * @model kind="package"
 * @generated
 */
public interface fluPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "flu";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.openhealthtools.org/mdht/uml/cda/phcr/flu";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "flu";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	fluPackage eINSTANCE = org.openhealthtools.mdht.uml.cda.phcr.flu.impl.fluPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaCaseReportImpl <em>Influenza Case Report</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaCaseReportImpl
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.fluPackageImpl#getInfluenzaCaseReport()
	 * @generated
	 */
	int INFLUENZA_CASE_REPORT = 0;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_CASE_REPORT__REALM_CODE = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_CASE_REPORT__TYPE_ID = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_CASE_REPORT__TEMPLATE_ID = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_CASE_REPORT__ID = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_CASE_REPORT__CODE = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_CASE_REPORT__TITLE = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__TITLE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_CASE_REPORT__EFFECTIVE_TIME = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_CASE_REPORT__CONFIDENTIALITY_CODE = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_CASE_REPORT__LANGUAGE_CODE = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Set Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_CASE_REPORT__SET_ID = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__SET_ID;

	/**
	 * The feature id for the '<em><b>Version Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_CASE_REPORT__VERSION_NUMBER = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__VERSION_NUMBER;

	/**
	 * The feature id for the '<em><b>Copy Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_CASE_REPORT__COPY_TIME = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__COPY_TIME;

	/**
	 * The feature id for the '<em><b>Record Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_CASE_REPORT__RECORD_TARGET = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__RECORD_TARGET;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_CASE_REPORT__AUTHOR = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Data Enterer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_CASE_REPORT__DATA_ENTERER = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__DATA_ENTERER;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_CASE_REPORT__INFORMANT = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__INFORMANT;

	/**
	 * The feature id for the '<em><b>Custodian</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_CASE_REPORT__CUSTODIAN = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__CUSTODIAN;

	/**
	 * The feature id for the '<em><b>Information Recipient</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_CASE_REPORT__INFORMATION_RECIPIENT = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__INFORMATION_RECIPIENT;

	/**
	 * The feature id for the '<em><b>Legal Authenticator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_CASE_REPORT__LEGAL_AUTHENTICATOR = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__LEGAL_AUTHENTICATOR;

	/**
	 * The feature id for the '<em><b>Authenticator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_CASE_REPORT__AUTHENTICATOR = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__AUTHENTICATOR;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_CASE_REPORT__PARTICIPANT = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>In Fulfillment Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_CASE_REPORT__IN_FULFILLMENT_OF = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__IN_FULFILLMENT_OF;

	/**
	 * The feature id for the '<em><b>Documentation Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_CASE_REPORT__DOCUMENTATION_OF = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__DOCUMENTATION_OF;

	/**
	 * The feature id for the '<em><b>Related Document</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_CASE_REPORT__RELATED_DOCUMENT = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__RELATED_DOCUMENT;

	/**
	 * The feature id for the '<em><b>Authorization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_CASE_REPORT__AUTHORIZATION = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__AUTHORIZATION;

	/**
	 * The feature id for the '<em><b>Component Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_CASE_REPORT__COMPONENT_OF = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__COMPONENT_OF;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_CASE_REPORT__COMPONENT = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__COMPONENT;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_CASE_REPORT__NULL_FLAVOR = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_CASE_REPORT__CLASS_CODE = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_CASE_REPORT__MOOD_CODE = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Influenza Case Report</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_CASE_REPORT_FEATURE_COUNT = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaImmunizationSectionImpl <em>Influenza Immunization Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaImmunizationSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.fluPackageImpl#getInfluenzaImmunizationSection()
	 * @generated
	 */
	int INFLUENZA_IMMUNIZATION_SECTION = 1;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMMUNIZATION_SECTION__REALM_CODE = CCDPackage.IMMUNIZATIONS_SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMMUNIZATION_SECTION__TYPE_ID = CCDPackage.IMMUNIZATIONS_SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMMUNIZATION_SECTION__TEMPLATE_ID = CCDPackage.IMMUNIZATIONS_SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMMUNIZATION_SECTION__ID = CCDPackage.IMMUNIZATIONS_SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMMUNIZATION_SECTION__CODE = CCDPackage.IMMUNIZATIONS_SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMMUNIZATION_SECTION__TITLE = CCDPackage.IMMUNIZATIONS_SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMMUNIZATION_SECTION__TEXT = CCDPackage.IMMUNIZATIONS_SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMMUNIZATION_SECTION__CONFIDENTIALITY_CODE = CCDPackage.IMMUNIZATIONS_SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMMUNIZATION_SECTION__LANGUAGE_CODE = CCDPackage.IMMUNIZATIONS_SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMMUNIZATION_SECTION__SUBJECT = CCDPackage.IMMUNIZATIONS_SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMMUNIZATION_SECTION__AUTHOR = CCDPackage.IMMUNIZATIONS_SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMMUNIZATION_SECTION__INFORMANT = CCDPackage.IMMUNIZATIONS_SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMMUNIZATION_SECTION__ENTRY = CCDPackage.IMMUNIZATIONS_SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMMUNIZATION_SECTION__COMPONENT = CCDPackage.IMMUNIZATIONS_SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMMUNIZATION_SECTION__SECTION_ID = CCDPackage.IMMUNIZATIONS_SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMMUNIZATION_SECTION__NULL_FLAVOR = CCDPackage.IMMUNIZATIONS_SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMMUNIZATION_SECTION__CLASS_CODE = CCDPackage.IMMUNIZATIONS_SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMMUNIZATION_SECTION__MOOD_CODE = CCDPackage.IMMUNIZATIONS_SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Influenza Immunization Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMMUNIZATION_SECTION_FEATURE_COUNT = CCDPackage.IMMUNIZATIONS_SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaImmunizationActivityImpl <em>Influenza Immunization Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaImmunizationActivityImpl
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.fluPackageImpl#getInfluenzaImmunizationActivity()
	 * @generated
	 */
	int INFLUENZA_IMMUNIZATION_ACTIVITY = 2;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMMUNIZATION_ACTIVITY__REALM_CODE = CCDPackage.MEDICATION_ACTIVITY__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMMUNIZATION_ACTIVITY__TYPE_ID = CCDPackage.MEDICATION_ACTIVITY__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMMUNIZATION_ACTIVITY__TEMPLATE_ID = CCDPackage.MEDICATION_ACTIVITY__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMMUNIZATION_ACTIVITY__ID = CCDPackage.MEDICATION_ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMMUNIZATION_ACTIVITY__CODE = CCDPackage.MEDICATION_ACTIVITY__CODE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMMUNIZATION_ACTIVITY__TEXT = CCDPackage.MEDICATION_ACTIVITY__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMMUNIZATION_ACTIVITY__STATUS_CODE = CCDPackage.MEDICATION_ACTIVITY__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMMUNIZATION_ACTIVITY__EFFECTIVE_TIME = CCDPackage.MEDICATION_ACTIVITY__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMMUNIZATION_ACTIVITY__PRIORITY_CODE = CCDPackage.MEDICATION_ACTIVITY__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMMUNIZATION_ACTIVITY__REPEAT_NUMBER = CCDPackage.MEDICATION_ACTIVITY__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Route Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMMUNIZATION_ACTIVITY__ROUTE_CODE = CCDPackage.MEDICATION_ACTIVITY__ROUTE_CODE;

	/**
	 * The feature id for the '<em><b>Approach Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMMUNIZATION_ACTIVITY__APPROACH_SITE_CODE = CCDPackage.MEDICATION_ACTIVITY__APPROACH_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Dose Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMMUNIZATION_ACTIVITY__DOSE_QUANTITY = CCDPackage.MEDICATION_ACTIVITY__DOSE_QUANTITY;

	/**
	 * The feature id for the '<em><b>Rate Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMMUNIZATION_ACTIVITY__RATE_QUANTITY = CCDPackage.MEDICATION_ACTIVITY__RATE_QUANTITY;

	/**
	 * The feature id for the '<em><b>Max Dose Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMMUNIZATION_ACTIVITY__MAX_DOSE_QUANTITY = CCDPackage.MEDICATION_ACTIVITY__MAX_DOSE_QUANTITY;

	/**
	 * The feature id for the '<em><b>Administration Unit Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMMUNIZATION_ACTIVITY__ADMINISTRATION_UNIT_CODE = CCDPackage.MEDICATION_ACTIVITY__ADMINISTRATION_UNIT_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMMUNIZATION_ACTIVITY__SUBJECT = CCDPackage.MEDICATION_ACTIVITY__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMMUNIZATION_ACTIVITY__SPECIMEN = CCDPackage.MEDICATION_ACTIVITY__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Consumable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMMUNIZATION_ACTIVITY__CONSUMABLE = CCDPackage.MEDICATION_ACTIVITY__CONSUMABLE;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMMUNIZATION_ACTIVITY__PERFORMER = CCDPackage.MEDICATION_ACTIVITY__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMMUNIZATION_ACTIVITY__AUTHOR = CCDPackage.MEDICATION_ACTIVITY__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMMUNIZATION_ACTIVITY__INFORMANT = CCDPackage.MEDICATION_ACTIVITY__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMMUNIZATION_ACTIVITY__PARTICIPANT = CCDPackage.MEDICATION_ACTIVITY__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMMUNIZATION_ACTIVITY__ENTRY_RELATIONSHIP = CCDPackage.MEDICATION_ACTIVITY__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMMUNIZATION_ACTIVITY__REFERENCE = CCDPackage.MEDICATION_ACTIVITY__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMMUNIZATION_ACTIVITY__PRECONDITION = CCDPackage.MEDICATION_ACTIVITY__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMMUNIZATION_ACTIVITY__NULL_FLAVOR = CCDPackage.MEDICATION_ACTIVITY__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMMUNIZATION_ACTIVITY__CLASS_CODE = CCDPackage.MEDICATION_ACTIVITY__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMMUNIZATION_ACTIVITY__MOOD_CODE = CCDPackage.MEDICATION_ACTIVITY__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMMUNIZATION_ACTIVITY__NEGATION_IND = CCDPackage.MEDICATION_ACTIVITY__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Influenza Immunization Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMMUNIZATION_ACTIVITY_FEATURE_COUNT = CCDPackage.MEDICATION_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaPHCRClinicalInformationSectionImpl <em>Influenza PHCR Clinical Information Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaPHCRClinicalInformationSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.fluPackageImpl#getInfluenzaPHCRClinicalInformationSection()
	 * @generated
	 */
	int INFLUENZA_PHCR_CLINICAL_INFORMATION_SECTION = 3;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_CLINICAL_INFORMATION_SECTION__REALM_CODE = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_CLINICAL_INFORMATION_SECTION__TYPE_ID = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_CLINICAL_INFORMATION_SECTION__TEMPLATE_ID = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_CLINICAL_INFORMATION_SECTION__ID = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_CLINICAL_INFORMATION_SECTION__CODE = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_CLINICAL_INFORMATION_SECTION__TITLE = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_CLINICAL_INFORMATION_SECTION__TEXT = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_CLINICAL_INFORMATION_SECTION__CONFIDENTIALITY_CODE = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_CLINICAL_INFORMATION_SECTION__LANGUAGE_CODE = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_CLINICAL_INFORMATION_SECTION__SUBJECT = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_CLINICAL_INFORMATION_SECTION__AUTHOR = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_CLINICAL_INFORMATION_SECTION__INFORMANT = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_CLINICAL_INFORMATION_SECTION__ENTRY = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_CLINICAL_INFORMATION_SECTION__COMPONENT = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_CLINICAL_INFORMATION_SECTION__SECTION_ID = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_CLINICAL_INFORMATION_SECTION__NULL_FLAVOR = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_CLINICAL_INFORMATION_SECTION__CLASS_CODE = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_CLINICAL_INFORMATION_SECTION__MOOD_CODE = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Influenza PHCR Clinical Information Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_CLINICAL_INFORMATION_SECTION_FEATURE_COUNT = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaCaseObservationImpl <em>Influenza Case Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaCaseObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.fluPackageImpl#getInfluenzaCaseObservation()
	 * @generated
	 */
	int INFLUENZA_CASE_OBSERVATION = 4;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_CASE_OBSERVATION__REALM_CODE = PhcrPackage.CASE_OBSERVATION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_CASE_OBSERVATION__TYPE_ID = PhcrPackage.CASE_OBSERVATION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_CASE_OBSERVATION__TEMPLATE_ID = PhcrPackage.CASE_OBSERVATION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_CASE_OBSERVATION__ID = PhcrPackage.CASE_OBSERVATION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_CASE_OBSERVATION__CODE = PhcrPackage.CASE_OBSERVATION__CODE;

	/**
	 * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_CASE_OBSERVATION__DERIVATION_EXPR = PhcrPackage.CASE_OBSERVATION__DERIVATION_EXPR;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_CASE_OBSERVATION__TEXT = PhcrPackage.CASE_OBSERVATION__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_CASE_OBSERVATION__STATUS_CODE = PhcrPackage.CASE_OBSERVATION__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_CASE_OBSERVATION__EFFECTIVE_TIME = PhcrPackage.CASE_OBSERVATION__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_CASE_OBSERVATION__PRIORITY_CODE = PhcrPackage.CASE_OBSERVATION__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_CASE_OBSERVATION__REPEAT_NUMBER = PhcrPackage.CASE_OBSERVATION__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_CASE_OBSERVATION__LANGUAGE_CODE = PhcrPackage.CASE_OBSERVATION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_CASE_OBSERVATION__VALUE = PhcrPackage.CASE_OBSERVATION__VALUE;

	/**
	 * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_CASE_OBSERVATION__INTERPRETATION_CODE = PhcrPackage.CASE_OBSERVATION__INTERPRETATION_CODE;

	/**
	 * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_CASE_OBSERVATION__METHOD_CODE = PhcrPackage.CASE_OBSERVATION__METHOD_CODE;

	/**
	 * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_CASE_OBSERVATION__TARGET_SITE_CODE = PhcrPackage.CASE_OBSERVATION__TARGET_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_CASE_OBSERVATION__SUBJECT = PhcrPackage.CASE_OBSERVATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_CASE_OBSERVATION__SPECIMEN = PhcrPackage.CASE_OBSERVATION__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_CASE_OBSERVATION__PERFORMER = PhcrPackage.CASE_OBSERVATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_CASE_OBSERVATION__AUTHOR = PhcrPackage.CASE_OBSERVATION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_CASE_OBSERVATION__INFORMANT = PhcrPackage.CASE_OBSERVATION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_CASE_OBSERVATION__PARTICIPANT = PhcrPackage.CASE_OBSERVATION__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_CASE_OBSERVATION__ENTRY_RELATIONSHIP = PhcrPackage.CASE_OBSERVATION__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_CASE_OBSERVATION__REFERENCE = PhcrPackage.CASE_OBSERVATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_CASE_OBSERVATION__PRECONDITION = PhcrPackage.CASE_OBSERVATION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_CASE_OBSERVATION__REFERENCE_RANGE = PhcrPackage.CASE_OBSERVATION__REFERENCE_RANGE;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_CASE_OBSERVATION__NULL_FLAVOR = PhcrPackage.CASE_OBSERVATION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_CASE_OBSERVATION__CLASS_CODE = PhcrPackage.CASE_OBSERVATION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_CASE_OBSERVATION__MOOD_CODE = PhcrPackage.CASE_OBSERVATION__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_CASE_OBSERVATION__NEGATION_IND = PhcrPackage.CASE_OBSERVATION__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Influenza Case Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_CASE_OBSERVATION_FEATURE_COUNT = PhcrPackage.CASE_OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaSignsAndSymptomsObservationImpl <em>Influenza Signs And Symptoms Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaSignsAndSymptomsObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.fluPackageImpl#getInfluenzaSignsAndSymptomsObservation()
	 * @generated
	 */
	int INFLUENZA_SIGNS_AND_SYMPTOMS_OBSERVATION = 5;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_SIGNS_AND_SYMPTOMS_OBSERVATION__REALM_CODE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_SIGNS_AND_SYMPTOMS_OBSERVATION__TYPE_ID = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_SIGNS_AND_SYMPTOMS_OBSERVATION__TEMPLATE_ID = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_SIGNS_AND_SYMPTOMS_OBSERVATION__ID = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_SIGNS_AND_SYMPTOMS_OBSERVATION__CODE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__CODE;

	/**
	 * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_SIGNS_AND_SYMPTOMS_OBSERVATION__DERIVATION_EXPR = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__DERIVATION_EXPR;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_SIGNS_AND_SYMPTOMS_OBSERVATION__TEXT = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_SIGNS_AND_SYMPTOMS_OBSERVATION__STATUS_CODE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_SIGNS_AND_SYMPTOMS_OBSERVATION__EFFECTIVE_TIME = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_SIGNS_AND_SYMPTOMS_OBSERVATION__PRIORITY_CODE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_SIGNS_AND_SYMPTOMS_OBSERVATION__REPEAT_NUMBER = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_SIGNS_AND_SYMPTOMS_OBSERVATION__LANGUAGE_CODE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_SIGNS_AND_SYMPTOMS_OBSERVATION__VALUE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__VALUE;

	/**
	 * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_SIGNS_AND_SYMPTOMS_OBSERVATION__INTERPRETATION_CODE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__INTERPRETATION_CODE;

	/**
	 * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_SIGNS_AND_SYMPTOMS_OBSERVATION__METHOD_CODE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__METHOD_CODE;

	/**
	 * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_SIGNS_AND_SYMPTOMS_OBSERVATION__TARGET_SITE_CODE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__TARGET_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_SIGNS_AND_SYMPTOMS_OBSERVATION__SUBJECT = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_SIGNS_AND_SYMPTOMS_OBSERVATION__SPECIMEN = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_SIGNS_AND_SYMPTOMS_OBSERVATION__PERFORMER = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_SIGNS_AND_SYMPTOMS_OBSERVATION__AUTHOR = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_SIGNS_AND_SYMPTOMS_OBSERVATION__INFORMANT = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_SIGNS_AND_SYMPTOMS_OBSERVATION__PARTICIPANT = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_SIGNS_AND_SYMPTOMS_OBSERVATION__ENTRY_RELATIONSHIP = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_SIGNS_AND_SYMPTOMS_OBSERVATION__REFERENCE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_SIGNS_AND_SYMPTOMS_OBSERVATION__PRECONDITION = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_SIGNS_AND_SYMPTOMS_OBSERVATION__REFERENCE_RANGE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__REFERENCE_RANGE;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_SIGNS_AND_SYMPTOMS_OBSERVATION__NULL_FLAVOR = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_SIGNS_AND_SYMPTOMS_OBSERVATION__CLASS_CODE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_SIGNS_AND_SYMPTOMS_OBSERVATION__MOOD_CODE = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_SIGNS_AND_SYMPTOMS_OBSERVATION__NEGATION_IND = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Influenza Signs And Symptoms Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_SIGNS_AND_SYMPTOMS_OBSERVATION_FEATURE_COUNT = PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaPHCRTreatmentInformationSectionImpl <em>Influenza PHCR Treatment Information Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaPHCRTreatmentInformationSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.fluPackageImpl#getInfluenzaPHCRTreatmentInformationSection()
	 * @generated
	 */
	int INFLUENZA_PHCR_TREATMENT_INFORMATION_SECTION = 6;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_TREATMENT_INFORMATION_SECTION__REALM_CODE = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_TREATMENT_INFORMATION_SECTION__TYPE_ID = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_TREATMENT_INFORMATION_SECTION__TEMPLATE_ID = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_TREATMENT_INFORMATION_SECTION__ID = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_TREATMENT_INFORMATION_SECTION__CODE = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_TREATMENT_INFORMATION_SECTION__TITLE = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_TREATMENT_INFORMATION_SECTION__TEXT = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_TREATMENT_INFORMATION_SECTION__CONFIDENTIALITY_CODE = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_TREATMENT_INFORMATION_SECTION__LANGUAGE_CODE = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_TREATMENT_INFORMATION_SECTION__SUBJECT = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_TREATMENT_INFORMATION_SECTION__AUTHOR = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_TREATMENT_INFORMATION_SECTION__INFORMANT = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_TREATMENT_INFORMATION_SECTION__ENTRY = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_TREATMENT_INFORMATION_SECTION__COMPONENT = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_TREATMENT_INFORMATION_SECTION__SECTION_ID = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_TREATMENT_INFORMATION_SECTION__NULL_FLAVOR = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_TREATMENT_INFORMATION_SECTION__CLASS_CODE = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_TREATMENT_INFORMATION_SECTION__MOOD_CODE = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Influenza PHCR Treatment Information Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_TREATMENT_INFORMATION_SECTION_FEATURE_COUNT = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaTherapeuticRegimenActImpl <em>Influenza Therapeutic Regimen Act</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaTherapeuticRegimenActImpl
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.fluPackageImpl#getInfluenzaTherapeuticRegimenAct()
	 * @generated
	 */
	int INFLUENZA_THERAPEUTIC_REGIMEN_ACT = 7;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_THERAPEUTIC_REGIMEN_ACT__REALM_CODE = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_THERAPEUTIC_REGIMEN_ACT__TYPE_ID = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_THERAPEUTIC_REGIMEN_ACT__TEMPLATE_ID = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_THERAPEUTIC_REGIMEN_ACT__ID = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_THERAPEUTIC_REGIMEN_ACT__CODE = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__CODE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_THERAPEUTIC_REGIMEN_ACT__TEXT = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_THERAPEUTIC_REGIMEN_ACT__STATUS_CODE = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_THERAPEUTIC_REGIMEN_ACT__EFFECTIVE_TIME = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_THERAPEUTIC_REGIMEN_ACT__PRIORITY_CODE = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_THERAPEUTIC_REGIMEN_ACT__LANGUAGE_CODE = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_THERAPEUTIC_REGIMEN_ACT__SUBJECT = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_THERAPEUTIC_REGIMEN_ACT__SPECIMEN = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_THERAPEUTIC_REGIMEN_ACT__PERFORMER = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_THERAPEUTIC_REGIMEN_ACT__AUTHOR = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_THERAPEUTIC_REGIMEN_ACT__INFORMANT = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_THERAPEUTIC_REGIMEN_ACT__PARTICIPANT = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_THERAPEUTIC_REGIMEN_ACT__ENTRY_RELATIONSHIP = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_THERAPEUTIC_REGIMEN_ACT__REFERENCE = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_THERAPEUTIC_REGIMEN_ACT__PRECONDITION = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_THERAPEUTIC_REGIMEN_ACT__NULL_FLAVOR = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_THERAPEUTIC_REGIMEN_ACT__CLASS_CODE = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_THERAPEUTIC_REGIMEN_ACT__MOOD_CODE = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_THERAPEUTIC_REGIMEN_ACT__NEGATION_IND = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Influenza Therapeutic Regimen Act</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_THERAPEUTIC_REGIMEN_ACT_FEATURE_COUNT = PhcrPackage.THERAPEUTIC_REGIMEN_ACT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaTreatmentGivenSubstanceAdministrationImpl <em>Influenza Treatment Given Substance Administration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaTreatmentGivenSubstanceAdministrationImpl
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.fluPackageImpl#getInfluenzaTreatmentGivenSubstanceAdministration()
	 * @generated
	 */
	int INFLUENZA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION = 8;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__REALM_CODE = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__TYPE_ID = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__TEMPLATE_ID = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__ID = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__CODE = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__CODE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__TEXT = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__STATUS_CODE = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__EFFECTIVE_TIME = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__PRIORITY_CODE = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__REPEAT_NUMBER = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Route Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__ROUTE_CODE = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__ROUTE_CODE;

	/**
	 * The feature id for the '<em><b>Approach Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__APPROACH_SITE_CODE = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__APPROACH_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Dose Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DOSE_QUANTITY = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DOSE_QUANTITY;

	/**
	 * The feature id for the '<em><b>Rate Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__RATE_QUANTITY = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__RATE_QUANTITY;

	/**
	 * The feature id for the '<em><b>Max Dose Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__MAX_DOSE_QUANTITY = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__MAX_DOSE_QUANTITY;

	/**
	 * The feature id for the '<em><b>Administration Unit Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__ADMINISTRATION_UNIT_CODE = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__ADMINISTRATION_UNIT_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__SUBJECT = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__SPECIMEN = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Consumable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__CONSUMABLE = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__CONSUMABLE;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__PERFORMER = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__AUTHOR = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__INFORMANT = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__PARTICIPANT = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__ENTRY_RELATIONSHIP = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__REFERENCE = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__PRECONDITION = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__NULL_FLAVOR = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__CLASS_CODE = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__MOOD_CODE = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__NEGATION_IND = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Influenza Treatment Given Substance Administration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION_FEATURE_COUNT = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaTreatmentNotGivenSubstanceAdministrationImpl <em>Influenza Treatment Not Given Substance Administration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaTreatmentNotGivenSubstanceAdministrationImpl
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.fluPackageImpl#getInfluenzaTreatmentNotGivenSubstanceAdministration()
	 * @generated
	 */
	int INFLUENZA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION = 9;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__REALM_CODE = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__TYPE_ID = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__TEMPLATE_ID = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__ID = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__CODE = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__CODE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__TEXT = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__STATUS_CODE = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__EFFECTIVE_TIME = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__PRIORITY_CODE = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__REPEAT_NUMBER = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Route Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__ROUTE_CODE = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__ROUTE_CODE;

	/**
	 * The feature id for the '<em><b>Approach Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__APPROACH_SITE_CODE = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__APPROACH_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Dose Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DOSE_QUANTITY = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DOSE_QUANTITY;

	/**
	 * The feature id for the '<em><b>Rate Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__RATE_QUANTITY = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__RATE_QUANTITY;

	/**
	 * The feature id for the '<em><b>Max Dose Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__MAX_DOSE_QUANTITY = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__MAX_DOSE_QUANTITY;

	/**
	 * The feature id for the '<em><b>Administration Unit Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__ADMINISTRATION_UNIT_CODE = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__ADMINISTRATION_UNIT_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__SUBJECT = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__SPECIMEN = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Consumable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__CONSUMABLE = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__CONSUMABLE;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__PERFORMER = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__AUTHOR = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__INFORMANT = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__PARTICIPANT = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__ENTRY_RELATIONSHIP = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__REFERENCE = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__PRECONDITION = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__NULL_FLAVOR = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__CLASS_CODE = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__MOOD_CODE = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__NEGATION_IND = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Influenza Treatment Not Given Substance Administration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_FEATURE_COUNT = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionImpl <em>Influenza PHCR Relevant Diagnostic Tests And Or Laboratory Data Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.fluPackageImpl#getInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection()
	 * @generated
	 */
	int INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION = 10;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__REALM_CODE = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__TYPE_ID = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__TEMPLATE_ID = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__ID = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__CODE = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__TITLE = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__TEXT = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__CONFIDENTIALITY_CODE = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__LANGUAGE_CODE = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__SUBJECT = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__AUTHOR = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__INFORMANT = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__ENTRY = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__COMPONENT = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__SECTION_ID = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__NULL_FLAVOR = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__CLASS_CODE = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__MOOD_CODE = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Influenza PHCR Relevant Diagnostic Tests And Or Laboratory Data Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION_FEATURE_COUNT = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaResultObservationImpl <em>Influenza Result Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaResultObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.fluPackageImpl#getInfluenzaResultObservation()
	 * @generated
	 */
	int INFLUENZA_RESULT_OBSERVATION = 11;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_RESULT_OBSERVATION__REALM_CODE = PhcrPackage.RESULT_OBSERVATION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_RESULT_OBSERVATION__TYPE_ID = PhcrPackage.RESULT_OBSERVATION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_RESULT_OBSERVATION__TEMPLATE_ID = PhcrPackage.RESULT_OBSERVATION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_RESULT_OBSERVATION__ID = PhcrPackage.RESULT_OBSERVATION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_RESULT_OBSERVATION__CODE = PhcrPackage.RESULT_OBSERVATION__CODE;

	/**
	 * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_RESULT_OBSERVATION__DERIVATION_EXPR = PhcrPackage.RESULT_OBSERVATION__DERIVATION_EXPR;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_RESULT_OBSERVATION__TEXT = PhcrPackage.RESULT_OBSERVATION__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_RESULT_OBSERVATION__STATUS_CODE = PhcrPackage.RESULT_OBSERVATION__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_RESULT_OBSERVATION__EFFECTIVE_TIME = PhcrPackage.RESULT_OBSERVATION__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_RESULT_OBSERVATION__PRIORITY_CODE = PhcrPackage.RESULT_OBSERVATION__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_RESULT_OBSERVATION__REPEAT_NUMBER = PhcrPackage.RESULT_OBSERVATION__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_RESULT_OBSERVATION__LANGUAGE_CODE = PhcrPackage.RESULT_OBSERVATION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_RESULT_OBSERVATION__VALUE = PhcrPackage.RESULT_OBSERVATION__VALUE;

	/**
	 * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_RESULT_OBSERVATION__INTERPRETATION_CODE = PhcrPackage.RESULT_OBSERVATION__INTERPRETATION_CODE;

	/**
	 * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_RESULT_OBSERVATION__METHOD_CODE = PhcrPackage.RESULT_OBSERVATION__METHOD_CODE;

	/**
	 * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_RESULT_OBSERVATION__TARGET_SITE_CODE = PhcrPackage.RESULT_OBSERVATION__TARGET_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_RESULT_OBSERVATION__SUBJECT = PhcrPackage.RESULT_OBSERVATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_RESULT_OBSERVATION__SPECIMEN = PhcrPackage.RESULT_OBSERVATION__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_RESULT_OBSERVATION__PERFORMER = PhcrPackage.RESULT_OBSERVATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_RESULT_OBSERVATION__AUTHOR = PhcrPackage.RESULT_OBSERVATION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_RESULT_OBSERVATION__INFORMANT = PhcrPackage.RESULT_OBSERVATION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_RESULT_OBSERVATION__PARTICIPANT = PhcrPackage.RESULT_OBSERVATION__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_RESULT_OBSERVATION__ENTRY_RELATIONSHIP = PhcrPackage.RESULT_OBSERVATION__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_RESULT_OBSERVATION__REFERENCE = PhcrPackage.RESULT_OBSERVATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_RESULT_OBSERVATION__PRECONDITION = PhcrPackage.RESULT_OBSERVATION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_RESULT_OBSERVATION__REFERENCE_RANGE = PhcrPackage.RESULT_OBSERVATION__REFERENCE_RANGE;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_RESULT_OBSERVATION__NULL_FLAVOR = PhcrPackage.RESULT_OBSERVATION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_RESULT_OBSERVATION__CLASS_CODE = PhcrPackage.RESULT_OBSERVATION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_RESULT_OBSERVATION__MOOD_CODE = PhcrPackage.RESULT_OBSERVATION__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_RESULT_OBSERVATION__NEGATION_IND = PhcrPackage.RESULT_OBSERVATION__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Influenza Result Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_RESULT_OBSERVATION_FEATURE_COUNT = PhcrPackage.RESULT_OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaImagingObservationImpl <em>Influenza Imaging Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaImagingObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.fluPackageImpl#getInfluenzaImagingObservation()
	 * @generated
	 */
	int INFLUENZA_IMAGING_OBSERVATION = 12;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMAGING_OBSERVATION__REALM_CODE = PhcrPackage.IMAGING_OBSERVATION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMAGING_OBSERVATION__TYPE_ID = PhcrPackage.IMAGING_OBSERVATION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMAGING_OBSERVATION__TEMPLATE_ID = PhcrPackage.IMAGING_OBSERVATION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMAGING_OBSERVATION__ID = PhcrPackage.IMAGING_OBSERVATION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMAGING_OBSERVATION__CODE = PhcrPackage.IMAGING_OBSERVATION__CODE;

	/**
	 * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMAGING_OBSERVATION__DERIVATION_EXPR = PhcrPackage.IMAGING_OBSERVATION__DERIVATION_EXPR;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMAGING_OBSERVATION__TEXT = PhcrPackage.IMAGING_OBSERVATION__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMAGING_OBSERVATION__STATUS_CODE = PhcrPackage.IMAGING_OBSERVATION__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMAGING_OBSERVATION__EFFECTIVE_TIME = PhcrPackage.IMAGING_OBSERVATION__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMAGING_OBSERVATION__PRIORITY_CODE = PhcrPackage.IMAGING_OBSERVATION__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMAGING_OBSERVATION__REPEAT_NUMBER = PhcrPackage.IMAGING_OBSERVATION__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMAGING_OBSERVATION__LANGUAGE_CODE = PhcrPackage.IMAGING_OBSERVATION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMAGING_OBSERVATION__VALUE = PhcrPackage.IMAGING_OBSERVATION__VALUE;

	/**
	 * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMAGING_OBSERVATION__INTERPRETATION_CODE = PhcrPackage.IMAGING_OBSERVATION__INTERPRETATION_CODE;

	/**
	 * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMAGING_OBSERVATION__METHOD_CODE = PhcrPackage.IMAGING_OBSERVATION__METHOD_CODE;

	/**
	 * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMAGING_OBSERVATION__TARGET_SITE_CODE = PhcrPackage.IMAGING_OBSERVATION__TARGET_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMAGING_OBSERVATION__SUBJECT = PhcrPackage.IMAGING_OBSERVATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMAGING_OBSERVATION__SPECIMEN = PhcrPackage.IMAGING_OBSERVATION__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMAGING_OBSERVATION__PERFORMER = PhcrPackage.IMAGING_OBSERVATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMAGING_OBSERVATION__AUTHOR = PhcrPackage.IMAGING_OBSERVATION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMAGING_OBSERVATION__INFORMANT = PhcrPackage.IMAGING_OBSERVATION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMAGING_OBSERVATION__PARTICIPANT = PhcrPackage.IMAGING_OBSERVATION__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMAGING_OBSERVATION__ENTRY_RELATIONSHIP = PhcrPackage.IMAGING_OBSERVATION__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMAGING_OBSERVATION__REFERENCE = PhcrPackage.IMAGING_OBSERVATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMAGING_OBSERVATION__PRECONDITION = PhcrPackage.IMAGING_OBSERVATION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMAGING_OBSERVATION__REFERENCE_RANGE = PhcrPackage.IMAGING_OBSERVATION__REFERENCE_RANGE;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMAGING_OBSERVATION__NULL_FLAVOR = PhcrPackage.IMAGING_OBSERVATION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMAGING_OBSERVATION__CLASS_CODE = PhcrPackage.IMAGING_OBSERVATION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMAGING_OBSERVATION__MOOD_CODE = PhcrPackage.IMAGING_OBSERVATION__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMAGING_OBSERVATION__NEGATION_IND = PhcrPackage.IMAGING_OBSERVATION__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Influenza Imaging Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMAGING_OBSERVATION_FEATURE_COUNT = PhcrPackage.IMAGING_OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaPHCRSocialHistorySectionImpl <em>Influenza PHCR Social History Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaPHCRSocialHistorySectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.fluPackageImpl#getInfluenzaPHCRSocialHistorySection()
	 * @generated
	 */
	int INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION = 13;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION__REALM_CODE = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION__TYPE_ID = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION__TEMPLATE_ID = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION__ID = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION__CODE = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION__TITLE = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION__TEXT = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION__CONFIDENTIALITY_CODE = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION__LANGUAGE_CODE = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION__SUBJECT = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION__AUTHOR = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION__INFORMANT = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION__ENTRY = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION__COMPONENT = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION__SECTION_ID = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION__NULL_FLAVOR = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION__CLASS_CODE = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION__MOOD_CODE = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Influenza PHCR Social History Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION_FEATURE_COUNT = PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaEmploymentStatusObservationImpl <em>Influenza Employment Status Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaEmploymentStatusObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.fluPackageImpl#getInfluenzaEmploymentStatusObservation()
	 * @generated
	 */
	int INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION = 14;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION__ID = CDAPackage.OBSERVATION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION__CODE = CDAPackage.OBSERVATION__CODE;

	/**
	 * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION__TEXT = CDAPackage.OBSERVATION__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION__VALUE = CDAPackage.OBSERVATION__VALUE;

	/**
	 * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

	/**
	 * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

	/**
	 * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Influenza Employment Status Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaPossibleExposureLocationActImpl <em>Influenza Possible Exposure Location Act</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaPossibleExposureLocationActImpl
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.fluPackageImpl#getInfluenzaPossibleExposureLocationAct()
	 * @generated
	 */
	int INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT = 15;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT__REALM_CODE = CDAPackage.ACT__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT__TYPE_ID = CDAPackage.ACT__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT__TEMPLATE_ID = CDAPackage.ACT__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT__ID = CDAPackage.ACT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT__CODE = CDAPackage.ACT__CODE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT__TEXT = CDAPackage.ACT__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT__STATUS_CODE = CDAPackage.ACT__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT__EFFECTIVE_TIME = CDAPackage.ACT__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT__PRIORITY_CODE = CDAPackage.ACT__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT__LANGUAGE_CODE = CDAPackage.ACT__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT__SUBJECT = CDAPackage.ACT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT__SPECIMEN = CDAPackage.ACT__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT__PERFORMER = CDAPackage.ACT__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT__AUTHOR = CDAPackage.ACT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT__INFORMANT = CDAPackage.ACT__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT__PARTICIPANT = CDAPackage.ACT__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT__ENTRY_RELATIONSHIP = CDAPackage.ACT__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT__REFERENCE = CDAPackage.ACT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT__PRECONDITION = CDAPackage.ACT__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT__NULL_FLAVOR = CDAPackage.ACT__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT__CLASS_CODE = CDAPackage.ACT__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT__MOOD_CODE = CDAPackage.ACT__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT__NEGATION_IND = CDAPackage.ACT__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Influenza Possible Exposure Location Act</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT_FEATURE_COUNT = CDAPackage.ACT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaImmunizationProductImpl <em>Influenza Immunization Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaImmunizationProductImpl
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.fluPackageImpl#getInfluenzaImmunizationProduct()
	 * @generated
	 */
	int INFLUENZA_IMMUNIZATION_PRODUCT = 16;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMMUNIZATION_PRODUCT__REALM_CODE = CCDPackage.PRODUCT__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMMUNIZATION_PRODUCT__TYPE_ID = CCDPackage.PRODUCT__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMMUNIZATION_PRODUCT__TEMPLATE_ID = CCDPackage.PRODUCT__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMMUNIZATION_PRODUCT__ID = CCDPackage.PRODUCT__ID;

	/**
	 * The feature id for the '<em><b>Manufactured Labeled Drug</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMMUNIZATION_PRODUCT__MANUFACTURED_LABELED_DRUG = CCDPackage.PRODUCT__MANUFACTURED_LABELED_DRUG;

	/**
	 * The feature id for the '<em><b>Manufactured Material</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMMUNIZATION_PRODUCT__MANUFACTURED_MATERIAL = CCDPackage.PRODUCT__MANUFACTURED_MATERIAL;

	/**
	 * The feature id for the '<em><b>Manufacturer Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMMUNIZATION_PRODUCT__MANUFACTURER_ORGANIZATION = CCDPackage.PRODUCT__MANUFACTURER_ORGANIZATION;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMMUNIZATION_PRODUCT__NULL_FLAVOR = CCDPackage.PRODUCT__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMMUNIZATION_PRODUCT__CLASS_CODE = CCDPackage.PRODUCT__CLASS_CODE;

	/**
	 * The number of structural features of the '<em>Influenza Immunization Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENZA_IMMUNIZATION_PRODUCT_FEATURE_COUNT = CCDPackage.PRODUCT_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaCaseReport <em>Influenza Case Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Influenza Case Report</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaCaseReport
	 * @generated
	 */
	EClass getInfluenzaCaseReport();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaImmunizationSection <em>Influenza Immunization Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Influenza Immunization Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaImmunizationSection
	 * @generated
	 */
	EClass getInfluenzaImmunizationSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaImmunizationActivity <em>Influenza Immunization Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Influenza Immunization Activity</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaImmunizationActivity
	 * @generated
	 */
	EClass getInfluenzaImmunizationActivity();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPHCRClinicalInformationSection <em>Influenza PHCR Clinical Information Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Influenza PHCR Clinical Information Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPHCRClinicalInformationSection
	 * @generated
	 */
	EClass getInfluenzaPHCRClinicalInformationSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaCaseObservation <em>Influenza Case Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Influenza Case Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaCaseObservation
	 * @generated
	 */
	EClass getInfluenzaCaseObservation();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaSignsAndSymptomsObservation <em>Influenza Signs And Symptoms Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Influenza Signs And Symptoms Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaSignsAndSymptomsObservation
	 * @generated
	 */
	EClass getInfluenzaSignsAndSymptomsObservation();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPHCRTreatmentInformationSection <em>Influenza PHCR Treatment Information Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Influenza PHCR Treatment Information Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPHCRTreatmentInformationSection
	 * @generated
	 */
	EClass getInfluenzaPHCRTreatmentInformationSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaTherapeuticRegimenAct <em>Influenza Therapeutic Regimen Act</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Influenza Therapeutic Regimen Act</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaTherapeuticRegimenAct
	 * @generated
	 */
	EClass getInfluenzaTherapeuticRegimenAct();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaTreatmentGivenSubstanceAdministration <em>Influenza Treatment Given Substance Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Influenza Treatment Given Substance Administration</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaTreatmentGivenSubstanceAdministration
	 * @generated
	 */
	EClass getInfluenzaTreatmentGivenSubstanceAdministration();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaTreatmentNotGivenSubstanceAdministration <em>Influenza Treatment Not Given Substance Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Influenza Treatment Not Given Substance Administration</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaTreatmentNotGivenSubstanceAdministration
	 * @generated
	 */
	EClass getInfluenzaTreatmentNotGivenSubstanceAdministration();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection <em>Influenza PHCR Relevant Diagnostic Tests And Or Laboratory Data Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Influenza PHCR Relevant Diagnostic Tests And Or Laboratory Data Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection
	 * @generated
	 */
	EClass getInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaResultObservation <em>Influenza Result Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Influenza Result Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaResultObservation
	 * @generated
	 */
	EClass getInfluenzaResultObservation();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaImagingObservation <em>Influenza Imaging Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Influenza Imaging Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaImagingObservation
	 * @generated
	 */
	EClass getInfluenzaImagingObservation();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPHCRSocialHistorySection <em>Influenza PHCR Social History Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Influenza PHCR Social History Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPHCRSocialHistorySection
	 * @generated
	 */
	EClass getInfluenzaPHCRSocialHistorySection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaEmploymentStatusObservation <em>Influenza Employment Status Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Influenza Employment Status Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaEmploymentStatusObservation
	 * @generated
	 */
	EClass getInfluenzaEmploymentStatusObservation();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPossibleExposureLocationAct <em>Influenza Possible Exposure Location Act</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Influenza Possible Exposure Location Act</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPossibleExposureLocationAct
	 * @generated
	 */
	EClass getInfluenzaPossibleExposureLocationAct();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaImmunizationProduct <em>Influenza Immunization Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Influenza Immunization Product</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaImmunizationProduct
	 * @generated
	 */
	EClass getInfluenzaImmunizationProduct();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	fluFactory getfluFactory();

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
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaCaseReportImpl <em>Influenza Case Report</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaCaseReportImpl
		 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.fluPackageImpl#getInfluenzaCaseReport()
		 * @generated
		 */
		EClass INFLUENZA_CASE_REPORT = eINSTANCE.getInfluenzaCaseReport();
		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaImmunizationSectionImpl <em>Influenza Immunization Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaImmunizationSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.fluPackageImpl#getInfluenzaImmunizationSection()
		 * @generated
		 */
		EClass INFLUENZA_IMMUNIZATION_SECTION = eINSTANCE.getInfluenzaImmunizationSection();
		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaImmunizationActivityImpl <em>Influenza Immunization Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaImmunizationActivityImpl
		 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.fluPackageImpl#getInfluenzaImmunizationActivity()
		 * @generated
		 */
		EClass INFLUENZA_IMMUNIZATION_ACTIVITY = eINSTANCE.getInfluenzaImmunizationActivity();
		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaPHCRClinicalInformationSectionImpl <em>Influenza PHCR Clinical Information Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaPHCRClinicalInformationSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.fluPackageImpl#getInfluenzaPHCRClinicalInformationSection()
		 * @generated
		 */
		EClass INFLUENZA_PHCR_CLINICAL_INFORMATION_SECTION = eINSTANCE.getInfluenzaPHCRClinicalInformationSection();
		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaCaseObservationImpl <em>Influenza Case Observation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaCaseObservationImpl
		 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.fluPackageImpl#getInfluenzaCaseObservation()
		 * @generated
		 */
		EClass INFLUENZA_CASE_OBSERVATION = eINSTANCE.getInfluenzaCaseObservation();
		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaSignsAndSymptomsObservationImpl <em>Influenza Signs And Symptoms Observation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaSignsAndSymptomsObservationImpl
		 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.fluPackageImpl#getInfluenzaSignsAndSymptomsObservation()
		 * @generated
		 */
		EClass INFLUENZA_SIGNS_AND_SYMPTOMS_OBSERVATION = eINSTANCE.getInfluenzaSignsAndSymptomsObservation();
		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaPHCRTreatmentInformationSectionImpl <em>Influenza PHCR Treatment Information Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaPHCRTreatmentInformationSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.fluPackageImpl#getInfluenzaPHCRTreatmentInformationSection()
		 * @generated
		 */
		EClass INFLUENZA_PHCR_TREATMENT_INFORMATION_SECTION = eINSTANCE.getInfluenzaPHCRTreatmentInformationSection();
		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaTherapeuticRegimenActImpl <em>Influenza Therapeutic Regimen Act</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaTherapeuticRegimenActImpl
		 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.fluPackageImpl#getInfluenzaTherapeuticRegimenAct()
		 * @generated
		 */
		EClass INFLUENZA_THERAPEUTIC_REGIMEN_ACT = eINSTANCE.getInfluenzaTherapeuticRegimenAct();
		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaTreatmentGivenSubstanceAdministrationImpl <em>Influenza Treatment Given Substance Administration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaTreatmentGivenSubstanceAdministrationImpl
		 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.fluPackageImpl#getInfluenzaTreatmentGivenSubstanceAdministration()
		 * @generated
		 */
		EClass INFLUENZA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION = eINSTANCE.getInfluenzaTreatmentGivenSubstanceAdministration();
		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaTreatmentNotGivenSubstanceAdministrationImpl <em>Influenza Treatment Not Given Substance Administration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaTreatmentNotGivenSubstanceAdministrationImpl
		 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.fluPackageImpl#getInfluenzaTreatmentNotGivenSubstanceAdministration()
		 * @generated
		 */
		EClass INFLUENZA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION = eINSTANCE.getInfluenzaTreatmentNotGivenSubstanceAdministration();
		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionImpl <em>Influenza PHCR Relevant Diagnostic Tests And Or Laboratory Data Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.fluPackageImpl#getInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection()
		 * @generated
		 */
		EClass INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION = eINSTANCE.getInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection();
		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaResultObservationImpl <em>Influenza Result Observation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaResultObservationImpl
		 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.fluPackageImpl#getInfluenzaResultObservation()
		 * @generated
		 */
		EClass INFLUENZA_RESULT_OBSERVATION = eINSTANCE.getInfluenzaResultObservation();
		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaImagingObservationImpl <em>Influenza Imaging Observation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaImagingObservationImpl
		 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.fluPackageImpl#getInfluenzaImagingObservation()
		 * @generated
		 */
		EClass INFLUENZA_IMAGING_OBSERVATION = eINSTANCE.getInfluenzaImagingObservation();
		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaPHCRSocialHistorySectionImpl <em>Influenza PHCR Social History Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaPHCRSocialHistorySectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.fluPackageImpl#getInfluenzaPHCRSocialHistorySection()
		 * @generated
		 */
		EClass INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION = eINSTANCE.getInfluenzaPHCRSocialHistorySection();
		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaEmploymentStatusObservationImpl <em>Influenza Employment Status Observation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaEmploymentStatusObservationImpl
		 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.fluPackageImpl#getInfluenzaEmploymentStatusObservation()
		 * @generated
		 */
		EClass INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION = eINSTANCE.getInfluenzaEmploymentStatusObservation();
		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaPossibleExposureLocationActImpl <em>Influenza Possible Exposure Location Act</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaPossibleExposureLocationActImpl
		 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.fluPackageImpl#getInfluenzaPossibleExposureLocationAct()
		 * @generated
		 */
		EClass INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT = eINSTANCE.getInfluenzaPossibleExposureLocationAct();
		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaImmunizationProductImpl <em>Influenza Immunization Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.InfluenzaImmunizationProductImpl
		 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.impl.fluPackageImpl#getInfluenzaImmunizationProduct()
		 * @generated
		 */
		EClass INFLUENZA_IMMUNIZATION_PRODUCT = eINSTANCE.getInfluenzaImmunizationProduct();

	}

} //fluPackage
