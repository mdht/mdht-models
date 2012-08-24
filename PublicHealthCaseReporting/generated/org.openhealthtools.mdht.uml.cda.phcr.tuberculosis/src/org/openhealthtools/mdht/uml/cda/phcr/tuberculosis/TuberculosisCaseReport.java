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
package org.openhealthtools.mdht.uml.cda.phcr.tuberculosis;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case Report</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPackage#getTuberculosisCaseReport()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='TuberculosisCaseReportTemplateId TuberculosisCaseReportTitle TuberculosisCaseReportTuberculosisPHCRClinicalInformationSection' templateId.root='2.16.840.1.113883.10.20.15.1.1' title.mixed='Public Health Case Report - Tuberculosis' constraints.validation.warning='TuberculosisCaseReportTuberculosisPHCRSocialHistorySection TuberculosisCaseReportTuberculosisPHCRRelevantDxTestsSection TuberculosisCaseReportTuberculosisPHCRTreatmentInformationSection' constraints.validation.info='TuberculosisCaseReportTuberculosisPHCRImmunizationSection'"
 * @generated
 */
public interface TuberculosisCaseReport extends PublicHealthCaseReport {
	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = \'Public Health Case Report - Tuberculosis\')'"
   * @generated
   */
  boolean validateTuberculosisCaseReportTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(tuberculosis::TuberculosisPHCRSocialHistorySection))'"
   * @generated
   */
	boolean validateTuberculosisCaseReportTuberculosisPHCRSocialHistorySection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(tuberculosis::TuberculosisPHCRClinicalInformationSection))'"
   * @generated
   */
	boolean validateTuberculosisCaseReportTuberculosisPHCRClinicalInformationSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(tuberculosis::TuberculosisPHCRRelevantDxTestsSection))'"
   * @generated
   */
	boolean validateTuberculosisCaseReportTuberculosisPHCRRelevantDxTestsSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(tuberculosis::TuberculosisPHCRTreatmentInformationSection))'"
   * @generated
   */
	boolean validateTuberculosisCaseReportTuberculosisPHCRTreatmentInformationSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(tuberculosis::TuberculosisPHCRImmunizationSection))'"
   * @generated
   */
	boolean validateTuberculosisCaseReportTuberculosisPHCRImmunizationSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(tuberculosis::TuberculosisPHCRSocialHistorySection))->asSequence()->any(true).oclAsType(tuberculosis::TuberculosisPHCRSocialHistorySection)'"
   * @generated
   */
	TuberculosisPHCRSocialHistorySection getTuberculosisPHCRSocialHistorySection();

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(tuberculosis::TuberculosisPHCRClinicalInformationSection))->asSequence()->any(true).oclAsType(tuberculosis::TuberculosisPHCRClinicalInformationSection)'"
   * @generated
   */
	TuberculosisPHCRClinicalInformationSection getTuberculosisPHCRClinicalInformationSection();

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(tuberculosis::TuberculosisPHCRRelevantDxTestsSection))->asSequence()->any(true).oclAsType(tuberculosis::TuberculosisPHCRRelevantDxTestsSection)'"
   * @generated
   */
	TuberculosisPHCRRelevantDxTestsSection getTuberculosisPHCRRelevantDxTestsSection();

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(tuberculosis::TuberculosisPHCRTreatmentInformationSection))->asSequence()->any(true).oclAsType(tuberculosis::TuberculosisPHCRTreatmentInformationSection)'"
   * @generated
   */
	TuberculosisPHCRTreatmentInformationSection getTuberculosisPHCRTreatmentInformationSection();

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(tuberculosis::TuberculosisPHCRImmunizationSection))->asSequence()->any(true).oclAsType(tuberculosis::TuberculosisPHCRImmunizationSection)'"
   * @generated
   */
	TuberculosisPHCRImmunizationSection getTuberculosisPHCRImmunizationSection();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TuberculosisCaseReport init();

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TuberculosisCaseReport init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // TuberculosisCaseReport
