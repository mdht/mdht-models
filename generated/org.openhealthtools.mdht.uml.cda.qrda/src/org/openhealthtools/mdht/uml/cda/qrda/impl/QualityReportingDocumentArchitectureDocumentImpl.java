/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.qrda.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.impl.ClinicalDocumentImpl;
import org.openhealthtools.mdht.uml.cda.qrda.MeasureSection;
import org.openhealthtools.mdht.uml.cda.qrda.QRDAPackage;
import org.openhealthtools.mdht.uml.cda.qrda.QualityReportingDocumentArchitectureDocument;
import org.openhealthtools.mdht.uml.cda.qrda.operations.QualityReportingDocumentArchitectureDocumentOperations;

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
	@Override
	public boolean validateQualityReportingDocumentArchitectureDocumentTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return QualityReportingDocumentArchitectureDocumentOperations.validateQualityReportingDocumentArchitectureDocumentTemplateId(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean validateQualityReportingDocumentArchitectureDocumentCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return QualityReportingDocumentArchitectureDocumentOperations.validateQualityReportingDocumentArchitectureDocumentCodeP(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean validateQualityReportingDocumentArchitectureDocumentCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return QualityReportingDocumentArchitectureDocumentOperations.validateQualityReportingDocumentArchitectureDocumentCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean validateQualityReportingDocumentArchitectureDocumentTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return QualityReportingDocumentArchitectureDocumentOperations.validateQualityReportingDocumentArchitectureDocumentTitle(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean validateQualityReportingDocumentArchitectureDocumentCustodian(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return QualityReportingDocumentArchitectureDocumentOperations.validateQualityReportingDocumentArchitectureDocumentCustodian(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean validateQualityReportingDocumentArchitectureDocumentLegalAuthenticator(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return QualityReportingDocumentArchitectureDocumentOperations.validateQualityReportingDocumentArchitectureDocumentLegalAuthenticator(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean validateQualityReportingDocumentArchitectureDocumentRecordTarget(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return QualityReportingDocumentArchitectureDocumentOperations.validateQualityReportingDocumentArchitectureDocumentRecordTarget(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean validateQualityReportingDocumentArchitectureDocumentMeasureSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return QualityReportingDocumentArchitectureDocumentOperations.validateQualityReportingDocumentArchitectureDocumentMeasureSection(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public MeasureSection getMeasureSection() {
    return QualityReportingDocumentArchitectureDocumentOperations.getMeasureSection(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public QualityReportingDocumentArchitectureDocument init() {
      return Initializer.Util.init(this);
  }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public QualityReportingDocumentArchitectureDocument init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //QualityReportingDocumentArchitectureDocumentImpl
