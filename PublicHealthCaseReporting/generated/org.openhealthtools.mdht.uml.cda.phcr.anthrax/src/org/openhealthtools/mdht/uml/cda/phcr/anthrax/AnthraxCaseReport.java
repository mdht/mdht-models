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
package org.openhealthtools.mdht.uml.cda.phcr.anthrax;

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
 * @see org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPackage#getAnthraxCaseReport()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='AnthraxCaseReportTemplateId AnthraxCaseReportTitle AnthraxCaseReportAnthraxPhcrClinicalInformationSection' templateId.root='2.16.840.1.113883.10.20.15.1.3' title.mixed='Public Health Case Report - Anthrax' constraints.validation.warning='AnthraxCaseReportAnthraxPhcrSocialHistorySection AnthraxCaseReportAnthraxPhcrTreatmentInformationSection AnthraxCaseReportAnthraxPhcrRelevantDxTestsSection'"
 * @generated
 */
public interface AnthraxCaseReport extends PublicHealthCaseReport {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'Public Health Case Report - Anthrax')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = \'Public Health Case Report - Anthrax\')'"
   * @generated
   */
	boolean validateAnthraxCaseReportTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(anthrax::AnthraxPhcrClinicalInformationSection))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(anthrax::AnthraxPhcrClinicalInformationSection))'"
   * @generated
   */
	boolean validateAnthraxCaseReportAnthraxPhcrClinicalInformationSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(anthrax::AnthraxPhcrRelevantDxTestsSection))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(anthrax::AnthraxPhcrRelevantDxTestsSection))'"
   * @generated
   */
	boolean validateAnthraxCaseReportAnthraxPhcrRelevantDxTestsSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(anthrax::AnthraxPhcrSocialHistorySection))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(anthrax::AnthraxPhcrSocialHistorySection))'"
   * @generated
   */
	boolean validateAnthraxCaseReportAnthraxPhcrSocialHistorySection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(anthrax::AnthraxPhcrTreatmentInformationSection))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(anthrax::AnthraxPhcrTreatmentInformationSection))'"
   * @generated
   */
	boolean validateAnthraxCaseReportAnthraxPhcrTreatmentInformationSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(anthrax::AnthraxPhcrClinicalInformationSection))->asSequence()->any(true).oclAsType(anthrax::AnthraxPhcrClinicalInformationSection)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(anthrax::AnthraxPhcrClinicalInformationSection))->asSequence()->any(true).oclAsType(anthrax::AnthraxPhcrClinicalInformationSection)'"
   * @generated
   */
	AnthraxPhcrClinicalInformationSection getAnthraxPhcrClinicalInformationSection();

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(anthrax::AnthraxPhcrRelevantDxTestsSection))->asSequence()->any(true).oclAsType(anthrax::AnthraxPhcrRelevantDxTestsSection)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(anthrax::AnthraxPhcrRelevantDxTestsSection))->asSequence()->any(true).oclAsType(anthrax::AnthraxPhcrRelevantDxTestsSection)'"
   * @generated
   */
	AnthraxPhcrRelevantDxTestsSection getAnthraxPhcrRelevantDxTestsSection();

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(anthrax::AnthraxPhcrSocialHistorySection))->asSequence()->any(true).oclAsType(anthrax::AnthraxPhcrSocialHistorySection)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(anthrax::AnthraxPhcrSocialHistorySection))->asSequence()->any(true).oclAsType(anthrax::AnthraxPhcrSocialHistorySection)'"
   * @generated
   */
	AnthraxPhcrSocialHistorySection getAnthraxPhcrSocialHistorySection();

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(anthrax::AnthraxPhcrTreatmentInformationSection))->asSequence()->any(true).oclAsType(anthrax::AnthraxPhcrTreatmentInformationSection)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(anthrax::AnthraxPhcrTreatmentInformationSection))->asSequence()->any(true).oclAsType(anthrax::AnthraxPhcrTreatmentInformationSection)'"
   * @generated
   */
	AnthraxPhcrTreatmentInformationSection getAnthraxPhcrTreatmentInformationSection();
} // AnthraxCaseReport
