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
package org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPHCRRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPHCRTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPublicHealthCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.util.ChlamydiatrachomatisValidator;
import org.openhealthtools.mdht.uml.cda.phcr.operations.PublicHealthCaseReportOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Public Health Case Report</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPublicHealthCaseReport#validateChlamydiatrachomatisPublicHealthCaseReportTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chlamydiatrachomatis Public Health Case Report Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPublicHealthCaseReport#validateChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRClinicalInformationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chlamydiatrachomatis Public Health Case Report Chlamydiatrachomatis PHCR Clinical Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPublicHealthCaseReport#validateChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRRelevantDxTestsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chlamydiatrachomatis Public Health Case Report Chlamydiatrachomatis PHCR Relevant Dx Tests Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPublicHealthCaseReport#validateChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRTreatmentInformationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chlamydiatrachomatis Public Health Case Report Chlamydiatrachomatis PHCR Treatment Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPublicHealthCaseReport#getChlamydiatrachomatisPHCRClinicalInformationSection() <em>Get Chlamydiatrachomatis PHCR Clinical Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPublicHealthCaseReport#getChlamydiatrachomatisPHCRRelevantDxTestsSection() <em>Get Chlamydiatrachomatis PHCR Relevant Dx Tests Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPublicHealthCaseReport#getChlamydiatrachomatisPHCRTreatmentInformationSection() <em>Get Chlamydiatrachomatis PHCR Treatment Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPublicHealthCaseReport#validatePublicHealthCaseReportTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChlamydiatrachomatisPublicHealthCaseReportOperations extends PublicHealthCaseReportOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChlamydiatrachomatisPublicHealthCaseReportOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChlamydiatrachomatisPublicHealthCaseReportTitle(ChlamydiatrachomatisPublicHealthCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chlamydiatrachomatis Public Health Case Report Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChlamydiatrachomatisPublicHealthCaseReportTitle(ChlamydiatrachomatisPublicHealthCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'Public Health Case Report - Chlamydia trachomatis')";

	/**
	 * The cached OCL invariant for the '{@link #validateChlamydiatrachomatisPublicHealthCaseReportTitle(ChlamydiatrachomatisPublicHealthCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chlamydiatrachomatis Public Health Case Report Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChlamydiatrachomatisPublicHealthCaseReportTitle(ChlamydiatrachomatisPublicHealthCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'Public Health Case Report - Chlamydia trachomatis')
	 * @param chlamydiatrachomatisPublicHealthCaseReport The receiving '<em><b>Public Health Case Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateChlamydiatrachomatisPublicHealthCaseReportTitle(ChlamydiatrachomatisPublicHealthCaseReport chlamydiatrachomatisPublicHealthCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ChlamydiatrachomatisPackage.Literals.CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT);
			try {
				VALIDATE_CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(chlamydiatrachomatisPublicHealthCaseReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ChlamydiatrachomatisValidator.DIAGNOSTIC_SOURCE,
						 ChlamydiatrachomatisValidator.CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT__CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT_TITLE,
						 ChlamydiatrachomatisPlugin.INSTANCE.getString("ChlamydiatrachomatisPublicHealthCaseReportTitle"),
						 new Object [] { chlamydiatrachomatisPublicHealthCaseReport }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRClinicalInformationSection(ChlamydiatrachomatisPublicHealthCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chlamydiatrachomatis Public Health Case Report Chlamydiatrachomatis PHCR Clinical Information Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRClinicalInformationSection(ChlamydiatrachomatisPublicHealthCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT_CHLAMYDIATRACHOMATIS_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(chlamydiatrachomatis::ChlamydiatrachomatisPHCRClinicalInformationSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRClinicalInformationSection(ChlamydiatrachomatisPublicHealthCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chlamydiatrachomatis Public Health Case Report Chlamydiatrachomatis PHCR Clinical Information Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRClinicalInformationSection(ChlamydiatrachomatisPublicHealthCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT_CHLAMYDIATRACHOMATIS_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(chlamydiatrachomatis::ChlamydiatrachomatisPHCRClinicalInformationSection))
	 * @param chlamydiatrachomatisPublicHealthCaseReport The receiving '<em><b>Public Health Case Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRClinicalInformationSection(ChlamydiatrachomatisPublicHealthCaseReport chlamydiatrachomatisPublicHealthCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT_CHLAMYDIATRACHOMATIS_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ChlamydiatrachomatisPackage.Literals.CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT);
			try {
				VALIDATE_CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT_CHLAMYDIATRACHOMATIS_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT_CHLAMYDIATRACHOMATIS_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT_CHLAMYDIATRACHOMATIS_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(chlamydiatrachomatisPublicHealthCaseReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ChlamydiatrachomatisValidator.DIAGNOSTIC_SOURCE,
						 ChlamydiatrachomatisValidator.CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT__CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT_CHLAMYDIATRACHOMATIS_PHCR_CLINICAL_INFORMATION_SECTION,
						 ChlamydiatrachomatisPlugin.INSTANCE.getString("ChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRClinicalInformationSection"),
						 new Object [] { chlamydiatrachomatisPublicHealthCaseReport }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRRelevantDxTestsSection(ChlamydiatrachomatisPublicHealthCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chlamydiatrachomatis Public Health Case Report Chlamydiatrachomatis PHCR Relevant Dx Tests Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRRelevantDxTestsSection(ChlamydiatrachomatisPublicHealthCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT_CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(chlamydiatrachomatis::ChlamydiatrachomatisPHCRRelevantDxTestsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRRelevantDxTestsSection(ChlamydiatrachomatisPublicHealthCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chlamydiatrachomatis Public Health Case Report Chlamydiatrachomatis PHCR Relevant Dx Tests Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRRelevantDxTestsSection(ChlamydiatrachomatisPublicHealthCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT_CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(chlamydiatrachomatis::ChlamydiatrachomatisPHCRRelevantDxTestsSection))
	 * @param chlamydiatrachomatisPublicHealthCaseReport The receiving '<em><b>Public Health Case Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRRelevantDxTestsSection(ChlamydiatrachomatisPublicHealthCaseReport chlamydiatrachomatisPublicHealthCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT_CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ChlamydiatrachomatisPackage.Literals.CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT);
			try {
				VALIDATE_CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT_CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT_CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT_CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(chlamydiatrachomatisPublicHealthCaseReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ChlamydiatrachomatisValidator.DIAGNOSTIC_SOURCE,
						 ChlamydiatrachomatisValidator.CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT__CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT_CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION,
						 ChlamydiatrachomatisPlugin.INSTANCE.getString("ChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRRelevantDxTestsSection"),
						 new Object [] { chlamydiatrachomatisPublicHealthCaseReport }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRTreatmentInformationSection(ChlamydiatrachomatisPublicHealthCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chlamydiatrachomatis Public Health Case Report Chlamydiatrachomatis PHCR Treatment Information Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRTreatmentInformationSection(ChlamydiatrachomatisPublicHealthCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT_CHLAMYDIATRACHOMATIS_PHCR_TREATMENT_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(chlamydiatrachomatis::ChlamydiatrachomatisPHCRTreatmentInformationSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRTreatmentInformationSection(ChlamydiatrachomatisPublicHealthCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chlamydiatrachomatis Public Health Case Report Chlamydiatrachomatis PHCR Treatment Information Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRTreatmentInformationSection(ChlamydiatrachomatisPublicHealthCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT_CHLAMYDIATRACHOMATIS_PHCR_TREATMENT_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(chlamydiatrachomatis::ChlamydiatrachomatisPHCRTreatmentInformationSection))
	 * @param chlamydiatrachomatisPublicHealthCaseReport The receiving '<em><b>Public Health Case Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRTreatmentInformationSection(ChlamydiatrachomatisPublicHealthCaseReport chlamydiatrachomatisPublicHealthCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT_CHLAMYDIATRACHOMATIS_PHCR_TREATMENT_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ChlamydiatrachomatisPackage.Literals.CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT);
			try {
				VALIDATE_CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT_CHLAMYDIATRACHOMATIS_PHCR_TREATMENT_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT_CHLAMYDIATRACHOMATIS_PHCR_TREATMENT_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT_CHLAMYDIATRACHOMATIS_PHCR_TREATMENT_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(chlamydiatrachomatisPublicHealthCaseReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ChlamydiatrachomatisValidator.DIAGNOSTIC_SOURCE,
						 ChlamydiatrachomatisValidator.CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT__CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT_CHLAMYDIATRACHOMATIS_PHCR_TREATMENT_INFORMATION_SECTION,
						 ChlamydiatrachomatisPlugin.INSTANCE.getString("ChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRTreatmentInformationSection"),
						 new Object [] { chlamydiatrachomatisPublicHealthCaseReport }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getChlamydiatrachomatisPHCRClinicalInformationSection(ChlamydiatrachomatisPublicHealthCaseReport) <em>Get Chlamydiatrachomatis PHCR Clinical Information Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChlamydiatrachomatisPHCRClinicalInformationSection(ChlamydiatrachomatisPublicHealthCaseReport)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CHLAMYDIATRACHOMATIS_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(chlamydiatrachomatis::ChlamydiatrachomatisPHCRClinicalInformationSection))->asSequence()->first().oclAsType(chlamydiatrachomatis::ChlamydiatrachomatisPHCRClinicalInformationSection)";

	/**
	 * The cached OCL query for the '{@link #getChlamydiatrachomatisPHCRClinicalInformationSection(ChlamydiatrachomatisPublicHealthCaseReport) <em>Get Chlamydiatrachomatis PHCR Clinical Information Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChlamydiatrachomatisPHCRClinicalInformationSection(ChlamydiatrachomatisPublicHealthCaseReport)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CHLAMYDIATRACHOMATIS_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(chlamydiatrachomatis::ChlamydiatrachomatisPHCRClinicalInformationSection))->asSequence()->first().oclAsType(chlamydiatrachomatis::ChlamydiatrachomatisPHCRClinicalInformationSection)
	 * @param chlamydiatrachomatisPublicHealthCaseReport The receiving '<em><b>Public Health Case Report</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  ChlamydiatrachomatisPHCRClinicalInformationSection getChlamydiatrachomatisPHCRClinicalInformationSection(ChlamydiatrachomatisPublicHealthCaseReport chlamydiatrachomatisPublicHealthCaseReport) {
		if (GET_CHLAMYDIATRACHOMATIS_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ChlamydiatrachomatisPackage.Literals.CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT, ChlamydiatrachomatisPackage.Literals.CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT.getEAllOperations().get(63));
			try {
				GET_CHLAMYDIATRACHOMATIS_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_QRY = helper.createQuery(GET_CHLAMYDIATRACHOMATIS_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CHLAMYDIATRACHOMATIS_PHCR_CLINICAL_INFORMATION_SECTION__EOCL_QRY);
		return (ChlamydiatrachomatisPHCRClinicalInformationSection) query.evaluate(chlamydiatrachomatisPublicHealthCaseReport);
	}

	/**
	 * The cached OCL expression body for the '{@link #getChlamydiatrachomatisPHCRRelevantDxTestsSection(ChlamydiatrachomatisPublicHealthCaseReport) <em>Get Chlamydiatrachomatis PHCR Relevant Dx Tests Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChlamydiatrachomatisPHCRRelevantDxTestsSection(ChlamydiatrachomatisPublicHealthCaseReport)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(chlamydiatrachomatis::ChlamydiatrachomatisPHCRRelevantDxTestsSection))->asSequence()->first().oclAsType(chlamydiatrachomatis::ChlamydiatrachomatisPHCRRelevantDxTestsSection)";

	/**
	 * The cached OCL query for the '{@link #getChlamydiatrachomatisPHCRRelevantDxTestsSection(ChlamydiatrachomatisPublicHealthCaseReport) <em>Get Chlamydiatrachomatis PHCR Relevant Dx Tests Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChlamydiatrachomatisPHCRRelevantDxTestsSection(ChlamydiatrachomatisPublicHealthCaseReport)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(chlamydiatrachomatis::ChlamydiatrachomatisPHCRRelevantDxTestsSection))->asSequence()->first().oclAsType(chlamydiatrachomatis::ChlamydiatrachomatisPHCRRelevantDxTestsSection)
	 * @param chlamydiatrachomatisPublicHealthCaseReport The receiving '<em><b>Public Health Case Report</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  ChlamydiatrachomatisPHCRRelevantDxTestsSection getChlamydiatrachomatisPHCRRelevantDxTestsSection(ChlamydiatrachomatisPublicHealthCaseReport chlamydiatrachomatisPublicHealthCaseReport) {
		if (GET_CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ChlamydiatrachomatisPackage.Literals.CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT, ChlamydiatrachomatisPackage.Literals.CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT.getEAllOperations().get(64));
			try {
				GET_CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION__EOCL_QRY = helper.createQuery(GET_CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION__EOCL_QRY);
		return (ChlamydiatrachomatisPHCRRelevantDxTestsSection) query.evaluate(chlamydiatrachomatisPublicHealthCaseReport);
	}

	/**
	 * The cached OCL expression body for the '{@link #getChlamydiatrachomatisPHCRTreatmentInformationSection(ChlamydiatrachomatisPublicHealthCaseReport) <em>Get Chlamydiatrachomatis PHCR Treatment Information Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChlamydiatrachomatisPHCRTreatmentInformationSection(ChlamydiatrachomatisPublicHealthCaseReport)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CHLAMYDIATRACHOMATIS_PHCR_TREATMENT_INFORMATION_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(chlamydiatrachomatis::ChlamydiatrachomatisPHCRTreatmentInformationSection))->asSequence()->first().oclAsType(chlamydiatrachomatis::ChlamydiatrachomatisPHCRTreatmentInformationSection)";

	/**
	 * The cached OCL query for the '{@link #getChlamydiatrachomatisPHCRTreatmentInformationSection(ChlamydiatrachomatisPublicHealthCaseReport) <em>Get Chlamydiatrachomatis PHCR Treatment Information Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChlamydiatrachomatisPHCRTreatmentInformationSection(ChlamydiatrachomatisPublicHealthCaseReport)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CHLAMYDIATRACHOMATIS_PHCR_TREATMENT_INFORMATION_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(chlamydiatrachomatis::ChlamydiatrachomatisPHCRTreatmentInformationSection))->asSequence()->first().oclAsType(chlamydiatrachomatis::ChlamydiatrachomatisPHCRTreatmentInformationSection)
	 * @param chlamydiatrachomatisPublicHealthCaseReport The receiving '<em><b>Public Health Case Report</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  ChlamydiatrachomatisPHCRTreatmentInformationSection getChlamydiatrachomatisPHCRTreatmentInformationSection(ChlamydiatrachomatisPublicHealthCaseReport chlamydiatrachomatisPublicHealthCaseReport) {
		if (GET_CHLAMYDIATRACHOMATIS_PHCR_TREATMENT_INFORMATION_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ChlamydiatrachomatisPackage.Literals.CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT, ChlamydiatrachomatisPackage.Literals.CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT.getEAllOperations().get(65));
			try {
				GET_CHLAMYDIATRACHOMATIS_PHCR_TREATMENT_INFORMATION_SECTION__EOCL_QRY = helper.createQuery(GET_CHLAMYDIATRACHOMATIS_PHCR_TREATMENT_INFORMATION_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CHLAMYDIATRACHOMATIS_PHCR_TREATMENT_INFORMATION_SECTION__EOCL_QRY);
		return (ChlamydiatrachomatisPHCRTreatmentInformationSection) query.evaluate(chlamydiatrachomatisPublicHealthCaseReport);
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePublicHealthCaseReportTemplateId(ChlamydiatrachomatisPublicHealthCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePublicHealthCaseReportTemplateId(ChlamydiatrachomatisPublicHealthCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.1.13')";

	/**
	 * The cached OCL invariant for the '{@link #validatePublicHealthCaseReportTemplateId(ChlamydiatrachomatisPublicHealthCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePublicHealthCaseReportTemplateId(ChlamydiatrachomatisPublicHealthCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.1.13')
	 * @param chlamydiatrachomatisPublicHealthCaseReport The receiving '<em><b>Public Health Case Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePublicHealthCaseReportTemplateId(ChlamydiatrachomatisPublicHealthCaseReport chlamydiatrachomatisPublicHealthCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ChlamydiatrachomatisPackage.Literals.CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT);
			try {
				VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(chlamydiatrachomatisPublicHealthCaseReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ChlamydiatrachomatisValidator.DIAGNOSTIC_SOURCE,
						 ChlamydiatrachomatisValidator.CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT__PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PublicHealthCaseReportTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(chlamydiatrachomatisPublicHealthCaseReport, context) }),
						 new Object [] { chlamydiatrachomatisPublicHealthCaseReport }));
			}
			 
			return false;
		}
		return true;
	}

} // ChlamydiatrachomatisPublicHealthCaseReportOperations