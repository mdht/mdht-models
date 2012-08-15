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
package org.openhealthtools.mdht.uml.cda.phcr.streppneumo.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.phcr.operations.PublicHealthCaseReportOperations;

import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoImmunizationSection;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPHCRTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPackage;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoSocialHistorySection;

import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.util.StrepPneumoValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Case Report</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoCaseReport#validateStrepPneumoCaseReportTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Case Report Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoCaseReport#validateStrepPneumoCaseReportStrepPneumoPHCRClinicalInformationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Case Report Strep Pneumo PHCR Clinical Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoCaseReport#validateStrepPneumoCaseReportStrepPneumoPHCRTreatmentInformationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Case Report Strep Pneumo PHCR Treatment Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoCaseReport#validateStrepPneumoCaseReportStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Case Report Strep Pneumo Relevant Diagnostic Tests And Or Laboratory Data Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoCaseReport#validateStrepPneumoCaseReportStrepPneumoSocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Case Report Strep Pneumo Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoCaseReport#validateStrepPneumoCaseReportStrepPneumoImmunizationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Case Report Strep Pneumo Immunization Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoCaseReport#getStrepPneumoPHCRClinicalInformationSection() <em>Get Strep Pneumo PHCR Clinical Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoCaseReport#getStrepPneumoPHCRTreatmentInformationSection() <em>Get Strep Pneumo PHCR Treatment Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoCaseReport#getStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection() <em>Get Strep Pneumo Relevant Diagnostic Tests And Or Laboratory Data Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoCaseReport#getStrepPneumoSocialHistorySections() <em>Get Strep Pneumo Social History Sections</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoCaseReport#getStrepPneumoImmunizationSection() <em>Get Strep Pneumo Immunization Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoCaseReport#validatePublicHealthCaseReportTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StrepPneumoCaseReportOperations extends PublicHealthCaseReportOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StrepPneumoCaseReportOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStrepPneumoCaseReportTitle(StrepPneumoCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Case Report Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStrepPneumoCaseReportTitle(StrepPneumoCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STREP_PNEUMO_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'Public Health Case Report - Streptococcus pneumoniae')";

	/**
	 * The cached OCL invariant for the '{@link #validateStrepPneumoCaseReportTitle(StrepPneumoCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Case Report Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStrepPneumoCaseReportTitle(StrepPneumoCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STREP_PNEUMO_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'Public Health Case Report - Streptococcus pneumoniae')
	 * @param strepPneumoCaseReport The receiving '<em><b>Case Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStrepPneumoCaseReportTitle(StrepPneumoCaseReport strepPneumoCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STREP_PNEUMO_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(StrepPneumoPackage.Literals.STREP_PNEUMO_CASE_REPORT);
			try {
				VALIDATE_STREP_PNEUMO_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STREP_PNEUMO_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STREP_PNEUMO_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(strepPneumoCaseReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 StrepPneumoValidator.DIAGNOSTIC_SOURCE,
						 StrepPneumoValidator.STREP_PNEUMO_CASE_REPORT__STREP_PNEUMO_CASE_REPORT_TITLE,
						 StrepPneumoPlugin.INSTANCE.getString("StrepPneumoCaseReportTitle"),
						 new Object [] { strepPneumoCaseReport }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStrepPneumoCaseReportStrepPneumoPHCRClinicalInformationSection(StrepPneumoCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Case Report Strep Pneumo PHCR Clinical Information Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStrepPneumoCaseReportStrepPneumoPHCRClinicalInformationSection(StrepPneumoCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STREP_PNEUMO_CASE_REPORT_STREP_PNEUMO_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(streppneumo::StrepPneumoPHCRClinicalInformationSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateStrepPneumoCaseReportStrepPneumoPHCRClinicalInformationSection(StrepPneumoCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Case Report Strep Pneumo PHCR Clinical Information Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStrepPneumoCaseReportStrepPneumoPHCRClinicalInformationSection(StrepPneumoCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STREP_PNEUMO_CASE_REPORT_STREP_PNEUMO_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(streppneumo::StrepPneumoPHCRClinicalInformationSection))
	 * @param strepPneumoCaseReport The receiving '<em><b>Case Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStrepPneumoCaseReportStrepPneumoPHCRClinicalInformationSection(StrepPneumoCaseReport strepPneumoCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STREP_PNEUMO_CASE_REPORT_STREP_PNEUMO_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(StrepPneumoPackage.Literals.STREP_PNEUMO_CASE_REPORT);
			try {
				VALIDATE_STREP_PNEUMO_CASE_REPORT_STREP_PNEUMO_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STREP_PNEUMO_CASE_REPORT_STREP_PNEUMO_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STREP_PNEUMO_CASE_REPORT_STREP_PNEUMO_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(strepPneumoCaseReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 StrepPneumoValidator.DIAGNOSTIC_SOURCE,
						 StrepPneumoValidator.STREP_PNEUMO_CASE_REPORT__STREP_PNEUMO_CASE_REPORT_STREP_PNEUMO_PHCR_CLINICAL_INFORMATION_SECTION,
						 StrepPneumoPlugin.INSTANCE.getString("StrepPneumoCaseReportStrepPneumoPHCRClinicalInformationSection"),
						 new Object [] { strepPneumoCaseReport }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStrepPneumoCaseReportStrepPneumoPHCRTreatmentInformationSection(StrepPneumoCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Case Report Strep Pneumo PHCR Treatment Information Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStrepPneumoCaseReportStrepPneumoPHCRTreatmentInformationSection(StrepPneumoCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STREP_PNEUMO_CASE_REPORT_STREP_PNEUMO_PHCR_TREATMENT_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(streppneumo::StrepPneumoPHCRTreatmentInformationSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateStrepPneumoCaseReportStrepPneumoPHCRTreatmentInformationSection(StrepPneumoCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Case Report Strep Pneumo PHCR Treatment Information Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStrepPneumoCaseReportStrepPneumoPHCRTreatmentInformationSection(StrepPneumoCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STREP_PNEUMO_CASE_REPORT_STREP_PNEUMO_PHCR_TREATMENT_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(streppneumo::StrepPneumoPHCRTreatmentInformationSection))
	 * @param strepPneumoCaseReport The receiving '<em><b>Case Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStrepPneumoCaseReportStrepPneumoPHCRTreatmentInformationSection(StrepPneumoCaseReport strepPneumoCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STREP_PNEUMO_CASE_REPORT_STREP_PNEUMO_PHCR_TREATMENT_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(StrepPneumoPackage.Literals.STREP_PNEUMO_CASE_REPORT);
			try {
				VALIDATE_STREP_PNEUMO_CASE_REPORT_STREP_PNEUMO_PHCR_TREATMENT_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STREP_PNEUMO_CASE_REPORT_STREP_PNEUMO_PHCR_TREATMENT_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STREP_PNEUMO_CASE_REPORT_STREP_PNEUMO_PHCR_TREATMENT_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(strepPneumoCaseReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 StrepPneumoValidator.DIAGNOSTIC_SOURCE,
						 StrepPneumoValidator.STREP_PNEUMO_CASE_REPORT__STREP_PNEUMO_CASE_REPORT_STREP_PNEUMO_PHCR_TREATMENT_INFORMATION_SECTION,
						 StrepPneumoPlugin.INSTANCE.getString("StrepPneumoCaseReportStrepPneumoPHCRTreatmentInformationSection"),
						 new Object [] { strepPneumoCaseReport }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStrepPneumoCaseReportStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection(StrepPneumoCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Case Report Strep Pneumo Relevant Diagnostic Tests And Or Laboratory Data Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStrepPneumoCaseReportStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection(StrepPneumoCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STREP_PNEUMO_CASE_REPORT_STREP_PNEUMO_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(streppneumo::StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateStrepPneumoCaseReportStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection(StrepPneumoCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Case Report Strep Pneumo Relevant Diagnostic Tests And Or Laboratory Data Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStrepPneumoCaseReportStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection(StrepPneumoCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STREP_PNEUMO_CASE_REPORT_STREP_PNEUMO_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(streppneumo::StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection))
	 * @param strepPneumoCaseReport The receiving '<em><b>Case Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStrepPneumoCaseReportStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection(StrepPneumoCaseReport strepPneumoCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STREP_PNEUMO_CASE_REPORT_STREP_PNEUMO_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(StrepPneumoPackage.Literals.STREP_PNEUMO_CASE_REPORT);
			try {
				VALIDATE_STREP_PNEUMO_CASE_REPORT_STREP_PNEUMO_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STREP_PNEUMO_CASE_REPORT_STREP_PNEUMO_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STREP_PNEUMO_CASE_REPORT_STREP_PNEUMO_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(strepPneumoCaseReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 StrepPneumoValidator.DIAGNOSTIC_SOURCE,
						 StrepPneumoValidator.STREP_PNEUMO_CASE_REPORT__STREP_PNEUMO_CASE_REPORT_STREP_PNEUMO_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION,
						 StrepPneumoPlugin.INSTANCE.getString("StrepPneumoCaseReportStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection"),
						 new Object [] { strepPneumoCaseReport }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStrepPneumoCaseReportStrepPneumoSocialHistorySection(StrepPneumoCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Case Report Strep Pneumo Social History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStrepPneumoCaseReportStrepPneumoSocialHistorySection(StrepPneumoCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STREP_PNEUMO_CASE_REPORT_STREP_PNEUMO_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(streppneumo::StrepPneumoSocialHistorySection))";

	/**
	 * The cached OCL invariant for the '{@link #validateStrepPneumoCaseReportStrepPneumoSocialHistorySection(StrepPneumoCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Case Report Strep Pneumo Social History Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStrepPneumoCaseReportStrepPneumoSocialHistorySection(StrepPneumoCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STREP_PNEUMO_CASE_REPORT_STREP_PNEUMO_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(streppneumo::StrepPneumoSocialHistorySection))
	 * @param strepPneumoCaseReport The receiving '<em><b>Case Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStrepPneumoCaseReportStrepPneumoSocialHistorySection(StrepPneumoCaseReport strepPneumoCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STREP_PNEUMO_CASE_REPORT_STREP_PNEUMO_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(StrepPneumoPackage.Literals.STREP_PNEUMO_CASE_REPORT);
			try {
				VALIDATE_STREP_PNEUMO_CASE_REPORT_STREP_PNEUMO_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STREP_PNEUMO_CASE_REPORT_STREP_PNEUMO_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STREP_PNEUMO_CASE_REPORT_STREP_PNEUMO_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(strepPneumoCaseReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 StrepPneumoValidator.DIAGNOSTIC_SOURCE,
						 StrepPneumoValidator.STREP_PNEUMO_CASE_REPORT__STREP_PNEUMO_CASE_REPORT_STREP_PNEUMO_SOCIAL_HISTORY_SECTION,
						 StrepPneumoPlugin.INSTANCE.getString("StrepPneumoCaseReportStrepPneumoSocialHistorySection"),
						 new Object [] { strepPneumoCaseReport }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStrepPneumoCaseReportStrepPneumoImmunizationSection(StrepPneumoCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Case Report Strep Pneumo Immunization Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStrepPneumoCaseReportStrepPneumoImmunizationSection(StrepPneumoCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STREP_PNEUMO_CASE_REPORT_STREP_PNEUMO_IMMUNIZATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(streppneumo::StrepPneumoImmunizationSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateStrepPneumoCaseReportStrepPneumoImmunizationSection(StrepPneumoCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Case Report Strep Pneumo Immunization Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStrepPneumoCaseReportStrepPneumoImmunizationSection(StrepPneumoCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STREP_PNEUMO_CASE_REPORT_STREP_PNEUMO_IMMUNIZATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(streppneumo::StrepPneumoImmunizationSection))
	 * @param strepPneumoCaseReport The receiving '<em><b>Case Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStrepPneumoCaseReportStrepPneumoImmunizationSection(StrepPneumoCaseReport strepPneumoCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STREP_PNEUMO_CASE_REPORT_STREP_PNEUMO_IMMUNIZATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(StrepPneumoPackage.Literals.STREP_PNEUMO_CASE_REPORT);
			try {
				VALIDATE_STREP_PNEUMO_CASE_REPORT_STREP_PNEUMO_IMMUNIZATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STREP_PNEUMO_CASE_REPORT_STREP_PNEUMO_IMMUNIZATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STREP_PNEUMO_CASE_REPORT_STREP_PNEUMO_IMMUNIZATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(strepPneumoCaseReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 StrepPneumoValidator.DIAGNOSTIC_SOURCE,
						 StrepPneumoValidator.STREP_PNEUMO_CASE_REPORT__STREP_PNEUMO_CASE_REPORT_STREP_PNEUMO_IMMUNIZATION_SECTION,
						 StrepPneumoPlugin.INSTANCE.getString("StrepPneumoCaseReportStrepPneumoImmunizationSection"),
						 new Object [] { strepPneumoCaseReport }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getStrepPneumoPHCRClinicalInformationSection(StrepPneumoCaseReport) <em>Get Strep Pneumo PHCR Clinical Information Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrepPneumoPHCRClinicalInformationSection(StrepPneumoCaseReport)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_STREP_PNEUMO_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(streppneumo::StrepPneumoPHCRClinicalInformationSection))->asSequence()->first().oclAsType(streppneumo::StrepPneumoPHCRClinicalInformationSection)";

	/**
	 * The cached OCL query for the '{@link #getStrepPneumoPHCRClinicalInformationSection(StrepPneumoCaseReport) <em>Get Strep Pneumo PHCR Clinical Information Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrepPneumoPHCRClinicalInformationSection(StrepPneumoCaseReport)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_STREP_PNEUMO_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(streppneumo::StrepPneumoPHCRClinicalInformationSection))->asSequence()->first().oclAsType(streppneumo::StrepPneumoPHCRClinicalInformationSection)
	 * @param strepPneumoCaseReport The receiving '<em><b>Case Report</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  StrepPneumoPHCRClinicalInformationSection getStrepPneumoPHCRClinicalInformationSection(StrepPneumoCaseReport strepPneumoCaseReport) {
		if (GET_STREP_PNEUMO_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(StrepPneumoPackage.Literals.STREP_PNEUMO_CASE_REPORT, StrepPneumoPackage.Literals.STREP_PNEUMO_CASE_REPORT.getEAllOperations().get(65));
			try {
				GET_STREP_PNEUMO_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_QRY = helper.createQuery(GET_STREP_PNEUMO_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_STREP_PNEUMO_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_QRY);
		return (StrepPneumoPHCRClinicalInformationSection) query.evaluate(strepPneumoCaseReport);
	}

	/**
	 * The cached OCL expression body for the '{@link #getStrepPneumoPHCRTreatmentInformationSection(StrepPneumoCaseReport) <em>Get Strep Pneumo PHCR Treatment Information Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrepPneumoPHCRTreatmentInformationSection(StrepPneumoCaseReport)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_STREP_PNEUMO_PHCR_TREATMENT_INFORMATION_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(streppneumo::StrepPneumoPHCRTreatmentInformationSection))->asSequence()->first().oclAsType(streppneumo::StrepPneumoPHCRTreatmentInformationSection)";

	/**
	 * The cached OCL query for the '{@link #getStrepPneumoPHCRTreatmentInformationSection(StrepPneumoCaseReport) <em>Get Strep Pneumo PHCR Treatment Information Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrepPneumoPHCRTreatmentInformationSection(StrepPneumoCaseReport)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_STREP_PNEUMO_PHCR_TREATMENT_INFORMATION_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(streppneumo::StrepPneumoPHCRTreatmentInformationSection))->asSequence()->first().oclAsType(streppneumo::StrepPneumoPHCRTreatmentInformationSection)
	 * @param strepPneumoCaseReport The receiving '<em><b>Case Report</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  StrepPneumoPHCRTreatmentInformationSection getStrepPneumoPHCRTreatmentInformationSection(StrepPneumoCaseReport strepPneumoCaseReport) {
		if (GET_STREP_PNEUMO_PHCR_TREATMENT_INFORMATION_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(StrepPneumoPackage.Literals.STREP_PNEUMO_CASE_REPORT, StrepPneumoPackage.Literals.STREP_PNEUMO_CASE_REPORT.getEAllOperations().get(66));
			try {
				GET_STREP_PNEUMO_PHCR_TREATMENT_INFORMATION_SECTION__EOCL_QRY = helper.createQuery(GET_STREP_PNEUMO_PHCR_TREATMENT_INFORMATION_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_STREP_PNEUMO_PHCR_TREATMENT_INFORMATION_SECTION__EOCL_QRY);
		return (StrepPneumoPHCRTreatmentInformationSection) query.evaluate(strepPneumoCaseReport);
	}

	/**
	 * The cached OCL expression body for the '{@link #getStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection(StrepPneumoCaseReport) <em>Get Strep Pneumo Relevant Diagnostic Tests And Or Laboratory Data Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection(StrepPneumoCaseReport)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_STREP_PNEUMO_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(streppneumo::StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection))->asSequence()->first().oclAsType(streppneumo::StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection)";

	/**
	 * The cached OCL query for the '{@link #getStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection(StrepPneumoCaseReport) <em>Get Strep Pneumo Relevant Diagnostic Tests And Or Laboratory Data Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection(StrepPneumoCaseReport)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_STREP_PNEUMO_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(streppneumo::StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection))->asSequence()->first().oclAsType(streppneumo::StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection)
	 * @param strepPneumoCaseReport The receiving '<em><b>Case Report</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection getStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection(StrepPneumoCaseReport strepPneumoCaseReport) {
		if (GET_STREP_PNEUMO_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(StrepPneumoPackage.Literals.STREP_PNEUMO_CASE_REPORT, StrepPneumoPackage.Literals.STREP_PNEUMO_CASE_REPORT.getEAllOperations().get(67));
			try {
				GET_STREP_PNEUMO_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__EOCL_QRY = helper.createQuery(GET_STREP_PNEUMO_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_STREP_PNEUMO_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__EOCL_QRY);
		return (StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection) query.evaluate(strepPneumoCaseReport);
	}

	/**
	 * The cached OCL expression body for the '{@link #getStrepPneumoSocialHistorySections(StrepPneumoCaseReport) <em>Get Strep Pneumo Social History Sections</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrepPneumoSocialHistorySections(StrepPneumoCaseReport)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_STREP_PNEUMO_SOCIAL_HISTORY_SECTIONS__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(streppneumo::StrepPneumoSocialHistorySection)).oclAsType(streppneumo::StrepPneumoSocialHistorySection)";

	/**
	 * The cached OCL query for the '{@link #getStrepPneumoSocialHistorySections(StrepPneumoCaseReport) <em>Get Strep Pneumo Social History Sections</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrepPneumoSocialHistorySections(StrepPneumoCaseReport)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_STREP_PNEUMO_SOCIAL_HISTORY_SECTIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(streppneumo::StrepPneumoSocialHistorySection)).oclAsType(streppneumo::StrepPneumoSocialHistorySection)
	 * @param strepPneumoCaseReport The receiving '<em><b>Case Report</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  EList<StrepPneumoSocialHistorySection> getStrepPneumoSocialHistorySections(StrepPneumoCaseReport strepPneumoCaseReport) {
		if (GET_STREP_PNEUMO_SOCIAL_HISTORY_SECTIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(StrepPneumoPackage.Literals.STREP_PNEUMO_CASE_REPORT, StrepPneumoPackage.Literals.STREP_PNEUMO_CASE_REPORT.getEAllOperations().get(68));
			try {
				GET_STREP_PNEUMO_SOCIAL_HISTORY_SECTIONS__EOCL_QRY = helper.createQuery(GET_STREP_PNEUMO_SOCIAL_HISTORY_SECTIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_STREP_PNEUMO_SOCIAL_HISTORY_SECTIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<StrepPneumoSocialHistorySection> result = (Collection<StrepPneumoSocialHistorySection>) query.evaluate(strepPneumoCaseReport);
		return new BasicEList.UnmodifiableEList<StrepPneumoSocialHistorySection>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getStrepPneumoImmunizationSection(StrepPneumoCaseReport) <em>Get Strep Pneumo Immunization Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrepPneumoImmunizationSection(StrepPneumoCaseReport)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_STREP_PNEUMO_IMMUNIZATION_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(streppneumo::StrepPneumoImmunizationSection))->asSequence()->first().oclAsType(streppneumo::StrepPneumoImmunizationSection)";

	/**
	 * The cached OCL query for the '{@link #getStrepPneumoImmunizationSection(StrepPneumoCaseReport) <em>Get Strep Pneumo Immunization Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrepPneumoImmunizationSection(StrepPneumoCaseReport)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_STREP_PNEUMO_IMMUNIZATION_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(streppneumo::StrepPneumoImmunizationSection))->asSequence()->first().oclAsType(streppneumo::StrepPneumoImmunizationSection)
	 * @param strepPneumoCaseReport The receiving '<em><b>Case Report</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  StrepPneumoImmunizationSection getStrepPneumoImmunizationSection(StrepPneumoCaseReport strepPneumoCaseReport) {
		if (GET_STREP_PNEUMO_IMMUNIZATION_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(StrepPneumoPackage.Literals.STREP_PNEUMO_CASE_REPORT, StrepPneumoPackage.Literals.STREP_PNEUMO_CASE_REPORT.getEAllOperations().get(69));
			try {
				GET_STREP_PNEUMO_IMMUNIZATION_SECTION__EOCL_QRY = helper.createQuery(GET_STREP_PNEUMO_IMMUNIZATION_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_STREP_PNEUMO_IMMUNIZATION_SECTION__EOCL_QRY);
		return (StrepPneumoImmunizationSection) query.evaluate(strepPneumoCaseReport);
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePublicHealthCaseReportTemplateId(StrepPneumoCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePublicHealthCaseReportTemplateId(StrepPneumoCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.1.12')";

	/**
	 * The cached OCL invariant for the '{@link #validatePublicHealthCaseReportTemplateId(StrepPneumoCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePublicHealthCaseReportTemplateId(StrepPneumoCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.1.12')
	 * @param strepPneumoCaseReport The receiving '<em><b>Case Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePublicHealthCaseReportTemplateId(StrepPneumoCaseReport strepPneumoCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(StrepPneumoPackage.Literals.STREP_PNEUMO_CASE_REPORT);
			try {
				VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(strepPneumoCaseReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 StrepPneumoValidator.DIAGNOSTIC_SOURCE,
						 StrepPneumoValidator.STREP_PNEUMO_CASE_REPORT__PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PublicHealthCaseReportTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(strepPneumoCaseReport, context) }),
						 new Object [] { strepPneumoCaseReport }));
			}
			 
			return false;
		}
		return true;
	}

} // StrepPneumoCaseReportOperations