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
package org.openhealthtools.mdht.uml.cda.phcr.pertussis;

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
 * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisPackage#getPertussisCaseReport()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='PertussisCaseReportTemplateId PertussisCaseReportTitle PertussisCaseReportPertussisClinicalInformationSection' templateId.root='2.16.840.1.113883.10.20.15.1.5' title.mixed='Public Health Case Report - Pertussis' constraints.validation.warning='PertussisCaseReportPertussisSocialHistorySection PertussisCaseReportPertussisTreatmentInformationSection PertussisCaseReportPertussisRelevantDxTestsSection PertussisCaseReportPertussisImmunizationsSection'"
 * @generated
 */
public interface PertussisCaseReport extends PublicHealthCaseReport
{
  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (self.title.getText() = 'Public Health Case Report - Pertussis')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (self.title.getText() = \'Public Health Case Report - Pertussis\')'"
	 * @generated
	 */
	boolean validatePertussisCaseReportTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(pertussis::PertussisSocialHistorySection))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(pertussis::PertussisSocialHistorySection))'"
	 * @generated
	 */
	boolean validatePertussisCaseReportPertussisSocialHistorySection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(pertussis::PertussisClinicalInformationSection))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(pertussis::PertussisClinicalInformationSection))'"
	 * @generated
	 */
	boolean validatePertussisCaseReportPertussisClinicalInformationSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(pertussis::PertussisTreatmentInformationSection))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(pertussis::PertussisTreatmentInformationSection))'"
	 * @generated
	 */
	boolean validatePertussisCaseReportPertussisTreatmentInformationSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(pertussis::PertussisRelevantDxTestsSection))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(pertussis::PertussisRelevantDxTestsSection))'"
	 * @generated
	 */
	boolean validatePertussisCaseReportPertussisRelevantDxTestsSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(pertussis::PertussisImmunizationsSection))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(pertussis::PertussisImmunizationsSection))'"
	 * @generated
	 */
	boolean validatePertussisCaseReportPertussisImmunizationsSection(DiagnosticChain diagnostics, Map<Object, Object> context);

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(pertussis::PertussisSocialHistorySection))->asSequence()->any(true).oclAsType(pertussis::PertussisSocialHistorySection)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(pertussis::PertussisSocialHistorySection))->asSequence()->any(true).oclAsType(pertussis::PertussisSocialHistorySection)'"
	 * @generated
	 */
  PertussisSocialHistorySection getPertussisSocialHistorySection();

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(pertussis::PertussisClinicalInformationSection))->asSequence()->any(true).oclAsType(pertussis::PertussisClinicalInformationSection)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(pertussis::PertussisClinicalInformationSection))->asSequence()->any(true).oclAsType(pertussis::PertussisClinicalInformationSection)'"
	 * @generated
	 */
	PertussisClinicalInformationSection getPertussisClinicalInformationSection();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(pertussis::PertussisTreatmentInformationSection))->asSequence()->any(true).oclAsType(pertussis::PertussisTreatmentInformationSection)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(pertussis::PertussisTreatmentInformationSection))->asSequence()->any(true).oclAsType(pertussis::PertussisTreatmentInformationSection)'"
	 * @generated
	 */
	PertussisTreatmentInformationSection getPertussisTreatmentInformationSection();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(pertussis::PertussisRelevantDxTestsSection))->asSequence()->any(true).oclAsType(pertussis::PertussisRelevantDxTestsSection)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(pertussis::PertussisRelevantDxTestsSection))->asSequence()->any(true).oclAsType(pertussis::PertussisRelevantDxTestsSection)'"
	 * @generated
	 */
	PertussisRelevantDxTestsSection getPertussisRelevantDxTestsSection();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(pertussis::PertussisImmunizationsSection))->asSequence()->any(true).oclAsType(pertussis::PertussisImmunizationsSection)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(pertussis::PertussisImmunizationsSection))->asSequence()->any(true).oclAsType(pertussis::PertussisImmunizationsSection)'"
	 * @generated
	 */
	PertussisImmunizationsSection getPertussisImmunizationsSection();

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public PertussisCaseReport init();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PertussisCaseReport init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // PertussisCaseReport
