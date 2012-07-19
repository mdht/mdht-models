/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.qrda.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.impl.ClinicalDocumentImpl;
import org.openhealthtools.mdht.uml.cda.qrda.MeasureSection;
import org.openhealthtools.mdht.uml.cda.qrda.QRDAPackage;
import org.openhealthtools.mdht.uml.cda.qrda.QualityReportingDocumentArchitectureDocument;
import org.openhealthtools.mdht.uml.cda.qrda.operations.QualityReportingDocumentArchitectureDocumentOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quality Reporting Document Architecture Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class QualityReportingDocumentArchitectureDocumentImpl extends ClinicalDocumentImpl implements QualityReportingDocumentArchitectureDocument {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected QualityReportingDocumentArchitectureDocumentImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return QRDAPackage.Literals.QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateQualityReportingDocumentArchitectureDocumentTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return QualityReportingDocumentArchitectureDocumentOperations.validateQualityReportingDocumentArchitectureDocumentTemplateId(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateQualityReportingDocumentArchitectureDocumentCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return QualityReportingDocumentArchitectureDocumentOperations.validateQualityReportingDocumentArchitectureDocumentCodeP(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateQualityReportingDocumentArchitectureDocumentCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return QualityReportingDocumentArchitectureDocumentOperations.validateQualityReportingDocumentArchitectureDocumentCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateQualityReportingDocumentArchitectureDocumentTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return QualityReportingDocumentArchitectureDocumentOperations.validateQualityReportingDocumentArchitectureDocumentTitle(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateQualityReportingDocumentArchitectureDocumentCustodian(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return QualityReportingDocumentArchitectureDocumentOperations.validateQualityReportingDocumentArchitectureDocumentCustodian(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateQualityReportingDocumentArchitectureDocumentLegalAuthenticator(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return QualityReportingDocumentArchitectureDocumentOperations.validateQualityReportingDocumentArchitectureDocumentLegalAuthenticator(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateQualityReportingDocumentArchitectureDocumentRecordTarget(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return QualityReportingDocumentArchitectureDocumentOperations.validateQualityReportingDocumentArchitectureDocumentRecordTarget(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateQualityReportingDocumentArchitectureDocumentMeasureSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return QualityReportingDocumentArchitectureDocumentOperations.validateQualityReportingDocumentArchitectureDocumentMeasureSection(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MeasureSection getMeasureSection() {
    return QualityReportingDocumentArchitectureDocumentOperations.getMeasureSection(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public QualityReportingDocumentArchitectureDocument init() {
    	CDAUtil.init(this);
    	return this;
  }
} //QualityReportingDocumentArchitectureDocumentImpl
