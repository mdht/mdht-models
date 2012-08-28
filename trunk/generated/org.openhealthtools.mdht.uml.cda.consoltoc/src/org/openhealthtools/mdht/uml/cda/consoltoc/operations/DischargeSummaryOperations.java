/*******************************************************************************
 * Copyright (c) 2012 Rama Ramakrishnan and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Rama Ramakrishnan (Agilex Corporation) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consoltoc.operations;

import java.util.Map;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.consol.DischargeDietSection;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalCourseSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargePhysicalSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeStudiesSummarySection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional;

import org.openhealthtools.mdht.uml.cda.consol.operations.GeneralHeaderConstraintsOperations;

import org.openhealthtools.mdht.uml.cda.consoltoc.ConsoltocPackage;
import org.openhealthtools.mdht.uml.cda.consoltoc.ConsoltocPlugin;
import org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary;
import org.openhealthtools.mdht.uml.cda.consoltoc.util.ConsoltocValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Discharge Summary</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#validateDischargeSummaryAllergiesSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Allergies Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#validateDischargeSummaryHospitalCourseSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Course Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#validateDischargeSummaryHospitalDischargeDiagnosisSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Discharge Diagnosis Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#validateDischargeSummaryHospitalDischargeMedicationsSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Discharge Medications Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#validateDischargeSummaryPlanOfCareSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#validateDischargeSummaryProblemSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Problem Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#validateDischargeSummaryChiefComplaintSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Chief Complaint Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#validateDischargeSummaryChiefComplaintAndReasonForVisitSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Chief Complaint And Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#validateDischargeSummaryDischargeDietSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Discharge Diet Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#validateDischargeSummaryFamilyHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Family History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#validateDischargeSummaryFunctionalStatusSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Functional Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#validateDischargeSummaryHistoryOfPresentIllnessSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary History Of Present Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#validateDischargeSummaryHospitalDischargePhysicalSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Discharge Physical Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#validateDischargeSummaryHospitalDischargeStudiesSummarySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Discharge Studies Summary Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#validateDischargeSummaryProceduresSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Procedures Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#validateDischargeSummaryReasonForVisitSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#validateDischargeSummaryReviewOfSystemsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#validateDischargeSummarySocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#validateDischargeSummaryVitalSignsSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Vital Signs Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#validateDischargeSummaryImmunizationsSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Immunizations Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#getAllergiesSectionEntriesOptional() <em>Get Allergies Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#getHospitalCourseSection() <em>Get Hospital Course Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#getHospitalDischargeDiagnosisSection() <em>Get Hospital Discharge Diagnosis Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#getHospitalDischargeMedicationsSectionEntriesOptional() <em>Get Hospital Discharge Medications Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#getPlanOfCareSection() <em>Get Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#getProblemSectionEntriesOptional() <em>Get Problem Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#getChiefComplaintSection() <em>Get Chief Complaint Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#getChiefComplaintAndReasonForVisitSection() <em>Get Chief Complaint And Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#getDischargeDietSection() <em>Get Discharge Diet Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#getFamilyHistorySection() <em>Get Family History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#getFunctionalStatusSection() <em>Get Functional Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#getHistoryOfPresentIllnessSection() <em>Get History Of Present Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#getHospitalDischargePhysicalSection() <em>Get Hospital Discharge Physical Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#getHospitalDischargeStudiesSummarySection() <em>Get Hospital Discharge Studies Summary Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#getProceduresSectionEntriesOptional() <em>Get Procedures Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#getReasonForVisitSection() <em>Get Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#getReviewOfSystemsSection() <em>Get Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#getSocialHistorySection() <em>Get Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#getVitalSignsSectionEntriesOptional() <em>Get Vital Signs Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#getImmunizationsSectionEntriesOptional() <em>Get Immunizations Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DischargeSummaryOperations extends GeneralHeaderConstraintsOperations
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected DischargeSummaryOperations() {
		super();
	}

  /**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryAllergiesSectionEntriesOptional(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Allergies Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryAllergiesSectionEntriesOptional(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_DISCHARGE_SUMMARY_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSectionEntriesOptional))";

  /**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryAllergiesSectionEntriesOptional(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Allergies Section Entries Optional</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryAllergiesSectionEntriesOptional(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_DISCHARGE_SUMMARY_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSectionEntriesOptional))
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateDischargeSummaryAllergiesSectionEntriesOptional(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsoltocPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsoltocValidator.DIAGNOSTIC_SOURCE,
						 ConsoltocValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_ALLERGIES_SECTION_ENTRIES_OPTIONAL,
						 ConsoltocPlugin.INSTANCE.getString("DischargeSummaryAllergiesSectionEntriesOptional"),
						 new Object [] { dischargeSummary }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryHospitalCourseSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Course Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryHospitalCourseSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_COURSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalCourseSection))";

  /**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryHospitalCourseSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Course Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryHospitalCourseSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_COURSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalCourseSection))
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateDischargeSummaryHospitalCourseSection(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_COURSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsoltocPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_COURSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_COURSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_COURSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsoltocValidator.DIAGNOSTIC_SOURCE,
						 ConsoltocValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_HOSPITAL_COURSE_SECTION,
						 ConsoltocPlugin.INSTANCE.getString("DischargeSummaryHospitalCourseSection"),
						 new Object [] { dischargeSummary }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryHospitalDischargeDiagnosisSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Discharge Diagnosis Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryHospitalDischargeDiagnosisSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeDiagnosisSection))";

  /**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryHospitalDischargeDiagnosisSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Discharge Diagnosis Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryHospitalDischargeDiagnosisSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeDiagnosisSection))
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateDischargeSummaryHospitalDischargeDiagnosisSection(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsoltocPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsoltocValidator.DIAGNOSTIC_SOURCE,
						 ConsoltocValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION,
						 ConsoltocPlugin.INSTANCE.getString("DischargeSummaryHospitalDischargeDiagnosisSection"),
						 new Object [] { dischargeSummary }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryHospitalDischargeMedicationsSectionEntriesOptional(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Discharge Medications Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryHospitalDischargeMedicationsSectionEntriesOptional(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeMedicationsSectionEntriesOptional))";

  /**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryHospitalDischargeMedicationsSectionEntriesOptional(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Discharge Medications Section Entries Optional</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryHospitalDischargeMedicationsSectionEntriesOptional(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeMedicationsSectionEntriesOptional))
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateDischargeSummaryHospitalDischargeMedicationsSectionEntriesOptional(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsoltocPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsoltocValidator.DIAGNOSTIC_SOURCE,
						 ConsoltocValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL,
						 ConsoltocPlugin.INSTANCE.getString("DischargeSummaryHospitalDischargeMedicationsSectionEntriesOptional"),
						 new Object [] { dischargeSummary }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryPlanOfCareSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Plan Of Care Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryPlanOfCareSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_DISCHARGE_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection))";

  /**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryPlanOfCareSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Plan Of Care Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryPlanOfCareSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_DISCHARGE_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection))
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateDischargeSummaryPlanOfCareSection(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsoltocPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsoltocValidator.DIAGNOSTIC_SOURCE,
						 ConsoltocValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_PLAN_OF_CARE_SECTION,
						 ConsoltocPlugin.INSTANCE.getString("DischargeSummaryPlanOfCareSection"),
						 new Object [] { dischargeSummary }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryProblemSectionEntriesOptional(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Problem Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryProblemSectionEntriesOptional(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_DISCHARGE_SUMMARY_PROBLEM_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSectionEntriesOptional))";

  /**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryProblemSectionEntriesOptional(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Problem Section Entries Optional</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryProblemSectionEntriesOptional(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_DISCHARGE_SUMMARY_PROBLEM_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSectionEntriesOptional))
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateDischargeSummaryProblemSectionEntriesOptional(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_PROBLEM_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsoltocPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_PROBLEM_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_PROBLEM_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_PROBLEM_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsoltocValidator.DIAGNOSTIC_SOURCE,
						 ConsoltocValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_PROBLEM_SECTION_ENTRIES_OPTIONAL,
						 ConsoltocPlugin.INSTANCE.getString("DischargeSummaryProblemSectionEntriesOptional"),
						 new Object [] { dischargeSummary }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryChiefComplaintSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Chief Complaint Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryChiefComplaintSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_DISCHARGE_SUMMARY_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection))";

  /**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryChiefComplaintSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Chief Complaint Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryChiefComplaintSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_DISCHARGE_SUMMARY_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection))
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateDischargeSummaryChiefComplaintSection(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsoltocPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsoltocValidator.DIAGNOSTIC_SOURCE,
						 ConsoltocValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_CHIEF_COMPLAINT_SECTION,
						 ConsoltocPlugin.INSTANCE.getString("DischargeSummaryChiefComplaintSection"),
						 new Object [] { dischargeSummary }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryChiefComplaintAndReasonForVisitSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Chief Complaint And Reason For Visit Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryChiefComplaintAndReasonForVisitSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_DISCHARGE_SUMMARY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))";

  /**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryChiefComplaintAndReasonForVisitSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Chief Complaint And Reason For Visit Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryChiefComplaintAndReasonForVisitSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_DISCHARGE_SUMMARY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateDischargeSummaryChiefComplaintAndReasonForVisitSection(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsoltocPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsoltocValidator.DIAGNOSTIC_SOURCE,
						 ConsoltocValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION,
						 ConsoltocPlugin.INSTANCE.getString("DischargeSummaryChiefComplaintAndReasonForVisitSection"),
						 new Object [] { dischargeSummary }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryDischargeDietSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Discharge Diet Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryDischargeDietSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_DISCHARGE_SUMMARY_DISCHARGE_DIET_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DischargeDietSection))";

  /**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryDischargeDietSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Discharge Diet Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryDischargeDietSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_DISCHARGE_SUMMARY_DISCHARGE_DIET_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DischargeDietSection))
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateDischargeSummaryDischargeDietSection(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_DISCHARGE_DIET_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsoltocPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_DISCHARGE_DIET_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_DISCHARGE_DIET_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_DISCHARGE_DIET_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsoltocValidator.DIAGNOSTIC_SOURCE,
						 ConsoltocValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_DISCHARGE_DIET_SECTION,
						 ConsoltocPlugin.INSTANCE.getString("DischargeSummaryDischargeDietSection"),
						 new Object [] { dischargeSummary }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryFamilyHistorySection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Family History Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryFamilyHistorySection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_DISCHARGE_SUMMARY_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection))";

  /**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryFamilyHistorySection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Family History Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryFamilyHistorySection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_DISCHARGE_SUMMARY_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection))
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateDischargeSummaryFamilyHistorySection(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsoltocPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsoltocValidator.DIAGNOSTIC_SOURCE,
						 ConsoltocValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_FAMILY_HISTORY_SECTION,
						 ConsoltocPlugin.INSTANCE.getString("DischargeSummaryFamilyHistorySection"),
						 new Object [] { dischargeSummary }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryFunctionalStatusSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Functional Status Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryFunctionalStatusSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_DISCHARGE_SUMMARY_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FunctionalStatusSection))";

  /**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryFunctionalStatusSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Functional Status Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryFunctionalStatusSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_DISCHARGE_SUMMARY_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FunctionalStatusSection))
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateDischargeSummaryFunctionalStatusSection(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsoltocPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsoltocValidator.DIAGNOSTIC_SOURCE,
						 ConsoltocValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_FUNCTIONAL_STATUS_SECTION,
						 ConsoltocPlugin.INSTANCE.getString("DischargeSummaryFunctionalStatusSection"),
						 new Object [] { dischargeSummary }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryHistoryOfPresentIllnessSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary History Of Present Illness Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryHistoryOfPresentIllnessSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_DISCHARGE_SUMMARY_HISTORY_OF_PRESENT_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPresentIllnessSection))";

  /**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryHistoryOfPresentIllnessSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary History Of Present Illness Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryHistoryOfPresentIllnessSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_DISCHARGE_SUMMARY_HISTORY_OF_PRESENT_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPresentIllnessSection))
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateDischargeSummaryHistoryOfPresentIllnessSection(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_HISTORY_OF_PRESENT_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsoltocPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_HISTORY_OF_PRESENT_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_HISTORY_OF_PRESENT_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_HISTORY_OF_PRESENT_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsoltocValidator.DIAGNOSTIC_SOURCE,
						 ConsoltocValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_HISTORY_OF_PRESENT_ILLNESS_SECTION,
						 ConsoltocPlugin.INSTANCE.getString("DischargeSummaryHistoryOfPresentIllnessSection"),
						 new Object [] { dischargeSummary }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryHospitalDischargePhysicalSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Discharge Physical Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryHospitalDischargePhysicalSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_PHYSICAL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargePhysicalSection))";

  /**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryHospitalDischargePhysicalSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Discharge Physical Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryHospitalDischargePhysicalSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_PHYSICAL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargePhysicalSection))
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateDischargeSummaryHospitalDischargePhysicalSection(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_PHYSICAL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsoltocPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_PHYSICAL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_PHYSICAL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_PHYSICAL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsoltocValidator.DIAGNOSTIC_SOURCE,
						 ConsoltocValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_PHYSICAL_SECTION,
						 ConsoltocPlugin.INSTANCE.getString("DischargeSummaryHospitalDischargePhysicalSection"),
						 new Object [] { dischargeSummary }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryHospitalDischargeStudiesSummarySection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Discharge Studies Summary Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryHospitalDischargeStudiesSummarySection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeStudiesSummarySection))";

  /**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryHospitalDischargeStudiesSummarySection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Discharge Studies Summary Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryHospitalDischargeStudiesSummarySection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeStudiesSummarySection))
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateDischargeSummaryHospitalDischargeStudiesSummarySection(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsoltocPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsoltocValidator.DIAGNOSTIC_SOURCE,
						 ConsoltocValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION,
						 ConsoltocPlugin.INSTANCE.getString("DischargeSummaryHospitalDischargeStudiesSummarySection"),
						 new Object [] { dischargeSummary }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryProceduresSectionEntriesOptional(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Procedures Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryProceduresSectionEntriesOptional(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_DISCHARGE_SUMMARY_PROCEDURES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProceduresSectionEntriesOptional))";

  /**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryProceduresSectionEntriesOptional(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Procedures Section Entries Optional</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryProceduresSectionEntriesOptional(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_DISCHARGE_SUMMARY_PROCEDURES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProceduresSectionEntriesOptional))
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateDischargeSummaryProceduresSectionEntriesOptional(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_PROCEDURES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsoltocPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_PROCEDURES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_PROCEDURES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_PROCEDURES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsoltocValidator.DIAGNOSTIC_SOURCE,
						 ConsoltocValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_PROCEDURES_SECTION_ENTRIES_OPTIONAL,
						 ConsoltocPlugin.INSTANCE.getString("DischargeSummaryProceduresSectionEntriesOptional"),
						 new Object [] { dischargeSummary }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryReasonForVisitSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Reason For Visit Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryReasonForVisitSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_DISCHARGE_SUMMARY_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection))";

  /**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryReasonForVisitSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Reason For Visit Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryReasonForVisitSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_DISCHARGE_SUMMARY_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection))
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateDischargeSummaryReasonForVisitSection(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsoltocPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsoltocValidator.DIAGNOSTIC_SOURCE,
						 ConsoltocValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_REASON_FOR_VISIT_SECTION,
						 ConsoltocPlugin.INSTANCE.getString("DischargeSummaryReasonForVisitSection"),
						 new Object [] { dischargeSummary }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryReviewOfSystemsSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Review Of Systems Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryReviewOfSystemsSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_DISCHARGE_SUMMARY_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReviewOfSystemsSection))";

  /**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryReviewOfSystemsSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Review Of Systems Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryReviewOfSystemsSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_DISCHARGE_SUMMARY_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReviewOfSystemsSection))
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateDischargeSummaryReviewOfSystemsSection(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsoltocPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsoltocValidator.DIAGNOSTIC_SOURCE,
						 ConsoltocValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_REVIEW_OF_SYSTEMS_SECTION,
						 ConsoltocPlugin.INSTANCE.getString("DischargeSummaryReviewOfSystemsSection"),
						 new Object [] { dischargeSummary }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateDischargeSummarySocialHistorySection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Social History Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateDischargeSummarySocialHistorySection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_DISCHARGE_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection))";

  /**
	 * The cached OCL invariant for the '{@link #validateDischargeSummarySocialHistorySection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Social History Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateDischargeSummarySocialHistorySection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_DISCHARGE_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection))
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateDischargeSummarySocialHistorySection(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsoltocPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsoltocValidator.DIAGNOSTIC_SOURCE,
						 ConsoltocValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_SOCIAL_HISTORY_SECTION,
						 ConsoltocPlugin.INSTANCE.getString("DischargeSummarySocialHistorySection"),
						 new Object [] { dischargeSummary }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryVitalSignsSectionEntriesOptional(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Vital Signs Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryVitalSignsSectionEntriesOptional(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_DISCHARGE_SUMMARY_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSectionEntriesOptional))";

  /**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryVitalSignsSectionEntriesOptional(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Vital Signs Section Entries Optional</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryVitalSignsSectionEntriesOptional(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_DISCHARGE_SUMMARY_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSectionEntriesOptional))
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateDischargeSummaryVitalSignsSectionEntriesOptional(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsoltocPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsoltocValidator.DIAGNOSTIC_SOURCE,
						 ConsoltocValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL,
						 ConsoltocPlugin.INSTANCE.getString("DischargeSummaryVitalSignsSectionEntriesOptional"),
						 new Object [] { dischargeSummary }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryImmunizationsSectionEntriesOptional(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Immunizations Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryImmunizationsSectionEntriesOptional(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_DISCHARGE_SUMMARY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSectionEntriesOptional))";

  /**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryImmunizationsSectionEntriesOptional(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Immunizations Section Entries Optional</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryImmunizationsSectionEntriesOptional(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_DISCHARGE_SUMMARY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSectionEntriesOptional))
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateDischargeSummaryImmunizationsSectionEntriesOptional(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_DISCHARGE_SUMMARY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsoltocPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsoltocValidator.DIAGNOSTIC_SOURCE,
						 ConsoltocValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL,
						 ConsoltocPlugin.INSTANCE.getString("DischargeSummaryImmunizationsSectionEntriesOptional"),
						 new Object [] { dischargeSummary }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #getAllergiesSectionEntriesOptional(DischargeSummary) <em>Get Allergies Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAllergiesSectionEntriesOptional(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSectionEntriesOptional))->asSequence()->first().oclAsType(consol::AllergiesSectionEntriesOptional)";

  /**
	 * The cached OCL query for the '{@link #getAllergiesSectionEntriesOptional(DischargeSummary) <em>Get Allergies Section Entries Optional</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAllergiesSectionEntriesOptional(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSectionEntriesOptional))->asSequence()->first().oclAsType(consol::AllergiesSectionEntriesOptional)
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  AllergiesSectionEntriesOptional getAllergiesSectionEntriesOptional(DischargeSummary dischargeSummary)
  {
		if (GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.DISCHARGE_SUMMARY, ConsoltocPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(190));
			try {
				GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
		return (AllergiesSectionEntriesOptional) query.evaluate(dischargeSummary);
	}

  /**
	 * The cached OCL expression body for the '{@link #getHospitalCourseSection(DischargeSummary) <em>Get Hospital Course Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHospitalCourseSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_HOSPITAL_COURSE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalCourseSection))->asSequence()->first().oclAsType(consol::HospitalCourseSection)";

  /**
	 * The cached OCL query for the '{@link #getHospitalCourseSection(DischargeSummary) <em>Get Hospital Course Section</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHospitalCourseSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_HOSPITAL_COURSE_SECTION__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalCourseSection))->asSequence()->first().oclAsType(consol::HospitalCourseSection)
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  HospitalCourseSection getHospitalCourseSection(DischargeSummary dischargeSummary)
  {
		if (GET_HOSPITAL_COURSE_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.DISCHARGE_SUMMARY, ConsoltocPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(191));
			try {
				GET_HOSPITAL_COURSE_SECTION__EOCL_QRY = helper.createQuery(GET_HOSPITAL_COURSE_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HOSPITAL_COURSE_SECTION__EOCL_QRY);
		return (HospitalCourseSection) query.evaluate(dischargeSummary);
	}

  /**
	 * The cached OCL expression body for the '{@link #getHospitalDischargeDiagnosisSection(DischargeSummary) <em>Get Hospital Discharge Diagnosis Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHospitalDischargeDiagnosisSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeDiagnosisSection))->asSequence()->first().oclAsType(consol::HospitalDischargeDiagnosisSection)";

  /**
	 * The cached OCL query for the '{@link #getHospitalDischargeDiagnosisSection(DischargeSummary) <em>Get Hospital Discharge Diagnosis Section</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHospitalDischargeDiagnosisSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeDiagnosisSection))->asSequence()->first().oclAsType(consol::HospitalDischargeDiagnosisSection)
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  HospitalDischargeDiagnosisSection getHospitalDischargeDiagnosisSection(DischargeSummary dischargeSummary)
  {
		if (GET_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.DISCHARGE_SUMMARY, ConsoltocPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(192));
			try {
				GET_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION__EOCL_QRY = helper.createQuery(GET_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION__EOCL_QRY);
		return (HospitalDischargeDiagnosisSection) query.evaluate(dischargeSummary);
	}

  /**
	 * The cached OCL expression body for the '{@link #getHospitalDischargeMedicationsSectionEntriesOptional(DischargeSummary) <em>Get Hospital Discharge Medications Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHospitalDischargeMedicationsSectionEntriesOptional(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeMedicationsSectionEntriesOptional))->asSequence()->first().oclAsType(consol::HospitalDischargeMedicationsSectionEntriesOptional)";

  /**
	 * The cached OCL query for the '{@link #getHospitalDischargeMedicationsSectionEntriesOptional(DischargeSummary) <em>Get Hospital Discharge Medications Section Entries Optional</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHospitalDischargeMedicationsSectionEntriesOptional(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeMedicationsSectionEntriesOptional))->asSequence()->first().oclAsType(consol::HospitalDischargeMedicationsSectionEntriesOptional)
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  HospitalDischargeMedicationsSectionEntriesOptional getHospitalDischargeMedicationsSectionEntriesOptional(DischargeSummary dischargeSummary)
  {
		if (GET_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.DISCHARGE_SUMMARY, ConsoltocPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(193));
			try {
				GET_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
		return (HospitalDischargeMedicationsSectionEntriesOptional) query.evaluate(dischargeSummary);
	}

  /**
	 * The cached OCL expression body for the '{@link #getPlanOfCareSection(DischargeSummary) <em>Get Plan Of Care Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPlanOfCareSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_PLAN_OF_CARE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection))->asSequence()->first().oclAsType(consol::PlanOfCareSection)";

  /**
	 * The cached OCL query for the '{@link #getPlanOfCareSection(DischargeSummary) <em>Get Plan Of Care Section</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPlanOfCareSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_PLAN_OF_CARE_SECTION__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection))->asSequence()->first().oclAsType(consol::PlanOfCareSection)
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  PlanOfCareSection getPlanOfCareSection(DischargeSummary dischargeSummary)
  {
		if (GET_PLAN_OF_CARE_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.DISCHARGE_SUMMARY, ConsoltocPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(194));
			try {
				GET_PLAN_OF_CARE_SECTION__EOCL_QRY = helper.createQuery(GET_PLAN_OF_CARE_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PLAN_OF_CARE_SECTION__EOCL_QRY);
		return (PlanOfCareSection) query.evaluate(dischargeSummary);
	}

  /**
	 * The cached OCL expression body for the '{@link #getProblemSectionEntriesOptional(DischargeSummary) <em>Get Problem Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getProblemSectionEntriesOptional(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_PROBLEM_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSectionEntriesOptional))->asSequence()->first().oclAsType(consol::ProblemSectionEntriesOptional)";

  /**
	 * The cached OCL query for the '{@link #getProblemSectionEntriesOptional(DischargeSummary) <em>Get Problem Section Entries Optional</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getProblemSectionEntriesOptional(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_PROBLEM_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSectionEntriesOptional))->asSequence()->first().oclAsType(consol::ProblemSectionEntriesOptional)
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  ProblemSectionEntriesOptional getProblemSectionEntriesOptional(DischargeSummary dischargeSummary)
  {
		if (GET_PROBLEM_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.DISCHARGE_SUMMARY, ConsoltocPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(195));
			try {
				GET_PROBLEM_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_PROBLEM_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
		return (ProblemSectionEntriesOptional) query.evaluate(dischargeSummary);
	}

  /**
	 * The cached OCL expression body for the '{@link #getChiefComplaintSection(DischargeSummary) <em>Get Chief Complaint Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getChiefComplaintSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_CHIEF_COMPLAINT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection))->asSequence()->first().oclAsType(consol::ChiefComplaintSection)";

  /**
	 * The cached OCL query for the '{@link #getChiefComplaintSection(DischargeSummary) <em>Get Chief Complaint Section</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getChiefComplaintSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection))->asSequence()->first().oclAsType(consol::ChiefComplaintSection)
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  ChiefComplaintSection getChiefComplaintSection(DischargeSummary dischargeSummary)
  {
		if (GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.DISCHARGE_SUMMARY, ConsoltocPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(196));
			try {
				GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY = helper.createQuery(GET_CHIEF_COMPLAINT_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY);
		return (ChiefComplaintSection) query.evaluate(dischargeSummary);
	}

  /**
	 * The cached OCL expression body for the '{@link #getChiefComplaintAndReasonForVisitSection(DischargeSummary) <em>Get Chief Complaint And Reason For Visit Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getChiefComplaintAndReasonForVisitSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))->asSequence()->first().oclAsType(consol::ChiefComplaintAndReasonForVisitSection)";

  /**
	 * The cached OCL query for the '{@link #getChiefComplaintAndReasonForVisitSection(DischargeSummary) <em>Get Chief Complaint And Reason For Visit Section</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getChiefComplaintAndReasonForVisitSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))->asSequence()->first().oclAsType(consol::ChiefComplaintAndReasonForVisitSection)
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  ChiefComplaintAndReasonForVisitSection getChiefComplaintAndReasonForVisitSection(DischargeSummary dischargeSummary)
  {
		if (GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.DISCHARGE_SUMMARY, ConsoltocPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(197));
			try {
				GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_QRY = helper.createQuery(GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_QRY);
		return (ChiefComplaintAndReasonForVisitSection) query.evaluate(dischargeSummary);
	}

  /**
	 * The cached OCL expression body for the '{@link #getDischargeDietSection(DischargeSummary) <em>Get Discharge Diet Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDischargeDietSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_DISCHARGE_DIET_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DischargeDietSection))->asSequence()->first().oclAsType(consol::DischargeDietSection)";

  /**
	 * The cached OCL query for the '{@link #getDischargeDietSection(DischargeSummary) <em>Get Discharge Diet Section</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDischargeDietSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_DISCHARGE_DIET_SECTION__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DischargeDietSection))->asSequence()->first().oclAsType(consol::DischargeDietSection)
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  DischargeDietSection getDischargeDietSection(DischargeSummary dischargeSummary)
  {
		if (GET_DISCHARGE_DIET_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.DISCHARGE_SUMMARY, ConsoltocPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(198));
			try {
				GET_DISCHARGE_DIET_SECTION__EOCL_QRY = helper.createQuery(GET_DISCHARGE_DIET_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_DISCHARGE_DIET_SECTION__EOCL_QRY);
		return (DischargeDietSection) query.evaluate(dischargeSummary);
	}

  /**
	 * The cached OCL expression body for the '{@link #getFamilyHistorySection(DischargeSummary) <em>Get Family History Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getFamilyHistorySection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_FAMILY_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection))->asSequence()->first().oclAsType(consol::FamilyHistorySection)";

  /**
	 * The cached OCL query for the '{@link #getFamilyHistorySection(DischargeSummary) <em>Get Family History Section</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getFamilyHistorySection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_FAMILY_HISTORY_SECTION__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection))->asSequence()->first().oclAsType(consol::FamilyHistorySection)
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  FamilyHistorySection getFamilyHistorySection(DischargeSummary dischargeSummary)
  {
		if (GET_FAMILY_HISTORY_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.DISCHARGE_SUMMARY, ConsoltocPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(199));
			try {
				GET_FAMILY_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_FAMILY_HISTORY_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_FAMILY_HISTORY_SECTION__EOCL_QRY);
		return (FamilyHistorySection) query.evaluate(dischargeSummary);
	}

  /**
	 * The cached OCL expression body for the '{@link #getFunctionalStatusSection(DischargeSummary) <em>Get Functional Status Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getFunctionalStatusSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_FUNCTIONAL_STATUS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FunctionalStatusSection))->asSequence()->first().oclAsType(consol::FunctionalStatusSection)";

  /**
	 * The cached OCL query for the '{@link #getFunctionalStatusSection(DischargeSummary) <em>Get Functional Status Section</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getFunctionalStatusSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_FUNCTIONAL_STATUS_SECTION__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FunctionalStatusSection))->asSequence()->first().oclAsType(consol::FunctionalStatusSection)
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  FunctionalStatusSection getFunctionalStatusSection(DischargeSummary dischargeSummary)
  {
		if (GET_FUNCTIONAL_STATUS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.DISCHARGE_SUMMARY, ConsoltocPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(200));
			try {
				GET_FUNCTIONAL_STATUS_SECTION__EOCL_QRY = helper.createQuery(GET_FUNCTIONAL_STATUS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_FUNCTIONAL_STATUS_SECTION__EOCL_QRY);
		return (FunctionalStatusSection) query.evaluate(dischargeSummary);
	}

  /**
	 * The cached OCL expression body for the '{@link #getHistoryOfPresentIllnessSection(DischargeSummary) <em>Get History Of Present Illness Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHistoryOfPresentIllnessSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_HISTORY_OF_PRESENT_ILLNESS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPresentIllnessSection))->asSequence()->first().oclAsType(consol::HistoryOfPresentIllnessSection)";

  /**
	 * The cached OCL query for the '{@link #getHistoryOfPresentIllnessSection(DischargeSummary) <em>Get History Of Present Illness Section</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHistoryOfPresentIllnessSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_HISTORY_OF_PRESENT_ILLNESS_SECTION__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPresentIllnessSection))->asSequence()->first().oclAsType(consol::HistoryOfPresentIllnessSection)
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  HistoryOfPresentIllnessSection getHistoryOfPresentIllnessSection(DischargeSummary dischargeSummary)
  {
		if (GET_HISTORY_OF_PRESENT_ILLNESS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.DISCHARGE_SUMMARY, ConsoltocPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(201));
			try {
				GET_HISTORY_OF_PRESENT_ILLNESS_SECTION__EOCL_QRY = helper.createQuery(GET_HISTORY_OF_PRESENT_ILLNESS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HISTORY_OF_PRESENT_ILLNESS_SECTION__EOCL_QRY);
		return (HistoryOfPresentIllnessSection) query.evaluate(dischargeSummary);
	}

  /**
	 * The cached OCL expression body for the '{@link #getHospitalDischargePhysicalSection(DischargeSummary) <em>Get Hospital Discharge Physical Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHospitalDischargePhysicalSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_HOSPITAL_DISCHARGE_PHYSICAL_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargePhysicalSection))->asSequence()->first().oclAsType(consol::HospitalDischargePhysicalSection)";

  /**
	 * The cached OCL query for the '{@link #getHospitalDischargePhysicalSection(DischargeSummary) <em>Get Hospital Discharge Physical Section</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHospitalDischargePhysicalSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_HOSPITAL_DISCHARGE_PHYSICAL_SECTION__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargePhysicalSection))->asSequence()->first().oclAsType(consol::HospitalDischargePhysicalSection)
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  HospitalDischargePhysicalSection getHospitalDischargePhysicalSection(DischargeSummary dischargeSummary)
  {
		if (GET_HOSPITAL_DISCHARGE_PHYSICAL_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.DISCHARGE_SUMMARY, ConsoltocPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(202));
			try {
				GET_HOSPITAL_DISCHARGE_PHYSICAL_SECTION__EOCL_QRY = helper.createQuery(GET_HOSPITAL_DISCHARGE_PHYSICAL_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HOSPITAL_DISCHARGE_PHYSICAL_SECTION__EOCL_QRY);
		return (HospitalDischargePhysicalSection) query.evaluate(dischargeSummary);
	}

  /**
	 * The cached OCL expression body for the '{@link #getHospitalDischargeStudiesSummarySection(DischargeSummary) <em>Get Hospital Discharge Studies Summary Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHospitalDischargeStudiesSummarySection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeStudiesSummarySection))->asSequence()->first().oclAsType(consol::HospitalDischargeStudiesSummarySection)";

  /**
	 * The cached OCL query for the '{@link #getHospitalDischargeStudiesSummarySection(DischargeSummary) <em>Get Hospital Discharge Studies Summary Section</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHospitalDischargeStudiesSummarySection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeStudiesSummarySection))->asSequence()->first().oclAsType(consol::HospitalDischargeStudiesSummarySection)
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  HospitalDischargeStudiesSummarySection getHospitalDischargeStudiesSummarySection(DischargeSummary dischargeSummary)
  {
		if (GET_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.DISCHARGE_SUMMARY, ConsoltocPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(203));
			try {
				GET_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION__EOCL_QRY = helper.createQuery(GET_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION__EOCL_QRY);
		return (HospitalDischargeStudiesSummarySection) query.evaluate(dischargeSummary);
	}

  /**
	 * The cached OCL expression body for the '{@link #getProceduresSectionEntriesOptional(DischargeSummary) <em>Get Procedures Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getProceduresSectionEntriesOptional(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProceduresSectionEntriesOptional))->asSequence()->first().oclAsType(consol::ProceduresSectionEntriesOptional)";

  /**
	 * The cached OCL query for the '{@link #getProceduresSectionEntriesOptional(DischargeSummary) <em>Get Procedures Section Entries Optional</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getProceduresSectionEntriesOptional(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProceduresSectionEntriesOptional))->asSequence()->first().oclAsType(consol::ProceduresSectionEntriesOptional)
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  ProceduresSectionEntriesOptional getProceduresSectionEntriesOptional(DischargeSummary dischargeSummary)
  {
		if (GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.DISCHARGE_SUMMARY, ConsoltocPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(204));
			try {
				GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
		return (ProceduresSectionEntriesOptional) query.evaluate(dischargeSummary);
	}

  /**
	 * The cached OCL expression body for the '{@link #getReasonForVisitSection(DischargeSummary) <em>Get Reason For Visit Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getReasonForVisitSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_REASON_FOR_VISIT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection))->asSequence()->first().oclAsType(consol::ReasonForVisitSection)";

  /**
	 * The cached OCL query for the '{@link #getReasonForVisitSection(DischargeSummary) <em>Get Reason For Visit Section</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getReasonForVisitSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_REASON_FOR_VISIT_SECTION__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection))->asSequence()->first().oclAsType(consol::ReasonForVisitSection)
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  ReasonForVisitSection getReasonForVisitSection(DischargeSummary dischargeSummary)
  {
		if (GET_REASON_FOR_VISIT_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.DISCHARGE_SUMMARY, ConsoltocPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(205));
			try {
				GET_REASON_FOR_VISIT_SECTION__EOCL_QRY = helper.createQuery(GET_REASON_FOR_VISIT_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_REASON_FOR_VISIT_SECTION__EOCL_QRY);
		return (ReasonForVisitSection) query.evaluate(dischargeSummary);
	}

  /**
	 * The cached OCL expression body for the '{@link #getReviewOfSystemsSection(DischargeSummary) <em>Get Review Of Systems Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getReviewOfSystemsSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReviewOfSystemsSection))->asSequence()->first().oclAsType(consol::ReviewOfSystemsSection)";

  /**
	 * The cached OCL query for the '{@link #getReviewOfSystemsSection(DischargeSummary) <em>Get Review Of Systems Section</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getReviewOfSystemsSection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReviewOfSystemsSection))->asSequence()->first().oclAsType(consol::ReviewOfSystemsSection)
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  ReviewOfSystemsSection getReviewOfSystemsSection(DischargeSummary dischargeSummary)
  {
		if (GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.DISCHARGE_SUMMARY, ConsoltocPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(206));
			try {
				GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY = helper.createQuery(GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY);
		return (ReviewOfSystemsSection) query.evaluate(dischargeSummary);
	}

  /**
	 * The cached OCL expression body for the '{@link #getSocialHistorySection(DischargeSummary) <em>Get Social History Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSocialHistorySection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_SOCIAL_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection))->asSequence()->first().oclAsType(consol::SocialHistorySection)";

  /**
	 * The cached OCL query for the '{@link #getSocialHistorySection(DischargeSummary) <em>Get Social History Section</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSocialHistorySection(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_SOCIAL_HISTORY_SECTION__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection))->asSequence()->first().oclAsType(consol::SocialHistorySection)
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  SocialHistorySection getSocialHistorySection(DischargeSummary dischargeSummary)
  {
		if (GET_SOCIAL_HISTORY_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.DISCHARGE_SUMMARY, ConsoltocPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(207));
			try {
				GET_SOCIAL_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_SOCIAL_HISTORY_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SOCIAL_HISTORY_SECTION__EOCL_QRY);
		return (SocialHistorySection) query.evaluate(dischargeSummary);
	}

  /**
	 * The cached OCL expression body for the '{@link #getVitalSignsSectionEntriesOptional(DischargeSummary) <em>Get Vital Signs Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getVitalSignsSectionEntriesOptional(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSectionEntriesOptional))->asSequence()->first().oclAsType(consol::VitalSignsSectionEntriesOptional)";

  /**
	 * The cached OCL query for the '{@link #getVitalSignsSectionEntriesOptional(DischargeSummary) <em>Get Vital Signs Section Entries Optional</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getVitalSignsSectionEntriesOptional(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSectionEntriesOptional))->asSequence()->first().oclAsType(consol::VitalSignsSectionEntriesOptional)
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  VitalSignsSectionEntriesOptional getVitalSignsSectionEntriesOptional(DischargeSummary dischargeSummary)
  {
		if (GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.DISCHARGE_SUMMARY, ConsoltocPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(208));
			try {
				GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
		return (VitalSignsSectionEntriesOptional) query.evaluate(dischargeSummary);
	}

  /**
	 * The cached OCL expression body for the '{@link #getImmunizationsSectionEntriesOptional(DischargeSummary) <em>Get Immunizations Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getImmunizationsSectionEntriesOptional(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSectionEntriesOptional))->asSequence()->first().oclAsType(consol::ImmunizationsSectionEntriesOptional)";

  /**
	 * The cached OCL query for the '{@link #getImmunizationsSectionEntriesOptional(DischargeSummary) <em>Get Immunizations Section Entries Optional</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getImmunizationsSectionEntriesOptional(DischargeSummary)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSectionEntriesOptional))->asSequence()->first().oclAsType(consol::ImmunizationsSectionEntriesOptional)
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  ImmunizationsSectionEntriesOptional getImmunizationsSectionEntriesOptional(DischargeSummary dischargeSummary)
  {
		if (GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.DISCHARGE_SUMMARY, ConsoltocPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(209));
			try {
				GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
		return (ImmunizationsSectionEntriesOptional) query.evaluate(dischargeSummary);
	}

  /**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTemplateId(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.1275.1.1.1.1')";

  /**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTemplateId(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.1275.1.1.1.1')
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  boolean validateGeneralHeaderConstraintsTemplateId(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsoltocPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsoltocValidator.DIAGNOSTIC_SOURCE,
						 ConsoltocValidator.DISCHARGE_SUMMARY__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "GeneralHeaderConstraintsTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(dischargeSummary, context) }),
						 new Object [] { dischargeSummary }));
			}
			 
			return false;
		}
		return true;
	}

} // DischargeSummaryOperations