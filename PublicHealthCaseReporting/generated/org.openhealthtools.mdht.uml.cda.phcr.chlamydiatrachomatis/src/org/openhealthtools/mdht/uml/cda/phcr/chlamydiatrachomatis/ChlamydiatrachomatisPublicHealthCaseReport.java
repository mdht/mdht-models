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
package org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis;

import java.lang.Iterable;
import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Public Health Case Report</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPackage#getChlamydiatrachomatisPublicHealthCaseReport()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ChlamydiatrachomatisPublicHealthCaseReportTemplateId ChlamydiatrachomatisPublicHealthCaseReportTitle ChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRClinicalInformationSection' templateId.root='2.16.840.1.113883.10.20.15.1.13' title.mixed='Public Health Case Report - Chlamydia trachomatis' constraints.validation.warning='ChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRRelevantDxTestsSection ChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRTreatmentInformationSection'"
 * @generated
 */
public interface ChlamydiatrachomatisPublicHealthCaseReport extends PublicHealthCaseReport {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'Public Health Case Report - Chlamydia trachomatis')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = \'Public Health Case Report - Chlamydia trachomatis\')'"
   * @generated
   */
	boolean validateChlamydiatrachomatisPublicHealthCaseReportTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(chlamydiatrachomatis::ChlamydiatrachomatisPHCRClinicalInformationSection))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(chlamydiatrachomatis::ChlamydiatrachomatisPHCRClinicalInformationSection))'"
   * @generated
   */
	boolean validateChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRClinicalInformationSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(chlamydiatrachomatis::ChlamydiatrachomatisPHCRRelevantDxTestsSection))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(chlamydiatrachomatis::ChlamydiatrachomatisPHCRRelevantDxTestsSection))'"
   * @generated
   */
	boolean validateChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRRelevantDxTestsSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(chlamydiatrachomatis::ChlamydiatrachomatisPHCRTreatmentInformationSection))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(chlamydiatrachomatis::ChlamydiatrachomatisPHCRTreatmentInformationSection))'"
   * @generated
   */
	boolean validateChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRTreatmentInformationSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(chlamydiatrachomatis::ChlamydiatrachomatisPHCRClinicalInformationSection))->asSequence()->any(true).oclAsType(chlamydiatrachomatis::ChlamydiatrachomatisPHCRClinicalInformationSection)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(chlamydiatrachomatis::ChlamydiatrachomatisPHCRClinicalInformationSection))->asSequence()->any(true).oclAsType(chlamydiatrachomatis::ChlamydiatrachomatisPHCRClinicalInformationSection)'"
   * @generated
   */
	ChlamydiatrachomatisPHCRClinicalInformationSection getChlamydiatrachomatisPHCRClinicalInformationSection();

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(chlamydiatrachomatis::ChlamydiatrachomatisPHCRRelevantDxTestsSection))->asSequence()->any(true).oclAsType(chlamydiatrachomatis::ChlamydiatrachomatisPHCRRelevantDxTestsSection)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(chlamydiatrachomatis::ChlamydiatrachomatisPHCRRelevantDxTestsSection))->asSequence()->any(true).oclAsType(chlamydiatrachomatis::ChlamydiatrachomatisPHCRRelevantDxTestsSection)'"
   * @generated
   */
	ChlamydiatrachomatisPHCRRelevantDxTestsSection getChlamydiatrachomatisPHCRRelevantDxTestsSection();

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(chlamydiatrachomatis::ChlamydiatrachomatisPHCRTreatmentInformationSection))->asSequence()->any(true).oclAsType(chlamydiatrachomatis::ChlamydiatrachomatisPHCRTreatmentInformationSection)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(chlamydiatrachomatis::ChlamydiatrachomatisPHCRTreatmentInformationSection))->asSequence()->any(true).oclAsType(chlamydiatrachomatis::ChlamydiatrachomatisPHCRTreatmentInformationSection)'"
   * @generated
   */
	ChlamydiatrachomatisPHCRTreatmentInformationSection getChlamydiatrachomatisPHCRTreatmentInformationSection();
} // ChlamydiatrachomatisPublicHealthCaseReport
