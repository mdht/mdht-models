/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsbr.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.impl.ClinicalDocumentImpl;

import org.openhealthtools.mdht.uml.cda.vsbr.AntenatalTestingandSurveillanceSection;
import org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection;
import org.openhealthtools.mdht.uml.cda.vsbr.HistoryofInfectionFetalDeathSection;
import org.openhealthtools.mdht.uml.cda.vsbr.HistoryofInfectionSection;
import org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliverySection;
import org.openhealthtools.mdht.uml.cda.vsbr.PrenatalTestingandSurveillanceSection;
import org.openhealthtools.mdht.uml.cda.vsbr.PriorPregnancyHistorySection;
import org.openhealthtools.mdht.uml.cda.vsbr.ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsImpl extends ClinicalDocumentImpl
		implements ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return VsbrPackage.Literals.REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTemplateId(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTemplateId(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRealmCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRealmCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRealmCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRealmCodeP(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTypeId(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTypeId(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsClassCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsClassCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsMoodCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsMoodCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsId(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsId(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCodeP(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTitle(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTitle(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEffectiveTime(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEffectiveTime(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsConfidentialityCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsConfidentialityCodeP(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsConfidentialityCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsConfidentialityCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsLanguageCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsLanguageCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAuthor(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAuthor(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCustodian(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCustodian(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRecordTarget(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRecordTarget(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsLaborandDeliverySection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsLaborandDeliverySection(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsFetalDeliverySection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsFetalDeliverySection(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAntenatalTestingandSurveillance(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAntenatalTestingandSurveillance(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsPregnancyHistory(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsPregnancyHistory(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsHistoryofInfectionFetalDeathSection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsHistoryofInfectionFetalDeathSection(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LaborandDeliverySection getLaborandDeliverySection() {
    return ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsOperations.getLaborandDeliverySection(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FetalDeliverySection getFetalDeliverySection() {
    return ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsOperations.getFetalDeliverySection(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PrenatalTestingandSurveillanceSection getAntenatalTestingandSurveillance() {
    return ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsOperations.getAntenatalTestingandSurveillance(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PriorPregnancyHistorySection getPregnancyHistory() {
    return ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsOperations.getPregnancyHistory(this);
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HistoryofInfectionFetalDeathSection getHistoryofInfectionFetalDeathSection()
  {
    return ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsOperations.getHistoryofInfectionFetalDeathSection(this);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords init() {
      return Initializer.Util.init(this);
  }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords init(
			Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsImpl
