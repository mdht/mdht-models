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
package org.openhealthtools.mdht.uml.cda.phcr.cocci.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CocciPackage;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPHCRRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPHCRSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPHCRTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.operations.CoccidioidesCaseReportOperations;
import org.openhealthtools.mdht.uml.cda.phcr.impl.PublicHealthCaseReportImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coccidioides Case Report</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CoccidioidesCaseReportImpl extends PublicHealthCaseReportImpl implements CoccidioidesCaseReport {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected CoccidioidesCaseReportImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return CocciPackage.Literals.COCCIDIOIDES_CASE_REPORT;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCoccidioidesCaseReportTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return CoccidioidesCaseReportOperations.validateCoccidioidesCaseReportTitle(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCoccidioidesCaseReportCoccidioidesPHCRSocialHistorySection(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return CoccidioidesCaseReportOperations.validateCoccidioidesCaseReportCoccidioidesPHCRSocialHistorySection(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCoccidioidesCaseReportCoccidioidesPHCRClinicalInformationSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return CoccidioidesCaseReportOperations.validateCoccidioidesCaseReportCoccidioidesPHCRClinicalInformationSection(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCoccidioidesCaseReportCoccidioidesPHCRTreatmentInformationSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return CoccidioidesCaseReportOperations.validateCoccidioidesCaseReportCoccidioidesPHCRTreatmentInformationSection(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateCoccidioidesCaseReportCoccidioidesPHCRRelevantDxTestsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return CoccidioidesCaseReportOperations.validateCoccidioidesCaseReportCoccidioidesPHCRRelevantDxTestsSection(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CoccidioidesPHCRSocialHistorySection getCoccidioidesPHCRSocialHistorySection() {
    return CoccidioidesCaseReportOperations.getCoccidioidesPHCRSocialHistorySection(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CoccidioidesPHCRClinicalInformationSection getCoccidioidesPHCRClinicalInformationSection() {
    return CoccidioidesCaseReportOperations.getCoccidioidesPHCRClinicalInformationSection(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CoccidioidesPHCRTreatmentInformationSection getCoccidioidesPHCRTreatmentInformationSection() {
    return CoccidioidesCaseReportOperations.getCoccidioidesPHCRTreatmentInformationSection(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CoccidioidesPHCRRelevantDxTestsSection getCoccidioidesPHCRRelevantDxTestsSection() {
    return CoccidioidesCaseReportOperations.getCoccidioidesPHCRRelevantDxTestsSection(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean validatePublicHealthCaseReportTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return CoccidioidesCaseReportOperations.validatePublicHealthCaseReportTemplateId(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CoccidioidesCaseReport init() {
      return Initializer.Util.init(this);
  }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CoccidioidesCaseReport init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //CoccidioidesCaseReportImpl
