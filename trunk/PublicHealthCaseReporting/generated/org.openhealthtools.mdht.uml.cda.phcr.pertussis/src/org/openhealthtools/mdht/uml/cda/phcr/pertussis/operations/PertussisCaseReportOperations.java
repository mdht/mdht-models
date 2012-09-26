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
package org.openhealthtools.mdht.uml.cda.phcr.pertussis.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.phcr.operations.PublicHealthCaseReportOperations;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.util.PertussisValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Case Report</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisCaseReport#validatePertussisCaseReportTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Case Report Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisCaseReport#validatePertussisCaseReportPertussisSocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Case Report Pertussis Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisCaseReport#validatePertussisCaseReportPertussisClinicalInformationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Case Report Pertussis Clinical Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisCaseReport#validatePertussisCaseReportPertussisTreatmentInformationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Case Report Pertussis Treatment Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisCaseReport#validatePertussisCaseReportPertussisRelevantDxTestsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Case Report Pertussis Relevant Dx Tests Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisCaseReport#validatePertussisCaseReportPertussisImmunizationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Case Report Pertussis Immunizations Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisCaseReport#getPertussisSocialHistorySection() <em>Get Pertussis Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisCaseReport#getPertussisClinicalInformationSection() <em>Get Pertussis Clinical Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisCaseReport#getPertussisTreatmentInformationSection() <em>Get Pertussis Treatment Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisCaseReport#getPertussisRelevantDxTestsSection() <em>Get Pertussis Relevant Dx Tests Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisCaseReport#getPertussisImmunizationsSection() <em>Get Pertussis Immunizations Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisCaseReport#validatePublicHealthCaseReportTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PertussisCaseReportOperations extends PublicHealthCaseReportOperations
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected PertussisCaseReportOperations() {
		super();
	}

  /**
	 * The cached OCL expression body for the '{@link #validatePertussisCaseReportTitle(PertussisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Case Report Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePertussisCaseReportTitle(PertussisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PERTUSSIS_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (self.title.getText() = 'Public Health Case Report - Pertussis')";

		/**
	 * The cached OCL invariant for the '{@link #validatePertussisCaseReportTitle(PertussisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Case Report Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePertussisCaseReportTitle(PertussisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PERTUSSIS_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (self.title.getText() = 'Public Health Case Report - Pertussis')
	 * @param pertussisCaseReport The receiving '<em><b>Case Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePertussisCaseReportTitle(PertussisCaseReport pertussisCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PERTUSSIS_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PertussisPackage.Literals.PERTUSSIS_CASE_REPORT);
			try {
				VALIDATE_PERTUSSIS_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PERTUSSIS_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PERTUSSIS_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pertussisCaseReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PertussisValidator.DIAGNOSTIC_SOURCE,
						 PertussisValidator.PERTUSSIS_CASE_REPORT__PERTUSSIS_CASE_REPORT_TITLE,
						 PertussisPlugin.INSTANCE.getString("PertussisCaseReportTitle"),
						 new Object [] { pertussisCaseReport }));
			}
			 
			return false;
		}
		return true;
	}

		/**
	 * The cached OCL expression body for the '{@link #validatePertussisCaseReportPertussisSocialHistorySection(PertussisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Case Report Pertussis Social History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePertussisCaseReportPertussisSocialHistorySection(PertussisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PERTUSSIS_CASE_REPORT_PERTUSSIS_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(pertussis::PertussisSocialHistorySection))";

		/**
	 * The cached OCL invariant for the '{@link #validatePertussisCaseReportPertussisSocialHistorySection(PertussisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Case Report Pertussis Social History Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePertussisCaseReportPertussisSocialHistorySection(PertussisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PERTUSSIS_CASE_REPORT_PERTUSSIS_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(pertussis::PertussisSocialHistorySection))
	 * @param pertussisCaseReport The receiving '<em><b>Case Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePertussisCaseReportPertussisSocialHistorySection(PertussisCaseReport pertussisCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PERTUSSIS_CASE_REPORT_PERTUSSIS_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PertussisPackage.Literals.PERTUSSIS_CASE_REPORT);
			try {
				VALIDATE_PERTUSSIS_CASE_REPORT_PERTUSSIS_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PERTUSSIS_CASE_REPORT_PERTUSSIS_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PERTUSSIS_CASE_REPORT_PERTUSSIS_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pertussisCaseReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 PertussisValidator.DIAGNOSTIC_SOURCE,
						 PertussisValidator.PERTUSSIS_CASE_REPORT__PERTUSSIS_CASE_REPORT_PERTUSSIS_SOCIAL_HISTORY_SECTION,
						 PertussisPlugin.INSTANCE.getString("PertussisCaseReportPertussisSocialHistorySection"),
						 new Object [] { pertussisCaseReport }));
			}
			 
			return false;
		}
		return true;
	}

		/**
	 * The cached OCL expression body for the '{@link #validatePertussisCaseReportPertussisClinicalInformationSection(PertussisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Case Report Pertussis Clinical Information Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePertussisCaseReportPertussisClinicalInformationSection(PertussisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PERTUSSIS_CASE_REPORT_PERTUSSIS_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(pertussis::PertussisClinicalInformationSection))";

		/**
	 * The cached OCL invariant for the '{@link #validatePertussisCaseReportPertussisClinicalInformationSection(PertussisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Case Report Pertussis Clinical Information Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePertussisCaseReportPertussisClinicalInformationSection(PertussisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PERTUSSIS_CASE_REPORT_PERTUSSIS_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(pertussis::PertussisClinicalInformationSection))
	 * @param pertussisCaseReport The receiving '<em><b>Case Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePertussisCaseReportPertussisClinicalInformationSection(PertussisCaseReport pertussisCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PERTUSSIS_CASE_REPORT_PERTUSSIS_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PertussisPackage.Literals.PERTUSSIS_CASE_REPORT);
			try {
				VALIDATE_PERTUSSIS_CASE_REPORT_PERTUSSIS_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PERTUSSIS_CASE_REPORT_PERTUSSIS_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PERTUSSIS_CASE_REPORT_PERTUSSIS_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pertussisCaseReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PertussisValidator.DIAGNOSTIC_SOURCE,
						 PertussisValidator.PERTUSSIS_CASE_REPORT__PERTUSSIS_CASE_REPORT_PERTUSSIS_CLINICAL_INFORMATION_SECTION,
						 PertussisPlugin.INSTANCE.getString("PertussisCaseReportPertussisClinicalInformationSection"),
						 new Object [] { pertussisCaseReport }));
			}
			 
			return false;
		}
		return true;
	}

		/**
	 * The cached OCL expression body for the '{@link #validatePertussisCaseReportPertussisTreatmentInformationSection(PertussisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Case Report Pertussis Treatment Information Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePertussisCaseReportPertussisTreatmentInformationSection(PertussisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PERTUSSIS_CASE_REPORT_PERTUSSIS_TREATMENT_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(pertussis::PertussisTreatmentInformationSection))";

		/**
	 * The cached OCL invariant for the '{@link #validatePertussisCaseReportPertussisTreatmentInformationSection(PertussisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Case Report Pertussis Treatment Information Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePertussisCaseReportPertussisTreatmentInformationSection(PertussisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PERTUSSIS_CASE_REPORT_PERTUSSIS_TREATMENT_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(pertussis::PertussisTreatmentInformationSection))
	 * @param pertussisCaseReport The receiving '<em><b>Case Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePertussisCaseReportPertussisTreatmentInformationSection(PertussisCaseReport pertussisCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PERTUSSIS_CASE_REPORT_PERTUSSIS_TREATMENT_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PertussisPackage.Literals.PERTUSSIS_CASE_REPORT);
			try {
				VALIDATE_PERTUSSIS_CASE_REPORT_PERTUSSIS_TREATMENT_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PERTUSSIS_CASE_REPORT_PERTUSSIS_TREATMENT_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PERTUSSIS_CASE_REPORT_PERTUSSIS_TREATMENT_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pertussisCaseReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 PertussisValidator.DIAGNOSTIC_SOURCE,
						 PertussisValidator.PERTUSSIS_CASE_REPORT__PERTUSSIS_CASE_REPORT_PERTUSSIS_TREATMENT_INFORMATION_SECTION,
						 PertussisPlugin.INSTANCE.getString("PertussisCaseReportPertussisTreatmentInformationSection"),
						 new Object [] { pertussisCaseReport }));
			}
			 
			return false;
		}
		return true;
	}

		/**
	 * The cached OCL expression body for the '{@link #validatePertussisCaseReportPertussisRelevantDxTestsSection(PertussisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Case Report Pertussis Relevant Dx Tests Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePertussisCaseReportPertussisRelevantDxTestsSection(PertussisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PERTUSSIS_CASE_REPORT_PERTUSSIS_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(pertussis::PertussisRelevantDxTestsSection))";

		/**
	 * The cached OCL invariant for the '{@link #validatePertussisCaseReportPertussisRelevantDxTestsSection(PertussisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Case Report Pertussis Relevant Dx Tests Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePertussisCaseReportPertussisRelevantDxTestsSection(PertussisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PERTUSSIS_CASE_REPORT_PERTUSSIS_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(pertussis::PertussisRelevantDxTestsSection))
	 * @param pertussisCaseReport The receiving '<em><b>Case Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePertussisCaseReportPertussisRelevantDxTestsSection(PertussisCaseReport pertussisCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PERTUSSIS_CASE_REPORT_PERTUSSIS_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PertussisPackage.Literals.PERTUSSIS_CASE_REPORT);
			try {
				VALIDATE_PERTUSSIS_CASE_REPORT_PERTUSSIS_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PERTUSSIS_CASE_REPORT_PERTUSSIS_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PERTUSSIS_CASE_REPORT_PERTUSSIS_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pertussisCaseReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 PertussisValidator.DIAGNOSTIC_SOURCE,
						 PertussisValidator.PERTUSSIS_CASE_REPORT__PERTUSSIS_CASE_REPORT_PERTUSSIS_RELEVANT_DX_TESTS_SECTION,
						 PertussisPlugin.INSTANCE.getString("PertussisCaseReportPertussisRelevantDxTestsSection"),
						 new Object [] { pertussisCaseReport }));
			}
			 
			return false;
		}
		return true;
	}

		/**
	 * The cached OCL expression body for the '{@link #validatePertussisCaseReportPertussisImmunizationsSection(PertussisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Case Report Pertussis Immunizations Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePertussisCaseReportPertussisImmunizationsSection(PertussisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PERTUSSIS_CASE_REPORT_PERTUSSIS_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(pertussis::PertussisImmunizationsSection))";

		/**
	 * The cached OCL invariant for the '{@link #validatePertussisCaseReportPertussisImmunizationsSection(PertussisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Case Report Pertussis Immunizations Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePertussisCaseReportPertussisImmunizationsSection(PertussisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PERTUSSIS_CASE_REPORT_PERTUSSIS_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(pertussis::PertussisImmunizationsSection))
	 * @param pertussisCaseReport The receiving '<em><b>Case Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePertussisCaseReportPertussisImmunizationsSection(PertussisCaseReport pertussisCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PERTUSSIS_CASE_REPORT_PERTUSSIS_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PertussisPackage.Literals.PERTUSSIS_CASE_REPORT);
			try {
				VALIDATE_PERTUSSIS_CASE_REPORT_PERTUSSIS_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PERTUSSIS_CASE_REPORT_PERTUSSIS_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PERTUSSIS_CASE_REPORT_PERTUSSIS_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pertussisCaseReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 PertussisValidator.DIAGNOSTIC_SOURCE,
						 PertussisValidator.PERTUSSIS_CASE_REPORT__PERTUSSIS_CASE_REPORT_PERTUSSIS_IMMUNIZATIONS_SECTION,
						 PertussisPlugin.INSTANCE.getString("PertussisCaseReportPertussisImmunizationsSection"),
						 new Object [] { pertussisCaseReport }));
			}
			 
			return false;
		}
		return true;
	}

		/**
	 * The cached OCL expression body for the '{@link #getPertussisSocialHistorySection(PertussisCaseReport) <em>Get Pertussis Social History Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPertussisSocialHistorySection(PertussisCaseReport)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_PERTUSSIS_SOCIAL_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(pertussis::PertussisSocialHistorySection))->asSequence()->any(true).oclAsType(pertussis::PertussisSocialHistorySection)";

  /**
	 * The cached OCL query for the '{@link #getPertussisSocialHistorySection(PertussisCaseReport) <em>Get Pertussis Social History Section</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPertussisSocialHistorySection(PertussisCaseReport)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_PERTUSSIS_SOCIAL_HISTORY_SECTION__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(pertussis::PertussisSocialHistorySection))->asSequence()->any(true).oclAsType(pertussis::PertussisSocialHistorySection)
	 * @param pertussisCaseReport The receiving '<em><b>Case Report</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  PertussisSocialHistorySection getPertussisSocialHistorySection(PertussisCaseReport pertussisCaseReport)
  {
		if (GET_PERTUSSIS_SOCIAL_HISTORY_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(PertussisPackage.Literals.PERTUSSIS_CASE_REPORT, PertussisPackage.Literals.PERTUSSIS_CASE_REPORT.getEAllOperations().get(65));
			try {
				GET_PERTUSSIS_SOCIAL_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_PERTUSSIS_SOCIAL_HISTORY_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PERTUSSIS_SOCIAL_HISTORY_SECTION__EOCL_QRY);
		return (PertussisSocialHistorySection) query.evaluate(pertussisCaseReport);
	}

  /**
	 * The cached OCL expression body for the '{@link #getPertussisClinicalInformationSection(PertussisCaseReport) <em>Get Pertussis Clinical Information Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPertussisClinicalInformationSection(PertussisCaseReport)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PERTUSSIS_CLINICAL_INFORMATION_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(pertussis::PertussisClinicalInformationSection))->asSequence()->any(true).oclAsType(pertussis::PertussisClinicalInformationSection)";

		/**
	 * The cached OCL query for the '{@link #getPertussisClinicalInformationSection(PertussisCaseReport) <em>Get Pertussis Clinical Information Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPertussisClinicalInformationSection(PertussisCaseReport)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PERTUSSIS_CLINICAL_INFORMATION_SECTION__EOCL_QRY;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(pertussis::PertussisClinicalInformationSection))->asSequence()->any(true).oclAsType(pertussis::PertussisClinicalInformationSection)
	 * @param pertussisCaseReport The receiving '<em><b>Case Report</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  PertussisClinicalInformationSection getPertussisClinicalInformationSection(PertussisCaseReport pertussisCaseReport) {
		if (GET_PERTUSSIS_CLINICAL_INFORMATION_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(PertussisPackage.Literals.PERTUSSIS_CASE_REPORT, PertussisPackage.Literals.PERTUSSIS_CASE_REPORT.getEAllOperations().get(66));
			try {
				GET_PERTUSSIS_CLINICAL_INFORMATION_SECTION__EOCL_QRY = helper.createQuery(GET_PERTUSSIS_CLINICAL_INFORMATION_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PERTUSSIS_CLINICAL_INFORMATION_SECTION__EOCL_QRY);
		return (PertussisClinicalInformationSection) query.evaluate(pertussisCaseReport);
	}

		/**
	 * The cached OCL expression body for the '{@link #getPertussisTreatmentInformationSection(PertussisCaseReport) <em>Get Pertussis Treatment Information Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPertussisTreatmentInformationSection(PertussisCaseReport)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PERTUSSIS_TREATMENT_INFORMATION_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(pertussis::PertussisTreatmentInformationSection))->asSequence()->any(true).oclAsType(pertussis::PertussisTreatmentInformationSection)";

		/**
	 * The cached OCL query for the '{@link #getPertussisTreatmentInformationSection(PertussisCaseReport) <em>Get Pertussis Treatment Information Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPertussisTreatmentInformationSection(PertussisCaseReport)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PERTUSSIS_TREATMENT_INFORMATION_SECTION__EOCL_QRY;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(pertussis::PertussisTreatmentInformationSection))->asSequence()->any(true).oclAsType(pertussis::PertussisTreatmentInformationSection)
	 * @param pertussisCaseReport The receiving '<em><b>Case Report</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  PertussisTreatmentInformationSection getPertussisTreatmentInformationSection(PertussisCaseReport pertussisCaseReport) {
		if (GET_PERTUSSIS_TREATMENT_INFORMATION_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(PertussisPackage.Literals.PERTUSSIS_CASE_REPORT, PertussisPackage.Literals.PERTUSSIS_CASE_REPORT.getEAllOperations().get(67));
			try {
				GET_PERTUSSIS_TREATMENT_INFORMATION_SECTION__EOCL_QRY = helper.createQuery(GET_PERTUSSIS_TREATMENT_INFORMATION_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PERTUSSIS_TREATMENT_INFORMATION_SECTION__EOCL_QRY);
		return (PertussisTreatmentInformationSection) query.evaluate(pertussisCaseReport);
	}

		/**
	 * The cached OCL expression body for the '{@link #getPertussisRelevantDxTestsSection(PertussisCaseReport) <em>Get Pertussis Relevant Dx Tests Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPertussisRelevantDxTestsSection(PertussisCaseReport)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PERTUSSIS_RELEVANT_DX_TESTS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(pertussis::PertussisRelevantDxTestsSection))->asSequence()->any(true).oclAsType(pertussis::PertussisRelevantDxTestsSection)";

		/**
	 * The cached OCL query for the '{@link #getPertussisRelevantDxTestsSection(PertussisCaseReport) <em>Get Pertussis Relevant Dx Tests Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPertussisRelevantDxTestsSection(PertussisCaseReport)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PERTUSSIS_RELEVANT_DX_TESTS_SECTION__EOCL_QRY;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(pertussis::PertussisRelevantDxTestsSection))->asSequence()->any(true).oclAsType(pertussis::PertussisRelevantDxTestsSection)
	 * @param pertussisCaseReport The receiving '<em><b>Case Report</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  PertussisRelevantDxTestsSection getPertussisRelevantDxTestsSection(PertussisCaseReport pertussisCaseReport) {
		if (GET_PERTUSSIS_RELEVANT_DX_TESTS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(PertussisPackage.Literals.PERTUSSIS_CASE_REPORT, PertussisPackage.Literals.PERTUSSIS_CASE_REPORT.getEAllOperations().get(68));
			try {
				GET_PERTUSSIS_RELEVANT_DX_TESTS_SECTION__EOCL_QRY = helper.createQuery(GET_PERTUSSIS_RELEVANT_DX_TESTS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PERTUSSIS_RELEVANT_DX_TESTS_SECTION__EOCL_QRY);
		return (PertussisRelevantDxTestsSection) query.evaluate(pertussisCaseReport);
	}

		/**
	 * The cached OCL expression body for the '{@link #getPertussisImmunizationsSection(PertussisCaseReport) <em>Get Pertussis Immunizations Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPertussisImmunizationsSection(PertussisCaseReport)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PERTUSSIS_IMMUNIZATIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(pertussis::PertussisImmunizationsSection))->asSequence()->any(true).oclAsType(pertussis::PertussisImmunizationsSection)";

		/**
	 * The cached OCL query for the '{@link #getPertussisImmunizationsSection(PertussisCaseReport) <em>Get Pertussis Immunizations Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPertussisImmunizationsSection(PertussisCaseReport)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PERTUSSIS_IMMUNIZATIONS_SECTION__EOCL_QRY;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(pertussis::PertussisImmunizationsSection))->asSequence()->any(true).oclAsType(pertussis::PertussisImmunizationsSection)
	 * @param pertussisCaseReport The receiving '<em><b>Case Report</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  PertussisImmunizationsSection getPertussisImmunizationsSection(PertussisCaseReport pertussisCaseReport) {
		if (GET_PERTUSSIS_IMMUNIZATIONS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(PertussisPackage.Literals.PERTUSSIS_CASE_REPORT, PertussisPackage.Literals.PERTUSSIS_CASE_REPORT.getEAllOperations().get(69));
			try {
				GET_PERTUSSIS_IMMUNIZATIONS_SECTION__EOCL_QRY = helper.createQuery(GET_PERTUSSIS_IMMUNIZATIONS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PERTUSSIS_IMMUNIZATIONS_SECTION__EOCL_QRY);
		return (PertussisImmunizationsSection) query.evaluate(pertussisCaseReport);
	}

		/**
	 * The cached OCL expression body for the '{@link #validatePublicHealthCaseReportTemplateId(PertussisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validatePublicHealthCaseReportTemplateId(PertussisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.1.5')";

  /**
	 * The cached OCL invariant for the '{@link #validatePublicHealthCaseReportTemplateId(PertussisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validatePublicHealthCaseReportTemplateId(PertussisCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static Constraint VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.1.5')
	 * @param pertussisCaseReport The receiving '<em><b>Case Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  boolean validatePublicHealthCaseReportTemplateId(PertussisCaseReport pertussisCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PertussisPackage.Literals.PERTUSSIS_CASE_REPORT);
			try {
				VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pertussisCaseReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PertussisValidator.DIAGNOSTIC_SOURCE,
						 PertussisValidator.PERTUSSIS_CASE_REPORT__PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PublicHealthCaseReportTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pertussisCaseReport, context) }),
						 new Object [] { pertussisCaseReport }));
			}
			 
			return false;
		}
		return true;
	}

} // PertussisCaseReportOperations