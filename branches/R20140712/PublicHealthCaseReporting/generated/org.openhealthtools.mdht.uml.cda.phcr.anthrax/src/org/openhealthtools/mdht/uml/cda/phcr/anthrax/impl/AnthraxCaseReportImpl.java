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
package org.openhealthtools.mdht.uml.cda.phcr.anthrax.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPackage;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPhcrClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPhcrRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPhcrSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPhcrTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.operations.AnthraxCaseReportOperations;
import org.openhealthtools.mdht.uml.cda.phcr.impl.PublicHealthCaseReportImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Case Report</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AnthraxCaseReportImpl extends PublicHealthCaseReportImpl implements AnthraxCaseReport {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected AnthraxCaseReportImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return AnthraxPackage.Literals.ANTHRAX_CASE_REPORT;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateAnthraxCaseReportTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return AnthraxCaseReportOperations.validateAnthraxCaseReportTitle(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateAnthraxCaseReportAnthraxPhcrClinicalInformationSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return AnthraxCaseReportOperations.validateAnthraxCaseReportAnthraxPhcrClinicalInformationSection(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateAnthraxCaseReportAnthraxPhcrRelevantDxTestsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return AnthraxCaseReportOperations.validateAnthraxCaseReportAnthraxPhcrRelevantDxTestsSection(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateAnthraxCaseReportAnthraxPhcrSocialHistorySection(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return AnthraxCaseReportOperations.validateAnthraxCaseReportAnthraxPhcrSocialHistorySection(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateAnthraxCaseReportAnthraxPhcrTreatmentInformationSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return AnthraxCaseReportOperations.validateAnthraxCaseReportAnthraxPhcrTreatmentInformationSection(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AnthraxPhcrClinicalInformationSection getAnthraxPhcrClinicalInformationSection() {
    return AnthraxCaseReportOperations.getAnthraxPhcrClinicalInformationSection(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AnthraxPhcrRelevantDxTestsSection getAnthraxPhcrRelevantDxTestsSection() {
    return AnthraxCaseReportOperations.getAnthraxPhcrRelevantDxTestsSection(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AnthraxPhcrSocialHistorySection getAnthraxPhcrSocialHistorySection() {
    return AnthraxCaseReportOperations.getAnthraxPhcrSocialHistorySection(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AnthraxPhcrTreatmentInformationSection getAnthraxPhcrTreatmentInformationSection() {
    return AnthraxCaseReportOperations.getAnthraxPhcrTreatmentInformationSection(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean validatePublicHealthCaseReportTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return AnthraxCaseReportOperations.validatePublicHealthCaseReportTemplateId(this, diagnostics, context);
  }
} //AnthraxCaseReportImpl
