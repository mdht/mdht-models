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
package org.openhealthtools.mdht.uml.cda.phcr.hepb.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBImmunizationSection;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.HepbPackage;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.HepbPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.util.HepbValidator;
import org.openhealthtools.mdht.uml.cda.phcr.operations.PublicHealthCaseReportOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Acute Hepatitis BCase Report</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBCaseReport#validateAcuteHepatitisBCaseReportTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BCase Report Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBCaseReport#validateAcuteHepatitisBCaseReportAcuteHepatitisBSocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BCase Report Acute Hepatitis BSocial History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBCaseReport#validateAcuteHepatitisBCaseReportAcuteHepatitisBPHCRClinicalInformationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BCase Report Acute Hepatitis BPHCR Clinical Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBCaseReport#validateAcuteHepatitisBCaseReportAcuteHepatitisBImmunizationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BCase Report Acute Hepatitis BImmunization Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBCaseReport#validateAcuteHepatitisBCaseReportAcuteHepatitisBPHCRTreatmentInformationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BCase Report Acute Hepatitis BPHCR Treatment Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBCaseReport#validateAcuteHepatitisBCaseReportAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BCase Report Acute Hepatitis BPHCR Relevant Diagnostic Tests And Or Laboratory Data Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBCaseReport#getAcuteHepatitisBSocialHistorySection() <em>Get Acute Hepatitis BSocial History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBCaseReport#getAcuteHepatitisBPHCRClinicalInformationSection() <em>Get Acute Hepatitis BPHCR Clinical Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBCaseReport#getAcuteHepatitisBImmunizationSection() <em>Get Acute Hepatitis BImmunization Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBCaseReport#getAcuteHepatitisBPHCRTreatmentInformationSection() <em>Get Acute Hepatitis BPHCR Treatment Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBCaseReport#getAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection() <em>Get Acute Hepatitis BPHCR Relevant Diagnostic Tests And Or Laboratory Data Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBCaseReport#validatePublicHealthCaseReportTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AcuteHepatitisBCaseReportOperations extends PublicHealthCaseReportOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcuteHepatitisBCaseReportOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAcuteHepatitisBCaseReportTitle(AcuteHepatitisBCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BCase Report Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAcuteHepatitisBCaseReportTitle(AcuteHepatitisBCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ACUTE_HEPATITIS_BCASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'Public Health Case Report - Acute Hepatitis B')";

	/**
	 * The cached OCL invariant for the '{@link #validateAcuteHepatitisBCaseReportTitle(AcuteHepatitisBCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BCase Report Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAcuteHepatitisBCaseReportTitle(AcuteHepatitisBCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ACUTE_HEPATITIS_BCASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'Public Health Case Report - Acute Hepatitis B')
	 * @param acuteHepatitisBCaseReport The receiving '<em><b>Acute Hepatitis BCase Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAcuteHepatitisBCaseReportTitle(AcuteHepatitisBCaseReport acuteHepatitisBCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ACUTE_HEPATITIS_BCASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HepbPackage.Literals.ACUTE_HEPATITIS_BCASE_REPORT);
			try {
				VALIDATE_ACUTE_HEPATITIS_BCASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ACUTE_HEPATITIS_BCASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ACUTE_HEPATITIS_BCASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(acuteHepatitisBCaseReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HepbValidator.DIAGNOSTIC_SOURCE,
						 HepbValidator.ACUTE_HEPATITIS_BCASE_REPORT__ACUTE_HEPATITIS_BCASE_REPORT_TITLE,
						 HepbPlugin.INSTANCE.getString("AcuteHepatitisBCaseReportTitle"),
						 new Object [] { acuteHepatitisBCaseReport }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAcuteHepatitisBCaseReportAcuteHepatitisBSocialHistorySection(AcuteHepatitisBCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BCase Report Acute Hepatitis BSocial History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAcuteHepatitisBCaseReportAcuteHepatitisBSocialHistorySection(AcuteHepatitisBCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ACUTE_HEPATITIS_BCASE_REPORT_ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hepb::AcuteHepatitisBSocialHistorySection))";

	/**
	 * The cached OCL invariant for the '{@link #validateAcuteHepatitisBCaseReportAcuteHepatitisBSocialHistorySection(AcuteHepatitisBCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BCase Report Acute Hepatitis BSocial History Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAcuteHepatitisBCaseReportAcuteHepatitisBSocialHistorySection(AcuteHepatitisBCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ACUTE_HEPATITIS_BCASE_REPORT_ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hepb::AcuteHepatitisBSocialHistorySection))
	 * @param acuteHepatitisBCaseReport The receiving '<em><b>Acute Hepatitis BCase Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAcuteHepatitisBCaseReportAcuteHepatitisBSocialHistorySection(AcuteHepatitisBCaseReport acuteHepatitisBCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ACUTE_HEPATITIS_BCASE_REPORT_ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HepbPackage.Literals.ACUTE_HEPATITIS_BCASE_REPORT);
			try {
				VALIDATE_ACUTE_HEPATITIS_BCASE_REPORT_ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ACUTE_HEPATITIS_BCASE_REPORT_ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ACUTE_HEPATITIS_BCASE_REPORT_ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(acuteHepatitisBCaseReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 HepbValidator.DIAGNOSTIC_SOURCE,
						 HepbValidator.ACUTE_HEPATITIS_BCASE_REPORT__ACUTE_HEPATITIS_BCASE_REPORT_ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION,
						 HepbPlugin.INSTANCE.getString("AcuteHepatitisBCaseReportAcuteHepatitisBSocialHistorySection"),
						 new Object [] { acuteHepatitisBCaseReport }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hepb::AcuteHepatitisBImmunizationSection))
	 * @param acuteHepatitisBCaseReport The receiving '<em><b>Acute Hepatitis BCase Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAcuteHepatitisBCaseReportAcuteHepatitisBImmunizationSection(AcuteHepatitisBCaseReport acuteHepatitisBCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ACUTE_HEPATITIS_BCASE_REPORT_ACUTE_HEPATITIS_BIMMUNIZATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HepbPackage.Literals.ACUTE_HEPATITIS_BCASE_REPORT);
			try {
				VALIDATE_ACUTE_HEPATITIS_BCASE_REPORT_ACUTE_HEPATITIS_BIMMUNIZATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ACUTE_HEPATITIS_BCASE_REPORT_ACUTE_HEPATITIS_BIMMUNIZATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ACUTE_HEPATITIS_BCASE_REPORT_ACUTE_HEPATITIS_BIMMUNIZATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(acuteHepatitisBCaseReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 HepbValidator.DIAGNOSTIC_SOURCE,
						 HepbValidator.ACUTE_HEPATITIS_BCASE_REPORT__ACUTE_HEPATITIS_BCASE_REPORT_ACUTE_HEPATITIS_BIMMUNIZATION_SECTION,
						 HepbPlugin.INSTANCE.getString("AcuteHepatitisBCaseReportAcuteHepatitisBImmunizationSection"),
						 new Object [] { acuteHepatitisBCaseReport }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAcuteHepatitisBCaseReportAcuteHepatitisBPHCRClinicalInformationSection(AcuteHepatitisBCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BCase Report Acute Hepatitis BPHCR Clinical Information Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAcuteHepatitisBCaseReportAcuteHepatitisBPHCRClinicalInformationSection(AcuteHepatitisBCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ACUTE_HEPATITIS_BCASE_REPORT_ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hepb::AcuteHepatitisBPHCRClinicalInformationSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateAcuteHepatitisBCaseReportAcuteHepatitisBPHCRClinicalInformationSection(AcuteHepatitisBCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BCase Report Acute Hepatitis BPHCR Clinical Information Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAcuteHepatitisBCaseReportAcuteHepatitisBPHCRClinicalInformationSection(AcuteHepatitisBCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ACUTE_HEPATITIS_BCASE_REPORT_ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * The cached OCL expression body for the '{@link #validateAcuteHepatitisBCaseReportAcuteHepatitisBImmunizationSection(AcuteHepatitisBCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BCase Report Acute Hepatitis BImmunization Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAcuteHepatitisBCaseReportAcuteHepatitisBImmunizationSection(AcuteHepatitisBCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ACUTE_HEPATITIS_BCASE_REPORT_ACUTE_HEPATITIS_BIMMUNIZATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hepb::AcuteHepatitisBImmunizationSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateAcuteHepatitisBCaseReportAcuteHepatitisBImmunizationSection(AcuteHepatitisBCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BCase Report Acute Hepatitis BImmunization Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAcuteHepatitisBCaseReportAcuteHepatitisBImmunizationSection(AcuteHepatitisBCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ACUTE_HEPATITIS_BCASE_REPORT_ACUTE_HEPATITIS_BIMMUNIZATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hepb::AcuteHepatitisBPHCRClinicalInformationSection))
	 * @param acuteHepatitisBCaseReport The receiving '<em><b>Acute Hepatitis BCase Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAcuteHepatitisBCaseReportAcuteHepatitisBPHCRClinicalInformationSection(AcuteHepatitisBCaseReport acuteHepatitisBCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ACUTE_HEPATITIS_BCASE_REPORT_ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HepbPackage.Literals.ACUTE_HEPATITIS_BCASE_REPORT);
			try {
				VALIDATE_ACUTE_HEPATITIS_BCASE_REPORT_ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ACUTE_HEPATITIS_BCASE_REPORT_ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ACUTE_HEPATITIS_BCASE_REPORT_ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(acuteHepatitisBCaseReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HepbValidator.DIAGNOSTIC_SOURCE,
						 HepbValidator.ACUTE_HEPATITIS_BCASE_REPORT__ACUTE_HEPATITIS_BCASE_REPORT_ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION,
						 HepbPlugin.INSTANCE.getString("AcuteHepatitisBCaseReportAcuteHepatitisBPHCRClinicalInformationSection"),
						 new Object [] { acuteHepatitisBCaseReport }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAcuteHepatitisBCaseReportAcuteHepatitisBPHCRTreatmentInformationSection(AcuteHepatitisBCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BCase Report Acute Hepatitis BPHCR Treatment Information Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAcuteHepatitisBCaseReportAcuteHepatitisBPHCRTreatmentInformationSection(AcuteHepatitisBCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ACUTE_HEPATITIS_BCASE_REPORT_ACUTE_HEPATITIS_BPHCR_TREATMENT_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hepb::AcuteHepatitisBPHCRTreatmentInformationSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateAcuteHepatitisBCaseReportAcuteHepatitisBPHCRTreatmentInformationSection(AcuteHepatitisBCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BCase Report Acute Hepatitis BPHCR Treatment Information Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAcuteHepatitisBCaseReportAcuteHepatitisBPHCRTreatmentInformationSection(AcuteHepatitisBCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ACUTE_HEPATITIS_BCASE_REPORT_ACUTE_HEPATITIS_BPHCR_TREATMENT_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hepb::AcuteHepatitisBPHCRTreatmentInformationSection))
	 * @param acuteHepatitisBCaseReport The receiving '<em><b>Acute Hepatitis BCase Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAcuteHepatitisBCaseReportAcuteHepatitisBPHCRTreatmentInformationSection(AcuteHepatitisBCaseReport acuteHepatitisBCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ACUTE_HEPATITIS_BCASE_REPORT_ACUTE_HEPATITIS_BPHCR_TREATMENT_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HepbPackage.Literals.ACUTE_HEPATITIS_BCASE_REPORT);
			try {
				VALIDATE_ACUTE_HEPATITIS_BCASE_REPORT_ACUTE_HEPATITIS_BPHCR_TREATMENT_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ACUTE_HEPATITIS_BCASE_REPORT_ACUTE_HEPATITIS_BPHCR_TREATMENT_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ACUTE_HEPATITIS_BCASE_REPORT_ACUTE_HEPATITIS_BPHCR_TREATMENT_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(acuteHepatitisBCaseReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 HepbValidator.DIAGNOSTIC_SOURCE,
						 HepbValidator.ACUTE_HEPATITIS_BCASE_REPORT__ACUTE_HEPATITIS_BCASE_REPORT_ACUTE_HEPATITIS_BPHCR_TREATMENT_INFORMATION_SECTION,
						 HepbPlugin.INSTANCE.getString("AcuteHepatitisBCaseReportAcuteHepatitisBPHCRTreatmentInformationSection"),
						 new Object [] { acuteHepatitisBCaseReport }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAcuteHepatitisBCaseReportAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection(AcuteHepatitisBCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BCase Report Acute Hepatitis BPHCR Relevant Diagnostic Tests And Or Laboratory Data Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAcuteHepatitisBCaseReportAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection(AcuteHepatitisBCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ACUTE_HEPATITIS_BCASE_REPORT_ACUTE_HEPATITIS_BPHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hepb::AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateAcuteHepatitisBCaseReportAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection(AcuteHepatitisBCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BCase Report Acute Hepatitis BPHCR Relevant Diagnostic Tests And Or Laboratory Data Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAcuteHepatitisBCaseReportAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection(AcuteHepatitisBCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ACUTE_HEPATITIS_BCASE_REPORT_ACUTE_HEPATITIS_BPHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hepb::AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection))
	 * @param acuteHepatitisBCaseReport The receiving '<em><b>Acute Hepatitis BCase Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAcuteHepatitisBCaseReportAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection(AcuteHepatitisBCaseReport acuteHepatitisBCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ACUTE_HEPATITIS_BCASE_REPORT_ACUTE_HEPATITIS_BPHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HepbPackage.Literals.ACUTE_HEPATITIS_BCASE_REPORT);
			try {
				VALIDATE_ACUTE_HEPATITIS_BCASE_REPORT_ACUTE_HEPATITIS_BPHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ACUTE_HEPATITIS_BCASE_REPORT_ACUTE_HEPATITIS_BPHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ACUTE_HEPATITIS_BCASE_REPORT_ACUTE_HEPATITIS_BPHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(acuteHepatitisBCaseReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 HepbValidator.DIAGNOSTIC_SOURCE,
						 HepbValidator.ACUTE_HEPATITIS_BCASE_REPORT__ACUTE_HEPATITIS_BCASE_REPORT_ACUTE_HEPATITIS_BPHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION,
						 HepbPlugin.INSTANCE.getString("AcuteHepatitisBCaseReportAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection"),
						 new Object [] { acuteHepatitisBCaseReport }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getAcuteHepatitisBSocialHistorySection(AcuteHepatitisBCaseReport) <em>Get Acute Hepatitis BSocial History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcuteHepatitisBSocialHistorySection(AcuteHepatitisBCaseReport)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hepb::AcuteHepatitisBSocialHistorySection))->asSequence()->any(true).oclAsType(hepb::AcuteHepatitisBSocialHistorySection)";

	/**
	 * The cached OCL query for the '{@link #getAcuteHepatitisBSocialHistorySection(AcuteHepatitisBCaseReport) <em>Get Acute Hepatitis BSocial History Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcuteHepatitisBSocialHistorySection(AcuteHepatitisBCaseReport)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION__EOCL_QRY;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hepb::AcuteHepatitisBSocialHistorySection))->asSequence()->any(true).oclAsType(hepb::AcuteHepatitisBSocialHistorySection)
	 * @param acuteHepatitisBCaseReport The receiving '<em><b>Acute Hepatitis BCase Report</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  AcuteHepatitisBSocialHistorySection getAcuteHepatitisBSocialHistorySection(AcuteHepatitisBCaseReport acuteHepatitisBCaseReport) {
		if (GET_ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(HepbPackage.Literals.ACUTE_HEPATITIS_BCASE_REPORT, HepbPackage.Literals.ACUTE_HEPATITIS_BCASE_REPORT.getEAllOperations().get(65));
			try {
				GET_ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION__EOCL_QRY);
		return (AcuteHepatitisBSocialHistorySection) query.evaluate(acuteHepatitisBCaseReport);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hepb::AcuteHepatitisBImmunizationSection))->asSequence()->any(true).oclAsType(hepb::AcuteHepatitisBImmunizationSection)
	 * @param acuteHepatitisBCaseReport The receiving '<em><b>Acute Hepatitis BCase Report</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  AcuteHepatitisBImmunizationSection getAcuteHepatitisBImmunizationSection(AcuteHepatitisBCaseReport acuteHepatitisBCaseReport) {
		if (GET_ACUTE_HEPATITIS_BIMMUNIZATION_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(HepbPackage.Literals.ACUTE_HEPATITIS_BCASE_REPORT, HepbPackage.Literals.ACUTE_HEPATITIS_BCASE_REPORT.getEAllOperations().get(67));
			try {
				GET_ACUTE_HEPATITIS_BIMMUNIZATION_SECTION__EOCL_QRY = helper.createQuery(GET_ACUTE_HEPATITIS_BIMMUNIZATION_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ACUTE_HEPATITIS_BIMMUNIZATION_SECTION__EOCL_QRY);
		return (AcuteHepatitisBImmunizationSection) query.evaluate(acuteHepatitisBCaseReport);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAcuteHepatitisBPHCRClinicalInformationSection(AcuteHepatitisBCaseReport) <em>Get Acute Hepatitis BPHCR Clinical Information Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcuteHepatitisBPHCRClinicalInformationSection(AcuteHepatitisBCaseReport)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hepb::AcuteHepatitisBPHCRClinicalInformationSection))->asSequence()->any(true).oclAsType(hepb::AcuteHepatitisBPHCRClinicalInformationSection)";

	/**
	 * The cached OCL query for the '{@link #getAcuteHepatitisBPHCRClinicalInformationSection(AcuteHepatitisBCaseReport) <em>Get Acute Hepatitis BPHCR Clinical Information Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcuteHepatitisBPHCRClinicalInformationSection(AcuteHepatitisBCaseReport)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #getAcuteHepatitisBImmunizationSection(AcuteHepatitisBCaseReport) <em>Get Acute Hepatitis BImmunization Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcuteHepatitisBImmunizationSection(AcuteHepatitisBCaseReport)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ACUTE_HEPATITIS_BIMMUNIZATION_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hepb::AcuteHepatitisBImmunizationSection))->asSequence()->any(true).oclAsType(hepb::AcuteHepatitisBImmunizationSection)";

	/**
	 * The cached OCL query for the '{@link #getAcuteHepatitisBImmunizationSection(AcuteHepatitisBCaseReport) <em>Get Acute Hepatitis BImmunization Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcuteHepatitisBImmunizationSection(AcuteHepatitisBCaseReport)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ACUTE_HEPATITIS_BIMMUNIZATION_SECTION__EOCL_QRY;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hepb::AcuteHepatitisBPHCRClinicalInformationSection))->asSequence()->any(true).oclAsType(hepb::AcuteHepatitisBPHCRClinicalInformationSection)
	 * @param acuteHepatitisBCaseReport The receiving '<em><b>Acute Hepatitis BCase Report</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  AcuteHepatitisBPHCRClinicalInformationSection getAcuteHepatitisBPHCRClinicalInformationSection(AcuteHepatitisBCaseReport acuteHepatitisBCaseReport) {
		if (GET_ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(HepbPackage.Literals.ACUTE_HEPATITIS_BCASE_REPORT, HepbPackage.Literals.ACUTE_HEPATITIS_BCASE_REPORT.getEAllOperations().get(66));
			try {
				GET_ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION__EOCL_QRY = helper.createQuery(GET_ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION__EOCL_QRY);
		return (AcuteHepatitisBPHCRClinicalInformationSection) query.evaluate(acuteHepatitisBCaseReport);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAcuteHepatitisBPHCRTreatmentInformationSection(AcuteHepatitisBCaseReport) <em>Get Acute Hepatitis BPHCR Treatment Information Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcuteHepatitisBPHCRTreatmentInformationSection(AcuteHepatitisBCaseReport)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ACUTE_HEPATITIS_BPHCR_TREATMENT_INFORMATION_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hepb::AcuteHepatitisBPHCRTreatmentInformationSection))->asSequence()->any(true).oclAsType(hepb::AcuteHepatitisBPHCRTreatmentInformationSection)";

	/**
	 * The cached OCL query for the '{@link #getAcuteHepatitisBPHCRTreatmentInformationSection(AcuteHepatitisBCaseReport) <em>Get Acute Hepatitis BPHCR Treatment Information Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcuteHepatitisBPHCRTreatmentInformationSection(AcuteHepatitisBCaseReport)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ACUTE_HEPATITIS_BPHCR_TREATMENT_INFORMATION_SECTION__EOCL_QRY;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hepb::AcuteHepatitisBPHCRTreatmentInformationSection))->asSequence()->any(true).oclAsType(hepb::AcuteHepatitisBPHCRTreatmentInformationSection)
	 * @param acuteHepatitisBCaseReport The receiving '<em><b>Acute Hepatitis BCase Report</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  AcuteHepatitisBPHCRTreatmentInformationSection getAcuteHepatitisBPHCRTreatmentInformationSection(AcuteHepatitisBCaseReport acuteHepatitisBCaseReport) {
		if (GET_ACUTE_HEPATITIS_BPHCR_TREATMENT_INFORMATION_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(HepbPackage.Literals.ACUTE_HEPATITIS_BCASE_REPORT, HepbPackage.Literals.ACUTE_HEPATITIS_BCASE_REPORT.getEAllOperations().get(68));
			try {
				GET_ACUTE_HEPATITIS_BPHCR_TREATMENT_INFORMATION_SECTION__EOCL_QRY = helper.createQuery(GET_ACUTE_HEPATITIS_BPHCR_TREATMENT_INFORMATION_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ACUTE_HEPATITIS_BPHCR_TREATMENT_INFORMATION_SECTION__EOCL_QRY);
		return (AcuteHepatitisBPHCRTreatmentInformationSection) query.evaluate(acuteHepatitisBCaseReport);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection(AcuteHepatitisBCaseReport) <em>Get Acute Hepatitis BPHCR Relevant Diagnostic Tests And Or Laboratory Data Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection(AcuteHepatitisBCaseReport)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ACUTE_HEPATITIS_BPHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hepb::AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection))->asSequence()->any(true).oclAsType(hepb::AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection)";

	/**
	 * The cached OCL query for the '{@link #getAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection(AcuteHepatitisBCaseReport) <em>Get Acute Hepatitis BPHCR Relevant Diagnostic Tests And Or Laboratory Data Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection(AcuteHepatitisBCaseReport)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ACUTE_HEPATITIS_BPHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__EOCL_QRY;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hepb::AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection))->asSequence()->any(true).oclAsType(hepb::AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection)
	 * @param acuteHepatitisBCaseReport The receiving '<em><b>Acute Hepatitis BCase Report</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection getAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection(AcuteHepatitisBCaseReport acuteHepatitisBCaseReport) {
		if (GET_ACUTE_HEPATITIS_BPHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(HepbPackage.Literals.ACUTE_HEPATITIS_BCASE_REPORT, HepbPackage.Literals.ACUTE_HEPATITIS_BCASE_REPORT.getEAllOperations().get(69));
			try {
				GET_ACUTE_HEPATITIS_BPHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__EOCL_QRY = helper.createQuery(GET_ACUTE_HEPATITIS_BPHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ACUTE_HEPATITIS_BPHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__EOCL_QRY);
		return (AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection) query.evaluate(acuteHepatitisBCaseReport);
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePublicHealthCaseReportTemplateId(AcuteHepatitisBCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePublicHealthCaseReportTemplateId(AcuteHepatitisBCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.1.2')";

	/**
	 * The cached OCL invariant for the '{@link #validatePublicHealthCaseReportTemplateId(AcuteHepatitisBCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePublicHealthCaseReportTemplateId(AcuteHepatitisBCaseReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.1.2')
	 * @param acuteHepatitisBCaseReport The receiving '<em><b>Acute Hepatitis BCase Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePublicHealthCaseReportTemplateId(AcuteHepatitisBCaseReport acuteHepatitisBCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HepbPackage.Literals.ACUTE_HEPATITIS_BCASE_REPORT);
			try {
				VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(acuteHepatitisBCaseReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HepbValidator.DIAGNOSTIC_SOURCE,
						 HepbValidator.ACUTE_HEPATITIS_BCASE_REPORT__PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PublicHealthCaseReportTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(acuteHepatitisBCaseReport, context) }),
						 new Object [] { acuteHepatitisBCaseReport }));
			}
			 
			return false;
		}
		return true;
	}

} // AcuteHepatitisBCaseReportOperations