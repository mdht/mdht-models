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

import org.openhealthtools.mdht.uml.cda.qrda.*;

import org.openhealthtools.mdht.uml.cda.util.CDAValidator;

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
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Quality Measure Report Template Id' of 'Quality Measure Report'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUALITY_MEASURE_REPORT__QUALITY_MEASURE_REPORT_TEMPLATE_ID = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 1;

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
	protected CDAValidator cdaValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QRDAValidator() {
		super();
		cdaValidator = CDAValidator.INSTANCE;
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
			case QRDAPackage.QUALITY_MEASURE_REPORT:
				return validateQualityMeasureReport((QualityMeasureReport)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQualityMeasureReport(QualityMeasureReport qualityMeasureReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(qualityMeasureReport, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(qualityMeasureReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(qualityMeasureReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(qualityMeasureReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(qualityMeasureReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(qualityMeasureReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(qualityMeasureReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(qualityMeasureReport, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateClassCode(qualityMeasureReport, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateMoodCode(qualityMeasureReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateQualityMeasureReport_validateQualityMeasureReportTemplateId(qualityMeasureReport, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateQualityMeasureReportTemplateId constraint of '<em>Quality Measure Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQualityMeasureReport_validateQualityMeasureReportTemplateId(QualityMeasureReport qualityMeasureReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return qualityMeasureReport.validateQualityMeasureReportTemplateId(diagnostics, context);
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
