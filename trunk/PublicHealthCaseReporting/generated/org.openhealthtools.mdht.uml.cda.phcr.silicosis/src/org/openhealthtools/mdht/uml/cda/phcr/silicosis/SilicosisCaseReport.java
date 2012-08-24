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
package org.openhealthtools.mdht.uml.cda.phcr.silicosis;

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
 * @see org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPackage#getSilicosisCaseReport()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='SilicosisCaseReportTemplateId SilicosisCaseReportTitle SilicosisCaseReportSilicosisPHCRClinicalInformationSection' templateId.root='2.16.840.1.113883.10.20.15.1.8' title.mixed='Public Health Case Report - Silicosis' constraints.validation.warning='SilicosisCaseReportSilicosisPHCRSocialHistorySection SilicosisCaseReportSilicosisPHCRRelevantDxTestsSection'"
 * @generated
 */
public interface SilicosisCaseReport extends PublicHealthCaseReport {

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = \'Public Health Case Report - Silicosis\')'"
   * @generated
   */
  boolean validateSilicosisCaseReportTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(silicosis::SilicosisPHCRSocialHistorySection))'"
   * @generated
   */
	boolean validateSilicosisCaseReportSilicosisPHCRSocialHistorySection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(silicosis::SilicosisPHCRClinicalInformationSection))'"
   * @generated
   */
	boolean validateSilicosisCaseReportSilicosisPHCRClinicalInformationSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(silicosis::SilicosisPHCRRelevantDxTestsSection))'"
   * @generated
   */
  boolean validateSilicosisCaseReportSilicosisPHCRRelevantDxTestsSection(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(silicosis::SilicosisPHCRSocialHistorySection))->asSequence()->any(true).oclAsType(silicosis::SilicosisPHCRSocialHistorySection)'"
   * @generated
   */
	SilicosisPHCRSocialHistorySection getSilicosisPHCRSocialHistorySection();

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(silicosis::SilicosisPHCRClinicalInformationSection))->asSequence()->any(true).oclAsType(silicosis::SilicosisPHCRClinicalInformationSection)'"
   * @generated
   */
	SilicosisPHCRClinicalInformationSection getSilicosisPHCRClinicalInformationSection();

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(silicosis::SilicosisPHCRRelevantDxTestsSection))->asSequence()->any(true).oclAsType(silicosis::SilicosisPHCRRelevantDxTestsSection)'"
   * @generated
   */
  SilicosisPHCRRelevantDxTestsSection getSilicosisPHCRRelevantDxTestsSection();

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SilicosisCaseReport init();

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SilicosisCaseReport init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // SilicosisCaseReport
