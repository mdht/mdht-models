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
package org.openhealthtools.mdht.uml.cda.phcr.tss;

import java.lang.Iterable;
import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Toxic Shock Syndrome Case Report</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.phcr.tss.tssPackage#getToxicShockSyndromeCaseReport()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ToxicShockSyndromeCaseReportTemplateId ToxicShockSyndromeCaseReportTitle ToxicShockSyndromeCaseReportTssPhcrClinicalInformationSection' templateId.root='2.16.840.1.113883.10.20.15.1.6' title.mixed='Public Health Case Report - Toxic Shock Syndrome' constraints.validation.warning='ToxicShockSyndromeCaseReportTssPhcrRelevantDxTestsSection'"
 * @generated
 */
public interface ToxicShockSyndromeCaseReport extends PublicHealthCaseReport {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'Public Health Case Report - Toxic Shock Syndrome')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = \'Public Health Case Report - Toxic Shock Syndrome\')'"
   * @generated
   */
	boolean validateToxicShockSyndromeCaseReportTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(tss::TssPhcrClinicalInformationSection))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(tss::TssPhcrClinicalInformationSection))'"
   * @generated
   */
	boolean validateToxicShockSyndromeCaseReportTssPhcrClinicalInformationSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(tss::TssPhcrRelevantDxTestsSection))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(tss::TssPhcrRelevantDxTestsSection))'"
   * @generated
   */
	boolean validateToxicShockSyndromeCaseReportTssPhcrRelevantDxTestsSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(tss::TssPhcrClinicalInformationSection))->asSequence()->any(true).oclAsType(tss::TssPhcrClinicalInformationSection)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(tss::TssPhcrClinicalInformationSection))->asSequence()->any(true).oclAsType(tss::TssPhcrClinicalInformationSection)'"
   * @generated
   */
	TssPhcrClinicalInformationSection getTssPhcrClinicalInformationSection();

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(tss::TssPhcrRelevantDxTestsSection))->asSequence()->any(true).oclAsType(tss::TssPhcrRelevantDxTestsSection)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(tss::TssPhcrRelevantDxTestsSection))->asSequence()->any(true).oclAsType(tss::TssPhcrRelevantDxTestsSection)'"
   * @generated
   */
	TssPhcrRelevantDxTestsSection getTssPhcrRelevantDxTestsSection();
} // ToxicShockSyndromeCaseReport
