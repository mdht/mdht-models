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
package org.openhealthtools.mdht.uml.cda.phcr.cocci;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coccidioides Case Report</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.phcr.cocci.CocciPackage#getCoccidioidesCaseReport()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='CoccidioidesCaseReportTemplateId CoccidioidesCaseReportTitle CoccidioidesCaseReportCoccidioidesPHCRClinicalInformationSection' templateId.root='2.16.840.1.113883.10.20.15.1.10' title.mixed='Public Health Case Report - Coccidioidomycosis' constraints.validation.warning='CoccidioidesCaseReportCoccidioidesPHCRSocialHistorySection CoccidioidesCaseReportCoccidioidesPHCRTreatmentInformationSection CoccidioidesCaseReportCoccidioidesPHCRRelevantDxTestsSection'"
 * @generated
 */
public interface CoccidioidesCaseReport extends PublicHealthCaseReport {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = \'Public Health Case Report - Coccidioidomycosis\')'"
   * @generated
   */
	boolean validateCoccidioidesCaseReportTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cocci::CoccidioidesPHCRSocialHistorySection))'"
   * @generated
   */
	boolean validateCoccidioidesCaseReportCoccidioidesPHCRSocialHistorySection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cocci::CoccidioidesPHCRClinicalInformationSection))'"
   * @generated
   */
	boolean validateCoccidioidesCaseReportCoccidioidesPHCRClinicalInformationSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cocci::CoccidioidesPHCRTreatmentInformationSection))'"
   * @generated
   */
	boolean validateCoccidioidesCaseReportCoccidioidesPHCRTreatmentInformationSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cocci::CoccidioidesPHCRRelevantDxTestsSection))'"
   * @generated
   */
	boolean validateCoccidioidesCaseReportCoccidioidesPHCRRelevantDxTestsSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cocci::CoccidioidesPHCRSocialHistorySection))->asSequence()->any(true).oclAsType(cocci::CoccidioidesPHCRSocialHistorySection)'"
   * @generated
   */
	CoccidioidesPHCRSocialHistorySection getCoccidioidesPHCRSocialHistorySection();

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cocci::CoccidioidesPHCRClinicalInformationSection))->asSequence()->any(true).oclAsType(cocci::CoccidioidesPHCRClinicalInformationSection)'"
   * @generated
   */
	CoccidioidesPHCRClinicalInformationSection getCoccidioidesPHCRClinicalInformationSection();

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cocci::CoccidioidesPHCRTreatmentInformationSection))->asSequence()->any(true).oclAsType(cocci::CoccidioidesPHCRTreatmentInformationSection)'"
   * @generated
   */
	CoccidioidesPHCRTreatmentInformationSection getCoccidioidesPHCRTreatmentInformationSection();

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cocci::CoccidioidesPHCRRelevantDxTestsSection))->asSequence()->any(true).oclAsType(cocci::CoccidioidesPHCRRelevantDxTestsSection)'"
   * @generated
   */
	CoccidioidesPHCRRelevantDxTestsSection getCoccidioidesPHCRRelevantDxTestsSection();

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CoccidioidesCaseReport init();

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CoccidioidesCaseReport init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // CoccidioidesCaseReport
