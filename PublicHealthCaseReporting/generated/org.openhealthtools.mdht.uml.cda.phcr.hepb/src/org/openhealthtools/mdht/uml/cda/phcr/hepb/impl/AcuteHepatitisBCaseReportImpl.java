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
package org.openhealthtools.mdht.uml.cda.phcr.hepb.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrEncountersSection;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBImmunizationSection;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.HepbPackage;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.operations.AcuteHepatitisBCaseReportOperations;
import org.openhealthtools.mdht.uml.cda.phcr.impl.PublicHealthCaseReportImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Acute Hepatitis BCase Report</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AcuteHepatitisBCaseReportImpl extends PublicHealthCaseReportImpl implements AcuteHepatitisBCaseReport {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected AcuteHepatitisBCaseReportImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return HepbPackage.Literals.ACUTE_HEPATITIS_BCASE_REPORT;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateAcuteHepatitisBCaseReportTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return AcuteHepatitisBCaseReportOperations.validateAcuteHepatitisBCaseReportTitle(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateAcuteHepatitisBCaseReportAcuteHepatitisBSocialHistorySection(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return AcuteHepatitisBCaseReportOperations.validateAcuteHepatitisBCaseReportAcuteHepatitisBSocialHistorySection(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateAcuteHepatitisBCaseReportAcuteHepatitisBImmunizationSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return AcuteHepatitisBCaseReportOperations.validateAcuteHepatitisBCaseReportAcuteHepatitisBImmunizationSection(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateAcuteHepatitisBCaseReportAcuteHepatitisBPHCRClinicalInformationSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return AcuteHepatitisBCaseReportOperations.validateAcuteHepatitisBCaseReportAcuteHepatitisBPHCRClinicalInformationSection(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateAcuteHepatitisBCaseReportAcuteHepatitisBPHCRTreatmentInformationSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return AcuteHepatitisBCaseReportOperations.validateAcuteHepatitisBCaseReportAcuteHepatitisBPHCRTreatmentInformationSection(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateAcuteHepatitisBCaseReportAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return AcuteHepatitisBCaseReportOperations.validateAcuteHepatitisBCaseReportAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AcuteHepatitisBSocialHistorySection getAcuteHepatitisBSocialHistorySection() {
    return AcuteHepatitisBCaseReportOperations.getAcuteHepatitisBSocialHistorySection(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AcuteHepatitisBImmunizationSection getAcuteHepatitisBImmunizationSection() {
    return AcuteHepatitisBCaseReportOperations.getAcuteHepatitisBImmunizationSection(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AcuteHepatitisBPHCRClinicalInformationSection getAcuteHepatitisBPHCRClinicalInformationSection() {
    return AcuteHepatitisBCaseReportOperations.getAcuteHepatitisBPHCRClinicalInformationSection(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AcuteHepatitisBPHCRTreatmentInformationSection getAcuteHepatitisBPHCRTreatmentInformationSection() {
    return AcuteHepatitisBCaseReportOperations.getAcuteHepatitisBPHCRTreatmentInformationSection(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection getAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection() {
    return AcuteHepatitisBCaseReportOperations.getAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean validatePublicHealthCaseReportTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return AcuteHepatitisBCaseReportOperations.validatePublicHealthCaseReportTemplateId(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AcuteHepatitisBCaseReport init() {
      return Initializer.Util.init(this);
  }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AcuteHepatitisBCaseReport init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //AcuteHepatitisBCaseReportImpl
