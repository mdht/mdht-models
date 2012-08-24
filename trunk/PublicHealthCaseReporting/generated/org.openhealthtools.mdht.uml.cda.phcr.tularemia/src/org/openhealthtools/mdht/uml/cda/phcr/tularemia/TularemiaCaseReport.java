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
package org.openhealthtools.mdht.uml.cda.phcr.tularemia;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrEncountersSection;
import org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tularemia Case Report</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPackage#getTularemiaCaseReport()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='TularemiaCaseReportTemplateId TularemiaCaseReportTitle TularemiaCaseReportTularemiaPHCRClinicalInformationSection' templateId.root='2.16.840.1.113883.10.20.15.1.4' title.mixed='Public Health Case Report - Tularemia' constraints.validation.warning='TularemiaCaseReportTularemiaPHCRSocialHistorySection TularemiaCaseReportTularemiaPHCRTreatmentInformationSection TularemiaCaseReportPhcrEncountersSection TularemiaCaseReportTularemiaPHCRRelevantDxTestsSection'"
 * @generated
 */
public interface TularemiaCaseReport extends PublicHealthCaseReport {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = \'Public Health Case Report - Tularemia\')'"
   * @generated
   */
	boolean validateTularemiaCaseReportTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(tularemia::TularemiaPHCRSocialHistorySection))'"
   * @generated
   */
  boolean validateTularemiaCaseReportTularemiaPHCRSocialHistorySection(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(tularemia::TularemiaPHCRClinicalInformationSection))'"
   * @generated
   */
  boolean validateTularemiaCaseReportTularemiaPHCRClinicalInformationSection(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(tularemia::TularemiaPHCRTreatmentInformationSection))'"
   * @generated
   */
	boolean validateTularemiaCaseReportTularemiaPHCRTreatmentInformationSection(DiagnosticChain diagnostics, Map<Object, Object> context);

		/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(phcr::PhcrEncountersSection))'"
   * @generated
   */
  boolean validateTularemiaCaseReportPhcrEncountersSection(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(tularemia::TularemiaPHCRRelevantDxTestsSection))'"
   * @generated
   */
  boolean validateTularemiaCaseReportTularemiaPHCRRelevantDxTestsSection(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(tularemia::TularemiaPHCRSocialHistorySection))->asSequence()->any(true).oclAsType(tularemia::TularemiaPHCRSocialHistorySection)'"
   * @generated
   */
  TularemiaPHCRSocialHistorySection getTularemiaPHCRSocialHistorySection();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(tularemia::TularemiaPHCRClinicalInformationSection))->asSequence()->any(true).oclAsType(tularemia::TularemiaPHCRClinicalInformationSection)'"
   * @generated
   */
  TularemiaPHCRClinicalInformationSection getTularemiaPHCRClinicalInformationSection();

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(tularemia::TularemiaPHCRTreatmentInformationSection))->asSequence()->any(true).oclAsType(tularemia::TularemiaPHCRTreatmentInformationSection)'"
   * @generated
   */
	TularemiaPHCRTreatmentInformationSection getTularemiaPHCRTreatmentInformationSection();

		/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(phcr::PhcrEncountersSection))->asSequence()->any(true).oclAsType(phcr::PhcrEncountersSection)'"
   * @generated
   */
  PhcrEncountersSection gettularemiaPhcrEncountersSection();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(tularemia::TularemiaPHCRRelevantDxTestsSection))->asSequence()->any(true).oclAsType(tularemia::TularemiaPHCRRelevantDxTestsSection)'"
   * @generated
   */
  TularemiaPHCRRelevantDxTestsSection getTularemiaPHCRRelevantDxTestsSection();

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TularemiaCaseReport init();

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TularemiaCaseReport init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // TularemiaCaseReport
