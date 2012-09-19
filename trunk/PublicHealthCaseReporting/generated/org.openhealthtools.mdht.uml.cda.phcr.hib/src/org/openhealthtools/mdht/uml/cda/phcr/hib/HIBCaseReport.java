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
package org.openhealthtools.mdht.uml.cda.phcr.hib;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HIB Case Report</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.phcr.hib.HibPackage#getHIBCaseReport()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation title.mixed='Public Health Case Report - Haemophilus Influenzae Type B' templateId.root='2.16.840.1.113883.10.20.15.1.14' constraints.validation.error='HIBCaseReportTemplateId HIBCaseReportTitle HIBCaseReportHibPhcrClinicalInformationSection' constraints.validation.warning='HIBCaseReportHibPhcrRelevantDxTestsSection'"
 * @generated
 */
public interface HIBCaseReport extends PublicHealthCaseReport
{
  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (self.title.getText() = 'Public Health Case Report - Haemophilus Influenzae Type B')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (self.title.getText() = \'Public Health Case Report - Haemophilus Influenzae Type B\')'"
	 * @generated
	 */
	boolean validateHIBCaseReportTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hib::HibPhcrClinicalInformationSection ))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hib::HibPhcrClinicalInformationSection ))'"
	 * @generated
	 */
	boolean validateHIBCaseReportHibPhcrClinicalInformationSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hib::HibPhcrRelevantDxTestsSection))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hib::HibPhcrRelevantDxTestsSection))'"
	 * @generated
	 */
	boolean validateHIBCaseReportHibPhcrRelevantDxTestsSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hib::HibPhcrClinicalInformationSection ))->asSequence()->first().oclAsType(hib::HibPhcrClinicalInformationSection )
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hib::HibPhcrClinicalInformationSection ))->asSequence()->first().oclAsType(hib::HibPhcrClinicalInformationSection )'"
	 * @generated
	 */
	HibPhcrClinicalInformationSection getHibPhcrClinicalInformationSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hib::HibPhcrRelevantDxTestsSection))->asSequence()->first().oclAsType(hib::HibPhcrRelevantDxTestsSection)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hib::HibPhcrRelevantDxTestsSection))->asSequence()->first().oclAsType(hib::HibPhcrRelevantDxTestsSection)'"
	 * @generated
	 */
	HibPhcrRelevantDxTestsSection getHibPhcrRelevantDxTestsSection();

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public HIBCaseReport init();
} // HIBCaseReport
