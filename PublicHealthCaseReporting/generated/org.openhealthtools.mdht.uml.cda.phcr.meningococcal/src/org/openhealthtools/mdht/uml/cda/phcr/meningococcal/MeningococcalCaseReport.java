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
package org.openhealthtools.mdht.uml.cda.phcr.meningococcal;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case Report</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.phcr.meningococcal.MeningococcalPackage#getMeningococcalCaseReport()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation title.mixed='Public Health Case Report - Meningococcal' templateId.root='2.16.840.1.113883.10.20.15.1.15' constraints.validation.error='MeningococcalCaseReportTemplateId MeningococcalCaseReportTitle MeningococcalCaseReportMeningococcalPhcrClinicalInformationSection' constraints.validation.warning='MeningococcalCaseReportMeningococcalPhcrRelevantDxTestsSection'"
 * @generated
 */
public interface MeningococcalCaseReport extends PublicHealthCaseReport
{
  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'Public Health Case Report - Meningococcal')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = \'Public Health Case Report - Meningococcal\')'"
	 * @generated
	 */
	boolean validateMeningococcalCaseReportTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(meningococcal::MeningococcalPhcrClinicalInformationSection))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(meningococcal::MeningococcalPhcrClinicalInformationSection))'"
	 * @generated
	 */
	boolean validateMeningococcalCaseReportMeningococcalPhcrClinicalInformationSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(meningococcal::MeningococcalPhcrRelevantDxTestsSection))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(meningococcal::MeningococcalPhcrRelevantDxTestsSection))'"
	 * @generated
	 */
	boolean validateMeningococcalCaseReportMeningococcalPhcrRelevantDxTestsSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(meningococcal::MeningococcalPhcrClinicalInformationSection))->asSequence()->first().oclAsType(meningococcal::MeningococcalPhcrClinicalInformationSection)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(meningococcal::MeningococcalPhcrClinicalInformationSection))->asSequence()->first().oclAsType(meningococcal::MeningococcalPhcrClinicalInformationSection)'"
	 * @generated
	 */
	MeningococcalPhcrClinicalInformationSection getMeningococcalPhcrClinicalInformationSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(meningococcal::MeningococcalPhcrRelevantDxTestsSection))->asSequence()->first().oclAsType(meningococcal::MeningococcalPhcrRelevantDxTestsSection)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(meningococcal::MeningococcalPhcrRelevantDxTestsSection))->asSequence()->first().oclAsType(meningococcal::MeningococcalPhcrRelevantDxTestsSection)'"
	 * @generated
	 */
	MeningococcalPhcrRelevantDxTestsSection getMeningococcalPhcrRelevantDxTestsSection();

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public MeningococcalCaseReport init();
} // MeningococcalCaseReport
