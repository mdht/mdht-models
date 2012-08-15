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
package org.openhealthtools.mdht.uml.cda.phcr.flu;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Influenza Case Report</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.fluPackage#getInfluenzaCaseReport()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation title.mixed='Public Health Case Report - Influenza' templateId.root='2.16.840.1.113883.10.20.15.1.11' constraints.validation.error='InfluenzaCaseReportTemplateId InfluenzaCaseReportTitle InfluenzaCaseReportInfluenzaPHCRClinicalInformationSection' constraints.validation.warning='InfluenzaCaseReportInfluenzaImmunizationSection InfluenzaCaseReportInfluenzaPHCRTreatmentInformationSection InfluenzaCaseReportInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection InfluenzaCaseReportInfluenzaPHCRSocialHistorySection'"
 * @generated
 */
public interface InfluenzaCaseReport extends PublicHealthCaseReport {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'Public Health Case Report - Influenza')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = \'Public Health Case Report - Influenza\')'"
	 * @generated
	 */
	boolean validateInfluenzaCaseReportTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(flu::InfluenzaImmunizationSection))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(flu::InfluenzaImmunizationSection))'"
	 * @generated
	 */
	boolean validateInfluenzaCaseReportInfluenzaImmunizationSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(flu::InfluenzaPHCRClinicalInformationSection))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(flu::InfluenzaPHCRClinicalInformationSection))'"
	 * @generated
	 */
	boolean validateInfluenzaCaseReportInfluenzaPHCRClinicalInformationSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(flu::InfluenzaPHCRTreatmentInformationSection))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(flu::InfluenzaPHCRTreatmentInformationSection))'"
	 * @generated
	 */
	boolean validateInfluenzaCaseReportInfluenzaPHCRTreatmentInformationSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(flu::InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(flu::InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection))'"
	 * @generated
	 */
	boolean validateInfluenzaCaseReportInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(flu::InfluenzaPHCRSocialHistorySection))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(flu::InfluenzaPHCRSocialHistorySection))'"
	 * @generated
	 */
	boolean validateInfluenzaCaseReportInfluenzaPHCRSocialHistorySection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(flu::InfluenzaImmunizationSection))->asSequence()->first().oclAsType(flu::InfluenzaImmunizationSection)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(flu::InfluenzaImmunizationSection))->asSequence()->first().oclAsType(flu::InfluenzaImmunizationSection)'"
	 * @generated
	 */
	InfluenzaImmunizationSection getInfluenzaImmunizationSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(flu::InfluenzaPHCRClinicalInformationSection))->asSequence()->first().oclAsType(flu::InfluenzaPHCRClinicalInformationSection)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(flu::InfluenzaPHCRClinicalInformationSection))->asSequence()->first().oclAsType(flu::InfluenzaPHCRClinicalInformationSection)'"
	 * @generated
	 */
	InfluenzaPHCRClinicalInformationSection getInfluenzaPHCRClinicalInformationSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(flu::InfluenzaPHCRTreatmentInformationSection))->asSequence()->first().oclAsType(flu::InfluenzaPHCRTreatmentInformationSection)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(flu::InfluenzaPHCRTreatmentInformationSection))->asSequence()->first().oclAsType(flu::InfluenzaPHCRTreatmentInformationSection)'"
	 * @generated
	 */
	InfluenzaPHCRTreatmentInformationSection getInfluenzaPHCRTreatmentInformationSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(flu::InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection))->asSequence()->first().oclAsType(flu::InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(flu::InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection))->asSequence()->first().oclAsType(flu::InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection)'"
	 * @generated
	 */
	InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection getInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(flu::InfluenzaPHCRSocialHistorySection))->asSequence()->first().oclAsType(flu::InfluenzaPHCRSocialHistorySection)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(flu::InfluenzaPHCRSocialHistorySection))->asSequence()->first().oclAsType(flu::InfluenzaPHCRSocialHistorySection)'"
	 * @generated
	 */
	InfluenzaPHCRSocialHistorySection getInfluenzaPHCRSocialHistorySection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfluenzaCaseReport init();
} // InfluenzaCaseReport
