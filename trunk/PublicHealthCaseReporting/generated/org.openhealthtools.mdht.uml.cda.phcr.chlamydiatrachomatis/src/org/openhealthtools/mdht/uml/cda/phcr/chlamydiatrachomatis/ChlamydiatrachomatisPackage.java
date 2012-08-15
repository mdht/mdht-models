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
package org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis;

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
 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisFactory
 * @model kind="package"
 * @generated
 */
public interface ChlamydiatrachomatisPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "chlamydiatrachomatis";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.openhealthtools.org/mdht/uml/cda/phcr/chlamydiatrachomatis";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "chlamydiatrachomatis";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ChlamydiatrachomatisPackage eINSTANCE = org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl.ChlamydiatrachomatisPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl.ChlamydiatrachomatisPublicHealthCaseReportImpl <em>Public Health Case Report</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl.ChlamydiatrachomatisPublicHealthCaseReportImpl
	 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl.ChlamydiatrachomatisPackageImpl#getChlamydiatrachomatisPublicHealthCaseReport()
	 * @generated
	 */
	int CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT = 0;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT__REALM_CODE = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT__TYPE_ID = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT__TEMPLATE_ID = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT__ID = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT__CODE = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT__TITLE = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__TITLE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT__EFFECTIVE_TIME = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT__CONFIDENTIALITY_CODE = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT__LANGUAGE_CODE = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Set Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT__SET_ID = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__SET_ID;

	/**
	 * The feature id for the '<em><b>Version Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT__VERSION_NUMBER = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__VERSION_NUMBER;

	/**
	 * The feature id for the '<em><b>Copy Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT__COPY_TIME = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__COPY_TIME;

	/**
	 * The feature id for the '<em><b>Record Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT__RECORD_TARGET = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__RECORD_TARGET;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT__AUTHOR = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Data Enterer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT__DATA_ENTERER = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__DATA_ENTERER;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT__INFORMANT = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__INFORMANT;

	/**
	 * The feature id for the '<em><b>Custodian</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT__CUSTODIAN = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__CUSTODIAN;

	/**
	 * The feature id for the '<em><b>Information Recipient</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT__INFORMATION_RECIPIENT = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__INFORMATION_RECIPIENT;

	/**
	 * The feature id for the '<em><b>Legal Authenticator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT__LEGAL_AUTHENTICATOR = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__LEGAL_AUTHENTICATOR;

	/**
	 * The feature id for the '<em><b>Authenticator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT__AUTHENTICATOR = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__AUTHENTICATOR;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT__PARTICIPANT = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>In Fulfillment Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT__IN_FULFILLMENT_OF = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__IN_FULFILLMENT_OF;

	/**
	 * The feature id for the '<em><b>Documentation Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT__DOCUMENTATION_OF = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__DOCUMENTATION_OF;

	/**
	 * The feature id for the '<em><b>Related Document</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT__RELATED_DOCUMENT = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__RELATED_DOCUMENT;

	/**
	 * The feature id for the '<em><b>Authorization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT__AUTHORIZATION = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__AUTHORIZATION;

	/**
	 * The feature id for the '<em><b>Component Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT__COMPONENT_OF = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__COMPONENT_OF;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT__COMPONENT = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__COMPONENT;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT__NULL_FLAVOR = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT__CLASS_CODE = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT__MOOD_CODE = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Public Health Case Report</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT_FEATURE_COUNT = PhcrPackage.PUBLIC_HEALTH_CASE_REPORT_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl.ChlamydiatrachomatisPHCRClinicalInformationSectionImpl <em>PHCR Clinical Information Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl.ChlamydiatrachomatisPHCRClinicalInformationSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl.ChlamydiatrachomatisPackageImpl#getChlamydiatrachomatisPHCRClinicalInformationSection()
	 * @generated
	 */
	int CHLAMYDIATRACHOMATIS_PHCR_CLINICAL_INFORMATION_SECTION = 1;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PHCR_CLINICAL_INFORMATION_SECTION__REALM_CODE = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PHCR_CLINICAL_INFORMATION_SECTION__TYPE_ID = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PHCR_CLINICAL_INFORMATION_SECTION__TEMPLATE_ID = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PHCR_CLINICAL_INFORMATION_SECTION__ID = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PHCR_CLINICAL_INFORMATION_SECTION__CODE = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PHCR_CLINICAL_INFORMATION_SECTION__TITLE = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PHCR_CLINICAL_INFORMATION_SECTION__TEXT = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PHCR_CLINICAL_INFORMATION_SECTION__CONFIDENTIALITY_CODE = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PHCR_CLINICAL_INFORMATION_SECTION__LANGUAGE_CODE = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PHCR_CLINICAL_INFORMATION_SECTION__SUBJECT = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PHCR_CLINICAL_INFORMATION_SECTION__AUTHOR = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PHCR_CLINICAL_INFORMATION_SECTION__INFORMANT = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PHCR_CLINICAL_INFORMATION_SECTION__ENTRY = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PHCR_CLINICAL_INFORMATION_SECTION__COMPONENT = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PHCR_CLINICAL_INFORMATION_SECTION__SECTION_ID = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PHCR_CLINICAL_INFORMATION_SECTION__NULL_FLAVOR = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PHCR_CLINICAL_INFORMATION_SECTION__CLASS_CODE = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PHCR_CLINICAL_INFORMATION_SECTION__MOOD_CODE = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>PHCR Clinical Information Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PHCR_CLINICAL_INFORMATION_SECTION_FEATURE_COUNT = PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl.ChlamydiatrachomatisCaseObservationImpl <em>Case Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl.ChlamydiatrachomatisCaseObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl.ChlamydiatrachomatisPackageImpl#getChlamydiatrachomatisCaseObservation()
	 * @generated
	 */
	int CHLAMYDIATRACHOMATIS_CASE_OBSERVATION = 2;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_CASE_OBSERVATION__REALM_CODE = PhcrPackage.CASE_OBSERVATION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_CASE_OBSERVATION__TYPE_ID = PhcrPackage.CASE_OBSERVATION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_CASE_OBSERVATION__TEMPLATE_ID = PhcrPackage.CASE_OBSERVATION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_CASE_OBSERVATION__ID = PhcrPackage.CASE_OBSERVATION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_CASE_OBSERVATION__CODE = PhcrPackage.CASE_OBSERVATION__CODE;

	/**
	 * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_CASE_OBSERVATION__DERIVATION_EXPR = PhcrPackage.CASE_OBSERVATION__DERIVATION_EXPR;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_CASE_OBSERVATION__TEXT = PhcrPackage.CASE_OBSERVATION__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_CASE_OBSERVATION__STATUS_CODE = PhcrPackage.CASE_OBSERVATION__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_CASE_OBSERVATION__EFFECTIVE_TIME = PhcrPackage.CASE_OBSERVATION__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_CASE_OBSERVATION__PRIORITY_CODE = PhcrPackage.CASE_OBSERVATION__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_CASE_OBSERVATION__REPEAT_NUMBER = PhcrPackage.CASE_OBSERVATION__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_CASE_OBSERVATION__LANGUAGE_CODE = PhcrPackage.CASE_OBSERVATION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_CASE_OBSERVATION__VALUE = PhcrPackage.CASE_OBSERVATION__VALUE;

	/**
	 * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_CASE_OBSERVATION__INTERPRETATION_CODE = PhcrPackage.CASE_OBSERVATION__INTERPRETATION_CODE;

	/**
	 * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_CASE_OBSERVATION__METHOD_CODE = PhcrPackage.CASE_OBSERVATION__METHOD_CODE;

	/**
	 * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_CASE_OBSERVATION__TARGET_SITE_CODE = PhcrPackage.CASE_OBSERVATION__TARGET_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_CASE_OBSERVATION__SUBJECT = PhcrPackage.CASE_OBSERVATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_CASE_OBSERVATION__SPECIMEN = PhcrPackage.CASE_OBSERVATION__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_CASE_OBSERVATION__PERFORMER = PhcrPackage.CASE_OBSERVATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_CASE_OBSERVATION__AUTHOR = PhcrPackage.CASE_OBSERVATION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_CASE_OBSERVATION__INFORMANT = PhcrPackage.CASE_OBSERVATION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_CASE_OBSERVATION__PARTICIPANT = PhcrPackage.CASE_OBSERVATION__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_CASE_OBSERVATION__ENTRY_RELATIONSHIP = PhcrPackage.CASE_OBSERVATION__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_CASE_OBSERVATION__REFERENCE = PhcrPackage.CASE_OBSERVATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_CASE_OBSERVATION__PRECONDITION = PhcrPackage.CASE_OBSERVATION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_CASE_OBSERVATION__REFERENCE_RANGE = PhcrPackage.CASE_OBSERVATION__REFERENCE_RANGE;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_CASE_OBSERVATION__NULL_FLAVOR = PhcrPackage.CASE_OBSERVATION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_CASE_OBSERVATION__CLASS_CODE = PhcrPackage.CASE_OBSERVATION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_CASE_OBSERVATION__MOOD_CODE = PhcrPackage.CASE_OBSERVATION__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_CASE_OBSERVATION__NEGATION_IND = PhcrPackage.CASE_OBSERVATION__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Case Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_CASE_OBSERVATION_FEATURE_COUNT = PhcrPackage.CASE_OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl.ChlamydiatrachomatisPHCRRelevantDxTestsSectionImpl <em>PHCR Relevant Dx Tests Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl.ChlamydiatrachomatisPHCRRelevantDxTestsSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl.ChlamydiatrachomatisPackageImpl#getChlamydiatrachomatisPHCRRelevantDxTestsSection()
	 * @generated
	 */
	int CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION = 3;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION__REALM_CODE = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION__TYPE_ID = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION__TEMPLATE_ID = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION__ID = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION__CODE = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION__TITLE = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION__TEXT = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION__CONFIDENTIALITY_CODE = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION__LANGUAGE_CODE = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION__SUBJECT = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION__AUTHOR = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION__INFORMANT = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION__ENTRY = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION__COMPONENT = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION__SECTION_ID = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION__NULL_FLAVOR = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION__CLASS_CODE = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION__MOOD_CODE = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>PHCR Relevant Dx Tests Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION_FEATURE_COUNT = PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl.ChlamydiatrachomatisResultObservationImpl <em>Result Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl.ChlamydiatrachomatisResultObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl.ChlamydiatrachomatisPackageImpl#getChlamydiatrachomatisResultObservation()
	 * @generated
	 */
	int CHLAMYDIATRACHOMATIS_RESULT_OBSERVATION = 4;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_RESULT_OBSERVATION__REALM_CODE = PhcrPackage.RESULT_OBSERVATION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_RESULT_OBSERVATION__TYPE_ID = PhcrPackage.RESULT_OBSERVATION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_RESULT_OBSERVATION__TEMPLATE_ID = PhcrPackage.RESULT_OBSERVATION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_RESULT_OBSERVATION__ID = PhcrPackage.RESULT_OBSERVATION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_RESULT_OBSERVATION__CODE = PhcrPackage.RESULT_OBSERVATION__CODE;

	/**
	 * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_RESULT_OBSERVATION__DERIVATION_EXPR = PhcrPackage.RESULT_OBSERVATION__DERIVATION_EXPR;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_RESULT_OBSERVATION__TEXT = PhcrPackage.RESULT_OBSERVATION__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_RESULT_OBSERVATION__STATUS_CODE = PhcrPackage.RESULT_OBSERVATION__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_RESULT_OBSERVATION__EFFECTIVE_TIME = PhcrPackage.RESULT_OBSERVATION__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_RESULT_OBSERVATION__PRIORITY_CODE = PhcrPackage.RESULT_OBSERVATION__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_RESULT_OBSERVATION__REPEAT_NUMBER = PhcrPackage.RESULT_OBSERVATION__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_RESULT_OBSERVATION__LANGUAGE_CODE = PhcrPackage.RESULT_OBSERVATION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_RESULT_OBSERVATION__VALUE = PhcrPackage.RESULT_OBSERVATION__VALUE;

	/**
	 * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_RESULT_OBSERVATION__INTERPRETATION_CODE = PhcrPackage.RESULT_OBSERVATION__INTERPRETATION_CODE;

	/**
	 * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_RESULT_OBSERVATION__METHOD_CODE = PhcrPackage.RESULT_OBSERVATION__METHOD_CODE;

	/**
	 * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_RESULT_OBSERVATION__TARGET_SITE_CODE = PhcrPackage.RESULT_OBSERVATION__TARGET_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_RESULT_OBSERVATION__SUBJECT = PhcrPackage.RESULT_OBSERVATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_RESULT_OBSERVATION__SPECIMEN = PhcrPackage.RESULT_OBSERVATION__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_RESULT_OBSERVATION__PERFORMER = PhcrPackage.RESULT_OBSERVATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_RESULT_OBSERVATION__AUTHOR = PhcrPackage.RESULT_OBSERVATION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_RESULT_OBSERVATION__INFORMANT = PhcrPackage.RESULT_OBSERVATION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_RESULT_OBSERVATION__PARTICIPANT = PhcrPackage.RESULT_OBSERVATION__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_RESULT_OBSERVATION__ENTRY_RELATIONSHIP = PhcrPackage.RESULT_OBSERVATION__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_RESULT_OBSERVATION__REFERENCE = PhcrPackage.RESULT_OBSERVATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_RESULT_OBSERVATION__PRECONDITION = PhcrPackage.RESULT_OBSERVATION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_RESULT_OBSERVATION__REFERENCE_RANGE = PhcrPackage.RESULT_OBSERVATION__REFERENCE_RANGE;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_RESULT_OBSERVATION__NULL_FLAVOR = PhcrPackage.RESULT_OBSERVATION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_RESULT_OBSERVATION__CLASS_CODE = PhcrPackage.RESULT_OBSERVATION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_RESULT_OBSERVATION__MOOD_CODE = PhcrPackage.RESULT_OBSERVATION__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_RESULT_OBSERVATION__NEGATION_IND = PhcrPackage.RESULT_OBSERVATION__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Result Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_RESULT_OBSERVATION_FEATURE_COUNT = PhcrPackage.RESULT_OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl.chlamydiatrachomatisResultOrganizerImpl <em>chlamydiatrachomatis Result Organizer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl.chlamydiatrachomatisResultOrganizerImpl
	 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl.ChlamydiatrachomatisPackageImpl#getchlamydiatrachomatisResultOrganizer()
	 * @generated
	 */
	int CHLAMYDIATRACHOMATIS_RESULT_ORGANIZER = 5;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_RESULT_ORGANIZER__REALM_CODE = PhcrPackage.RESULT_ORGANIZER__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_RESULT_ORGANIZER__TYPE_ID = PhcrPackage.RESULT_ORGANIZER__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_RESULT_ORGANIZER__TEMPLATE_ID = PhcrPackage.RESULT_ORGANIZER__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_RESULT_ORGANIZER__ID = PhcrPackage.RESULT_ORGANIZER__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_RESULT_ORGANIZER__CODE = PhcrPackage.RESULT_ORGANIZER__CODE;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_RESULT_ORGANIZER__STATUS_CODE = PhcrPackage.RESULT_ORGANIZER__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_RESULT_ORGANIZER__EFFECTIVE_TIME = PhcrPackage.RESULT_ORGANIZER__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_RESULT_ORGANIZER__SUBJECT = PhcrPackage.RESULT_ORGANIZER__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_RESULT_ORGANIZER__SPECIMEN = PhcrPackage.RESULT_ORGANIZER__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_RESULT_ORGANIZER__PERFORMER = PhcrPackage.RESULT_ORGANIZER__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_RESULT_ORGANIZER__AUTHOR = PhcrPackage.RESULT_ORGANIZER__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_RESULT_ORGANIZER__INFORMANT = PhcrPackage.RESULT_ORGANIZER__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_RESULT_ORGANIZER__PARTICIPANT = PhcrPackage.RESULT_ORGANIZER__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_RESULT_ORGANIZER__REFERENCE = PhcrPackage.RESULT_ORGANIZER__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_RESULT_ORGANIZER__PRECONDITION = PhcrPackage.RESULT_ORGANIZER__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_RESULT_ORGANIZER__COMPONENT = PhcrPackage.RESULT_ORGANIZER__COMPONENT;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_RESULT_ORGANIZER__NULL_FLAVOR = PhcrPackage.RESULT_ORGANIZER__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_RESULT_ORGANIZER__CLASS_CODE = PhcrPackage.RESULT_ORGANIZER__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_RESULT_ORGANIZER__MOOD_CODE = PhcrPackage.RESULT_ORGANIZER__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>chlamydiatrachomatis Result Organizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_RESULT_ORGANIZER_FEATURE_COUNT = PhcrPackage.RESULT_ORGANIZER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl.ChlamydiatrachomatisPHCRTreatmentInformationSectionImpl <em>PHCR Treatment Information Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl.ChlamydiatrachomatisPHCRTreatmentInformationSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl.ChlamydiatrachomatisPackageImpl#getChlamydiatrachomatisPHCRTreatmentInformationSection()
	 * @generated
	 */
	int CHLAMYDIATRACHOMATIS_PHCR_TREATMENT_INFORMATION_SECTION = 6;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PHCR_TREATMENT_INFORMATION_SECTION__REALM_CODE = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PHCR_TREATMENT_INFORMATION_SECTION__TYPE_ID = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PHCR_TREATMENT_INFORMATION_SECTION__TEMPLATE_ID = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PHCR_TREATMENT_INFORMATION_SECTION__ID = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PHCR_TREATMENT_INFORMATION_SECTION__CODE = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PHCR_TREATMENT_INFORMATION_SECTION__TITLE = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PHCR_TREATMENT_INFORMATION_SECTION__TEXT = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PHCR_TREATMENT_INFORMATION_SECTION__CONFIDENTIALITY_CODE = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PHCR_TREATMENT_INFORMATION_SECTION__LANGUAGE_CODE = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PHCR_TREATMENT_INFORMATION_SECTION__SUBJECT = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PHCR_TREATMENT_INFORMATION_SECTION__AUTHOR = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PHCR_TREATMENT_INFORMATION_SECTION__INFORMANT = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PHCR_TREATMENT_INFORMATION_SECTION__ENTRY = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PHCR_TREATMENT_INFORMATION_SECTION__COMPONENT = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PHCR_TREATMENT_INFORMATION_SECTION__SECTION_ID = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PHCR_TREATMENT_INFORMATION_SECTION__NULL_FLAVOR = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PHCR_TREATMENT_INFORMATION_SECTION__CLASS_CODE = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PHCR_TREATMENT_INFORMATION_SECTION__MOOD_CODE = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>PHCR Treatment Information Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_PHCR_TREATMENT_INFORMATION_SECTION_FEATURE_COUNT = PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl.ChlamydiatrachomatisTherapeuticRegimenActImpl <em>Therapeutic Regimen Act</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl.ChlamydiatrachomatisTherapeuticRegimenActImpl
	 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl.ChlamydiatrachomatisPackageImpl#getChlamydiatrachomatisTherapeuticRegimenAct()
	 * @generated
	 */
	int CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT = 7;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT__REALM_CODE = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT__TYPE_ID = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT__TEMPLATE_ID = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT__ID = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT__CODE = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__CODE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT__TEXT = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT__STATUS_CODE = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT__EFFECTIVE_TIME = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT__PRIORITY_CODE = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT__LANGUAGE_CODE = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT__SUBJECT = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT__SPECIMEN = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT__PERFORMER = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT__AUTHOR = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT__INFORMANT = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT__PARTICIPANT = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT__ENTRY_RELATIONSHIP = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT__REFERENCE = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT__PRECONDITION = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT__NULL_FLAVOR = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT__CLASS_CODE = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT__MOOD_CODE = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT__NEGATION_IND = PhcrPackage.THERAPEUTIC_REGIMEN_ACT__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Therapeutic Regimen Act</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT_FEATURE_COUNT = PhcrPackage.THERAPEUTIC_REGIMEN_ACT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl.ChlamydiatrachomatisTreatmentGivenSubstanceAdministrationImpl <em>Treatment Given Substance Administration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl.ChlamydiatrachomatisTreatmentGivenSubstanceAdministrationImpl
	 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl.ChlamydiatrachomatisPackageImpl#getChlamydiatrachomatisTreatmentGivenSubstanceAdministration()
	 * @generated
	 */
	int CHLAMYDIATRACHOMATIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION = 8;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__REALM_CODE = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__TYPE_ID = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__TEMPLATE_ID = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__ID = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__CODE = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__CODE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__TEXT = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__STATUS_CODE = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__EFFECTIVE_TIME = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__PRIORITY_CODE = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__REPEAT_NUMBER = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Route Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__ROUTE_CODE = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__ROUTE_CODE;

	/**
	 * The feature id for the '<em><b>Approach Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__APPROACH_SITE_CODE = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__APPROACH_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Dose Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DOSE_QUANTITY = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DOSE_QUANTITY;

	/**
	 * The feature id for the '<em><b>Rate Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__RATE_QUANTITY = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__RATE_QUANTITY;

	/**
	 * The feature id for the '<em><b>Max Dose Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__MAX_DOSE_QUANTITY = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__MAX_DOSE_QUANTITY;

	/**
	 * The feature id for the '<em><b>Administration Unit Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__ADMINISTRATION_UNIT_CODE = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__ADMINISTRATION_UNIT_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__SUBJECT = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__SPECIMEN = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Consumable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__CONSUMABLE = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__CONSUMABLE;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__PERFORMER = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__AUTHOR = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__INFORMANT = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__PARTICIPANT = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__ENTRY_RELATIONSHIP = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__REFERENCE = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__PRECONDITION = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__NULL_FLAVOR = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__CLASS_CODE = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__MOOD_CODE = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__NEGATION_IND = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Treatment Given Substance Administration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION_FEATURE_COUNT = PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl.ChlamydiatrachomatisTreatmentNotGivenSubstanceAdministrationImpl <em>Treatment Not Given Substance Administration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl.ChlamydiatrachomatisTreatmentNotGivenSubstanceAdministrationImpl
	 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl.ChlamydiatrachomatisPackageImpl#getChlamydiatrachomatisTreatmentNotGivenSubstanceAdministration()
	 * @generated
	 */
	int CHLAMYDIATRACHOMATIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION = 9;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__REALM_CODE = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__TYPE_ID = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__TEMPLATE_ID = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__ID = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__CODE = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__CODE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__TEXT = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__STATUS_CODE = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__EFFECTIVE_TIME = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__PRIORITY_CODE = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__REPEAT_NUMBER = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Route Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__ROUTE_CODE = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__ROUTE_CODE;

	/**
	 * The feature id for the '<em><b>Approach Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__APPROACH_SITE_CODE = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__APPROACH_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Dose Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DOSE_QUANTITY = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DOSE_QUANTITY;

	/**
	 * The feature id for the '<em><b>Rate Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__RATE_QUANTITY = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__RATE_QUANTITY;

	/**
	 * The feature id for the '<em><b>Max Dose Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__MAX_DOSE_QUANTITY = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__MAX_DOSE_QUANTITY;

	/**
	 * The feature id for the '<em><b>Administration Unit Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__ADMINISTRATION_UNIT_CODE = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__ADMINISTRATION_UNIT_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__SUBJECT = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__SPECIMEN = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Consumable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__CONSUMABLE = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__CONSUMABLE;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__PERFORMER = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__AUTHOR = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__INFORMANT = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__PARTICIPANT = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__ENTRY_RELATIONSHIP = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__REFERENCE = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__PRECONDITION = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__NULL_FLAVOR = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__CLASS_CODE = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__MOOD_CODE = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__NEGATION_IND = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Treatment Not Given Substance Administration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHLAMYDIATRACHOMATIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_FEATURE_COUNT = PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPublicHealthCaseReport <em>Public Health Case Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Public Health Case Report</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPublicHealthCaseReport
	 * @generated
	 */
	EClass getChlamydiatrachomatisPublicHealthCaseReport();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPHCRClinicalInformationSection <em>PHCR Clinical Information Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PHCR Clinical Information Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPHCRClinicalInformationSection
	 * @generated
	 */
	EClass getChlamydiatrachomatisPHCRClinicalInformationSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisCaseObservation <em>Case Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisCaseObservation
	 * @generated
	 */
	EClass getChlamydiatrachomatisCaseObservation();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPHCRRelevantDxTestsSection <em>PHCR Relevant Dx Tests Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PHCR Relevant Dx Tests Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPHCRRelevantDxTestsSection
	 * @generated
	 */
	EClass getChlamydiatrachomatisPHCRRelevantDxTestsSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisResultObservation <em>Result Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisResultObservation
	 * @generated
	 */
	EClass getChlamydiatrachomatisResultObservation();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.chlamydiatrachomatisResultOrganizer <em>chlamydiatrachomatis Result Organizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>chlamydiatrachomatis Result Organizer</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.chlamydiatrachomatisResultOrganizer
	 * @generated
	 */
	EClass getchlamydiatrachomatisResultOrganizer();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPHCRTreatmentInformationSection <em>PHCR Treatment Information Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PHCR Treatment Information Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPHCRTreatmentInformationSection
	 * @generated
	 */
	EClass getChlamydiatrachomatisPHCRTreatmentInformationSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisTherapeuticRegimenAct <em>Therapeutic Regimen Act</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Therapeutic Regimen Act</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisTherapeuticRegimenAct
	 * @generated
	 */
	EClass getChlamydiatrachomatisTherapeuticRegimenAct();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisTreatmentGivenSubstanceAdministration <em>Treatment Given Substance Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Treatment Given Substance Administration</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisTreatmentGivenSubstanceAdministration
	 * @generated
	 */
	EClass getChlamydiatrachomatisTreatmentGivenSubstanceAdministration();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisTreatmentNotGivenSubstanceAdministration <em>Treatment Not Given Substance Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Treatment Not Given Substance Administration</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisTreatmentNotGivenSubstanceAdministration
	 * @generated
	 */
	EClass getChlamydiatrachomatisTreatmentNotGivenSubstanceAdministration();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ChlamydiatrachomatisFactory getChlamydiatrachomatisFactory();

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
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl.ChlamydiatrachomatisPublicHealthCaseReportImpl <em>Public Health Case Report</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl.ChlamydiatrachomatisPublicHealthCaseReportImpl
		 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl.ChlamydiatrachomatisPackageImpl#getChlamydiatrachomatisPublicHealthCaseReport()
		 * @generated
		 */
		EClass CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT = eINSTANCE.getChlamydiatrachomatisPublicHealthCaseReport();
		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl.ChlamydiatrachomatisPHCRClinicalInformationSectionImpl <em>PHCR Clinical Information Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl.ChlamydiatrachomatisPHCRClinicalInformationSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl.ChlamydiatrachomatisPackageImpl#getChlamydiatrachomatisPHCRClinicalInformationSection()
		 * @generated
		 */
		EClass CHLAMYDIATRACHOMATIS_PHCR_CLINICAL_INFORMATION_SECTION = eINSTANCE.getChlamydiatrachomatisPHCRClinicalInformationSection();
		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl.ChlamydiatrachomatisCaseObservationImpl <em>Case Observation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl.ChlamydiatrachomatisCaseObservationImpl
		 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl.ChlamydiatrachomatisPackageImpl#getChlamydiatrachomatisCaseObservation()
		 * @generated
		 */
		EClass CHLAMYDIATRACHOMATIS_CASE_OBSERVATION = eINSTANCE.getChlamydiatrachomatisCaseObservation();
		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl.ChlamydiatrachomatisPHCRRelevantDxTestsSectionImpl <em>PHCR Relevant Dx Tests Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl.ChlamydiatrachomatisPHCRRelevantDxTestsSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl.ChlamydiatrachomatisPackageImpl#getChlamydiatrachomatisPHCRRelevantDxTestsSection()
		 * @generated
		 */
		EClass CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION = eINSTANCE.getChlamydiatrachomatisPHCRRelevantDxTestsSection();
		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl.ChlamydiatrachomatisResultObservationImpl <em>Result Observation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl.ChlamydiatrachomatisResultObservationImpl
		 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl.ChlamydiatrachomatisPackageImpl#getChlamydiatrachomatisResultObservation()
		 * @generated
		 */
		EClass CHLAMYDIATRACHOMATIS_RESULT_OBSERVATION = eINSTANCE.getChlamydiatrachomatisResultObservation();
		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl.chlamydiatrachomatisResultOrganizerImpl <em>chlamydiatrachomatis Result Organizer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl.chlamydiatrachomatisResultOrganizerImpl
		 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl.ChlamydiatrachomatisPackageImpl#getchlamydiatrachomatisResultOrganizer()
		 * @generated
		 */
		EClass CHLAMYDIATRACHOMATIS_RESULT_ORGANIZER = eINSTANCE.getchlamydiatrachomatisResultOrganizer();
		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl.ChlamydiatrachomatisPHCRTreatmentInformationSectionImpl <em>PHCR Treatment Information Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl.ChlamydiatrachomatisPHCRTreatmentInformationSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl.ChlamydiatrachomatisPackageImpl#getChlamydiatrachomatisPHCRTreatmentInformationSection()
		 * @generated
		 */
		EClass CHLAMYDIATRACHOMATIS_PHCR_TREATMENT_INFORMATION_SECTION = eINSTANCE.getChlamydiatrachomatisPHCRTreatmentInformationSection();
		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl.ChlamydiatrachomatisTherapeuticRegimenActImpl <em>Therapeutic Regimen Act</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl.ChlamydiatrachomatisTherapeuticRegimenActImpl
		 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl.ChlamydiatrachomatisPackageImpl#getChlamydiatrachomatisTherapeuticRegimenAct()
		 * @generated
		 */
		EClass CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT = eINSTANCE.getChlamydiatrachomatisTherapeuticRegimenAct();
		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl.ChlamydiatrachomatisTreatmentGivenSubstanceAdministrationImpl <em>Treatment Given Substance Administration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl.ChlamydiatrachomatisTreatmentGivenSubstanceAdministrationImpl
		 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl.ChlamydiatrachomatisPackageImpl#getChlamydiatrachomatisTreatmentGivenSubstanceAdministration()
		 * @generated
		 */
		EClass CHLAMYDIATRACHOMATIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION = eINSTANCE.getChlamydiatrachomatisTreatmentGivenSubstanceAdministration();
		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl.ChlamydiatrachomatisTreatmentNotGivenSubstanceAdministrationImpl <em>Treatment Not Given Substance Administration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl.ChlamydiatrachomatisTreatmentNotGivenSubstanceAdministrationImpl
		 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl.ChlamydiatrachomatisPackageImpl#getChlamydiatrachomatisTreatmentNotGivenSubstanceAdministration()
		 * @generated
		 */
		EClass CHLAMYDIATRACHOMATIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION = eINSTANCE.getChlamydiatrachomatisTreatmentNotGivenSubstanceAdministration();

	}

} //ChlamydiatrachomatisPackage
