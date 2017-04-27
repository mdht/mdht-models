/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.qrda.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.openhealthtools.mdht.uml.cda.qrda.MeasureSection;
import org.openhealthtools.mdht.uml.cda.qrda.QRDAPackage;
import org.openhealthtools.mdht.uml.cda.qrda.QrdaPlugin;
import org.openhealthtools.mdht.uml.cda.qrda.QualityReportingDocumentArchitectureDocument;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.qrda.QRDAPackage
 * @generated
 */
public class QRDAValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final QRDAValidator INSTANCE = new QRDAValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.openhealthtools.mdht.uml.cda.qrda";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Quality Reporting Document Architecture Document Template Id' of 'Quality Reporting Document Architecture Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT__QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_TEMPLATE_ID = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Quality Reporting Document Architecture Document Code P' of 'Quality Reporting Document Architecture Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT__QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_CODE_P = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Quality Reporting Document Architecture Document Code' of 'Quality Reporting Document Architecture Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT__QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_CODE = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Quality Reporting Document Architecture Document Title' of 'Quality Reporting Document Architecture Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT__QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_TITLE = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Quality Reporting Document Architecture Document Custodian' of 'Quality Reporting Document Architecture Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT__QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_CUSTODIAN = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Quality Reporting Document Architecture Document Legal Authenticator' of 'Quality Reporting Document Architecture Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT__QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_LEGAL_AUTHENTICATOR = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Quality Reporting Document Architecture Document Record Target' of 'Quality Reporting Document Architecture Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT__QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_RECORD_TARGET = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Quality Reporting Document Architecture Document Measure Section' of 'Quality Reporting Document Architecture Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT__QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT_MEASURE_SECTION = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Measure Section Template Id' of 'Measure Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEASURE_SECTION__MEASURE_SECTION_TEMPLATE_ID = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Measure Section Code' of 'Measure Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEASURE_SECTION__MEASURE_SECTION_CODE = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Measure Section Text' of 'Measure Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEASURE_SECTION__MEASURE_SECTION_TEXT = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Measure Section Title' of 'Measure Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEASURE_SECTION__MEASURE_SECTION_TITLE = 12;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 12;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected org.eclipse.mdht.uml.cda.util.CDAValidator cdaValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QRDAValidator() {
		super();
		cdaValidator = org.eclipse.mdht.uml.cda.util.CDAValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return QRDAPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case QRDAPackage.QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT:
				return validateQualityReportingDocumentArchitectureDocument((QualityReportingDocumentArchitectureDocument)value, diagnostics, context);
			case QRDAPackage.MEASURE_SECTION:
				return validateMeasureSection((MeasureSection)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQualityReportingDocumentArchitectureDocument(QualityReportingDocumentArchitectureDocument qualityReportingDocumentArchitectureDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(qualityReportingDocumentArchitectureDocument, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(qualityReportingDocumentArchitectureDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(qualityReportingDocumentArchitectureDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(qualityReportingDocumentArchitectureDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(qualityReportingDocumentArchitectureDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(qualityReportingDocumentArchitectureDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(qualityReportingDocumentArchitectureDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(qualityReportingDocumentArchitectureDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(qualityReportingDocumentArchitectureDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateClassCode(qualityReportingDocumentArchitectureDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateMoodCode(qualityReportingDocumentArchitectureDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateQualityReportingDocumentArchitectureDocument_validateQualityReportingDocumentArchitectureDocumentTemplateId(qualityReportingDocumentArchitectureDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateQualityReportingDocumentArchitectureDocument_validateQualityReportingDocumentArchitectureDocumentCodeP(qualityReportingDocumentArchitectureDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateQualityReportingDocumentArchitectureDocument_validateQualityReportingDocumentArchitectureDocumentCode(qualityReportingDocumentArchitectureDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateQualityReportingDocumentArchitectureDocument_validateQualityReportingDocumentArchitectureDocumentTitle(qualityReportingDocumentArchitectureDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateQualityReportingDocumentArchitectureDocument_validateQualityReportingDocumentArchitectureDocumentCustodian(qualityReportingDocumentArchitectureDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateQualityReportingDocumentArchitectureDocument_validateQualityReportingDocumentArchitectureDocumentLegalAuthenticator(qualityReportingDocumentArchitectureDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateQualityReportingDocumentArchitectureDocument_validateQualityReportingDocumentArchitectureDocumentRecordTarget(qualityReportingDocumentArchitectureDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateQualityReportingDocumentArchitectureDocument_validateQualityReportingDocumentArchitectureDocumentMeasureSection(qualityReportingDocumentArchitectureDocument, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateQualityReportingDocumentArchitectureDocumentTemplateId constraint of '<em>Quality Reporting Document Architecture Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQualityReportingDocumentArchitectureDocument_validateQualityReportingDocumentArchitectureDocumentTemplateId(QualityReportingDocumentArchitectureDocument qualityReportingDocumentArchitectureDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return qualityReportingDocumentArchitectureDocument.validateQualityReportingDocumentArchitectureDocumentTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateQualityReportingDocumentArchitectureDocumentCodeP constraint of '<em>Quality Reporting Document Architecture Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQualityReportingDocumentArchitectureDocument_validateQualityReportingDocumentArchitectureDocumentCodeP(QualityReportingDocumentArchitectureDocument qualityReportingDocumentArchitectureDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return qualityReportingDocumentArchitectureDocument.validateQualityReportingDocumentArchitectureDocumentCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateQualityReportingDocumentArchitectureDocumentCode constraint of '<em>Quality Reporting Document Architecture Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQualityReportingDocumentArchitectureDocument_validateQualityReportingDocumentArchitectureDocumentCode(QualityReportingDocumentArchitectureDocument qualityReportingDocumentArchitectureDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return qualityReportingDocumentArchitectureDocument.validateQualityReportingDocumentArchitectureDocumentCode(diagnostics, context);
	}

	/**
	 * Validates the validateQualityReportingDocumentArchitectureDocumentTitle constraint of '<em>Quality Reporting Document Architecture Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQualityReportingDocumentArchitectureDocument_validateQualityReportingDocumentArchitectureDocumentTitle(QualityReportingDocumentArchitectureDocument qualityReportingDocumentArchitectureDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return qualityReportingDocumentArchitectureDocument.validateQualityReportingDocumentArchitectureDocumentTitle(diagnostics, context);
	}

	/**
	 * Validates the validateQualityReportingDocumentArchitectureDocumentCustodian constraint of '<em>Quality Reporting Document Architecture Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQualityReportingDocumentArchitectureDocument_validateQualityReportingDocumentArchitectureDocumentCustodian(QualityReportingDocumentArchitectureDocument qualityReportingDocumentArchitectureDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return qualityReportingDocumentArchitectureDocument.validateQualityReportingDocumentArchitectureDocumentCustodian(diagnostics, context);
	}

	/**
	 * Validates the validateQualityReportingDocumentArchitectureDocumentLegalAuthenticator constraint of '<em>Quality Reporting Document Architecture Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQualityReportingDocumentArchitectureDocument_validateQualityReportingDocumentArchitectureDocumentLegalAuthenticator(QualityReportingDocumentArchitectureDocument qualityReportingDocumentArchitectureDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return qualityReportingDocumentArchitectureDocument.validateQualityReportingDocumentArchitectureDocumentLegalAuthenticator(diagnostics, context);
	}

	/**
	 * Validates the validateQualityReportingDocumentArchitectureDocumentRecordTarget constraint of '<em>Quality Reporting Document Architecture Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQualityReportingDocumentArchitectureDocument_validateQualityReportingDocumentArchitectureDocumentRecordTarget(QualityReportingDocumentArchitectureDocument qualityReportingDocumentArchitectureDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return qualityReportingDocumentArchitectureDocument.validateQualityReportingDocumentArchitectureDocumentRecordTarget(diagnostics, context);
	}

	/**
	 * Validates the validateQualityReportingDocumentArchitectureDocumentMeasureSection constraint of '<em>Quality Reporting Document Architecture Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQualityReportingDocumentArchitectureDocument_validateQualityReportingDocumentArchitectureDocumentMeasureSection(QualityReportingDocumentArchitectureDocument qualityReportingDocumentArchitectureDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return qualityReportingDocumentArchitectureDocument.validateQualityReportingDocumentArchitectureDocumentMeasureSection(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureSection(MeasureSection measureSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(measureSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(measureSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(measureSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(measureSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(measureSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(measureSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(measureSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(measureSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(measureSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(measureSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(measureSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateMeasureSection_validateMeasureSectionTemplateId(measureSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateMeasureSection_validateMeasureSectionCode(measureSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateMeasureSection_validateMeasureSectionText(measureSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateMeasureSection_validateMeasureSectionTitle(measureSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateMeasureSectionTemplateId constraint of '<em>Measure Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureSection_validateMeasureSectionTemplateId(MeasureSection measureSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return measureSection.validateMeasureSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateMeasureSectionCode constraint of '<em>Measure Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureSection_validateMeasureSectionCode(MeasureSection measureSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return measureSection.validateMeasureSectionCode(diagnostics, context);
	}

	/**
	 * Validates the validateMeasureSectionText constraint of '<em>Measure Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureSection_validateMeasureSectionText(MeasureSection measureSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return measureSection.validateMeasureSectionText(diagnostics, context);
	}

	/**
	 * Validates the validateMeasureSectionTitle constraint of '<em>Measure Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureSection_validateMeasureSectionTitle(MeasureSection measureSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return measureSection.validateMeasureSectionTitle(diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return QrdaPlugin.INSTANCE;
	}

} //QRDAValidator
