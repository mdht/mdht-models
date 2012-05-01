/*******************************************************************************
 * Copyright (c) 2011, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.toc;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.openhealthtools.mdht.uml.cda.cdt.CDTPackage;

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
 * @see org.openhealthtools.mdht.uml.cda.toc.ToCFactory
 * @model kind="package"
 * @generated
 */
public interface ToCPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "toc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.openhealthtools.org/mdht/uml/cda/toc";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "toc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ToCPackage eINSTANCE = org.openhealthtools.mdht.uml.cda.toc.impl.ToCPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.impl.DischargeSummaryImpl <em>Discharge Summary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.impl.DischargeSummaryImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.impl.ToCPackageImpl#getDischargeSummary()
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
	int DISCHARGE_SUMMARY__REALM_CODE = CDTPackage.GENERAL_HEADER_CONSTRAINTS__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_SUMMARY__TYPE_ID = CDTPackage.GENERAL_HEADER_CONSTRAINTS__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_SUMMARY__TEMPLATE_ID = CDTPackage.GENERAL_HEADER_CONSTRAINTS__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_SUMMARY__ID = CDTPackage.GENERAL_HEADER_CONSTRAINTS__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_SUMMARY__CODE = CDTPackage.GENERAL_HEADER_CONSTRAINTS__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_SUMMARY__TITLE = CDTPackage.GENERAL_HEADER_CONSTRAINTS__TITLE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_SUMMARY__EFFECTIVE_TIME = CDTPackage.GENERAL_HEADER_CONSTRAINTS__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_SUMMARY__CONFIDENTIALITY_CODE = CDTPackage.GENERAL_HEADER_CONSTRAINTS__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_SUMMARY__LANGUAGE_CODE = CDTPackage.GENERAL_HEADER_CONSTRAINTS__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Set Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_SUMMARY__SET_ID = CDTPackage.GENERAL_HEADER_CONSTRAINTS__SET_ID;

	/**
	 * The feature id for the '<em><b>Version Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_SUMMARY__VERSION_NUMBER = CDTPackage.GENERAL_HEADER_CONSTRAINTS__VERSION_NUMBER;

	/**
	 * The feature id for the '<em><b>Copy Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_SUMMARY__COPY_TIME = CDTPackage.GENERAL_HEADER_CONSTRAINTS__COPY_TIME;

	/**
	 * The feature id for the '<em><b>Record Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_SUMMARY__RECORD_TARGET = CDTPackage.GENERAL_HEADER_CONSTRAINTS__RECORD_TARGET;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_SUMMARY__AUTHOR = CDTPackage.GENERAL_HEADER_CONSTRAINTS__AUTHOR;

	/**
	 * The feature id for the '<em><b>Data Enterer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_SUMMARY__DATA_ENTERER = CDTPackage.GENERAL_HEADER_CONSTRAINTS__DATA_ENTERER;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_SUMMARY__INFORMANT = CDTPackage.GENERAL_HEADER_CONSTRAINTS__INFORMANT;

	/**
	 * The feature id for the '<em><b>Custodian</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_SUMMARY__CUSTODIAN = CDTPackage.GENERAL_HEADER_CONSTRAINTS__CUSTODIAN;

	/**
	 * The feature id for the '<em><b>Information Recipient</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_SUMMARY__INFORMATION_RECIPIENT = CDTPackage.GENERAL_HEADER_CONSTRAINTS__INFORMATION_RECIPIENT;

	/**
	 * The feature id for the '<em><b>Legal Authenticator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_SUMMARY__LEGAL_AUTHENTICATOR = CDTPackage.GENERAL_HEADER_CONSTRAINTS__LEGAL_AUTHENTICATOR;

	/**
	 * The feature id for the '<em><b>Authenticator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_SUMMARY__AUTHENTICATOR = CDTPackage.GENERAL_HEADER_CONSTRAINTS__AUTHENTICATOR;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_SUMMARY__PARTICIPANT = CDTPackage.GENERAL_HEADER_CONSTRAINTS__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>In Fulfillment Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_SUMMARY__IN_FULFILLMENT_OF = CDTPackage.GENERAL_HEADER_CONSTRAINTS__IN_FULFILLMENT_OF;

	/**
	 * The feature id for the '<em><b>Documentation Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_SUMMARY__DOCUMENTATION_OF = CDTPackage.GENERAL_HEADER_CONSTRAINTS__DOCUMENTATION_OF;

	/**
	 * The feature id for the '<em><b>Related Document</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_SUMMARY__RELATED_DOCUMENT = CDTPackage.GENERAL_HEADER_CONSTRAINTS__RELATED_DOCUMENT;

	/**
	 * The feature id for the '<em><b>Authorization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_SUMMARY__AUTHORIZATION = CDTPackage.GENERAL_HEADER_CONSTRAINTS__AUTHORIZATION;

	/**
	 * The feature id for the '<em><b>Component Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_SUMMARY__COMPONENT_OF = CDTPackage.GENERAL_HEADER_CONSTRAINTS__COMPONENT_OF;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_SUMMARY__COMPONENT = CDTPackage.GENERAL_HEADER_CONSTRAINTS__COMPONENT;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_SUMMARY__NULL_FLAVOR = CDTPackage.GENERAL_HEADER_CONSTRAINTS__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_SUMMARY__CLASS_CODE = CDTPackage.GENERAL_HEADER_CONSTRAINTS__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_SUMMARY__MOOD_CODE = CDTPackage.GENERAL_HEADER_CONSTRAINTS__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Discharge Summary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_SUMMARY_FEATURE_COUNT = CDTPackage.GENERAL_HEADER_CONSTRAINTS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.impl.DischargeInstructionsImpl <em>Discharge Instructions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.impl.DischargeInstructionsImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.impl.ToCPackageImpl#getDischargeInstructions()
	 * @generated
	 */
	int DISCHARGE_INSTRUCTIONS = 1;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_INSTRUCTIONS__REALM_CODE = CDTPackage.GENERAL_HEADER_CONSTRAINTS__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_INSTRUCTIONS__TYPE_ID = CDTPackage.GENERAL_HEADER_CONSTRAINTS__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_INSTRUCTIONS__TEMPLATE_ID = CDTPackage.GENERAL_HEADER_CONSTRAINTS__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_INSTRUCTIONS__ID = CDTPackage.GENERAL_HEADER_CONSTRAINTS__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_INSTRUCTIONS__CODE = CDTPackage.GENERAL_HEADER_CONSTRAINTS__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_INSTRUCTIONS__TITLE = CDTPackage.GENERAL_HEADER_CONSTRAINTS__TITLE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_INSTRUCTIONS__EFFECTIVE_TIME = CDTPackage.GENERAL_HEADER_CONSTRAINTS__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_INSTRUCTIONS__CONFIDENTIALITY_CODE = CDTPackage.GENERAL_HEADER_CONSTRAINTS__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_INSTRUCTIONS__LANGUAGE_CODE = CDTPackage.GENERAL_HEADER_CONSTRAINTS__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Set Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_INSTRUCTIONS__SET_ID = CDTPackage.GENERAL_HEADER_CONSTRAINTS__SET_ID;

	/**
	 * The feature id for the '<em><b>Version Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_INSTRUCTIONS__VERSION_NUMBER = CDTPackage.GENERAL_HEADER_CONSTRAINTS__VERSION_NUMBER;

	/**
	 * The feature id for the '<em><b>Copy Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_INSTRUCTIONS__COPY_TIME = CDTPackage.GENERAL_HEADER_CONSTRAINTS__COPY_TIME;

	/**
	 * The feature id for the '<em><b>Record Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_INSTRUCTIONS__RECORD_TARGET = CDTPackage.GENERAL_HEADER_CONSTRAINTS__RECORD_TARGET;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_INSTRUCTIONS__AUTHOR = CDTPackage.GENERAL_HEADER_CONSTRAINTS__AUTHOR;

	/**
	 * The feature id for the '<em><b>Data Enterer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_INSTRUCTIONS__DATA_ENTERER = CDTPackage.GENERAL_HEADER_CONSTRAINTS__DATA_ENTERER;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_INSTRUCTIONS__INFORMANT = CDTPackage.GENERAL_HEADER_CONSTRAINTS__INFORMANT;

	/**
	 * The feature id for the '<em><b>Custodian</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_INSTRUCTIONS__CUSTODIAN = CDTPackage.GENERAL_HEADER_CONSTRAINTS__CUSTODIAN;

	/**
	 * The feature id for the '<em><b>Information Recipient</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_INSTRUCTIONS__INFORMATION_RECIPIENT = CDTPackage.GENERAL_HEADER_CONSTRAINTS__INFORMATION_RECIPIENT;

	/**
	 * The feature id for the '<em><b>Legal Authenticator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_INSTRUCTIONS__LEGAL_AUTHENTICATOR = CDTPackage.GENERAL_HEADER_CONSTRAINTS__LEGAL_AUTHENTICATOR;

	/**
	 * The feature id for the '<em><b>Authenticator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_INSTRUCTIONS__AUTHENTICATOR = CDTPackage.GENERAL_HEADER_CONSTRAINTS__AUTHENTICATOR;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_INSTRUCTIONS__PARTICIPANT = CDTPackage.GENERAL_HEADER_CONSTRAINTS__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>In Fulfillment Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_INSTRUCTIONS__IN_FULFILLMENT_OF = CDTPackage.GENERAL_HEADER_CONSTRAINTS__IN_FULFILLMENT_OF;

	/**
	 * The feature id for the '<em><b>Documentation Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_INSTRUCTIONS__DOCUMENTATION_OF = CDTPackage.GENERAL_HEADER_CONSTRAINTS__DOCUMENTATION_OF;

	/**
	 * The feature id for the '<em><b>Related Document</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_INSTRUCTIONS__RELATED_DOCUMENT = CDTPackage.GENERAL_HEADER_CONSTRAINTS__RELATED_DOCUMENT;

	/**
	 * The feature id for the '<em><b>Authorization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_INSTRUCTIONS__AUTHORIZATION = CDTPackage.GENERAL_HEADER_CONSTRAINTS__AUTHORIZATION;

	/**
	 * The feature id for the '<em><b>Component Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_INSTRUCTIONS__COMPONENT_OF = CDTPackage.GENERAL_HEADER_CONSTRAINTS__COMPONENT_OF;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_INSTRUCTIONS__COMPONENT = CDTPackage.GENERAL_HEADER_CONSTRAINTS__COMPONENT;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_INSTRUCTIONS__NULL_FLAVOR = CDTPackage.GENERAL_HEADER_CONSTRAINTS__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_INSTRUCTIONS__CLASS_CODE = CDTPackage.GENERAL_HEADER_CONSTRAINTS__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_INSTRUCTIONS__MOOD_CODE = CDTPackage.GENERAL_HEADER_CONSTRAINTS__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Discharge Instructions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCHARGE_INSTRUCTIONS_FEATURE_COUNT = CDTPackage.GENERAL_HEADER_CONSTRAINTS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.impl.ConsultationSummaryImpl <em>Consultation Summary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.impl.ConsultationSummaryImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.impl.ToCPackageImpl#getConsultationSummary()
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
	int CONSULTATION_SUMMARY__REALM_CODE = CDTPackage.GENERAL_HEADER_CONSTRAINTS__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_SUMMARY__TYPE_ID = CDTPackage.GENERAL_HEADER_CONSTRAINTS__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_SUMMARY__TEMPLATE_ID = CDTPackage.GENERAL_HEADER_CONSTRAINTS__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_SUMMARY__ID = CDTPackage.GENERAL_HEADER_CONSTRAINTS__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_SUMMARY__CODE = CDTPackage.GENERAL_HEADER_CONSTRAINTS__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_SUMMARY__TITLE = CDTPackage.GENERAL_HEADER_CONSTRAINTS__TITLE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_SUMMARY__EFFECTIVE_TIME = CDTPackage.GENERAL_HEADER_CONSTRAINTS__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_SUMMARY__CONFIDENTIALITY_CODE = CDTPackage.GENERAL_HEADER_CONSTRAINTS__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_SUMMARY__LANGUAGE_CODE = CDTPackage.GENERAL_HEADER_CONSTRAINTS__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Set Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_SUMMARY__SET_ID = CDTPackage.GENERAL_HEADER_CONSTRAINTS__SET_ID;

	/**
	 * The feature id for the '<em><b>Version Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_SUMMARY__VERSION_NUMBER = CDTPackage.GENERAL_HEADER_CONSTRAINTS__VERSION_NUMBER;

	/**
	 * The feature id for the '<em><b>Copy Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_SUMMARY__COPY_TIME = CDTPackage.GENERAL_HEADER_CONSTRAINTS__COPY_TIME;

	/**
	 * The feature id for the '<em><b>Record Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_SUMMARY__RECORD_TARGET = CDTPackage.GENERAL_HEADER_CONSTRAINTS__RECORD_TARGET;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_SUMMARY__AUTHOR = CDTPackage.GENERAL_HEADER_CONSTRAINTS__AUTHOR;

	/**
	 * The feature id for the '<em><b>Data Enterer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_SUMMARY__DATA_ENTERER = CDTPackage.GENERAL_HEADER_CONSTRAINTS__DATA_ENTERER;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_SUMMARY__INFORMANT = CDTPackage.GENERAL_HEADER_CONSTRAINTS__INFORMANT;

	/**
	 * The feature id for the '<em><b>Custodian</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_SUMMARY__CUSTODIAN = CDTPackage.GENERAL_HEADER_CONSTRAINTS__CUSTODIAN;

	/**
	 * The feature id for the '<em><b>Information Recipient</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_SUMMARY__INFORMATION_RECIPIENT = CDTPackage.GENERAL_HEADER_CONSTRAINTS__INFORMATION_RECIPIENT;

	/**
	 * The feature id for the '<em><b>Legal Authenticator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_SUMMARY__LEGAL_AUTHENTICATOR = CDTPackage.GENERAL_HEADER_CONSTRAINTS__LEGAL_AUTHENTICATOR;

	/**
	 * The feature id for the '<em><b>Authenticator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_SUMMARY__AUTHENTICATOR = CDTPackage.GENERAL_HEADER_CONSTRAINTS__AUTHENTICATOR;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_SUMMARY__PARTICIPANT = CDTPackage.GENERAL_HEADER_CONSTRAINTS__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>In Fulfillment Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_SUMMARY__IN_FULFILLMENT_OF = CDTPackage.GENERAL_HEADER_CONSTRAINTS__IN_FULFILLMENT_OF;

	/**
	 * The feature id for the '<em><b>Documentation Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_SUMMARY__DOCUMENTATION_OF = CDTPackage.GENERAL_HEADER_CONSTRAINTS__DOCUMENTATION_OF;

	/**
	 * The feature id for the '<em><b>Related Document</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_SUMMARY__RELATED_DOCUMENT = CDTPackage.GENERAL_HEADER_CONSTRAINTS__RELATED_DOCUMENT;

	/**
	 * The feature id for the '<em><b>Authorization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_SUMMARY__AUTHORIZATION = CDTPackage.GENERAL_HEADER_CONSTRAINTS__AUTHORIZATION;

	/**
	 * The feature id for the '<em><b>Component Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_SUMMARY__COMPONENT_OF = CDTPackage.GENERAL_HEADER_CONSTRAINTS__COMPONENT_OF;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_SUMMARY__COMPONENT = CDTPackage.GENERAL_HEADER_CONSTRAINTS__COMPONENT;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_SUMMARY__NULL_FLAVOR = CDTPackage.GENERAL_HEADER_CONSTRAINTS__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_SUMMARY__CLASS_CODE = CDTPackage.GENERAL_HEADER_CONSTRAINTS__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_SUMMARY__MOOD_CODE = CDTPackage.GENERAL_HEADER_CONSTRAINTS__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Consultation Summary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_SUMMARY_FEATURE_COUNT = CDTPackage.GENERAL_HEADER_CONSTRAINTS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.toc.impl.ConsultationRequestImpl <em>Consultation Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.toc.impl.ConsultationRequestImpl
	 * @see org.openhealthtools.mdht.uml.cda.toc.impl.ToCPackageImpl#getConsultationRequest()
	 * @generated
	 */
	int CONSULTATION_REQUEST = 3;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_REQUEST__REALM_CODE = CDTPackage.GENERAL_HEADER_CONSTRAINTS__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_REQUEST__TYPE_ID = CDTPackage.GENERAL_HEADER_CONSTRAINTS__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_REQUEST__TEMPLATE_ID = CDTPackage.GENERAL_HEADER_CONSTRAINTS__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_REQUEST__ID = CDTPackage.GENERAL_HEADER_CONSTRAINTS__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_REQUEST__CODE = CDTPackage.GENERAL_HEADER_CONSTRAINTS__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_REQUEST__TITLE = CDTPackage.GENERAL_HEADER_CONSTRAINTS__TITLE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_REQUEST__EFFECTIVE_TIME = CDTPackage.GENERAL_HEADER_CONSTRAINTS__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_REQUEST__CONFIDENTIALITY_CODE = CDTPackage.GENERAL_HEADER_CONSTRAINTS__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_REQUEST__LANGUAGE_CODE = CDTPackage.GENERAL_HEADER_CONSTRAINTS__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Set Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_REQUEST__SET_ID = CDTPackage.GENERAL_HEADER_CONSTRAINTS__SET_ID;

	/**
	 * The feature id for the '<em><b>Version Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_REQUEST__VERSION_NUMBER = CDTPackage.GENERAL_HEADER_CONSTRAINTS__VERSION_NUMBER;

	/**
	 * The feature id for the '<em><b>Copy Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_REQUEST__COPY_TIME = CDTPackage.GENERAL_HEADER_CONSTRAINTS__COPY_TIME;

	/**
	 * The feature id for the '<em><b>Record Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_REQUEST__RECORD_TARGET = CDTPackage.GENERAL_HEADER_CONSTRAINTS__RECORD_TARGET;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_REQUEST__AUTHOR = CDTPackage.GENERAL_HEADER_CONSTRAINTS__AUTHOR;

	/**
	 * The feature id for the '<em><b>Data Enterer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_REQUEST__DATA_ENTERER = CDTPackage.GENERAL_HEADER_CONSTRAINTS__DATA_ENTERER;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_REQUEST__INFORMANT = CDTPackage.GENERAL_HEADER_CONSTRAINTS__INFORMANT;

	/**
	 * The feature id for the '<em><b>Custodian</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_REQUEST__CUSTODIAN = CDTPackage.GENERAL_HEADER_CONSTRAINTS__CUSTODIAN;

	/**
	 * The feature id for the '<em><b>Information Recipient</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_REQUEST__INFORMATION_RECIPIENT = CDTPackage.GENERAL_HEADER_CONSTRAINTS__INFORMATION_RECIPIENT;

	/**
	 * The feature id for the '<em><b>Legal Authenticator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_REQUEST__LEGAL_AUTHENTICATOR = CDTPackage.GENERAL_HEADER_CONSTRAINTS__LEGAL_AUTHENTICATOR;

	/**
	 * The feature id for the '<em><b>Authenticator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_REQUEST__AUTHENTICATOR = CDTPackage.GENERAL_HEADER_CONSTRAINTS__AUTHENTICATOR;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_REQUEST__PARTICIPANT = CDTPackage.GENERAL_HEADER_CONSTRAINTS__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>In Fulfillment Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_REQUEST__IN_FULFILLMENT_OF = CDTPackage.GENERAL_HEADER_CONSTRAINTS__IN_FULFILLMENT_OF;

	/**
	 * The feature id for the '<em><b>Documentation Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_REQUEST__DOCUMENTATION_OF = CDTPackage.GENERAL_HEADER_CONSTRAINTS__DOCUMENTATION_OF;

	/**
	 * The feature id for the '<em><b>Related Document</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_REQUEST__RELATED_DOCUMENT = CDTPackage.GENERAL_HEADER_CONSTRAINTS__RELATED_DOCUMENT;

	/**
	 * The feature id for the '<em><b>Authorization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_REQUEST__AUTHORIZATION = CDTPackage.GENERAL_HEADER_CONSTRAINTS__AUTHORIZATION;

	/**
	 * The feature id for the '<em><b>Component Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_REQUEST__COMPONENT_OF = CDTPackage.GENERAL_HEADER_CONSTRAINTS__COMPONENT_OF;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_REQUEST__COMPONENT = CDTPackage.GENERAL_HEADER_CONSTRAINTS__COMPONENT;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_REQUEST__NULL_FLAVOR = CDTPackage.GENERAL_HEADER_CONSTRAINTS__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_REQUEST__CLASS_CODE = CDTPackage.GENERAL_HEADER_CONSTRAINTS__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_REQUEST__MOOD_CODE = CDTPackage.GENERAL_HEADER_CONSTRAINTS__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Consultation Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_REQUEST_FEATURE_COUNT = CDTPackage.GENERAL_HEADER_CONSTRAINTS_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.DischargeSummary <em>Discharge Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discharge Summary</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.DischargeSummary
	 * @generated
	 */
	EClass getDischargeSummary();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.DischargeInstructions <em>Discharge Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discharge Instructions</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.DischargeInstructions
	 * @generated
	 */
	EClass getDischargeInstructions();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationSummary <em>Consultation Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consultation Summary</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.ConsultationSummary
	 * @generated
	 */
	EClass getConsultationSummary();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest <em>Consultation Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consultation Request</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest
	 * @generated
	 */
	EClass getConsultationRequest();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ToCFactory getToCFactory();

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
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.toc.impl.DischargeSummaryImpl <em>Discharge Summary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.toc.impl.DischargeSummaryImpl
		 * @see org.openhealthtools.mdht.uml.cda.toc.impl.ToCPackageImpl#getDischargeSummary()
		 * @generated
		 */
		EClass DISCHARGE_SUMMARY = eINSTANCE.getDischargeSummary();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.toc.impl.DischargeInstructionsImpl <em>Discharge Instructions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.toc.impl.DischargeInstructionsImpl
		 * @see org.openhealthtools.mdht.uml.cda.toc.impl.ToCPackageImpl#getDischargeInstructions()
		 * @generated
		 */
		EClass DISCHARGE_INSTRUCTIONS = eINSTANCE.getDischargeInstructions();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.toc.impl.ConsultationSummaryImpl <em>Consultation Summary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.toc.impl.ConsultationSummaryImpl
		 * @see org.openhealthtools.mdht.uml.cda.toc.impl.ToCPackageImpl#getConsultationSummary()
		 * @generated
		 */
		EClass CONSULTATION_SUMMARY = eINSTANCE.getConsultationSummary();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.toc.impl.ConsultationRequestImpl <em>Consultation Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.toc.impl.ConsultationRequestImpl
		 * @see org.openhealthtools.mdht.uml.cda.toc.impl.ToCPackageImpl#getConsultationRequest()
		 * @generated
		 */
		EClass CONSULTATION_REQUEST = eINSTANCE.getConsultationRequest();

	}

} // ToCPackage
