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
package org.openhealthtools.mdht.uml.cda.phcr.hepb;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Acute Hepatitis BCase Report</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.HepbPackage#getAcuteHepatitisBCaseReport()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='AcuteHepatitisBCaseReportTemplateId AcuteHepatitisBCaseReportTitle AcuteHepatitisBCaseReportAcuteHepatitisBPHCRClinicalInformationSection' templateId.root='2.16.840.1.113883.10.20.15.1.2' title.mixed='Public Health Case Report - Acute Hepatitis B' constraints.validation.warning='AcuteHepatitisBCaseReportAcuteHepatitisBSocialHistorySection AcuteHepatitisBCaseReportAcuteHepatitisBImmunizationSection AcuteHepatitisBCaseReportAcuteHepatitisBPHCRTreatmentInformationSection AcuteHepatitisBCaseReportAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection'"
 * @generated
 */
public interface AcuteHepatitisBCaseReport extends PublicHealthCaseReport {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'Public Health Case Report - Acute Hepatitis B')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = \'Public Health Case Report - Acute Hepatitis B\')'"
	 * @generated
	 */
	boolean validateAcuteHepatitisBCaseReportTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hepb::AcuteHepatitisBSocialHistorySection))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hepb::AcuteHepatitisBSocialHistorySection))'"
	 * @generated
	 */
	boolean validateAcuteHepatitisBCaseReportAcuteHepatitisBSocialHistorySection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hepb::AcuteHepatitisBImmunizationSection))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hepb::AcuteHepatitisBImmunizationSection))'"
	 * @generated
	 */
	boolean validateAcuteHepatitisBCaseReportAcuteHepatitisBImmunizationSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hepb::AcuteHepatitisBPHCRClinicalInformationSection))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hepb::AcuteHepatitisBPHCRClinicalInformationSection))'"
	 * @generated
	 */
	boolean validateAcuteHepatitisBCaseReportAcuteHepatitisBPHCRClinicalInformationSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hepb::AcuteHepatitisBPHCRTreatmentInformationSection))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hepb::AcuteHepatitisBPHCRTreatmentInformationSection))'"
	 * @generated
	 */
	boolean validateAcuteHepatitisBCaseReportAcuteHepatitisBPHCRTreatmentInformationSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hepb::AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hepb::AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection))'"
	 * @generated
	 */
	boolean validateAcuteHepatitisBCaseReportAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hepb::AcuteHepatitisBSocialHistorySection))->asSequence()->any(true).oclAsType(hepb::AcuteHepatitisBSocialHistorySection)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hepb::AcuteHepatitisBSocialHistorySection))->asSequence()->any(true).oclAsType(hepb::AcuteHepatitisBSocialHistorySection)'"
	 * @generated
	 */
	AcuteHepatitisBSocialHistorySection getAcuteHepatitisBSocialHistorySection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hepb::AcuteHepatitisBImmunizationSection))->asSequence()->any(true).oclAsType(hepb::AcuteHepatitisBImmunizationSection)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hepb::AcuteHepatitisBImmunizationSection))->asSequence()->any(true).oclAsType(hepb::AcuteHepatitisBImmunizationSection)'"
	 * @generated
	 */
	AcuteHepatitisBImmunizationSection getAcuteHepatitisBImmunizationSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hepb::AcuteHepatitisBPHCRClinicalInformationSection))->asSequence()->any(true).oclAsType(hepb::AcuteHepatitisBPHCRClinicalInformationSection)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hepb::AcuteHepatitisBPHCRClinicalInformationSection))->asSequence()->any(true).oclAsType(hepb::AcuteHepatitisBPHCRClinicalInformationSection)'"
	 * @generated
	 */
	AcuteHepatitisBPHCRClinicalInformationSection getAcuteHepatitisBPHCRClinicalInformationSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hepb::AcuteHepatitisBPHCRTreatmentInformationSection))->asSequence()->any(true).oclAsType(hepb::AcuteHepatitisBPHCRTreatmentInformationSection)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hepb::AcuteHepatitisBPHCRTreatmentInformationSection))->asSequence()->any(true).oclAsType(hepb::AcuteHepatitisBPHCRTreatmentInformationSection)'"
	 * @generated
	 */
	AcuteHepatitisBPHCRTreatmentInformationSection getAcuteHepatitisBPHCRTreatmentInformationSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hepb::AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection))->asSequence()->any(true).oclAsType(hepb::AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hepb::AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection))->asSequence()->any(true).oclAsType(hepb::AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection)'"
	 * @generated
	 */
	AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection getAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcuteHepatitisBCaseReport init();

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AcuteHepatitisBCaseReport init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // AcuteHepatitisBCaseReport
