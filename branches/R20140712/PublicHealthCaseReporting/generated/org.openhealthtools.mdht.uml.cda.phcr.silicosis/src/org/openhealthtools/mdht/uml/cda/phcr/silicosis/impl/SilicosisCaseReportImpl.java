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
package org.openhealthtools.mdht.uml.cda.phcr.silicosis.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.phcr.impl.PublicHealthCaseReportImpl;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPHCRRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPHCRSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.operations.SilicosisCaseReportOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Case Report</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SilicosisCaseReportImpl extends PublicHealthCaseReportImpl implements SilicosisCaseReport {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected SilicosisCaseReportImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return SilicosisPackage.Literals.SILICOSIS_CASE_REPORT;
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSilicosisCaseReportTitle(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SilicosisCaseReportOperations.validateSilicosisCaseReportTitle(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSilicosisCaseReportSilicosisPHCRSocialHistorySection(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return SilicosisCaseReportOperations.validateSilicosisCaseReportSilicosisPHCRSocialHistorySection(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSilicosisCaseReportSilicosisPHCRClinicalInformationSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return SilicosisCaseReportOperations.validateSilicosisCaseReportSilicosisPHCRClinicalInformationSection(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSilicosisCaseReportSilicosisPHCRRelevantDxTestsSection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SilicosisCaseReportOperations.validateSilicosisCaseReportSilicosisPHCRRelevantDxTestsSection(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SilicosisPHCRSocialHistorySection getSilicosisPHCRSocialHistorySection() {
    return SilicosisCaseReportOperations.getSilicosisPHCRSocialHistorySection(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SilicosisPHCRClinicalInformationSection getSilicosisPHCRClinicalInformationSection() {
    return SilicosisCaseReportOperations.getSilicosisPHCRClinicalInformationSection(this);
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SilicosisPHCRRelevantDxTestsSection getSilicosisPHCRRelevantDxTestsSection()
  {
    return SilicosisCaseReportOperations.getSilicosisPHCRRelevantDxTestsSection(this);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean validatePublicHealthCaseReportTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return SilicosisCaseReportOperations.validatePublicHealthCaseReportTemplateId(this, diagnostics, context);
  }

} //SilicosisCaseReportImpl
