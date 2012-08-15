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
package org.openhealthtools.mdht.uml.cda.phcr.wnv;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>West Nile Virus Case Report</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvPackage#getWestNileVirusCaseReport()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation title.mixed='Public Health Case Report - West Nile Virus' templateId.root='2.16.840.1.113883.10.20.15.1.7' constraints.validation.error='WestNileVirusCaseReportTemplateId WestNileVirusCaseReportTitle WestNileVirusCaseReportWnvPhcrClinicalInformationSection' constraints.validation.warning='WestNileVirusCaseReportWnvPhcrRelevantDxTestsSection'"
 * @generated
 */
public interface WestNileVirusCaseReport extends PublicHealthCaseReport
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (self.title.getText() = 'Public Health Case Report - West Nile Virus')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (self.title.getText() = \'Public Health Case Report - West Nile Virus\')'"
	 * @generated
	 */
  boolean validateWestNileVirusCaseReportTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(wnv::WnvPhcrClinicalInformationSection))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(wnv::WnvPhcrClinicalInformationSection))'"
	 * @generated
	 */
  boolean validateWestNileVirusCaseReportWnvPhcrClinicalInformationSection(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(wnv::WnvPhcrRelevantDxTestsSection))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(wnv::WnvPhcrRelevantDxTestsSection))'"
	 * @generated
	 */
  boolean validateWestNileVirusCaseReportWnvPhcrRelevantDxTestsSection(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(wnv::WnvPhcrClinicalInformationSection))->asSequence()->first().oclAsType(wnv::WnvPhcrClinicalInformationSection)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(wnv::WnvPhcrClinicalInformationSection))->asSequence()->first().oclAsType(wnv::WnvPhcrClinicalInformationSection)'"
	 * @generated
	 */
  WnvPhcrClinicalInformationSection getWnvPhcrClinicalInformationSection();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(wnv::WnvPhcrRelevantDxTestsSection))->asSequence()->first().oclAsType(wnv::WnvPhcrRelevantDxTestsSection)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(wnv::WnvPhcrRelevantDxTestsSection))->asSequence()->first().oclAsType(wnv::WnvPhcrRelevantDxTestsSection)'"
	 * @generated
	 */
  WnvPhcrRelevantDxTestsSection getWnvPhcrRelevantDxTestsSection();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public WestNileVirusCaseReport init();
} // WestNileVirusCaseReport
