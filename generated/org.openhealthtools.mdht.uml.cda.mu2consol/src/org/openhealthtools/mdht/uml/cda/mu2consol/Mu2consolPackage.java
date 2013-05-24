/*******************************************************************************
 * Copyright (c) 2012 Rama Ramakrishnan and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Rama Ramakrishnan (Agilex Corporation) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.mu2consol;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolFactory
 * @model kind="package"
 *        annotation="http://www.openhealthtools.org/mdht/uml initializers='org.openhealthtools.mdht.uml.cda.mu2consol'"
 * @generated
 */
public interface Mu2consolPackage extends EPackage {
	/**
     * The package name.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	String eNAME = "mu2consol";

	/**
     * The package namespace URI.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	String eNS_URI = "http://www.openhealthtools.org/mdht/uml/cda/mu2consol";

	/**
     * The package namespace name.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	String eNS_PREFIX = "mu2consol";

	/**
     * The singleton instance of the package.
     * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
     * @generated
     */
	Mu2consolPackage eINSTANCE = org.openhealthtools.mdht.uml.cda.mu2consol.impl.Mu2consolPackageImpl.init();

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.mu2consol.impl.GeneralHeaderConstraintsImpl <em>General Header Constraints</em>}' class.
     * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.GeneralHeaderConstraintsImpl
     * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.Mu2consolPackageImpl#getGeneralHeaderConstraints()
     * @generated
     */
	int GENERAL_HEADER_CONSTRAINTS = 0;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GENERAL_HEADER_CONSTRAINTS__REALM_CODE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GENERAL_HEADER_CONSTRAINTS__TYPE_ID = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GENERAL_HEADER_CONSTRAINTS__TEMPLATE_ID = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__ID = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__CODE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__CODE;

	/**
     * The feature id for the '<em><b>Title</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GENERAL_HEADER_CONSTRAINTS__TITLE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__TITLE;

	/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GENERAL_HEADER_CONSTRAINTS__EFFECTIVE_TIME = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__EFFECTIVE_TIME;

	/**
     * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GENERAL_HEADER_CONSTRAINTS__CONFIDENTIALITY_CODE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__CONFIDENTIALITY_CODE;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GENERAL_HEADER_CONSTRAINTS__LANGUAGE_CODE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Set Id</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GENERAL_HEADER_CONSTRAINTS__SET_ID = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__SET_ID;

	/**
     * The feature id for the '<em><b>Version Number</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GENERAL_HEADER_CONSTRAINTS__VERSION_NUMBER = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__VERSION_NUMBER;

	/**
     * The feature id for the '<em><b>Copy Time</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GENERAL_HEADER_CONSTRAINTS__COPY_TIME = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__COPY_TIME;

	/**
     * The feature id for the '<em><b>Record Target</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GENERAL_HEADER_CONSTRAINTS__RECORD_TARGET = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__RECORD_TARGET;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GENERAL_HEADER_CONSTRAINTS__AUTHOR = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__AUTHOR;

	/**
     * The feature id for the '<em><b>Data Enterer</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GENERAL_HEADER_CONSTRAINTS__DATA_ENTERER = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__DATA_ENTERER;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GENERAL_HEADER_CONSTRAINTS__INFORMANT = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__INFORMANT;

	/**
     * The feature id for the '<em><b>Custodian</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GENERAL_HEADER_CONSTRAINTS__CUSTODIAN = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__CUSTODIAN;

	/**
     * The feature id for the '<em><b>Information Recipient</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GENERAL_HEADER_CONSTRAINTS__INFORMATION_RECIPIENT = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__INFORMATION_RECIPIENT;

	/**
     * The feature id for the '<em><b>Legal Authenticator</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GENERAL_HEADER_CONSTRAINTS__LEGAL_AUTHENTICATOR = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__LEGAL_AUTHENTICATOR;

	/**
     * The feature id for the '<em><b>Authenticator</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GENERAL_HEADER_CONSTRAINTS__AUTHENTICATOR = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__AUTHENTICATOR;

	/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GENERAL_HEADER_CONSTRAINTS__PARTICIPANT = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__PARTICIPANT;

	/**
     * The feature id for the '<em><b>In Fulfillment Of</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GENERAL_HEADER_CONSTRAINTS__IN_FULFILLMENT_OF = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__IN_FULFILLMENT_OF;

	/**
     * The feature id for the '<em><b>Documentation Of</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GENERAL_HEADER_CONSTRAINTS__DOCUMENTATION_OF = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__DOCUMENTATION_OF;

	/**
     * The feature id for the '<em><b>Related Document</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GENERAL_HEADER_CONSTRAINTS__RELATED_DOCUMENT = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__RELATED_DOCUMENT;

	/**
     * The feature id for the '<em><b>Authorization</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GENERAL_HEADER_CONSTRAINTS__AUTHORIZATION = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__AUTHORIZATION;

	/**
     * The feature id for the '<em><b>Component Of</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GENERAL_HEADER_CONSTRAINTS__COMPONENT_OF = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__COMPONENT_OF;

	/**
     * The feature id for the '<em><b>Component</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GENERAL_HEADER_CONSTRAINTS__COMPONENT = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__COMPONENT;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__NULL_FLAVOR = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__CLASS_CODE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__MOOD_CODE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__MOOD_CODE;

	/**
     * The number of structural features of the '<em>General Header Constraints</em>' class.
     * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
     * @generated
     * @ordered
     */
	int GENERAL_HEADER_CONSTRAINTS_FEATURE_COUNT = ConsolPackage.GENERAL_HEADER_CONSTRAINTS_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.mu2consol.impl.SummaryOfCareRecordImpl <em>Summary Of Care Record</em>}' class.
     * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.SummaryOfCareRecordImpl
     * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.Mu2consolPackageImpl#getSummaryOfCareRecord()
     * @generated
     */
	int SUMMARY_OF_CARE_RECORD = 1;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SUMMARY_OF_CARE_RECORD__REALM_CODE = GENERAL_HEADER_CONSTRAINTS__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SUMMARY_OF_CARE_RECORD__TYPE_ID = GENERAL_HEADER_CONSTRAINTS__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SUMMARY_OF_CARE_RECORD__TEMPLATE_ID = GENERAL_HEADER_CONSTRAINTS__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUMMARY_OF_CARE_RECORD__ID = GENERAL_HEADER_CONSTRAINTS__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUMMARY_OF_CARE_RECORD__CODE = GENERAL_HEADER_CONSTRAINTS__CODE;

	/**
     * The feature id for the '<em><b>Title</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SUMMARY_OF_CARE_RECORD__TITLE = GENERAL_HEADER_CONSTRAINTS__TITLE;

	/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SUMMARY_OF_CARE_RECORD__EFFECTIVE_TIME = GENERAL_HEADER_CONSTRAINTS__EFFECTIVE_TIME;

	/**
     * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SUMMARY_OF_CARE_RECORD__CONFIDENTIALITY_CODE = GENERAL_HEADER_CONSTRAINTS__CONFIDENTIALITY_CODE;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SUMMARY_OF_CARE_RECORD__LANGUAGE_CODE = GENERAL_HEADER_CONSTRAINTS__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Set Id</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SUMMARY_OF_CARE_RECORD__SET_ID = GENERAL_HEADER_CONSTRAINTS__SET_ID;

	/**
     * The feature id for the '<em><b>Version Number</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SUMMARY_OF_CARE_RECORD__VERSION_NUMBER = GENERAL_HEADER_CONSTRAINTS__VERSION_NUMBER;

	/**
     * The feature id for the '<em><b>Copy Time</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SUMMARY_OF_CARE_RECORD__COPY_TIME = GENERAL_HEADER_CONSTRAINTS__COPY_TIME;

	/**
     * The feature id for the '<em><b>Record Target</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SUMMARY_OF_CARE_RECORD__RECORD_TARGET = GENERAL_HEADER_CONSTRAINTS__RECORD_TARGET;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SUMMARY_OF_CARE_RECORD__AUTHOR = GENERAL_HEADER_CONSTRAINTS__AUTHOR;

	/**
     * The feature id for the '<em><b>Data Enterer</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SUMMARY_OF_CARE_RECORD__DATA_ENTERER = GENERAL_HEADER_CONSTRAINTS__DATA_ENTERER;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SUMMARY_OF_CARE_RECORD__INFORMANT = GENERAL_HEADER_CONSTRAINTS__INFORMANT;

	/**
     * The feature id for the '<em><b>Custodian</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SUMMARY_OF_CARE_RECORD__CUSTODIAN = GENERAL_HEADER_CONSTRAINTS__CUSTODIAN;

	/**
     * The feature id for the '<em><b>Information Recipient</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SUMMARY_OF_CARE_RECORD__INFORMATION_RECIPIENT = GENERAL_HEADER_CONSTRAINTS__INFORMATION_RECIPIENT;

	/**
     * The feature id for the '<em><b>Legal Authenticator</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SUMMARY_OF_CARE_RECORD__LEGAL_AUTHENTICATOR = GENERAL_HEADER_CONSTRAINTS__LEGAL_AUTHENTICATOR;

	/**
     * The feature id for the '<em><b>Authenticator</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SUMMARY_OF_CARE_RECORD__AUTHENTICATOR = GENERAL_HEADER_CONSTRAINTS__AUTHENTICATOR;

	/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SUMMARY_OF_CARE_RECORD__PARTICIPANT = GENERAL_HEADER_CONSTRAINTS__PARTICIPANT;

	/**
     * The feature id for the '<em><b>In Fulfillment Of</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SUMMARY_OF_CARE_RECORD__IN_FULFILLMENT_OF = GENERAL_HEADER_CONSTRAINTS__IN_FULFILLMENT_OF;

	/**
     * The feature id for the '<em><b>Documentation Of</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SUMMARY_OF_CARE_RECORD__DOCUMENTATION_OF = GENERAL_HEADER_CONSTRAINTS__DOCUMENTATION_OF;

	/**
     * The feature id for the '<em><b>Related Document</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SUMMARY_OF_CARE_RECORD__RELATED_DOCUMENT = GENERAL_HEADER_CONSTRAINTS__RELATED_DOCUMENT;

	/**
     * The feature id for the '<em><b>Authorization</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SUMMARY_OF_CARE_RECORD__AUTHORIZATION = GENERAL_HEADER_CONSTRAINTS__AUTHORIZATION;

	/**
     * The feature id for the '<em><b>Component Of</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SUMMARY_OF_CARE_RECORD__COMPONENT_OF = GENERAL_HEADER_CONSTRAINTS__COMPONENT_OF;

	/**
     * The feature id for the '<em><b>Component</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SUMMARY_OF_CARE_RECORD__COMPONENT = GENERAL_HEADER_CONSTRAINTS__COMPONENT;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUMMARY_OF_CARE_RECORD__NULL_FLAVOR = GENERAL_HEADER_CONSTRAINTS__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUMMARY_OF_CARE_RECORD__CLASS_CODE = GENERAL_HEADER_CONSTRAINTS__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUMMARY_OF_CARE_RECORD__MOOD_CODE = GENERAL_HEADER_CONSTRAINTS__MOOD_CODE;

	/**
     * The number of structural features of the '<em>Summary Of Care Record</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SUMMARY_OF_CARE_RECORD_FEATURE_COUNT = GENERAL_HEADER_CONSTRAINTS_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.mu2consol.impl.SocialHistorySectionImpl <em>Social History Section</em>}' class.
     * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.SocialHistorySectionImpl
     * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.Mu2consolPackageImpl#getSocialHistorySection()
     * @generated
     */
	int SOCIAL_HISTORY_SECTION = 2;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SOCIAL_HISTORY_SECTION__REALM_CODE = ConsolPackage.SOCIAL_HISTORY_SECTION__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SOCIAL_HISTORY_SECTION__TYPE_ID = ConsolPackage.SOCIAL_HISTORY_SECTION__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SOCIAL_HISTORY_SECTION__TEMPLATE_ID = ConsolPackage.SOCIAL_HISTORY_SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_SECTION__ID = ConsolPackage.SOCIAL_HISTORY_SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_SECTION__CODE = ConsolPackage.SOCIAL_HISTORY_SECTION__CODE;

	/**
     * The feature id for the '<em><b>Title</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SOCIAL_HISTORY_SECTION__TITLE = ConsolPackage.SOCIAL_HISTORY_SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_SECTION__TEXT = ConsolPackage.SOCIAL_HISTORY_SECTION__TEXT;

	/**
     * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SOCIAL_HISTORY_SECTION__CONFIDENTIALITY_CODE = ConsolPackage.SOCIAL_HISTORY_SECTION__CONFIDENTIALITY_CODE;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SOCIAL_HISTORY_SECTION__LANGUAGE_CODE = ConsolPackage.SOCIAL_HISTORY_SECTION__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SOCIAL_HISTORY_SECTION__SUBJECT = ConsolPackage.SOCIAL_HISTORY_SECTION__SUBJECT;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SOCIAL_HISTORY_SECTION__AUTHOR = ConsolPackage.SOCIAL_HISTORY_SECTION__AUTHOR;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SOCIAL_HISTORY_SECTION__INFORMANT = ConsolPackage.SOCIAL_HISTORY_SECTION__INFORMANT;

	/**
     * The feature id for the '<em><b>Entry</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SOCIAL_HISTORY_SECTION__ENTRY = ConsolPackage.SOCIAL_HISTORY_SECTION__ENTRY;

	/**
     * The feature id for the '<em><b>Component</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SOCIAL_HISTORY_SECTION__COMPONENT = ConsolPackage.SOCIAL_HISTORY_SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_SECTION__SECTION_ID = ConsolPackage.SOCIAL_HISTORY_SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_SECTION__NULL_FLAVOR = ConsolPackage.SOCIAL_HISTORY_SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_SECTION__CLASS_CODE = ConsolPackage.SOCIAL_HISTORY_SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOCIAL_HISTORY_SECTION__MOOD_CODE = ConsolPackage.SOCIAL_HISTORY_SECTION__MOOD_CODE;

	/**
     * The number of structural features of the '<em>Social History Section</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SOCIAL_HISTORY_SECTION_FEATURE_COUNT = ConsolPackage.SOCIAL_HISTORY_SECTION_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.mu2consol.impl.SmokingStatusObservationImpl <em>Smoking Status Observation</em>}' class.
     * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.SmokingStatusObservationImpl
     * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.Mu2consolPackageImpl#getSmokingStatusObservation()
     * @generated
     */
	int SMOKING_STATUS_OBSERVATION = 3;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SMOKING_STATUS_OBSERVATION__REALM_CODE = ConsolPackage.TOBACCO_USE__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SMOKING_STATUS_OBSERVATION__TYPE_ID = ConsolPackage.TOBACCO_USE__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SMOKING_STATUS_OBSERVATION__TEMPLATE_ID = ConsolPackage.TOBACCO_USE__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SMOKING_STATUS_OBSERVATION__ID = ConsolPackage.TOBACCO_USE__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SMOKING_STATUS_OBSERVATION__CODE = ConsolPackage.TOBACCO_USE__CODE;

	/**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SMOKING_STATUS_OBSERVATION__DERIVATION_EXPR = ConsolPackage.TOBACCO_USE__DERIVATION_EXPR;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SMOKING_STATUS_OBSERVATION__TEXT = ConsolPackage.TOBACCO_USE__TEXT;

	/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SMOKING_STATUS_OBSERVATION__STATUS_CODE = ConsolPackage.TOBACCO_USE__STATUS_CODE;

	/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SMOKING_STATUS_OBSERVATION__EFFECTIVE_TIME = ConsolPackage.TOBACCO_USE__EFFECTIVE_TIME;

	/**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SMOKING_STATUS_OBSERVATION__PRIORITY_CODE = ConsolPackage.TOBACCO_USE__PRIORITY_CODE;

	/**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SMOKING_STATUS_OBSERVATION__REPEAT_NUMBER = ConsolPackage.TOBACCO_USE__REPEAT_NUMBER;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SMOKING_STATUS_OBSERVATION__LANGUAGE_CODE = ConsolPackage.TOBACCO_USE__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SMOKING_STATUS_OBSERVATION__VALUE = ConsolPackage.TOBACCO_USE__VALUE;

	/**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SMOKING_STATUS_OBSERVATION__INTERPRETATION_CODE = ConsolPackage.TOBACCO_USE__INTERPRETATION_CODE;

	/**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SMOKING_STATUS_OBSERVATION__METHOD_CODE = ConsolPackage.TOBACCO_USE__METHOD_CODE;

	/**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SMOKING_STATUS_OBSERVATION__TARGET_SITE_CODE = ConsolPackage.TOBACCO_USE__TARGET_SITE_CODE;

	/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SMOKING_STATUS_OBSERVATION__SUBJECT = ConsolPackage.TOBACCO_USE__SUBJECT;

	/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SMOKING_STATUS_OBSERVATION__SPECIMEN = ConsolPackage.TOBACCO_USE__SPECIMEN;

	/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SMOKING_STATUS_OBSERVATION__PERFORMER = ConsolPackage.TOBACCO_USE__PERFORMER;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SMOKING_STATUS_OBSERVATION__AUTHOR = ConsolPackage.TOBACCO_USE__AUTHOR;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SMOKING_STATUS_OBSERVATION__INFORMANT = ConsolPackage.TOBACCO_USE__INFORMANT;

	/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SMOKING_STATUS_OBSERVATION__PARTICIPANT = ConsolPackage.TOBACCO_USE__PARTICIPANT;

	/**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SMOKING_STATUS_OBSERVATION__ENTRY_RELATIONSHIP = ConsolPackage.TOBACCO_USE__ENTRY_RELATIONSHIP;

	/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SMOKING_STATUS_OBSERVATION__REFERENCE = ConsolPackage.TOBACCO_USE__REFERENCE;

	/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SMOKING_STATUS_OBSERVATION__PRECONDITION = ConsolPackage.TOBACCO_USE__PRECONDITION;

	/**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SMOKING_STATUS_OBSERVATION__REFERENCE_RANGE = ConsolPackage.TOBACCO_USE__REFERENCE_RANGE;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SMOKING_STATUS_OBSERVATION__NULL_FLAVOR = ConsolPackage.TOBACCO_USE__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SMOKING_STATUS_OBSERVATION__CLASS_CODE = ConsolPackage.TOBACCO_USE__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SMOKING_STATUS_OBSERVATION__MOOD_CODE = ConsolPackage.TOBACCO_USE__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SMOKING_STATUS_OBSERVATION__NEGATION_IND = ConsolPackage.TOBACCO_USE__NEGATION_IND;

	/**
     * The number of structural features of the '<em>Smoking Status Observation</em>' class.
     * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
     * @generated
     * @ordered
     */
	int SMOKING_STATUS_OBSERVATION_FEATURE_COUNT = ConsolPackage.TOBACCO_USE_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.mu2consol.impl.ResultsSectionImpl <em>Results Section</em>}' class.
     * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.ResultsSectionImpl
     * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.Mu2consolPackageImpl#getResultsSection()
     * @generated
     */
	int RESULTS_SECTION = 4;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESULTS_SECTION__REALM_CODE = ConsolPackage.RESULTS_SECTION__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESULTS_SECTION__TYPE_ID = ConsolPackage.RESULTS_SECTION__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESULTS_SECTION__TEMPLATE_ID = ConsolPackage.RESULTS_SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESULTS_SECTION__ID = ConsolPackage.RESULTS_SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESULTS_SECTION__CODE = ConsolPackage.RESULTS_SECTION__CODE;

	/**
     * The feature id for the '<em><b>Title</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESULTS_SECTION__TITLE = ConsolPackage.RESULTS_SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESULTS_SECTION__TEXT = ConsolPackage.RESULTS_SECTION__TEXT;

	/**
     * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESULTS_SECTION__CONFIDENTIALITY_CODE = ConsolPackage.RESULTS_SECTION__CONFIDENTIALITY_CODE;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESULTS_SECTION__LANGUAGE_CODE = ConsolPackage.RESULTS_SECTION__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESULTS_SECTION__SUBJECT = ConsolPackage.RESULTS_SECTION__SUBJECT;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESULTS_SECTION__AUTHOR = ConsolPackage.RESULTS_SECTION__AUTHOR;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESULTS_SECTION__INFORMANT = ConsolPackage.RESULTS_SECTION__INFORMANT;

	/**
     * The feature id for the '<em><b>Entry</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESULTS_SECTION__ENTRY = ConsolPackage.RESULTS_SECTION__ENTRY;

	/**
     * The feature id for the '<em><b>Component</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESULTS_SECTION__COMPONENT = ConsolPackage.RESULTS_SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESULTS_SECTION__SECTION_ID = ConsolPackage.RESULTS_SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESULTS_SECTION__NULL_FLAVOR = ConsolPackage.RESULTS_SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESULTS_SECTION__CLASS_CODE = ConsolPackage.RESULTS_SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESULTS_SECTION__MOOD_CODE = ConsolPackage.RESULTS_SECTION__MOOD_CODE;

	/**
     * The number of structural features of the '<em>Results Section</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESULTS_SECTION_FEATURE_COUNT = ConsolPackage.RESULTS_SECTION_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.mu2consol.impl.ResultOrganizerImpl <em>Result Organizer</em>}' class.
     * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.ResultOrganizerImpl
     * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.Mu2consolPackageImpl#getResultOrganizer()
     * @generated
     */
	int RESULT_ORGANIZER = 5;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESULT_ORGANIZER__REALM_CODE = ConsolPackage.RESULT_ORGANIZER__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESULT_ORGANIZER__TYPE_ID = ConsolPackage.RESULT_ORGANIZER__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESULT_ORGANIZER__TEMPLATE_ID = ConsolPackage.RESULT_ORGANIZER__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESULT_ORGANIZER__ID = ConsolPackage.RESULT_ORGANIZER__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESULT_ORGANIZER__CODE = ConsolPackage.RESULT_ORGANIZER__CODE;

	/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESULT_ORGANIZER__STATUS_CODE = ConsolPackage.RESULT_ORGANIZER__STATUS_CODE;

	/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESULT_ORGANIZER__EFFECTIVE_TIME = ConsolPackage.RESULT_ORGANIZER__EFFECTIVE_TIME;

	/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESULT_ORGANIZER__SUBJECT = ConsolPackage.RESULT_ORGANIZER__SUBJECT;

	/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESULT_ORGANIZER__SPECIMEN = ConsolPackage.RESULT_ORGANIZER__SPECIMEN;

	/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESULT_ORGANIZER__PERFORMER = ConsolPackage.RESULT_ORGANIZER__PERFORMER;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESULT_ORGANIZER__AUTHOR = ConsolPackage.RESULT_ORGANIZER__AUTHOR;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESULT_ORGANIZER__INFORMANT = ConsolPackage.RESULT_ORGANIZER__INFORMANT;

	/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESULT_ORGANIZER__PARTICIPANT = ConsolPackage.RESULT_ORGANIZER__PARTICIPANT;

	/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESULT_ORGANIZER__REFERENCE = ConsolPackage.RESULT_ORGANIZER__REFERENCE;

	/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESULT_ORGANIZER__PRECONDITION = ConsolPackage.RESULT_ORGANIZER__PRECONDITION;

	/**
     * The feature id for the '<em><b>Component</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESULT_ORGANIZER__COMPONENT = ConsolPackage.RESULT_ORGANIZER__COMPONENT;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESULT_ORGANIZER__NULL_FLAVOR = ConsolPackage.RESULT_ORGANIZER__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESULT_ORGANIZER__CLASS_CODE = ConsolPackage.RESULT_ORGANIZER__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESULT_ORGANIZER__MOOD_CODE = ConsolPackage.RESULT_ORGANIZER__MOOD_CODE;

	/**
     * The number of structural features of the '<em>Result Organizer</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESULT_ORGANIZER_FEATURE_COUNT = ConsolPackage.RESULT_ORGANIZER_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.mu2consol.impl.ResultObservationImpl <em>Result Observation</em>}' class.
     * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.ResultObservationImpl
     * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.Mu2consolPackageImpl#getResultObservation()
     * @generated
     */
	int RESULT_OBSERVATION = 6;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESULT_OBSERVATION__REALM_CODE = ConsolPackage.RESULT_OBSERVATION__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESULT_OBSERVATION__TYPE_ID = ConsolPackage.RESULT_OBSERVATION__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESULT_OBSERVATION__TEMPLATE_ID = ConsolPackage.RESULT_OBSERVATION__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESULT_OBSERVATION__ID = ConsolPackage.RESULT_OBSERVATION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESULT_OBSERVATION__CODE = ConsolPackage.RESULT_OBSERVATION__CODE;

	/**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESULT_OBSERVATION__DERIVATION_EXPR = ConsolPackage.RESULT_OBSERVATION__DERIVATION_EXPR;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESULT_OBSERVATION__TEXT = ConsolPackage.RESULT_OBSERVATION__TEXT;

	/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESULT_OBSERVATION__STATUS_CODE = ConsolPackage.RESULT_OBSERVATION__STATUS_CODE;

	/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESULT_OBSERVATION__EFFECTIVE_TIME = ConsolPackage.RESULT_OBSERVATION__EFFECTIVE_TIME;

	/**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESULT_OBSERVATION__PRIORITY_CODE = ConsolPackage.RESULT_OBSERVATION__PRIORITY_CODE;

	/**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESULT_OBSERVATION__REPEAT_NUMBER = ConsolPackage.RESULT_OBSERVATION__REPEAT_NUMBER;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESULT_OBSERVATION__LANGUAGE_CODE = ConsolPackage.RESULT_OBSERVATION__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESULT_OBSERVATION__VALUE = ConsolPackage.RESULT_OBSERVATION__VALUE;

	/**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESULT_OBSERVATION__INTERPRETATION_CODE = ConsolPackage.RESULT_OBSERVATION__INTERPRETATION_CODE;

	/**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESULT_OBSERVATION__METHOD_CODE = ConsolPackage.RESULT_OBSERVATION__METHOD_CODE;

	/**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESULT_OBSERVATION__TARGET_SITE_CODE = ConsolPackage.RESULT_OBSERVATION__TARGET_SITE_CODE;

	/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESULT_OBSERVATION__SUBJECT = ConsolPackage.RESULT_OBSERVATION__SUBJECT;

	/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESULT_OBSERVATION__SPECIMEN = ConsolPackage.RESULT_OBSERVATION__SPECIMEN;

	/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESULT_OBSERVATION__PERFORMER = ConsolPackage.RESULT_OBSERVATION__PERFORMER;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESULT_OBSERVATION__AUTHOR = ConsolPackage.RESULT_OBSERVATION__AUTHOR;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESULT_OBSERVATION__INFORMANT = ConsolPackage.RESULT_OBSERVATION__INFORMANT;

	/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESULT_OBSERVATION__PARTICIPANT = ConsolPackage.RESULT_OBSERVATION__PARTICIPANT;

	/**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESULT_OBSERVATION__ENTRY_RELATIONSHIP = ConsolPackage.RESULT_OBSERVATION__ENTRY_RELATIONSHIP;

	/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESULT_OBSERVATION__REFERENCE = ConsolPackage.RESULT_OBSERVATION__REFERENCE;

	/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESULT_OBSERVATION__PRECONDITION = ConsolPackage.RESULT_OBSERVATION__PRECONDITION;

	/**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESULT_OBSERVATION__REFERENCE_RANGE = ConsolPackage.RESULT_OBSERVATION__REFERENCE_RANGE;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESULT_OBSERVATION__NULL_FLAVOR = ConsolPackage.RESULT_OBSERVATION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESULT_OBSERVATION__CLASS_CODE = ConsolPackage.RESULT_OBSERVATION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESULT_OBSERVATION__MOOD_CODE = ConsolPackage.RESULT_OBSERVATION__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESULT_OBSERVATION__NEGATION_IND = ConsolPackage.RESULT_OBSERVATION__NEGATION_IND;

	/**
     * The number of structural features of the '<em>Result Observation</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESULT_OBSERVATION_FEATURE_COUNT = ConsolPackage.RESULT_OBSERVATION_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.mu2consol.impl.ProceduresSectionImpl <em>Procedures Section</em>}' class.
     * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.ProceduresSectionImpl
     * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.Mu2consolPackageImpl#getProceduresSection()
     * @generated
     */
	int PROCEDURES_SECTION = 7;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROCEDURES_SECTION__REALM_CODE = ConsolPackage.PROCEDURES_SECTION__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROCEDURES_SECTION__TYPE_ID = ConsolPackage.PROCEDURES_SECTION__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROCEDURES_SECTION__TEMPLATE_ID = ConsolPackage.PROCEDURES_SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROCEDURES_SECTION__ID = ConsolPackage.PROCEDURES_SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROCEDURES_SECTION__CODE = ConsolPackage.PROCEDURES_SECTION__CODE;

	/**
     * The feature id for the '<em><b>Title</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROCEDURES_SECTION__TITLE = ConsolPackage.PROCEDURES_SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROCEDURES_SECTION__TEXT = ConsolPackage.PROCEDURES_SECTION__TEXT;

	/**
     * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROCEDURES_SECTION__CONFIDENTIALITY_CODE = ConsolPackage.PROCEDURES_SECTION__CONFIDENTIALITY_CODE;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROCEDURES_SECTION__LANGUAGE_CODE = ConsolPackage.PROCEDURES_SECTION__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROCEDURES_SECTION__SUBJECT = ConsolPackage.PROCEDURES_SECTION__SUBJECT;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROCEDURES_SECTION__AUTHOR = ConsolPackage.PROCEDURES_SECTION__AUTHOR;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROCEDURES_SECTION__INFORMANT = ConsolPackage.PROCEDURES_SECTION__INFORMANT;

	/**
     * The feature id for the '<em><b>Entry</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROCEDURES_SECTION__ENTRY = ConsolPackage.PROCEDURES_SECTION__ENTRY;

	/**
     * The feature id for the '<em><b>Component</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROCEDURES_SECTION__COMPONENT = ConsolPackage.PROCEDURES_SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROCEDURES_SECTION__SECTION_ID = ConsolPackage.PROCEDURES_SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROCEDURES_SECTION__NULL_FLAVOR = ConsolPackage.PROCEDURES_SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROCEDURES_SECTION__CLASS_CODE = ConsolPackage.PROCEDURES_SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROCEDURES_SECTION__MOOD_CODE = ConsolPackage.PROCEDURES_SECTION__MOOD_CODE;

	/**
     * The number of structural features of the '<em>Procedures Section</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROCEDURES_SECTION_FEATURE_COUNT = ConsolPackage.PROCEDURES_SECTION_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.mu2consol.impl.ProcedureActivityProcedureImpl <em>Procedure Activity Procedure</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.ProcedureActivityProcedureImpl
     * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.Mu2consolPackageImpl#getProcedureActivityProcedure()
     * @generated
     */
	int PROCEDURE_ACTIVITY_PROCEDURE = 8;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROCEDURE_ACTIVITY_PROCEDURE__REALM_CODE = ConsolPackage.PROCEDURE_ACTIVITY_PROCEDURE__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROCEDURE_ACTIVITY_PROCEDURE__TYPE_ID = ConsolPackage.PROCEDURE_ACTIVITY_PROCEDURE__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROCEDURE_ACTIVITY_PROCEDURE__TEMPLATE_ID = ConsolPackage.PROCEDURE_ACTIVITY_PROCEDURE__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROCEDURE_ACTIVITY_PROCEDURE__ID = ConsolPackage.PROCEDURE_ACTIVITY_PROCEDURE__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_ACTIVITY_PROCEDURE__CODE = ConsolPackage.PROCEDURE_ACTIVITY_PROCEDURE__CODE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_ACTIVITY_PROCEDURE__TEXT = ConsolPackage.PROCEDURE_ACTIVITY_PROCEDURE__TEXT;

	/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROCEDURE_ACTIVITY_PROCEDURE__STATUS_CODE = ConsolPackage.PROCEDURE_ACTIVITY_PROCEDURE__STATUS_CODE;

	/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROCEDURE_ACTIVITY_PROCEDURE__EFFECTIVE_TIME = ConsolPackage.PROCEDURE_ACTIVITY_PROCEDURE__EFFECTIVE_TIME;

	/**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROCEDURE_ACTIVITY_PROCEDURE__PRIORITY_CODE = ConsolPackage.PROCEDURE_ACTIVITY_PROCEDURE__PRIORITY_CODE;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROCEDURE_ACTIVITY_PROCEDURE__LANGUAGE_CODE = ConsolPackage.PROCEDURE_ACTIVITY_PROCEDURE__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROCEDURE_ACTIVITY_PROCEDURE__METHOD_CODE = ConsolPackage.PROCEDURE_ACTIVITY_PROCEDURE__METHOD_CODE;

	/**
     * The feature id for the '<em><b>Approach Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROCEDURE_ACTIVITY_PROCEDURE__APPROACH_SITE_CODE = ConsolPackage.PROCEDURE_ACTIVITY_PROCEDURE__APPROACH_SITE_CODE;

	/**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROCEDURE_ACTIVITY_PROCEDURE__TARGET_SITE_CODE = ConsolPackage.PROCEDURE_ACTIVITY_PROCEDURE__TARGET_SITE_CODE;

	/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROCEDURE_ACTIVITY_PROCEDURE__SUBJECT = ConsolPackage.PROCEDURE_ACTIVITY_PROCEDURE__SUBJECT;

	/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROCEDURE_ACTIVITY_PROCEDURE__SPECIMEN = ConsolPackage.PROCEDURE_ACTIVITY_PROCEDURE__SPECIMEN;

	/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROCEDURE_ACTIVITY_PROCEDURE__PERFORMER = ConsolPackage.PROCEDURE_ACTIVITY_PROCEDURE__PERFORMER;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROCEDURE_ACTIVITY_PROCEDURE__AUTHOR = ConsolPackage.PROCEDURE_ACTIVITY_PROCEDURE__AUTHOR;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROCEDURE_ACTIVITY_PROCEDURE__INFORMANT = ConsolPackage.PROCEDURE_ACTIVITY_PROCEDURE__INFORMANT;

	/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROCEDURE_ACTIVITY_PROCEDURE__PARTICIPANT = ConsolPackage.PROCEDURE_ACTIVITY_PROCEDURE__PARTICIPANT;

	/**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROCEDURE_ACTIVITY_PROCEDURE__ENTRY_RELATIONSHIP = ConsolPackage.PROCEDURE_ACTIVITY_PROCEDURE__ENTRY_RELATIONSHIP;

	/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROCEDURE_ACTIVITY_PROCEDURE__REFERENCE = ConsolPackage.PROCEDURE_ACTIVITY_PROCEDURE__REFERENCE;

	/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROCEDURE_ACTIVITY_PROCEDURE__PRECONDITION = ConsolPackage.PROCEDURE_ACTIVITY_PROCEDURE__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_ACTIVITY_PROCEDURE__NULL_FLAVOR = ConsolPackage.PROCEDURE_ACTIVITY_PROCEDURE__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_ACTIVITY_PROCEDURE__CLASS_CODE = ConsolPackage.PROCEDURE_ACTIVITY_PROCEDURE__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_ACTIVITY_PROCEDURE__MOOD_CODE = ConsolPackage.PROCEDURE_ACTIVITY_PROCEDURE__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_ACTIVITY_PROCEDURE__NEGATION_IND = ConsolPackage.PROCEDURE_ACTIVITY_PROCEDURE__NEGATION_IND;

	/**
     * The number of structural features of the '<em>Procedure Activity Procedure</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROCEDURE_ACTIVITY_PROCEDURE_FEATURE_COUNT = ConsolPackage.PROCEDURE_ACTIVITY_PROCEDURE_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.mu2consol.impl.ClinicalOfficeVisitSummaryImpl <em>Clinical Office Visit Summary</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.ClinicalOfficeVisitSummaryImpl
     * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.Mu2consolPackageImpl#getClinicalOfficeVisitSummary()
     * @generated
     */
	int CLINICAL_OFFICE_VISIT_SUMMARY = 9;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CLINICAL_OFFICE_VISIT_SUMMARY__REALM_CODE = GENERAL_HEADER_CONSTRAINTS__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CLINICAL_OFFICE_VISIT_SUMMARY__TYPE_ID = GENERAL_HEADER_CONSTRAINTS__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CLINICAL_OFFICE_VISIT_SUMMARY__TEMPLATE_ID = GENERAL_HEADER_CONSTRAINTS__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLINICAL_OFFICE_VISIT_SUMMARY__ID = GENERAL_HEADER_CONSTRAINTS__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLINICAL_OFFICE_VISIT_SUMMARY__CODE = GENERAL_HEADER_CONSTRAINTS__CODE;

	/**
     * The feature id for the '<em><b>Title</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CLINICAL_OFFICE_VISIT_SUMMARY__TITLE = GENERAL_HEADER_CONSTRAINTS__TITLE;

	/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CLINICAL_OFFICE_VISIT_SUMMARY__EFFECTIVE_TIME = GENERAL_HEADER_CONSTRAINTS__EFFECTIVE_TIME;

	/**
     * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CLINICAL_OFFICE_VISIT_SUMMARY__CONFIDENTIALITY_CODE = GENERAL_HEADER_CONSTRAINTS__CONFIDENTIALITY_CODE;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CLINICAL_OFFICE_VISIT_SUMMARY__LANGUAGE_CODE = GENERAL_HEADER_CONSTRAINTS__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Set Id</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CLINICAL_OFFICE_VISIT_SUMMARY__SET_ID = GENERAL_HEADER_CONSTRAINTS__SET_ID;

	/**
     * The feature id for the '<em><b>Version Number</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CLINICAL_OFFICE_VISIT_SUMMARY__VERSION_NUMBER = GENERAL_HEADER_CONSTRAINTS__VERSION_NUMBER;

	/**
     * The feature id for the '<em><b>Copy Time</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CLINICAL_OFFICE_VISIT_SUMMARY__COPY_TIME = GENERAL_HEADER_CONSTRAINTS__COPY_TIME;

	/**
     * The feature id for the '<em><b>Record Target</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CLINICAL_OFFICE_VISIT_SUMMARY__RECORD_TARGET = GENERAL_HEADER_CONSTRAINTS__RECORD_TARGET;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CLINICAL_OFFICE_VISIT_SUMMARY__AUTHOR = GENERAL_HEADER_CONSTRAINTS__AUTHOR;

	/**
     * The feature id for the '<em><b>Data Enterer</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CLINICAL_OFFICE_VISIT_SUMMARY__DATA_ENTERER = GENERAL_HEADER_CONSTRAINTS__DATA_ENTERER;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CLINICAL_OFFICE_VISIT_SUMMARY__INFORMANT = GENERAL_HEADER_CONSTRAINTS__INFORMANT;

	/**
     * The feature id for the '<em><b>Custodian</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CLINICAL_OFFICE_VISIT_SUMMARY__CUSTODIAN = GENERAL_HEADER_CONSTRAINTS__CUSTODIAN;

	/**
     * The feature id for the '<em><b>Information Recipient</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CLINICAL_OFFICE_VISIT_SUMMARY__INFORMATION_RECIPIENT = GENERAL_HEADER_CONSTRAINTS__INFORMATION_RECIPIENT;

	/**
     * The feature id for the '<em><b>Legal Authenticator</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CLINICAL_OFFICE_VISIT_SUMMARY__LEGAL_AUTHENTICATOR = GENERAL_HEADER_CONSTRAINTS__LEGAL_AUTHENTICATOR;

	/**
     * The feature id for the '<em><b>Authenticator</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CLINICAL_OFFICE_VISIT_SUMMARY__AUTHENTICATOR = GENERAL_HEADER_CONSTRAINTS__AUTHENTICATOR;

	/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CLINICAL_OFFICE_VISIT_SUMMARY__PARTICIPANT = GENERAL_HEADER_CONSTRAINTS__PARTICIPANT;

	/**
     * The feature id for the '<em><b>In Fulfillment Of</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CLINICAL_OFFICE_VISIT_SUMMARY__IN_FULFILLMENT_OF = GENERAL_HEADER_CONSTRAINTS__IN_FULFILLMENT_OF;

	/**
     * The feature id for the '<em><b>Documentation Of</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CLINICAL_OFFICE_VISIT_SUMMARY__DOCUMENTATION_OF = GENERAL_HEADER_CONSTRAINTS__DOCUMENTATION_OF;

	/**
     * The feature id for the '<em><b>Related Document</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CLINICAL_OFFICE_VISIT_SUMMARY__RELATED_DOCUMENT = GENERAL_HEADER_CONSTRAINTS__RELATED_DOCUMENT;

	/**
     * The feature id for the '<em><b>Authorization</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CLINICAL_OFFICE_VISIT_SUMMARY__AUTHORIZATION = GENERAL_HEADER_CONSTRAINTS__AUTHORIZATION;

	/**
     * The feature id for the '<em><b>Component Of</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CLINICAL_OFFICE_VISIT_SUMMARY__COMPONENT_OF = GENERAL_HEADER_CONSTRAINTS__COMPONENT_OF;

	/**
     * The feature id for the '<em><b>Component</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CLINICAL_OFFICE_VISIT_SUMMARY__COMPONENT = GENERAL_HEADER_CONSTRAINTS__COMPONENT;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLINICAL_OFFICE_VISIT_SUMMARY__NULL_FLAVOR = GENERAL_HEADER_CONSTRAINTS__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLINICAL_OFFICE_VISIT_SUMMARY__CLASS_CODE = GENERAL_HEADER_CONSTRAINTS__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLINICAL_OFFICE_VISIT_SUMMARY__MOOD_CODE = GENERAL_HEADER_CONSTRAINTS__MOOD_CODE;

	/**
     * The number of structural features of the '<em>Clinical Office Visit Summary</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CLINICAL_OFFICE_VISIT_SUMMARY_FEATURE_COUNT = GENERAL_HEADER_CONSTRAINTS_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.mu2consol.impl.MedicationsAdministeredSectionImpl <em>Medications Administered Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.MedicationsAdministeredSectionImpl
     * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.Mu2consolPackageImpl#getMedicationsAdministeredSection()
     * @generated
     */
    int MEDICATIONS_ADMINISTERED_SECTION = 10;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDICATIONS_ADMINISTERED_SECTION__REALM_CODE = ConsolPackage.MEDICATIONS_ADMINISTERED_SECTION__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDICATIONS_ADMINISTERED_SECTION__TYPE_ID = ConsolPackage.MEDICATIONS_ADMINISTERED_SECTION__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDICATIONS_ADMINISTERED_SECTION__TEMPLATE_ID = ConsolPackage.MEDICATIONS_ADMINISTERED_SECTION__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDICATIONS_ADMINISTERED_SECTION__ID = ConsolPackage.MEDICATIONS_ADMINISTERED_SECTION__ID;

	/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDICATIONS_ADMINISTERED_SECTION__CODE = ConsolPackage.MEDICATIONS_ADMINISTERED_SECTION__CODE;

	/**
     * The feature id for the '<em><b>Title</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDICATIONS_ADMINISTERED_SECTION__TITLE = ConsolPackage.MEDICATIONS_ADMINISTERED_SECTION__TITLE;

	/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDICATIONS_ADMINISTERED_SECTION__TEXT = ConsolPackage.MEDICATIONS_ADMINISTERED_SECTION__TEXT;

	/**
     * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDICATIONS_ADMINISTERED_SECTION__CONFIDENTIALITY_CODE = ConsolPackage.MEDICATIONS_ADMINISTERED_SECTION__CONFIDENTIALITY_CODE;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDICATIONS_ADMINISTERED_SECTION__LANGUAGE_CODE = ConsolPackage.MEDICATIONS_ADMINISTERED_SECTION__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDICATIONS_ADMINISTERED_SECTION__SUBJECT = ConsolPackage.MEDICATIONS_ADMINISTERED_SECTION__SUBJECT;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDICATIONS_ADMINISTERED_SECTION__AUTHOR = ConsolPackage.MEDICATIONS_ADMINISTERED_SECTION__AUTHOR;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDICATIONS_ADMINISTERED_SECTION__INFORMANT = ConsolPackage.MEDICATIONS_ADMINISTERED_SECTION__INFORMANT;

	/**
     * The feature id for the '<em><b>Entry</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDICATIONS_ADMINISTERED_SECTION__ENTRY = ConsolPackage.MEDICATIONS_ADMINISTERED_SECTION__ENTRY;

	/**
     * The feature id for the '<em><b>Component</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDICATIONS_ADMINISTERED_SECTION__COMPONENT = ConsolPackage.MEDICATIONS_ADMINISTERED_SECTION__COMPONENT;

	/**
     * The feature id for the '<em><b>Section Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDICATIONS_ADMINISTERED_SECTION__SECTION_ID = ConsolPackage.MEDICATIONS_ADMINISTERED_SECTION__SECTION_ID;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDICATIONS_ADMINISTERED_SECTION__NULL_FLAVOR = ConsolPackage.MEDICATIONS_ADMINISTERED_SECTION__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDICATIONS_ADMINISTERED_SECTION__CLASS_CODE = ConsolPackage.MEDICATIONS_ADMINISTERED_SECTION__CLASS_CODE;

	/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDICATIONS_ADMINISTERED_SECTION__MOOD_CODE = ConsolPackage.MEDICATIONS_ADMINISTERED_SECTION__MOOD_CODE;

	/**
     * The number of structural features of the '<em>Medications Administered Section</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEDICATIONS_ADMINISTERED_SECTION_FEATURE_COUNT = ConsolPackage.MEDICATIONS_ADMINISTERED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.impl.TransitionOfCareAmbulatorySummaryImpl
	 * <em>Transition Of Care Ambulatory Summary</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.TransitionOfCareAmbulatorySummaryImpl
	 * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.Mu2consolPackageImpl#getTransitionOfCareAmbulatorySummary()
	 * @generated
	 */
	int TRANSITION_OF_CARE_AMBULATORY_SUMMARY = 11;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION_OF_CARE_AMBULATORY_SUMMARY__REALM_CODE = SUMMARY_OF_CARE_RECORD__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION_OF_CARE_AMBULATORY_SUMMARY__TYPE_ID = SUMMARY_OF_CARE_RECORD__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION_OF_CARE_AMBULATORY_SUMMARY__TEMPLATE_ID = SUMMARY_OF_CARE_RECORD__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OF_CARE_AMBULATORY_SUMMARY__ID = SUMMARY_OF_CARE_RECORD__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OF_CARE_AMBULATORY_SUMMARY__CODE = SUMMARY_OF_CARE_RECORD__CODE;

	/**
     * The feature id for the '<em><b>Title</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION_OF_CARE_AMBULATORY_SUMMARY__TITLE = SUMMARY_OF_CARE_RECORD__TITLE;

	/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION_OF_CARE_AMBULATORY_SUMMARY__EFFECTIVE_TIME = SUMMARY_OF_CARE_RECORD__EFFECTIVE_TIME;

	/**
     * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION_OF_CARE_AMBULATORY_SUMMARY__CONFIDENTIALITY_CODE = SUMMARY_OF_CARE_RECORD__CONFIDENTIALITY_CODE;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION_OF_CARE_AMBULATORY_SUMMARY__LANGUAGE_CODE = SUMMARY_OF_CARE_RECORD__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Set Id</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION_OF_CARE_AMBULATORY_SUMMARY__SET_ID = SUMMARY_OF_CARE_RECORD__SET_ID;

	/**
     * The feature id for the '<em><b>Version Number</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION_OF_CARE_AMBULATORY_SUMMARY__VERSION_NUMBER = SUMMARY_OF_CARE_RECORD__VERSION_NUMBER;

	/**
     * The feature id for the '<em><b>Copy Time</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION_OF_CARE_AMBULATORY_SUMMARY__COPY_TIME = SUMMARY_OF_CARE_RECORD__COPY_TIME;

	/**
     * The feature id for the '<em><b>Record Target</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION_OF_CARE_AMBULATORY_SUMMARY__RECORD_TARGET = SUMMARY_OF_CARE_RECORD__RECORD_TARGET;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION_OF_CARE_AMBULATORY_SUMMARY__AUTHOR = SUMMARY_OF_CARE_RECORD__AUTHOR;

	/**
     * The feature id for the '<em><b>Data Enterer</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION_OF_CARE_AMBULATORY_SUMMARY__DATA_ENTERER = SUMMARY_OF_CARE_RECORD__DATA_ENTERER;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION_OF_CARE_AMBULATORY_SUMMARY__INFORMANT = SUMMARY_OF_CARE_RECORD__INFORMANT;

	/**
     * The feature id for the '<em><b>Custodian</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION_OF_CARE_AMBULATORY_SUMMARY__CUSTODIAN = SUMMARY_OF_CARE_RECORD__CUSTODIAN;

	/**
     * The feature id for the '<em><b>Information Recipient</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION_OF_CARE_AMBULATORY_SUMMARY__INFORMATION_RECIPIENT = SUMMARY_OF_CARE_RECORD__INFORMATION_RECIPIENT;

	/**
     * The feature id for the '<em><b>Legal Authenticator</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION_OF_CARE_AMBULATORY_SUMMARY__LEGAL_AUTHENTICATOR = SUMMARY_OF_CARE_RECORD__LEGAL_AUTHENTICATOR;

	/**
     * The feature id for the '<em><b>Authenticator</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION_OF_CARE_AMBULATORY_SUMMARY__AUTHENTICATOR = SUMMARY_OF_CARE_RECORD__AUTHENTICATOR;

	/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION_OF_CARE_AMBULATORY_SUMMARY__PARTICIPANT = SUMMARY_OF_CARE_RECORD__PARTICIPANT;

	/**
     * The feature id for the '<em><b>In Fulfillment Of</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION_OF_CARE_AMBULATORY_SUMMARY__IN_FULFILLMENT_OF = SUMMARY_OF_CARE_RECORD__IN_FULFILLMENT_OF;

	/**
     * The feature id for the '<em><b>Documentation Of</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION_OF_CARE_AMBULATORY_SUMMARY__DOCUMENTATION_OF = SUMMARY_OF_CARE_RECORD__DOCUMENTATION_OF;

	/**
     * The feature id for the '<em><b>Related Document</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION_OF_CARE_AMBULATORY_SUMMARY__RELATED_DOCUMENT = SUMMARY_OF_CARE_RECORD__RELATED_DOCUMENT;

	/**
     * The feature id for the '<em><b>Authorization</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION_OF_CARE_AMBULATORY_SUMMARY__AUTHORIZATION = SUMMARY_OF_CARE_RECORD__AUTHORIZATION;

	/**
     * The feature id for the '<em><b>Component Of</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION_OF_CARE_AMBULATORY_SUMMARY__COMPONENT_OF = SUMMARY_OF_CARE_RECORD__COMPONENT_OF;

	/**
     * The feature id for the '<em><b>Component</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION_OF_CARE_AMBULATORY_SUMMARY__COMPONENT = SUMMARY_OF_CARE_RECORD__COMPONENT;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OF_CARE_AMBULATORY_SUMMARY__NULL_FLAVOR = SUMMARY_OF_CARE_RECORD__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OF_CARE_AMBULATORY_SUMMARY__CLASS_CODE = SUMMARY_OF_CARE_RECORD__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OF_CARE_AMBULATORY_SUMMARY__MOOD_CODE = SUMMARY_OF_CARE_RECORD__MOOD_CODE;

	/**
	 * The number of structural features of the '
	 * <em>Transition Of Care Ambulatory Summary</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OF_CARE_AMBULATORY_SUMMARY_FEATURE_COUNT = SUMMARY_OF_CARE_RECORD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.impl.TransitionOfCareInpatientSummaryImpl
	 * <em>Transition Of Care Inpatient Summary</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.TransitionOfCareInpatientSummaryImpl
	 * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.Mu2consolPackageImpl#getTransitionOfCareInpatientSummary()
	 * @generated
	 */
	int TRANSITION_OF_CARE_INPATIENT_SUMMARY = 12;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION_OF_CARE_INPATIENT_SUMMARY__REALM_CODE = SUMMARY_OF_CARE_RECORD__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION_OF_CARE_INPATIENT_SUMMARY__TYPE_ID = SUMMARY_OF_CARE_RECORD__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION_OF_CARE_INPATIENT_SUMMARY__TEMPLATE_ID = SUMMARY_OF_CARE_RECORD__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OF_CARE_INPATIENT_SUMMARY__ID = SUMMARY_OF_CARE_RECORD__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OF_CARE_INPATIENT_SUMMARY__CODE = SUMMARY_OF_CARE_RECORD__CODE;

	/**
     * The feature id for the '<em><b>Title</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION_OF_CARE_INPATIENT_SUMMARY__TITLE = SUMMARY_OF_CARE_RECORD__TITLE;

	/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION_OF_CARE_INPATIENT_SUMMARY__EFFECTIVE_TIME = SUMMARY_OF_CARE_RECORD__EFFECTIVE_TIME;

	/**
     * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION_OF_CARE_INPATIENT_SUMMARY__CONFIDENTIALITY_CODE = SUMMARY_OF_CARE_RECORD__CONFIDENTIALITY_CODE;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION_OF_CARE_INPATIENT_SUMMARY__LANGUAGE_CODE = SUMMARY_OF_CARE_RECORD__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Set Id</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION_OF_CARE_INPATIENT_SUMMARY__SET_ID = SUMMARY_OF_CARE_RECORD__SET_ID;

	/**
     * The feature id for the '<em><b>Version Number</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION_OF_CARE_INPATIENT_SUMMARY__VERSION_NUMBER = SUMMARY_OF_CARE_RECORD__VERSION_NUMBER;

	/**
     * The feature id for the '<em><b>Copy Time</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION_OF_CARE_INPATIENT_SUMMARY__COPY_TIME = SUMMARY_OF_CARE_RECORD__COPY_TIME;

	/**
     * The feature id for the '<em><b>Record Target</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION_OF_CARE_INPATIENT_SUMMARY__RECORD_TARGET = SUMMARY_OF_CARE_RECORD__RECORD_TARGET;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION_OF_CARE_INPATIENT_SUMMARY__AUTHOR = SUMMARY_OF_CARE_RECORD__AUTHOR;

	/**
     * The feature id for the '<em><b>Data Enterer</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION_OF_CARE_INPATIENT_SUMMARY__DATA_ENTERER = SUMMARY_OF_CARE_RECORD__DATA_ENTERER;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION_OF_CARE_INPATIENT_SUMMARY__INFORMANT = SUMMARY_OF_CARE_RECORD__INFORMANT;

	/**
     * The feature id for the '<em><b>Custodian</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION_OF_CARE_INPATIENT_SUMMARY__CUSTODIAN = SUMMARY_OF_CARE_RECORD__CUSTODIAN;

	/**
     * The feature id for the '<em><b>Information Recipient</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION_OF_CARE_INPATIENT_SUMMARY__INFORMATION_RECIPIENT = SUMMARY_OF_CARE_RECORD__INFORMATION_RECIPIENT;

	/**
     * The feature id for the '<em><b>Legal Authenticator</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION_OF_CARE_INPATIENT_SUMMARY__LEGAL_AUTHENTICATOR = SUMMARY_OF_CARE_RECORD__LEGAL_AUTHENTICATOR;

	/**
     * The feature id for the '<em><b>Authenticator</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION_OF_CARE_INPATIENT_SUMMARY__AUTHENTICATOR = SUMMARY_OF_CARE_RECORD__AUTHENTICATOR;

	/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION_OF_CARE_INPATIENT_SUMMARY__PARTICIPANT = SUMMARY_OF_CARE_RECORD__PARTICIPANT;

	/**
     * The feature id for the '<em><b>In Fulfillment Of</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION_OF_CARE_INPATIENT_SUMMARY__IN_FULFILLMENT_OF = SUMMARY_OF_CARE_RECORD__IN_FULFILLMENT_OF;

	/**
     * The feature id for the '<em><b>Documentation Of</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION_OF_CARE_INPATIENT_SUMMARY__DOCUMENTATION_OF = SUMMARY_OF_CARE_RECORD__DOCUMENTATION_OF;

	/**
     * The feature id for the '<em><b>Related Document</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION_OF_CARE_INPATIENT_SUMMARY__RELATED_DOCUMENT = SUMMARY_OF_CARE_RECORD__RELATED_DOCUMENT;

	/**
     * The feature id for the '<em><b>Authorization</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION_OF_CARE_INPATIENT_SUMMARY__AUTHORIZATION = SUMMARY_OF_CARE_RECORD__AUTHORIZATION;

	/**
     * The feature id for the '<em><b>Component Of</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION_OF_CARE_INPATIENT_SUMMARY__COMPONENT_OF = SUMMARY_OF_CARE_RECORD__COMPONENT_OF;

	/**
     * The feature id for the '<em><b>Component</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION_OF_CARE_INPATIENT_SUMMARY__COMPONENT = SUMMARY_OF_CARE_RECORD__COMPONENT;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OF_CARE_INPATIENT_SUMMARY__NULL_FLAVOR = SUMMARY_OF_CARE_RECORD__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OF_CARE_INPATIENT_SUMMARY__CLASS_CODE = SUMMARY_OF_CARE_RECORD__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OF_CARE_INPATIENT_SUMMARY__MOOD_CODE = SUMMARY_OF_CARE_RECORD__MOOD_CODE;

	/**
     * The number of structural features of the '<em>Transition Of Care Inpatient Summary</em>' class.
     * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRANSITION_OF_CARE_INPATIENT_SUMMARY_FEATURE_COUNT = SUMMARY_OF_CARE_RECORD_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.mu2consol.impl.ViewDownloadTransmitSummaryImpl <em>View Download Transmit Summary</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.ViewDownloadTransmitSummaryImpl
     * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.Mu2consolPackageImpl#getViewDownloadTransmitSummary()
     * @generated
     */
	int VIEW_DOWNLOAD_TRANSMIT_SUMMARY = 13;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VIEW_DOWNLOAD_TRANSMIT_SUMMARY__REALM_CODE = GENERAL_HEADER_CONSTRAINTS__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VIEW_DOWNLOAD_TRANSMIT_SUMMARY__TYPE_ID = GENERAL_HEADER_CONSTRAINTS__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VIEW_DOWNLOAD_TRANSMIT_SUMMARY__TEMPLATE_ID = GENERAL_HEADER_CONSTRAINTS__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VIEW_DOWNLOAD_TRANSMIT_SUMMARY__ID = GENERAL_HEADER_CONSTRAINTS__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VIEW_DOWNLOAD_TRANSMIT_SUMMARY__CODE = GENERAL_HEADER_CONSTRAINTS__CODE;

	/**
     * The feature id for the '<em><b>Title</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VIEW_DOWNLOAD_TRANSMIT_SUMMARY__TITLE = GENERAL_HEADER_CONSTRAINTS__TITLE;

	/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VIEW_DOWNLOAD_TRANSMIT_SUMMARY__EFFECTIVE_TIME = GENERAL_HEADER_CONSTRAINTS__EFFECTIVE_TIME;

	/**
     * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VIEW_DOWNLOAD_TRANSMIT_SUMMARY__CONFIDENTIALITY_CODE = GENERAL_HEADER_CONSTRAINTS__CONFIDENTIALITY_CODE;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VIEW_DOWNLOAD_TRANSMIT_SUMMARY__LANGUAGE_CODE = GENERAL_HEADER_CONSTRAINTS__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Set Id</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VIEW_DOWNLOAD_TRANSMIT_SUMMARY__SET_ID = GENERAL_HEADER_CONSTRAINTS__SET_ID;

	/**
     * The feature id for the '<em><b>Version Number</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VIEW_DOWNLOAD_TRANSMIT_SUMMARY__VERSION_NUMBER = GENERAL_HEADER_CONSTRAINTS__VERSION_NUMBER;

	/**
     * The feature id for the '<em><b>Copy Time</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VIEW_DOWNLOAD_TRANSMIT_SUMMARY__COPY_TIME = GENERAL_HEADER_CONSTRAINTS__COPY_TIME;

	/**
     * The feature id for the '<em><b>Record Target</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VIEW_DOWNLOAD_TRANSMIT_SUMMARY__RECORD_TARGET = GENERAL_HEADER_CONSTRAINTS__RECORD_TARGET;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VIEW_DOWNLOAD_TRANSMIT_SUMMARY__AUTHOR = GENERAL_HEADER_CONSTRAINTS__AUTHOR;

	/**
     * The feature id for the '<em><b>Data Enterer</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VIEW_DOWNLOAD_TRANSMIT_SUMMARY__DATA_ENTERER = GENERAL_HEADER_CONSTRAINTS__DATA_ENTERER;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VIEW_DOWNLOAD_TRANSMIT_SUMMARY__INFORMANT = GENERAL_HEADER_CONSTRAINTS__INFORMANT;

	/**
     * The feature id for the '<em><b>Custodian</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VIEW_DOWNLOAD_TRANSMIT_SUMMARY__CUSTODIAN = GENERAL_HEADER_CONSTRAINTS__CUSTODIAN;

	/**
     * The feature id for the '<em><b>Information Recipient</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VIEW_DOWNLOAD_TRANSMIT_SUMMARY__INFORMATION_RECIPIENT = GENERAL_HEADER_CONSTRAINTS__INFORMATION_RECIPIENT;

	/**
     * The feature id for the '<em><b>Legal Authenticator</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VIEW_DOWNLOAD_TRANSMIT_SUMMARY__LEGAL_AUTHENTICATOR = GENERAL_HEADER_CONSTRAINTS__LEGAL_AUTHENTICATOR;

	/**
     * The feature id for the '<em><b>Authenticator</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VIEW_DOWNLOAD_TRANSMIT_SUMMARY__AUTHENTICATOR = GENERAL_HEADER_CONSTRAINTS__AUTHENTICATOR;

	/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VIEW_DOWNLOAD_TRANSMIT_SUMMARY__PARTICIPANT = GENERAL_HEADER_CONSTRAINTS__PARTICIPANT;

	/**
     * The feature id for the '<em><b>In Fulfillment Of</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VIEW_DOWNLOAD_TRANSMIT_SUMMARY__IN_FULFILLMENT_OF = GENERAL_HEADER_CONSTRAINTS__IN_FULFILLMENT_OF;

	/**
     * The feature id for the '<em><b>Documentation Of</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VIEW_DOWNLOAD_TRANSMIT_SUMMARY__DOCUMENTATION_OF = GENERAL_HEADER_CONSTRAINTS__DOCUMENTATION_OF;

	/**
     * The feature id for the '<em><b>Related Document</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VIEW_DOWNLOAD_TRANSMIT_SUMMARY__RELATED_DOCUMENT = GENERAL_HEADER_CONSTRAINTS__RELATED_DOCUMENT;

	/**
     * The feature id for the '<em><b>Authorization</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VIEW_DOWNLOAD_TRANSMIT_SUMMARY__AUTHORIZATION = GENERAL_HEADER_CONSTRAINTS__AUTHORIZATION;

	/**
     * The feature id for the '<em><b>Component Of</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VIEW_DOWNLOAD_TRANSMIT_SUMMARY__COMPONENT_OF = GENERAL_HEADER_CONSTRAINTS__COMPONENT_OF;

	/**
     * The feature id for the '<em><b>Component</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VIEW_DOWNLOAD_TRANSMIT_SUMMARY__COMPONENT = GENERAL_HEADER_CONSTRAINTS__COMPONENT;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VIEW_DOWNLOAD_TRANSMIT_SUMMARY__NULL_FLAVOR = GENERAL_HEADER_CONSTRAINTS__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VIEW_DOWNLOAD_TRANSMIT_SUMMARY__CLASS_CODE = GENERAL_HEADER_CONSTRAINTS__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VIEW_DOWNLOAD_TRANSMIT_SUMMARY__MOOD_CODE = GENERAL_HEADER_CONSTRAINTS__MOOD_CODE;

	/**
     * The number of structural features of the '<em>View Download Transmit Summary</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VIEW_DOWNLOAD_TRANSMIT_SUMMARY_FEATURE_COUNT = GENERAL_HEADER_CONSTRAINTS_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.mu2consol.impl.VDTInpatientSummaryImpl <em>VDT Inpatient Summary</em>}' class.
     * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.VDTInpatientSummaryImpl
     * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.Mu2consolPackageImpl#getVDTInpatientSummary()
     * @generated
     */
	int VDT_INPATIENT_SUMMARY = 14;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VDT_INPATIENT_SUMMARY__REALM_CODE = VIEW_DOWNLOAD_TRANSMIT_SUMMARY__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VDT_INPATIENT_SUMMARY__TYPE_ID = VIEW_DOWNLOAD_TRANSMIT_SUMMARY__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VDT_INPATIENT_SUMMARY__TEMPLATE_ID = VIEW_DOWNLOAD_TRANSMIT_SUMMARY__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VDT_INPATIENT_SUMMARY__ID = VIEW_DOWNLOAD_TRANSMIT_SUMMARY__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VDT_INPATIENT_SUMMARY__CODE = VIEW_DOWNLOAD_TRANSMIT_SUMMARY__CODE;

	/**
     * The feature id for the '<em><b>Title</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VDT_INPATIENT_SUMMARY__TITLE = VIEW_DOWNLOAD_TRANSMIT_SUMMARY__TITLE;

	/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VDT_INPATIENT_SUMMARY__EFFECTIVE_TIME = VIEW_DOWNLOAD_TRANSMIT_SUMMARY__EFFECTIVE_TIME;

	/**
     * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VDT_INPATIENT_SUMMARY__CONFIDENTIALITY_CODE = VIEW_DOWNLOAD_TRANSMIT_SUMMARY__CONFIDENTIALITY_CODE;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VDT_INPATIENT_SUMMARY__LANGUAGE_CODE = VIEW_DOWNLOAD_TRANSMIT_SUMMARY__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Set Id</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VDT_INPATIENT_SUMMARY__SET_ID = VIEW_DOWNLOAD_TRANSMIT_SUMMARY__SET_ID;

	/**
     * The feature id for the '<em><b>Version Number</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VDT_INPATIENT_SUMMARY__VERSION_NUMBER = VIEW_DOWNLOAD_TRANSMIT_SUMMARY__VERSION_NUMBER;

	/**
     * The feature id for the '<em><b>Copy Time</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VDT_INPATIENT_SUMMARY__COPY_TIME = VIEW_DOWNLOAD_TRANSMIT_SUMMARY__COPY_TIME;

	/**
     * The feature id for the '<em><b>Record Target</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VDT_INPATIENT_SUMMARY__RECORD_TARGET = VIEW_DOWNLOAD_TRANSMIT_SUMMARY__RECORD_TARGET;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VDT_INPATIENT_SUMMARY__AUTHOR = VIEW_DOWNLOAD_TRANSMIT_SUMMARY__AUTHOR;

	/**
     * The feature id for the '<em><b>Data Enterer</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VDT_INPATIENT_SUMMARY__DATA_ENTERER = VIEW_DOWNLOAD_TRANSMIT_SUMMARY__DATA_ENTERER;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VDT_INPATIENT_SUMMARY__INFORMANT = VIEW_DOWNLOAD_TRANSMIT_SUMMARY__INFORMANT;

	/**
     * The feature id for the '<em><b>Custodian</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VDT_INPATIENT_SUMMARY__CUSTODIAN = VIEW_DOWNLOAD_TRANSMIT_SUMMARY__CUSTODIAN;

	/**
     * The feature id for the '<em><b>Information Recipient</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VDT_INPATIENT_SUMMARY__INFORMATION_RECIPIENT = VIEW_DOWNLOAD_TRANSMIT_SUMMARY__INFORMATION_RECIPIENT;

	/**
     * The feature id for the '<em><b>Legal Authenticator</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VDT_INPATIENT_SUMMARY__LEGAL_AUTHENTICATOR = VIEW_DOWNLOAD_TRANSMIT_SUMMARY__LEGAL_AUTHENTICATOR;

	/**
     * The feature id for the '<em><b>Authenticator</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VDT_INPATIENT_SUMMARY__AUTHENTICATOR = VIEW_DOWNLOAD_TRANSMIT_SUMMARY__AUTHENTICATOR;

	/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VDT_INPATIENT_SUMMARY__PARTICIPANT = VIEW_DOWNLOAD_TRANSMIT_SUMMARY__PARTICIPANT;

	/**
     * The feature id for the '<em><b>In Fulfillment Of</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VDT_INPATIENT_SUMMARY__IN_FULFILLMENT_OF = VIEW_DOWNLOAD_TRANSMIT_SUMMARY__IN_FULFILLMENT_OF;

	/**
     * The feature id for the '<em><b>Documentation Of</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VDT_INPATIENT_SUMMARY__DOCUMENTATION_OF = VIEW_DOWNLOAD_TRANSMIT_SUMMARY__DOCUMENTATION_OF;

	/**
     * The feature id for the '<em><b>Related Document</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VDT_INPATIENT_SUMMARY__RELATED_DOCUMENT = VIEW_DOWNLOAD_TRANSMIT_SUMMARY__RELATED_DOCUMENT;

	/**
     * The feature id for the '<em><b>Authorization</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VDT_INPATIENT_SUMMARY__AUTHORIZATION = VIEW_DOWNLOAD_TRANSMIT_SUMMARY__AUTHORIZATION;

	/**
     * The feature id for the '<em><b>Component Of</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VDT_INPATIENT_SUMMARY__COMPONENT_OF = VIEW_DOWNLOAD_TRANSMIT_SUMMARY__COMPONENT_OF;

	/**
     * The feature id for the '<em><b>Component</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VDT_INPATIENT_SUMMARY__COMPONENT = VIEW_DOWNLOAD_TRANSMIT_SUMMARY__COMPONENT;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VDT_INPATIENT_SUMMARY__NULL_FLAVOR = VIEW_DOWNLOAD_TRANSMIT_SUMMARY__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VDT_INPATIENT_SUMMARY__CLASS_CODE = VIEW_DOWNLOAD_TRANSMIT_SUMMARY__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VDT_INPATIENT_SUMMARY__MOOD_CODE = VIEW_DOWNLOAD_TRANSMIT_SUMMARY__MOOD_CODE;

	/**
     * The number of structural features of the '<em>VDT Inpatient Summary</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VDT_INPATIENT_SUMMARY_FEATURE_COUNT = VIEW_DOWNLOAD_TRANSMIT_SUMMARY_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.mu2consol.impl.VDTAmbulatorySummaryImpl <em>VDT Ambulatory Summary</em>}' class.
     * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.VDTAmbulatorySummaryImpl
     * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.Mu2consolPackageImpl#getVDTAmbulatorySummary()
     * @generated
     */
	int VDT_AMBULATORY_SUMMARY = 15;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VDT_AMBULATORY_SUMMARY__REALM_CODE = VIEW_DOWNLOAD_TRANSMIT_SUMMARY__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VDT_AMBULATORY_SUMMARY__TYPE_ID = VIEW_DOWNLOAD_TRANSMIT_SUMMARY__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VDT_AMBULATORY_SUMMARY__TEMPLATE_ID = VIEW_DOWNLOAD_TRANSMIT_SUMMARY__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VDT_AMBULATORY_SUMMARY__ID = VIEW_DOWNLOAD_TRANSMIT_SUMMARY__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VDT_AMBULATORY_SUMMARY__CODE = VIEW_DOWNLOAD_TRANSMIT_SUMMARY__CODE;

	/**
     * The feature id for the '<em><b>Title</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VDT_AMBULATORY_SUMMARY__TITLE = VIEW_DOWNLOAD_TRANSMIT_SUMMARY__TITLE;

	/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VDT_AMBULATORY_SUMMARY__EFFECTIVE_TIME = VIEW_DOWNLOAD_TRANSMIT_SUMMARY__EFFECTIVE_TIME;

	/**
     * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VDT_AMBULATORY_SUMMARY__CONFIDENTIALITY_CODE = VIEW_DOWNLOAD_TRANSMIT_SUMMARY__CONFIDENTIALITY_CODE;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VDT_AMBULATORY_SUMMARY__LANGUAGE_CODE = VIEW_DOWNLOAD_TRANSMIT_SUMMARY__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Set Id</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VDT_AMBULATORY_SUMMARY__SET_ID = VIEW_DOWNLOAD_TRANSMIT_SUMMARY__SET_ID;

	/**
     * The feature id for the '<em><b>Version Number</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VDT_AMBULATORY_SUMMARY__VERSION_NUMBER = VIEW_DOWNLOAD_TRANSMIT_SUMMARY__VERSION_NUMBER;

	/**
     * The feature id for the '<em><b>Copy Time</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VDT_AMBULATORY_SUMMARY__COPY_TIME = VIEW_DOWNLOAD_TRANSMIT_SUMMARY__COPY_TIME;

	/**
     * The feature id for the '<em><b>Record Target</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VDT_AMBULATORY_SUMMARY__RECORD_TARGET = VIEW_DOWNLOAD_TRANSMIT_SUMMARY__RECORD_TARGET;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VDT_AMBULATORY_SUMMARY__AUTHOR = VIEW_DOWNLOAD_TRANSMIT_SUMMARY__AUTHOR;

	/**
     * The feature id for the '<em><b>Data Enterer</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VDT_AMBULATORY_SUMMARY__DATA_ENTERER = VIEW_DOWNLOAD_TRANSMIT_SUMMARY__DATA_ENTERER;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VDT_AMBULATORY_SUMMARY__INFORMANT = VIEW_DOWNLOAD_TRANSMIT_SUMMARY__INFORMANT;

	/**
     * The feature id for the '<em><b>Custodian</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VDT_AMBULATORY_SUMMARY__CUSTODIAN = VIEW_DOWNLOAD_TRANSMIT_SUMMARY__CUSTODIAN;

	/**
     * The feature id for the '<em><b>Information Recipient</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VDT_AMBULATORY_SUMMARY__INFORMATION_RECIPIENT = VIEW_DOWNLOAD_TRANSMIT_SUMMARY__INFORMATION_RECIPIENT;

	/**
     * The feature id for the '<em><b>Legal Authenticator</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VDT_AMBULATORY_SUMMARY__LEGAL_AUTHENTICATOR = VIEW_DOWNLOAD_TRANSMIT_SUMMARY__LEGAL_AUTHENTICATOR;

	/**
     * The feature id for the '<em><b>Authenticator</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VDT_AMBULATORY_SUMMARY__AUTHENTICATOR = VIEW_DOWNLOAD_TRANSMIT_SUMMARY__AUTHENTICATOR;

	/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VDT_AMBULATORY_SUMMARY__PARTICIPANT = VIEW_DOWNLOAD_TRANSMIT_SUMMARY__PARTICIPANT;

	/**
     * The feature id for the '<em><b>In Fulfillment Of</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VDT_AMBULATORY_SUMMARY__IN_FULFILLMENT_OF = VIEW_DOWNLOAD_TRANSMIT_SUMMARY__IN_FULFILLMENT_OF;

	/**
     * The feature id for the '<em><b>Documentation Of</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VDT_AMBULATORY_SUMMARY__DOCUMENTATION_OF = VIEW_DOWNLOAD_TRANSMIT_SUMMARY__DOCUMENTATION_OF;

	/**
     * The feature id for the '<em><b>Related Document</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VDT_AMBULATORY_SUMMARY__RELATED_DOCUMENT = VIEW_DOWNLOAD_TRANSMIT_SUMMARY__RELATED_DOCUMENT;

	/**
     * The feature id for the '<em><b>Authorization</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VDT_AMBULATORY_SUMMARY__AUTHORIZATION = VIEW_DOWNLOAD_TRANSMIT_SUMMARY__AUTHORIZATION;

	/**
     * The feature id for the '<em><b>Component Of</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VDT_AMBULATORY_SUMMARY__COMPONENT_OF = VIEW_DOWNLOAD_TRANSMIT_SUMMARY__COMPONENT_OF;

	/**
     * The feature id for the '<em><b>Component</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VDT_AMBULATORY_SUMMARY__COMPONENT = VIEW_DOWNLOAD_TRANSMIT_SUMMARY__COMPONENT;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VDT_AMBULATORY_SUMMARY__NULL_FLAVOR = VIEW_DOWNLOAD_TRANSMIT_SUMMARY__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VDT_AMBULATORY_SUMMARY__CLASS_CODE = VIEW_DOWNLOAD_TRANSMIT_SUMMARY__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VDT_AMBULATORY_SUMMARY__MOOD_CODE = VIEW_DOWNLOAD_TRANSMIT_SUMMARY__MOOD_CODE;

	/**
     * The number of structural features of the '<em>VDT Ambulatory Summary</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VDT_AMBULATORY_SUMMARY_FEATURE_COUNT = VIEW_DOWNLOAD_TRANSMIT_SUMMARY_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.mu2consol.impl.FunctionalStatusSectionImpl <em>Functional Status Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.FunctionalStatusSectionImpl
     * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.Mu2consolPackageImpl#getFunctionalStatusSection()
     * @generated
     */
    int FUNCTIONAL_STATUS_SECTION = 16;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_SECTION__REALM_CODE = ConsolPackage.FUNCTIONAL_STATUS_SECTION__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_SECTION__TYPE_ID = ConsolPackage.FUNCTIONAL_STATUS_SECTION__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_SECTION__TEMPLATE_ID = ConsolPackage.FUNCTIONAL_STATUS_SECTION__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_SECTION__ID = ConsolPackage.FUNCTIONAL_STATUS_SECTION__ID;

	/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_SECTION__CODE = ConsolPackage.FUNCTIONAL_STATUS_SECTION__CODE;

	/**
     * The feature id for the '<em><b>Title</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_SECTION__TITLE = ConsolPackage.FUNCTIONAL_STATUS_SECTION__TITLE;

	/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_SECTION__TEXT = ConsolPackage.FUNCTIONAL_STATUS_SECTION__TEXT;

	/**
     * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_SECTION__CONFIDENTIALITY_CODE = ConsolPackage.FUNCTIONAL_STATUS_SECTION__CONFIDENTIALITY_CODE;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_SECTION__LANGUAGE_CODE = ConsolPackage.FUNCTIONAL_STATUS_SECTION__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_SECTION__SUBJECT = ConsolPackage.FUNCTIONAL_STATUS_SECTION__SUBJECT;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_SECTION__AUTHOR = ConsolPackage.FUNCTIONAL_STATUS_SECTION__AUTHOR;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_SECTION__INFORMANT = ConsolPackage.FUNCTIONAL_STATUS_SECTION__INFORMANT;

	/**
     * The feature id for the '<em><b>Entry</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_SECTION__ENTRY = ConsolPackage.FUNCTIONAL_STATUS_SECTION__ENTRY;

	/**
     * The feature id for the '<em><b>Component</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_SECTION__COMPONENT = ConsolPackage.FUNCTIONAL_STATUS_SECTION__COMPONENT;

	/**
     * The feature id for the '<em><b>Section Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_SECTION__SECTION_ID = ConsolPackage.FUNCTIONAL_STATUS_SECTION__SECTION_ID;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_SECTION__NULL_FLAVOR = ConsolPackage.FUNCTIONAL_STATUS_SECTION__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_SECTION__CLASS_CODE = ConsolPackage.FUNCTIONAL_STATUS_SECTION__CLASS_CODE;

	/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_SECTION__MOOD_CODE = ConsolPackage.FUNCTIONAL_STATUS_SECTION__MOOD_CODE;

	/**
     * The number of structural features of the '<em>Functional Status Section</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_SECTION_FEATURE_COUNT = ConsolPackage.FUNCTIONAL_STATUS_SECTION_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.mu2consol.impl.CognitiveStatusResultObservationImpl <em>Cognitive Status Result Observation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.CognitiveStatusResultObservationImpl
     * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.Mu2consolPackageImpl#getCognitiveStatusResultObservation()
     * @generated
     */
    int COGNITIVE_STATUS_RESULT_OBSERVATION = 17;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COGNITIVE_STATUS_RESULT_OBSERVATION__REALM_CODE = ConsolPackage.COGNITIVE_STATUS_RESULT_OBSERVATION__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COGNITIVE_STATUS_RESULT_OBSERVATION__TYPE_ID = ConsolPackage.COGNITIVE_STATUS_RESULT_OBSERVATION__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COGNITIVE_STATUS_RESULT_OBSERVATION__TEMPLATE_ID = ConsolPackage.COGNITIVE_STATUS_RESULT_OBSERVATION__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COGNITIVE_STATUS_RESULT_OBSERVATION__ID = ConsolPackage.COGNITIVE_STATUS_RESULT_OBSERVATION__ID;

	/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COGNITIVE_STATUS_RESULT_OBSERVATION__CODE = ConsolPackage.COGNITIVE_STATUS_RESULT_OBSERVATION__CODE;

	/**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COGNITIVE_STATUS_RESULT_OBSERVATION__DERIVATION_EXPR = ConsolPackage.COGNITIVE_STATUS_RESULT_OBSERVATION__DERIVATION_EXPR;

	/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COGNITIVE_STATUS_RESULT_OBSERVATION__TEXT = ConsolPackage.COGNITIVE_STATUS_RESULT_OBSERVATION__TEXT;

	/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COGNITIVE_STATUS_RESULT_OBSERVATION__STATUS_CODE = ConsolPackage.COGNITIVE_STATUS_RESULT_OBSERVATION__STATUS_CODE;

	/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COGNITIVE_STATUS_RESULT_OBSERVATION__EFFECTIVE_TIME = ConsolPackage.COGNITIVE_STATUS_RESULT_OBSERVATION__EFFECTIVE_TIME;

	/**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COGNITIVE_STATUS_RESULT_OBSERVATION__PRIORITY_CODE = ConsolPackage.COGNITIVE_STATUS_RESULT_OBSERVATION__PRIORITY_CODE;

	/**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COGNITIVE_STATUS_RESULT_OBSERVATION__REPEAT_NUMBER = ConsolPackage.COGNITIVE_STATUS_RESULT_OBSERVATION__REPEAT_NUMBER;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COGNITIVE_STATUS_RESULT_OBSERVATION__LANGUAGE_CODE = ConsolPackage.COGNITIVE_STATUS_RESULT_OBSERVATION__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COGNITIVE_STATUS_RESULT_OBSERVATION__VALUE = ConsolPackage.COGNITIVE_STATUS_RESULT_OBSERVATION__VALUE;

	/**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COGNITIVE_STATUS_RESULT_OBSERVATION__INTERPRETATION_CODE = ConsolPackage.COGNITIVE_STATUS_RESULT_OBSERVATION__INTERPRETATION_CODE;

	/**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COGNITIVE_STATUS_RESULT_OBSERVATION__METHOD_CODE = ConsolPackage.COGNITIVE_STATUS_RESULT_OBSERVATION__METHOD_CODE;

	/**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COGNITIVE_STATUS_RESULT_OBSERVATION__TARGET_SITE_CODE = ConsolPackage.COGNITIVE_STATUS_RESULT_OBSERVATION__TARGET_SITE_CODE;

	/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COGNITIVE_STATUS_RESULT_OBSERVATION__SUBJECT = ConsolPackage.COGNITIVE_STATUS_RESULT_OBSERVATION__SUBJECT;

	/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COGNITIVE_STATUS_RESULT_OBSERVATION__SPECIMEN = ConsolPackage.COGNITIVE_STATUS_RESULT_OBSERVATION__SPECIMEN;

	/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COGNITIVE_STATUS_RESULT_OBSERVATION__PERFORMER = ConsolPackage.COGNITIVE_STATUS_RESULT_OBSERVATION__PERFORMER;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COGNITIVE_STATUS_RESULT_OBSERVATION__AUTHOR = ConsolPackage.COGNITIVE_STATUS_RESULT_OBSERVATION__AUTHOR;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COGNITIVE_STATUS_RESULT_OBSERVATION__INFORMANT = ConsolPackage.COGNITIVE_STATUS_RESULT_OBSERVATION__INFORMANT;

	/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COGNITIVE_STATUS_RESULT_OBSERVATION__PARTICIPANT = ConsolPackage.COGNITIVE_STATUS_RESULT_OBSERVATION__PARTICIPANT;

	/**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COGNITIVE_STATUS_RESULT_OBSERVATION__ENTRY_RELATIONSHIP = ConsolPackage.COGNITIVE_STATUS_RESULT_OBSERVATION__ENTRY_RELATIONSHIP;

	/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COGNITIVE_STATUS_RESULT_OBSERVATION__REFERENCE = ConsolPackage.COGNITIVE_STATUS_RESULT_OBSERVATION__REFERENCE;

	/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COGNITIVE_STATUS_RESULT_OBSERVATION__PRECONDITION = ConsolPackage.COGNITIVE_STATUS_RESULT_OBSERVATION__PRECONDITION;

	/**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COGNITIVE_STATUS_RESULT_OBSERVATION__REFERENCE_RANGE = ConsolPackage.COGNITIVE_STATUS_RESULT_OBSERVATION__REFERENCE_RANGE;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COGNITIVE_STATUS_RESULT_OBSERVATION__NULL_FLAVOR = ConsolPackage.COGNITIVE_STATUS_RESULT_OBSERVATION__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COGNITIVE_STATUS_RESULT_OBSERVATION__CLASS_CODE = ConsolPackage.COGNITIVE_STATUS_RESULT_OBSERVATION__CLASS_CODE;

	/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COGNITIVE_STATUS_RESULT_OBSERVATION__MOOD_CODE = ConsolPackage.COGNITIVE_STATUS_RESULT_OBSERVATION__MOOD_CODE;

	/**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COGNITIVE_STATUS_RESULT_OBSERVATION__NEGATION_IND = ConsolPackage.COGNITIVE_STATUS_RESULT_OBSERVATION__NEGATION_IND;

	/**
     * The number of structural features of the '<em>Cognitive Status Result Observation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COGNITIVE_STATUS_RESULT_OBSERVATION_FEATURE_COUNT = ConsolPackage.COGNITIVE_STATUS_RESULT_OBSERVATION_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.mu2consol.impl.CognitiveStatusResultOrganizerImpl <em>Cognitive Status Result Organizer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.CognitiveStatusResultOrganizerImpl
     * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.Mu2consolPackageImpl#getCognitiveStatusResultOrganizer()
     * @generated
     */
    int COGNITIVE_STATUS_RESULT_ORGANIZER = 18;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COGNITIVE_STATUS_RESULT_ORGANIZER__REALM_CODE = ConsolPackage.COGNITIVE_STATUS_RESULT_ORGANIZER__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COGNITIVE_STATUS_RESULT_ORGANIZER__TYPE_ID = ConsolPackage.COGNITIVE_STATUS_RESULT_ORGANIZER__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COGNITIVE_STATUS_RESULT_ORGANIZER__TEMPLATE_ID = ConsolPackage.COGNITIVE_STATUS_RESULT_ORGANIZER__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COGNITIVE_STATUS_RESULT_ORGANIZER__ID = ConsolPackage.COGNITIVE_STATUS_RESULT_ORGANIZER__ID;

	/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COGNITIVE_STATUS_RESULT_ORGANIZER__CODE = ConsolPackage.COGNITIVE_STATUS_RESULT_ORGANIZER__CODE;

	/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COGNITIVE_STATUS_RESULT_ORGANIZER__STATUS_CODE = ConsolPackage.COGNITIVE_STATUS_RESULT_ORGANIZER__STATUS_CODE;

	/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COGNITIVE_STATUS_RESULT_ORGANIZER__EFFECTIVE_TIME = ConsolPackage.COGNITIVE_STATUS_RESULT_ORGANIZER__EFFECTIVE_TIME;

	/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COGNITIVE_STATUS_RESULT_ORGANIZER__SUBJECT = ConsolPackage.COGNITIVE_STATUS_RESULT_ORGANIZER__SUBJECT;

	/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COGNITIVE_STATUS_RESULT_ORGANIZER__SPECIMEN = ConsolPackage.COGNITIVE_STATUS_RESULT_ORGANIZER__SPECIMEN;

	/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COGNITIVE_STATUS_RESULT_ORGANIZER__PERFORMER = ConsolPackage.COGNITIVE_STATUS_RESULT_ORGANIZER__PERFORMER;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COGNITIVE_STATUS_RESULT_ORGANIZER__AUTHOR = ConsolPackage.COGNITIVE_STATUS_RESULT_ORGANIZER__AUTHOR;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COGNITIVE_STATUS_RESULT_ORGANIZER__INFORMANT = ConsolPackage.COGNITIVE_STATUS_RESULT_ORGANIZER__INFORMANT;

	/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COGNITIVE_STATUS_RESULT_ORGANIZER__PARTICIPANT = ConsolPackage.COGNITIVE_STATUS_RESULT_ORGANIZER__PARTICIPANT;

	/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COGNITIVE_STATUS_RESULT_ORGANIZER__REFERENCE = ConsolPackage.COGNITIVE_STATUS_RESULT_ORGANIZER__REFERENCE;

	/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COGNITIVE_STATUS_RESULT_ORGANIZER__PRECONDITION = ConsolPackage.COGNITIVE_STATUS_RESULT_ORGANIZER__PRECONDITION;

	/**
     * The feature id for the '<em><b>Component</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COGNITIVE_STATUS_RESULT_ORGANIZER__COMPONENT = ConsolPackage.COGNITIVE_STATUS_RESULT_ORGANIZER__COMPONENT;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COGNITIVE_STATUS_RESULT_ORGANIZER__NULL_FLAVOR = ConsolPackage.COGNITIVE_STATUS_RESULT_ORGANIZER__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COGNITIVE_STATUS_RESULT_ORGANIZER__CLASS_CODE = ConsolPackage.COGNITIVE_STATUS_RESULT_ORGANIZER__CLASS_CODE;

	/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COGNITIVE_STATUS_RESULT_ORGANIZER__MOOD_CODE = ConsolPackage.COGNITIVE_STATUS_RESULT_ORGANIZER__MOOD_CODE;

	/**
     * The number of structural features of the '<em>Cognitive Status Result Organizer</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COGNITIVE_STATUS_RESULT_ORGANIZER_FEATURE_COUNT = ConsolPackage.COGNITIVE_STATUS_RESULT_ORGANIZER_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.mu2consol.impl.FunctionalStatusResultObservationImpl <em>Functional Status Result Observation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.FunctionalStatusResultObservationImpl
     * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.Mu2consolPackageImpl#getFunctionalStatusResultObservation()
     * @generated
     */
    int FUNCTIONAL_STATUS_RESULT_OBSERVATION = 19;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_RESULT_OBSERVATION__REALM_CODE = ConsolPackage.FUNCTIONAL_STATUS_RESULT_OBSERVATION__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_RESULT_OBSERVATION__TYPE_ID = ConsolPackage.FUNCTIONAL_STATUS_RESULT_OBSERVATION__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_RESULT_OBSERVATION__TEMPLATE_ID = ConsolPackage.FUNCTIONAL_STATUS_RESULT_OBSERVATION__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_RESULT_OBSERVATION__ID = ConsolPackage.FUNCTIONAL_STATUS_RESULT_OBSERVATION__ID;

	/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_RESULT_OBSERVATION__CODE = ConsolPackage.FUNCTIONAL_STATUS_RESULT_OBSERVATION__CODE;

	/**
     * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_RESULT_OBSERVATION__DERIVATION_EXPR = ConsolPackage.FUNCTIONAL_STATUS_RESULT_OBSERVATION__DERIVATION_EXPR;

	/**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_RESULT_OBSERVATION__TEXT = ConsolPackage.FUNCTIONAL_STATUS_RESULT_OBSERVATION__TEXT;

	/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_RESULT_OBSERVATION__STATUS_CODE = ConsolPackage.FUNCTIONAL_STATUS_RESULT_OBSERVATION__STATUS_CODE;

	/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_RESULT_OBSERVATION__EFFECTIVE_TIME = ConsolPackage.FUNCTIONAL_STATUS_RESULT_OBSERVATION__EFFECTIVE_TIME;

	/**
     * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_RESULT_OBSERVATION__PRIORITY_CODE = ConsolPackage.FUNCTIONAL_STATUS_RESULT_OBSERVATION__PRIORITY_CODE;

	/**
     * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_RESULT_OBSERVATION__REPEAT_NUMBER = ConsolPackage.FUNCTIONAL_STATUS_RESULT_OBSERVATION__REPEAT_NUMBER;

	/**
     * The feature id for the '<em><b>Language Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_RESULT_OBSERVATION__LANGUAGE_CODE = ConsolPackage.FUNCTIONAL_STATUS_RESULT_OBSERVATION__LANGUAGE_CODE;

	/**
     * The feature id for the '<em><b>Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_RESULT_OBSERVATION__VALUE = ConsolPackage.FUNCTIONAL_STATUS_RESULT_OBSERVATION__VALUE;

	/**
     * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_RESULT_OBSERVATION__INTERPRETATION_CODE = ConsolPackage.FUNCTIONAL_STATUS_RESULT_OBSERVATION__INTERPRETATION_CODE;

	/**
     * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_RESULT_OBSERVATION__METHOD_CODE = ConsolPackage.FUNCTIONAL_STATUS_RESULT_OBSERVATION__METHOD_CODE;

	/**
     * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_RESULT_OBSERVATION__TARGET_SITE_CODE = ConsolPackage.FUNCTIONAL_STATUS_RESULT_OBSERVATION__TARGET_SITE_CODE;

	/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_RESULT_OBSERVATION__SUBJECT = ConsolPackage.FUNCTIONAL_STATUS_RESULT_OBSERVATION__SUBJECT;

	/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_RESULT_OBSERVATION__SPECIMEN = ConsolPackage.FUNCTIONAL_STATUS_RESULT_OBSERVATION__SPECIMEN;

	/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_RESULT_OBSERVATION__PERFORMER = ConsolPackage.FUNCTIONAL_STATUS_RESULT_OBSERVATION__PERFORMER;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_RESULT_OBSERVATION__AUTHOR = ConsolPackage.FUNCTIONAL_STATUS_RESULT_OBSERVATION__AUTHOR;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_RESULT_OBSERVATION__INFORMANT = ConsolPackage.FUNCTIONAL_STATUS_RESULT_OBSERVATION__INFORMANT;

	/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_RESULT_OBSERVATION__PARTICIPANT = ConsolPackage.FUNCTIONAL_STATUS_RESULT_OBSERVATION__PARTICIPANT;

	/**
     * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_RESULT_OBSERVATION__ENTRY_RELATIONSHIP = ConsolPackage.FUNCTIONAL_STATUS_RESULT_OBSERVATION__ENTRY_RELATIONSHIP;

	/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_RESULT_OBSERVATION__REFERENCE = ConsolPackage.FUNCTIONAL_STATUS_RESULT_OBSERVATION__REFERENCE;

	/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_RESULT_OBSERVATION__PRECONDITION = ConsolPackage.FUNCTIONAL_STATUS_RESULT_OBSERVATION__PRECONDITION;

	/**
     * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_RESULT_OBSERVATION__REFERENCE_RANGE = ConsolPackage.FUNCTIONAL_STATUS_RESULT_OBSERVATION__REFERENCE_RANGE;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_RESULT_OBSERVATION__NULL_FLAVOR = ConsolPackage.FUNCTIONAL_STATUS_RESULT_OBSERVATION__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_RESULT_OBSERVATION__CLASS_CODE = ConsolPackage.FUNCTIONAL_STATUS_RESULT_OBSERVATION__CLASS_CODE;

	/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_RESULT_OBSERVATION__MOOD_CODE = ConsolPackage.FUNCTIONAL_STATUS_RESULT_OBSERVATION__MOOD_CODE;

	/**
     * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_RESULT_OBSERVATION__NEGATION_IND = ConsolPackage.FUNCTIONAL_STATUS_RESULT_OBSERVATION__NEGATION_IND;

	/**
     * The number of structural features of the '<em>Functional Status Result Observation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_RESULT_OBSERVATION_FEATURE_COUNT = ConsolPackage.FUNCTIONAL_STATUS_RESULT_OBSERVATION_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.mu2consol.impl.FunctionalStatusResultOrganizerImpl <em>Functional Status Result Organizer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.FunctionalStatusResultOrganizerImpl
     * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.Mu2consolPackageImpl#getFunctionalStatusResultOrganizer()
     * @generated
     */
    int FUNCTIONAL_STATUS_RESULT_ORGANIZER = 20;

	/**
     * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_RESULT_ORGANIZER__REALM_CODE = ConsolPackage.FUNCTIONAL_STATUS_RESULT_ORGANIZER__REALM_CODE;

	/**
     * The feature id for the '<em><b>Type Id</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_RESULT_ORGANIZER__TYPE_ID = ConsolPackage.FUNCTIONAL_STATUS_RESULT_ORGANIZER__TYPE_ID;

	/**
     * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_RESULT_ORGANIZER__TEMPLATE_ID = ConsolPackage.FUNCTIONAL_STATUS_RESULT_ORGANIZER__TEMPLATE_ID;

	/**
     * The feature id for the '<em><b>Id</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_RESULT_ORGANIZER__ID = ConsolPackage.FUNCTIONAL_STATUS_RESULT_ORGANIZER__ID;

	/**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_RESULT_ORGANIZER__CODE = ConsolPackage.FUNCTIONAL_STATUS_RESULT_ORGANIZER__CODE;

	/**
     * The feature id for the '<em><b>Status Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_RESULT_ORGANIZER__STATUS_CODE = ConsolPackage.FUNCTIONAL_STATUS_RESULT_ORGANIZER__STATUS_CODE;

	/**
     * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_RESULT_ORGANIZER__EFFECTIVE_TIME = ConsolPackage.FUNCTIONAL_STATUS_RESULT_ORGANIZER__EFFECTIVE_TIME;

	/**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_RESULT_ORGANIZER__SUBJECT = ConsolPackage.FUNCTIONAL_STATUS_RESULT_ORGANIZER__SUBJECT;

	/**
     * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_RESULT_ORGANIZER__SPECIMEN = ConsolPackage.FUNCTIONAL_STATUS_RESULT_ORGANIZER__SPECIMEN;

	/**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_RESULT_ORGANIZER__PERFORMER = ConsolPackage.FUNCTIONAL_STATUS_RESULT_ORGANIZER__PERFORMER;

	/**
     * The feature id for the '<em><b>Author</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_RESULT_ORGANIZER__AUTHOR = ConsolPackage.FUNCTIONAL_STATUS_RESULT_ORGANIZER__AUTHOR;

	/**
     * The feature id for the '<em><b>Informant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_RESULT_ORGANIZER__INFORMANT = ConsolPackage.FUNCTIONAL_STATUS_RESULT_ORGANIZER__INFORMANT;

	/**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_RESULT_ORGANIZER__PARTICIPANT = ConsolPackage.FUNCTIONAL_STATUS_RESULT_ORGANIZER__PARTICIPANT;

	/**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_RESULT_ORGANIZER__REFERENCE = ConsolPackage.FUNCTIONAL_STATUS_RESULT_ORGANIZER__REFERENCE;

	/**
     * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_RESULT_ORGANIZER__PRECONDITION = ConsolPackage.FUNCTIONAL_STATUS_RESULT_ORGANIZER__PRECONDITION;

	/**
     * The feature id for the '<em><b>Component</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_RESULT_ORGANIZER__COMPONENT = ConsolPackage.FUNCTIONAL_STATUS_RESULT_ORGANIZER__COMPONENT;

	/**
     * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_RESULT_ORGANIZER__NULL_FLAVOR = ConsolPackage.FUNCTIONAL_STATUS_RESULT_ORGANIZER__NULL_FLAVOR;

	/**
     * The feature id for the '<em><b>Class Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_RESULT_ORGANIZER__CLASS_CODE = ConsolPackage.FUNCTIONAL_STATUS_RESULT_ORGANIZER__CLASS_CODE;

	/**
     * The feature id for the '<em><b>Mood Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_RESULT_ORGANIZER__MOOD_CODE = ConsolPackage.FUNCTIONAL_STATUS_RESULT_ORGANIZER__MOOD_CODE;

	/**
     * The number of structural features of the '<em>Functional Status Result Organizer</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_STATUS_RESULT_ORGANIZER_FEATURE_COUNT = ConsolPackage.FUNCTIONAL_STATUS_RESULT_ORGANIZER_FEATURE_COUNT + 0;

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints <em>General Header Constraints</em>}'.
     * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
     * @return the meta object for class '<em>General Header Constraints</em>'.
     * @see org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints
     * @generated
     */
	EClass getGeneralHeaderConstraints();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord <em>Summary Of Care Record</em>}'.
     * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
     * @return the meta object for class '<em>Summary Of Care Record</em>'.
     * @see org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord
     * @generated
     */
	EClass getSummaryOfCareRecord();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.mu2consol.SocialHistorySection <em>Social History Section</em>}'.
     * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
     * @return the meta object for class '<em>Social History Section</em>'.
     * @see org.openhealthtools.mdht.uml.cda.mu2consol.SocialHistorySection
     * @generated
     */
	EClass getSocialHistorySection();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.mu2consol.SmokingStatusObservation <em>Smoking Status Observation</em>}'.
     * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
     * @return the meta object for class '<em>Smoking Status Observation</em>'.
     * @see org.openhealthtools.mdht.uml.cda.mu2consol.SmokingStatusObservation
     * @generated
     */
	EClass getSmokingStatusObservation();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.mu2consol.ResultsSection <em>Results Section</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Results Section</em>'.
     * @see org.openhealthtools.mdht.uml.cda.mu2consol.ResultsSection
     * @generated
     */
	EClass getResultsSection();

	/**
	 * Returns the meta object for class '
	 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ResultOrganizer
	 * <em>Result Organizer</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Result Organizer</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.mu2consol.ResultOrganizer
	 * @generated
	 */
	EClass getResultOrganizer();

	/**
	 * Returns the meta object for class '
	 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ResultObservation
	 * <em>Result Observation</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Result Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.mu2consol.ResultObservation
	 * @generated
	 */
	EClass getResultObservation();

	/**
	 * Returns the meta object for class '
	 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ProceduresSection
	 * <em>Procedures Section</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Procedures Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.mu2consol.ProceduresSection
	 * @generated
	 */
	EClass getProceduresSection();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.mu2consol.ProcedureActivityProcedure <em>Procedure Activity Procedure</em>}'.
     * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
     * @return the meta object for class '<em>Procedure Activity Procedure</em>'.
     * @see org.openhealthtools.mdht.uml.cda.mu2consol.ProcedureActivityProcedure
     * @generated
     */
	EClass getProcedureActivityProcedure();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary <em>Clinical Office Visit Summary</em>}'.
     * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
     * @return the meta object for class '<em>Clinical Office Visit Summary</em>'.
     * @see org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary
     * @generated
     */
	EClass getClinicalOfficeVisitSummary();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.mu2consol.MedicationsAdministeredSection <em>Medications Administered Section</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Medications Administered Section</em>'.
     * @see org.openhealthtools.mdht.uml.cda.mu2consol.MedicationsAdministeredSection
     * @generated
     */
    EClass getMedicationsAdministeredSection();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareAmbulatorySummary <em>Transition Of Care Ambulatory Summary</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Transition Of Care Ambulatory Summary</em>'.
     * @see org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareAmbulatorySummary
     * @generated
     */
	EClass getTransitionOfCareAmbulatorySummary();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareInpatientSummary <em>Transition Of Care Inpatient Summary</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Transition Of Care Inpatient Summary</em>'.
     * @see org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareInpatientSummary
     * @generated
     */
	EClass getTransitionOfCareInpatientSummary();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary <em>View Download Transmit Summary</em>}'.
     * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
     * @return the meta object for class '<em>View Download Transmit Summary</em>'.
     * @see org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary
     * @generated
     */
	EClass getViewDownloadTransmitSummary();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary <em>VDT Inpatient Summary</em>}'.
     * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
     * @return the meta object for class '<em>VDT Inpatient Summary</em>'.
     * @see org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary
     * @generated
     */
	EClass getVDTInpatientSummary();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatorySummary <em>VDT Ambulatory Summary</em>}'.
     * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
     * @return the meta object for class '<em>VDT Ambulatory Summary</em>'.
     * @see org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatorySummary
     * @generated
     */
	EClass getVDTAmbulatorySummary();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.mu2consol.FunctionalStatusSection <em>Functional Status Section</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Functional Status Section</em>'.
     * @see org.openhealthtools.mdht.uml.cda.mu2consol.FunctionalStatusSection
     * @generated
     */
    EClass getFunctionalStatusSection();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.mu2consol.CognitiveStatusResultObservation <em>Cognitive Status Result Observation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Cognitive Status Result Observation</em>'.
     * @see org.openhealthtools.mdht.uml.cda.mu2consol.CognitiveStatusResultObservation
     * @generated
     */
    EClass getCognitiveStatusResultObservation();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.mu2consol.CognitiveStatusResultOrganizer <em>Cognitive Status Result Organizer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Cognitive Status Result Organizer</em>'.
     * @see org.openhealthtools.mdht.uml.cda.mu2consol.CognitiveStatusResultOrganizer
     * @generated
     */
    EClass getCognitiveStatusResultOrganizer();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.mu2consol.FunctionalStatusResultObservation <em>Functional Status Result Observation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Functional Status Result Observation</em>'.
     * @see org.openhealthtools.mdht.uml.cda.mu2consol.FunctionalStatusResultObservation
     * @generated
     */
    EClass getFunctionalStatusResultObservation();

	/**
     * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.mu2consol.FunctionalStatusResultOrganizer <em>Functional Status Result Organizer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Functional Status Result Organizer</em>'.
     * @see org.openhealthtools.mdht.uml.cda.mu2consol.FunctionalStatusResultOrganizer
     * @generated
     */
    EClass getFunctionalStatusResultOrganizer();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Mu2consolFactory getMu2consolFactory();

	/**
     * <!-- begin-user-doc --> Defines literals for the meta objects that
	 * represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
     * @generated
     */
	interface Literals {
		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.mu2consol.impl.GeneralHeaderConstraintsImpl <em>General Header Constraints</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.GeneralHeaderConstraintsImpl
         * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.Mu2consolPackageImpl#getGeneralHeaderConstraints()
         * @generated
         */
		EClass GENERAL_HEADER_CONSTRAINTS = eINSTANCE.getGeneralHeaderConstraints();

		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.mu2consol.impl.SummaryOfCareRecordImpl <em>Summary Of Care Record</em>}' class.
         * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.SummaryOfCareRecordImpl
         * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.Mu2consolPackageImpl#getSummaryOfCareRecord()
         * @generated
         */
		EClass SUMMARY_OF_CARE_RECORD = eINSTANCE.getSummaryOfCareRecord();

		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.mu2consol.impl.SocialHistorySectionImpl <em>Social History Section</em>}' class.
         * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.SocialHistorySectionImpl
         * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.Mu2consolPackageImpl#getSocialHistorySection()
         * @generated
         */
		EClass SOCIAL_HISTORY_SECTION = eINSTANCE.getSocialHistorySection();

		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.mu2consol.impl.SmokingStatusObservationImpl <em>Smoking Status Observation</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.SmokingStatusObservationImpl
         * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.Mu2consolPackageImpl#getSmokingStatusObservation()
         * @generated
         */
		EClass SMOKING_STATUS_OBSERVATION = eINSTANCE.getSmokingStatusObservation();

		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.mu2consol.impl.ResultsSectionImpl <em>Results Section</em>}' class.
         * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.ResultsSectionImpl
         * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.Mu2consolPackageImpl#getResultsSection()
         * @generated
         */
		EClass RESULTS_SECTION = eINSTANCE.getResultsSection();

		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.mu2consol.impl.ResultOrganizerImpl <em>Result Organizer</em>}' class.
         * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.ResultOrganizerImpl
         * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.Mu2consolPackageImpl#getResultOrganizer()
         * @generated
         */
		EClass RESULT_ORGANIZER = eINSTANCE.getResultOrganizer();

		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.mu2consol.impl.ResultObservationImpl <em>Result Observation</em>}' class.
         * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.ResultObservationImpl
         * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.Mu2consolPackageImpl#getResultObservation()
         * @generated
         */
		EClass RESULT_OBSERVATION = eINSTANCE.getResultObservation();

		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.mu2consol.impl.ProceduresSectionImpl <em>Procedures Section</em>}' class.
         * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.ProceduresSectionImpl
         * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.Mu2consolPackageImpl#getProceduresSection()
         * @generated
         */
		EClass PROCEDURES_SECTION = eINSTANCE.getProceduresSection();

		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.mu2consol.impl.ProcedureActivityProcedureImpl <em>Procedure Activity Procedure</em>}' class.
         * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.ProcedureActivityProcedureImpl
         * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.Mu2consolPackageImpl#getProcedureActivityProcedure()
         * @generated
         */
		EClass PROCEDURE_ACTIVITY_PROCEDURE = eINSTANCE.getProcedureActivityProcedure();

		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.mu2consol.impl.ClinicalOfficeVisitSummaryImpl <em>Clinical Office Visit Summary</em>}' class.
         * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.ClinicalOfficeVisitSummaryImpl
         * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.Mu2consolPackageImpl#getClinicalOfficeVisitSummary()
         * @generated
         */
		EClass CLINICAL_OFFICE_VISIT_SUMMARY = eINSTANCE.getClinicalOfficeVisitSummary();

		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.mu2consol.impl.MedicationsAdministeredSectionImpl <em>Medications Administered Section</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.MedicationsAdministeredSectionImpl
         * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.Mu2consolPackageImpl#getMedicationsAdministeredSection()
         * @generated
         */
        EClass MEDICATIONS_ADMINISTERED_SECTION = eINSTANCE.getMedicationsAdministeredSection();

		/**
		 * The meta object literal for the '
		 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.impl.TransitionOfCareAmbulatorySummaryImpl
		 * <em>Transition Of Care Ambulatory Summary</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.TransitionOfCareAmbulatorySummaryImpl
		 * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.Mu2consolPackageImpl#getTransitionOfCareAmbulatorySummary()
		 * @generated
		 */
		EClass TRANSITION_OF_CARE_AMBULATORY_SUMMARY = eINSTANCE.getTransitionOfCareAmbulatorySummary();

		/**
		 * The meta object literal for the '
		 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.impl.TransitionOfCareInpatientSummaryImpl
		 * <em>Transition Of Care Inpatient Summary</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.TransitionOfCareInpatientSummaryImpl
		 * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.Mu2consolPackageImpl#getTransitionOfCareInpatientSummary()
		 * @generated
		 */
		EClass TRANSITION_OF_CARE_INPATIENT_SUMMARY = eINSTANCE.getTransitionOfCareInpatientSummary();

		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.mu2consol.impl.ViewDownloadTransmitSummaryImpl <em>View Download Transmit Summary</em>}' class.
         * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.ViewDownloadTransmitSummaryImpl
         * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.Mu2consolPackageImpl#getViewDownloadTransmitSummary()
         * @generated
         */
		EClass VIEW_DOWNLOAD_TRANSMIT_SUMMARY = eINSTANCE.getViewDownloadTransmitSummary();

		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.mu2consol.impl.VDTInpatientSummaryImpl <em>VDT Inpatient Summary</em>}' class.
         * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.VDTInpatientSummaryImpl
         * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.Mu2consolPackageImpl#getVDTInpatientSummary()
         * @generated
         */
		EClass VDT_INPATIENT_SUMMARY = eINSTANCE.getVDTInpatientSummary();

		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.mu2consol.impl.VDTAmbulatorySummaryImpl <em>VDT Ambulatory Summary</em>}' class.
         * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.VDTAmbulatorySummaryImpl
         * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.Mu2consolPackageImpl#getVDTAmbulatorySummary()
         * @generated
         */
		EClass VDT_AMBULATORY_SUMMARY = eINSTANCE.getVDTAmbulatorySummary();

		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.mu2consol.impl.FunctionalStatusSectionImpl <em>Functional Status Section</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.FunctionalStatusSectionImpl
         * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.Mu2consolPackageImpl#getFunctionalStatusSection()
         * @generated
         */
        EClass FUNCTIONAL_STATUS_SECTION = eINSTANCE.getFunctionalStatusSection();

		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.mu2consol.impl.CognitiveStatusResultObservationImpl <em>Cognitive Status Result Observation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.CognitiveStatusResultObservationImpl
         * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.Mu2consolPackageImpl#getCognitiveStatusResultObservation()
         * @generated
         */
        EClass COGNITIVE_STATUS_RESULT_OBSERVATION = eINSTANCE.getCognitiveStatusResultObservation();

		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.mu2consol.impl.CognitiveStatusResultOrganizerImpl <em>Cognitive Status Result Organizer</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.CognitiveStatusResultOrganizerImpl
         * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.Mu2consolPackageImpl#getCognitiveStatusResultOrganizer()
         * @generated
         */
        EClass COGNITIVE_STATUS_RESULT_ORGANIZER = eINSTANCE.getCognitiveStatusResultOrganizer();

		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.mu2consol.impl.FunctionalStatusResultObservationImpl <em>Functional Status Result Observation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.FunctionalStatusResultObservationImpl
         * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.Mu2consolPackageImpl#getFunctionalStatusResultObservation()
         * @generated
         */
        EClass FUNCTIONAL_STATUS_RESULT_OBSERVATION = eINSTANCE.getFunctionalStatusResultObservation();

		/**
         * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.mu2consol.impl.FunctionalStatusResultOrganizerImpl <em>Functional Status Result Organizer</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.FunctionalStatusResultOrganizerImpl
         * @see org.openhealthtools.mdht.uml.cda.mu2consol.impl.Mu2consolPackageImpl#getFunctionalStatusResultOrganizer()
         * @generated
         */
        EClass FUNCTIONAL_STATUS_RESULT_ORGANIZER = eINSTANCE.getFunctionalStatusResultOrganizer();

	}

} // Mu2consolPackage
