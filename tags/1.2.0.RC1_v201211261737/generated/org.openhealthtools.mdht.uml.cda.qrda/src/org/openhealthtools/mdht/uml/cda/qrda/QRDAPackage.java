/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.qrda;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.openhealthtools.mdht.uml.cda.CDAPackage;

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
 * @see org.openhealthtools.mdht.uml.cda.qrda.QRDAFactory
 * @model kind="package"
 * @generated
 */
public interface QRDAPackage extends EPackage {
	/**
   * The package name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String eNAME = "qrda";

	/**
   * The package namespace URI.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String eNS_URI = "http://www.openhealthtools.org/mdht/uml/cda/qrda";

	/**
   * The package namespace name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String eNS_PREFIX = "qrda";

	/**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	QRDAPackage eINSTANCE = org.openhealthtools.mdht.uml.cda.qrda.impl.QRDAPackageImpl.init();

	/**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.qrda.impl.QualityReportingDocumentArchitectureDocumentImpl <em>Quality Reporting Document Architecture Document</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.qrda.impl.QualityReportingDocumentArchitectureDocumentImpl
   * @see org.openhealthtools.mdht.uml.cda.qrda.impl.QRDAPackageImpl#getQualityReportingDocumentArchitectureDocument()
   * @generated
   */
	int QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT = 0;

	/**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT__REALM_CODE = CDAPackage.CLINICAL_DOCUMENT__REALM_CODE;

	/**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT__TYPE_ID = CDAPackage.CLINICAL_DOCUMENT__TYPE_ID;

	/**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT__TEMPLATE_ID = CDAPackage.CLINICAL_DOCUMENT__TEMPLATE_ID;

	/**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT__ID = CDAPackage.CLINICAL_DOCUMENT__ID;

	/**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT__CODE = CDAPackage.CLINICAL_DOCUMENT__CODE;

	/**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT__TITLE = CDAPackage.CLINICAL_DOCUMENT__TITLE;

	/**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT__EFFECTIVE_TIME = CDAPackage.CLINICAL_DOCUMENT__EFFECTIVE_TIME;

	/**
   * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT__CONFIDENTIALITY_CODE = CDAPackage.CLINICAL_DOCUMENT__CONFIDENTIALITY_CODE;

	/**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT__LANGUAGE_CODE = CDAPackage.CLINICAL_DOCUMENT__LANGUAGE_CODE;

	/**
   * The feature id for the '<em><b>Set Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT__SET_ID = CDAPackage.CLINICAL_DOCUMENT__SET_ID;

	/**
   * The feature id for the '<em><b>Version Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT__VERSION_NUMBER = CDAPackage.CLINICAL_DOCUMENT__VERSION_NUMBER;

	/**
   * The feature id for the '<em><b>Copy Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT__COPY_TIME = CDAPackage.CLINICAL_DOCUMENT__COPY_TIME;

	/**
   * The feature id for the '<em><b>Record Target</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT__RECORD_TARGET = CDAPackage.CLINICAL_DOCUMENT__RECORD_TARGET;

	/**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT__AUTHOR = CDAPackage.CLINICAL_DOCUMENT__AUTHOR;

	/**
   * The feature id for the '<em><b>Data Enterer</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT__DATA_ENTERER = CDAPackage.CLINICAL_DOCUMENT__DATA_ENTERER;

	/**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT__INFORMANT = CDAPackage.CLINICAL_DOCUMENT__INFORMANT;

	/**
   * The feature id for the '<em><b>Custodian</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT__CUSTODIAN = CDAPackage.CLINICAL_DOCUMENT__CUSTODIAN;

	/**
   * The feature id for the '<em><b>Information Recipient</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT__INFORMATION_RECIPIENT = CDAPackage.CLINICAL_DOCUMENT__INFORMATION_RECIPIENT;

	/**
   * The feature id for the '<em><b>Legal Authenticator</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT__LEGAL_AUTHENTICATOR = CDAPackage.CLINICAL_DOCUMENT__LEGAL_AUTHENTICATOR;

	/**
   * The feature id for the '<em><b>Authenticator</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT__AUTHENTICATOR = CDAPackage.CLINICAL_DOCUMENT__AUTHENTICATOR;

	/**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT__PARTICIPANT = CDAPackage.CLINICAL_DOCUMENT__PARTICIPANT;

	/**
   * The feature id for the '<em><b>In Fulfillment Of</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT__IN_FULFILLMENT_OF = CDAPackage.CLINICAL_DOCUMENT__IN_FULFILLMENT_OF;

	/**
   * The feature id for the '<em><b>Documentation Of</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT__DOCUMENTATION_OF = CDAPackage.CLINICAL_DOCUMENT__DOCUMENTATION_OF;

	/**
   * The feature id for the '<em><b>Related Document</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT__RELATED_DOCUMENT = CDAPackage.CLINICAL_DOCUMENT__RELATED_DOCUMENT;

	/**
   * The feature id for the '<em><b>Authorization</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT__AUTHORIZATION = CDAPackage.CLINICAL_DOCUMENT__AUTHORIZATION;

	/**
   * The feature id for the '<em><b>Component Of</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT__COMPONENT_OF = CDAPackage.CLINICAL_DOCUMENT__COMPONENT_OF;

	/**
   * The feature id for the '<em><b>Component</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT__COMPONENT = CDAPackage.CLINICAL_DOCUMENT__COMPONENT;

	/**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT__NULL_FLAVOR = CDAPackage.CLINICAL_DOCUMENT__NULL_FLAVOR;

	/**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT__CLASS_CODE = CDAPackage.CLINICAL_DOCUMENT__CLASS_CODE;

	/**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT__MOOD_CODE = CDAPackage.CLINICAL_DOCUMENT__MOOD_CODE;

	/**
   * The number of structural features of the '<em>Quality Reporting Document Architecture Document</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_FEATURE_COUNT = CDAPackage.CLINICAL_DOCUMENT_FEATURE_COUNT + 0;

	/**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.qrda.impl.MeasureSectionImpl <em>Measure Section</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.qrda.impl.MeasureSectionImpl
   * @see org.openhealthtools.mdht.uml.cda.qrda.impl.QRDAPackageImpl#getMeasureSection()
   * @generated
   */
	int MEASURE_SECTION = 1;

	/**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASURE_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASURE_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASURE_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASURE_SECTION__ID = CDAPackage.SECTION__ID;

	/**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASURE_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASURE_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASURE_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
   * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASURE_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASURE_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASURE_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASURE_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASURE_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
   * The feature id for the '<em><b>Entry</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASURE_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
   * The feature id for the '<em><b>Component</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASURE_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
   * The feature id for the '<em><b>Section Id</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASURE_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASURE_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASURE_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASURE_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
   * The number of structural features of the '<em>Measure Section</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEASURE_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;


	/**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.qrda.QualityReportingDocumentArchitectureDocument <em>Quality Reporting Document Architecture Document</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Quality Reporting Document Architecture Document</em>'.
   * @see org.openhealthtools.mdht.uml.cda.qrda.QualityReportingDocumentArchitectureDocument
   * @generated
   */
	EClass getQualityReportingDocumentArchitectureDocument();

	/**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.qrda.MeasureSection <em>Measure Section</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Measure Section</em>'.
   * @see org.openhealthtools.mdht.uml.cda.qrda.MeasureSection
   * @generated
   */
	EClass getMeasureSection();

	/**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
	QRDAFactory getQRDAFactory();

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
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.qrda.impl.QualityReportingDocumentArchitectureDocumentImpl <em>Quality Reporting Document Architecture Document</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.qrda.impl.QualityReportingDocumentArchitectureDocumentImpl
     * @see org.openhealthtools.mdht.uml.cda.qrda.impl.QRDAPackageImpl#getQualityReportingDocumentArchitectureDocument()
     * @generated
     */
		EClass QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT = eINSTANCE.getQualityReportingDocumentArchitectureDocument();
		/**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.qrda.impl.MeasureSectionImpl <em>Measure Section</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.qrda.impl.MeasureSectionImpl
     * @see org.openhealthtools.mdht.uml.cda.qrda.impl.QRDAPackageImpl#getMeasureSection()
     * @generated
     */
		EClass MEASURE_SECTION = eINSTANCE.getMeasureSection();

	}

} //QRDAPackage
