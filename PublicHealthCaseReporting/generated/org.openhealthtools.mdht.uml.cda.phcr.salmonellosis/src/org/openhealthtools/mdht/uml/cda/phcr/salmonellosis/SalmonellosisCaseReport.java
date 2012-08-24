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
package org.openhealthtools.mdht.uml.cda.phcr.salmonellosis;

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
 * @see org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPackage#getSalmonellosisCaseReport()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='SalmonellosisCaseReportTemplateId SalmonellosisCaseReportTitle SalmonellosisCaseReportSalmonellosisPHCRClinicalInformationSection' templateId.root='2.16.840.1.113883.10.20.15.1.9' title.mixed='Public Health Case Report -  Salmonellosis' constraints.validation.warning='SalmonellosisCaseReportSalmonellosisSocialHistorySection SalmonellosisCaseReportSalmonellosisRelevantDxTestsSection'"
 * @generated
 */
public interface SalmonellosisCaseReport extends PublicHealthCaseReport {

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = \'Public Health Case Report -  Salmonellosis\')'"
   * @generated
   */
  boolean validateSalmonellosisCaseReportTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(salmonellosis::SalmonellosisPHCRSocialHistorySection))'"
   * @generated
   */
	boolean validateSalmonellosisCaseReportSalmonellosisSocialHistorySection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(salmonellosis::SalmonellosisPHCRRelevantDxTestsSection))'"
   * @generated
   */
	boolean validateSalmonellosisCaseReportSalmonellosisRelevantDxTestsSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(salmonellosis::SalmonellosisPHCRClinicalInformationSection))'"
   * @generated
   */
	boolean validateSalmonellosisCaseReportSalmonellosisPHCRClinicalInformationSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(salmselectllosis::SalmselectllosisPHCRSocialHistorySection))->asSequence()->any(true).oclAsType(salmonellosis::SalmonellosisPHCRSocialHistorySection)'"
   * @generated
   */
	SalmonellosisPHCRSocialHistorySection getSalmonellosisSocialHistorySection();

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(salmselectllosis::SalmselectllosisPHCRRelevantDxTestsSection))->asSequence()->any(true).oclAsType(salmonellosis::SalmonellosisPHCRRelevantDxTestsSection)'"
   * @generated
   */
	SalmonellosisPHCRRelevantDxTestsSection getSalmonellosisRelevantDxTestsSection();

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(salmselectllosis::SalmselectllosisPHCRClinicalInformationSection))->asSequence()->any(true).oclAsType(salmonellosis::SalmonellosisPHCRClinicalInformationSection)'"
   * @generated
   */
	SalmonellosisPHCRClinicalInformationSection getSalmonellosisPHCRClinicalInformationSection();

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SalmonellosisCaseReport init();

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SalmonellosisCaseReport init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // SalmonellosisCaseReport
