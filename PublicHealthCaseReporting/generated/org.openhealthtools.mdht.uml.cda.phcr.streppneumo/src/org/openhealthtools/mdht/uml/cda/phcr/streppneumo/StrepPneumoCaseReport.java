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
package org.openhealthtools.mdht.uml.cda.phcr.streppneumo;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case Report</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPackage#getStrepPneumoCaseReport()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='StrepPneumoCaseReportTemplateId StrepPneumoCaseReportTitle StrepPneumoCaseReportStrepPneumoPHCRClinicalInformationSection' templateId.root='2.16.840.1.113883.10.20.15.1.12' title.mixed='Public Health Case Report - Streptococcus pneumoniae' constraints.validation.warning='StrepPneumoCaseReportStrepPneumoPHCRTreatmentInformationSection StrepPneumoCaseReportStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection StrepPneumoCaseReportStrepPneumoSocialHistorySection StrepPneumoCaseReportStrepPneumoImmunizationSection'"
 * @generated
 */
public interface StrepPneumoCaseReport extends PublicHealthCaseReport {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = \'Public Health Case Report - Streptococcus pneumoniae\')'"
   * @generated
   */
	boolean validateStrepPneumoCaseReportTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(streppneumo::StrepPneumoPHCRClinicalInformationSection))'"
   * @generated
   */
	boolean validateStrepPneumoCaseReportStrepPneumoPHCRClinicalInformationSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(streppneumo::StrepPneumoPHCRTreatmentInformationSection))'"
   * @generated
   */
	boolean validateStrepPneumoCaseReportStrepPneumoPHCRTreatmentInformationSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(streppneumo::StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection))'"
   * @generated
   */
	boolean validateStrepPneumoCaseReportStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(streppneumo::StrepPneumoSocialHistorySection))'"
   * @generated
   */
	boolean validateStrepPneumoCaseReportStrepPneumoSocialHistorySection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(streppneumo::StrepPneumoImmunizationSection))'"
   * @generated
   */
	boolean validateStrepPneumoCaseReportStrepPneumoImmunizationSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(streppneumo::StrepPneumoPHCRClinicalInformationSection))->asSequence()->any(true).oclAsType(streppneumo::StrepPneumoPHCRClinicalInformationSection)'"
   * @generated
   */
	StrepPneumoPHCRClinicalInformationSection getStrepPneumoPHCRClinicalInformationSection();

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(streppneumo::StrepPneumoPHCRTreatmentInformationSection))->asSequence()->any(true).oclAsType(streppneumo::StrepPneumoPHCRTreatmentInformationSection)'"
   * @generated
   */
	StrepPneumoPHCRTreatmentInformationSection getStrepPneumoPHCRTreatmentInformationSection();

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(streppneumo::StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection))->asSequence()->any(true).oclAsType(streppneumo::StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection)'"
   * @generated
   */
	StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection getStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection();

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(streppneumo::StrepPneumoSocialHistorySection)).oclAsType(streppneumo::StrepPneumoSocialHistorySection)'"
   * @generated
   */
	EList<StrepPneumoSocialHistorySection> getStrepPneumoSocialHistorySections();

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(streppneumo::StrepPneumoImmunizationSection))->asSequence()->any(true).oclAsType(streppneumo::StrepPneumoImmunizationSection)'"
   * @generated
   */
	StrepPneumoImmunizationSection getStrepPneumoImmunizationSection();

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public StrepPneumoCaseReport init();

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StrepPneumoCaseReport init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // StrepPneumoCaseReport
