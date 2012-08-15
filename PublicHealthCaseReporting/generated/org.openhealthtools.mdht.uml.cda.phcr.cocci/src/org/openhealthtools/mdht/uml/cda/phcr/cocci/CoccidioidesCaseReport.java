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

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coccidioides Case Report</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.phcr.cocci.CocciPackage#getCoccidioidesCaseReport()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation title.mixed='Public Health Case Report - Coccidioidomycosis' templateId.root='2.16.840.1.113883.10.20.15.1.10' constraints.validation.error='CoccidioidesCaseReportTemplateId CoccidioidesCaseReportTitle CoccidioidesCaseReportCoccidioidesPHCRClinicalInformationSection' constraints.validation.warning='CoccidioidesCaseReportCoccidioidesPHCRSocialHistorySection CoccidioidesCaseReportCoccidioidesPHCRTreatmentInformationSection CoccidioidesCaseReportCoccidioidesPHCRRelevantDxTestsSection'"
 * @generated
 */
public interface CoccidioidesCaseReport extends PublicHealthCaseReport {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'Public Health Case Report - Coccidioidomycosis')
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
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cocci::CoccidioidesPHCRSocialHistorySection))
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
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cocci::CoccidioidesPHCRClinicalInformationSection))
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
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cocci::CoccidioidesPHCRTreatmentInformationSection))
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
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cocci::CoccidioidesPHCRRelevantDxTestsSection))
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
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cocci::CoccidioidesPHCRSocialHistorySection))->asSequence()->first().oclAsType(cocci::CoccidioidesPHCRSocialHistorySection)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cocci::CoccidioidesPHCRSocialHistorySection))->asSequence()->first().oclAsType(cocci::CoccidioidesPHCRSocialHistorySection)'"
	 * @generated
	 */
	CoccidioidesPHCRSocialHistorySection getCoccidioidesPHCRSocialHistorySection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cocci::CoccidioidesPHCRClinicalInformationSection))->asSequence()->first().oclAsType(cocci::CoccidioidesPHCRClinicalInformationSection)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cocci::CoccidioidesPHCRClinicalInformationSection))->asSequence()->first().oclAsType(cocci::CoccidioidesPHCRClinicalInformationSection)'"
	 * @generated
	 */
	CoccidioidesPHCRClinicalInformationSection getCoccidioidesPHCRClinicalInformationSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cocci::CoccidioidesPHCRTreatmentInformationSection))->asSequence()->first().oclAsType(cocci::CoccidioidesPHCRTreatmentInformationSection)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cocci::CoccidioidesPHCRTreatmentInformationSection))->asSequence()->first().oclAsType(cocci::CoccidioidesPHCRTreatmentInformationSection)'"
	 * @generated
	 */
	CoccidioidesPHCRTreatmentInformationSection getCoccidioidesPHCRTreatmentInformationSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cocci::CoccidioidesPHCRRelevantDxTestsSection))->asSequence()->first().oclAsType(cocci::CoccidioidesPHCRRelevantDxTestsSection)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cocci::CoccidioidesPHCRRelevantDxTestsSection))->asSequence()->first().oclAsType(cocci::CoccidioidesPHCRRelevantDxTestsSection)'"
	 * @generated
	 */
	CoccidioidesPHCRRelevantDxTestsSection getCoccidioidesPHCRRelevantDxTestsSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoccidioidesCaseReport init();
} // CoccidioidesCaseReport
